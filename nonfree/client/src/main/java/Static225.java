import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Lclient!o;")
	public static final Class169 aClass169_210 = new Class169("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "[I")
	public static final int[] anIntArray493 = new int[4096];

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_100 = new Class211(44, -1);

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_101 = new Class211(46, 12);

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "[Lclient!bg;")
	public static final Class25_Sub1_Sub1_Sub1[] aClass25_Sub1_Sub1_Sub1Array3 = new Class25_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!ui;)I")
	public static int method3185(@OriginalArg(1) Class230 arg0) {
		@Pc(9) int local9 = 0;
		if (arg0.method4966(Static386.anInt6288)) {
			local9++;
		}
		if (arg0.method4966(Static187.anInt3284)) {
			local9++;
		}
		return local9;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)V")
	public static void method3186(@OriginalArg(0) long arg0) {
		if (Static25.aClass132ArrayArrayArray1 != null) {
			if (Static323.anInt5463 == 1 || Static323.anInt5463 == 5) {
				Static394.method5589(arg0);
			} else if (Static323.anInt5463 == 4) {
				Static328.method4756(arg0);
			}
		}
		Static313.method4638(Static66.aClass164_2, (long) Static366.anInt5883);
		if (Static352.anInt5753 != -1) {
			Static173.method2547(Static352.anInt5753);
		}
		for (@Pc(38) int local38 = 0; local38 < Static75.anInt1459; local38++) {
			if (Static96.aBooleanArray9[local38]) {
				Static277.aBooleanArray26[local38] = true;
			}
			Static227.aBooleanArray23[local38] = Static96.aBooleanArray9[local38];
			Static96.aBooleanArray9[local38] = false;
		}
		Static239.anInt4002 = Static366.anInt5883;
		if (Static66.aClass164_2.method5369()) {
			Static17.aBoolean28 = true;
		}
		if (Static352.anInt5753 != -1) {
			Static75.anInt1459 = 0;
			Static136.method5481();
		}
		Static66.aClass164_2.method5306();
		Static334.method4796(Static66.aClass164_2);
		@Pc(92) int local92 = Static50.method812();
		if (local92 == -1) {
			local92 = Static157.anInt2870;
		}
		Static310.method4627(local92);
		Static295.method4456(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077, Static109.anInt1911, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70);
		Static109.anInt1911 = 0;
	}
}
