import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_78 = new Class202("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_33 = new Class243(44, 3);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Z")
	public static boolean method2417(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!no;)V")
	public static void method2419(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub29_Sub2 arg1) {
		Static426.aBoolean578 = false;
		Static394.anInt7461 = 0;
		Static25.method1661(arg1);
		Static40.method7057(arg1);
		if (Static426.aBoolean578) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt6132 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt6132 + " psize:" + arg0);
		}
	}
}
