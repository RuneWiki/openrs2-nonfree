import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!wfa;")
	public static Class6_Sub19_Sub4 aClass6_Sub19_Sub4_8;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray42;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt8692 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7074(@OriginalArg(0) String arg0) {
		if (Static316.aStringArray22 == null) {
			Static61.method778();
		}
		@Pc(14) String[] local14 = Static128.method1936(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			for (@Pc(26) int local26 = Static444.anInt7729; local26 > 0; local26--) {
				Static316.aStringArray22[local26] = Static316.aStringArray22[local26 - 1];
			}
			Static316.aStringArray22[0] = local14[local22];
			if (Static444.anInt7729 < Static316.aStringArray22.length - 1) {
				if (Static537.anInt9110 > 0) {
					Static537.anInt9110++;
				}
				Static444.anInt7729++;
			}
		}
	}
}
