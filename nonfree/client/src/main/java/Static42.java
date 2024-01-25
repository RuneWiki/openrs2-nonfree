import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public static int anInt1094;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
	public static int anInt1095;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public static int anInt1100;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "Lclient!rk;")
	public static Class180 aClass180_10;

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "[I")
	public static final int[] anIntArray192 = new int[32];

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BJLclient!pe;)V")
	public static void method899(@OriginalArg(1) long arg0, @OriginalArg(2) Class89 arg1) {
		Static257.anInt4958 = 0;
		Static269.anInt5314 = Static52.anInt1391;
		Static52.anInt1391 = 0;
		@Pc(22) long local22 = Static335.method5308();
		for (@Pc(27) Class36_Sub3 local27 = (Class36_Sub3) Static111.aClass191_2.method4862(); local27 != null; local27 = (Class36_Sub3) Static111.aClass191_2.method4869()) {
			if (local27.method2171(arg1, arg0)) {
				Static257.anInt4958++;
			}
		}
		if (Static27.aBoolean45 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static111.aClass191_2.method4871() + ", running: " + Static257.anInt4958 + ". Particles: " + Static52.anInt1391 + ". Time taken: " + (Static335.method5308() - local22) + "ms");
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IC)Z")
	public static boolean method900(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method902(@OriginalArg(0) int arg0) {
		@Pc(11) String local11 = Integer.toString(arg0);
		for (@Pc(16) int local16 = local11.length() - 3; local16 > 0; local16 -= 3) {
			local11 = local11.substring(0, local16) + "," + local11.substring(local16);
		}
		if (local11.length() > 9) {
			return " <col=00ff80>" + local11.substring(0, local11.length() - 8) + Static97.aString163 + " (" + local11 + ")</col>";
		} else if (local11.length() > 6) {
			return " <col=ffffff>" + local11.substring(0, local11.length() - 4) + Static184.aString244 + " (" + local11 + ")</col>";
		} else {
			return " <col=ffff00>" + local11 + "</col>";
		}
	}
}
