import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "[I")
	public int[] anIntArray128 = new int[] { -1 };

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "[I")
	public int[] anIntArray129 = new int[1];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZB[II[I)J")
	private long method1494(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class215.aLongArray11;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg3.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local41] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local41] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) arg3[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local7[(int) ((local9 ^ (long) arg1[local131]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IILclient!jk;Lclient!qa;IIIILclient!aba;Z)Lclient!r;")
	public Class63 method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Class39 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class4 arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class63 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class24 local11 = null;
		if (arg5 != -1) {
			local11 = Static492.aClass218_1.method5796(arg5);
		}
		@Pc(38) int[] local38 = this.anIntArray128;
		if (local11 != null && local11.anIntArray49 != null) {
			local38 = new int[local11.anIntArray49.length];
			for (@Pc(50) int local50 = 0; local50 < local11.anIntArray49.length; local50++) {
				@Pc(57) int local57 = local11.anIntArray49[local50];
				if (local57 >= 0 && local57 < this.anIntArray128.length) {
					local38[local50] = this.anIntArray128[local57];
				} else {
					local38[local50] = -1;
				}
			}
		}
		@Pc(88) boolean local88 = false;
		@Pc(90) boolean local90 = false;
		@Pc(92) boolean local92 = false;
		@Pc(94) boolean local94 = false;
		@Pc(96) int local96 = -1;
		@Pc(98) int local98 = -1;
		@Pc(100) int local100 = 0;
		@Pc(102) Class2_Sub13_Sub18 local102 = null;
		@Pc(104) Class2_Sub13_Sub18 local104 = null;
		if (arg6 != null) {
			local96 = arg6.anIntArray11[arg1];
			local9 = 2080;
			@Pc(119) int local119 = local96 >>> 16;
			local96 &= 0xFFFF;
			local102 = Static396.aClass157_2.method3747(local119);
			if (local102 != null) {
				local90 = local102.method7536(local96) | false;
				local88 = local102.method7534(local96) | false;
				local94 = local102.method7533(local96) | false;
				local92 = arg6.aBoolean10 | false;
			}
			if ((arg6.aBoolean9 || Static112.aBoolean204) && arg4 != -1 && arg4 < arg6.anIntArray11.length) {
				local100 = arg6.anIntArray12[arg1];
				local98 = arg6.anIntArray11[arg4];
				@Pc(184) int local184 = local98 >>> 16;
				local98 &= 0xFFFF;
				if (local184 == local119) {
					local104 = local102;
				} else {
					local104 = Static396.aClass157_2.method3747(local98 >>> 16);
				}
				if (local104 != null) {
					local90 |= local104.method7536(local98);
					local88 |= local104.method7534(local98);
					local94 |= local104.method7533(local98);
				}
			}
			if (local90) {
				local9 = 2208;
			}
			if (local88) {
				local9 |= 0x100;
			}
			if (local92) {
				local9 |= 0x200;
			}
			if (local94) {
				local9 |= 0x400;
			}
		}
		@Pc(265) long local265 = this.method1494(arg7, arg2 == null ? null : arg2.anIntArray412, arg5, local38);
		if (Static108.aClass231_27 != null) {
			local7 = (Class63) Static108.aClass231_27.method6228(local265);
		}
		if (local7 == null || arg3.method6070(local7.ba(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method6028(local9, local7.ba());
			}
			@Pc(296) int local296 = local9;
			@Pc(298) boolean local298 = false;
			for (@Pc(300) int local300 = 0; local300 < local38.length; local300++) {
				if (local38[local300] != -1 && !Static464.aClass115_1.method2970(local38[local300]).method7468(arg7)) {
					local298 = true;
				}
			}
			if (local298) {
				return null;
			}
			@Pc(332) Class29[] local332 = new Class29[local38.length];
			for (@Pc(334) int local334 = 0; local334 < local38.length; local334++) {
				if (local38[local334] != -1) {
					local332[local334] = Static464.aClass115_1.method2970(local38[local334]).method7481(arg7);
				}
			}
			@Pc(386) int local386;
			if (local11 != null && local11.anIntArrayArray4 != null) {
				for (@Pc(366) int local366 = 0; local366 < local11.anIntArrayArray4.length; local366++) {
					if (local11.anIntArrayArray4[local366] != null && local332[local366] != null) {
						local386 = local11.anIntArrayArray4[local366][0];
						@Pc(393) int local393 = local11.anIntArrayArray4[local366][1];
						@Pc(400) int local400 = local11.anIntArrayArray4[local366][2];
						@Pc(407) int local407 = local11.anIntArrayArray4[local366][3];
						@Pc(414) int local414 = local11.anIntArrayArray4[local366][4];
						@Pc(421) int local421 = local11.anIntArrayArray4[local366][5];
						if (local407 != 0 || local414 != 0 || local421 != 0) {
							local332[local366].method863(local407, local421, local414);
						}
						if (local386 != 0 || local393 != 0 || local400 != 0) {
							local332[local366].method858(local400, local393, local386);
						}
					}
				}
			}
			@Pc(478) Class29 local478 = new Class29(local332, local332.length);
			if (arg2 != null) {
				local296 = local9 | 0x4000;
			}
			local7 = arg3.method6011(local478, local296, Static297.anInt5467, 64, 850);
			if (arg2 != null) {
				for (local386 = 0; local386 < 5; local386++) {
					if (Static225.aShortArrayArray4[local386].length > arg2.anIntArray412[local386]) {
						local7.pa(Static16.aShortArray17[local386], Static225.aShortArrayArray4[local386][arg2.anIntArray412[local386]]);
					}
					if (arg2.anIntArray412[local386] < Static243.aShortArrayArray5[local386].length) {
						local7.pa(Static5.aShortArray2[local386], Static243.aShortArrayArray5[local386][arg2.anIntArray412[local386]]);
					}
				}
			}
			if (Static108.aClass231_27 != null) {
				local7.m(local9);
				Static108.aClass231_27.method6232(local7, local265);
			}
		}
		if (arg6 == null || local102 == null) {
			return local7;
		} else {
			@Pc(568) Class63 local568 = local7.method7706((byte) 1, local9, true);
			local568.method7698(local102, arg6.aBoolean10, local96, 0, local104, local100, arg0 - 1, local98);
			return local568;
		}
	}
}
