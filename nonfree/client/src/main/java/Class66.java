import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class66 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	private int anInt2765 = 65000;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!pc;")
	private Class67 aClass67_3 = null;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!pc;")
	private Class67 aClass67_4 = null;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	private final int anInt2766;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILclient!pc;Lclient!pc;I)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3) {
		this.aClass67_3 = arg2;
		this.anInt2765 = arg3;
		this.anInt2766 = arg0;
		this.aClass67_4 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
	public byte[] method2161(@OriginalArg(1) int arg0) {
		@Pc(8) Class67 local8 = this.aClass67_4;
		synchronized (this.aClass67_4) {
			try {
				if (this.aClass67_3.method2176() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass67_3.method2168((long) (arg0 * 6));
				this.aClass67_3.method2172(6, Static161.aByteArray42, 0);
				@Pc(70) int local70 = ((Static161.aByteArray42[3] & 0xFF) << 16) + ((Static161.aByteArray42[4] & 0xFF) << 8) + (Static161.aByteArray42[5] & 0xFF);
				@Pc(92) int local92 = (Static161.aByteArray42[2] & 0xFF) + ((Static161.aByteArray42[1] & 0xFF) << 8) + ((Static161.aByteArray42[0] & 0xFF) << 16);
				if (local92 < 0 || this.anInt2765 < local92) {
					return null;
				} else if (local70 > 0 && this.aClass67_4.method2176() / 520L >= (long) local70) {
					@Pc(147) byte[] local147 = new byte[local92];
					@Pc(149) int local149 = 0;
					@Pc(151) int local151 = 0;
					label55: while (local92 > local149) {
						if (local70 == 0) {
							return null;
						}
						this.aClass67_4.method2168((long) (local70 * 520));
						@Pc(174) int local174 = local92 - local149;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass67_4.method2172(local174 + 8, Static161.aByteArray42, 0);
						@Pc(212) int local212 = (Static161.aByteArray42[6] & 0xFF) + ((Static161.aByteArray42[4] & 0xFF) << 16) + ((Static161.aByteArray42[5] & 0xFF) << 8);
						@Pc(227) int local227 = ((Static161.aByteArray42[2] & 0xFF) << 8) + (Static161.aByteArray42[3] & 0xFF);
						@Pc(241) int local241 = (Static161.aByteArray42[1] & 0xFF) + ((Static161.aByteArray42[0] & 0xFF) << 8);
						@Pc(247) int local247 = Static161.aByteArray42[7] & 0xFF;
						if (arg0 == local241 && local151 == local227 && local247 == this.anInt2766) {
							if (local212 >= 0 && this.aClass67_4.method2176() / 520L >= (long) local212) {
								local151++;
								local70 = local212;
								@Pc(297) int local297 = 0;
								while (true) {
									if (local297 >= local174) {
										continue label55;
									}
									local147[local149++] = Static161.aByteArray42[local297 + 8];
									local297++;
								}
							}
							return null;
						}
						return null;
					}
					return local147;
				} else {
					return null;
				}
			} catch (@Pc(326) IOException local326) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZ[B)Z")
	private boolean method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class67 local8 = this.aClass67_4;
		synchronized (this.aClass67_4) {
			try {
				@Pc(72) int local72;
				if (arg2) {
					if ((long) (arg1 * 6 + 6) > this.aClass67_3.method2176()) {
						return false;
					}
					this.aClass67_3.method2168((long) (arg1 * 6));
					this.aClass67_3.method2172(6, Static161.aByteArray42, 0);
					local72 = ((Static161.aByteArray42[4] & 0xFF) << 8) + ((Static161.aByteArray42[3] & 0xFF) << 16) + (Static161.aByteArray42[5] & 0xFF);
					if (local72 <= 0 || (long) local72 > this.aClass67_4.method2176() / 520L) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass67_4.method2176() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static161.aByteArray42[5] = (byte) local72;
				Static161.aByteArray42[2] = (byte) arg0;
				Static161.aByteArray42[3] = (byte) (local72 >> 16);
				Static161.aByteArray42[0] = (byte) (arg0 >> 16);
				Static161.aByteArray42[4] = (byte) (local72 >> 8);
				Static161.aByteArray42[1] = (byte) (arg0 >> 8);
				this.aClass67_3.method2168((long) (arg1 * 6));
				this.aClass67_3.method2174(0, 6, Static161.aByteArray42);
				@Pc(159) int local159 = 0;
				@Pc(225) int local225;
				for (@Pc(161) int local161 = 0; local161 < arg0; local161 += local225) {
					@Pc(165) int local165 = 0;
					if (arg2) {
						this.aClass67_4.method2168((long) (local72 * 520));
						try {
							this.aClass67_4.method2172(8, Static161.aByteArray42, 0);
						} catch (@Pc(184) EOFException local184) {
							return true;
						}
						local165 = ((Static161.aByteArray42[4] & 0xFF) << 16) + ((Static161.aByteArray42[5] & 0xFF) << 8) + (Static161.aByteArray42[6] & 0xFF);
						local225 = ((Static161.aByteArray42[0] & 0xFF) << 8) + (Static161.aByteArray42[1] & 0xFF);
						@Pc(239) int local239 = (Static161.aByteArray42[3] & 0xFF) + ((Static161.aByteArray42[2] & 0xFF) << 8);
						@Pc(245) int local245 = Static161.aByteArray42[7] & 0xFF;
						if (local225 != arg1 || local239 != local159 || local245 != this.anInt2766) {
							return false;
						}
						if (local165 < 0 || (long) local165 > this.aClass67_4.method2176() / 520L) {
							return false;
						}
					}
					if (local165 == 0) {
						local165 = (int) ((this.aClass67_4.method2176() + 519L) / 520L);
						arg2 = false;
						if (local165 == 0) {
							local165++;
						}
						if (local165 == local72) {
							local165++;
						}
					}
					if (arg0 - local161 <= 512) {
						local165 = 0;
					}
					Static161.aByteArray42[6] = (byte) local165;
					Static161.aByteArray42[3] = (byte) local159;
					Static161.aByteArray42[5] = (byte) (local165 >> 8);
					Static161.aByteArray42[2] = (byte) (local159 >> 8);
					Static161.aByteArray42[4] = (byte) (local165 >> 16);
					Static161.aByteArray42[0] = (byte) (arg1 >> 8);
					Static161.aByteArray42[7] = (byte) this.anInt2766;
					Static161.aByteArray42[1] = (byte) arg1;
					this.aClass67_4.method2168((long) (local72 * 520));
					local72 = local165;
					this.aClass67_4.method2174(0, 8, Static161.aByteArray42);
					local159++;
					local225 = arg0 - local161;
					if (local225 > 512) {
						local225 = 512;
					}
					this.aClass67_4.method2174(local161, local225, arg3);
				}
				return true;
			} catch (@Pc(409) IOException local409) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2766;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BII)Z")
	public boolean method2164(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class67 local6 = this.aClass67_4;
		synchronized (this.aClass67_4) {
			if (arg2 < 0 || this.anInt2765 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method2162(arg2, arg0, true, arg1);
			if (!local35) {
				local35 = this.method2162(arg2, arg0, false, arg1);
			}
			return local35;
		}
	}
}
