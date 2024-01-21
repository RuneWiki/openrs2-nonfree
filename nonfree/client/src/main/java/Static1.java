import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public static int anInt5;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public static int anInt6 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static final int anInt9 = 3353893;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public static int anInt10 = 0;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1 = Static14.method2017("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
	public static int[] anIntArray2 = new int[128];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method1() {
		aClass36_1 = null;
		anIntArray1 = null;
		aClass2_Sub1_Sub1_Sub3_1 = null;
		anIntArray2 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method4() {
		try {
			@Pc(10) Graphics local10 = Static107.aCanvas1.getGraphics();
			Static94.aClass14_29.method1470(550, local10, 4);
		} catch (@Pc(18) Exception local18) {
			Static107.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!c;IBZ)Z")
	public static boolean method7(@OriginalArg(0) Class11 arg0, @OriginalArg(3) boolean arg1) {
		return Static61.method1114(arg1, arg0);
	}
}
