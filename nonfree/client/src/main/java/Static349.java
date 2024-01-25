import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "Lclient!co;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
	public static int anInt5976;

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
	public static int anInt5977;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "Lclient!os;")
	public static final Class182 aClass182_215 = new Class182("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_62 = new Class267(8);

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
	public static void method4739() {
		Static312.aClass51_2.method4765();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Static245.aLongArray5[local12] = 0L;
		}
		for (@Pc(31) int local31 = 0; local31 < 32; local31++) {
			Static104.aLongArray3[local31] = 0L;
		}
		Static389.anInt6612 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
	public static void method4740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static361.aClass85_Sub1_1.anInt2481 != 0 && arg0 != 0 && Static443.anInt7418 < 50 && arg2 != -1) {
			Static383.aClass68Array1[Static443.anInt7418++] = new Class68((byte) 1, arg2, arg0, arg3, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method4743() {
		Static96.aClass267_16.method6011();
	}
}
