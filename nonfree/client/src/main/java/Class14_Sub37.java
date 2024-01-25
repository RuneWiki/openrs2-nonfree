import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class14_Sub37 extends Class14 {

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "[I")
	public int[] anIntArray612 = new int[1];

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "[I")
	public int[] anIntArray614 = new int[] { -1 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([I[IZIB)J")
	private long method5727(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long[] local7 = Class14_Sub2_Sub2.aLongArray9;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg3) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local41] ^ local9) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local122]) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!he;ILclient!e;BIZILclient!gn;)Lclient!id;")
	public Class45 method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) Class79 arg7) {
		@Pc(7) Class45 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class128 local11 = null;
		if (arg5 != -1) {
			local11 = Static88.method2112(arg5);
		}
		@Pc(21) int[] local21 = this.anIntArray614;
		if (local11 != null && local11.anIntArray324 != null) {
			local21 = new int[local11.anIntArray324.length];
			for (@Pc(38) int local38 = 0; local38 < local11.anIntArray324.length; local38++) {
				@Pc(45) int local45 = local11.anIntArray324[local38];
				if (local45 >= 0 && local45 < this.anIntArray614.length) {
					local21[local38] = this.anIntArray614[local45];
				} else {
					local21[local38] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = 0;
		@Pc(92) Class14_Sub2_Sub15 local92 = null;
		@Pc(94) Class14_Sub2_Sub15 local94 = null;
		if (arg7 != null) {
			local9 = 1056;
			local86 = arg7.anIntArray217[arg3];
			@Pc(109) int local109 = local86 >>> 16;
			local92 = Static203.method5589(local109);
			local86 &= 0xFFFF;
			if (local92 != null) {
				local82 = local92.method4107(local86) | false;
				local80 = local92.method4103(local86) | false;
				local84 = arg7.aBoolean166 | false;
			}
			if ((arg7.aBoolean164 || Static308.aBoolean300) && arg0 != -1 && arg0 < arg7.anIntArray217.length) {
				local90 = arg7.anIntArray215[arg3];
				local88 = arg7.anIntArray217[arg0];
				@Pc(166) int local166 = local88 >>> 16;
				local88 &= 0xFFFF;
				if (local109 == local166) {
					local94 = local92;
				} else {
					local94 = Static203.method5589(local88 >>> 16);
				}
				if (local94 != null) {
					local82 |= local94.method4107(local88);
					local80 |= local94.method4103(local88);
				}
			}
			if (local82) {
				local9 = 1184;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local84) {
				local9 |= 0x200;
			}
		}
		@Pc(231) long local231 = this.method5727(arg2 == null ? null : arg2.anIntArray226, local21, arg6, arg5);
		if (Static76.aClass11_40 != null) {
			local7 = (Class45) Static76.aClass11_40.method209(local231);
		}
		if (local7 == null || arg4.method5149(local7.method1809(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method5112(local9, local7.method1809());
			}
			@Pc(257) int local257 = local9;
			@Pc(259) boolean local259 = false;
			for (@Pc(261) int local261 = 0; local261 < local21.length; local261++) {
				if (local21[local261] != -1 && !Static296.method5066(local21[local261]).method5968(arg6)) {
					local259 = true;
				}
			}
			if (local259) {
				return null;
			}
			@Pc(296) Class71[] local296 = new Class71[local21.length];
			for (@Pc(298) int local298 = 0; local298 < local21.length; local298++) {
				if (local21[local298] != -1) {
					local296[local298] = Static296.method5066(local21[local298]).method5970(arg6);
				}
			}
			@Pc(349) int local349;
			if (local11 != null && local11.anIntArrayArray57 != null) {
				for (@Pc(329) int local329 = 0; local329 < local11.anIntArrayArray57.length; local329++) {
					if (local11.anIntArrayArray57[local329] != null && local296[local329] != null) {
						local349 = local11.anIntArrayArray57[local329][0];
						@Pc(356) int local356 = local11.anIntArrayArray57[local329][1];
						@Pc(363) int local363 = local11.anIntArrayArray57[local329][2];
						@Pc(370) int local370 = local11.anIntArrayArray57[local329][3];
						@Pc(377) int local377 = local11.anIntArrayArray57[local329][4];
						@Pc(384) int local384 = local11.anIntArrayArray57[local329][5];
						if (local370 != 0 || local377 != 0 || local384 != 0) {
							local296[local329].method2187(local377, local384, local370);
						}
						if (local349 != 0 || local356 != 0 || local363 != 0) {
							local296[local329].method2186(local349, local363, local356);
						}
					}
				}
			}
			@Pc(435) Class71 local435 = new Class71(local296, local296.length);
			if (arg2 != null) {
				local257 = local9 | 0x2000;
			}
			local7 = arg4.method5148(local435, local257, Static46.anInt1179, 64, 850);
			if (arg2 != null) {
				for (local349 = 0; local349 < 5; local349++) {
					if (Static325.aShortArrayArray11[local349].length > arg2.anIntArray226[local349]) {
						local7.method1821(Static67.aShortArray23[local349], Static325.aShortArrayArray11[local349][arg2.anIntArray226[local349]]);
					}
					if (Static257.aShortArrayArray7[local349].length > arg2.anIntArray226[local349]) {
						local7.method1821(Static81.aShortArray42[local349], Static257.aShortArrayArray7[local349][arg2.anIntArray226[local349]]);
					}
				}
			}
			if (Static76.aClass11_40 != null) {
				local7.method1782(local9);
				Static76.aClass11_40.method219(local231, local7);
			}
		}
		if (arg7 == null || local92 == null) {
			return local7;
		} else {
			@Pc(531) Class45 local531 = local7.method1793((byte) 1, local9, true);
			local531.method1817(0, local92, local90, arg7.aBoolean166, local94, local86, local88, arg1 - 1);
			return local531;
		}
	}
}
