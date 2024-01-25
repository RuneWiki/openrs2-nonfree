import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
	public int[] anIntArray287 = new int[1];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[I")
	public int[] anIntArray289 = new int[] { -1 };

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!eu;IZIILclient!qq;IIILclient!fn;)Lclient!cd;")
	public Class39 method2797(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class83 arg7) {
		@Pc(7) Class39 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class208 local11 = null;
		if (arg6 != -1) {
			local11 = Static255.aClass222_1.method5008(arg6);
		}
		@Pc(23) int[] local23 = this.anIntArray289;
		if (local11 != null && local11.anIntArray491 != null) {
			local23 = new int[local11.anIntArray491.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray491.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray491[local35];
				if (local42 >= 0 && local42 < this.anIntArray289.length) {
					local23[local35] = this.anIntArray289[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) boolean local88 = false;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = 0;
		@Pc(96) Class6_Sub1_Sub5 local96 = null;
		@Pc(98) Class6_Sub1_Sub5 local98 = null;
		if (arg7 != null) {
			local90 = arg7.anIntArray211[arg5];
			local9 = 2080;
			@Pc(113) int local113 = local90 >>> 16;
			local90 &= 0xFFFF;
			local96 = Static244.aClass174_2.method4013(local113);
			if (local96 != null) {
				local79 = local96.method1090(local90) | false;
				local77 = local96.method1094(local90) | false;
				local88 = local96.method1092(local90) | false;
				local86 = arg7.aBoolean153 | false;
			}
			if ((arg7.aBoolean156 || Static116.aBoolean157) && arg3 != -1 && arg3 < arg7.anIntArray211.length) {
				local94 = arg7.anIntArray212[arg5];
				local92 = arg7.anIntArray211[arg3];
				@Pc(184) int local184 = local92 >>> 16;
				local92 &= 0xFFFF;
				if (local184 == local113) {
					local98 = local96;
				} else {
					local98 = Static244.aClass174_2.method4013(local92 >>> 16);
				}
				if (local98 != null) {
					local79 |= local98.method1090(local92);
					local77 |= local98.method1094(local92);
					local88 |= local98.method1092(local92);
				}
			}
			if (local79) {
				local9 = 2208;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local86) {
				local9 |= 0x200;
			}
			if (local88) {
				local9 |= 0x400;
			}
		}
		@Pc(263) long local263 = this.method2798(arg0 == null ? null : arg0.anIntArray191, local23, arg2, arg6);
		if (Static153.aClass220_18 != null) {
			local7 = (Class39) Static153.aClass220_18.method4990(local263);
		}
		if (local7 == null || arg4.method3532(local7.method4900(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method3539(local9, local7.method4900());
			}
			@Pc(292) int local292 = local9;
			@Pc(294) boolean local294 = false;
			for (@Pc(296) int local296 = 0; local296 < local23.length; local296++) {
				if (local23[local296] != -1 && !Static354.aClass170_2.method3865(local23[local296]).method782(arg2)) {
					local294 = true;
				}
			}
			if (local294) {
				return null;
			}
			@Pc(333) Class266[] local333 = new Class266[local23.length];
			for (@Pc(335) int local335 = 0; local335 < local23.length; local335++) {
				if (local23[local335] != -1) {
					local333[local335] = Static354.aClass170_2.method3865(local23[local335]).method780(arg2);
				}
			}
			@Pc(386) int local386;
			if (local11 != null && local11.anIntArrayArray48 != null) {
				for (@Pc(366) int local366 = 0; local366 < local11.anIntArrayArray48.length; local366++) {
					if (local11.anIntArrayArray48[local366] != null && local333[local366] != null) {
						local386 = local11.anIntArrayArray48[local366][0];
						@Pc(393) int local393 = local11.anIntArrayArray48[local366][1];
						@Pc(400) int local400 = local11.anIntArrayArray48[local366][2];
						@Pc(407) int local407 = local11.anIntArrayArray48[local366][3];
						@Pc(414) int local414 = local11.anIntArrayArray48[local366][4];
						@Pc(421) int local421 = local11.anIntArrayArray48[local366][5];
						if (local407 != 0 || local414 != 0 || local421 != 0) {
							local333[local366].method5962(local421, local407, local414);
						}
						if (local386 != 0 || local393 != 0 || local400 != 0) {
							local333[local366].method5959(local400, local386, local393);
						}
					}
				}
			}
			@Pc(474) Class266 local474 = new Class266(local333, local333.length);
			if (arg0 != null) {
				local292 = local9 | 0x4000;
			}
			local7 = arg4.method3496(local474, local292, Static179.anInt3119, 64, 850);
			if (arg0 != null) {
				for (local386 = 0; local386 < 5; local386++) {
					if (Static339.aShortArrayArray6[local386].length > arg0.anIntArray191[local386]) {
						local7.method4909(Static348.aShortArray85[local386], Static339.aShortArrayArray6[local386][arg0.anIntArray191[local386]]);
					}
					if (Static102.aShortArrayArray5[local386].length > arg0.anIntArray191[local386]) {
						local7.method4909(Static21.aShortArray11[local386], Static102.aShortArrayArray5[local386][arg0.anIntArray191[local386]]);
					}
				}
			}
			if (Static153.aClass220_18 != null) {
				local7.method4891(local9);
				Static153.aClass220_18.method4996(local7, local263);
			}
		}
		if (arg7 == null || local96 == null) {
			return local7;
		} else {
			@Pc(564) Class39 local564 = local7.method4863((byte) 1, local9, true);
			local564.method4893(0, local94, local98, local90, arg1 - 1, local92, arg7.aBoolean153, local96);
			return local564;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z[I[IZI)J")
	private long method2798(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Canvas_Sub1.aLongArray6;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local7[(int) (((long) (arg3 >> 8) ^ local14) & 0xFFL)] ^ local14 >>> 8;
		local14 = local7[(int) (((long) arg3 ^ local30) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			local14 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) (arg1[local46] >> 24)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local7[(int) (((long) (arg1[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local7[(int) ((local14 ^ (long) (arg1[local46] >> 8)) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local7[(int) (((long) arg1[local46] ^ local14) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local14 = local14 >>> 8 ^ local7[(int) (((long) arg0[local131] ^ local14) & 0xFFL)];
			}
		}
		return local14 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local14) & 0xFFL)];
	}
}
