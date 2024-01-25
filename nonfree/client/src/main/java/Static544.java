import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "[Lclient!ng;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public static int anInt9409;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_172 = new Class133(46, -2);

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_153 = new Class67("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIZIFII)[[I")
	public static int[][] method7770(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub1_Sub38 local13 = new Class3_Sub1_Sub38();
		local13.anInt9308 = 4;
		local13.anInt9300 = 3;
		local13.anInt9303 = (int) (arg0 * 4096.0F);
		local13.anInt9307 = 8;
		local13.aBoolean681 = false;
		local13.method7786();
		Static166.method5704(64, 256);
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			local13.method7692(local9[local44], local44);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void method7772() {
		Static79.anInt1678 = 0;
		Static401.anInt7421 = 0;
		Static319.anInt6148 = 0;
		Static422.anInt8666 = 0;
	}
}
