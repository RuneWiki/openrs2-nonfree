import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!jb;")
	public static Class28 aClass28_30;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_472 = Static231.method3737("overlay2");

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_473 = Static231.method3737("Texturen geladen)3");

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!sc;")
	private static Class107 aClass107_475 = Static231.method3737("Allocated memory");

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_474 = aClass107_475;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
	public static int[] anIntArray151 = new int[256];

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!sc;")
	public static Class107 aClass107_476 = Static231.method3737("details");

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[I")
	public static int[] anIntArray152 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "Lclient!sc;")
	public static Class107 aClass107_477 = Static231.method3737("document)3cookie=(R");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!jb;ILclient!jb;)I")
	public static int method1288(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method824(Static69.anInt1579)) {
			local5++;
		}
		if (arg1.method824(Static2.anInt115)) {
			local5++;
		}
		if (arg1.method824(Static59.anInt1433)) {
			local5++;
		}
		if (arg0.method824(Static69.anInt1579)) {
			local5++;
		}
		if (arg0.method824(Static2.anInt115)) {
			local5++;
		}
		if (arg0.method824(Static59.anInt1433)) {
			local5++;
		}
		return local5;
	}
}
