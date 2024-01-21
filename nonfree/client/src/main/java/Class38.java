import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class38 {

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private int anInt1535 = 65000;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!r;")
	private Class53 aClass53_4 = null;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!r;")
	private Class53 aClass53_3 = null;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	private final int anInt1536;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(ILclient!r;Lclient!r;I)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3) {
		this.aClass53_4 = arg1;
		this.anInt1535 = arg3;
		this.aClass53_3 = arg2;
		this.anInt1536 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1536;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method843(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class53 local8 = this.aClass53_4;
		synchronized (this.aClass53_4) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg1 * 6 + 6) > this.aClass53_3.method1289()) {
						return false;
					}
					this.aClass53_3.method1285((long) (arg1 * 6));
					this.aClass53_3.method1288(6, Static88.aByteArray14, 0);
					local22 = (Static88.aByteArray14[5] & 0xFF) + ((Static88.aByteArray14[3] & 0xFF) << 16) + ((Static88.aByteArray14[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass53_4.method1289() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass53_4.method1289() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static88.aByteArray14[0] = (byte) (arg2 >> 16);
				@Pc(121) int local121 = 0;
				Static88.aByteArray14[1] = (byte) (arg2 >> 8);
				@Pc(130) int local130 = 0;
				Static88.aByteArray14[2] = (byte) arg2;
				Static88.aByteArray14[3] = (byte) (local22 >> 16);
				Static88.aByteArray14[4] = (byte) (local22 >> 8);
				Static88.aByteArray14[5] = (byte) local22;
				this.aClass53_3.method1285((long) (arg1 * 6));
				this.aClass53_3.method1287(Static88.aByteArray14, 0, 6);
				while (arg2 > local121) {
					@Pc(179) int local179 = 0;
					@Pc(237) int local237;
					if (arg0) {
						this.aClass53_4.method1285((long) (local22 * 520));
						try {
							this.aClass53_4.method1288(8, Static88.aByteArray14, 0);
						} catch (@Pc(198) EOFException local198) {
							return true;
						}
						local179 = (Static88.aByteArray14[6] & 0xFF) + ((Static88.aByteArray14[5] & 0xFF) << 8) + ((Static88.aByteArray14[4] & 0xFF) << 16);
						local237 = ((Static88.aByteArray14[0] & 0xFF) << 8) + (Static88.aByteArray14[1] & 0xFF);
						@Pc(243) int local243 = Static88.aByteArray14[7] & 0xFF;
						@Pc(257) int local257 = (Static88.aByteArray14[3] & 0xFF) + ((Static88.aByteArray14[2] & 0xFF) << 8);
						if (arg1 != local237 || local257 != local130 || this.anInt1536 != local243) {
							return false;
						}
						if (local179 < 0 || this.aClass53_4.method1289() / 520L < (long) local179) {
							return false;
						}
					}
					if (local179 == 0) {
						local179 = (int) ((this.aClass53_4.method1289() + 519L) / 520L);
						arg0 = false;
						if (local179 == 0) {
							local179++;
						}
						if (local22 == local179) {
							local179++;
						}
					}
					Static88.aByteArray14[0] = (byte) (arg1 >> 8);
					if (arg2 - local121 <= 512) {
						local179 = 0;
					}
					Static88.aByteArray14[1] = (byte) arg1;
					Static88.aByteArray14[2] = (byte) (local130 >> 8);
					local237 = arg2 - local121;
					if (local237 > 512) {
						local237 = 512;
					}
					Static88.aByteArray14[3] = (byte) local130;
					Static88.aByteArray14[4] = (byte) (local179 >> 16);
					Static88.aByteArray14[5] = (byte) (local179 >> 8);
					local130++;
					Static88.aByteArray14[6] = (byte) local179;
					Static88.aByteArray14[7] = (byte) this.anInt1536;
					this.aClass53_4.method1285((long) (local22 * 520));
					local22 = local179;
					this.aClass53_4.method1287(Static88.aByteArray14, 0, 8);
					this.aClass53_4.method1287(arg3, local121, local237);
					local121 += local237;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[B")
	public byte[] method844(@OriginalArg(0) int arg0) {
		@Pc(8) Class53 local8 = this.aClass53_4;
		synchronized (this.aClass53_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass53_3.method1289()) {
					return null;
				}
				this.aClass53_3.method1285((long) (arg0 * 6));
				this.aClass53_3.method1288(6, Static88.aByteArray14, 0);
				@Pc(70) int local70 = ((Static88.aByteArray14[3] & 0xFF) << 16) + ((Static88.aByteArray14[4] & 0xFF) << 8) + (Static88.aByteArray14[5] & 0xFF);
				@Pc(92) int local92 = ((Static88.aByteArray14[1] & 0xFF) << 8) + ((Static88.aByteArray14[0] & 0xFF) << 16) + (Static88.aByteArray14[2] & 0xFF);
				if (local92 < 0 || this.anInt1535 < local92) {
					return null;
				} else if (local70 > 0 && this.aClass53_4.method1289() / 520L >= (long) local70) {
					@Pc(132) int local132 = 0;
					@Pc(143) byte[] local143 = new byte[local92];
					@Pc(145) int local145 = 0;
					while (local92 > local132) {
						if (local70 == 0) {
							return null;
						}
						this.aClass53_4.method1285((long) (local70 * 520));
						@Pc(167) int local167 = local92 - local132;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass53_4.method1288(local167 + 8, Static88.aByteArray14, 0);
						@Pc(205) int local205 = (Static88.aByteArray14[6] & 0xFF) + ((Static88.aByteArray14[5] & 0xFF) << 8) + ((Static88.aByteArray14[4] & 0xFF) << 16);
						@Pc(219) int local219 = (Static88.aByteArray14[3] & 0xFF) + ((Static88.aByteArray14[2] & 0xFF) << 8);
						@Pc(233) int local233 = ((Static88.aByteArray14[0] & 0xFF) << 8) + (Static88.aByteArray14[1] & 0xFF);
						@Pc(239) int local239 = Static88.aByteArray14[7] & 0xFF;
						if (arg0 == local233 && local219 == local145 && this.anInt1536 == local239) {
							if (local205 >= 0 && (long) local205 <= this.aClass53_4.method1289() / 520L) {
								local70 = local205;
								for (@Pc(290) int local290 = 0; local290 < local167; local290++) {
									local143[local132++] = Static88.aByteArray14[local290 + 8];
								}
								local145++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local143;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([BBII)Z")
	public boolean method845(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class53 local6 = this.aClass53_4;
		synchronized (this.aClass53_4) {
			if (arg2 < 0 || arg2 > this.anInt1535) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method843(true, arg1, arg2, arg0);
			if (!local31) {
				local31 = this.method843(false, arg1, arg2, arg0);
			}
			return local31;
		}
	}
}
