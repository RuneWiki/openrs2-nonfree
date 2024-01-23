import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public static int anInt4962;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	public static int anInt4963;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public static int anInt4958 = 0;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!ie;")
	public static Class4_Sub17_Sub1 aClass4_Sub17_Sub1_5 = new Class4_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[500];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method3953() {
		Static43.anInt5510 = 0;
		Static84.anInt1709 = 0;
		Static146.method2352();
		Static115.method1997();
		Static52.method865();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static43.anInt5510; local19++) {
			@Pc(26) int local26 = Static175.anIntArray298[local19];
			if (Static104.anInt2226 != Static100.aClass12_Sub3_Sub1Array1[local26].anInt4167) {
				if (Static100.aClass12_Sub3_Sub1Array1[local26].aClass175_1.method4134()) {
					Static280.method4227(Static100.aClass12_Sub3_Sub1Array1[local26]);
				}
				Static100.aClass12_Sub3_Sub1Array1[local26].method1562(null);
				Static100.aClass12_Sub3_Sub1Array1[local26] = null;
			}
		}
		if (Static101.aClass4_Sub17_Sub1_4.anInt2400 != Static131.anInt2781) {
			throw new RuntimeException("gnp1 pos:" + Static101.aClass4_Sub17_Sub1_4.anInt2400 + " psize:" + Static131.anInt2781);
		}
		for (local19 = 0; local19 < Static68.anInt1262; local19++) {
			if (Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local19]] == null) {
				throw new RuntimeException("gnp2 pos:" + local19 + " size:" + Static68.anInt1262);
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static void method3954() {
		aClass4_Sub17_Sub1_5 = null;
		aStringArray34 = null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)Lclient!kf;")
	public static Class90 method3955(@OriginalArg(1) int arg0) {
		@Pc(10) Class90 local10 = (Class90) Static287.aClass33_20.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static193.aClass98_111.method2396(arg0, 16);
		local10 = new Class90();
		if (local27 != null) {
			local10.method2181(new Class4_Sub17(local27));
		}
		Static287.aClass33_20.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!lc;)Lclient!nk;")
	public static Class4_Sub26 method3956(@OriginalArg(1) int arg0, @OriginalArg(2) Class98 arg1) {
		@Pc(13) byte[] local13 = arg1.method2392(arg0);
		return local13 == null ? null : new Class4_Sub26(local13);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
	public static void method3957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class10 local13 = Static10.aClass10ArrayArrayArray1[Static210.anInt4103][arg0][arg1];
		if (local13 == null) {
			Static292.method4343(Static210.anInt4103, arg0, arg1);
			return;
		}
		@Pc(29) int local29 = -99999999;
		@Pc(31) Class4_Sub2_Sub20 local31 = null;
		@Pc(36) Class4_Sub2_Sub20 local36;
		for (local36 = (Class4_Sub2_Sub20) local13.method190(); local36 != null; local36 = (Class4_Sub2_Sub20) local13.method191()) {
			@Pc(44) Class163 local44 = Static277.method4117(local36.aClass12_Sub4_1.anInt2878);
			@Pc(47) int local47 = local44.anInt4912;
			if (local44.anInt4887 == 1) {
				local47 *= local36.aClass12_Sub4_1.anInt2883 + 1;
			}
			if (local47 > local29) {
				local29 = local47;
				local31 = local36;
			}
		}
		if (local31 == null) {
			Static292.method4343(Static210.anInt4103, arg0, arg1);
			return;
		}
		local13.method189(local31);
		local36 = (Class4_Sub2_Sub20) local13.method190();
		@Pc(97) Class12_Sub4 local97 = null;
		@Pc(99) Class12_Sub4 local99 = null;
		while (local36 != null) {
			@Pc(104) Class12_Sub4 local104 = local36.aClass12_Sub4_1;
			if (local104.anInt2878 != local31.aClass12_Sub4_1.anInt2878) {
				if (local99 == null) {
					local99 = local104;
				}
				if (local104.anInt2878 != local99.anInt2878 && local97 == null) {
					local97 = local104;
				}
			}
			local36 = (Class4_Sub2_Sub20) local13.method191();
		}
		@Pc(147) long local147 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static74.method1124(Static210.anInt4103, arg0, arg1, Static96.method1559(Static210.anInt4103, arg1 * 128 + 64, arg0 * 128 + 64), local31.aClass12_Sub4_1, local147, local99, local97);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
	public static void method3958(@OriginalArg(0) boolean arg0) {
		Static138.aClass22_13 = null;
		Static93.anInt1927 = 0;
		Static106.aByteArrayArrayArray5 = null;
		Static283.aByteArrayArrayArray20 = null;
		Static212.aByteArrayArrayArray16 = null;
		Static220.anIntArrayArrayArray11 = null;
		Static290.anIntArrayArrayArray14 = null;
		Static214.anIntArrayArrayArray10 = null;
		Static44.anIntArray115 = null;
		if (arg0 && Static23.aClass4_Sub2_Sub9_1 != null) {
			Static189.anInt4944 = Static23.aClass4_Sub2_Sub9_1.anInt1820;
		} else {
			Static189.anInt4944 = -1;
		}
		Static121.aByteArrayArrayArray6 = null;
		Static147.aByteArrayArrayArray8 = null;
		Static23.aClass4_Sub2_Sub9_1 = null;
		Static131.aClass10_29.method192();
		Static167.aClass4_Sub2_Sub1_5 = null;
		Static231.aClass15_8 = null;
		Static287.aClass15_3 = null;
		Static132.aClass15_4 = null;
		Static92.anInt1911 = -1;
		Static247.aClass15_9 = null;
		Static179.aClass15_5 = null;
		Static227.aClass4_Sub2_Sub1_Sub1_5 = null;
		Static213.aClass15_6 = null;
		Static192.aClass9_2 = null;
		Static299.anInt5561 = -1;
		Static224.aClass15_7 = null;
		Static32.aClass15_1 = null;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public static void method3959() {
		Static227.aClass33_30.method839();
		Static219.aClass33_32.method839();
	}
}
