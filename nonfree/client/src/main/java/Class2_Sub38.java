import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "[I")
	public int[] anIntArray512 = new int[] { -1 };

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "[I")
	public int[] anIntArray513 = new int[1];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z[II[II)J")
	private long method4805(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class2_Sub2_Sub21.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)];
		local9 = local7[(int) (((long) arg3 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 8)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg2[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local122] ^ local9) & 0xFFL)];
			}
		}
		return local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!ya;ZIIILclient!go;IZLclient!vf;)Lclient!t;")
	public Class91 method4806(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class250 arg7) {
		@Pc(7) Class91 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class156 local11 = null;
		if (arg0 != -1) {
			local11 = Static262.aClass51_3.method1144(arg0);
		}
		@Pc(22) int[] local22 = this.anIntArray512;
		if (local11 != null && local11.anIntArray374 != null) {
			local22 = new int[local11.anIntArray374.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray374.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray374[local34];
				if (local41 >= 0 && local41 < this.anIntArray512.length) {
					local22[local34] = this.anIntArray512[local41];
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
		@Pc(87) Class2_Sub5_Sub3 local87 = null;
		@Pc(89) Class2_Sub5_Sub3 local89 = null;
		if (arg7 != null) {
			local9 = 2080;
			local81 = arg7.anIntArray592[arg3];
			@Pc(104) int local104 = local81 >>> 16;
			local87 = Static338.aClass12_2.method257(local104);
			local81 &= 0xFFFF;
			if (local87 != null) {
				local75 = local87.method888(local81) | false;
				local73 = local87.method889(local81) | false;
				local79 = local87.method885(local81) | false;
				local77 = arg7.aBoolean464 | false;
			}
			if ((arg7.aBoolean466 || Static133.aBoolean221) && arg4 != -1 && arg7.anIntArray592.length > arg4) {
				local83 = arg7.anIntArray592[arg4];
				local85 = arg7.anIntArray594[arg3];
				@Pc(173) int local173 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local104 == local173) {
					local89 = local87;
				} else {
					local89 = Static338.aClass12_2.method257(local83 >>> 16);
				}
				if (local89 != null) {
					local75 |= local89.method888(local83);
					local73 |= local89.method889(local83);
					local79 |= local89.method885(local83);
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
		@Pc(250) long local250 = this.method4805(arg2, arg5 == null ? null : arg5.anIntArray255, local22, arg0);
		if (Static150.aClass171_35 != null) {
			local7 = (Class91) Static150.aClass171_35.method3941(local250);
		}
		if (local7 == null || arg1.method4429(local7.P(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method4451(local9, local7.P());
			}
			@Pc(276) int local276 = local9;
			@Pc(278) boolean local278 = false;
			for (@Pc(280) int local280 = 0; local280 < local22.length; local280++) {
				if (local22[local280] != -1 && !Static318.aClass144_6.method3265(local22[local280]).method868(arg2)) {
					local278 = true;
				}
			}
			if (local278) {
				return null;
			}
			@Pc(317) Class146[] local317 = new Class146[local22.length];
			for (@Pc(319) int local319 = 0; local319 < local22.length; local319++) {
				if (local22[local319] != -1) {
					local317[local319] = Static318.aClass144_6.method3265(local22[local319]).method855(arg2);
				}
			}
			@Pc(375) int local375;
			if (local11 != null && local11.anIntArrayArray43 != null) {
				for (@Pc(355) int local355 = 0; local355 < local11.anIntArrayArray43.length; local355++) {
					if (local11.anIntArrayArray43[local355] != null && local317[local355] != null) {
						local375 = local11.anIntArrayArray43[local355][0];
						@Pc(382) int local382 = local11.anIntArrayArray43[local355][1];
						@Pc(389) int local389 = local11.anIntArrayArray43[local355][2];
						@Pc(396) int local396 = local11.anIntArrayArray43[local355][3];
						@Pc(403) int local403 = local11.anIntArrayArray43[local355][4];
						@Pc(410) int local410 = local11.anIntArrayArray43[local355][5];
						if (local396 != 0 || local403 != 0 || local410 != 0) {
							local317[local355].method3333(local396, local410, local403);
						}
						if (local375 != 0 || local382 != 0 || local389 != 0) {
							local317[local355].method3334(local389, local382, local375);
						}
					}
				}
			}
			@Pc(469) Class146 local469 = new Class146(local317, local317.length);
			if (arg5 != null) {
				local276 = local9 | 0x4000;
			}
			local7 = arg1.method4414(local469, local276, Static417.anInt7003, 64, 850);
			if (arg5 != null) {
				for (local375 = 0; local375 < 5; local375++) {
					if (Static239.aShortArrayArray5[local375].length > arg5.anIntArray255[local375]) {
						local7.BA(Static256.aShortArray73[local375], Static239.aShortArrayArray5[local375][arg5.anIntArray255[local375]]);
					}
					if (Static187.aShortArrayArray4[local375].length > arg5.anIntArray255[local375]) {
						local7.BA(Static347.aShortArray108[local375], Static187.aShortArrayArray4[local375][arg5.anIntArray255[local375]]);
					}
				}
			}
			if (Static150.aClass171_35 != null) {
				local7.UA(local9);
				Static150.aClass171_35.method3940(local250, local7);
			}
		}
		if (arg7 == null || local87 == null) {
			return local7;
		} else {
			@Pc(559) Class91 local559 = local7.method3285((byte) 1, local9, true);
			local559.method3294(local87, local85, arg7.aBoolean464, local81, local89, local83, arg6 - 1, 0);
			return local559;
		}
	}
}
