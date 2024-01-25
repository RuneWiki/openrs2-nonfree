import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "Lclient!ua;")
	public static Class310 aClass310_1;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "[I")
	public static int[] anIntArray225 = null;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZI)Lclient!le;")
	public static Class194 method2601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class194 local7 = new Class194();
		local7.anInt5595 = arg0 + 1 + 5;
		local7.anInt5586 = arg1 + 5 + 1;
		local7.anInt5598 = -1;
		local7.anInt5584 = -1;
		local7.anIntArrayArray40 = new int[local7.anInt5586][local7.anInt5595];
		local7.method4812();
		return local7;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IB)Lclient!oda;")
	public static Class235 method2602(@OriginalArg(0) int arg0) {
		@Pc(10) Class235 local10 = (Class235) Static21.aClass245_10.method6082((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static579.aClass168_97.method4435(arg0, 0);
		local10 = new Class235();
		if (local20 != null) {
			local10.method5838(new Class6_Sub26(local20), arg0);
		}
		Static21.aClass245_10.method6075(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!oa;IILclient!fa;Lclient!ep;IIZ)V")
	public static void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) Class93 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(23) Class137 local23 = Static17.aClass42_3.method1147(arg6);
		if (local23 == null || !local23.aBoolean351 || !local23.method3765(Static435.aClass234_1)) {
			return;
		}
		@Pc(43) int local43;
		if (local23.anIntArray278 != null) {
			@Pc(41) int[] local41 = new int[local23.anIntArray278.length];
			@Pc(55) int local55;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				if (Static84.anInt1994 == 4) {
					local55 = (int) Static412.aFloat175 & 0x3FFF;
				} else {
					local55 = Static47.anInt1291 + (int) Static412.aFloat175 & 0x3FFF;
				}
				@Pc(66) int local66 = Class179.anIntArray756[local55];
				@Pc(70) int local70 = Class179.anIntArray757[local55];
				if (Static84.anInt1994 != 4) {
					local66 = local66 * 256 / (Static146.anInt8629 + 256);
					local70 = local70 * 256 / (Static146.anInt8629 + 256);
				}
				local41[local43 * 2] = arg5.anInt2777 / 2 + arg2 + ((local23.anIntArray278[local43 * 2] * 4 + arg3) * local70 + local66 * (arg7 + local23.anIntArray278[local43 * 2 + 1] * 4) >> 14);
				local41[local43 * 2 + 1] = arg5.anInt2738 / 2 + arg0 - ((arg7 - -(local23.anIntArray278[local43 * 2 + 1] * 4)) * local70 + -(local66 * (local23.anIntArray278[local43 * 2] * 4 + arg3)) >> 14);
			}
			Static182.method3575(arg1, local41, local23.anInt4329, arg5.anIntArray212, arg5.anIntArray210);
			for (local55 = 0; local55 < local41.length / 2 - 1; local55++) {
				arg1.method5456(local41[local55 * 2], local41[local55 * 2 + 1], local41[local55 * 2 + 2], local41[(local55 + 1) * 2 + 1], local23.anInt4310, arg4, arg2, arg0);
			}
			arg1.method5456(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local23.anInt4310, arg4, arg2, arg0);
		}
		@Pc(275) Class66 local275 = null;
		if (local23.anInt4328 != -1) {
			local275 = local23.method3764(false, arg1);
			if (local275 != null) {
				Static429.method6568(local275, arg0, arg2, arg4, arg7, arg3, arg5);
			}
		}
		if (local23.aString46 == null) {
			return;
		}
		local43 = 0;
		if (local275 != null) {
			local43 = local275.b();
		}
		@Pc(309) Class73 local309 = Static467.aClass73_3;
		@Pc(311) Class82 local311 = Static309.aClass82_6;
		if (local23.anInt4313 == 1) {
			local311 = Static387.aClass82_9;
			local309 = Static42.aClass73_1;
		}
		if (local23.anInt4313 == 2) {
			local309 = Static489.aClass73_5;
			local311 = Static1.aClass82_1;
		}
		Static140.method2626(local23.aString46, local43, arg4, local23.anInt4314, arg7, arg5, local311, arg0, arg2, arg3, local309);
		return;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(CB)B")
	public static byte method2605(@OriginalArg(0) char arg0) {
		@Pc(47) byte local47;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local47 = (byte) arg0;
		} else if (arg0 == '€') {
			local47 = -128;
		} else if (arg0 == '‚') {
			local47 = -126;
		} else if (arg0 == 'ƒ') {
			local47 = -125;
		} else if (arg0 == '„') {
			local47 = -124;
		} else if (arg0 == '…') {
			local47 = -123;
		} else if (arg0 == '†') {
			local47 = -122;
		} else if (arg0 == '‡') {
			local47 = -121;
		} else if (arg0 == 'ˆ') {
			local47 = -120;
		} else if (arg0 == '‰') {
			local47 = -119;
		} else if (arg0 == 'Š') {
			local47 = -118;
		} else if (arg0 == '‹') {
			local47 = -117;
		} else if (arg0 == 'Œ') {
			local47 = -116;
		} else if (arg0 == 'Ž') {
			local47 = -114;
		} else if (arg0 == '‘') {
			local47 = -111;
		} else if (arg0 == '’') {
			local47 = -110;
		} else if (arg0 == '“') {
			local47 = -109;
		} else if (arg0 == '”') {
			local47 = -108;
		} else if (arg0 == '•') {
			local47 = -107;
		} else if (arg0 == '–') {
			local47 = -106;
		} else if (arg0 == '—') {
			local47 = -105;
		} else if (arg0 == '˜') {
			local47 = -104;
		} else if (arg0 == '™') {
			local47 = -103;
		} else if (arg0 == 'š') {
			local47 = -102;
		} else if (arg0 == '›') {
			local47 = -101;
		} else if (arg0 == 'œ') {
			local47 = -100;
		} else if (arg0 == 'ž') {
			local47 = -98;
		} else if (arg0 == 'Ÿ') {
			local47 = -97;
		} else {
			local47 = 63;
		}
		return local47;
	}
}
