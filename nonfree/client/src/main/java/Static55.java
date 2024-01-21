import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt1311;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	public static int anInt1315;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int anInt1304 = 0;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public static int anInt1305 = 0;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public static int anInt1306 = 0;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt1307 = 0;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt1308 = 0;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt1309 = 0;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_490 = Static2.method59("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_488 = aClass80_490;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_489 = Static2.method59("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!of;")
	public static Class58 aClass58_7 = new Class58();

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!wd;")
	private static Class80 aClass80_491 = Static2.method59(" million");

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_492 = aClass80_491;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
	public static int method710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return (arg0 * (arg2 & 0xFF00) + local13 * (arg1 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * arg0 + local13 * (arg1 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method711() {
		Static81.aClass32_39.method878();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIILclient!ff;IZ)V")
	public static void method712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3) {
		Static57.anInt1739 = arg1;
		Static17.anInt650 = 1;
		Static64.anInt1819 = arg3;
		Static15.anInt428 = 10000;
		Static5.aClass11_4 = arg2;
		Static107.aBoolean212 = false;
		Static35.anInt1172 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method713() {
		aClass80_489 = null;
		aClass80_492 = null;
		aClass80_491 = null;
		aClass80_490 = null;
		aClass80_488 = null;
		aClass58_7 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIB)V")
	public static void method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static98.anInt2613 == 0 || arg1 == 0 || Static16.anInt443 >= 50) {
			return;
		}
		Static110.anIntArray379[Static16.anInt443] = arg2;
		Static5.anIntArray13[Static16.anInt443] = arg1;
		Static49.anIntArray191[Static16.anInt443] = arg0;
		Static82.aClass25Array56[Static16.anInt443] = null;
		Static23.anIntArray101[Static16.anInt443] = 0;
		Static16.anInt443++;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method718() {
		Static94.aClass32_46.method878();
	}
}
