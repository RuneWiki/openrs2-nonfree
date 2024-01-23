import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!le", name = "w", descriptor = "I")
	public static int anInt2671;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "I")
	public static int anInt2672;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "Lclient!jb;")
	public static Class28 aClass28_49;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!le", name = "A", descriptor = "Lclient!sc;")
	public static Class107 aClass107_725 = Static231.method3737("mapflag");

	@OriginalMember(owner = "client!le", name = "B", descriptor = "Lclient!sc;")
	public static Class107 aClass107_726 = Static231.method3737("Lade Texturen )2 ");

	@OriginalMember(owner = "client!le", name = "C", descriptor = "I")
	public static int anInt2673 = -1;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	public static int anInt2676 = 0;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "Lclient!jd;")
	public static Class61 aClass61_51 = new Class61(30);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIZIZ)Lclient!dg;")
	public static Class28_Sub1 method2084(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class73 local1 = null;
		if (Static161.aClass13_5 != null) {
			local1 = new Class73(arg2, Static161.aClass13_5, Static159.aClass13Array1[arg2], 1000000);
		}
		return new Class28_Sub1(local1, Static66.aClass73_4, arg2, arg3, arg0, arg1);
	}
}
