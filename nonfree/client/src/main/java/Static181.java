import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
	public static int anInt3807;

	@OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
	public static int anInt3812;

	@OriginalMember(owner = "client!kk", name = "Y", descriptor = "Lclient!kd;")
	public static Class123 aClass123_3;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_131 = new Class62("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
	public static int anInt3816 = -1;

	@OriginalMember(owner = "client!kk", name = "X", descriptor = "[[S")
	public static final short[][] aShortArrayArray15 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[Lclient!rg;)V")
	public static void method3325(@OriginalArg(1) Class27[] arg0) {
		Static383.anInt6968 = arg0.length;
		Static2.anIntArray588 = new int[Static383.anInt6968 + 10];
		Static315.aClass27Array51 = new Class27[Static383.anInt6968 + 10];
		Static394.method2444(arg0, 0, Static315.aClass27Array51, 0, Static383.anInt6968);
		for (@Pc(31) int local31 = 0; local31 < Static383.anInt6968; local31++) {
			Static2.anIntArray588[local31] = Static315.aClass27Array51[local31].method5328();
		}
		for (@Pc(50) int local50 = Static383.anInt6968; local50 < Static315.aClass27Array51.length; local50++) {
			Static2.anIntArray588[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	public static void method3326(@OriginalArg(1) int arg0) {
		if (arg0 == Static121.anInt6774) {
			return;
		}
		if (Static121.anInt6774 == 0) {
			Static207.method3778();
		}
		if (arg0 == 40) {
			Static343.method5493();
		}
		if (arg0 != 40 && Static321.aClass226_2 != null) {
			Static321.aClass226_2.method5543();
			Static321.aClass226_2 = null;
		}
		if (Static121.anInt6774 == 25 || Static121.anInt6774 == 28) {
			Static48.aClass83_29.anInt2413 = 2;
			Static350.aClass83_122.anInt2413 = 2;
			Static221.aClass83_129.anInt2413 = 2;
			Static97.aClass83_46.anInt2413 = 2;
			Static1.aClass83_131.anInt2413 = 2;
			Static281.aClass83_99.anInt2413 = 2;
			Static210.aClass83_127.anInt2413 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static382.anInt6949 = 1;
			Static202.anInt4204 = 0;
			Static23.anInt364 = 0;
			Static51.anInt1104 = 0;
			Static350.anInt6467 = 1;
			Static291.method4805(true);
			Static48.aClass83_29.anInt2413 = 1;
			Static350.aClass83_122.anInt2413 = 1;
			Static221.aClass83_129.anInt2413 = 1;
			Static97.aClass83_46.anInt2413 = 1;
			Static1.aClass83_131.anInt2413 = 1;
			Static281.aClass83_99.anInt2413 = 1;
			Static210.aClass83_127.anInt2413 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static8.method375();
		}
		if (arg0 == 5) {
			Static389.method6106(Static383.aClass48_9, Static324.aClass83_116);
		} else {
			Static273.method4587();
		}
		@Pc(146) boolean local146 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(161) boolean local161 = Static121.anInt6774 == 5 || Static121.anInt6774 == 10 || Static121.anInt6774 == 28;
		if (local146 != local161) {
			if (local146) {
				Static42.anInt732 = Static41.anInt729;
				if (Static228.anInt4592 == 0) {
					Static168.method2961();
				} else {
					Static379.method5969(255, Static41.anInt729, Static279.aClass83_95);
				}
				Static364.aClass222_3.method5526(false);
			} else {
				Static168.method2961();
				Static364.aClass222_3.method5526(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static383.aClass48_9.method2529();
		}
		Static121.anInt6774 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(B)V")
	public static void method3328() {
		Static92.aClass48_5.method2498(((float) Static190.anInt3986 * 0.1F + 0.7F) * 1.1523438F);
		Static92.aClass48_5.method2543(Static39.anInt671, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static92.aClass48_5.method2475(Static46.anInt5338, -1);
		Static92.aClass48_5.method2489(Static269.aClass10_2);
	}
}
