import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!ne;")
	public static Class166 aClass166_3;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!ia;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_78 = new Class151("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public static int anInt2311 = 0;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_10 = new Class257(16);

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!ie;")
	public static Class103 method1820() {
		try {
			return (Class103) Class.forName("Class103_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIB)I")
	public static int method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static37.anInt732 < 100) {
			return -2;
		}
		@Pc(20) int local20 = -2;
		@Pc(22) int local22 = Integer.MAX_VALUE;
		@Pc(27) int local27 = arg2 - Static114.anInt6798;
		@Pc(32) int local32 = arg1 - Static114.anInt6800;
		for (@Pc(37) Class1_Sub7 local37 = (Class1_Sub7) Static114.aClass254_45.method5437(); local37 != null; local37 = (Class1_Sub7) Static114.aClass254_45.method5433()) {
			if (local37.anInt969 == arg0) {
				@Pc(50) int local50 = local37.anInt973;
				@Pc(53) int local53 = local37.anInt968;
				@Pc(63) int local63 = local53 + Static114.anInt6800 | Static114.anInt6798 + local50 << 14;
				@Pc(81) int local81 = (local32 - local53) * (local32 - local53) + (local27 - local50) * (local27 + -local50);
				if (local20 < 0 || local22 > local81) {
					local22 = local81;
					local20 = local63;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
	public static void method1828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg1 >= Static271.anInt4271 && arg2 + arg1 <= Static13.anInt263 && Static74.anInt1413 <= arg3 - arg1 && arg1 + arg3 <= Static149.anInt7384) {
			Static326.method4183(arg3, arg1, arg2, arg0);
		} else {
			Static403.method5024(arg1, arg3, arg2, arg0);
		}
	}
}
