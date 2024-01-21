import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class16 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	private int anInt580 = 65000;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!bb;")
	private Class8 aClass8_2 = null;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!bb;")
	private Class8 aClass8_3 = null;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	private final int anInt581;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ILclient!bb;Lclient!bb;I)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3) {
		this.anInt581 = arg0;
		this.aClass8_2 = arg1;
		this.aClass8_3 = arg2;
		this.anInt580 = arg3;
	}

	@OriginalMember(owner = "client!d", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt581;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZ[B)Z")
	private boolean method355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class8 local8 = this.aClass8_2;
		synchronized (this.aClass8_2) {
			try {
				@Pc(72) int local72;
				if (arg2) {
					if ((long) (arg0 * 6 + 6) > this.aClass8_3.method223()) {
						return false;
					}
					this.aClass8_3.method222((long) (arg0 * 6));
					this.aClass8_3.method220(Static38.aByteArray7, 0, 6);
					local72 = (Static38.aByteArray7[5] & 0xFF) + ((Static38.aByteArray7[3] & 0xFF) << 16) + ((Static38.aByteArray7[4] & 0xFF) << 8);
					if (local72 <= 0 || this.aClass8_2.method223() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass8_2.method223() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static38.aByteArray7[5] = (byte) local72;
				Static38.aByteArray7[4] = (byte) (local72 >> 8);
				Static38.aByteArray7[0] = (byte) (arg1 >> 16);
				Static38.aByteArray7[2] = (byte) arg1;
				Static38.aByteArray7[3] = (byte) (local72 >> 16);
				Static38.aByteArray7[1] = (byte) (arg1 >> 8);
				this.aClass8_3.method222((long) (arg0 * 6));
				@Pc(163) int local163 = 0;
				this.aClass8_3.method225(6, 0, Static38.aByteArray7);
				@Pc(172) int local172 = 0;
				while (local163 < arg1) {
					@Pc(176) int local176 = 0;
					@Pc(211) int local211;
					if (arg2) {
						this.aClass8_2.method222((long) (local72 * 520));
						try {
							this.aClass8_2.method220(Static38.aByteArray7, 0, 8);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local211 = (Static38.aByteArray7[1] & 0xFF) + ((Static38.aByteArray7[0] & 0xFF) << 8);
						@Pc(217) int local217 = Static38.aByteArray7[7] & 0xFF;
						@Pc(231) int local231 = (Static38.aByteArray7[3] & 0xFF) + ((Static38.aByteArray7[2] & 0xFF) << 8);
						local176 = ((Static38.aByteArray7[4] & 0xFF) << 16) + ((Static38.aByteArray7[5] << 8 & 0xFF00) + (Static38.aByteArray7[6] & 0xFF));
						if (arg0 != local211 || local172 != local231 || local217 != this.anInt581) {
							return false;
						}
						if (local176 < 0 || this.aClass8_2.method223() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						local176 = (int) ((this.aClass8_2.method223() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local176 == local72) {
							local176++;
						}
						arg2 = false;
					}
					Static38.aByteArray7[2] = (byte) (local172 >> 8);
					local211 = arg1 - local163;
					Static38.aByteArray7[1] = (byte) arg0;
					Static38.aByteArray7[7] = (byte) this.anInt581;
					if (local211 > 512) {
						local211 = 512;
					}
					Static38.aByteArray7[0] = (byte) (arg0 >> 8);
					if (arg1 - local163 <= 512) {
						local176 = 0;
					}
					Static38.aByteArray7[4] = (byte) (local176 >> 16);
					Static38.aByteArray7[5] = (byte) (local176 >> 8);
					Static38.aByteArray7[3] = (byte) local172;
					Static38.aByteArray7[6] = (byte) local176;
					this.aClass8_2.method222((long) (local72 * 520));
					this.aClass8_2.method225(8, 0, Static38.aByteArray7);
					local72 = local176;
					local172++;
					this.aClass8_2.method225(local211, local163, arg3);
					local163 += local211;
				}
				return true;
			} catch (@Pc(440) IOException local440) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)[B")
	public byte[] method362(@OriginalArg(1) int arg0) {
		@Pc(8) Class8 local8 = this.aClass8_2;
		synchronized (this.aClass8_2) {
			try {
				if (this.aClass8_3.method223() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass8_3.method222((long) (arg0 * 6));
				this.aClass8_3.method220(Static38.aByteArray7, 0, 6);
				@Pc(75) int local75 = (Static38.aByteArray7[2] & 0xFF) + ((Static38.aByteArray7[1] & 0xFF) << 8) + ((Static38.aByteArray7[0] & 0xFF) << 16);
				@Pc(99) int local99 = ((Static38.aByteArray7[3] & 0xFF) << 16) - (-((Static38.aByteArray7[4] & 0xFF) << 8) - (Static38.aByteArray7[5] & 0xFF));
				if (local75 < 0 || local75 > this.anInt580) {
					return null;
				} else if (local99 > 0 && this.aClass8_2.method223() / 520L >= (long) local99) {
					@Pc(132) byte[] local132 = new byte[local75];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					label55: while (local75 > local134) {
						if (local99 == 0) {
							return null;
						}
						this.aClass8_2.method222((long) (local99 * 520));
						@Pc(159) int local159 = local75 - local134;
						if (local159 > 512) {
							local159 = 512;
						}
						this.aClass8_2.method220(Static38.aByteArray7, 0, local159 + 8);
						@Pc(187) int local187 = ((Static38.aByteArray7[0] & 0xFF) << 8) + (Static38.aByteArray7[1] & 0xFF);
						@Pc(193) int local193 = Static38.aByteArray7[7] & 0xFF;
						@Pc(215) int local215 = (Static38.aByteArray7[6] & 0xFF) + ((Static38.aByteArray7[5] & 0xFF) << 8) + ((Static38.aByteArray7[4] & 0xFF) << 16);
						@Pc(229) int local229 = ((Static38.aByteArray7[2] & 0xFF) << 8) + (Static38.aByteArray7[3] & 0xFF);
						if (arg0 == local187 && local229 == local136 && local193 == this.anInt581) {
							if (local215 >= 0 && (long) local215 <= this.aClass8_2.method223() / 520L) {
								local136++;
								local99 = local215;
								@Pc(280) int local280 = 0;
								while (true) {
									if (local280 >= local159) {
										continue label55;
									}
									local132[local134++] = Static38.aByteArray7[local280 + 8];
									local280++;
								}
							}
							return null;
						}
						return null;
					}
					return local132;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI)Z")
	public boolean method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class8 local6 = this.aClass8_2;
		synchronized (this.aClass8_2) {
			if (arg0 < 0 || arg0 > this.anInt580) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method355(arg1, arg0, true, arg2);
			if (!local29) {
				local29 = this.method355(arg1, arg0, false, arg2);
			}
			return local29;
		}
	}
}
