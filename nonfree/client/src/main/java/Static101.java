import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!nf;")
	public static Class56 aClass56_65;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray89;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_1143 = Static41.method597("<col=40ff00>");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_1144 = Static41.method597(")4l");

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_1145 = Static41.method597("null");

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method1990() {
		aClass60_1145 = null;
		aClass60_1143 = null;
		aClass56_65 = null;
		anIntArrayArray89 = null;
		aClass60_1144 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZLclient!od;)V")
	public static void method1991(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(22) int local22 = Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6.method1220(arg1, 250);
		@Pc(33) int local33 = Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6.method1215(arg1, 250) * 13;
		Static34.method1649(6, 6, local22 + 4 + 4, local33 + 4 + 4, 0);
		Static34.method1650(6, 6, local22 + 4 + 4, local33 + 4 + 4, 16777215);
		Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6.method1210(arg1, 10, 10, local22, local33, 16777215, -1, 1, 1, 0);
		Static97.method1576(6, local33 + 4 + 4, 4 + 4 + local22, 6);
		if (!arg0) {
			Static90.method1470(local33, 10, local22, 10);
			return;
		}
		try {
			@Pc(118) Graphics local118 = Static110.aCanvas1.getGraphics();
			Static86.aClass14_1.method690(local118);
		} catch (@Pc(126) Exception local126) {
			Static110.aCanvas1.repaint();
		}
	}
}
