import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array79;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_65 = new Class277(8);

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_27 = new Class54(0, 16);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method7472(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static508.anInt8897 >= 100) {
			Static484.method7507(Static40.aClass45_24.method1474(Static544.anInt7853));
			return;
		}
		@Pc(24) String local24 = Static442.method6847(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(36) int local36 = 0; local36 < Static508.anInt8897; local36++) {
			@Pc(44) String local44 = Static442.method6847(Static537.aStringArray44[local36]);
			if (local44 != null && local44.equals(local24)) {
				Static484.method7507(arg1 + Static544.aClass45_116.method1474(Static544.anInt7853));
				return;
			}
			if (Static515.aStringArray38[local36] != null) {
				local74 = Static442.method6847(Static515.aStringArray38[local36]);
				if (local74 != null && local74.equals(local24)) {
					Static484.method7507(arg1 + Static544.aClass45_116.method1474(Static544.anInt7853));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static330.anInt6194; local100++) {
			local74 = Static442.method6847(Static163.aStringArray18[local100]);
			if (local74 != null && local74.equals(local24)) {
				Static484.method7507(Static66.aClass45_31.method1474(Static544.anInt7853) + arg1 + Static114.aClass45_42.method1474(Static544.anInt7853));
				return;
			}
			if (Static223.aStringArray23[local100] != null) {
				@Pc(143) String local143 = Static442.method6847(Static223.aStringArray23[local100]);
				if (local143 != null && local143.equals(local24)) {
					Static484.method7507(Static66.aClass45_31.method1474(Static544.anInt7853) + arg1 + Static114.aClass45_42.method1474(Static544.anInt7853));
					return;
				}
			}
		}
		if (Static442.method6847(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13).equals(local24)) {
			Static484.method7507(Static457.aClass45_118.method1474(Static544.anInt7853));
		} else {
			Static216.method3997(Static60.aClass252_28);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(arg1) + 1);
			Static259.aClass1_Sub17_Sub2_1.method4464(arg1);
			Static259.aClass1_Sub17_Sub2_1.method4451(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)V")
	public static void method7473() {
		Static344.aClass277_49.method7018(50);
		Static303.aClass277_43.method7018(50);
		Static8.aClass277_5.method7018(50);
		Static125.aClass277_21.method7018(50);
		Static207.aClass277_30.method7018(50);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(CI)I")
	public static int method7475(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class92.anIntArray192.length > arg0 ? Class92.anIntArray192[arg0] : -1;
	}
}
