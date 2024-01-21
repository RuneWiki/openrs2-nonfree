import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!me", name = "G", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array9;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "I")
	public static int anInt2689;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_990 = Static177.method3050(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!me", name = "A", descriptor = "[Lclient!lh;")
	public static final Class56[] aClass56Array1 = new Class56[23];

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_991 = Static177.method3050(": ");

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_992 = Static177.method3050("::clientdrop");

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public static void method2032() {
		if (Static103.aClass1_32 != null || Static6.aClass1_2 != null) {
			return;
		}
		@Pc(13) int local13 = Static66.anInt1811;
		@Pc(88) int local88;
		@Pc(82) int local82;
		if (Static64.aBoolean76) {
			@Pc(180) int local180;
			if (local13 != 1) {
				local180 = Static25.anInt620;
				local88 = Static169.anInt3778;
				if (Static9.anInt327 - 10 > local180 || local180 > Static185.anInt4084 + Static9.anInt327 + 10 || local88 < Static148.anInt3380 - 10 || Static148.anInt3380 + Static163.anInt3720 + 10 < local88) {
					Static64.aBoolean76 = false;
					Static149.method2557(Static185.anInt4084, Static9.anInt327, Static163.anInt3720, Static148.anInt3380);
				}
			}
			if (local13 == 1) {
				local180 = Static9.anInt327;
				local82 = Static185.anInt4084;
				@Pc(241) int local241 = Static28.anInt747;
				local88 = Static148.anInt3380;
				@Pc(245) int local245 = Static73.anInt1877;
				@Pc(247) int local247 = -1;
				for (@Pc(249) int local249 = 0; local249 < Static3.anInt86; local249++) {
					@Pc(263) int local263 = (Static3.anInt86 - local249 - 1) * 15 + local88 + 31;
					if (local241 > local180 && local241 < local82 + local180 && local263 - 13 < local245 && local245 < local263 + 3) {
						local247 = local249;
					}
				}
				if (local247 != -1) {
					Static118.method2140(local247);
				}
				Static64.aBoolean76 = false;
				Static149.method2557(Static185.anInt4084, Static9.anInt327, Static163.anInt3720, Static148.anInt3380);
			}
			return;
		}
		if (local13 == 1 && Static3.anInt86 > 0) {
			@Pc(28) short local28 = Static11.aShortArray5[Static3.anInt86 - 1];
			if (local28 == 35 || local28 == 46 || local28 == 41 || local28 == 30 || local28 == 13 || local28 == 57 || local28 == 14 || local28 == 37 || local28 == 51 || local28 == 31 || local28 == 29 || local28 == 1007) {
				local82 = Static123.anIntArray280[Static3.anInt86 - 1];
				local88 = Static163.anIntArray370[Static3.anInt86 - 1];
				@Pc(92) Class1 local92 = Static154.method3136(local82);
				if (Static147.method471(Static102.method1954(local92)) || Static66.method1449(Static102.method1954(local92))) {
					Static146.aBoolean137 = false;
					Static61.anInt1638 = 0;
					if (Static103.aClass1_32 != null) {
						Static3.method21(Static103.aClass1_32);
					}
					Static103.aClass1_32 = Static154.method3136(local82);
					Static156.anInt3535 = local88;
					Static154.anInt4090 = Static73.anInt1877;
					Static101.anInt2575 = Static28.anInt747;
					Static3.method21(Static103.aClass1_32);
					return;
				}
			}
		}
		if (local13 == 1 && (Static89.anInt2296 == 1 && Static3.anInt86 > 2 || Static156.method2678(Static3.anInt86 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static3.anInt86 > 0) {
			Static118.method2140(Static3.anInt86 - 1);
		}
		if (local13 == 2 && Static3.anInt86 > 0) {
			Static41.method711();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([S[Lclient!jd;III)V")
	public static void method2033(@OriginalArg(0) short[] arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) Class46 local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) short local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg3; local42++) {
			if (local16 == null || arg1[local42] != null && arg1[local42].method1645(local16) < (local42 & 0x1)) {
				@Pc(66) Class46 local66 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local66;
				@Pc(80) short local80 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12++] = local80;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method2033(arg0, arg1, arg2, local12 - 1);
		method2033(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)I")
	public static int method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub16 local12 = (Class4_Sub16) Static25.aClass20_1.method505((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray244.length; local25++) {
				if (local12.anIntArray245[local25] == arg0) {
					local23 += local12.anIntArray244[local25];
				}
			}
			return local23;
		}
	}
}
