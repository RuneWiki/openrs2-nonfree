import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
	public static int anInt1399;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "Lclient!mb;")
	public static Class62 aClass62_466 = null;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_467 = Static151.method2243("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_468 = Static151.method2243("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_469 = Static151.method2243(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_470 = Static151.method2243("::fpson");

	@OriginalMember(owner = "client!gf", name = "cb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_471 = Static151.method2243("compass");

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
	public static int anInt1402 = -1;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IBI)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static51.anInt1111 < 2 && Static97.anInt2284 == 0 && !Static8.aBoolean12) {
			return;
		}
		@Pc(50) Class62 local50;
		if (Static97.anInt2284 == 1 && Static51.anInt1111 < 2) {
			local50 = Static169.method2460(new Class62[] { Static169.aClass62_1261, Static204.aClass62_1468, Static155.aClass62_1179, Static38.aClass62_1071 });
		} else if (Static8.aBoolean12 && Static51.anInt1111 < 2) {
			local50 = Static169.method2460(new Class62[] { Static125.aClass62_970, Static204.aClass62_1468, Static145.aClass62_1077, Static38.aClass62_1071 });
		} else {
			local50 = Static114.method1772(Static51.anInt1111 - 1);
		}
		if (Static51.anInt1111 > 2) {
			local50 = Static169.method2460(new Class62[] { local50, Static87.aClass62_611, Static119.method1865(Static51.anInt1111 - 2), Static23.aClass62_159 });
		}
		@Pc(130) int local130 = Static47.aClass2_Sub1_Sub12_3.method1356(local50, arg0 + 4, arg1 - -15, Static198.aRandom1, Static62.anInt1302);
		Static135.method2042(15, arg1, arg0 + 4, Static47.aClass2_Sub1_Sub12_3.method1384(local50) - -local130);
	}
}
