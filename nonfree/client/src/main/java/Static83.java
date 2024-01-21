import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!o", name = "Jb", descriptor = "Lclient!mc;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!o", name = "Nb", descriptor = "Lclient!l;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!o", name = "Qb", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_43;

	@OriginalMember(owner = "client!o", name = "Sb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!o", name = "Lb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1064 = Static28.method504("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!o", name = "Mb", descriptor = "Lclient!c;")
	public static Class12 aClass12_56 = new Class12(64);

	@OriginalMember(owner = "client!o", name = "Pb", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!o", name = "Rb", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!o", name = "Tb", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!o", name = "Vb", descriptor = "I")
	public static int anInt2078 = 0;

	@OriginalMember(owner = "client!o", name = "Xb", descriptor = "[Lclient!id;")
	public static Class38[] aClass38Array1 = new Class38[16];

	@OriginalMember(owner = "client!o", name = "dc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1065 = Static28.method504("lila:");

	@OriginalMember(owner = "client!o", name = "gc", descriptor = "I")
	public static int anInt2086 = 0;

	@OriginalMember(owner = "client!o", name = "hc", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "(I)V")
	public static void method1496() {
		aClass38Array1 = null;
		aFontMetrics1 = null;
		aClass39_1065 = null;
		aClass39_1064 = null;
		aClass47_1 = null;
		aClass12_56 = null;
		aClass4_Sub5_43 = null;
		aClass52_1 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)I")
	public static int method1497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)I")
	public static int method1498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(22) int local22 = method1498(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local22 *= arg1;
			}
			return local22;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}
}
