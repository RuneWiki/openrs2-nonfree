import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array8;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array9;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "[I")
	public static final int[] anIntArray351 = new int[100];

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1729 = Static118.method2249(" GMT");

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1730 = Static118.method2249("(U4");

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1731 = Static118.method2249("labels)3dat");

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_54 = new Class87(200);

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1732 = Static118.method2249("Lade Texturen )2 ");

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1734 = Static118.method2249("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1733 = aClass65_1734;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!oc;ZI)V")
	public static void method2339(@OriginalArg(0) Class65 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1599(arg0, 250);
		@Pc(25) int local25 = Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1616(arg0, 250) * 13;
		Static194.method3096(6, 6, local18 + 4 + 4, local25 - -4 - -4, 0);
		Static194.method3095(6, 6, local18 + 4 + 4, local25 + 8, 16777215);
		Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1619(arg0, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static5.method64(6, local25 + 4 + 4, 6, local18 + 4 + 4);
		if (!arg1) {
			Static134.method2557(10, local18, 10, local25);
			return;
		}
		@Pc(117) Canvas local117 = Static36.aCanvas1;
		try {
			@Pc(120) Graphics local120 = local117.getGraphics();
			Static188.aClass37_1.method1446(local120);
		} catch (@Pc(130) Exception local130) {
			local117.repaint();
		}
	}
}
