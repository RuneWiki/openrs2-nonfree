import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!h", name = "xb", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_8;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "Lclient!a;")
	private static Class1 aClass1_1310 = Static94.method1596("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "Lclient!a;")
	private static Class1 aClass1_1311 = Static94.method1596("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1312 = aClass1_1310;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "Lclient!a;")
	private static Class1 aClass1_1313 = Static94.method1596("Checking for updates )2 ");

	@OriginalMember(owner = "client!h", name = "Tb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1316 = Static94.method1596("Loaded fonts");

	@OriginalMember(owner = "client!h", name = "Mb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1314 = aClass1_1316;

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!h", name = "Qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1315 = aClass1_1313;

	@OriginalMember(owner = "client!h", name = "Vb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1317 = aClass1_1311;

	@OriginalMember(owner = "client!h", name = "Yb", descriptor = "I")
	public static int anInt1350 = 0;

	@OriginalMember(owner = "client!h", name = "cc", descriptor = "Lclient!a;")
	private static Class1 aClass1_1319 = Static94.method1596("Unexpected server response");

	@OriginalMember(owner = "client!h", name = "ec", descriptor = "Lclient!a;")
	public static Class1 aClass1_1320 = aClass1_1311;

	@OriginalMember(owner = "client!h", name = "kc", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!h", name = "lc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1321 = Static94.method1596("Versteckt");

	@OriginalMember(owner = "client!h", name = "rc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1322 = Static94.method1596("(X100(U(Y");

	@OriginalMember(owner = "client!h", name = "Ac", descriptor = "Lclient!a;")
	public static Class1 aClass1_1323 = aClass1_1319;

	@OriginalMember(owner = "client!h", name = "Bc", descriptor = "I")
	public static int anInt1369 = -1;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public static void method929() {
		if (Static93.aClass65_4 != null) {
			Static93.aClass65_4.method1758();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	public static void method931() {
		Static27.anIntArray113 = null;
		Static94.aByteArrayArray8 = null;
		Static109.anIntArray347 = null;
		Static67.anIntArray342 = null;
		Static7.anIntArray121 = null;
		Static93.anIntArray293 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!aa;I)V")
	public static void method932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1_Sub1_Sub1 arg2) {
		if (arg0 == arg2.anInt2759 && arg0 != -1) {
			@Pc(23) int local23 = Static4.method192(arg0).anInt1436;
			if (local23 == 1) {
				arg2.anInt2730 = 0;
				arg2.anInt2721 = 0;
				arg2.anInt2744 = arg1;
				arg2.anInt2738 = 0;
			}
			if (local23 == 2) {
				arg2.anInt2721 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt2759 == -1 || Static4.method192(arg0).anInt1442 >= Static4.method192(arg2.anInt2759).anInt1442) {
			arg2.anInt2720 = arg2.anInt2734;
			arg2.anInt2730 = 0;
			arg2.anInt2738 = 0;
			arg2.anInt2721 = 0;
			arg2.anInt2744 = arg1;
			arg2.anInt2759 = arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	public static void method936() {
		try {
			@Pc(8) Graphics local8 = Static103.aCanvas1.getGraphics();
			Static1.aClass4_1.method1525(550, local8, 4);
		} catch (@Pc(16) Exception local16) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)I")
	public static int method938() {
		return 19;
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(I)Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 method940() {
		@Pc(9) Class2_Sub1_Sub2_Sub4 local9 = new Class2_Sub1_Sub2_Sub4();
		local9.anInt1673 = Static96.anInt2462;
		local9.anInt1671 = Static55.anInt757;
		local9.anInt1672 = Static93.anIntArray293[0];
		local9.anInt1668 = Static67.anIntArray342[0];
		local9.anInt1670 = Static27.anIntArray113[0];
		local9.anInt1669 = Static109.anIntArray347[0];
		@Pc(45) byte[] local45 = Static94.aByteArrayArray8[0];
		@Pc(51) int local51 = local9.anInt1670 * local9.anInt1669;
		local9.anIntArray170 = new int[local51];
		for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
			local9.anIntArray170[local57] = Static7.anIntArray121[local45[local57] & 0xFF];
		}
		method931();
		return local9;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!lc;BLclient!ba;I)V")
	public static void method942(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub11 local5 = new Class2_Sub11();
		local5.anInt2545 = arg1.method791();
		local5.anInt2547 = arg1.method814();
		local5.anIntArray313 = new int[local5.anInt2545];
		local5.aClass18Array2 = new Class18[local5.anInt2545];
		local5.anIntArray315 = new int[local5.anInt2545];
		local5.aByteArrayArrayArray7 = new byte[local5.anInt2545][][];
		local5.aClass18Array1 = new Class18[local5.anInt2545];
		local5.anIntArray314 = new int[local5.anInt2545];
		for (@Pc(59) int local59 = 0; local59 < local5.anInt2545; local59++) {
			try {
				@Pc(65) int local65 = arg1.method791();
				@Pc(92) String local92;
				@Pc(101) String local101;
				@Pc(105) int local105;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local105 = 0;
					local92 = new String(arg1.method787().method31());
					local101 = new String(arg1.method787().method31());
					if (local65 == 1) {
						local105 = arg1.method814();
					}
					local5.anIntArray313[local59] = local65;
					local5.anIntArray315[local59] = local105;
					local5.aClass18Array2[local59] = arg0.method1260(Static47.method1051(local92), local101);
				} else if (local65 == 3 || local65 == 4) {
					local92 = new String(arg1.method787().method31());
					local101 = new String(arg1.method787().method31());
					local105 = arg1.method791();
					@Pc(108) String[] local108 = new String[local105];
					for (@Pc(110) int local110 = 0; local110 < local105; local110++) {
						local108[local110] = new String(arg1.method787().method31());
					}
					@Pc(130) byte[][] local130 = new byte[local105][];
					@Pc(141) int local141;
					if (local65 == 3) {
						for (@Pc(135) int local135 = 0; local135 < local105; local135++) {
							local141 = arg1.method814();
							local130[local135] = new byte[local141];
							arg1.method820(local130[local135], local141);
						}
					}
					local5.anIntArray313[local59] = local65;
					@Pc(170) Class[] local170 = new Class[local105];
					for (local141 = 0; local141 < local105; local141++) {
						local170[local141] = Static47.method1051(local108[local141]);
					}
					local5.aClass18Array1[local59] = arg0.method1254(local170, local101, Static47.method1051(local92));
					local5.aByteArrayArrayArray7[local59] = local130;
				}
			} catch (@Pc(261) ClassNotFoundException local261) {
				local5.anIntArray314[local59] = -1;
			} catch (@Pc(268) SecurityException local268) {
				local5.anIntArray314[local59] = -2;
			} catch (@Pc(275) NullPointerException local275) {
				local5.anIntArray314[local59] = -3;
			} catch (@Pc(282) Exception local282) {
				local5.anIntArray314[local59] = -4;
			} catch (@Pc(289) Throwable local289) {
				local5.anIntArray314[local59] = -5;
			}
		}
		Static89.aClass46_9.method1437(local5);
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)V")
	public static void method943() {
		anIntArray137 = null;
		aClass8_Sub1_8 = null;
		aClass1_1313 = null;
		aClass1_1316 = null;
		aClass1_1323 = null;
		aClass1_1310 = null;
		aClass1_1315 = null;
		aClass1_1322 = null;
		aClass1_1321 = null;
		aClass1_1320 = null;
		aClass1_1311 = null;
		aByteArray9 = null;
		aClass1_1317 = null;
		aClass1_1314 = null;
		aClass1_1319 = null;
		aClass1_1312 = null;
	}
}
