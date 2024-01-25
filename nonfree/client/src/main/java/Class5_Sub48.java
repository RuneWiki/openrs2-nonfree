import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "[I")
	public int[] anIntArray497 = new int[] { -1 };

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
	public int[] anIntArray495 = new int[1];

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!co;Lclient!mw;IIIZLclient!ha;III)Lclient!ka;")
	public Class114 method7610(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class143 arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class114 local5 = null;
		@Pc(7) int local7 = 2048;
		@Pc(9) Class201 local9 = null;
		if (arg3 != -1) {
			local9 = Static233.aClass172_1.method3615(arg3);
		}
		@Pc(21) int[] local21 = this.anIntArray497;
		if (local9 != null && local9.anIntArray281 != null) {
			local21 = new int[local9.anIntArray281.length];
			for (@Pc(33) int local33 = 0; local33 < local9.anIntArray281.length; local33++) {
				@Pc(39) int local39 = local9.anIntArray281[local33];
				if (local39 >= 0 && this.anIntArray497.length > local39) {
					local21[local33] = this.anIntArray497[local39];
				} else {
					local21[local33] = -1;
				}
			}
		}
		@Pc(69) boolean local69 = false;
		@Pc(71) boolean local71 = false;
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) int local77 = -1;
		@Pc(79) int local79 = -1;
		@Pc(81) int local81 = 0;
		@Pc(83) Class5_Sub2_Sub20 local83 = null;
		@Pc(85) Class5_Sub2_Sub20 local85 = null;
		if (arg0 != null) {
			local77 = arg0.anIntArray75[arg7];
			local7 = 2080;
			@Pc(100) int local100 = local77 >>> 16;
			local77 &= 0xFFFF;
			local83 = Static459.aClass128_2.method2690(local100);
			if (local83 != null) {
				local71 = local83.method8287(local77) | false;
				local69 = local83.method8283(local77) | false;
				local75 = local83.method8288(local77) | false;
				local73 = arg0.aBoolean106 | false;
			}
			if ((arg0.aBoolean107 || Static67.aBoolean65) && arg2 != -1 && arg0.anIntArray75.length > arg2) {
				local81 = arg0.anIntArray71[arg7];
				local79 = arg0.anIntArray75[arg2];
				@Pc(169) int local169 = local79 >>> 16;
				local79 &= 0xFFFF;
				if (local100 == local169) {
					local85 = local83;
				} else {
					local85 = Static459.aClass128_2.method2690(local79 >>> 16);
				}
				if (local85 != null) {
					local71 |= local85.method8287(local79);
					local69 |= local85.method8283(local79);
					local75 |= local85.method8288(local79);
				}
			}
			if (local71) {
				local7 = 2208;
			}
			if (local69) {
				local7 |= 0x100;
			}
			if (local73) {
				local7 |= 0x200;
			}
			if (local75) {
				local7 |= 0x400;
			}
		}
		@Pc(248) long local248 = this.method7614(arg5, arg1 == null ? null : arg1.anIntArray374, local21, arg3);
		if (Static277.aClass265_27 != null) {
			local5 = (Class114) Static277.aClass265_27.method6577(local248);
		}
		if (local5 == null || arg6.method6226(local5.ua(), local7) != 0) {
			if (local5 != null) {
				local7 = arg6.method6204(local7, local5.ua());
			}
			@Pc(279) int local279 = local7;
			@Pc(281) boolean local281 = false;
			for (@Pc(283) int local283 = 0; local283 < local21.length; local283++) {
				if (local21[local283] != -1 && !Static259.aClass135_1.method2776(local21[local283]).method5183(arg5, (Class9) null)) {
					local281 = true;
				}
			}
			if (local281) {
				return null;
			}
			@Pc(320) Class156[] local320 = new Class156[local21.length];
			for (@Pc(322) int local322 = 0; local322 < local21.length; local322++) {
				if (local21[local322] != -1) {
					local320[local322] = Static259.aClass135_1.method2776(local21[local322]).method5165((Class9) null, arg5);
				}
			}
			@Pc(373) int local373;
			@Pc(380) int local380;
			if (local9 != null && local9.anIntArrayArray44 != null) {
				for (@Pc(355) int local355 = 0; local355 < local9.anIntArrayArray44.length; local355++) {
					if (local9.anIntArrayArray44[local355] != null && local320[local355] != null) {
						local373 = local9.anIntArrayArray44[local355][0];
						local380 = local9.anIntArrayArray44[local355][1];
						@Pc(387) int local387 = local9.anIntArrayArray44[local355][2];
						@Pc(394) int local394 = local9.anIntArrayArray44[local355][3];
						@Pc(401) int local401 = local9.anIntArrayArray44[local355][4];
						@Pc(408) int local408 = local9.anIntArrayArray44[local355][5];
						if (local394 != 0 || local401 != 0 || local408 != 0) {
							local320[local355].method3278(local408, local394, local401);
						}
						if (local373 != 0 || local380 != 0 || local387 != 0) {
							local320[local355].method3274(local387, local380, local373);
						}
					}
				}
			}
			if (arg1 != null) {
				local279 = local7 | 0x4000;
			}
			@Pc(461) Class156 local461 = new Class156(local320, local320.length);
			local5 = arg6.method6203(local461, local279, Static77.anInt1203, 64, 850);
			if (arg1 != null) {
				for (local373 = 0; local373 < 5; local373++) {
					for (local380 = 0; local380 < Static469.aShortArrayArrayArray4.length; local380++) {
						if (Static469.aShortArrayArrayArray4[local380][local373].length > arg1.anIntArray374[local373]) {
							local5.ia(Static544.aShortArrayArray16[local380][local373], Static469.aShortArrayArrayArray4[local380][local373][arg1.anIntArray374[local373]]);
						}
					}
				}
			}
			if (Static277.aClass265_27 != null) {
				local5.s(local7);
				Static277.aClass265_27.method6566(local5, local248);
			}
		}
		if (arg0 == null || local83 == null) {
			return local5;
		} else {
			@Pc(544) Class114 local544 = local5.method8810((byte) 1, local7, true);
			local544.method8794(local81, local79, local83, local85, arg0.aBoolean106, 0, local77, arg4 - 1);
			return local544;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZZ[I[II)J")
	private long method7614(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long[] local10 = Class153_Sub4.aLongArray22;
		@Pc(12) long local12 = -1L;
		@Pc(28) long local28 = local10[(int) (((long) (arg3 >> 8) ^ local12) & 0xFFL)] ^ local12 >>> 8;
		local12 = local28 >>> 8 ^ local10[(int) (((long) arg3 ^ local28) & 0xFFL)];
		for (@Pc(44) int local44 = 0; local44 < arg2.length; local44++) {
			local12 = local10[(int) ((local12 ^ (long) (arg2[local44] >> 24)) & 0xFFL)] ^ local12 >>> 8;
			local12 = local12 >>> 8 ^ local10[(int) ((local12 ^ (long) (arg2[local44] >> 16)) & 0xFFL)];
			local12 = local10[(int) (((long) (arg2[local44] >> 8) ^ local12) & 0xFFL)] ^ local12 >>> 8;
			local12 = local12 >>> 8 ^ local10[(int) ((local12 ^ (long) arg2[local44]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(124) int local124 = 0; local124 < 5; local124++) {
				local12 = local12 >>> 8 ^ local10[(int) (((long) arg1[local124] ^ local12) & 0xFFL)];
			}
		}
		return local12 >>> 8 ^ local10[(int) (((long) (arg0 ? 1 : 0) ^ local12) & 0xFFL)];
	}
}
