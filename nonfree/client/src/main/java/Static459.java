import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "Lclient!nk;")
	public static Class170 aClass170_4;

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_137 = new Class55("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "[I")
	public static final int[] anIntArray590 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_103 = new Class2(16, 18);

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_38 = new Class85();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(ILclient!ga;ILjava/awt/Canvas;Lclient!ec;I)Lclient!ya;")
	public static synchronized Class51 method5294(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class61 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static224.aBooleanArray30[local14]) {
				local7 = local14;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(46) Class51 local46;
		if (arg0 == 0) {
			local46 = Static67.method1135(arg2, local7, arg1);
		} else if (arg0 == 1) {
			local46 = Static410.method5152(arg2, local7, arg3, arg4, arg1);
		} else if (arg0 == 2) {
			local46 = Static140.method800(arg2, arg1, arg3, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static224.aBooleanArray30[local7] = true;
		return local46;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)Z")
	public static boolean method5312(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(ZI)V")
	public static void method5332(@OriginalArg(1) int arg0) {
		if (Static252.method3355(arg0)) {
			Static240.method3262(Static294.aClass95ArrayArray3[arg0], -1);
		}
	}
}
