import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_133 = new Class40("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_79 = new Class236(60, 1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
	public static boolean method6456() {
		return Static66.method1216("jaclib") ? Static66.method1216("hw3d") : false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Z")
	public static boolean method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	public static void method6458(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 3);
		local8.method1324();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method6459() {
		@Pc(7) Class97 local7 = null;
		try {
			@Pc(13) Class83 local13 = Static159.aClass9_10.method293(false, "3");
			while (local13.anInt2495 == 0) {
				Static213.method3465(1L);
			}
			if (local13.anInt2495 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class97) local13.anObject8;
			@Pc(40) byte[] local40 = new byte[(int) local7.method2500()];
			if (local40.length == 0) {
				Static125.aString32 = "";
				Static380.aString68 = "";
			} else {
				@Pc(67) int local67;
				for (@Pc(54) int local54 = 0; local54 < local40.length; local54 += local67) {
					local67 = local7.method2501(local40, local40.length - local54, local54);
					if (local67 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(92) Class5_Sub3 local92 = new Class5_Sub3(local40);
				@Pc(96) int local96 = local92.method4220();
				if (local96 > 50) {
					throw new RuntimeException("Bad length");
				}
				local92.anInt4960 = local96 + 1;
				if (!local92.method4178()) {
					throw new RuntimeException("Invalid CRC");
				}
				local92.anInt4960 = 1;
				@Pc(127) int local127 = local92.method4220();
				if (local127 > 1) {
					throw new RuntimeException("Invalid version " + local127);
				}
				Static125.aString32 = local92.method4201();
				Static380.aString68 = local92.method4201();
				if (local127 >= 1) {
					Static137.anInt1382 = local92.method4227();
				} else {
					Static137.anInt1382 = Static433.anInt7630;
				}
			}
		} catch (@Pc(164) Exception local164) {
			Static380.aString68 = "";
			Static125.aString32 = "";
		}
		try {
			if (local7 != null) {
				local7.method2499();
			}
		} catch (@Pc(175) Exception local175) {
		}
	}
}
