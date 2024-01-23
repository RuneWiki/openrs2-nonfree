import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	public static int anInt243;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
	public static int anInt242 = 0;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Take";

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method230(@OriginalArg(1) int arg0) {
		if (!Static79.method1364(arg0)) {
			return;
		}
		@Pc(22) Class189[] local22 = Static188.aClass189ArrayArray115[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(36) Class189 local36 = local22[local24];
			if (local36 != null) {
				local36.anInt5983 = 1;
				local36.anInt5896 = 0;
				local36.anInt5901 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method231(@OriginalArg(0) Class58 arg0) {
		Static171.aClass58_74 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method232(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static93.method2018(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	public static void method233(@OriginalArg(0) int arg0) {
		if (arg0 == Static169.anInt3304) {
			return;
		}
		if (Static169.anInt3304 == 0) {
			Static245.method3166();
		}
		@Pc(28) boolean local28 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 40) {
			Static6.method101();
		}
		if (arg0 != 40 && Static69.aClass52_1 != null) {
			Static69.aClass52_1.method1103();
			Static69.aClass52_1 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static244.anInt4660 = 0;
			Static293.anInt5474 = 1;
			Static103.anInt2886 = 0;
			Static230.anInt4399 = 1;
			Static295.anInt5487 = 0;
			Static27.method384(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static149.method2394();
		}
		if (arg0 == 5) {
			Static165.method2688(Static7.aClass58_4);
		} else {
			Static150.method2418();
		}
		@Pc(114) boolean local114 = Static169.anInt3304 == 5 || Static169.anInt3304 == 10 || Static169.anInt3304 == 28;
		if (local114 != local28) {
			if (local28) {
				Static254.anInt4845 = Static285.anInt5612;
				if (Static24.anInt344 == 0) {
					Static56.method971();
				} else {
					Static168.method2705(Static278.aClass58_98, 255, Static285.anInt5612);
				}
				Static288.aClass51_2.method1093(false);
			} else {
				Static56.method971();
				Static288.aClass51_2.method1093(true);
			}
		}
		if (Static94.aBoolean138 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static94.method1608();
		}
		Static169.anInt3304 = arg0;
	}
}
