import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "Lclient!re;")
	public static Class1_Sub26_Sub1 aClass1_Sub26_Sub1_2 = new Class1_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!jb;)V")
	public static void method3150(@OriginalArg(1) Class28 arg0) {
		Static213.aClass28_75 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!eg;B)V")
	public static void method3151(@OriginalArg(0) Class5_Sub5 arg0) {
		arg0.anInt3005 = arg0.anInt3022;
		if (arg0.anInt3006 == 0) {
			arg0.anInt3019 = 0;
			return;
		}
		if (arg0.anInt3048 != -1 && arg0.anInt2996 == 0) {
			@Pc(29) Class96 local29 = Static2.method88(arg0.anInt3048);
			if (arg0.anInt3041 > 0 && local29.anInt3652 == 0) {
				arg0.anInt3019++;
				return;
			}
			if (arg0.anInt3041 <= 0 && local29.anInt3653 == 0) {
				arg0.anInt3019++;
				return;
			}
		}
		@Pc(64) int local64 = arg0.anInt3021;
		@Pc(67) int local67 = arg0.anInt3044;
		@Pc(83) int local83 = arg0.anIntArray260[arg0.anInt3006 - 1] * 128 + arg0.anInt2997 * 64;
		@Pc(98) int local98 = arg0.anIntArray256[arg0.anInt3006 - 1] * 128 + arg0.anInt2997 * 64;
		if (local83 - local64 > 256 || local83 - local64 < -256 || local98 - local67 > 256 || local98 - local67 < -256) {
			arg0.anInt3044 = local98;
			arg0.anInt3021 = local83;
			return;
		}
		if (local64 < local83) {
			if (local67 < local98) {
				arg0.anInt2994 = 1280;
			} else if (local67 <= local98) {
				arg0.anInt2994 = 1536;
			} else {
				arg0.anInt2994 = 1792;
			}
		} else if (local64 > local83) {
			if (local67 < local98) {
				arg0.anInt2994 = 768;
			} else if (local98 < local67) {
				arg0.anInt2994 = 256;
			} else {
				arg0.anInt2994 = 512;
			}
		} else if (local98 > local67) {
			arg0.anInt2994 = 1024;
		} else if (local67 > local98) {
			arg0.anInt2994 = 0;
		}
		@Pc(213) int local213 = 4;
		@Pc(222) int local222 = arg0.anInt2994 - arg0.anInt3040 & 0x7FF;
		if (local222 > 1024) {
			local222 -= 2048;
		}
		@Pc(231) int local231 = arg0.anInt3035;
		@Pc(239) boolean local239 = true;
		if (local222 >= -256 && local222 <= 256) {
			local231 = arg0.anInt3037;
		} else if (local222 >= 256 && local222 < 768) {
			local231 = arg0.anInt3020;
		} else if (local222 >= -768 && local222 <= -256) {
			local231 = arg0.anInt3052;
		}
		if (local231 == -1) {
			local231 = arg0.anInt3037;
		}
		arg0.anInt3005 = local231;
		if (arg0 instanceof Class5_Sub5_Sub2) {
			local239 = ((Class5_Sub5_Sub2) arg0).aClass30_1.aBoolean95;
		}
		if (local239) {
			if (arg0.anInt3040 != arg0.anInt2994 && arg0.anInt3025 == -1 && arg0.anInt3004 != 0) {
				local213 = 2;
			}
			if (arg0.anInt3006 > 2) {
				local213 = 6;
			}
			if (arg0.anInt3006 > 3) {
				local213 = 8;
			}
			if (arg0.anInt3019 > 0 && arg0.anInt3006 > 1) {
				arg0.anInt3019--;
				local213 = 8;
			}
		} else {
			if (arg0.anInt3006 > 1) {
				local213 = 6;
			}
			if (arg0.anInt3006 > 2) {
				local213 = 8;
			}
			if (arg0.anInt3019 > 0 && arg0.anInt3006 > 1) {
				local213 = 8;
				arg0.anInt3019--;
			}
		}
		if (arg0.aBooleanArray21[arg0.anInt3006 - 1]) {
			local213 <<= 0x1;
		}
		if (local83 > local64) {
			arg0.anInt3021 += local213;
			if (arg0.anInt3021 > local83) {
				arg0.anInt3021 = local83;
			}
		} else if (local83 < local64) {
			arg0.anInt3021 -= local213;
			if (local83 > arg0.anInt3021) {
				arg0.anInt3021 = local83;
			}
		}
		if (local98 > local67) {
			arg0.anInt3044 += local213;
			if (local98 < arg0.anInt3044) {
				arg0.anInt3044 = local98;
			}
		} else if (local67 > local98) {
			arg0.anInt3044 -= local213;
			if (local98 > arg0.anInt3044) {
				arg0.anInt3044 = local98;
			}
		}
		if (local213 >= 8 && arg0.anInt3037 == arg0.anInt3005 && arg0.anInt3002 != -1) {
			arg0.anInt3005 = arg0.anInt3002;
		}
		if (local83 == arg0.anInt3021 && local98 == arg0.anInt3044) {
			if (arg0.anInt3041 > 0) {
				arg0.anInt3041--;
			}
			arg0.anInt3006--;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	public static void method3153() {
		Static203.anIntArray10 = new int[104];
		Static114.anIntArray233 = new int[104];
		Static16.anIntArray37 = new int[104];
		Static141.anIntArray265 = new int[104];
		Static38.anIntArray83 = new int[104];
		Static203.anInt207 = 99;
		Static23.aByteArrayArrayArray2 = new byte[4][104][104];
		Static88.aByteArrayArrayArray8 = new byte[4][105][105];
		Static129.aByteArrayArrayArray9 = new byte[4][104][104];
		Static213.aByteArrayArrayArray13 = new byte[4][104][104];
		Static13.anIntArrayArrayArray1 = new int[4][105][105];
		Static140.aByteArrayArrayArray4 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Z")
	public static boolean method3154() {
		return Static116.anInt2569 == 0 ? Static218.aClass1_Sub6_Sub2_3.method1448() : true;
	}
}
