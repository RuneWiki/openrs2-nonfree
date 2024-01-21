import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public static int anInt1135;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public static int anInt1126 = -1;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public static int anInt1128 = 1;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public static int[] anIntArray194 = new int[128];

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!af;")
	private static Class5 aClass5_578 = Static45.method1937("Loaded interfaces");

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_576 = aClass5_578;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_577 = Static45.method1937("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[104][104];

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method829() {
		Static128.aClass28_88.method792();
		Static49.aClass28_32.method792();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method830() {
		Static81.aClass28_56.method792();
		Static82.aClass28_57.method792();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public static void method831() {
		anIntArray194 = null;
		aClass5_577 = null;
		anIntArrayArray37 = null;
		aClass5_578 = null;
		aClass5_576 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZILclient!kb;Lclient!kb;)Lclient!h;")
	public static Class1_Sub3_Sub8 method832(@OriginalArg(0) int arg0, @OriginalArg(3) Class41 arg1, @OriginalArg(4) Class41 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1712(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg1.method1701(arg0, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg2.method1701(local44, 0);
				if (local60 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub3_Sub8(arg1, arg2, arg0, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public static void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static115.anInt2885 != 0 && Static115.anInt2885 != 3 || Static12.anInt3243 != 1) {
			return;
		}
		@Pc(23) int local23 = Static9.anInt280 - arg0 - 25;
		@Pc(30) int local30 = Static97.anInt2390 - arg1 - 5;
		if (local23 < 0 || local30 < 0 || local23 >= 146 || local30 >= 151) {
			return;
		}
		@Pc(50) int local50 = Static3.anInt58 + Static21.anInt748 & 0x7FF;
		local30 -= 75;
		local23 -= 73;
		@Pc(56) int local56 = Class1_Sub3_Sub1_Sub4.anIntArray425[local50];
		@Pc(64) int local64 = (Static98.anInt2404 + 256) * local56 >> 8;
		@Pc(68) int local68 = Class1_Sub3_Sub1_Sub4.anIntArray424[local50];
		@Pc(76) int local76 = local68 * (Static98.anInt2404 + 256) >> 8;
		@Pc(86) int local86 = local76 * local23 + local64 * local30 >> 11;
		@Pc(94) int local94 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 + local86 >> 7;
		@Pc(105) int local105 = local30 * local76 - local23 * local64 >> 11;
		@Pc(112) int local112 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 - local105 >> 7;
		@Pc(132) boolean local132 = Static54.method946(local94, local112, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, true, 1, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
		if (!local132) {
			return;
		}
		Static44.aClass1_Sub20_Sub1_1.method2081(local23);
		Static44.aClass1_Sub20_Sub1_1.method2081(local30);
		Static44.aClass1_Sub20_Sub1_1.method2055(Static3.anInt58);
		Static44.aClass1_Sub20_Sub1_1.method2081(57);
		Static44.aClass1_Sub20_Sub1_1.method2081(Static21.anInt748);
		Static44.aClass1_Sub20_Sub1_1.method2081(Static98.anInt2404);
		Static44.aClass1_Sub20_Sub1_1.method2081(89);
		Static44.aClass1_Sub20_Sub1_1.method2055(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089);
		Static44.aClass1_Sub20_Sub1_1.method2055(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079);
		Static44.aClass1_Sub20_Sub1_1.method2081(Static118.anInt2975);
		Static44.aClass1_Sub20_Sub1_1.method2081(63);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method834() {
		Static109.aByteArrayArrayArray6 = null;
		Static79.anIntArray304 = null;
		Static50.aByteArrayArrayArray2 = null;
		Static51.anIntArray204 = null;
		Static78.anIntArray302 = null;
		Static79.aByteArrayArrayArray4 = null;
		Static97.anIntArrayArrayArray3 = null;
		Static12.anIntArray461 = null;
		Static112.anIntArrayArray80 = null;
		Static123.aByteArrayArrayArray7 = null;
		Static73.anIntArray280 = null;
		Static95.aByteArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZII)V")
	public static void method835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static12.anInt3244 = -1;
			Static68.anInt1572 = -1;
			return;
		}
		@Pc(33) int local33 = Static102.method1746(arg1, Static7.anInt213, arg0) - arg2;
		@Pc(37) int local37 = arg0 - Static66.anInt3170;
		@Pc(41) int local41 = local33 - Static91.anInt2286;
		@Pc(45) int local45 = Class1_Sub3_Sub1_Sub4.anIntArray425[Static109.anInt2693];
		@Pc(49) int local49 = arg1 - Static121.anInt3115;
		@Pc(53) int local53 = Class1_Sub3_Sub1_Sub4.anIntArray424[Static109.anInt2693];
		@Pc(57) int local57 = Class1_Sub3_Sub1_Sub4.anIntArray425[Static76.anInt1794];
		@Pc(61) int local61 = Class1_Sub3_Sub1_Sub4.anIntArray424[Static76.anInt1794];
		@Pc(76) int local76 = local49 * local57 + local61 * local37 >> 16;
		@Pc(87) int local87 = local61 * local49 - local57 * local37 >> 16;
		@Pc(89) int local89 = local76;
		@Pc(100) int local100 = local53 * local41 - local87 * local45 >> 16;
		@Pc(110) int local110 = local53 * local87 + local45 * local41 >> 16;
		if (local110 < 50) {
			Static68.anInt1572 = -1;
			Static12.anInt3244 = -1;
		} else {
			Static68.anInt1572 = (local89 << 9) / local110 + 256;
			Static12.anInt3244 = (local100 << 9) / local110 + 167;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z")
	public static boolean method836(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
