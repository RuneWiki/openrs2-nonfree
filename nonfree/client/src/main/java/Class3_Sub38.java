import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
	public int[] anIntArray410 = new int[] { -1 };

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "[I")
	public int[] anIntArray411 = new int[1];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[I[IZB)J")
	private long method5052(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long[] local7 = Class359.aLongArray24;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg0) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(47) int local47 = 0; local47 < arg2.length; local47++) {
			local9 = local7[(int) ((local9 ^ (long) (arg2[local47] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg2[local47] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg2[local47] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local47]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
				local9 = local7[(int) (((long) arg1[local136] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!rf;ZILclient!ha;ILclient!bfa;)Lclient!ka;")
	public Class170 method5053(@OriginalArg(1) Class45 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) Class22 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class34 arg4) {
		@Pc(7) Class170 local7 = null;
		@Pc(24) int local24 = 2048;
		@Pc(26) Class226 local26 = null;
		if (arg3 != -1) {
			local26 = Static288.aClass97_1.method2458(arg3);
		}
		@Pc(37) int[] local37 = this.anIntArray410;
		if (local26 != null && local26.anIntArray419 != null) {
			local37 = new int[local26.anIntArray419.length];
			for (@Pc(51) int local51 = 0; local51 < local26.anIntArray419.length; local51++) {
				@Pc(58) int local58 = local26.anIntArray419[local51];
				if (local58 >= 0 && local58 < this.anIntArray410.length) {
					local37[local51] = this.anIntArray410[local58];
				} else {
					local37[local51] = -1;
				}
			}
		}
		if (arg0 != null) {
			local24 = arg0.method6588() | 0x800;
		}
		@Pc(114) long local114 = this.method5052(arg3, arg4 == null ? null : arg4.anIntArray77, local37, arg1);
		if (Static163.aClass307_39 != null) {
			local7 = (Class170) Static163.aClass307_39.method7002(local114);
		}
		if (local7 == null || arg2.method9324(local7.ua(), local24) != 0) {
			if (local7 != null) {
				local24 = arg2.method9375(local24, local7.ua());
			}
			@Pc(144) int local144 = local24;
			@Pc(146) boolean local146 = false;
			for (@Pc(148) int local148 = 0; local148 < local37.length; local148++) {
				if (local37[local148] != -1 && !Static606.aClass62_2.method1887(local37[local148]).method6284(arg1, (Class99) null)) {
					local146 = true;
				}
			}
			if (local146) {
				return null;
			}
			@Pc(191) Class145[] local191 = new Class145[local37.length];
			for (@Pc(193) int local193 = 0; local193 < local37.length; local193++) {
				if (local37[local193] != -1) {
					local191[local193] = Static606.aClass62_2.method1887(local37[local193]).method6280((Class99) null, arg1);
				}
			}
			@Pc(261) int local261;
			@Pc(268) int local268;
			if (local26 != null && local26.anIntArrayArray30 != null) {
				for (@Pc(235) int local235 = 0; local235 < local26.anIntArrayArray30.length; local235++) {
					if (local26.anIntArrayArray30[local235] != null && local191[local235] != null) {
						local261 = local26.anIntArrayArray30[local235][0];
						local268 = local26.anIntArrayArray30[local235][1];
						@Pc(275) int local275 = local26.anIntArrayArray30[local235][2];
						@Pc(282) int local282 = local26.anIntArrayArray30[local235][3];
						@Pc(289) int local289 = local26.anIntArrayArray30[local235][4];
						@Pc(296) int local296 = local26.anIntArrayArray30[local235][5];
						if (local282 != 0 || local289 != 0 || local296 != 0) {
							local191[local235].method3296(local282, local296, local289);
						}
						if (local261 != 0 || local268 != 0 || local275 != 0) {
							local191[local235].method3290(local275, local261, local268);
						}
					}
				}
			}
			@Pc(370) Class145 local370 = new Class145(local191, local191.length);
			if (arg4 != null) {
				local144 = local24 | 0x4000;
			}
			local7 = arg2.method9382(local370, local144, Static22.anInt717, 64, 850);
			if (arg4 != null) {
				for (local261 = 0; local261 < 10; local261++) {
					for (local268 = 0; local268 < Static304.aShortArrayArray1[local261].length; local268++) {
						if (Static596.aShortArrayArrayArray1[local261][local268].length > arg4.anIntArray77[local261]) {
							local7.ia(Static304.aShortArrayArray1[local261][local268], Static596.aShortArrayArrayArray1[local261][local268][arg4.anIntArray77[local261]]);
						}
					}
				}
			}
			if (Static163.aClass307_39 != null) {
				local7.s(local24);
				Static163.aClass307_39.method7000(local7, local114);
			}
		}
		if (arg0 == null) {
			return local7;
		} else {
			@Pc(476) Class170 local476 = local7.method8369((byte) 1, local24, true);
			arg0.method6574(0, local476);
			return local476;
		}
	}
}
