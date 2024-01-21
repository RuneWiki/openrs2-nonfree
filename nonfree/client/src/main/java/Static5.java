import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
	public static int anInt88;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_2;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!vb;")
	public static Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public static int anInt84 = 0;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
	public static int anInt87 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "[I")
	public static int[] anIntArray2 = new int[1000];

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!ai;")
	public static Class6 aClass6_45 = Static38.method685(" ");

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	public static int anInt90 = 0;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method56() {
		for (@Pc(6) Class2_Sub21 local6 = (Class2_Sub21) Static131.aClass84_11.method2694(); local6 != null; local6 = (Class2_Sub21) Static131.aClass84_11.method2697()) {
			if (local6.aClass2_Sub10_Sub1_2 != null) {
				Static109.aClass2_Sub10_Sub4_12.method2747(local6.aClass2_Sub10_Sub1_2);
				local6.aClass2_Sub10_Sub1_2 = null;
			}
			if (local6.aClass2_Sub10_Sub1_3 != null) {
				Static109.aClass2_Sub10_Sub4_12.method2747(local6.aClass2_Sub10_Sub1_3);
				local6.aClass2_Sub10_Sub1_3 = null;
			}
		}
		Static131.aClass84_11.method2695();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public static void method57() {
		aClass84_1 = null;
		aClass6_45 = null;
		aClass10_Sub1_2 = null;
		aClass6Array1 = null;
		anIntArray2 = null;
	}
}
