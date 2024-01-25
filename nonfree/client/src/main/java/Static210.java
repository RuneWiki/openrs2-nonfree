import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	public static int anInt4473;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4008(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static208.aClass216_69.anInt6797 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static345.anInt6609; local18++) {
			@Pc(24) Class111 local24 = Static20.method561(local18);
			if ((!arg0 || local24.aBoolean319) && local24.anInt3320 == -1 && local24.anInt3324 == -1 && local24.anInt3335 == 0 && local24.aString30.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static326.aShortArray44 = null;
					Static15.anInt524 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(73) short[] local73 = new short[local14.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local16; local75++) {
						local73[local75] = local14[local75];
					}
					local14 = local73;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static270.anInt5516 = 0;
		Static326.aShortArray44 = local14;
		Static15.anInt524 = local16;
		@Pc(116) String[] local116 = new String[Static15.anInt524];
		for (@Pc(123) int local123 = 0; local123 < Static15.anInt524; local123++) {
			local116[local123] = Static20.method561(local14[local123]).aString30;
		}
		Static52.method1338(Static326.aShortArray44, local116);
		Static208.aClass216_69.method5656();
		Static208.aClass216_69.anInt6797 = 2;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([Lclient!aq;II)V")
	public static void method4009(@OriginalArg(0) Class12[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) Class12 local11 = arg0[local3];
			if (local11 != null && local11.anInt459 == arg1 && !Static44.method1013(local11)) {
				if (local11.anInt416 == 0) {
					method4009(arg0, local11.anInt465);
					if (local11.aClass12Array3 != null) {
						method4009(local11.aClass12Array3, local11.anInt465);
					}
					@Pc(51) Class1_Sub37 local51 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local11.anInt465);
					if (local51 != null) {
						Static147.method2937(local51.anInt6281);
					}
				}
				if (local11.anInt416 == 6 && local11.anInt441 != -1) {
					@Pc(71) Class24 local71 = Static110.method5411(local11.anInt441);
					if (local71 != null) {
						local11.anInt450 += Static303.anInt2311;
						while (local71.anIntArray89[local11.anInt388] < local11.anInt450) {
							local11.anInt450 -= local71.anIntArray89[local11.anInt388];
							local11.anInt388++;
							if (local11.anInt388 >= local71.anIntArray90.length) {
								local11.anInt388 -= local71.anInt1034;
								if (local11.anInt388 < 0 || local11.anInt388 >= local71.anIntArray90.length) {
									local11.anInt388 = 0;
								}
							}
							local11.anInt395 = local11.anInt388 + 1;
							if (local11.anInt395 >= local71.anIntArray90.length) {
								local11.anInt395 -= local71.anInt1034;
								if (local11.anInt395 < 0 || local11.anInt395 >= local71.anIntArray90.length) {
									local11.anInt395 = -1;
								}
							}
							Static6.method247(local11);
						}
					}
				}
			}
		}
	}
}
