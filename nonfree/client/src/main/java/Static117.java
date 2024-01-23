import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!nf;")
	public static Class117 aClass117_3;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!p;")
	public static Class133 aClass133_3;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public static int anInt2306 = 0;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public static int anInt2307 = 0;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt2308 = -1;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public static int anInt2310 = 0;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "S")
	public static short aShort12 = 205;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!h;IIIII)V")
	public static void method1860(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static68.anInt1350) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static6.anInt118) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static178.anInt3591 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub17 local71 = Static122.aClass1_Sub17ArrayArrayArray3[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static208.anIntArrayArrayArray11[local17][local28][local39] + Static208.anIntArrayArrayArray11[local17][local28 + 1][local39] + Static208.anIntArrayArrayArray11[local17][local28][local39 + 1] + Static208.anIntArrayArrayArray11[local17][local28 + 1][local39 + 1]) / 4 - (Static208.anIntArrayArrayArray11[arg1][arg2][arg3] + Static208.anIntArrayArrayArray11[arg1][arg2 + 1][arg3] + Static208.anIntArrayArrayArray11[arg1][arg2][arg3 + 1] + Static208.anIntArrayArrayArray11[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class61 local161 = local71.aClass61_1;
									if (local161 != null) {
										if (local161.aClass22_2.method4076()) {
											arg0.method4072(local161.aClass22_2, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass22_3 != null && local161.aClass22_3.method4076()) {
											arg0.method4072(local161.aClass22_3, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt3452; local232++) {
										@Pc(241) Class60 local241 = local71.aClass60Array3[local232];
										if (local241 != null && local241.aClass22_1.method4076() && (local28 == local241.anInt1529 || local28 == local3) && (local39 == local241.anInt1522 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt1523 + 1 - local241.anInt1529;
											@Pc(278) int local278 = local241.anInt1537 + 1 - local241.anInt1522;
											arg0.method4072(local241.aClass22_1, (local241.anInt1529 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt1522 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)V")
	public static void method1861(@OriginalArg(1) long arg0) {
		Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
		Static137.aClass1_Sub14_Sub1_6.method2631(21);
		Static137.aClass1_Sub14_Sub1_6.method2603(arg0);
		anInt2310 = 0;
		Static31.anInt560 = 1;
		Static282.anInt5385 = -3;
		Static34.anInt622 = 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public static void method1862() {
		Static260.method3909();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static56.aClass122Array1[local8].method3120();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;Lclient!sb;I)I")
	public static int method1864(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(2) int local2 = arg1.anInt3290;
		@Pc(18) byte[] local18 = Static19.method395(arg0);
		arg1.method2649(local18.length);
		arg1.anInt3290 += Static309.aClass143_1.method3498(local18, 0, arg1.anInt3290, arg1.aByteArray34, local18.length);
		return arg1.anInt3290 - local2;
	}
}
