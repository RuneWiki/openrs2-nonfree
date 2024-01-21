import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lclient!cb;")
	public static Class11[] aClass11Array2;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_7;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_8;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "Lclient!ba;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt737 = 0;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!o;")
	public static Class40 aClass40_228 = Static13.method257("To change your recovery questions:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WSet new recovery questions(W)3");

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_229 = Static13.method257("@whi@");

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Lclient!o;")
	public static Class40 aClass40_230 = Static13.method257("red:");

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	public static int anInt742 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ud;ILclient!ud;)V")
	public static void method591(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		Static72.aClass5_22 = arg0;
		Static68.aClass5_5 = arg1;
		Static103.anInt2493 = Static68.aClass5_5.method76(3);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	public static int method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) ((arg0 << 1365004144) + arg1);
		return Static90.aClass2_Sub2_Sub9_1 != null && Static90.aClass2_Sub2_Sub9_1.aLong152 == local10 ? Static29.aClass2_Sub3_2.anInt2546 * 99 / (Static29.aClass2_Sub3_2.aByteArray24.length - Static90.aClass2_Sub2_Sub9_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method593() {
		aClass11Array2 = null;
		aClass2_Sub2_Sub2_Sub3_7 = null;
		aClass6_1 = null;
		aClass40_229 = null;
		anIntArrayArrayArray3 = null;
		aClass40_230 = null;
		aClass2_Sub2_Sub2_Sub3_8 = null;
		aClass40_228 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;)V")
	public static void method594(@OriginalArg(1) Graphics arg0) {
		Static12.aClass45_6.method1474(arg0, 550, 4);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method595() {
		Static68.method335(false, null, 0, 10);
	}
}
