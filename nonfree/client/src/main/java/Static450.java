import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "[Lclient!uj;")
	public static final Class3_Sub3_Sub6_Sub2[] aClass3_Sub3_Sub6_Sub2Array1 = new Class3_Sub3_Sub6_Sub2[32768];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!tq;)Ljava/lang/String;")
	public static String method5986(@OriginalArg(0) int arg0, @OriginalArg(2) Class239 arg1) {
		if (!Static54.method1017(arg1).method4840(arg0) && arg1.anObjectArray21 == null) {
			return null;
		} else if (arg1.aStringArray45 == null || arg1.aStringArray45.length <= arg0 || arg1.aStringArray45[arg0] == null || arg1.aStringArray45[arg0].trim().length() == 0) {
			return Static268.aBoolean330 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray45[arg0];
		}
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	public static void method5987() {
		Static315.method3815((long) Static125.anInt2225, Static44.aClass28_14);
		if (Static313.anInt5099 != -1) {
			Static59.method1102(Static313.anInt5099);
		}
		for (@Pc(18) int local18 = 0; local18 < Static299.anInt4962; local18++) {
			if (Static194.aBooleanArray25[local18]) {
				Static298.aBooleanArray21[local18] = true;
			}
			Static73.aBooleanArray10[local18] = Static194.aBooleanArray25[local18];
			Static194.aBooleanArray25[local18] = false;
		}
		Static272.anInt4644 = Static125.anInt2225;
		if (Static44.aClass28_14.method3481()) {
			Static185.aBoolean348 = true;
		}
		if (Static313.anInt5099 != -1) {
			Static299.anInt4962 = 0;
			Static10.method5376();
		}
		Static44.aClass28_14.method3554();
		Static151.method2482(Static415.anInt6946);
		Static338.anInt5679 = 0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!qq;)V")
	public static void method5988(@OriginalArg(1) Class28 arg0) {
		if (Static251.aClass88_35.method1880() == 0) {
			return;
		}
		@Pc(22) Class6_Sub40 local22;
		if (Static155.anInt2774 == 0) {
			for (local22 = (Class6_Sub40) Static251.aClass88_35.method1882(); local22 != null; local22 = (Class6_Sub40) Static251.aClass88_35.method1891()) {
				Static354.aClass170_2.method3869(local22.aBoolean447 ? Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 : null, local22.anInt6598, local22.anInt6595, local22.anInt6600, Static120.aClass92_3, local22.anInt6599, false, local22.anInt6597, false, arg0, arg0);
				local22.method5977();
			}
			Static207.method3239();
			return;
		}
		if (Static412.aClass28_121 == null) {
			@Pc(69) Canvas local69 = new Canvas();
			local69.setSize(36, 32);
			Static412.aClass28_121 = Static333.method3577(0, 0, Static265.anInterface11_7, Static165.aClass103_3, local69);
			Static430.aClass92_4 = Static412.aClass28_121.method3476(Static150.method2471(Static241.aClass158_55, Static77.anInt1540), Static455.method1708(Static76.aClass158_17, Static77.anInt1540));
		}
		for (local22 = (Class6_Sub40) Static251.aClass88_35.method1882(); local22 != null; local22 = (Class6_Sub40) Static251.aClass88_35.method1891()) {
			Static354.aClass170_2.method3869(local22.aBoolean447 ? Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 : null, local22.anInt6598, local22.anInt6595, local22.anInt6600, Static430.aClass92_4, local22.anInt6599, false, local22.anInt6597, false, arg0, Static412.aClass28_121);
			local22.method5977();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)Z")
	public static boolean method5989(@OriginalArg(1) int arg0) {
		return arg0 == 18 || arg0 == 48 || arg0 == 1007 || arg0 == 15 || arg0 == 3;
	}
}
