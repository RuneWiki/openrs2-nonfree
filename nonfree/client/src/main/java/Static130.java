import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
	public static int anInt2891;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!qg;")
	public static Class131 aClass131_6 = new Class131();

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	public static int anInt2885 = 0;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	public static int anInt2888 = 0;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	public static volatile int anInt2889 = -1;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString81 = "flash2:";

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!kb;Z)V")
	public static void method2199(@OriginalArg(0) Class83 arg0) {
		Static181.aClass1_Sub2_Sub14_Sub1Array2 = Static161.method3010(arg0, Static14.anInt388);
		Static282.aClass1_Sub2_Sub14Array17 = Static167.method3093(Static202.anInt4502, arg0);
		Static11.aClass1_Sub2_Sub14Array13 = Static167.method3093(Static86.anInt2029, arg0);
		Static9.aClass1_Sub2_Sub14Array1 = Static167.method3093(Static61.anInt1560, arg0);
		Static250.aClass1_Sub2_Sub14Array8 = Static167.method3093(Static14.anInt391, arg0);
		Static215.aClass1_Sub2_Sub14Array15 = Static167.method3093(Static161.anInt3717, arg0);
		Static33.aClass1_Sub2_Sub14Array5 = Static167.method3093(Static3.anInt106, arg0);
		Static238.aClass1_Sub2_Sub14_8 = Static92.method1600(Static52.anInt1406, arg0);
		Static222.aClass1_Sub2_Sub14Array16 = Static243.method4185(Static92.anInt2147, arg0);
		Static99.aClass1_Sub2_Sub14Array11 = Static243.method4185(Static224.anInt4944, arg0);
		Static119.aClass7Array1 = Static225.method3927(arg0, Static246.anInt5374);
		Static216.aClass7Array3 = Static225.method3927(arg0, Static152.anInt3528);
		Static14.aClass1_Sub2_Sub16_1.method3963(Static216.aClass7Array3, null);
		Static58.aClass1_Sub2_Sub16_2.method3963(Static216.aClass7Array3, null);
		Static156.aClass1_Sub2_Sub16_3.method3963(Static216.aClass7Array3, null);
		if (Static296.aBoolean335) {
			Static124.aClass7_Sub1Array2 = Static80.method1435(Static229.anInt5078, arg0);
			for (@Pc(100) int local100 = 0; local100 < Static124.aClass7_Sub1Array2.length; local100++) {
				Static124.aClass7_Sub1Array2[local100].method126();
			}
		}
		@Pc(121) Class1_Sub2_Sub14_Sub1 local121 = Static135.method2305(arg0, 0, Static229.anInt5088);
		local121.method2485();
		if (Static296.aBoolean335) {
			Static212.aClass1_Sub2_Sub14_5 = new Class1_Sub2_Sub14_Sub2(local121);
		} else {
			Static212.aClass1_Sub2_Sub14_5 = local121;
		}
		@Pc(140) Class1_Sub2_Sub14_Sub1[] local140 = Static161.method3010(arg0, Static52.anInt1407);
		@Pc(142) int local142;
		for (local142 = 0; local142 < local140.length; local142++) {
			local140[local142].method2485();
		}
		if (Static296.aBoolean335) {
			Static40.aClass1_Sub2_Sub14Array10 = new Class1_Sub2_Sub14[local140.length];
			for (local142 = 0; local142 < local140.length; local142++) {
				Static40.aClass1_Sub2_Sub14Array10[local142] = new Class1_Sub2_Sub14_Sub2(local140[local142]);
			}
		} else {
			Static40.aClass1_Sub2_Sub14Array10 = local140;
		}
		local142 = (int) (Math.random() * 21.0D) - 10;
		@Pc(199) int local199 = (int) (Math.random() * 21.0D) - 10;
		@Pc(206) int local206 = (int) (Math.random() * 21.0D) - 10;
		@Pc(213) int local213 = (int) (Math.random() * 41.0D) - 20;
		@Pc(215) int local215;
		for (local215 = 0; local215 < Static181.aClass1_Sub2_Sub14_Sub1Array2.length; local215++) {
			Static181.aClass1_Sub2_Sub14_Sub1Array2[local215].method2489(local142 + local213, local213 + local199, local206 + local213);
		}
		if (Static296.aBoolean335) {
			Static208.aClass1_Sub2_Sub14Array14 = new Class1_Sub2_Sub14[Static181.aClass1_Sub2_Sub14_Sub1Array2.length];
			for (local215 = 0; local215 < Static181.aClass1_Sub2_Sub14_Sub1Array2.length; local215++) {
				Static208.aClass1_Sub2_Sub14Array14[local215] = new Class1_Sub2_Sub14_Sub2(Static181.aClass1_Sub2_Sub14_Sub1Array2[local215]);
			}
		} else {
			Static208.aClass1_Sub2_Sub14Array14 = Static181.aClass1_Sub2_Sub14_Sub1Array2;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!im;I)Lclient!bg;")
	public static Class18 method2200(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(7) Class18 local7 = new Class18();
		local7.anInt457 = arg0.method2652();
		local7.aClass1_Sub2_Sub20_1 = Static81.method1454(local7.anInt457);
		return local7;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	public static void method2203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < Static202.anInt4503; local7++) {
			@Pc(14) Class159 local14 = Static50.method1056(local7);
			if (local14 != null) {
				@Pc(22) int local22 = local14.anInt5801;
				if (local22 >= 0 && !Static151.anInterface2_1.method4414(local22)) {
					local22 = -1;
				}
				@Pc(47) int local47;
				@Pc(52) int local52;
				@Pc(58) int local58;
				@Pc(84) int local84;
				if (local14.anInt5807 >= 0) {
					local52 = local14.anInt5807;
					local58 = arg1 + (local52 & 0x7F);
					if (local58 < 0) {
						local58 = 0;
					} else if (local58 > 127) {
						local58 = 127;
					}
					local84 = local58 + (arg0 + local52 & 0xFC00) + (local52 & 0x380);
					local47 = Static151.anIntArray324[Static182.method3511(96, local84)];
				} else if (local22 >= 0) {
					local47 = Static151.anIntArray324[Static182.method3511(96, Static151.anInterface2_1.method4416(local22))];
				} else if (local14.anInt5803 == -1) {
					local47 = -1;
				} else {
					local52 = local14.anInt5803;
					local58 = arg1 + (local52 & 0x7F);
					if (local58 < 0) {
						local58 = 0;
					} else if (local58 > 127) {
						local58 = 127;
					}
					local84 = (arg0 + local52 & 0xFC00) + (local52 & 0x380) + local58;
					local47 = Static151.anIntArray324[Static182.method3511(96, local84)];
				}
				Static62.anIntArray168[local7 + 1] = local47;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public static void method2205(@OriginalArg(0) int arg0) {
		if (Static28.anInt774 == arg0) {
			@Pc(13) Interface1 local13 = Static207.anInterface1Array1[arg0];
			local13.method3556(Static226.anInt4960);
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method2207() {
		if (!Static40.aBoolean105 && Static105.anInt6119 != 2) {
			try {
				Static301.method406("tbrefresh", Static26.aClient1);
			} catch (@Pc(24) Throwable local24) {
			}
		}
	}
}
