import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!le", name = "dc", descriptor = "I")
	public static int anInt2994;

	@OriginalMember(owner = "client!le", name = "fc", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!le", name = "hc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!le", name = "Nb", descriptor = "Z")
	public static boolean aBoolean245 = true;

	@OriginalMember(owner = "client!le", name = "Pb", descriptor = "Lclient!gd;")
	public static Class61 aClass61_24 = new Class61(64);

	@OriginalMember(owner = "client!le", name = "Qb", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!le", name = "Rb", descriptor = "[Lclient!wf;")
	public static Class8_Sub1_Sub22[] aClass8_Sub1_Sub22Array1 = new Class8_Sub1_Sub22[14];

	@OriginalMember(owner = "client!le", name = "Wb", descriptor = "[Lclient!hn;")
	public static Class76[] aClass76Array2 = new Class76[14];

	@OriginalMember(owner = "client!le", name = "cc", descriptor = "I")
	public static int anInt2993 = 0;

	@OriginalMember(owner = "client!le", name = "ec", descriptor = "S")
	public static short aShort17 = 256;

	@OriginalMember(owner = "client!le", name = "gc", descriptor = "I")
	public static int anInt2995 = 0;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "(I)V")
	public static void method2386() {
		Static25.anIntArray45 = null;
		Static135.anIntArray225 = null;
		Static92.anIntArray130 = null;
		Static225.anIntArray345 = null;
		Static232.aByteArrayArray15 = null;
		anIntArray236 = null;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(ZI)V")
	public static void method2393(@OriginalArg(1) int arg0) {
		@Pc(11) Class8_Sub1_Sub6 local11 = Static181.method2779(8, arg0);
		local11.method929();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!he;III)V")
	public static void method2394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class70 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg7 & 0x3;
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (local9 == 1 || local9 == 3) {
			local25 = arg4.anInt2065;
			local22 = arg4.anInt2063;
		} else {
			local22 = arg4.anInt2065;
			local25 = arg4.anInt2063;
		}
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (local22 + arg3 > 104) {
			local40 = arg3;
			local44 = arg3 + 1;
		} else {
			local44 = (local22 + 1 >> 1) + arg3;
			local40 = (local22 >> 1) + arg3;
		}
		@Pc(68) int local68 = (local22 << 6) + (arg3 << 7);
		@Pc(76) int local76 = (local25 << 6) + (arg5 << 7);
		@Pc(97) int local97;
		@Pc(91) int local91;
		if (local25 + arg5 <= 104) {
			local91 = (local25 + 1 >> 1) + arg5;
			local97 = arg5 + (local25 >> 1);
		} else {
			local91 = arg5 + 1;
			local97 = arg5;
		}
		@Pc(109) int[][] local109 = Static195.anIntArrayArrayArray7[arg1];
		@Pc(136) int local136 = local109[local44][local91] + local109[local44][local97] + local109[local40][local97] + local109[local40][local91] >> 2;
		@Pc(138) int local138 = 0;
		@Pc(147) int[][] local147;
		if (arg1 != 0) {
			local147 = Static195.anIntArrayArrayArray7[0];
			local138 = local136 - (local147[local40][local91] + local147[local40][local97] + local147[local44][local97] + local147[local44][local91] >> 2);
		}
		local147 = null;
		if (arg1 < 3) {
			local147 = Static195.anIntArrayArrayArray7[arg1 + 1];
		}
		@Pc(210) Class77 local210 = arg4.method1584(false, null, local136, arg6, arg7, local147, local76, true, local68, local109);
		Static6.method46(local210.aClass43_Sub2_3, local68 - arg0, local138, local76 - arg2);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!rj;B)V")
	public static void method2396(@OriginalArg(0) Class145 arg0) {
		Static59.aClass145_1 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIIIIIIIZ)V")
	public static void method2397(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) int local8 = arg4 - arg2;
		@Pc(16) int local16 = arg6 - arg5;
		@Pc(25) int local25 = (arg8 - arg1 << 16) / local8;
		@Pc(33) int local33 = (arg7 - arg3 << 16) / local16;
		Static35.method559(arg1, local25, arg6, arg5, arg0, arg2, local33, arg4, arg3);
	}
}
