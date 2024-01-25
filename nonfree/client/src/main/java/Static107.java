import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString260;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
	public static int anInt6870 = 0;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public static int anInt6873 = -1;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5698(@OriginalArg(0) String arg0) {
		if (Static154.aStringArray27 == null) {
			Static173.method3266();
		}
		@Pc(14) String[] local14 = Static304.method5143(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(23) int local23 = Static154.aStringArray27.length - 1; local23 > 0; local23--) {
				Static154.aStringArray27[local23] = Static154.aStringArray27[local23 - 1];
			}
			Static154.aStringArray27[0] = local14[local16];
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
	public static void method5705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 6);
		local8.method2031();
		local8.anInt2410 = arg1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
	public static void method5706(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static18.anIntArray52[local7] = Static18.anIntArray52[local7 - 1];
			Static21.anIntArray54[local7] = Static21.anIntArray54[local7 - 1];
			Static79.aStringArray15[local7] = Static79.aStringArray15[local7 - 1];
			Static169.aStringArray29[local7] = Static169.aStringArray29[local7 - 1];
			Static219.aStringArray39[local7] = Static219.aStringArray39[local7 - 1];
			Static197.aStringArray32[local7] = Static197.aStringArray32[local7 - 1];
			Static234.anIntArray392[local7] = Static234.anIntArray392[local7 - 1];
		}
		Static18.anIntArray52[0] = arg3;
		Static21.anIntArray54[0] = arg2;
		Static79.aStringArray15[0] = arg0;
		Static169.aStringArray29[0] = arg4;
		Static219.aStringArray39[0] = arg1;
		Static197.aStringArray32[0] = arg6;
		Static234.anIntArray392[0] = arg5;
		Static29.anInt466++;
		Static213.anInt4435 = Static344.anInt6736;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public static void method5707() {
		while (true) {
			if (Static200.aClass4_Sub7_Sub1_2.method1246(Static302.anInt6099) >= 27) {
				@Pc(23) int local23 = Static200.aClass4_Sub7_Sub1_2.method1247(15);
				if (local23 != 32767) {
					@Pc(30) boolean local30 = false;
					if (Static101.aClass2_Sub2_Sub1_Sub2Array6[local23] == null) {
						Static101.aClass2_Sub2_Sub1_Sub2Array6[local23] = new Class2_Sub2_Sub1_Sub2();
						Static101.aClass2_Sub2_Sub1_Sub2Array6[local23].anInt6535 = local23;
						local30 = true;
					}
					@Pc(51) Class2_Sub2_Sub1_Sub2 local51 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local23];
					Static332.anIntArray523[Static282.anInt5712++] = local23;
					local51.anInt6515 = Static342.anInt6706;
					if (local51.aClass34_1 != null && local51.aClass34_1.method734()) {
						Static235.method5579(local51);
					}
					@Pc(84) int local84 = Static258.anIntArray438[Static200.aClass4_Sub7_Sub1_2.method1247(3)];
					@Pc(89) int local89 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
					if (local89 == 1) {
						Static49.anIntArray122[Static104.anInt6829++] = local23;
					}
					@Pc(105) int local105 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
					@Pc(110) int local110 = Static200.aClass4_Sub7_Sub1_2.method1247(5);
					local51.method5445(Static165.method2927(Static200.aClass4_Sub7_Sub1_2.method1247(14)));
					if (local110 > 15) {
						local110 -= 32;
					}
					@Pc(128) int local128 = Static200.aClass4_Sub7_Sub1_2.method1247(5);
					if (local128 > 15) {
						local128 -= 32;
					}
					local51.method5433(local51.aClass34_1.anInt842);
					local51.anInt6514 = local51.aClass34_1.anInt852 << 3;
					if (local51.anInt6514 == 0) {
						local51.method5421(0);
					} else if (local30) {
						local51.method5421(local84);
					}
					local51.method5422(Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0] + local128, Static279.anInt5645, local105 == 1, local51.method5425(), local110 + Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0]);
					if (local51.aClass34_1.method734()) {
						Static55.method1013(0, local51.anIntArray517[0], local51.anIntArray518[0], local51, null, Static279.anInt5645, null);
					}
					continue;
				}
			}
			Static200.aClass4_Sub7_Sub1_2.method1241();
			return;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZBZ)V")
	public static void method5710(@OriginalArg(0) boolean arg0) {
		Static142.anInt3180--;
		if (Static142.anInt3180 == 0) {
			Static56.anIntArray139 = null;
		}
		if (arg0) {
			Static28.anInt5938--;
			if (Static28.anInt5938 == 0) {
				Static133.anIntArray277 = null;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	public static void method5712() {
		if (Static139.anInt3135 == 10) {
			Static233.method3965(28);
		}
		if (Static139.anInt3135 == 30) {
			Static233.method3965(25);
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(IB)Lclient!np;")
	public static Class4_Sub1_Sub15 method5713(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub15 local10 = (Class4_Sub1_Sub15) Static123.aClass15_4.method356((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static80.aClass11_41.method288(arg0, 19);
		local10 = new Class4_Sub1_Sub15();
		if (local28 != null) {
			local10.method3717(new Class4_Sub7(local28));
		}
		Static123.aClass15_4.method352((long) arg0, local10);
		return local10;
	}
}
