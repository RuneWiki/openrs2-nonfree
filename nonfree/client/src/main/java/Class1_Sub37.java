import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
	public int[] anIntArray589 = new int[] { -1 };

	@OriginalMember(owner = "client!q", name = "s", descriptor = "[I")
	public int[] anIntArray591 = new int[1];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([IB[IIZ)J")
	private long method4285(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class43_Sub2.aLongArray4;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg1[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local41] >> 8)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local41] ^ local9) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg0[local130] ^ local9) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg3 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLclient!pp;ILclient!cu;IIIILclient!tq;I)Lclient!ns;")
	public Class22 method4286(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class164 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class22 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class8 local11 = null;
		if (arg5 != -1) {
			local11 = Static160.aClass163_1.method3328(arg5);
		}
		@Pc(23) int[] local23 = this.anIntArray589;
		if (local11 != null && local11.anIntArray14 != null) {
			local23 = new int[local11.anIntArray14.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray14.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray14[local35];
				if (local42 >= 0 && this.anIntArray589.length > local42) {
					local23[local35] = this.anIntArray589[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(94) Class1_Sub6_Sub15 local94 = null;
		@Pc(96) Class1_Sub6_Sub15 local96 = null;
		if (arg1 != null) {
			local9 = 1056;
			local88 = arg1.anIntArray579[arg4];
			@Pc(111) int local111 = local88 >>> 16;
			local88 &= 0xFFFF;
			local94 = Static25.aClass67_1.method1221(local111);
			if (local94 != null) {
				local84 = local94.method5015(local88) | false;
				local77 = local94.method5014(local88) | false;
				local86 = arg1.aBoolean466 | false;
			}
			if ((arg1.aBoolean465 || Static261.aBoolean446) && arg2 != -1 && arg1.anIntArray579.length > arg2) {
				local92 = arg1.anIntArray582[arg4];
				local90 = arg1.anIntArray579[arg2];
				@Pc(172) int local172 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local172 == local111) {
					local96 = local94;
				} else {
					local96 = Static25.aClass67_1.method1221(local90 >>> 16);
				}
				if (local96 != null) {
					local84 |= local96.method5015(local90);
					local77 |= local96.method5014(local90);
				}
			}
			if (local84) {
				local9 = 1184;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local86) {
				local9 |= 0x200;
			}
		}
		@Pc(236) long local236 = this.method4285(arg3 == null ? null : arg3.anIntArray148, local23, arg5, arg0);
		if (Static240.aClass227_32 != null) {
			local7 = (Class22) Static240.aClass227_32.method4863(local236);
		}
		if (local7 == null || arg6.method5396(local7.method1563(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method5391(local9, local7.method1563());
			}
			@Pc(264) int local264 = local9;
			@Pc(266) boolean local266 = false;
			for (@Pc(268) int local268 = 0; local268 < local23.length; local268++) {
				if (local23[local268] != -1 && !Static263.aClass102_2.method2172(local23[local268]).method1656(arg0)) {
					local266 = true;
				}
			}
			if (local266) {
				return null;
			}
			@Pc(305) Class238[] local305 = new Class238[local23.length];
			for (@Pc(307) int local307 = 0; local307 < local23.length; local307++) {
				if (local23[local307] != -1) {
					local305[local307] = Static263.aClass102_2.method2172(local23[local307]).method1666(arg0);
				}
			}
			@Pc(364) int local364;
			if (local11 != null && local11.anIntArrayArray2 != null) {
				for (@Pc(344) int local344 = 0; local344 < local11.anIntArrayArray2.length; local344++) {
					if (local11.anIntArrayArray2[local344] != null && local305[local344] != null) {
						local364 = local11.anIntArrayArray2[local344][0];
						@Pc(371) int local371 = local11.anIntArrayArray2[local344][1];
						@Pc(378) int local378 = local11.anIntArrayArray2[local344][2];
						@Pc(385) int local385 = local11.anIntArrayArray2[local344][3];
						@Pc(392) int local392 = local11.anIntArrayArray2[local344][4];
						@Pc(399) int local399 = local11.anIntArrayArray2[local344][5];
						if (local385 != 0 || local392 != 0 || local399 != 0) {
							local305[local344].method5221(local392, local385, local399);
						}
						if (local364 != 0 || local371 != 0 || local378 != 0) {
							local305[local344].method5219(local371, local364, local378);
						}
					}
				}
			}
			if (arg3 != null) {
				local264 = local9 | 0x2000;
			}
			@Pc(452) Class238 local452 = new Class238(local305, local305.length);
			local7 = arg6.method5368(local452, local264, Static102.anInt3165, 64, 850);
			if (arg3 != null) {
				for (local364 = 0; local364 < 5; local364++) {
					if (arg3.anIntArray148[local364] < Static107.aShortArrayArray8[local364].length) {
						local7.method1581(Static228.aShortArray90[local364], Static107.aShortArrayArray8[local364][arg3.anIntArray148[local364]]);
					}
					if (Static35.aShortArrayArray1[local364].length > arg3.anIntArray148[local364]) {
						local7.method1581(Static307.aShortArray99[local364], Static35.aShortArrayArray1[local364][arg3.anIntArray148[local364]]);
					}
				}
			}
			if (Static240.aClass227_32 != null) {
				local7.method1602(local9);
				Static240.aClass227_32.method4865(local7, local236);
			}
		}
		if (arg1 == null || local94 == null) {
			return local7;
		} else {
			@Pc(540) Class22 local540 = local7.method1598((byte) 1, local9, true);
			local540.method1571(local94, 0, local96, local90, arg1.aBoolean466, local88, local92, arg7 - 1);
			return local540;
		}
	}
}
