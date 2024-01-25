import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
	public static int anInt6891;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_160 = new Class263(49, 8);

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)V")
	public static void method5241() {
		for (@Pc(10) Class1_Sub1_Sub15 local10 = (Class1_Sub1_Sub15) Static398.aClass203_46.method4548(); local10 != null; local10 = (Class1_Sub1_Sub15) Static398.aClass203_46.method4545()) {
			@Pc(20) Class30_Sub1_Sub2 local20 = local10.aClass30_Sub1_Sub2_1;
			if (local20.anInt4240 < Static187.anInt3975) {
				local10.method6178();
				local20.method3282();
			} else if (Static187.anInt3975 >= local20.anInt4257) {
				if (local20.anInt4248 > 0) {
					@Pc(44) Class1_Sub27 local44 = (Class1_Sub27) Static24.aClass38_3.method765((long) (local20.anInt4248 - 1));
					if (local44 != null) {
						@Pc(49) Class30_Sub1_Sub1_Sub1 local49 = local44.aClass30_Sub1_Sub1_Sub1_2;
						if (local49.anInt7490 >= 0 && Static209.anInt4283 * 128 > local49.anInt7490 && local49.anInt7488 >= 0 && Static211.anInt4295 * 128 > local49.anInt7488) {
							local20.method3288(Static227.method3475(local49.anInt7490, local49.anInt7488, local20.aByte102) - local20.anInt4251, Static187.anInt3975, local49.anInt7488, local49.anInt7490);
						}
					}
				}
				if (local20.anInt4248 < 0) {
					@Pc(103) int local103 = -local20.anInt4248 - 1;
					@Pc(110) Class30_Sub1_Sub1_Sub2 local110;
					if (local103 == Static32.anInt894) {
						local110 = Static429.aClass30_Sub1_Sub1_Sub2_2;
					} else {
						local110 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local103];
					}
					if (local110 != null && local110.anInt7490 >= 0 && Static209.anInt4283 * 128 > local110.anInt7490 && local110.anInt7488 >= 0 && local110.anInt7488 < Static211.anInt4295 * 128) {
						local20.method3288(Static227.method3475(local110.anInt7490, local110.anInt7488, local20.aByte102) - local20.anInt4251, Static187.anInt3975, local110.anInt7488, local110.anInt7490);
					}
				}
				local20.method3285(Static234.anInt4630);
				Static193.method3130(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIILclient!hh;)V")
	public static void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub4 arg3) {
		@Pc(4) Class252 local4 = Static412.method5598(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass30_Sub4_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[[BLclient!dv;)V")
	public static void method5244(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		@Pc(14) int[] local14 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(16) int local16 = 0; local16 < arg1.anInt2050; local16++) {
			Static326.method4622();
			for (@Pc(21) int local21 = 0; local21 < Static209.anInt4283 >> 3; local21++) {
				for (@Pc(24) int local24 = 0; local24 < Static211.anInt4295 >> 3; local24++) {
					@Pc(33) int local33 = Static334.anIntArrayArrayArray14[local16][local21][local24];
					if (local33 != -1) {
						@Pc(42) int local42 = local33 >> 24 & 0x3;
						if (!arg1.aBoolean128 || local42 == 0) {
							@Pc(56) int local56 = local33 >> 1 & 0x3;
							@Pc(62) int local62 = local33 >> 14 & 0x3FF;
							@Pc(68) int local68 = local33 >> 3 & 0x7FF;
							@Pc(78) int local78 = local68 / 8 + (local62 / 8 << 8);
							for (@Pc(80) int local80 = 0; local80 < Static168.anIntArray147.length; local80++) {
								if (local78 == Static168.anIntArray147[local80] && arg0[local80] != null) {
									@Pc(101) Class1_Sub3 local101 = new Class1_Sub3(arg0[local80]);
									arg1.method1540(local62, local42, local101, local24 * 8, local68, Static19.aClass120Array1, local21 * 8, local56, local16);
									arg1.method1556(local14[0] == -1 ? local14 : null, local24 * 8, local21 * 8, Static30.aClass106_3, local42, local16, local62, local56, local101, local68);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local14[0] != -1) {
			Static311.aClass189_1 = Static106.aClass53_1.method1339(local14[0], Static100.aClass42_1, local14[3], local14[1], local14[2]);
			Static7.anInt92 = local14[4];
		}
	}
}
