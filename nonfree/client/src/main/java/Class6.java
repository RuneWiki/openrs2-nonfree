import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	private int anInt169 = 65000;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!bc;")
	private Class10 aClass10_1 = null;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!bc;")
	private Class10 aClass10_2 = null;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private final int anInt171;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILclient!bc;Lclient!bc;I)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3) {
		this.aClass10_1 = arg2;
		this.anInt169 = arg3;
		this.aClass10_2 = arg1;
		this.anInt171 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt171;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BI)Z")
	public boolean method184(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class10 local16 = this.aClass10_2;
		synchronized (this.aClass10_2) {
			if (arg0 < 0 || this.anInt169 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(40) boolean local40 = this.method185(arg1, true, arg0, arg2);
			if (!local40) {
				local40 = this.method185(arg1, false, arg0, arg2);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BZIBI)Z")
	private boolean method185(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class10 local8 = this.aClass10_2;
		synchronized (this.aClass10_2) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass10_1.method319()) {
						return false;
					}
					this.aClass10_1.method312((long) (arg3 * 6));
					this.aClass10_1.method320(0, 6, Static186.aByteArray11);
					local22 = (Static186.aByteArray11[5] & 0xFF) + ((Static186.aByteArray11[4] & 0xFF) << 8) + ((Static186.aByteArray11[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass10_2.method319() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass10_2.method319() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static186.aByteArray11[3] = (byte) (local22 >> 16);
				Static186.aByteArray11[4] = (byte) (local22 >> 8);
				Static186.aByteArray11[1] = (byte) (arg2 >> 8);
				Static186.aByteArray11[5] = (byte) local22;
				Static186.aByteArray11[2] = (byte) arg2;
				Static186.aByteArray11[0] = (byte) (arg2 >> 16);
				@Pc(152) int local152 = 0;
				this.aClass10_1.method312((long) (arg3 * 6));
				this.aClass10_1.method318(6, 0, Static186.aByteArray11);
				@Pc(174) int local174 = 0;
				while (arg2 > local152) {
					@Pc(178) int local178 = 0;
					@Pc(213) int local213;
					if (arg1) {
						this.aClass10_2.method312((long) (local22 * 520));
						try {
							this.aClass10_2.method320(0, 8, Static186.aByteArray11);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local213 = ((Static186.aByteArray11[0] & 0xFF) << 8) + (Static186.aByteArray11[1] & 0xFF);
						local178 = ((Static186.aByteArray11[4] & 0xFF) << 16) - (-((Static186.aByteArray11[5] & 0xFF) << 8) - (Static186.aByteArray11[6] & 0xFF));
						@Pc(243) int local243 = Static186.aByteArray11[7] & 0xFF;
						@Pc(258) int local258 = ((Static186.aByteArray11[2] & 0xFF) << 8) + (Static186.aByteArray11[3] & 0xFF);
						if (arg3 != local213 || local258 != local174 || local243 != this.anInt171) {
							return false;
						}
						if (local178 < 0 || (long) local178 > this.aClass10_2.method319() / 520L) {
							return false;
						}
					}
					if (local178 == 0) {
						arg1 = false;
						local178 = (int) ((this.aClass10_2.method319() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local178 == local22) {
							local178++;
						}
					}
					Static186.aByteArray11[1] = (byte) arg3;
					if (arg2 - local152 <= 512) {
						local178 = 0;
					}
					Static186.aByteArray11[5] = (byte) (local178 >> 8);
					Static186.aByteArray11[2] = (byte) (local174 >> 8);
					Static186.aByteArray11[0] = (byte) (arg3 >> 8);
					Static186.aByteArray11[3] = (byte) local174;
					Static186.aByteArray11[7] = (byte) this.anInt171;
					Static186.aByteArray11[6] = (byte) local178;
					local174++;
					Static186.aByteArray11[4] = (byte) (local178 >> 16);
					this.aClass10_2.method312((long) (local22 * 520));
					local22 = local178;
					this.aClass10_2.method318(8, 0, Static186.aByteArray11);
					local213 = arg2 - local152;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass10_2.method318(local213, local152, arg0);
					local152 += local213;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[B")
	public byte[] method189(@OriginalArg(0) int arg0) {
		@Pc(13) Class10 local13 = this.aClass10_2;
		synchronized (this.aClass10_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass10_1.method319()) {
					return null;
				}
				this.aClass10_1.method312((long) (arg0 * 6));
				this.aClass10_1.method320(0, 6, Static186.aByteArray11);
				@Pc(71) int local71 = (Static186.aByteArray11[5] & 0xFF) + ((Static186.aByteArray11[3] & 0xFF) << 16) + ((Static186.aByteArray11[4] & 0xFF) << 8);
				@Pc(93) int local93 = (Static186.aByteArray11[2] & 0xFF) + ((Static186.aByteArray11[1] & 0xFF) << 8) + ((Static186.aByteArray11[0] & 0xFF) << 16);
				if (local93 < 0 || local93 > this.anInt169) {
					return null;
				} else if (local71 > 0 && this.aClass10_2.method319() / 520L >= (long) local71) {
					@Pc(134) byte[] local134 = new byte[local93];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local136 < local93) {
						if (local71 == 0) {
							return null;
						}
						this.aClass10_2.method312((long) (local71 * 520));
						@Pc(164) int local164 = local93 - local136;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass10_2.method320(0, local164 + 8, Static186.aByteArray11);
						@Pc(193) int local193 = ((Static186.aByteArray11[2] & 0xFF) << 8) + (Static186.aByteArray11[3] & 0xFF);
						@Pc(199) int local199 = Static186.aByteArray11[7] & 0xFF;
						@Pc(221) int local221 = (Static186.aByteArray11[6] & 0xFF) + ((Static186.aByteArray11[5] & 0xFF) << 8) + ((Static186.aByteArray11[4] & 0xFF) << 16);
						@Pc(235) int local235 = (Static186.aByteArray11[1] & 0xFF) + ((Static186.aByteArray11[0] & 0xFF) << 8);
						if (arg0 == local235 && local193 == local138 && local199 == this.anInt171) {
							if (local221 >= 0 && this.aClass10_2.method319() / 520L >= (long) local221) {
								local138++;
								for (@Pc(280) int local280 = 0; local280 < local164; local280++) {
									local134[local136++] = Static186.aByteArray11[local280 + 8];
								}
								local71 = local221;
								continue;
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}
}
