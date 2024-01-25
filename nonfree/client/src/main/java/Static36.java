import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bga", name = "u", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_9 = new Class276(101, 6);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method1091(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static403.anInt7927 >= 100) {
			Static477.method7310(Static139.aClass101_38.method2841(Static126.anInt2904));
			return;
		}
		@Pc(21) String local21 = Static67.method8230(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(64) String local64;
		for (@Pc(26) int local26 = 0; local26 < Static403.anInt7927; local26++) {
			@Pc(33) String local33 = Static67.method8230(Class21_Sub3.lb[local26]);
			if (local33 != null && local33.equals(local21)) {
				Static477.method7310(arg0 + Static139.aClass101_39.method2841(Static126.anInt2904));
				return;
			}
			if (Static406.aStringArray28[local26] != null) {
				local64 = Static67.method8230(Static406.aStringArray28[local26]);
				if (local64 != null && local64.equals(local21)) {
					Static477.method7310(arg0 + Static139.aClass101_39.method2841(Static126.anInt2904));
					return;
				}
			}
		}
		for (@Pc(91) int local91 = 0; local91 < Static346.anInt7032; local91++) {
			local64 = Static67.method8230(Static520.aStringArray34[local91]);
			if (local64 != null && local64.equals(local21)) {
				Static477.method7310(Static139.aClass101_44.method2841(Static126.anInt2904) + arg0 + Static139.aClass101_45.method2841(Static126.anInt2904));
				return;
			}
			if (Static199.aStringArray17[local91] != null) {
				@Pc(139) String local139 = Static67.method8230(Static199.aStringArray17[local91]);
				if (local139 != null && local139.equals(local21)) {
					Static477.method7310(Static139.aClass101_44.method2841(Static126.anInt2904) + arg0 + Static139.aClass101_45.method2841(Static126.anInt2904));
					return;
				}
			}
		}
		if (Static67.method8230(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23).equals(local21)) {
			Static477.method7310(Static139.aClass101_41.method2841(Static126.anInt2904));
			return;
		}
		@Pc(197) Class3_Sub9 local197 = Static587.method8316(Static187.aClass40_2, Static475.aClass230_92);
		local197.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg0) + 1);
		local197.aClass3_Sub7_Sub1_1.method6516(arg0);
		local197.aClass3_Sub7_Sub1_1.method6494(arg1 ? 1 : 0);
		Static230.method3933(local197);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "()V")
	public static void method1092() {
		for (@Pc(1) int local1 = 0; local1 < Static7.anInt303; local1++) {
			@Pc(6) Class2_Sub2 local6 = Static377.aClass2_Sub2Array2[local1];
			Static499.method7533(local6);
			Static377.aClass2_Sub2Array2[local1] = null;
		}
		Static7.anInt303 = 0;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(JJ)J")
	public static long method1093(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!e;ZLclient!pe;)V")
	public static void method1097(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class254 arg1) {
		Static478.anInterface4_14 = arg0;
		Static209.aClass254_70 = arg1;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([ILclient!dg;IB)V")
	public static void method1098(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) boolean local8;
		@Pc(10) int local10;
		if (arg1.anIntArray484 != null) {
			local8 = true;
			for (local10 = 0; local10 < arg1.anIntArray484.length; local10++) {
				if (arg0[local10] != arg1.anIntArray484[local10]) {
					local8 = false;
					break;
				}
			}
			if (local8 && arg1.anInt7651 != -1) {
				@Pc(45) Class174 local45 = Static532.aClass157_2.method3734(arg1.anInt7651);
				@Pc(48) int local48 = local45.anInt5488;
				if (local48 == 1) {
					arg1.anInt7588 = 0;
					arg1.anInt7615 = 1;
					arg1.anInt7584 = arg2;
					arg1.anInt7589 = 0;
					arg1.anInt7646 = 0;
					Static28.method957(local45, arg1.aByte103, arg1.anInt9396, arg1.anInt9398, arg1 == Static443.aClass2_Sub2_Sub1_Sub1_2, arg1.anInt7646);
				}
				if (local48 == 2) {
					arg1.anInt7589 = 0;
				}
			}
		}
		local8 = true;
		for (local10 = 0; local10 < arg0.length; local10++) {
			if (arg0[local10] != -1) {
				local8 = false;
			}
			if (arg1.anIntArray484 == null || arg1.anIntArray484[local10] == -1 || Static532.aClass157_2.method3734(arg0[local10]).anInt5497 >= Static532.aClass157_2.method3734(arg1.anIntArray484[local10]).anInt5497) {
				arg1.anIntArray484 = arg0;
				arg1.anInt7584 = arg2;
				break;
			}
		}
		if (local8) {
			arg1.anIntArray484 = arg0;
			arg1.anInt7584 = arg2;
		}
	}
}
