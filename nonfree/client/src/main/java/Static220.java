import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
	public static int anInt4036 = 0;

	@OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
	public static int anInt4038 = -1;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
	public static final int[] anIntArray285 = new int[13];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static95.method5202(arg2)) {
			if (Static166.aClass107ArrayArray2[arg2] == null) {
				Static249.method3534(arg7, Static45.aClass107ArrayArray1[arg2], arg6, -1, arg1, arg5, arg3, arg0, arg4);
			} else {
				Static249.method3534(arg7, Static166.aClass107ArrayArray2[arg2], arg6, -1, arg1, arg5, arg3, arg0, arg4);
			}
		} else if (arg7 == -1) {
			for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
				Static179.aBooleanArray69[local25] = true;
			}
		} else {
			Static179.aBooleanArray69[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BILclient!jp;)Z")
	public static boolean method3160(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method2946(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg1.method2946(1) != 0) {
				method3160(arg0, arg1);
			}
			local28 = arg1.method2946(6);
			local33 = arg1.method2946(6);
			@Pc(45) boolean local45 = arg1.method2946(1) == 1;
			if (local45) {
				Static438.anIntArray496[Static398.anInt6391++] = arg0;
			}
			if (Static399.aClass11_Sub1_Sub3_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class70 local68 = Static393.aClass70Array1[arg0];
			@Pc(76) Class11_Sub1_Sub3_Sub2 local76 = Static399.aClass11_Sub1_Sub3_Sub2Array1[arg0] = new Class11_Sub1_Sub3_Sub2();
			local76.anInt3279 = arg0;
			if (Static351.aClass1_Sub19Array1[arg0] != null) {
				local76.method2649(Static351.aClass1_Sub19Array1[arg0]);
			}
			local76.method2642(local68.anInt1295, true);
			local76.anInt3318 = local68.anInt1296;
			local102 = local68.anInt1299;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			local76.aBoolean328 = local68.aBoolean150;
			local76.aByteArray35[0] = Static348.aByteArray79[arg0];
			local76.aByte90 = (byte) local106;
			local76.method2655((local116 << 6) - (Static47.anInt676 - local33), -Static315.anInt5207 + local28 + (local112 << 6));
			local76.aBoolean327 = false;
			Static393.aClass70Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method2946(2);
			local33 = Static393.aClass70Array1[arg0].anInt1299;
			Static393.aClass70Array1[arg0].anInt1299 = (((local33 >> 28) + local28 & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(218) int local218;
			@Pc(223) int local223;
			@Pc(232) int local232;
			if (local8 != 2) {
				local28 = arg1.method2946(18);
				local33 = local28 >> 16;
				local218 = local28 >> 8 & 0xFF;
				local223 = local28 & 0xFF;
				local232 = Static393.aClass70Array1[arg0].anInt1299;
				local102 = local33 + (local232 >> 28) & 0x3;
				local106 = local218 + (local232 >> 14) & 0xFF;
				local112 = local232 + local223 & 0xFF;
				Static393.aClass70Array1[arg0].anInt1299 = local112 + (local106 << 14) + (local102 << 28);
				return false;
			}
			local28 = arg1.method2946(5);
			local33 = local28 >> 3;
			local218 = local28 & 0x7;
			local223 = Static393.aClass70Array1[arg0].anInt1299;
			local232 = (local223 >> 28) + local33 & 0x3;
			local102 = local223 >> 14 & 0xFF;
			local106 = local223 & 0xFF;
			if (local218 == 0) {
				local106--;
				local102--;
			}
			if (local218 == 1) {
				local106--;
			}
			if (local218 == 2) {
				local102++;
				local106--;
			}
			if (local218 == 3) {
				local102--;
			}
			if (local218 == 4) {
				local102++;
			}
			if (local218 == 5) {
				local102--;
				local106++;
			}
			if (local218 == 6) {
				local106++;
			}
			if (local218 == 7) {
				local106++;
				local102++;
			}
			Static393.aClass70Array1[arg0].anInt1299 = (local232 << 28) + (local102 << 14) + local106;
			return false;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)V")
	public static void method3162(@OriginalArg(1) int arg0) {
		Static251.method3546();
		@Pc(11) int local11 = Static186.aClass233_1.method4876(arg0).anInt6811;
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static32.aClass4_1.anIntArray2[arg0];
		if (local11 == 5) {
			Static371.anInt5991 = local22;
		}
		if (local11 == 6) {
			Static63.anInt976 = local22;
		}
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(III)Lclient!hm;")
	public static Class107 method3163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class107 local12 = Static55.method754(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass107Array2 == null || arg0 >= local12.aClass107Array2.length) {
			return null;
		} else {
			return local12.aClass107Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	public static void method3164() {
		Static170.aBoolean282 = false;
		Static171.method2271(Static25.anInt358, Static64.anInt995, Static361.anInt5833, Static273.anInt4719);
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(III)Z")
	public static boolean method3165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
