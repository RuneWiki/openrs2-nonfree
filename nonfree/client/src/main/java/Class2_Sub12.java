import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!go", name = "o", descriptor = "[I")
	public int[] anIntArray212 = new int[] { -1 };

	@OriginalMember(owner = "client!go", name = "r", descriptor = "[I")
	public int[] anIntArray213 = new int[1];

	static {
		new Class231("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!za;Lclient!hg;ZIIILclient!bk;III)Lclient!e;")
	public Class63 method2163(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class63 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class101 local11 = null;
		if (arg4 != -1) {
			local11 = Static257.aClass262_1.method5913(arg4);
		}
		@Pc(22) int[] local22 = this.anIntArray212;
		if (local11 != null && local11.anIntArray223 != null) {
			local22 = new int[local11.anIntArray223.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray223.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray223[local34];
				if (local41 >= 0 && local41 < this.anIntArray212.length) {
					local22[local34] = this.anIntArray212[local41];
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
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = 0;
		@Pc(95) Class2_Sub1_Sub12 local95 = null;
		@Pc(97) Class2_Sub1_Sub12 local97 = null;
		if (arg1 != null) {
			local9 = 2080;
			local81 = arg1.anIntArray240[arg7];
			@Pc(112) int local112 = local81 >>> 16;
			local95 = Static37.aClass80_1.method1871(local112);
			local81 &= 0xFFFF;
			if (local95 != null) {
				local75 = local95.method3895(local81) | false;
				local73 = local95.method3890(local81) | false;
				local79 = local95.method3889(local81) | false;
				local77 = arg1.aBoolean173 | false;
			}
			if ((arg1.aBoolean172 || Static83.aBoolean76) && arg6 != -1 && arg1.anIntArray240.length > arg6) {
				local93 = arg1.anIntArray238[arg7];
				local91 = arg1.anIntArray240[arg6];
				@Pc(177) int local177 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local177 == local112) {
					local97 = local95;
				} else {
					local97 = Static37.aClass80_1.method1871(local91 >>> 16);
				}
				if (local97 != null) {
					local75 |= local97.method3895(local91);
					local73 |= local97.method3890(local91);
					local79 |= local97.method3889(local91);
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
		@Pc(254) long local254 = this.method2165(local22, arg2, arg4, arg5 == null ? null : arg5.anIntArray52);
		if (Static316.aClass188_43 != null) {
			local7 = (Class63) Static316.aClass188_43.method4158(local254);
		}
		if (local7 == null || arg0.method6023(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method5987(local9, local7.RA());
			}
			@Pc(280) int local280 = local9;
			@Pc(282) boolean local282 = false;
			for (@Pc(284) int local284 = 0; local284 < local22.length; local284++) {
				if (local22[local284] != -1 && !Static413.aClass271_2.method6193(local22[local284]).method5009(arg2)) {
					local282 = true;
				}
			}
			if (local282) {
				return null;
			}
			@Pc(317) Class76[] local317 = new Class76[local22.length];
			for (@Pc(319) int local319 = 0; local319 < local22.length; local319++) {
				if (local22[local319] != -1) {
					local317[local319] = Static413.aClass271_2.method6193(local22[local319]).method5008(arg2);
				}
			}
			@Pc(374) int local374;
			if (local11 != null && local11.anIntArrayArray58 != null) {
				for (@Pc(354) int local354 = 0; local354 < local11.anIntArrayArray58.length; local354++) {
					if (local11.anIntArrayArray58[local354] != null && local317[local354] != null) {
						local374 = local11.anIntArrayArray58[local354][0];
						@Pc(381) int local381 = local11.anIntArrayArray58[local354][1];
						@Pc(388) int local388 = local11.anIntArrayArray58[local354][2];
						@Pc(395) int local395 = local11.anIntArrayArray58[local354][3];
						@Pc(402) int local402 = local11.anIntArrayArray58[local354][4];
						@Pc(409) int local409 = local11.anIntArrayArray58[local354][5];
						if (local395 != 0 || local402 != 0 || local409 != 0) {
							local317[local354].method1774(local402, local395, local409);
						}
						if (local374 != 0 || local381 != 0 || local388 != 0) {
							local317[local354].method1790(local388, local374, local381);
						}
					}
				}
			}
			if (arg5 != null) {
				local280 = local9 | 0x4000;
			}
			@Pc(465) Class76 local465 = new Class76(local317, local317.length);
			local7 = arg0.method6016(local465, local280, Static304.anInt5495, 64, 850);
			if (arg5 != null) {
				for (local374 = 0; local374 < 5; local374++) {
					if (Static373.aShortArrayArray6[local374].length > arg5.anIntArray52[local374]) {
						local7.q(Static172.aShortArray46[local374], Static373.aShortArrayArray6[local374][arg5.anIntArray52[local374]]);
					}
					if (arg5.anIntArray52[local374] < Static388.aShortArrayArray8[local374].length) {
						local7.q(Static164.aShortArray45[local374], Static388.aShortArrayArray8[local374][arg5.anIntArray52[local374]]);
					}
				}
			}
			if (Static316.aClass188_43 != null) {
				local7.D(local9);
				Static316.aClass188_43.method4155(local254, local7);
			}
		}
		if (arg1 == null || local95 == null) {
			return local7;
		} else {
			@Pc(553) Class63 local553 = local7.method6296((byte) 1, local9, true);
			local553.method6299(0, local81, local91, local97, local93, arg1.aBoolean173, arg3 - 1, local95);
			return local553;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([IBZI[I)J")
	private long method2165(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class264.aLongArray8;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local12[(int) ((local14 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ local14 >>> 8;
		local14 = local12[(int) ((local30 ^ (long) arg2) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg0.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg0[local46] >> 24) ^ local14) & 0xFFL)];
			local14 = local12[(int) (((long) (arg0[local46] >> 16) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local12[(int) ((local14 ^ (long) (arg0[local46] >> 8)) & 0xFFL)] ^ local14 >>> 8;
			local14 = local12[(int) ((local14 ^ (long) arg0[local46]) & 0xFFL)] ^ local14 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local12[(int) (((long) arg3[local127] ^ local14) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local12[(int) ((local14 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local14 >>> 8;
	}
}
