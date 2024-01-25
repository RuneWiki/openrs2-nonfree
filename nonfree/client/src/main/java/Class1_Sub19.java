import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "[I")
	public int[] anIntArray248 = new int[1];

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "[I")
	public int[] anIntArray247 = new int[] { -1 };

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z[I[IBI)J")
	private long method2490(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class1_Sub4_Sub7.aLongArray1;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg3 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg1[local41]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local7[(int) (((long) arg2[local127] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BILclient!uo;IZIILclient!bo;ILclient!eq;)Lclient!ge;")
	public Class73 method2493(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class24 arg6, @OriginalArg(9) Class60 arg7) {
		@Pc(7) Class73 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class123 local11 = null;
		if (arg4 != -1) {
			local11 = Static26.method721(arg4);
		}
		@Pc(22) int[] local22 = this.anIntArray247;
		if (local11 != null && local11.anIntArray334 != null) {
			local22 = new int[local11.anIntArray334.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray334.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray334[local34];
				if (local41 >= 0 && this.anIntArray247.length > local41) {
					local22[local34] = this.anIntArray247[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) int local82 = -1;
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = 0;
		@Pc(96) Class1_Sub4_Sub19 local96 = null;
		@Pc(98) Class1_Sub4_Sub19 local98 = null;
		if (arg6 != null) {
			local9 = 1056;
			local82 = arg6.anIntArray90[arg2];
			@Pc(113) int local113 = local82 >>> 16;
			local96 = Static115.method2445(local113);
			local82 &= 0xFFFF;
			if (local96 != null) {
				local78 = local96.method4587(local82) | false;
				local76 = local96.method4593(local82) | false;
				local80 = arg6.aBoolean98 | false;
			}
			if ((arg6.aBoolean99 || Static159.aBoolean329) && arg5 != -1 && arg6.anIntArray90.length > arg5) {
				local94 = arg6.anIntArray89[arg2];
				local92 = arg6.anIntArray90[arg5];
				@Pc(170) int local170 = local92 >>> 16;
				local92 &= 0xFFFF;
				if (local113 == local170) {
					local98 = local96;
				} else {
					local98 = Static115.method2445(local92 >>> 16);
				}
				if (local98 != null) {
					local78 |= local98.method4587(local92);
					local76 |= local98.method4593(local92);
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
		@Pc(237) long local237 = this.method2490(arg3, local22, arg7 == null ? null : arg7.anIntArray196, arg4);
		if (Static88.aClass87_18 != null) {
			local7 = (Class73) Static88.aClass87_18.method2482(local237);
		}
		if (local7 == null || arg1.method2173(local7.method3298(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method2159(local9, local7.method3298());
			}
			@Pc(266) int local266 = local9;
			@Pc(268) boolean local268 = false;
			for (@Pc(270) int local270 = 0; local270 < local22.length; local270++) {
				if (local22[local270] != -1 && !Static20.method561(local22[local270]).method2993(arg3)) {
					local268 = true;
				}
			}
			if (local268) {
				return null;
			}
			@Pc(301) Class82[] local301 = new Class82[local22.length];
			for (@Pc(303) int local303 = 0; local303 < local22.length; local303++) {
				if (local22[local303] != -1) {
					local301[local303] = Static20.method561(local22[local303]).method3003(arg3);
				}
			}
			@Pc(358) int local358;
			if (local11 != null && local11.anIntArrayArray43 != null) {
				for (@Pc(338) int local338 = 0; local338 < local11.anIntArrayArray43.length; local338++) {
					if (local11.anIntArrayArray43[local338] != null && local301[local338] != null) {
						local358 = local11.anIntArrayArray43[local338][0];
						@Pc(365) int local365 = local11.anIntArrayArray43[local338][1];
						@Pc(372) int local372 = local11.anIntArrayArray43[local338][2];
						@Pc(379) int local379 = local11.anIntArrayArray43[local338][3];
						@Pc(386) int local386 = local11.anIntArrayArray43[local338][4];
						@Pc(393) int local393 = local11.anIntArrayArray43[local338][5];
						if (local379 != 0 || local386 != 0 || local393 != 0) {
							local301[local338].method2346(local386, local393, local379);
						}
						if (local358 != 0 || local365 != 0 || local372 != 0) {
							local301[local338].method2361(local358, local365, local372);
						}
					}
				}
			}
			@Pc(443) Class82 local443 = new Class82(local301, local301.length);
			if (arg7 != null) {
				local266 = local9 | 0x2000;
			}
			local7 = arg1.method2153(local443, local266, Static119.anInt2749, 64, 850);
			if (arg7 != null) {
				for (local358 = 0; local358 < 5; local358++) {
					if (arg7.anIntArray196[local358] < Static331.aShortArrayArray7[local358].length) {
						local7.method3300(Static144.aShortArray58[local358], Static331.aShortArrayArray7[local358][arg7.anIntArray196[local358]]);
					}
					if (arg7.anIntArray196[local358] < Static156.aShortArrayArray3[local358].length) {
						local7.method3300(Static71.aShortArray70[local358], Static156.aShortArrayArray3[local358][arg7.anIntArray196[local358]]);
					}
				}
			}
			if (Static88.aClass87_18 != null) {
				local7.method3287(local9);
				Static88.aClass87_18.method2481(local7, local237);
			}
		}
		if (arg6 == null || local96 == null) {
			return local7;
		} else {
			@Pc(533) Class73 local533 = local7.method3306((byte) 1, local9, true);
			local533.method3309(local94, arg6.aBoolean98, local96, 0, local98, local92, local82, arg0 - 1);
			return local533;
		}
	}
}
