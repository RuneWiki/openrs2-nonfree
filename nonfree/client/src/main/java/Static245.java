import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static int anInt5054;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	public static void method4672() {
		Static288.aFont1 = null;
		Static87.anImage1 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)V")
	public static void method4673(@OriginalArg(0) int arg0) {
		Static110.aClass21_71 = new Class21(arg0);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method4674(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static153.anInt3177 = 7;
		Static66.anInt1552 = 0x1 << Static153.anInt3177;
		Static145.anInt3090 = Static66.anInt1552 >> 1;
		Static66.anInt1567 = (int) Math.sqrt((double) (Static145.anInt3090 * Static145.anInt3090 + Static145.anInt3090 * Static145.anInt3090));
		Static300.anInt5778 = arg0;
		Static354.anInt6714 = arg1;
		Static87.anInt1923 = arg2;
		Static103.aClass155ArrayArrayArray2 = new Class155[4][Static300.anInt5778][Static354.anInt6714];
		Static50.aClass36Array3 = new Class36[4];
		if (arg3) {
			Static46.aClass155ArrayArrayArray1 = new Class155[1][Static300.anInt5778][Static354.anInt6714];
			Static118.anIntArrayArray20 = new int[Static300.anInt5778][Static354.anInt6714];
			Static200.aClass36Array4 = new Class36[1];
		} else {
			Static46.aClass155ArrayArrayArray1 = null;
			Static118.anIntArrayArray20 = null;
			Static200.aClass36Array4 = null;
		}
		if (arg4) {
			Static275.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static13.aClass1_Sub5_Sub1Array1 = new Class1_Sub5_Sub1[65535];
			Static181.aBooleanArray19 = new boolean[65535];
			Static92.anInt2063 = 0;
		} else {
			Static275.aLongArrayArrayArray1 = null;
			Static13.aClass1_Sub5_Sub1Array1 = null;
			Static181.aBooleanArray19 = null;
			Static92.anInt2063 = 0;
		}
		Static263.method4798(false);
		Static92.aClass152Array1 = new Class152[500];
		Static258.anInt1131 = 0;
		Static195.aClass152Array2 = new Class152[500];
		Static46.anInt1182 = 0;
		Static45.anIntArrayArrayArray32 = new int[4][Static300.anInt5778 + 1][Static354.anInt6714 + 1];
		Static144.aClass11_Sub2Array1 = new Class11_Sub2[5000];
		Static159.anInt3269 = 0;
		Static28.aBooleanArrayArray1 = new boolean[Static87.anInt1923 + Static87.anInt1923 + 1][Static87.anInt1923 + Static87.anInt1923 + 1];
		Static75.aBooleanArrayArray5 = new boolean[Static87.anInt1923 + Static87.anInt1923 + 2][Static87.anInt1923 + Static87.anInt1923 + 2];
		Static286.aClass118_4 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!gt;ZLjava/lang/String;ZI)V")
	public static void method4675(@OriginalArg(0) Class75 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Static149.method2881(arg2, 3, arg0);
			return;
		}
		@Pc(21) String local21;
		if (Static111.aString15.startsWith("win") && Static111.anInt2479 != 3) {
			local21 = null;
			if (arg0.anApplet1 != null) {
				local21 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(41) Class121 local41 = Static149.method2881(arg2, 0, arg0);
				Static39.aString4 = arg2;
				Static108.aClass121_3 = local41;
				Static107.aClass75_2 = arg0;
				return;
			}
		}
		if (Static111.aString15.startsWith("mac")) {
			local21 = null;
			if (arg0.anApplet1 != null) {
				local21 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg3) {
				Static149.method2881(arg2, 1, arg0);
				return;
			}
		}
		Static149.method2881(arg2, 2, arg0);
	}
}
