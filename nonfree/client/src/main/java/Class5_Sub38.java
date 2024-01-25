import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class5_Sub38 extends Class5 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
	public int[] anIntArray363 = new int[1];

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
	public int[] anIntArray364 = new int[] { -1 };

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!nk;IBIIZLclient!vga;Lclient!ha;)Lclient!ka;")
	public Class187 method5820(@OriginalArg(0) int arg0, @OriginalArg(2) Class248 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class362 arg6, @OriginalArg(9) Class133 arg7) {
		@Pc(7) Class187 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class269 local11 = null;
		if (arg2 != -1) {
			local11 = Static147.aClass238_1.method5279(arg2);
		}
		@Pc(22) int[] local22 = this.anIntArray364;
		if (local11 != null && local11.anIntArray396 != null) {
			local22 = new int[local11.anIntArray396.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray396.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray396[local34];
				if (local41 >= 0 && this.anIntArray364.length > local41) {
					local22[local34] = this.anIntArray364[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = 0;
		@Pc(87) Class5_Sub5_Sub12 local87 = null;
		@Pc(89) Class5_Sub5_Sub12 local89 = null;
		if (arg6 != null) {
			local9 = 2080;
			local81 = arg6.anIntArray571[arg4];
			@Pc(104) int local104 = local81 >>> 16;
			local81 &= 0xFFFF;
			local87 = Static435.aClass298_1.method7026(local104);
			if (local87 != null) {
				local75 = local87.method4852(local81) | false;
				local73 = local87.method4850(local81) | false;
				local79 = local87.method4848(local81) | false;
				local77 = arg6.aBoolean719 | false;
			}
			if ((arg6.aBoolean718 || Static23.aBoolean14) && arg3 != -1 && arg6.anIntArray571.length > arg3) {
				local83 = arg6.anIntArray571[arg3];
				local85 = arg6.anIntArray573[arg4];
				@Pc(177) int local177 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local104 == local177) {
					local89 = local87;
				} else {
					local89 = Static435.aClass298_1.method7026(local83 >>> 16);
				}
				if (local89 != null) {
					local75 |= local89.method4852(local83);
					local73 |= local89.method4850(local83);
					local79 |= local89.method4848(local83);
				}
			}
			if (local75) {
				local9 = 2208;
			}
			if (local73) {
				local9 |= 0x100;
			}
			if (local77) {
				local9 |= 0x200;
			}
			if (local79) {
				local9 |= 0x400;
			}
		}
		@Pc(264) long local264 = this.method5821(arg1 == null ? null : arg1.anIntArray344, arg2, arg5, local22);
		if (Static315.aClass87_172 != null) {
			local7 = (Class187) Static315.aClass87_172.method1805(local264);
		}
		if (local7 == null || arg7.method7296(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method7292(local9, local7.ua());
			}
			@Pc(290) int local290 = local9;
			@Pc(292) boolean local292 = false;
			for (@Pc(294) int local294 = 0; local294 < local22.length; local294++) {
				if (local22[local294] != -1 && !Static643.aClass275_2.method6641(local22[local294]).method5846(arg5)) {
					local292 = true;
				}
			}
			if (local292) {
				return null;
			}
			@Pc(327) Class26[] local327 = new Class26[local22.length];
			for (@Pc(329) int local329 = 0; local329 < local22.length; local329++) {
				if (local22[local329] != -1) {
					local327[local329] = Static643.aClass275_2.method6641(local22[local329]).method5851(arg5);
				}
			}
			@Pc(387) int local387;
			@Pc(394) int local394;
			if (local11 != null && local11.anIntArrayArray50 != null) {
				for (@Pc(367) int local367 = 0; local367 < local11.anIntArrayArray50.length; local367++) {
					if (local11.anIntArrayArray50[local367] != null && local327[local367] != null) {
						local387 = local11.anIntArrayArray50[local367][0];
						local394 = local11.anIntArrayArray50[local367][1];
						@Pc(401) int local401 = local11.anIntArrayArray50[local367][2];
						@Pc(408) int local408 = local11.anIntArrayArray50[local367][3];
						@Pc(415) int local415 = local11.anIntArrayArray50[local367][4];
						@Pc(422) int local422 = local11.anIntArrayArray50[local367][5];
						if (local408 != 0 || local415 != 0 || local422 != 0) {
							local327[local367].method333(local422, local415, local408);
						}
						if (local387 != 0 || local394 != 0 || local401 != 0) {
							local327[local367].method336(local387, local394, local401);
						}
					}
				}
			}
			@Pc(466) Class26 local466 = new Class26(local327, local327.length);
			if (arg1 != null) {
				local290 = local9 | 0x4000;
			}
			local7 = arg7.method7256(local466, local290, Static201.anInt3945, 64, 850);
			if (arg1 != null) {
				for (local387 = 0; local387 < 5; local387++) {
					for (local394 = 0; local394 < Static597.aShortArrayArrayArray9.length; local394++) {
						if (arg1.anIntArray344[local387] < Static597.aShortArrayArrayArray9[local394][local387].length) {
							local7.ia(Static340.aShortArrayArray24[local394][local387], Static597.aShortArrayArrayArray9[local394][local387][arg1.anIntArray344[local387]]);
						}
					}
				}
			}
			if (Static315.aClass87_172 != null) {
				local7.s(local9);
				Static315.aClass87_172.method1792(local264, local7);
			}
		}
		if (arg6 == null || local87 == null) {
			return local7;
		} else {
			@Pc(553) Class187 local553 = local7.method8656((byte) 1, local9, true);
			local553.method8639(local83, local81, local87, arg6.aBoolean719, local89, 0, arg0 - 1, local85);
			return local553;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([IIIZ[I)J")
	private long method5821(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(15) long[] local15 = Class5_Sub40.aLongArray12;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local17 >>> 8 ^ local15[(int) ((local17 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local17 = local33 >>> 8 ^ local15[(int) (((long) arg1 ^ local33) & 0xFFL)];
		for (@Pc(49) int local49 = 0; local49 < arg3.length; local49++) {
			local17 = local15[(int) (((long) (arg3[local49] >> 24) ^ local17) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) ((local17 ^ (long) (arg3[local49] >> 16)) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) ((local17 ^ (long) (arg3[local49] >> 8)) & 0xFFL)] ^ local17 >>> 8;
			local17 = local17 >>> 8 ^ local15[(int) ((local17 ^ (long) arg3[local49]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(134) int local134 = 0; local134 < 5; local134++) {
				local17 = local15[(int) (((long) arg0[local134] ^ local17) & 0xFFL)] ^ local17 >>> 8;
			}
		}
		return local17 >>> 8 ^ local15[(int) (((long) (arg2 ? 1 : 0) ^ local17) & 0xFFL)];
	}
}
