import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
	public int[] anIntArray214 = new int[1];

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "[I")
	public int[] anIntArray215 = new int[] { -1 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z[III[I)J")
	private long method2194(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class289.aLongArray13;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local17 >>> 8 ^ local7[(int) ((local17 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local17 = local33 >>> 8 ^ local7[(int) (((long) arg2 ^ local33) & 0xFFL)];
		for (@Pc(49) int local49 = 0; local49 < arg3.length; local49++) {
			local17 = local17 >>> 8 ^ local7[(int) ((local17 ^ (long) (arg3[local49] >> 24)) & 0xFFL)];
			local17 = local17 >>> 8 ^ local7[(int) (((long) (arg3[local49] >> 16) ^ local17) & 0xFFL)];
			local17 = local7[(int) (((long) (arg3[local49] >> 8) ^ local17) & 0xFFL)] ^ local17 >>> 8;
			local17 = local17 >>> 8 ^ local7[(int) (((long) arg3[local49] ^ local17) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				local17 = local7[(int) (((long) arg1[local130] ^ local17) & 0xFFL)] ^ local17 >>> 8;
			}
		}
		return local17 >>> 8 ^ local7[(int) ((local17 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rm;ZLclient!r;IIILclient!hq;IBI)Lclient!da;")
	public Class33 method2195(@OriginalArg(0) Class300 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class148 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class33 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class61 local11 = null;
		if (arg6 != -1) {
			local11 = Static380.aClass221_3.method4666(arg6);
		}
		@Pc(22) int[] local22 = this.anIntArray215;
		if (local11 != null && local11.anIntArray125 != null) {
			local22 = new int[local11.anIntArray125.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray125.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray125[local34];
				if (local41 >= 0 && this.anIntArray215.length > local41) {
					local22[local34] = this.anIntArray215[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(98) int local98 = 0;
		@Pc(100) Class2_Sub2_Sub15 local100 = null;
		@Pc(102) Class2_Sub2_Sub15 local102 = null;
		if (arg5 != null) {
			local9 = 2080;
			local88 = arg5.anIntArray254[arg4];
			@Pc(117) int local117 = local88 >>> 16;
			local88 &= 0xFFFF;
			local100 = Static117.aClass18_1.method292(local117);
			if (local100 != null) {
				local82 = local100.method5302(local88) | false;
				local80 = local100.method5305(local88) | false;
				local86 = local100.method5303(local88) | false;
				local84 = arg5.aBoolean220 | false;
			}
			if ((arg5.aBoolean219 || Static269.aBoolean328) && arg7 != -1 && arg7 < arg5.anIntArray254.length) {
				local98 = arg5.anIntArray253[arg4];
				local90 = arg5.anIntArray254[arg7];
				@Pc(182) int local182 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local182 == local117) {
					local102 = local100;
				} else {
					local102 = Static117.aClass18_1.method292(local90 >>> 16);
				}
				if (local102 != null) {
					local82 |= local102.method5302(local90);
					local80 |= local102.method5305(local90);
					local86 |= local102.method5303(local90);
				}
			}
			if (local82) {
				local9 = 2208;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local84) {
				local9 |= 0x200;
			}
			if (local86) {
				local9 |= 0x400;
			}
		}
		@Pc(263) long local263 = this.method2194(arg1, arg0 == null ? null : arg0.anIntArray503, arg6, local22);
		if (Static409.aClass21_59 != null) {
			local7 = (Class33) Static409.aClass21_59.method324(local263);
		}
		if (local7 == null || arg2.method6881(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method6846(local9, local7.PA());
			}
			@Pc(289) int local289 = local9;
			@Pc(291) boolean local291 = false;
			for (@Pc(293) int local293 = 0; local293 < local22.length; local293++) {
				if (local22[local293] != -1 && !Static466.aClass130_2.method2311(local22[local293]).method3321(arg1)) {
					local291 = true;
				}
			}
			if (local291) {
				return null;
			}
			@Pc(326) Class13[] local326 = new Class13[local22.length];
			for (@Pc(328) int local328 = 0; local328 < local22.length; local328++) {
				if (local22[local328] != -1) {
					local326[local328] = Static466.aClass130_2.method2311(local22[local328]).method3317(arg1);
				}
			}
			@Pc(383) int local383;
			@Pc(390) int local390;
			if (local11 != null && local11.anIntArrayArray19 != null) {
				for (@Pc(363) int local363 = 0; local363 < local11.anIntArrayArray19.length; local363++) {
					if (local11.anIntArrayArray19[local363] != null && local326[local363] != null) {
						local383 = local11.anIntArrayArray19[local363][0];
						local390 = local11.anIntArrayArray19[local363][1];
						@Pc(397) int local397 = local11.anIntArrayArray19[local363][2];
						@Pc(404) int local404 = local11.anIntArrayArray19[local363][3];
						@Pc(411) int local411 = local11.anIntArrayArray19[local363][4];
						@Pc(418) int local418 = local11.anIntArrayArray19[local363][5];
						if (local404 != 0 || local411 != 0 || local418 != 0) {
							local326[local363].method238(local411, local418, local404);
						}
						if (local383 != 0 || local390 != 0 || local397 != 0) {
							local326[local363].method237(local383, local397, local390);
						}
					}
				}
			}
			@Pc(462) Class13 local462 = new Class13(local326, local326.length);
			if (arg0 != null) {
				local289 = local9 | 0x4000;
			}
			local7 = arg2.method6839(local462, local289, Static88.anInt1491, 64, 850);
			if (arg0 != null) {
				for (local383 = 0; local383 < 5; local383++) {
					for (local390 = 0; local390 < Static320.aShortArrayArrayArray3.length; local390++) {
						if (arg0.anIntArray503[local383] < Static320.aShortArrayArrayArray3[local390][local383].length) {
							local7.d(Static250.aShortArrayArray12[local390][local383], Static320.aShortArrayArrayArray3[local390][local383][arg0.anIntArray503[local383]]);
						}
					}
				}
			}
			if (Static409.aClass21_59 != null) {
				local7.SA(local9);
				Static409.aClass21_59.method317(local7, local263);
			}
		}
		if (arg5 == null || local100 == null) {
			return local7;
		} else {
			@Pc(545) Class33 local545 = local7.method7200((byte) 1, local9, true);
			local545.method7184(local98, local88, 0, local102, local100, arg3 - 1, local90, arg5.aBoolean220);
			return local545;
		}
	}
}
