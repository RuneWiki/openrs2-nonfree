import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "[Lclient!qa;")
	public static final Class67_Sub3_Sub3_Sub2[] aClass67_Sub3_Sub3_Sub2Array1 = new Class67_Sub3_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
	public static int anInt1971 = 2;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)Z")
	public static boolean method1609(@OriginalArg(0) int arg0) {
		@Pc(7) Class157_Sub1 local7 = Static61.method915(arg0);
		if (local7 == null) {
			return false;
		} else if (Static167.anInt3322 == 3) {
			@Pc(39) String local39 = "";
			if (Static278.anInt6305 != 0) {
				local39 = ":" + (local7.anInt4799 + 7000);
			}
			@Pc(54) String local54 = "";
			if (Static239.aString46 != null) {
				local54 = "/p=" + Static239.aString46;
			}
			@Pc(108) String local108 = "http://" + local7.aString45 + local39 + "/l=" + Static230.anInt4634 + "/a=" + Static96.anInt1755 + local54 + "/j" + (Static67.aBoolean77 ? "1" : "0") + ",o" + (Static54.aBoolean64 ? "1" : "0") + ",a2";
			try {
				Static210.aClient1.getAppletContext().showDocument(new URL(local108), "_self");
				return true;
			} catch (@Pc(118) Exception local118) {
				return false;
			}
		} else {
			Static342.aString65 = local7.aString45;
			Static155.anInt2961 = local7.anInt4799;
			if (Static278.anInt6305 != 0) {
				Static201.anInt6769 = Static155.anInt2961 + 40000;
				Static156.anInt2981 = Static155.anInt2961 + 50000;
				Static11.anInt233 = Static201.anInt6769;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
	public static void method1610() {
		Static262.anInt5355 = 0;
		Static90.anInt4650 = 0;
		Static292.method4858();
		Static253.method4421();
		Static75.method1144();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static262.anInt5355; local22++) {
			local28 = Static223.anIntArray344[local22];
			if (Static293.anInt5807 != Static356.aClass67_Sub3_Sub3_Sub1Array1[local28].anInt5010) {
				if (Static356.aClass67_Sub3_Sub3_Sub1Array1[local28].aClass82_1.method1563()) {
					Static168.method2725(Static356.aClass67_Sub3_Sub3_Sub1Array1[local28]);
				}
				Static356.aClass67_Sub3_Sub3_Sub1Array1[local28].method2677(null);
				Static356.aClass67_Sub3_Sub3_Sub1Array1[local28] = null;
			}
		}
		if (Static315.anInt6163 != Static246.aClass11_Sub25_Sub1_3.anInt6076) {
			throw new RuntimeException("gnp1 pos:" + Static246.aClass11_Sub25_Sub1_3.anInt6076 + " psize:" + Static315.anInt6163);
		}
		for (local28 = 0; local28 < Static141.anInt2601; local28++) {
			if (Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static141.anInt2601);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1612(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static117.method1775(arg1, arg2, 0, arg4, arg3, arg0);
	}
}
