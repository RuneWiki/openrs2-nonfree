import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class9 {

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!ph;")
	private Class66 aClass66_1 = null;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!ph;")
	private Class66 aClass66_2 = null;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	private int anInt451 = 65000;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	private final int anInt448;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILclient!ph;Lclient!ph;I)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3) {
		this.anInt448 = arg0;
		this.aClass66_1 = arg1;
		this.anInt451 = arg3;
		this.aClass66_2 = arg2;
	}

	@OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt448;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BIII)Z")
	public boolean method373(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class66 local6 = this.aClass66_1;
		synchronized (this.aClass66_1) {
			if (arg1 < 0 || this.anInt451 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method375(true, arg0, arg1, arg2);
			if (!local31) {
				local31 = this.method375(false, arg0, arg1, arg2);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB[BII)Z")
	private boolean method375(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class66 local8 = this.aClass66_1;
		synchronized (this.aClass66_1) {
			try {
				@Pc(24) int local24;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass66_2.method2658()) {
						return false;
					}
					this.aClass66_2.method2662((long) (arg3 * 6));
					this.aClass66_2.method2660(6, 0, Static57.aByteArray32);
					local24 = ((Static57.aByteArray32[3] & 0xFF) << 16) + ((Static57.aByteArray32[4] & 0xFF) << 8) + (Static57.aByteArray32[5] & 0xFF);
					if (local24 <= 0 || this.aClass66_1.method2658() / 520L < (long) local24) {
						return false;
					}
				} else {
					local24 = (int) ((this.aClass66_1.method2658() + 519L) / 520L);
					if (local24 == 0) {
						local24 = 1;
					}
				}
				Static57.aByteArray32[3] = (byte) (local24 >> 16);
				Static57.aByteArray32[1] = (byte) (arg2 >> 8);
				Static57.aByteArray32[2] = (byte) arg2;
				Static57.aByteArray32[5] = (byte) local24;
				Static57.aByteArray32[0] = (byte) (arg2 >> 16);
				Static57.aByteArray32[4] = (byte) (local24 >> 8);
				this.aClass66_2.method2662((long) (arg3 * 6));
				this.aClass66_2.method2654(Static57.aByteArray32, 0, 6);
				@Pc(179) int local179 = 0;
				@Pc(181) int local181 = 0;
				while (local179 < arg2) {
					@Pc(185) int local185 = 0;
					@Pc(246) int local246;
					if (arg0) {
						this.aClass66_1.method2662((long) (local24 * 520));
						try {
							this.aClass66_1.method2660(8, 0, Static57.aByteArray32);
						} catch (@Pc(206) EOFException local206) {
							return true;
						}
						local185 = (Static57.aByteArray32[6] & 0xFF) + (((Static57.aByteArray32[4] & 0xFF) << 16) + ((Static57.aByteArray32[5] & 0xFF) << 8));
						local246 = ((Static57.aByteArray32[0] & 0xFF) << 8) + (Static57.aByteArray32[1] & 0xFF);
						@Pc(260) int local260 = (Static57.aByteArray32[3] & 0xFF) + ((Static57.aByteArray32[2] & 0xFF) << 8);
						@Pc(266) int local266 = Static57.aByteArray32[7] & 0xFF;
						if (local246 != arg3 || local181 != local260 || this.anInt448 != local266) {
							return false;
						}
						if (local185 < 0 || (long) local185 > this.aClass66_1.method2658() / 520L) {
							return false;
						}
					}
					if (local185 == 0) {
						local185 = (int) ((this.aClass66_1.method2658() + 519L) / 520L);
						if (local185 == 0) {
							local185++;
						}
						arg0 = false;
						if (local185 == local24) {
							local185++;
						}
					}
					if (arg2 - local179 <= 512) {
						local185 = 0;
					}
					Static57.aByteArray32[0] = (byte) (arg3 >> 8);
					Static57.aByteArray32[7] = (byte) this.anInt448;
					local246 = arg2 - local179;
					Static57.aByteArray32[2] = (byte) (local181 >> 8);
					Static57.aByteArray32[3] = (byte) local181;
					Static57.aByteArray32[5] = (byte) (local185 >> 8);
					Static57.aByteArray32[4] = (byte) (local185 >> 16);
					local181++;
					Static57.aByteArray32[6] = (byte) local185;
					if (local246 > 512) {
						local246 = 512;
					}
					Static57.aByteArray32[1] = (byte) arg3;
					this.aClass66_1.method2662((long) (local24 * 520));
					this.aClass66_1.method2654(Static57.aByteArray32, 0, 8);
					this.aClass66_1.method2654(arg1, local179, local246);
					local179 += local246;
					local24 = local185;
				}
				return true;
			} catch (@Pc(450) IOException local450) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[B")
	public byte[] method377(@OriginalArg(1) int arg0) {
		@Pc(8) Class66 local8 = this.aClass66_1;
		synchronized (this.aClass66_1) {
			try {
				if (this.aClass66_2.method2658() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass66_2.method2662((long) (arg0 * 6));
				this.aClass66_2.method2660(6, 0, Static57.aByteArray32);
				@Pc(65) int local65 = ((Static57.aByteArray32[1] & 0xFF) << 8) + ((Static57.aByteArray32[0] & 0xFF) << 16) + (Static57.aByteArray32[2] & 0xFF);
				@Pc(87) int local87 = (Static57.aByteArray32[5] & 0xFF) + ((Static57.aByteArray32[4] & 0xFF) << 8) + ((Static57.aByteArray32[3] & 0xFF) << 16);
				if (local65 < 0 || this.anInt451 < local65) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aClass66_1.method2658() / 520L) {
					@Pc(140) byte[] local140 = new byte[local65];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					while (local142 < local65) {
						if (local87 == 0) {
							return null;
						}
						this.aClass66_1.method2662((long) (local87 * 520));
						@Pc(167) int local167 = local65 - local142;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass66_1.method2660(local167 + 8, 0, Static57.aByteArray32);
						@Pc(196) int local196 = ((Static57.aByteArray32[0] & 0xFF) << 8) + (Static57.aByteArray32[1] & 0xFF);
						@Pc(210) int local210 = ((Static57.aByteArray32[2] & 0xFF) << 8) + (Static57.aByteArray32[3] & 0xFF);
						@Pc(232) int local232 = (Static57.aByteArray32[6] & 0xFF) + ((Static57.aByteArray32[5] & 0xFF) << 8) + ((Static57.aByteArray32[4] & 0xFF) << 16);
						@Pc(238) int local238 = Static57.aByteArray32[7] & 0xFF;
						if (arg0 == local196 && local210 == local144 && this.anInt448 == local238) {
							if (local232 >= 0 && this.aClass66_1.method2658() / 520L >= (long) local232) {
								local87 = local232;
								for (@Pc(283) int local283 = 0; local283 < local167; local283++) {
									local140[local142++] = Static57.aByteArray32[local283 + 8];
								}
								local144++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(313) IOException local313) {
				return null;
			}
		}
	}
}
