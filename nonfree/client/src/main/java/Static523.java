import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!sha", name = "p", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_156 = new Class73(100, 6);

	@OriginalMember(owner = "client!sha", name = "r", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBIIII)V")
	public static void method7452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static87.aClass6_Sub33_6.aClass14_Sub22_3.method7288() != 0 && arg2 != 0 && Static530.anInt9223 < 50 && arg1 != -1) {
			Static433.aClass343Array1[Static530.anInt9223++] = new Class343((byte) 1, arg1, arg2, arg3, arg4, 0, arg0, (Class9_Sub4) null);
		}
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	public static void method7455() {
		if (Static208.aClass159_3 == null) {
			return;
		}
		if (Static208.aClass159_3.anInt5910 == 1) {
			Static208.aClass159_3 = null;
			return;
		}
		if (Static208.aClass159_3.anInt5910 == 2) {
			Static516.method7390(Static66.aString14, Static618.aClass104_6, 2);
			Static208.aClass159_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(I)V")
	public static void method7457() {
		for (@Pc(11) Class6_Sub39 local11 = (Class6_Sub39) Static475.aClass380_36.method8755(); local11 != null; local11 = (Class6_Sub39) Static475.aClass380_36.method8752()) {
			Static122.method2609(local11.anInt7975);
		}
	}

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "(I)V")
	public static void method7458() {
		Static545.aClient1.method2115();
		Static102.method2421();
		Static96.anInt2770 = 0;
		Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
		Static85.anInt2620 = 0;
		Static340.aClass73_118 = null;
		Static321.aClass73_107 = null;
		Static461.aClass73_148 = null;
		Static354.method5747();
		Static544.anInt9412 = 0;
		Static292.aString67 = null;
		Static638.aClass162Array1 = null;
		Static310.anInt1851 = 0;
		Static67.anInt2305 = 0;
	}
}
