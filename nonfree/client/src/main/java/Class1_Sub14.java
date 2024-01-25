import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
	public int[] anIntArray145 = new int[1];

	@OriginalMember(owner = "client!du", name = "r", descriptor = "[I")
	public int[] anIntArray146 = new int[] { -1 };

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ed;ILclient!sm;IIILclient!ya;IZI)Lclient!t;")
	public Class105 method1585(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class223 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class39 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(7) Class105 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class21 local11 = null;
		if (arg3 != -1) {
			local11 = Static117.aClass75_1.method1988(arg3);
		}
		@Pc(23) int[] local23 = this.anIntArray146;
		if (local11 != null && local11.anIntArray51 != null) {
			local23 = new int[local11.anIntArray51.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray51.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray51[local35];
				if (local42 >= 0 && this.anIntArray146.length > local42) {
					local23[local35] = this.anIntArray146[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = 0;
		@Pc(92) Class1_Sub2_Sub9 local92 = null;
		@Pc(94) Class1_Sub2_Sub9 local94 = null;
		if (arg1 != null) {
			local86 = arg1.anIntArray557[arg2];
			local9 = 2080;
			@Pc(109) int local109 = local86 >>> 16;
			local92 = Static293.aClass127_1.method2976(local109);
			local86 &= 0xFFFF;
			if (local92 != null) {
				local80 = local92.method2799(local86) | false;
				local78 = local92.method2800(local86) | false;
				local84 = local92.method2798(local86) | false;
				local82 = arg1.aBoolean424 | false;
			}
			if ((arg1.aBoolean422 || Static21.aBoolean16) && arg4 != -1 && arg1.anIntArray557.length > arg4) {
				local90 = arg1.anIntArray559[arg2];
				local88 = arg1.anIntArray557[arg4];
				@Pc(178) int local178 = local88 >>> 16;
				local88 &= 0xFFFF;
				if (local178 == local109) {
					local94 = local92;
				} else {
					local94 = Static293.aClass127_1.method2976(local88 >>> 16);
				}
				if (local94 != null) {
					local80 |= local94.method2799(local88);
					local78 |= local94.method2800(local88);
					local84 |= local94.method2798(local88);
				}
			}
			if (local80) {
				local9 = 2208;
			}
			if (local78) {
				local9 |= 0x100;
			}
			if (local82) {
				local9 |= 0x200;
			}
			if (local84) {
				local9 |= 0x400;
			}
		}
		@Pc(261) long local261 = this.method1589(arg7, arg0 == null ? null : arg0.anIntArray159, arg3, local23);
		if (Static80.aClass134_13 != null) {
			local7 = (Class105) Static80.aClass134_13.method3266(local261);
		}
		if (local7 == null || arg5.method4528(local7.P(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method4530(local9, local7.P());
			}
			@Pc(289) int local289 = local9;
			@Pc(291) boolean local291 = false;
			for (@Pc(293) int local293 = 0; local293 < local23.length; local293++) {
				if (local23[local293] != -1 && !Static165.aClass19_1.method560(local23[local293]).method3489(arg7)) {
					local291 = true;
				}
			}
			if (local291) {
				return null;
			}
			@Pc(326) Class236[] local326 = new Class236[local23.length];
			for (@Pc(328) int local328 = 0; local328 < local23.length; local328++) {
				if (local23[local328] != -1) {
					local326[local328] = Static165.aClass19_1.method560(local23[local328]).method3486(arg7);
				}
			}
			@Pc(380) int local380;
			if (local11 != null && local11.anIntArrayArray5 != null) {
				for (@Pc(360) int local360 = 0; local360 < local11.anIntArrayArray5.length; local360++) {
					if (local11.anIntArrayArray5[local360] != null && local326[local360] != null) {
						local380 = local11.anIntArrayArray5[local360][0];
						@Pc(387) int local387 = local11.anIntArrayArray5[local360][1];
						@Pc(394) int local394 = local11.anIntArrayArray5[local360][2];
						@Pc(401) int local401 = local11.anIntArrayArray5[local360][3];
						@Pc(408) int local408 = local11.anIntArrayArray5[local360][4];
						@Pc(415) int local415 = local11.anIntArrayArray5[local360][5];
						if (local401 != 0 || local408 != 0 || local415 != 0) {
							local326[local360].method5239(local401, local408, local415);
						}
						if (local380 != 0 || local387 != 0 || local394 != 0) {
							local326[local360].method5249(local380, local394, local387);
						}
					}
				}
			}
			if (arg0 != null) {
				local289 = local9 | 0x4000;
			}
			@Pc(471) Class236 local471 = new Class236(local326, local326.length);
			local7 = arg5.method4540(local471, local289, Static29.anInt4404, 64, 850);
			if (arg0 != null) {
				for (local380 = 0; local380 < 5; local380++) {
					if (Static191.aShortArrayArray5[local380].length > arg0.anIntArray159[local380]) {
						local7.BA(Static401.aShortArray111[local380], Static191.aShortArrayArray5[local380][arg0.anIntArray159[local380]]);
					}
					if (arg0.anIntArray159[local380] < Static444.aShortArrayArray8[local380].length) {
						local7.BA(Static295.aShortArray84[local380], Static444.aShortArrayArray8[local380][arg0.anIntArray159[local380]]);
					}
				}
			}
			if (Static80.aClass134_13 != null) {
				local7.UA(local9);
				Static80.aClass134_13.method3263(local261, local7);
			}
		}
		if (arg1 == null || local92 == null) {
			return local7;
		} else {
			@Pc(559) Class105 local559 = local7.method3548((byte) 1, local9, true);
			local559.method3539(local94, arg6 - 1, 0, local90, arg1.aBoolean424, local86, local88, local92);
			return local559;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z[III[I)J")
	private long method1589(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class1_Sub4_Sub12.aLongArray3;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local9 = local7[(int) ((long) 255 & ((long) arg2 ^ local25))] ^ local25 >>> 8;
		for (@Pc(42) int local42 = 0; local42 < arg3.length; local42++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local42] >> 24) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local42] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local42] >> 8)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local42]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg1[local127]) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
