import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gv", name = "N", descriptor = "Lclient!ke;")
	public static Class141 aClass141_2;

	@OriginalMember(owner = "client!gv", name = "Q", descriptor = "Z")
	private static boolean aBoolean112;

	@OriginalMember(owner = "client!gv", name = "R", descriptor = "Z")
	private static boolean aBoolean113;

	@OriginalMember(owner = "client!gv", name = "S", descriptor = "I")
	private static int anInt1395;

	@OriginalMember(owner = "client!gv", name = "T", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
	public static final int anInt1372 = 2;

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_66 = new Class123(83, 8);

	@OriginalMember(owner = "client!gv", name = "M", descriptor = "[I")
	public static final int[] anIntArray85 = new int[100];

	@OriginalMember(owner = "client!gv", name = "O", descriptor = "I")
	public static int anInt1394 = 0;

	@OriginalMember(owner = "client!gv", name = "providesignlink", descriptor = "(Lclient!qn;)V")
	private static void method1118(@OriginalArg(0) Class209 arg0) {
		Static45.aClass209_127 = arg0;
		Static148.aClass209_47 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLclient!ts;B)V")
	public static void method1120(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class239 arg1) {
		@Pc(12) int local12 = arg1.anInt6890 == 0 ? arg1.anInt6898 : arg1.anInt6890;
		@Pc(21) int local21 = arg1.anInt6941 == 0 ? arg1.anInt6899 : arg1.anInt6941;
		Static399.method5884(local21, arg0, local12, Static35.aClass239ArrayArray1[arg1.anInt6908 >> 16], arg1.anInt6908);
		if (arg1.aClass239Array2 != null) {
			Static399.method5884(local21, arg0, local12, arg1.aClass239Array2, arg1.anInt6908);
		}
		@Pc(54) Class6_Sub9 local54 = (Class6_Sub9) Static432.aClass74_33.method1883((long) arg1.anInt6908);
		if (local54 != null) {
			Static93.method1656(arg0, local21, local12, local54.anInt1505);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLclient!he;)V")
	public static void method1123(@OriginalArg(1) Class100 arg0) {
		Static225.anInt4063 = 0;
		Static82.anInt5145 = 0;
		Static4.aClass111_9 = new Class111();
		Static182.aClass57_Sub1_Sub1_Sub1Array1 = new Class57_Sub1_Sub1_Sub1[1024];
		Static138.method3848(arg0);
		Static337.method4903(arg0);
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	public static void method1124() {
		Static252.aClass44_35.method1351();
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)V")
	public static void method1127() {
		if (Static352.aClass2_2 != null) {
			Static352.aClass2_2.method355();
		}
		if (Static116.aClass2_1 != null) {
			Static116.aClass2_1.method355();
		}
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)Z")
	public static boolean method1131() {
		@Pc(8) Class6_Sub40 local8 = (Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251;
		if (local8 == null || Static292.aClass244_25.aClass6_220 == local8) {
			return false;
		} else {
			if (local8.anInt6722 >= 2000) {
				local8.anInt6722 -= 2000;
			}
			return local8.anInt6722 == 1011;
		}
	}
}
