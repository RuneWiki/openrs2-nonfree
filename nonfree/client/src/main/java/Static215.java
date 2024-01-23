import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!uj", name = "Y", descriptor = "Lclient!o;")
	public static Class86 aClass86_16;

	@OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
	public static int anInt4671;

	@OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
	public static int anInt4669 = 0;

	@OriginalMember(owner = "client!uj", name = "db", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1263 = Static231.method3737("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
	public static int anInt4674 = 0;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	public static void method3498() {
		for (@Pc(10) Class1_Sub2_Sub8 local10 = (Class1_Sub2_Sub8) Static106.aClass120_12.method3564(); local10 != null; local10 = (Class1_Sub2_Sub8) Static106.aClass120_12.method3561()) {
			@Pc(17) Class5_Sub6 local17 = local10.aClass5_Sub6_1;
			if (Static191.anInt4237 != local17.anInt1383 || local17.aBoolean121) {
				local10.method3735();
			} else if (local17.anInt1394 <= Static128.anInt2802) {
				local17.method1112(Static204.anInt2498);
				if (local17.aBoolean121) {
					local10.method3735();
				} else {
					Static58.method1127(local17.anInt1383, local17.anInt1385, local17.anInt1384, local17.anInt1388, 60, local17, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Lclient!jb;I)V")
	public static void method3499(@OriginalArg(0) Class28 arg0) {
		if (Static207.aBoolean391) {
			return;
		}
		Static205.method3245();
		Static163.aClass1_Sub2_Sub2_71 = Static227.method3686(arg0, Static185.anInt4914);
		Static163.aClass1_Sub2_Sub2_71.method195(-95, 0);
		Static176.aClass64_1 = Static38.method716(arg0, Static20.anInt2216);
		Static176.aClass64_1.method1870(382 - Static176.aClass64_1.anInt2356 / 2, 18);
		Static207.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[Lclient!jc;I[BZZ)V")
	public static void method3500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class60[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
			for (local13 = 0; local13 < 64; local13++) {
				for (local17 = 0; local17 < 64; local17++) {
					if (arg0 + local13 > 0 && local13 + arg0 < 103 && arg1 + local17 > 0 && local17 + arg1 < 103) {
						arg3[local9].anIntArrayArray24[arg0 + local13][arg1 + local17] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(95) Class1_Sub26 local95 = new Class1_Sub26(arg5);
		for (local13 = 0; local13 < 4; local13++) {
			for (local17 = 0; local17 < 64; local17++) {
				for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
					Static3.method2856(local17 + arg0, arg4, local13, arg2, 0, local110 + arg1, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!eg;I)V")
	public static void method3501(@OriginalArg(0) Class5_Sub5 arg0) {
		arg0.aBoolean257 = false;
		@Pc(17) Class96 local17;
		if (arg0.anInt3005 != -1) {
			local17 = Static2.method88(arg0.anInt3005);
			if (local17 == null || local17.anIntArray323 == null) {
				arg0.anInt3005 = -1;
			} else {
				arg0.anInt3001++;
				if (local17.anIntArray323.length > arg0.anInt3028 && arg0.anInt3001 > local17.anIntArray327[arg0.anInt3028]) {
					arg0.anInt3028++;
					arg0.anInt3001 = 1;
					Static133.method2209(arg0.anInt3044, arg0.anInt3021, local17, arg0 == Static204.aClass5_Sub5_Sub1_2, arg0.anInt3028);
				}
				if (arg0.anInt3028 >= local17.anIntArray323.length) {
					arg0.anInt3001 = 0;
					arg0.anInt3028 = 0;
					Static133.method2209(arg0.anInt3044, arg0.anInt3021, local17, arg0 == Static204.aClass5_Sub5_Sub1_2, arg0.anInt3028);
				}
			}
		}
		if (arg0.anInt3045 != -1 && Static128.anInt2802 >= arg0.anInt3029) {
			if (arg0.anInt3038 < 0) {
				arg0.anInt3038 = 0;
			}
			@Pc(126) int local126 = Static89.method1514(arg0.anInt3045).anInt2562;
			if (local126 == -1) {
				arg0.anInt3045 = -1;
			} else {
				@Pc(138) Class96 local138 = Static2.method88(local126);
				if (local138 == null || local138.anIntArray323 == null) {
					arg0.anInt3045 = -1;
				} else {
					arg0.anInt3050++;
					if (arg0.anInt3038 < local138.anIntArray323.length && arg0.anInt3050 > local138.anIntArray327[arg0.anInt3038]) {
						arg0.anInt3050 = 1;
						arg0.anInt3038++;
						Static133.method2209(arg0.anInt3044, arg0.anInt3021, local138, arg0 == Static204.aClass5_Sub5_Sub1_2, arg0.anInt3038);
					}
					if (local138.anIntArray323.length <= arg0.anInt3038) {
						arg0.anInt3045 = -1;
					}
				}
			}
		}
		if (arg0.anInt3048 != -1 && arg0.anInt2996 <= 1) {
			local17 = Static2.method88(arg0.anInt3048);
			if (local17.anInt3652 == 1 && arg0.anInt3041 > 0 && arg0.anInt3042 <= Static128.anInt2802 && arg0.anInt3024 < Static128.anInt2802) {
				arg0.anInt2996 = 1;
				return;
			}
		}
		if (arg0.anInt3048 != -1 && arg0.anInt2996 == 0) {
			local17 = Static2.method88(arg0.anInt3048);
			if (local17 == null || local17.anIntArray323 == null) {
				arg0.anInt3048 = -1;
			} else {
				arg0.anInt3013++;
				if (arg0.anInt3023 < local17.anIntArray323.length && arg0.anInt3013 > local17.anIntArray327[arg0.anInt3023]) {
					arg0.anInt3023++;
					arg0.anInt3013 = 1;
					Static133.method2209(arg0.anInt3044, arg0.anInt3021, local17, Static204.aClass5_Sub5_Sub1_2 == arg0, arg0.anInt3023);
				}
				if (local17.anIntArray323.length <= arg0.anInt3023) {
					arg0.anInt3047++;
					arg0.anInt3023 -= local17.anInt3645;
					if (local17.anInt3646 <= arg0.anInt3047) {
						arg0.anInt3048 = -1;
					} else if (arg0.anInt3023 >= 0 && local17.anIntArray323.length > arg0.anInt3023) {
						Static133.method2209(arg0.anInt3044, arg0.anInt3021, local17, arg0 == Static204.aClass5_Sub5_Sub1_2, arg0.anInt3023);
					} else {
						arg0.anInt3048 = -1;
					}
				}
				arg0.aBoolean257 = local17.aBoolean324;
			}
		}
		if (arg0.anInt2996 > 0) {
			arg0.anInt2996--;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(Lclient!jb;I)V")
	public static void method3503(@OriginalArg(0) Class28 arg0) {
		Static8.aClass28_3 = arg0;
		Static201.anInt4358 = Static8.aClass28_3.method832(4);
	}
}
