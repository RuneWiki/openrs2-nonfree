import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!bc;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_61 = Static120.method1824("FULL");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_60 = aClass80_61;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!af;")
	public static final Class5 aClass5_3 = new Class5(500);

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
	public static final int[] anIntArray34 = new int[256];

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_62 = Static120.method1824(" <col=ffff00>");

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public static int anInt247 = 0;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_63 = Static120.method1824("");

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_64 = Static120.method1824("Fallen lassen");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
	public static int method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static167.method2701(arg1 + 45365, 4, arg0 + 91923) + (Static167.method2701(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static167.method2701(arg1, 1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
