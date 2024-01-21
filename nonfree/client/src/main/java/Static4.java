import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt4608;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[[Lclient!vc;")
	public static Class98[][] aClass98ArrayArray3;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1305 = Static81.method1507("Username: ");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1303 = aClass24_1305;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
	public static final int[] anIntArray408 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1304 = Static81.method1507("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
	public static final int[] anIntArray409 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	public static int anInt4611 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method3513() {
		for (@Pc(15) int local15 = 0; local15 < Static138.anInt3107; local15++) {
			@Pc(21) int local21 = Static138.anIntArray254[local15];
			@Pc(25) Class5_Sub2_Sub2 local25 = Static148.aClass5_Sub2_Sub2Array1[local21];
			if (local25 != null) {
				Static93.method1682(local25.aClass1_Sub2_Sub21_1.anInt3966, local25);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method3514() {
		Static67.aClass86_22.method2817();
	}
}
