import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Lclient!rf;")
	public static final Class284 aClass284_3 = new Class284("stellardawn", 1);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!lo;III)V")
	public static void method5909(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class346 local12;
		if (arg2 < Static496.anInt8369) {
			local12 = Static389.aClass346ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass6_Sub1_Sub2_1 != null && local12.aClass6_Sub1_Sub2_1.method7330()) {
				arg0.method7325(true, Static33.anInt857, Static356.aClass100_8, local12.aClass6_Sub1_Sub2_1, 0, 0);
			}
		}
		if (arg3 < Static496.anInt8369) {
			local12 = Static389.aClass346ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass6_Sub1_Sub2_1 != null && local12.aClass6_Sub1_Sub2_1.method7330()) {
				arg0.method7325(true, 0, Static356.aClass100_8, local12.aClass6_Sub1_Sub2_1, 0, Static33.anInt857);
			}
		}
		if (arg2 < Static496.anInt8369 && arg3 < Static357.anInt6390) {
			local12 = Static389.aClass346ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass6_Sub1_Sub2_1 != null && local12.aClass6_Sub1_Sub2_1.method7330()) {
				arg0.method7325(true, Static33.anInt857, Static356.aClass100_8, local12.aClass6_Sub1_Sub2_1, 0, Static33.anInt857);
			}
		}
		if (arg2 < Static496.anInt8369 && arg3 > 0) {
			local12 = Static389.aClass346ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass6_Sub1_Sub2_1 != null && local12.aClass6_Sub1_Sub2_1.method7330()) {
				arg0.method7325(true, Static33.anInt857, Static356.aClass100_8, local12.aClass6_Sub1_Sub2_1, 0, -Static33.anInt857);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method5910(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static589.method7959();
		Static307.method4575();
		Static329.method5053();
		Static385.method5666(arg0, arg1);
		Static511.method7098();
		Static206.method3319(Static307.aClass100_6);
		Static44.method724(Static307.aClass100_6);
		Static542.method7381(Static490.aClass259_153, Static307.aClass100_6);
		Static231.method3611();
		Static218.method4199(Static491.aClass39Array13);
		Static139.method2348();
		Static29.method539();
		if (Static201.anInt3963 == 3) {
			Static121.method1780(4);
		} else if (Static201.anInt3963 == 7) {
			Static121.method1780(8);
		} else if (Static201.anInt3963 == 10) {
			Static121.method1780(11);
		} else if (Static201.anInt3963 == 1 || Static201.anInt3963 == 2) {
			Static316.method4923();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!nw;)I")
	public static int method5912(@OriginalArg(1) Class236 arg0) {
		if (Static291.aClass236_2 == arg0) {
			return 7681;
		} else if (arg0 == Static458.aClass236_4) {
			return 8448;
		} else if (Static583.aClass236_5 == arg0) {
			return 34165;
		} else if (Static202.aClass236_1 == arg0) {
			return 260;
		} else if (Static395.aClass236_3 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
