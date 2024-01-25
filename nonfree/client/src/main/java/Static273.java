import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public static int anInt4870;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
	public static int anInt4871;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
	public static int anInt4873;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
	public static int anInt4877;

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray134 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "[I")
	public static final int[] anIntArray393 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	public static int anInt4878 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	public static void method3955() {
		Static102.aClass163_1.method3806();
		Static16.aClass228_1.method5475();
		if (Static153.aClass118_2 != null) {
			Static153.aClass118_2.method4489(Static299.aCanvas5);
		}
		Static185.aClient1.method910();
		Static299.aCanvas5.setBackground(Color.black);
		Static427.anInt7384 = -1;
		Static102.aClass163_1 = Static30.method498(Static299.aCanvas5);
		Static16.aClass228_1 = Static2.method155(Static299.aCanvas5);
		if (Static153.aClass118_2 != null) {
			Static153.aClass118_2.method4490(Static299.aCanvas5);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZBIII)Lclient!qk;")
	public static Class1_Sub36 method3956(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub36 local12 = new Class1_Sub36();
		local12.anInt5680 = arg2;
		local12.anInt5679 = arg3;
		Static445.aClass27_42.method564((long) arg1, local12);
		Static15.method2739(arg2);
		@Pc(31) Class219 local31 = Static103.method1572(arg1);
		if (local31 != null) {
			Static355.method4895(local31);
		}
		if (Static419.aClass219_18 != null) {
			Static355.method4895(Static419.aClass219_18);
			Static419.aClass219_18 = null;
		}
		Static42.method689();
		if (local31 != null) {
			Static251.method3698(!arg0, local31);
		}
		if (!arg0) {
			Static104.method1597(arg2);
		}
		if (!arg0 && anInt4878 != -1) {
			Static313.method4475(1, anInt4878);
		}
		return local12;
	}
}
