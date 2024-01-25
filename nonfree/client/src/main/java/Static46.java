import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
	public static int anInt1502;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!wo;")
	public static Class216 aClass216_11;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!ph;")
	public static Class162 aClass162_2 = null;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
	public static final int[] anIntArray117 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	public static int anInt1504 = -1;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_34 = new Class34("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
	public static int anInt1508 = 0;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public static void method1281() {
		Static238.aClass197_23.method5155();
		Static218.aClass197_21.method5155();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
	public static void method1282() {
		if (Static127.aClass162_4 == null) {
			return;
		}
		if (Static127.aClass162_4.anInt4801 == 1) {
			Static127.aClass162_4 = null;
			return;
		}
		if (Static127.aClass162_4.anInt4801 == 2) {
			Static75.method1720(Static157.aString51, 2, Static20.aClass143_2);
			Static127.aClass162_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V")
	public static void method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 7);
		local8.method1869();
		local8.anInt2142 = arg1;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)V")
	public static void method1286() {
		Static28.aClass87_6.method2473(5);
	}
}
