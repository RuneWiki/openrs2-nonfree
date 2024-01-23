import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class100 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt3922 = 65000;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!ti;")
	private Class112 aClass112_6 = null;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!ti;")
	private Class112 aClass112_5 = null;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt3923;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILclient!ti;Lclient!ti;I)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) int arg3) {
		this.aClass112_6 = arg1;
		this.aClass112_5 = arg2;
		this.anInt3922 = arg3;
		this.anInt3923 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3923;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BIZ)Z")
	public boolean method3042(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class112 local6 = this.aClass112_6;
		synchronized (this.aClass112_6) {
			if (arg2 < 0 || this.anInt3922 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method3043(arg1, true, arg0, arg2);
			if (!local29) {
				local29 = this.method3043(arg1, false, arg0, arg2);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([BBZII)Z")
	private boolean method3043(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class112 local8 = this.aClass112_6;
		synchronized (this.aClass112_6) {
			try {
				@Pc(67) int local67;
				if (arg1) {
					if ((long) (arg2 * 6 + 6) > this.aClass112_5.method3295()) {
						return false;
					}
					this.aClass112_5.method3298((long) (arg2 * 6));
					this.aClass112_5.method3296(Static187.aByteArray44, 0, 6);
					local67 = (Static187.aByteArray44[5] & 0xFF) + ((Static187.aByteArray44[4] & 0xFF) << 8) + ((Static187.aByteArray44[3] & 0xFF) << 16);
					if (local67 <= 0 || (long) local67 > this.aClass112_6.method3295() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass112_6.method3295() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static187.aByteArray44[5] = (byte) local67;
				@Pc(118) int local118 = 0;
				Static187.aByteArray44[0] = (byte) (arg3 >> 16);
				Static187.aByteArray44[1] = (byte) (arg3 >> 8);
				Static187.aByteArray44[4] = (byte) (local67 >> 8);
				Static187.aByteArray44[2] = (byte) arg3;
				Static187.aByteArray44[3] = (byte) (local67 >> 16);
				this.aClass112_5.method3298((long) (arg2 * 6));
				@Pc(163) int local163 = 0;
				this.aClass112_5.method3287(Static187.aByteArray44, 0, 6);
				while (local118 < arg3) {
					@Pc(174) int local174 = 0;
					@Pc(245) int local245;
					if (arg1) {
						this.aClass112_6.method3298((long) (local67 * 520));
						try {
							this.aClass112_6.method3296(Static187.aByteArray44, 0, 8);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local174 = ((Static187.aByteArray44[5] & 0xFF) << 8) + (Static187.aByteArray44[4] << 16 & 0xFF0000) + (Static187.aByteArray44[6] & 0xFF);
						@Pc(231) int local231 = ((Static187.aByteArray44[2] & 0xFF) << 8) + (Static187.aByteArray44[3] & 0xFF);
						local245 = (Static187.aByteArray44[1] & 0xFF) + ((Static187.aByteArray44[0] & 0xFF) << 8);
						@Pc(251) int local251 = Static187.aByteArray44[7] & 0xFF;
						if (arg2 != local245 || local163 != local231 || local251 != this.anInt3923) {
							return false;
						}
						if (local174 < 0 || this.aClass112_6.method3295() / 520L < (long) local174) {
							return false;
						}
					}
					local245 = arg3 - local118;
					if (local245 > 512) {
						local245 = 512;
					}
					if (local174 == 0) {
						arg1 = false;
						local174 = (int) ((this.aClass112_6.method3295() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local67) {
							local174++;
						}
					}
					Static187.aByteArray44[7] = (byte) this.anInt3923;
					Static187.aByteArray44[1] = (byte) arg2;
					if (arg3 - local118 <= 512) {
						local174 = 0;
					}
					Static187.aByteArray44[4] = (byte) (local174 >> 16);
					Static187.aByteArray44[2] = (byte) (local163 >> 8);
					Static187.aByteArray44[3] = (byte) local163;
					Static187.aByteArray44[6] = (byte) local174;
					Static187.aByteArray44[5] = (byte) (local174 >> 8);
					Static187.aByteArray44[0] = (byte) (arg2 >> 8);
					local163++;
					this.aClass112_6.method3298((long) (local67 * 520));
					local67 = local174;
					this.aClass112_6.method3287(Static187.aByteArray44, 0, 8);
					this.aClass112_6.method3287(arg0, local118, local245);
					local118 += local245;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)[B")
	public byte[] method3047(@OriginalArg(1) int arg0) {
		@Pc(8) Class112 local8 = this.aClass112_6;
		synchronized (this.aClass112_6) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass112_5.method3295()) {
					return null;
				}
				this.aClass112_5.method3298((long) (arg0 * 6));
				this.aClass112_5.method3296(Static187.aByteArray44, 0, 6);
				@Pc(70) int local70 = ((Static187.aByteArray44[0] & 0xFF) << 16) + (((Static187.aByteArray44[1] & 0xFF) << 8) + (Static187.aByteArray44[2] & 0xFF));
				@Pc(92) int local92 = (Static187.aByteArray44[5] & 0xFF) + ((Static187.aByteArray44[4] & 0xFF) << 8) + ((Static187.aByteArray44[3] & 0xFF) << 16);
				if (local70 < 0 || this.anInt3922 < local70) {
					return null;
				} else if (local92 > 0 && this.aClass112_6.method3295() / 520L >= (long) local92) {
					@Pc(132) byte[] local132 = new byte[local70];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					while (local134 < local70) {
						if (local92 == 0) {
							return null;
						}
						this.aClass112_6.method3298((long) (local92 * 520));
						@Pc(162) int local162 = local70 - local134;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass112_6.method3296(Static187.aByteArray44, 0, local162 + 8);
						@Pc(190) int local190 = (Static187.aByteArray44[1] & 0xFF) + ((Static187.aByteArray44[0] & 0xFF) << 8);
						@Pc(213) int local213 = ((Static187.aByteArray44[5] & 0xFF) << 8) + ((Static187.aByteArray44[4] & 0xFF) << 16) + (Static187.aByteArray44[6] & 0xFF);
						@Pc(228) int local228 = ((Static187.aByteArray44[2] & 0xFF) << 8) + (Static187.aByteArray44[3] & 0xFF);
						@Pc(234) int local234 = Static187.aByteArray44[7] & 0xFF;
						if (arg0 == local190 && local228 == local136 && local234 == this.anInt3923) {
							if (local213 >= 0 && this.aClass112_6.method3295() / 520L >= (long) local213) {
								for (@Pc(278) int local278 = 0; local278 < local162; local278++) {
									local132[local134++] = Static187.aByteArray44[local278 + 8];
								}
								local136++;
								local92 = local213;
								continue;
							}
							return null;
						}
						return null;
					}
					return local132;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}
}
