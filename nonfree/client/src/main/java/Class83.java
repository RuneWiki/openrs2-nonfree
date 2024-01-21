import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class83 {

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!fe;")
	private Class26 aClass26_4 = null;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private int anInt3596 = 65000;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Lclient!fe;")
	private Class26 aClass26_5 = null;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	private final int anInt3594;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILclient!fe;Lclient!fe;I)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3) {
		this.anInt3594 = arg0;
		this.anInt3596 = arg3;
		this.aClass26_4 = arg1;
		this.aClass26_5 = arg2;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z[BII)Z")
	public boolean method2522(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class26 local6 = this.aClass26_4;
		synchronized (this.aClass26_4) {
			if (arg1 < 0 || arg1 > this.anInt3596) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method2523(true, arg1, arg0, arg2);
			if (!local29) {
				local29 = this.method2523(false, arg1, arg0, arg2);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBI[BI)Z")
	private boolean method2523(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class26 local8 = this.aClass26_4;
		synchronized (this.aClass26_4) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass26_5.method893() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass26_5.method891((long) (arg3 * 6));
					this.aClass26_5.method887(Static129.aByteArray35, 0, 6);
					local22 = ((Static129.aByteArray35[3] & 0xFF) << 16) - (-((Static129.aByteArray35[4] & 0xFF) << 8) - (Static129.aByteArray35[5] & 0xFF));
					if (local22 <= 0 || this.aClass26_4.method893() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass26_4.method893() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static129.aByteArray35[3] = (byte) (local22 >> 16);
				Static129.aByteArray35[2] = (byte) arg1;
				Static129.aByteArray35[4] = (byte) (local22 >> 8);
				Static129.aByteArray35[0] = (byte) (arg1 >> 16);
				Static129.aByteArray35[1] = (byte) (arg1 >> 8);
				Static129.aByteArray35[5] = (byte) local22;
				this.aClass26_5.method891((long) (arg3 * 6));
				this.aClass26_5.method895(0, Static129.aByteArray35, 6);
				@Pc(173) int local173 = 0;
				@Pc(175) int local175 = 0;
				while (arg1 > local173) {
					@Pc(179) int local179 = 0;
					@Pc(215) int local215;
					if (arg0) {
						this.aClass26_4.method891((long) (local22 * 520));
						try {
							this.aClass26_4.method887(Static129.aByteArray35, 0, 8);
						} catch (@Pc(198) EOFException local198) {
							return true;
						}
						local215 = ((Static129.aByteArray35[0] & 0xFF) << 8) + (Static129.aByteArray35[1] & 0xFF);
						local179 = ((Static129.aByteArray35[5] & 0xFF) << 8) + (Static129.aByteArray35[4] << 16 & 0xFF0000) + (Static129.aByteArray35[6] & 0xFF);
						@Pc(251) int local251 = (Static129.aByteArray35[3] & 0xFF) + ((Static129.aByteArray35[2] & 0xFF) << 8);
						@Pc(257) int local257 = Static129.aByteArray35[7] & 0xFF;
						if (arg3 != local215 || local251 != local175 || local257 != this.anInt3594) {
							return false;
						}
						if (local179 < 0 || (long) local179 > this.aClass26_4.method893() / 520L) {
							return false;
						}
					}
					local215 = arg1 - local173;
					if (local215 > 512) {
						local215 = 512;
					}
					if (local179 == 0) {
						local179 = (int) ((this.aClass26_4.method893() + 519L) / 520L);
						arg0 = false;
						if (local179 == 0) {
							local179++;
						}
						if (local179 == local22) {
							local179++;
						}
					}
					Static129.aByteArray35[7] = (byte) this.anInt3594;
					Static129.aByteArray35[3] = (byte) local175;
					if (arg1 - local173 <= 512) {
						local179 = 0;
					}
					Static129.aByteArray35[6] = (byte) local179;
					Static129.aByteArray35[1] = (byte) arg3;
					Static129.aByteArray35[5] = (byte) (local179 >> 8);
					Static129.aByteArray35[0] = (byte) (arg3 >> 8);
					Static129.aByteArray35[2] = (byte) (local175 >> 8);
					local175++;
					Static129.aByteArray35[4] = (byte) (local179 >> 16);
					this.aClass26_4.method891((long) (local22 * 520));
					local22 = local179;
					this.aClass26_4.method895(0, Static129.aByteArray35, 8);
					this.aClass26_4.method895(local173, arg2, local215);
					local173 += local215;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3594;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[B")
	public byte[] method2526(@OriginalArg(1) int arg0) {
		@Pc(8) Class26 local8 = this.aClass26_4;
		synchronized (this.aClass26_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass26_5.method893()) {
					return null;
				}
				this.aClass26_5.method891((long) (arg0 * 6));
				this.aClass26_5.method887(Static129.aByteArray35, 0, 6);
				@Pc(69) int local69 = (Static129.aByteArray35[2] & 0xFF) + ((Static129.aByteArray35[1] & 0xFF) << 8) + ((Static129.aByteArray35[0] & 0xFF) << 16);
				@Pc(91) int local91 = (Static129.aByteArray35[5] & 0xFF) + ((Static129.aByteArray35[3] & 0xFF) << 16) + ((Static129.aByteArray35[4] & 0xFF) << 8);
				if (local69 < 0 || local69 > this.anInt3596) {
					return null;
				} else if (local91 > 0 && this.aClass26_4.method893() / 520L >= (long) local91) {
					@Pc(134) byte[] local134 = new byte[local69];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					label55: while (local69 > local142) {
						if (local91 == 0) {
							return null;
						}
						this.aClass26_4.method891((long) (local91 * 520));
						@Pc(166) int local166 = local69 - local142;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass26_4.method887(Static129.aByteArray35, 0, local166 + 8);
						@Pc(195) int local195 = ((Static129.aByteArray35[2] & 0xFF) << 8) + (Static129.aByteArray35[3] & 0xFF);
						@Pc(217) int local217 = (Static129.aByteArray35[6] & 0xFF) + ((Static129.aByteArray35[5] & 0xFF) << 8) + ((Static129.aByteArray35[4] & 0xFF) << 16);
						@Pc(223) int local223 = Static129.aByteArray35[7] & 0xFF;
						@Pc(237) int local237 = (Static129.aByteArray35[1] & 0xFF) + ((Static129.aByteArray35[0] & 0xFF) << 8);
						if (arg0 == local237 && local195 == local144 && local223 == this.anInt3594) {
							if (local217 >= 0 && (long) local217 <= this.aClass26_4.method893() / 520L) {
								local91 = local217;
								local144++;
								@Pc(287) int local287 = 0;
								while (true) {
									if (local166 <= local287) {
										continue label55;
									}
									local134[local142++] = Static129.aByteArray35[local287 + 8];
									local287++;
								}
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}
}
