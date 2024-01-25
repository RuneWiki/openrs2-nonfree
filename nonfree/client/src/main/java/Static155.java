import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt2819;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt2821;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
	public static int[] anIntArray341 = new int[1];

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
	public static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2654(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static60.anInt1162 >= 100) {
			Static215.method6797(Static395.aClass202_208.method5139(Static172.anInt6352));
			return;
		}
		@Pc(24) String local24 = Static111.method2163(arg0);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static60.anInt1162; local29++) {
			@Pc(37) String local37 = Static111.method2163(Static73.aStringArray6[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static215.method6797(arg0 + Static539.aClass202_268.method5139(Static172.anInt6352));
				return;
			}
			if (Static185.aStringArray19[local29] != null) {
				local67 = Static111.method2163(Static185.aStringArray19[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static215.method6797(arg0 + Static539.aClass202_268.method5139(Static172.anInt6352));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static12.anInt264; local97++) {
			local67 = Static111.method2163(Static145.aStringArray15[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static215.method6797(Static227.aClass202_130.method5139(Static172.anInt6352) + arg0 + Static339.aClass202_187.method5139(Static172.anInt6352));
				return;
			}
			if (Static8.aStringArray1[local97] != null) {
				@Pc(140) String local140 = Static111.method2163(Static8.aStringArray1[local97]);
				if (local140 != null && local140.equals(local24)) {
					Static215.method6797(Static227.aClass202_130.method5139(Static172.anInt6352) + arg0 + Static339.aClass202_187.method5139(Static172.anInt6352));
					return;
				}
			}
		}
		if (Static111.method2163(Static266.aClass1_Sub1_Sub2_Sub1_1.aString83).equals(local24)) {
			Static215.method6797(Static165.aClass202_97.method5139(Static172.anInt6352));
		} else {
			Static93.method1721(Static232.aClass243_48);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0) + 1);
			Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
			Static381.aClass2_Sub29_Sub2_2.method5172(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method2657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
