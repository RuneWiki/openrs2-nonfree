import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public static int anInt465;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!da;")
	public static Class15 aClass15_13;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_242 = Static24.method441("Fps:");

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "Lclient!wb;")
	private static Class65 aClass65_250 = Static24.method441("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_243 = aClass65_250;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!wb;")
	private static Class65 aClass65_244 = Static24.method441("Please contact customer support)3");

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!wb;")
	private static Class65 aClass65_247 = Static24.method441("Loading game screen )2 ");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_245 = aClass65_247;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!wb;")
	private static Class65 aClass65_249 = Static24.method441("Username: ");

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_246 = aClass65_249;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt474 = 0;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public static int anInt477 = 0;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public static int anInt478 = -1;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_248 = Static24.method441(":duelreq:");

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "J")
	public static long aLong24 = 0L;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_251 = aClass65_244;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method304(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static108.aClass19_1);
		arg0.addMouseMotionListener(Static108.aClass19_1);
		arg0.addFocusListener(Static108.aClass19_1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method305() {
		aClass65_244 = null;
		aClass65_250 = null;
		aClass65_242 = null;
		aClass15_13 = null;
		aClass65_248 = null;
		aClass65_251 = null;
		aClass65_249 = null;
		aClass65_245 = null;
		aClass65_246 = null;
		aClass65_247 = null;
		aClass65_243 = null;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public static void method308() {
		if (Static4.aBoolean16 && Static62.anInt1879 != Static95.anInt1972) {
			Static96.method1652(Static84.anInt2408, Static24.anInt721, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], Static62.anInt1879);
		} else if (Static62.anInt1879 != Static98.anInt2771) {
			Static98.anInt2771 = Static62.anInt1879;
			Static99.method1562(Static62.anInt1879);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sb;IZI)Z")
	public static boolean method309(@OriginalArg(0) Class53 arg0, @OriginalArg(2) boolean arg1) {
		return Static23.method424(arg1, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!mc;Z)V")
	public static void method310(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub1 arg1) {
		if (Static27.aClass2_Sub8_2 == null) {
			Static39.method763(true, 255, 255, 0, null, (byte) 0);
			Static110.aClass33_Sub1Array1[arg0] = arg1;
		} else {
			Static27.aClass2_Sub8_2.anInt2342 = arg0 * 4 + 5;
			@Pc(21) int local21 = Static27.aClass2_Sub8_2.method1406();
			arg1.method1160(local21);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method311() {
		while (true) {
			if (Static59.aClass2_Sub8_Sub1_19.method1424(Static57.anInt1718) >= 27) {
				@Pc(14) int local14 = Static59.aClass2_Sub8_Sub1_19.method1419(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local14] == null) {
						Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local14] = new Class2_Sub1_Sub1_Sub2_Sub1();
						local19 = true;
					}
					@Pc(35) Class2_Sub1_Sub1_Sub2_Sub1 local35 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local14];
					Static23.anIntArray92[Static51.anInt1482++] = local14;
					local35.anInt1544 = Static108.anInt2902;
					@Pc(51) int local51 = Static59.aClass2_Sub8_Sub1_19.method1419(5);
					@Pc(56) int local56 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
					@Pc(61) int local61 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
					if (local51 > 15) {
						local51 -= 32;
					}
					if (local61 == 1) {
						Static61.anIntArray248[Static39.anInt1251++] = local14;
					}
					@Pc(83) int local83 = Static59.aClass2_Sub8_Sub1_19.method1419(5);
					if (local83 > 15) {
						local83 -= 32;
					}
					local35.aClass2_Sub1_Sub11_1 = Static75.method1301(Static59.aClass2_Sub8_Sub1_19.method1419(13));
					@Pc(102) int local102 = Static62.anIntArray254[Static59.aClass2_Sub8_Sub1_19.method1419(3)];
					if (local19) {
						local35.anInt1540 = local102;
					}
					local35.anInt1521 = local35.aClass2_Sub1_Sub11_1.anInt2105;
					local35.anInt1548 = local35.aClass2_Sub1_Sub11_1.anInt2116;
					local35.anInt1528 = local35.aClass2_Sub1_Sub11_1.anInt2112;
					local35.anInt1571 = local35.aClass2_Sub1_Sub11_1.anInt2114;
					local35.anInt1558 = local35.aClass2_Sub1_Sub11_1.anInt2108;
					local35.anInt1536 = local35.aClass2_Sub1_Sub11_1.anInt2126;
					local35.anInt1555 = local35.aClass2_Sub1_Sub11_1.anInt2110;
					if (local35.anInt1536 == 0) {
						local35.anInt1540 = 0;
					}
					local35.anInt1515 = local35.aClass2_Sub1_Sub11_1.anInt2096;
					local35.anInt1559 = local35.aClass2_Sub1_Sub11_1.anInt2124;
					local35.method922(local83 + Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local56 == 1, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0] + local51);
					continue;
				}
			}
			Static59.aClass2_Sub8_Sub1_19.method1428();
			return;
		}
	}
}
