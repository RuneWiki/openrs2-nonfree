import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public static int anInt5;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!ib;")
	public static Class4_Sub3_Sub10 aClass4_Sub3_Sub10_1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!fh;")
	public static Class58 aClass58_2;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!vk;")
	public static Class185 aClass185_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void method5(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		@Pc(10) int local10 = (int) (Math.random() * 21.0D) - 10;
		Static46.aClass58_22 = arg1;
		@Pc(19) int local19 = (int) (Math.random() * 41.0D) - 20;
		Static309.aClass58_103 = arg0;
		@Pc(28) int local28 = (int) (Math.random() * 21.0D) - 10;
		Static46.aClass58_22.method1371(34);
		@Pc(40) int local40 = (int) (Math.random() * 21.0D) - 10;
		Static256.anInt4868 = local19 + local28;
		Static220.anInt3963 = local10 + local19;
		Static5.anInt97 = local19 + local40;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(17) String local17 = Static213.method3477(Static66.method1054(arg1));
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < Static129.anInt2510; local21++) {
			@Pc(30) Class53_Sub1_Sub1 local30 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local21]];
			if (local30 != null && local30.aString88 != null && local30.aString88.equalsIgnoreCase(local17)) {
				local19 = true;
				if (arg0 == 1) {
					Static110.aClass4_Sub10_Sub1_1.method4687(212);
					Static110.aClass4_Sub10_Sub1_1.method4651(Static172.anIntArray317[local21]);
					Static110.aClass4_Sub10_Sub1_1.method4648(0);
				} else if (arg0 == 4) {
					Static110.aClass4_Sub10_Sub1_1.method4687(105);
					Static110.aClass4_Sub10_Sub1_1.method4668(Static172.anIntArray317[local21]);
					Static110.aClass4_Sub10_Sub1_1.method4618(0);
				} else if (arg0 == 5) {
					Static110.aClass4_Sub10_Sub1_1.method4687(96);
					Static110.aClass4_Sub10_Sub1_1.method4648(0);
					Static110.aClass4_Sub10_Sub1_1.method4668(Static172.anIntArray317[local21]);
				} else if (arg0 == 6) {
					Static110.aClass4_Sub10_Sub1_1.method4687(77);
					Static110.aClass4_Sub10_Sub1_1.method4650(Static172.anIntArray317[local21]);
					Static110.aClass4_Sub10_Sub1_1.method4623(0);
				} else if (arg0 == 7) {
					Static110.aClass4_Sub10_Sub1_1.method4687(52);
					Static110.aClass4_Sub10_Sub1_1.method4668(Static172.anIntArray317[local21]);
					Static110.aClass4_Sub10_Sub1_1.method4618(0);
				}
				break;
			}
		}
		if (!local19) {
			Static186.method4394("", 0, Static241.aString283 + local17);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method8() {
		for (@Pc(11) int local11 = 0; local11 < Static236.anInt4452; local11++) {
			@Pc(18) int local18 = Static278.anIntArray595[local11];
			@Pc(22) Class53_Sub1_Sub2 local22 = Static110.aClass53_Sub1_Sub2Array1[local18];
			if (local22 != null) {
				Static81.method1428(local22.aClass171_1.anInt5263, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 >= arg0 ? (arg1 > arg2 ? arg2 : arg1) : arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZ)V")
	public static void method10(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static300.anInt5636 = 104;
		Static299.anInt5591 = 104;
		Static164.anInt3253 = arg0;
		Static133.aClass4_Sub19ArrayArrayArray2 = new Class4_Sub19[4][Static300.anInt5636][Static299.anInt5591];
		Static259.anIntArrayArrayArray14 = new int[4][Static300.anInt5636 + 1][Static299.anInt5591 + 1];
		if (Static94.aBoolean138) {
			Static105.aClass4_Sub12ArrayArray1 = new Class4_Sub12[4][];
		}
		if (arg1) {
			Static299.aClass4_Sub19ArrayArrayArray3 = new Class4_Sub19[1][Static300.anInt5636][Static299.anInt5591];
			Static54.anIntArrayArray10 = new int[Static300.anInt5636][Static299.anInt5591];
			Static36.anIntArrayArrayArray2 = new int[1][Static300.anInt5636 + 1][Static299.anInt5591 + 1];
			if (Static94.aBoolean138) {
				Static291.aClass4_Sub12ArrayArray3 = new Class4_Sub12[1][];
			}
		} else {
			Static299.aClass4_Sub19ArrayArrayArray3 = null;
			Static54.anIntArrayArray10 = null;
			Static36.anIntArrayArrayArray2 = null;
			Static291.aClass4_Sub12ArrayArray3 = null;
		}
		Static288.method4405(false);
		Static294.aClass188Array13 = new Class188[500];
		Static77.anInt1742 = 0;
		Static241.aClass188Array12 = new Class188[500];
		Static208.anInt4112 = 0;
		Static71.anIntArrayArrayArray3 = new int[4][Static300.anInt5636 + 1][Static299.anInt5591 + 1];
		Static171.aClass33Array2 = new Class33[5000];
		Static139.anInt2661 = 0;
		Static62.aClass33Array1 = new Class33[100];
		Static160.aBooleanArrayArray5 = new boolean[Static164.anInt3253 + Static164.anInt3253 + 1][Static164.anInt3253 + Static164.anInt3253 + 1];
		Static152.aBooleanArrayArray4 = new boolean[Static164.anInt3253 + Static164.anInt3253 + 2][Static164.anInt3253 + Static164.anInt3253 + 2];
		Static174.aByteArrayArrayArray16 = new byte[4][Static300.anInt5636][Static299.anInt5591];
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method11() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static137.aBooleanArray13[local3] = false;
		}
		Static194.anInt5196 = -1;
		Static41.anInt772 = 5;
		Static253.anInt4839 = 0;
		Static11.anInt212 = 0;
		Static153.anInt3024 = -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIFIIZB)[I")
	public static int[] method12(@OriginalArg(3) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(16) Class4_Sub1_Sub12 local16 = new Class4_Sub1_Sub12();
		local16.anInt2620 = (int) (arg0 * 4096.0F);
		local16.anInt2628 = 4;
		local16.aBoolean181 = true;
		local16.anInt2631 = 8;
		local16.anInt2621 = 35;
		local16.anInt2625 = 8;
		local16.method4737();
		Static33.method524(2048, 1);
		local16.method2054(local2, 0);
		return local2;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V")
	public static void method13(@OriginalArg(1) long arg0) {
		Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
		Static110.aClass4_Sub10_Sub1_1.method4618(21);
		Static110.aClass4_Sub10_Sub1_1.method4619(arg0);
		Static268.anInt5174 = -3;
		Static60.anInt1213 = 0;
		Static166.anInt3409 = 0;
		Static250.anInt4760 = 1;
	}
}
