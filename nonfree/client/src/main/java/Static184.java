import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1358 = Static161.method2452("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1359 = Static161.method2452("<col=ff3000>");

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "[Lclient!df;")
	public static final Class21[] aClass21Array1 = new Class21[50];

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt3696 = 20;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1360 = Static161.method2452("event_opbase");

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1361 = aClass20_1358;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method2778(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static200.anInt3939 > 0) {
			local23 = Static212.aByteArrayArray10[--Static200.anInt3939];
			Static212.aByteArrayArray10[Static200.anInt3939] = null;
			return local23;
		} else if (arg0 == 5000 && Static189.anInt3757 > 0) {
			local23 = Static24.aByteArrayArray2[--Static189.anInt3757];
			Static24.aByteArrayArray2[Static189.anInt3757] = null;
			return local23;
		} else if (arg0 == 30000 && Static71.anInt1558 > 0) {
			local23 = Static79.aByteArrayArray6[--Static71.anInt1558];
			Static79.aByteArrayArray6[Static71.anInt1558] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!mf;)V")
	public static void method2779(@OriginalArg(1) Class69 arg0) {
		if (Static70.anInt1544 == arg0.anInt2548) {
			Static185.aBooleanArray43[arg0.anInt2510] = true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class20 method2780(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static70.method1166(new Class20[] { Static98.aClass20_783, Static132.method2805(arg0), Static109.aClass20_850 });
		} else if (arg0 < 10000000) {
			return Static70.method1166(new Class20[] { Static51.aClass20_366, Static132.method2805(arg0 / 1000), Static86.aClass20_688, Static109.aClass20_850 });
		} else {
			return Static70.method1166(new Class20[] { Static209.aClass20_1514, Static132.method2805(arg0 / 1000000), Static2.aClass20_11, Static109.aClass20_850 });
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!eg;B)V")
	public static void method2781(@OriginalArg(0) Class5_Sub10 arg0) {
		Static146.method2246(200000, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIILclient!ia;IJ)Z")
	public static boolean method2782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static80.method1411(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!wa;IIB)Lclient!ng;")
	public static Class47_Sub1 method2783(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1) {
		return Static167.method2532(arg0, arg1, 0) ? Static100.method1691() : null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIIIII)V")
	public static void method2784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 > Static174.anInt3493 || arg1 < Static173.anInt3464) {
			return;
		}
		@Pc(22) boolean local22;
		if (arg4 < Static27.anInt493) {
			arg4 = Static27.anInt493;
			local22 = false;
		} else if (Static72.anInt1572 >= arg4) {
			local22 = true;
		} else {
			arg4 = Static72.anInt1572;
			local22 = false;
		}
		@Pc(48) boolean local48;
		if (arg3 < Static27.anInt493) {
			local48 = false;
			arg3 = Static27.anInt493;
		} else if (Static72.anInt1572 < arg3) {
			local48 = false;
			arg3 = Static72.anInt1572;
		} else {
			local48 = true;
		}
		if (arg2 < Static173.anInt3464) {
			arg2 = Static173.anInt3464;
		} else {
			Static27.method409(arg4, arg0, Static9.anIntArrayArray1[arg2++], arg3);
		}
		if (arg1 > Static174.anInt3493) {
			arg1 = Static174.anInt3493;
		} else {
			Static27.method409(arg4, arg0, Static9.anIntArrayArray1[arg1--], arg3);
		}
		@Pc(105) int local105;
		if (local48 && local22) {
			for (local105 = arg2; local105 <= arg1; local105++) {
				@Pc(111) int[] local111 = Static9.anIntArrayArray1[local105];
				local111[arg3] = local111[arg4] = arg0;
			}
		} else if (local48) {
			for (local105 = arg2; local105 <= arg1; local105++) {
				Static9.anIntArrayArray1[local105][arg3] = arg0;
			}
		} else if (local22) {
			for (local105 = arg2; local105 <= arg1; local105++) {
				Static9.anIntArrayArray1[local105][arg4] = arg0;
			}
		}
	}
}
