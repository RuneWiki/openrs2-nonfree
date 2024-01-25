import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!ij;")
	public static Class93 aClass93_72;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!ea;")
	public static Class55 aClass55_8;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	public static int anInt3700 = 0;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "[Lclient!in;")
	public static final Class5_Sub1_Sub9[] aClass5_Sub1_Sub9Array3 = new Class5_Sub1_Sub9[14];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BC)C")
	public static char method3347(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIFIIIZII)[[I")
	public static int[][] method3348(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub3_Sub35 local13 = new Class5_Sub3_Sub35();
		local13.anInt6337 = (int) (arg0 * 4096.0F);
		local13.anInt6332 = 3;
		local13.aBoolean528 = false;
		local13.anInt6331 = 4;
		local13.anInt6328 = 8;
		local13.method6010();
		Static230.method4145(256, 64);
		for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
			local13.method5658(local9[local56], local56);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V")
	public static void method3349() {
		@Pc(1) Class109 local1 = Static72.aClass109_19;
		synchronized (Static72.aClass109_19) {
			Static72.aClass109_19.method2859(5);
		}
	}
}
