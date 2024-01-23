import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public static int anInt3729;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1015 = Static231.method3737("Fallen lassen");

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "[Lclient!qh;")
	public static Class99[] aClass99Array3 = new Class99[100];

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "[I")
	public static int[] anIntArray330 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZIZILclient!jb;)V")
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class28 arg2) {
		Static16.aClass28_7 = arg2;
		Static114.anInt2517 = 0;
		Static105.anInt2303 = arg1;
		Static125.anInt2704 = arg0;
		Static97.aBoolean190 = false;
		Static37.anInt766 = 10000;
		Static116.anInt2569 = 1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILclient!sc;)V")
	public static void method2741(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class107 arg1) {
		@Pc(19) int local19 = Static23.aClass1_Sub2_Sub15_1.method3349(arg1, 250);
		@Pc(26) int local26 = Static23.aClass1_Sub2_Sub15_1.method3337(arg1, 250) * 13;
		Static205.method3250(6, 6, local19 + 4 + 4, local26 + 4 - -4, 0);
		Static205.method3249(6, 6, local19 + 4 + 4, local26 + 4 + 4, 16777215);
		Static23.aClass1_Sub2_Sub15_1.method3335(arg1, 10, 10, local19, local26, 16777215, -1, 1, 1, 0);
		Static5.method224(local19 + 4 + 4, 6, 6, local26 + 4 + 4);
		if (!arg0) {
			Static101.method1698(10, 10, local19, local26);
			return;
		}
		try {
			@Pc(113) Graphics local113 = Static203.aCanvas3.getGraphics();
			Static42.aClass23_1.method2205(local113);
		} catch (@Pc(121) Exception local121) {
			Static203.aCanvas3.repaint();
		}
	}
}
