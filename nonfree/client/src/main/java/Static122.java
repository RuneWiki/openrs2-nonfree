import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
	public static final int[] anIntArray257 = new int[256];

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
	public static int anInt2759 = -50;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Lclient!sn;")
	public static Class2_Sub4 method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub4_1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!vm;Lclient!wm;IILclient!ol;IIZLclient!vm;ZI)Lclient!lg;")
	public static Class60 method2459(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class148 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class92 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class60 local15 = Static320.method5292(arg8, arg0, arg5, arg10, arg4, arg3, arg6);
		if (local15 != null) {
			return local15;
		}
		@Pc(31) Class142 local31 = Static247.method4270(arg6);
		@Pc(43) int local43;
		if (arg10 > 1 && local31.anIntArray373 != null) {
			@Pc(41) int local41 = -1;
			for (local43 = 0; local43 < 10; local43++) {
				if (local31.anIntArray374[local43] <= arg10 && local31.anIntArray374[local43] != 0) {
					local41 = local31.anIntArray373[local43];
				}
			}
			if (local41 != -1) {
				local31 = Static247.method4270(local41);
			}
		}
		@Pc(89) Class153 local89 = Static169.method3173(Static135.aClass11_63, local31.anInt4481);
		if (local89 == null) {
			return null;
		}
		if (local31.aShortArray70 != null) {
			for (local43 = 0; local43 < local31.aShortArray70.length; local43++) {
				if (local31.aByteArray54 == null || local31.aByteArray54.length <= local43) {
					local89.method4172(local31.aShortArray70[local43], local31.aShortArray68[local43]);
				} else {
					local89.method4172(local31.aShortArray70[local43], Static106.aShortArray47[local31.aByteArray54[local43] & 0xFF]);
				}
			}
		}
		if (local31.aShortArray71 != null) {
			for (local43 = 0; local43 < local31.aShortArray71.length; local43++) {
				local89.method4167(local31.aShortArray71[local43], local31.aShortArray69[local43]);
			}
		}
		if (arg5 != null) {
			for (local43 = 0; local43 < 5; local43++) {
				if (Static335.aShortArrayArray12[local43].length > arg5.anIntArray390[local43]) {
					local89.method4172(Static218.aShortArray72[local43], Static335.aShortArrayArray12[local43][arg5.anIntArray390[local43]]);
				}
				if (Static101.aShortArrayArray8[local43].length > arg5.anIntArray390[local43]) {
					local89.method4172(Static311.aShortArray112[local43], Static101.aShortArrayArray8[local43][arg5.anIntArray390[local43]]);
				}
			}
		}
		@Pc(228) short local228 = 1024;
		@Pc(230) boolean local230 = false;
		if (local31.anInt4514 != 128 || local31.anInt4504 != 128 || local31.anInt4488 != 128) {
			local228 = 1031;
			local230 = true;
		}
		@Pc(266) Class5 local266 = arg1.method4513(local89, local228, 0, local31.anInt4492 + 64, local31.anInt4461 + 768);
		if (!local266.method4017()) {
			return null;
		}
		if (local230) {
			local266.method4015(local31.anInt4514, local31.anInt4504, local31.anInt4488);
		}
		@Pc(283) Class60 local283 = null;
		if (local31.anInt4468 != -1) {
			local283 = method2459(0, arg1, arg2, 1, 0, arg5, local31.anInt4464, true, arg8, true, 10);
			if (local283 == null) {
				return null;
			}
		} else if (local31.anInt4470 != -1) {
			local283 = method2459(arg0, arg1, arg2, arg3, 0, arg5, local31.anInt4462, true, arg8, false, arg10);
			if (local283 == null) {
				return null;
			}
		}
		@Pc(334) int local334 = local31.anInt4472;
		arg1.method4520(16, 16, 512, 512);
		if (arg9) {
			local334 = (int) ((double) local334 * 1.5D);
		} else if (arg3 == 2) {
			local334 = (int) ((double) local334 * 1.04D);
		}
		@Pc(364) Class23 local364 = arg1.method4538();
		local364.method5090();
		arg1.method4530(local364);
		arg1.method4536(1.0F);
		arg1.method4457(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(383) Class23 local383 = arg1.method4466();
		local383.method5098(-local31.anInt4490 << 3);
		local383.method5095(local31.anInt4467 << 3);
		local383.method5089(local31.anInt4513, (Class4_Sub4_Sub25.anIntArray384[local31.anInt4474 << 3] * local334 >> 15) - (local266.method4020() / 2 - local31.anInt4497), (Class4_Sub4_Sub25.anIntArray383[local31.anInt4474 << 3] * local334 >> 15) - -local31.anInt4497);
		local383.method5094(local31.anInt4474 << 3);
		@Pc(441) int local441 = arg1.method4494();
		@Pc(444) int local444 = arg1.method4484();
		arg1.method4464(50, Integer.MAX_VALUE);
		arg1.method4486();
		arg1.method4467();
		arg1.method4436(0, 0, 36, 32, 0, 0);
		local266.method4029(local383, null, 1);
		arg1.method4464(local441, local444);
		@Pc(476) int[] local476 = arg1.method4441();
		if (arg3 >= 1) {
			local476 = Static30.method501(-16777215, local476);
			if (arg3 >= 2) {
				local476 = Static30.method501(-1, local476);
			}
		}
		if (arg0 != 0) {
			Static104.method5668(arg0, local476);
		}
		arg1.method4537(local476, 36, 36, 32).method5675(0, 0);
		if (local31.anInt4468 != -1) {
			local283.method5675(0, 0);
		} else if (local31.anInt4470 != -1) {
			local283.method5675(0, 0);
		}
		if (arg4 == 1 || arg4 == 2 && (local31.anInt4459 == 1 || arg10 != 1) && arg10 != -1) {
			arg2.method4050(-256, Static21.method388(arg10), 0, -16777215, 9);
		}
		local476 = arg1.method4441();
		for (@Pc(568) int local568 = 0; local568 < local476.length; local568++) {
			if ((local476[local568] & 0xFFFFFF) == 0) {
				local476[local568] = 0;
			} else {
				local476[local568] |= 0xFF000000;
			}
		}
		@Pc(612) Class60 local612;
		if (arg7) {
			local612 = arg1.method4537(local476, 36, 36, 32);
		} else {
			local612 = arg8.method4537(local476, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(628) Class30 local628 = new Class30();
			local628.aBoolean30 = arg5 != null;
			local628.anInt487 = arg10;
			local628.anInt497 = arg6;
			local628.anInt494 = arg4;
			local628.anInt490 = arg0;
			local628.anInt496 = arg8.anInt5370;
			local628.anInt488 = arg3;
			Static234.aClass85_1.method2011(local628, local612);
		}
		return local612;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!am;Lclient!am;Z)V")
	public static void method2461(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		Static256.aClass11_110 = arg1;
		Static322.aClass11_143 = arg0;
	}
}
