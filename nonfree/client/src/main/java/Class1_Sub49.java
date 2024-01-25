import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub49 extends Class1 {

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "[I")
	public int[] anIntArray746 = new int[1];

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "[I")
	public int[] anIntArray747 = new int[] { -1 };

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[IZ[IB)J")
	private long method7373(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		@Pc(13) long[] local13 = Class132.aLongArray3;
		@Pc(15) long local15 = -1L;
		@Pc(31) long local31 = local13[(int) ((local15 ^ (long) (arg0 >> 8)) & 0xFFL)] ^ local15 >>> 8;
		local15 = local31 >>> 8 ^ local13[(int) ((local31 ^ (long) arg0) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg1.length; local47++) {
			local15 = local13[(int) ((local15 ^ (long) (arg1[local47] >> 24)) & 0xFFL)] ^ local15 >>> 8;
			local15 = local13[(int) ((local15 ^ (long) (arg1[local47] >> 16)) & 0xFFL)] ^ local15 >>> 8;
			local15 = local13[(int) ((local15 ^ (long) (arg1[local47] >> 8)) & 0xFFL)] ^ local15 >>> 8;
			local15 = local15 >>> 8 ^ local13[(int) (((long) arg1[local47] ^ local15) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local15 = local13[(int) (((long) arg3[local131] ^ local15) & 0xFFL)] ^ local15 >>> 8;
			}
		}
		return local15 >>> 8 ^ local13[(int) (((long) (arg2 ? 1 : 0) ^ local15) & 0xFFL)];
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!rs;IZLclient!qa;IIILclient!tt;I)Lclient!r;")
	public Class19 method7374(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) int arg5, @OriginalArg(8) Class280 arg6, @OriginalArg(9) int arg7) {
		@Pc(5) Class19 local5 = null;
		@Pc(18) int local18 = 2048;
		@Pc(20) Class255 local20 = null;
		if (arg2 != -1) {
			local20 = Static109.aClass18_1.method869(arg2);
		}
		@Pc(33) int[] local33 = this.anIntArray747;
		if (local20 != null && local20.anIntArray574 != null) {
			local33 = new int[local20.anIntArray574.length];
			for (@Pc(45) int local45 = 0; local45 < local20.anIntArray574.length; local45++) {
				@Pc(51) int local51 = local20.anIntArray574[local45];
				if (local51 >= 0 && this.anIntArray747.length > local51) {
					local33[local45] = this.anIntArray747[local51];
				} else {
					local33[local45] = -1;
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
		@Pc(92) Class1_Sub1_Sub8 local92 = null;
		@Pc(94) Class1_Sub1_Sub8 local94 = null;
		if (arg6 != null) {
			local18 = 2080;
			local86 = arg6.anIntArray629[arg0];
			@Pc(109) int local109 = local86 >>> 16;
			local86 &= 0xFFFF;
			local92 = Static6.aClass126_1.method3573(local109);
			if (local92 != null) {
				local80 = local92.method3251(local86) | false;
				local78 = local92.method3247(local86) | false;
				local84 = local92.method3245(local86) | false;
				local82 = arg6.aBoolean548 | false;
			}
			if ((arg6.aBoolean547 || Static306.aBoolean405) && arg5 != -1 && arg6.anIntArray629.length > arg5) {
				local88 = arg6.anIntArray629[arg5];
				local90 = arg6.anIntArray630[arg0];
				@Pc(177) int local177 = local88 >>> 16;
				local88 &= 0xFFFF;
				if (local177 == local109) {
					local94 = local92;
				} else {
					local94 = Static6.aClass126_1.method3573(local88 >>> 16);
				}
				if (local94 != null) {
					local80 |= local94.method3251(local88);
					local78 |= local94.method3247(local88);
					local84 |= local94.method3245(local88);
				}
			}
			if (local80) {
				local18 = 2208;
			}
			if (local78) {
				local18 |= 0x100;
			}
			if (local82) {
				local18 |= 0x200;
			}
			if (local84) {
				local18 |= 0x400;
			}
		}
		@Pc(260) long local260 = this.method7373(arg2, local33, arg3, arg1 == null ? null : arg1.anIntArray582);
		if (Static186.aClass316_22 != null) {
			local5 = (Class19) Static186.aClass316_22.method7799(local260);
		}
		if (local5 == null || arg4.method7607(local5.ba(), local18) != 0) {
			if (local5 != null) {
				local18 = arg4.method7606(local18, local5.ba());
			}
			@Pc(286) int local286 = local18;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local33.length; local290++) {
				if (local33[local290] != -1 && !Static454.aClass153_2.method4007(local33[local290]).method5014(arg3)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(326) Class86[] local326 = new Class86[local33.length];
			for (@Pc(328) int local328 = 0; local328 < local33.length; local328++) {
				if (local33[local328] != -1) {
					local326[local328] = Static454.aClass153_2.method4007(local33[local328]).method5012(arg3);
				}
			}
			@Pc(379) int local379;
			if (local20 != null && local20.anIntArrayArray71 != null) {
				for (@Pc(361) int local361 = 0; local361 < local20.anIntArrayArray71.length; local361++) {
					if (local20.anIntArrayArray71[local361] != null && local326[local361] != null) {
						local379 = local20.anIntArrayArray71[local361][0];
						@Pc(386) int local386 = local20.anIntArrayArray71[local361][1];
						@Pc(393) int local393 = local20.anIntArrayArray71[local361][2];
						@Pc(400) int local400 = local20.anIntArrayArray71[local361][3];
						@Pc(407) int local407 = local20.anIntArrayArray71[local361][4];
						@Pc(414) int local414 = local20.anIntArrayArray71[local361][5];
						if (local400 != 0 || local407 != 0 || local414 != 0) {
							local326[local361].method2797(local400, local414, local407);
						}
						if (local379 != 0 || local386 != 0 || local393 != 0) {
							local326[local361].method2792(local379, local393, local386);
						}
					}
				}
			}
			@Pc(467) Class86 local467 = new Class86(local326, local326.length);
			if (arg1 != null) {
				local286 = local18 | 0x4000;
			}
			local5 = arg4.method7635(local467, local286, Static321.anInt6090, 64, 850);
			if (arg1 != null) {
				for (local379 = 0; local379 < 5; local379++) {
					if (Static432.aShortArrayArray12[local379].length > arg1.anIntArray582[local379]) {
						local5.pa(Static531.aShortArray169[local379], Static432.aShortArrayArray12[local379][arg1.anIntArray582[local379]]);
					}
					if (Static409.aShortArrayArray9[local379].length > arg1.anIntArray582[local379]) {
						local5.pa(Static65.aShortArray158[local379], Static409.aShortArrayArray9[local379][arg1.anIntArray582[local379]]);
					}
				}
			}
			if (Static186.aClass316_22 != null) {
				local5.m(local18);
				Static186.aClass316_22.method7792(local260, local5);
			}
		}
		if (arg6 == null || local92 == null) {
			return local5;
		} else {
			@Pc(562) Class19 local562 = local5.method7260((byte) 1, local18, true);
			local562.method7250(local92, local94, local90, local88, 0, local86, arg7 - 1, arg6.aBoolean548);
			return local562;
		}
	}
}
