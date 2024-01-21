import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "Lclient!oa;")
	public static Class7 aClass7_78;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
	public static int anInt2556;

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1251 = Static38.method736("Loading fonts )2 ");

	@OriginalMember(owner = "client!td", name = "P", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1250 = aClass71_1251;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
	public static int anInt2550 = 0;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1252 = Static38.method736("m");

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1253 = Static38.method736("Neuer Benutzer");

	@OriginalMember(owner = "client!td", name = "Db", descriptor = "I")
	public static int anInt2563 = 0;

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "[I")
	public static int[] anIntArray270 = new int[50];

	@OriginalMember(owner = "client!td", name = "Kb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1254 = Static38.method736("Enter name of friend to add to list");

	@OriginalMember(owner = "client!td", name = "Mb", descriptor = "I")
	public static int anInt2567 = 0;

	@OriginalMember(owner = "client!td", name = "Xb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1256 = aClass71_1254;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public static void method1706() {
		aClass71_1253 = null;
		aClass71_1252 = null;
		aClass71_1254 = null;
		aClass71_1251 = null;
		aFontMetrics1 = null;
		anIntArray270 = null;
		aClass71_1256 = null;
		aClass71_1250 = null;
		aClass7_78 = null;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(B)V")
	public static void method1709() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static37.anInt594; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static116.anIntArray285[local3];
			}
			@Pc(20) Class5_Sub1_Sub1_Sub3_Sub2 local20 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local12];
			if (local20 != null && local20.anInt2462 > 0) {
				local20.anInt2462--;
				if (local20.anInt2462 == 0) {
					local20.aClass71_1229 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static90.anInt3005; local12++) {
			@Pc(57) int local57 = Static61.anIntArray175[local12];
			@Pc(61) Class5_Sub1_Sub1_Sub3_Sub1 local61 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local57];
			if (local61 != null && local61.anInt2462 > 0) {
				local61.anInt2462--;
				if (local61.anInt2462 == 0) {
					local61.aClass71_1229 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public static void method1714() {
		Static18.aClass52_4 = new Class52();
	}
}
