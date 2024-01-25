import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "[I")
	public int[] anIntArray470 = new int[] { -1 };

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
	public int[] anIntArray471 = new int[1];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z[IZI[I)J")
	private long method4859(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class70.aLongArray1;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg2 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) (((long) (arg0[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg0[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local7[(int) (((long) arg3[local126] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!oj;IZIILclient!hu;IIILclient!nd;)Lclient!qh;")
	public Class159 method4862(@OriginalArg(0) Class48 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class102 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class158 arg7) {
		@Pc(7) Class159 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class227 local11 = null;
		if (arg3 != -1) {
			local11 = Static59.aClass194_1.method4754(arg3);
		}
		@Pc(22) int[] local22 = this.anIntArray470;
		if (local11 != null && local11.anIntArray546 != null) {
			local22 = new int[local11.anIntArray546.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray546.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray546[local34];
				if (local41 >= 0 && local41 < this.anIntArray470.length) {
					local22[local34] = this.anIntArray470[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = 0;
		@Pc(88) Class2_Sub7_Sub10 local88 = null;
		@Pc(90) Class2_Sub7_Sub10 local90 = null;
		if (arg4 != null) {
			local9 = 1056;
			local82 = arg4.anIntArray231[arg5];
			@Pc(105) int local105 = local82 >>> 16;
			local88 = Static333.aClass50_2.method1173(local105);
			local82 &= 0xFFFF;
			if (local88 != null) {
				local78 = local88.method2904(local82) | false;
				local76 = local88.method2909(local82) | false;
				local80 = arg4.aBoolean210 | false;
			}
			if ((arg4.aBoolean212 || Static314.aBoolean420) && arg6 != -1 && arg4.anIntArray231.length > arg6) {
				local84 = arg4.anIntArray231[arg6];
				local86 = arg4.anIntArray229[arg5];
				@Pc(162) int local162 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local162 == local105) {
					local90 = local88;
				} else {
					local90 = Static333.aClass50_2.method1173(local84 >>> 16);
				}
				if (local90 != null) {
					local78 |= local90.method2904(local84);
					local76 |= local90.method2909(local84);
				}
			}
			if (local78) {
				local9 = 1184;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
		}
		@Pc(232) long local232 = this.method4859(local22, arg1, arg3, arg7 == null ? null : arg7.anIntArray331);
		if (Static10.aClass41_72 != null) {
			local7 = (Class159) Static10.aClass41_72.method823(local232);
		}
		if (local7 == null || arg0.method2448(local7.method4951(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method2451(local9, local7.method4951());
			}
			@Pc(258) int local258 = local9;
			@Pc(260) boolean local260 = false;
			for (@Pc(262) int local262 = 0; local262 < local22.length; local262++) {
				if (local22[local262] != -1 && !Static57.aClass196_1.method4827(local22[local262]).method3839(arg1)) {
					local260 = true;
				}
			}
			if (local260) {
				return null;
			}
			@Pc(297) Class130[] local297 = new Class130[local22.length];
			for (@Pc(299) int local299 = 0; local299 < local22.length; local299++) {
				if (local22[local299] != -1) {
					local297[local299] = Static57.aClass196_1.method4827(local22[local299]).method3835(arg1);
				}
			}
			@Pc(355) int local355;
			if (local11 != null && local11.anIntArrayArray56 != null) {
				for (@Pc(335) int local335 = 0; local335 < local11.anIntArrayArray56.length; local335++) {
					if (local11.anIntArrayArray56[local335] != null && local297[local335] != null) {
						local355 = local11.anIntArrayArray56[local335][0];
						@Pc(362) int local362 = local11.anIntArrayArray56[local335][1];
						@Pc(369) int local369 = local11.anIntArrayArray56[local335][2];
						@Pc(376) int local376 = local11.anIntArrayArray56[local335][3];
						@Pc(383) int local383 = local11.anIntArrayArray56[local335][4];
						@Pc(390) int local390 = local11.anIntArrayArray56[local335][5];
						if (local376 != 0 || local383 != 0 || local390 != 0) {
							local297[local335].method3415(local376, local383, local390);
						}
						if (local355 != 0 || local362 != 0 || local369 != 0) {
							local297[local335].method3412(local369, local355, local362);
						}
					}
				}
			}
			@Pc(444) Class130 local444 = new Class130(local297, local297.length);
			if (arg7 != null) {
				local258 = local9 | 0x2000;
			}
			local7 = arg0.method2540(local444, local258, Static113.anInt5762, 64, 850);
			if (arg7 != null) {
				for (local355 = 0; local355 < 5; local355++) {
					if (arg7.anIntArray331[local355] < Static64.aShortArrayArray8[local355].length) {
						local7.method4964(Static257.aShortArray90[local355], Static64.aShortArrayArray8[local355][arg7.anIntArray331[local355]]);
					}
					if (Static1.aShortArrayArray30[local355].length > arg7.anIntArray331[local355]) {
						local7.method4964(Static57.aShortArray10[local355], Static1.aShortArrayArray30[local355][arg7.anIntArray331[local355]]);
					}
				}
			}
			if (Static10.aClass41_72 != null) {
				local7.method4958(local9);
				Static10.aClass41_72.method832(local232, local7);
			}
		}
		if (arg4 == null || local88 == null) {
			return local7;
		} else {
			@Pc(534) Class159 local534 = local7.method4927((byte) 1, local9, true);
			local534.method4955(0, local84, arg4.aBoolean210, local86, local90, arg2 - 1, local82, local88);
			return local534;
		}
	}
}
