import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread5;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
	public static final int[] anIntArray524 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "Lclient!kp;")
	public static Class196 aClass196_10 = null;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public static void method6516() {
		if (Static361.anInt7411 <= 0) {
			Static163.aString22 = "";
			return;
		}
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static77.aStringArray189.length; local17++) {
			if (Static77.aStringArray189[local17].indexOf("--> ") != -1) {
				local15++;
				if (local15 == Static361.anInt7411) {
					Static163.aString22 = Static77.aStringArray189[local17].substring(Static77.aStringArray189[local17].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Z")
	public static boolean method6517() {
		return Static350.aBoolean498;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6519(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(28) String local28;
		if (Static451.anInt487 >= 200 && !Static161.aBoolean284 || Static451.anInt487 >= 200) {
			Static52.method905(Static290.aClass198_12.method4365(Static52.anInt1264));
			local28 = Static290.aClass198_13.method4365(Static52.anInt1264);
			if (local28 != null) {
				Static52.method905(local28);
			}
			return;
		}
		local28 = Static281.method4201(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(87) String local87;
		for (@Pc(48) int local48 = 0; local48 < Static451.anInt487; local48++) {
			@Pc(56) String local56 = Static281.method4201(Static306.aStringArray92[local48]);
			if (local56 != null && local56.equals(local28)) {
				Static52.method905(arg0 + Static290.aClass198_40.method4365(Static52.anInt1264));
				return;
			}
			if (Static362.aStringArray106[local48] != null) {
				local87 = Static281.method4201(Static362.aStringArray106[local48]);
				if (local87 != null && local87.equals(local28)) {
					Static52.method905(arg0 + Static290.aClass198_40.method4365(Static52.anInt1264));
					return;
				}
			}
		}
		for (@Pc(114) int local114 = 0; local114 < Static81.anInt1768; local114++) {
			local87 = Static281.method4201(Static360.aStringArray115[local114]);
			if (local87 != null && local87.equals(local28)) {
				Static52.method905(Static290.aClass198_45.method4365(Static52.anInt1264) + arg0 + Static290.aClass198_46.method4365(Static52.anInt1264));
				return;
			}
			if (Static323.aStringArray99[local114] != null) {
				@Pc(158) String local158 = Static281.method4201(Static323.aStringArray99[local114]);
				if (local158 != null && local158.equals(local28)) {
					Static52.method905(Static290.aClass198_45.method4365(Static52.anInt1264) + arg0 + Static290.aClass198_46.method4365(Static52.anInt1264));
					return;
				}
			}
		}
		if (Static281.method4201(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67).equals(local28)) {
			Static52.method905(Static290.aClass198_43.method4365(Static52.anInt1264));
		} else {
			@Pc(216) Class2_Sub42 local216 = Static249.method3910(Static227.aClass286_71, Static400.aClass145_2);
			local216.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(arg0));
			local216.aClass2_Sub15_Sub2_2.method4313(arg0);
			Static531.method7296(local216);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!nv;I)V")
	public static void method6520(@OriginalArg(0) Class2_Sub36 arg0) {
		if (Static389.aClass346ArrayArrayArray2 == null) {
			return;
		}
		@Pc(14) Interface24 local14 = null;
		if (arg0.anInt6568 == 0) {
			local14 = (Interface24) Static353.method5256(arg0.anInt6573, arg0.anInt6574, arg0.anInt6564);
		}
		if (arg0.anInt6568 == 1) {
			local14 = (Interface24) Static122.method1787(arg0.anInt6573, arg0.anInt6574, arg0.anInt6564);
		}
		if (arg0.anInt6568 == 2) {
			local14 = (Interface24) Static224.method3516(arg0.anInt6573, arg0.anInt6574, arg0.anInt6564, vda.class);
		}
		if (arg0.anInt6568 == 3) {
			local14 = (Interface24) Static317.method4928(arg0.anInt6573, arg0.anInt6574, arg0.anInt6564);
		}
		if (local14 == null) {
			arg0.anInt6571 = 0;
			arg0.anInt6569 = -1;
			arg0.anInt6570 = 0;
		} else {
			arg0.anInt6569 = local14.method7337();
			arg0.anInt6571 = local14.method7336();
			arg0.anInt6570 = local14.method7340();
		}
	}
}
