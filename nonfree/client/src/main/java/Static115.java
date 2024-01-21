import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_15;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "[Lclient!nb;")
	public static Class2_Sub16[] aClass2_Sub16Array1;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
	public static int anInt2641 = 0;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "Lclient!je;")
	public static Class40 aClass40_1443 = Static69.method1231("(U1");

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "Lclient!je;")
	private static Class40 aClass40_1445 = Static69.method1231("slide:");

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "Lclient!je;")
	public static Class40 aClass40_1444 = aClass40_1445;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
	public static int anInt2645 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1446 = aClass40_1445;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
	public static void method1904() {
		Static75.aClass55_54.method1413();
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method1905() {
		aClass40_1444 = null;
		aClass2_Sub13_15 = null;
		aClass40_1445 = null;
		aClass40_1446 = null;
		aClass40_1443 = null;
		anIntArray302 = null;
		aClass2_Sub16Array1 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!je;")
	public static Class40 method1906(@OriginalArg(0) int arg0) {
		@Pc(12) Class40 local12 = new Class40();
		local12.aByteArray18 = new byte[arg0];
		local12.anInt1425 = 0;
		return local12;
	}
}
