import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_172 = Static200.method3116("settings");

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!kh;")
	public static Class60 aClass60_173 = Static200.method3116("; Max)2Age=");

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_174 = Static200.method3116("AUS");

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_175 = Static200.method3116("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "[I")
	public static int[] anIntArray88 = new int[4096];

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!kh;")
	public static Class60 aClass60_176 = Static200.method3116("<col=ffff00>*V");

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!kh;")
	public static Class60 aClass60_177 = Static200.method3116("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ah;II)Lclient!kh;")
	public static Class60 method374(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		if (!Static173.method2790(Static166.method2717(arg0), arg1) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aClass60Array3 == null || arg0.aClass60Array3.length <= arg1 || arg0.aClass60Array3[arg1] == null || arg0.aClass60Array3[arg1].method1814().method1835() == 0) {
			return Static94.aBoolean118 ? Static34.method611(new Class60[] { Static11.aClass60_1650, Static40.method681(arg1) }) : null;
		} else {
			return arg0.aClass60Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ai;II)Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 method375(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		return Static64.method1157(arg0, arg1) ? Static92.method1614() : null;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)I")
	public static int method376() {
		return Static115.anInt2624;
	}
}
