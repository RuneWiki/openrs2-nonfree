import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!rt", name = "C", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "[I")
	public static final int[] anIntArray500 = new int[1000];

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_164 = new Class208(19, 7);

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
	public static final int anInt5704 = 328;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
	public static int anInt5705 = 0;

	@OriginalMember(owner = "client!rt", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method5047(@OriginalArg(0) Class83 arg0) {
		Static47.anInt762 = arg0.method1961("p11_full");
		Static107.anInt2387 = arg0.method1961("p12_full");
		Static291.anInt5451 = arg0.method1961("b12_full");
		Static54.anInt1177 = arg0.method1961("hitmarks");
		Static134.anInt2939 = arg0.method1961("hitbar_default");
		Static184.anInt3902 = arg0.method1961("timerbar_default");
		Static384.anInt6971 = arg0.method1961("headicons_pk");
		Static327.anInt6034 = arg0.method1961("headicons_prayer");
		Static333.anInt6167 = arg0.method1961("hint_headicons");
		Static276.anInt7136 = arg0.method1961("hint_mapmarkers");
		Static132.anInt2871 = arg0.method1961("mapflag");
		Static359.anInt6584 = arg0.method1961("cross");
		Static64.anInt1443 = arg0.method1961("mapdots");
		Static185.anInt3926 = arg0.method1961("scrollbar");
		Static167.anInt3450 = arg0.method1961("name_icons");
		Static353.anInt6489 = arg0.method1961("floorshadows");
		Static358.anInt6525 = arg0.method1961("compass");
		Static303.anInt7069 = arg0.method1961("otherlevel");
		Static109.anInt2441 = arg0.method1961("hint_mapedge");
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method5048(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0];
		@Pc(13) int local13 = Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0];
		if (local8 < 0 || local8 >= Static89.anInt1891 || local13 < 0 || local13 >= Static85.anInt1839) {
			return false;
		} else if (arg3 >= 0 && Static89.anInt1891 > arg3 && arg6 >= 0 && Static85.anInt1839 > arg6) {
			@Pc(69) int local69 = Static40.method572(Static165.aClass178Array1[Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73], arg0, arg7, arg4, arg2, local13, arg3, local8, arg1, Static182.aClass1_Sub2_Sub1_Sub1_1.method4792(), arg5, Static132.anIntArray219, arg6, Static365.anIntArray570);
			if (local69 < 1) {
				return false;
			}
			Static391.anInt7123 = Static132.anIntArray219[local69 - 1];
			Static280.anInt5248 = Static365.anIntArray570[local69 - 1];
			Static177.aBoolean270 = false;
			Static180.method3302();
			return true;
		} else {
			return false;
		}
	}
}
