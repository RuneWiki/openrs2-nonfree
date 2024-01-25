import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray56;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_144 = new Class211(64, 1);

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_91 = new Class134("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZC)C")
	public static char method5081(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIB)V")
	public static void method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static398.anInt6535; local7++) {
			@Pc(13) Rectangle local13 = Class2_Sub15.aRectangleArray1[local7];
			if (arg0 < local13.x + local13.width && local13.x < arg0 + arg1 && local13.y + local13.height > arg3 && arg3 + arg2 > local13.y) {
				Static101.aBooleanArray9[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!mb;IIII)V")
	public static void method5084(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static151.method2184(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static169.anInt2876) {
			Static151.method2184(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static151.method2184(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static316.anInt5459) {
			Static151.method2184(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static316.anInt5459) {
			Static151.method2184(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static169.anInt2876 && arg4 <= Static316.anInt5459) {
			Static151.method2184(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static151.method2184(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static169.anInt2876 && arg4 > 0) {
			Static151.method2184(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
	public static String method5085(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(21) String local21 = arg1[arg0];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg0;
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = arg0; local45 < local32; local45++) {
				@Pc(51) String local51 = arg1[local45];
				if (local51 == null) {
					local43 += 4;
				} else {
					local43 += local51.length();
				}
			}
			@Pc(74) StringBuffer local74 = new StringBuffer(local43);
			for (@Pc(76) int local76 = arg0; local76 < local32; local76++) {
				@Pc(82) String local82 = arg1[local76];
				if (local82 == null) {
					local74.append("null");
				} else {
					local74.append(local82);
				}
			}
			return local74.toString();
		}
	}
}
