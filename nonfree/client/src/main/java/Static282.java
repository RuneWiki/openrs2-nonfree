import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "[Lclient!ida;")
	public static final Class3_Sub26[] aClass3_Sub26Array3 = new Class3_Sub26[300];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(CI)Z")
	public static boolean method4630(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public static void method4631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static518.aClass62_15 == Static648.aClass62_16) {
			if (!Static167.method3514(0, 0, false, 1, -2, arg1, 1, arg0)) {
				Static167.method3514(0, 0, false, 1, -3, arg1, 1, arg0);
			}
		} else if (!Static167.method3514(0, 0, false, 1, -3, arg1, 1, arg0)) {
			Static167.method3514(0, 0, false, 1, -2, arg1, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[Lclient!gaa;)V")
	public static void method4633(@OriginalArg(1) int arg0, @OriginalArg(2) Class108[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class108 local13 = arg1[local7];
			if (local13 != null && local13.anInt4046 == arg0 && !Static71.method1825(local13)) {
				if (local13.anInt4018 == 0) {
					method4633(local13.anInt4043, arg1);
					if (local13.aClass108Array1 != null) {
						method4633(local13.anInt4043, local13.aClass108Array1);
					}
					@Pc(47) Class3_Sub50 local47 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local13.anInt4043);
					if (local47 != null) {
						Static518.method8298(local47.anInt9575);
					}
				}
				if (local13.anInt4018 == 6 && local13.anInt4015 != -1) {
					@Pc(70) Class290 local70 = Static618.aClass222_2.method5867(local13.anInt4015);
					if (local70 != null) {
						local13.anInt4065 += Static550.anInt9371;
						@Pc(81) int local81 = local13.anInt4025;
						while (local13.anInt4065 > local70.anIntArray548[local13.anInt4025]) {
							local13.anInt4065 -= local70.anIntArray548[local13.anInt4025];
							local13.anInt4025++;
							if (local13.anInt4025 >= local70.anIntArray550.length) {
								local13.anInt4025 -= local70.anInt8684;
								if (local13.anInt4025 < 0 || local70.anIntArray550.length <= local13.anInt4025) {
									local13.anInt4025 = 0;
								}
							}
							local13.anInt4095 = local13.anInt4025 + 1;
							if (local70.anIntArray550.length <= local13.anInt4095) {
								local13.anInt4095 -= local70.anInt8684;
								if (local13.anInt4095 < 0 || local13.anInt4095 >= local70.anIntArray550.length) {
									local13.anInt4095 = -1;
								}
							}
							Static139.method3135(local13);
						}
						if (local13.anInt4025 != local81) {
							Static468.method6973(local13.anInt4025, local70);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI)[B")
	public static byte[] method4634(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub15 local8 = new Class3_Sub15(arg0);
		@Pc(12) int local12 = local8.method8401();
		@Pc(16) int local16 = local8.method8402();
		if (local16 < 0 || Static475.anInt8515 != 0 && Static475.anInt8515 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(92) byte[] local92 = new byte[local16];
			local8.method8403(local16, 0, local92);
			return local92;
		} else {
			@Pc(43) int local43 = local8.method8402();
			if (local43 < 0 || Static475.anInt8515 != 0 && Static475.anInt8515 < local43) {
				throw new RuntimeException();
			}
			@Pc(60) byte[] local60 = new byte[local43];
			if (local12 == 1) {
				Static404.method6389(local60, local43, arg0, local16);
			} else {
				@Pc(74) Class123 local74 = Static23.aClass123_1;
				synchronized (Static23.aClass123_1) {
					Static23.aClass123_1.method3929(local8, local60);
				}
			}
			return local60;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZII)V")
	public static void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static263.method4883(arg3)) {
			Static384.method6091(-1, arg0, arg1, Static85.aClass108ArrayArray2[arg3], arg2);
		}
	}
}
