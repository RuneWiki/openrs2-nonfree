import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_67 = new Class193();

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "Lclient!of;")
	public static final Class174 aClass174_199 = new Class174("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_68 = new Class193();

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean475 = Boolean.FALSE;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public static void method5701() {
		for (@Pc(3) int local3 = 0; local3 < Static76.aClass57ArrayArray1.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static76.aClass57ArrayArray1[local3].length; local9++) {
				Static76.aClass57ArrayArray1[local3][local9] = Static71.aClass57_1;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
	public static boolean method5702(@OriginalArg(1) int arg0) {
		if (Static359.aBooleanArray20[arg0]) {
			return true;
		} else if (Static465.aClass250_62.method5793(arg0)) {
			@Pc(32) int local32 = Static465.aClass250_62.method5815(arg0);
			if (local32 == 0) {
				Static359.aBooleanArray20[arg0] = true;
				return true;
			}
			if (Static298.aClass82ArrayArray2[arg0] == null) {
				Static298.aClass82ArrayArray2[arg0] = new Class82[local32];
			}
			for (@Pc(51) int local51 = 0; local51 < local32; local51++) {
				if (Static298.aClass82ArrayArray2[arg0][local51] == null) {
					@Pc(65) byte[] local65 = Static465.aClass250_62.method5806(arg0, local51);
					if (local65 != null) {
						@Pc(77) Class82 local77 = Static298.aClass82ArrayArray2[arg0][local51] = new Class82();
						local77.anInt2208 = local51 + (arg0 << 16);
						if (local65[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local77.method1967(new Class3_Sub25(local65));
					}
				}
			}
			Static359.aBooleanArray20[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBIII)V")
	public static void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static399.anInt2866 <= arg2 && Static372.anInt6316 >= arg2) {
			@Pc(25) int local25 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg1);
			@Pc(33) int local33 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg3);
			Static229.method3306(local33, local25, arg2, arg0);
		}
	}
}
