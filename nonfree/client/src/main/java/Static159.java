import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gca", name = "V", descriptor = "Lclient!bi;")
	public static Class31 aClass31_36;

	@OriginalMember(owner = "client!gca", name = "ib", descriptor = "I")
	public static int anInt3539;

	@OriginalMember(owner = "client!gca", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gca", name = "db", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method3156(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static112.aClass16Array3 == Static109.aClass16Array2) {
			return;
		}
		@Pc(9) int local9 = Static45.aClass16Array1[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class16 local22 = Static45.aClass16Array1[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3157(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method3158(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static602.method1586(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!ii;I)V")
	public static void method3159(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class161 arg1) {
		while (true) {
			@Pc(17) Class299 local17 = arg1.method3829(arg0);
			while (local17.anInt7985 == 0) {
				Static55.method845(10L);
			}
			if (local17.anInt7985 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static55.method845(100L);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method3160(@OriginalArg(1) Class66 arg0) {
		if (Static300.anInt5730 < 2 && !Static524.aBoolean617 || Static287.aClass115_12 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static524.aBoolean617 && Static300.anInt5730 < 2) {
			local36 = Static404.aString82 + Static275.aClass198_31.method4407(Static56.anInt953) + Static238.aString94 + " ->";
		} else if (Static307.aBoolean423 && Static12.aClass173_1.method6259(81) && Static300.anInt5730 > 2) {
			local36 = Static23.method438((Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288.aClass4_288);
		} else {
			@Pc(43) Class4_Sub18 local43 = (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288;
			local36 = Static23.method438(local43);
			@Pc(49) int[] local49 = null;
			if (Static165.method3185(local43.anInt3158)) {
				local49 = Static195.aClass99_1.method2798((int) local43.aLong74).anIntArray476;
			} else if (local43.anInt3157 != -1) {
				local49 = Static195.aClass99_1.method2798(local43.anInt3157).anIntArray476;
			} else if (Static543.method7528(local43.anInt3158)) {
				@Pc(72) Class4_Sub50 local72 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local43.aLong74);
				if (local72 != null) {
					@Pc(77) Class10_Sub1_Sub2_Sub1 local77 = local72.aClass10_Sub1_Sub2_Sub1_1;
					@Pc(80) Class54 local80 = local77.aClass54_1;
					if (local80.anIntArray150 != null) {
						local80 = local80.method1118(Static511.aClass335_2);
					}
					if (local80 != null) {
						local49 = local80.anIntArray152;
					}
				}
			} else if (Static226.method3959(local43.anInt3158)) {
				@Pc(112) Class25 local112;
				if (local43.anInt3158 == 1010) {
					local112 = Static553.aClass288_4.method6419((int) local43.aLong74);
				} else {
					local112 = Static553.aClass288_4.method6419((int) (local43.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local112.anIntArray115 != null) {
					local112 = local112.method578(Static511.aClass335_2);
				}
				if (local112 != null) {
					local49 = local112.anIntArray113;
				}
			}
			if (local49 != null) {
				local36 = local36 + Static315.method4804(local49);
			}
		}
		if (Static300.anInt5730 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static300.anInt5730 - 2) + Static275.aClass198_24.method4407(Static56.anInt953);
		}
		if (Static518.aClass115_14 != null) {
			@Pc(250) Class91 local250 = Static518.aClass115_14.method3134(arg0);
			if (local250 == null) {
				local250 = Static65.aClass91_4;
			}
			local250.method7457(Static367.aClass13Array24, Static117.anInt2739, local36, Static52.anIntArray140, Static518.aClass115_14.anInt3525, Static518.aClass115_14.anInt3495, Static190.anInt3969, Static23.anIntArray106, Static518.aClass115_14.anInt3523, Static518.aClass115_14.anInt3474, Static190.anInt3970, Static518.aClass115_14.anInt3481, Static518.aClass115_14.anInt3502, Static285.aRandom1);
			Static268.method4360(Static52.anIntArray140[0], Static52.anIntArray140[2], Static52.anIntArray140[3], Static52.anIntArray140[1]);
		} else if (Static51.aClass115_1 != null && Static538.aClass263_5 == Static379.aClass263_4) {
			@Pc(230) int local230 = Static65.aClass91_4.method7460(Static86.anInt2258 + 4, Static23.anIntArray106, Static285.aRandom1, local36, Static149.anInt3333 + 16, Static117.anInt2739, Static367.aClass13Array24);
			Static268.method4360(Static86.anInt2258 + 4, local230 + Static195.aClass196_5.method4386(local36), 16, Static149.anInt3333);
		}
	}
}
