import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class46_Sub1_Sub1 extends Class46_Sub1 {

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!fv;IIII[[I[[II)V")
	public Class46_Sub1_Sub1(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([III[[ZLclient!jf;ZIII[III)V")
	private void method882(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) Class153 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int arg7) {
		@Pc(14) int local14 = (arg1 - arg5) * 1024 / 256;
		arg4.aBoolean329 = false;
		arg4.aBoolean332 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg2; local32 < arg7; local32++) {
			for (@Pc(36) int local36 = arg5; local36 < arg1; local36++) {
				if (arg3[local32 - arg2][local36 - arg5]) {
					@Pc(83) int local83;
					if (super.aClass308ArrayArray3[local32][local36] != null) {
						@Pc(64) Class308 local64 = super.aClass308ArrayArray3[local32][local36];
						if (local64.aShort106 != -1 && (local64.aByte91 & 0x2) == 0 && local64.anInt8713 == 0) {
							local83 = super.aClass90_Sub2_15.method6763(local64.aShort106);
							arg4.method3802(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, Static222.method3512(local64.anInt8716, local83), Static222.method3512(local64.anInt8714, local83), Static222.method3512(local64.anInt8717, local83));
							arg4.method3802(local30, local30, local30 - 4, local26, local26 + 4, local26, Static222.method3512(local64.anInt8715, local83), Static222.method3512(local64.anInt8717, local83), Static222.method3512(local64.anInt8714, local83));
						} else if (local64.anInt8713 == 0) {
							arg4.method3809(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local64.anInt8716, local64.anInt8714, local64.anInt8717);
							arg4.method3809(local30, local30, local30 - 4, local26, local26 + 4, local26, local64.anInt8715, local64.anInt8717, local64.anInt8714);
						} else {
							local83 = local64.anInt8713;
							arg4.method3809(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, Static277.method4166(local64.anInt8716 & 0xFF000000, local83), Static277.method4166(local64.anInt8714 & 0xFF000000, local83), Static277.method4166(local64.anInt8717 & 0xFF000000, local83));
							arg4.method3809(local30, local30, local30 - 4, local26, local26 + 4, local26, Static277.method4166(local64.anInt8715 & 0xFF000000, local83), Static277.method4166(local64.anInt8717 & 0xFF000000, local83), Static277.method4166(local64.anInt8714 & 0xFF000000, local83));
						}
					} else if (super.aClass232ArrayArray3[local32][local36] != null) {
						@Pc(291) Class232 local291 = super.aClass232ArrayArray3[local32][local36];
						for (local83 = 0; local83 < local291.aShort87; local83++) {
							arg0[local83] = local291.aShortArray101[local83] * 4 / super.anInt9998 + local26;
							arg6[local83] = local30 - local291.aShortArray104[local83] * 4 / super.anInt9998;
						}
						for (@Pc(331) int local331 = 0; local331 < local291.aShort88; local331++) {
							@Pc(337) int local337 = local331 * 3;
							@Pc(341) int local341 = local337 + 1;
							@Pc(345) int local345 = local341 + 1;
							@Pc(349) int local349 = arg0[local337];
							@Pc(353) int local353 = arg0[local341];
							@Pc(357) int local357 = arg0[local345];
							@Pc(361) int local361 = arg6[local337];
							@Pc(365) int local365 = arg6[local341];
							@Pc(369) int local369 = arg6[local345];
							@Pc(407) int local407;
							if (local291.anIntArray479 != null && local291.anIntArray479[local331] != 0 && (local291.aShortArray103 == null || local291.aShortArray103 != null && local291.aShortArray103[local331] == -1)) {
								local407 = local291.anIntArray479[local331];
								arg4.method3809(local361, local365, local369, local349, local353, local357, Static277.method4166(-(local291.anIntArray480[local337] & 0xFF000000) - 16777216, local407), Static277.method4166(-(-16777216 & local291.anIntArray480[local341]) - 16777216, local407), Static277.method4166(-(local291.anIntArray480[local345] & -16777216) - 16777216, local407));
							} else if (local291.aShortArray103 == null || local291.aShortArray103[local331] == -1) {
								arg4.method3809(local361, local365, local369, local349, local353, local357, local291.anIntArray480[local337], local291.anIntArray480[local341], local291.anIntArray480[local345]);
							} else {
								local407 = super.aClass90_Sub2_15.method6763(local291.aShortArray103[local331]);
								arg4.method3802(local361, local365, local369, local349, local353, local357, local407, local407, local407);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local14;
			local26 += 4;
		}
		arg4.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!jf;[I[IZ[I)V")
	private void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class153 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(16) Class105 local16 = super.aClass105ArrayArray3[arg0][arg1];
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(252) int local252;
		@Pc(336) int local336;
		@Pc(399) int local399;
		@Pc(443) int local443;
		@Pc(285) int local285;
		@Pc(347) int local347;
		@Pc(410) int local410;
		@Pc(474) int local474;
		@Pc(240) int local240;
		@Pc(305) int local305;
		@Pc(368) int local368;
		@Pc(432) int local432;
		@Pc(274) int local274;
		@Pc(325) int local325;
		@Pc(388) int local388;
		@Pc(463) int local463;
		@Pc(98) int local98;
		@Pc(97) int local97;
		@Pc(95) int local95;
		@Pc(93) int local93;
		@Pc(85) int local85;
		if (local16 == null) {
			@Pc(1096) Class326 local1096 = super.aClass326ArrayArray3[arg0][arg1];
			if (local1096 != null) {
				@Pc(1122) short local1122;
				if (super.anInt7673 == -1) {
					for (local443 = 0; local443 < local1096.aShort118; local443++) {
						local34 = local1096.aShortArray147[local443] + (arg0 << super.anInt10000);
						local1122 = local1096.aShortArray154[local443];
						local44 = local1096.aShortArray153[local443] + (arg1 << super.anInt10000);
						local399 = (super.anInt7671 * local34 + local1122 * super.anInt7665 + local44 * super.anInt7666 >> 14) + super.anInt7664;
						if (local399 <= super.aClass90_Sub2_15.anInt8496) {
							return;
						}
						local252 = (super.anInt7670 * local44 + local34 * super.anInt7669 + local1122 * super.anInt7667 >> 14) + super.anInt7663;
						local336 = super.anInt7662 + (super.anInt7661 * local44 + local34 * super.anInt7672 + super.anInt7660 * local1122 >> 14);
						arg3[local443] = arg2.anInt4479 + super.aClass90_Sub2_15.anInt8507 * local252 / local399;
						arg5[local443] = arg2.anInt4481 + local336 * super.aClass90_Sub2_15.anInt8503 / local399;
					}
				} else {
					for (local443 = 0; local443 < local1096.aShort118; local443++) {
						local34 = local1096.aShortArray147[local443] + (arg0 << super.anInt10000);
						local1122 = local1096.aShortArray154[local443];
						local44 = local1096.aShortArray153[local443] + (arg1 << super.anInt10000);
						local336 = super.anInt7662 + (local1122 * super.anInt7660 + super.anInt7672 * local34 + local44 * super.anInt7661 >> 14);
						local252 = super.anInt7663 + (local34 * super.anInt7669 + local1122 * super.anInt7667 + local44 * super.anInt7670 >> 14);
						arg3[local443] = super.aClass90_Sub2_15.anInt8507 * local252 / super.anInt7673 + arg2.anInt4479;
						arg5[local443] = arg2.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local336 / super.anInt7673;
					}
				}
				if (local1096.aShortArray150 == null) {
					for (local443 = 0; local443 < local1096.aShort119; local443++) {
						@Pc(1360) short local1360 = local1096.aShortArray151[local443];
						@Pc(1365) short local1365 = local1096.aShortArray152[local443];
						@Pc(1370) short local1370 = local1096.aShortArray148[local443];
						local474 = arg3[local1360];
						local240 = arg3[local1365];
						local305 = arg3[local1370];
						local368 = arg5[local1360];
						local432 = arg5[local1365];
						local274 = arg5[local1370];
						if (-((local305 - local240) * (local368 - local432)) + (local474 - local240) * (local274 - local432) > 0) {
							local325 = local1096.anIntArray654[local443];
							if (local325 != -1) {
								arg2.aBoolean328 = local474 < 0 || local240 < 0 || local305 < 0 || local474 > arg2.anInt4477 || arg2.anInt4477 < local240 || arg2.anInt4477 < local305;
								arg2.method3802(local368, local432, local274, local474, local240, local305, Static222.method3512(local1096.aShortArray149[local1360], local325), Static222.method3512(local1096.aShortArray149[local1365], local325), Static222.method3512(local1096.aShortArray149[local1370], local325));
							}
						}
					}
				} else {
					local443 = super.anIntArrayArray66[arg0][arg1];
					local285 = super.anIntArrayArray66[arg0 + 1][arg1];
					local347 = super.anIntArrayArray66[arg0][arg1 + 1];
					local410 = arg0 * super.anInt9998;
					local474 = super.anInt9998 + local410;
					local240 = arg1 * super.anInt9998;
					local305 = local240 + super.anInt9998;
					local368 = super.anInt7663 + (local240 * super.anInt7670 + local443 * super.anInt7667 + super.anInt7669 * local410 >> 14);
					local432 = (super.anInt7661 * local240 + super.anInt7660 * local443 + local410 * super.anInt7672 >> 14) + super.anInt7662;
					local274 = (local240 * super.anInt7666 + super.anInt7671 * local410 + local443 * super.anInt7665 >> 14) + super.anInt7664;
					local325 = super.anInt7663 + (local240 * super.anInt7670 + local474 * super.anInt7669 + super.anInt7667 * local285 >> 14);
					local388 = (local240 * super.anInt7661 + local285 * super.anInt7660 + super.anInt7672 * local474 >> 14) + super.anInt7662;
					local463 = super.anInt7664 + (super.anInt7671 * local474 + super.anInt7665 * local285 + local240 * super.anInt7666 >> 14);
					local98 = super.anInt7663 + (super.anInt7670 * local305 + super.anInt7667 * local347 + local410 * super.anInt7669 >> 14);
					local97 = (super.anInt7660 * local347 + super.anInt7672 * local410 + super.anInt7661 * local305 >> 14) + super.anInt7662;
					local95 = super.anInt7664 + (super.anInt7665 * local347 + local410 * super.anInt7671 + super.anInt7666 * local305 >> 14);
					for (local93 = 0; local93 < local1096.aShort119; local93++) {
						@Pc(1741) short local1741 = local1096.aShortArray151[local93];
						@Pc(1746) short local1746 = local1096.aShortArray152[local93];
						@Pc(1751) short local1751 = local1096.aShortArray148[local93];
						local85 = arg3[local1741];
						@Pc(1759) int local1759 = arg3[local1746];
						@Pc(1763) int local1763 = arg3[local1751];
						@Pc(1767) int local1767 = arg5[local1741];
						@Pc(1771) int local1771 = arg5[local1746];
						@Pc(1775) int local1775 = arg5[local1751];
						if (-((local1767 - local1771) * (local1763 + -local1759)) + (local85 - local1759) * (local1775 - local1771) > 0) {
							arg2.aBoolean328 = local85 < 0 || local1759 < 0 || local1763 < 0 || arg2.anInt4477 < local85 || local1759 > arg2.anInt4477 || arg2.anInt4477 < local1763;
							@Pc(1829) short local1829 = local1096.aShortArray150[local93];
							if (local1829 == -1) {
								@Pc(1885) int local1885 = local1096.anIntArray654[local93];
								if (local1885 != -1) {
									arg2.method3802(local1767, local1771, local1775, local85, local1759, local1763, Static222.method3512(local1096.aShortArray149[local1741], local1885), Static222.method3512(local1096.aShortArray149[local1746], local1885), Static222.method3512(local1096.aShortArray149[local1751], local1885));
								}
							} else {
								if (this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local1829).aByte34)) {
									arg2.anInt4478 = 100;
								}
								arg2.method3805(local1767, local1771, local1775, local85, local1759, local1763, local1096.aShortArray149[local1741], local1096.aShortArray149[local1746], local1096.aShortArray149[local1751], local368, local325, local98, local432, local388, local97, local274, local463, local95, local1829);
								arg2.anInt4478 = 0;
							}
						}
					}
				}
			}
		} else if ((local16.aByte33 & 0x2) == 0) {
			@Pc(29) int local29 = arg0 * super.anInt9998;
			local34 = super.anInt9998 + local29;
			@Pc(39) int local39 = super.anInt9998 * arg1;
			local44 = super.anInt9998 + local39;
			@Pc(56) int local56;
			@Pc(65) int local65;
			@Pc(76) int local76;
			if ((local16.aByte33 & 0x1) == 0) {
				local56 = super.anIntArrayArray66[arg0][arg1];
				local65 = super.anIntArrayArray66[arg0 + 1][arg1];
				local76 = super.anIntArrayArray66[arg0 + 1][arg1 + 1];
				local85 = super.anIntArrayArray66[arg0][arg1 + 1];
				if (super.anInt7673 == -1) {
					local98 = super.anInt7664 + (super.anInt7671 * local29 + super.anInt7665 * local56 + super.anInt7666 * local39 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local98) {
						return;
					}
					local97 = super.anInt7664 + (local65 * super.anInt7665 + local34 * super.anInt7671 + super.anInt7666 * local39 >> 14);
					if (local97 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local95 = (local76 * super.anInt7665 + local34 * super.anInt7671 + local44 * super.anInt7666 >> 14) + super.anInt7664;
					if (super.aClass90_Sub2_15.anInt8496 >= local95) {
						return;
					}
					local93 = super.anInt7664 + (local44 * super.anInt7666 + super.anInt7671 * local29 + local85 * super.anInt7665 >> 14);
					if (local93 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
				} else {
					local93 = super.anInt7673;
					local95 = super.anInt7673;
					local97 = super.anInt7673;
					local98 = super.anInt7673;
				}
				local240 = super.anInt7663 + (local29 * super.anInt7669 + super.anInt7667 * local56 + super.anInt7670 * local39 >> 14);
				local252 = arg2.anInt4479 + local240 * super.aClass90_Sub2_15.anInt8507 / local98;
				local274 = super.anInt7662 + (super.anInt7672 * local29 + local56 * super.anInt7660 + super.anInt7661 * local39 >> 14);
				local285 = arg2.anInt4481 + local274 * super.aClass90_Sub2_15.anInt8503 / local98;
				local305 = (local39 * super.anInt7670 + local34 * super.anInt7669 + local65 * super.anInt7667 >> 14) + super.anInt7663;
				local325 = (super.anInt7661 * local39 + local65 * super.anInt7660 + super.anInt7672 * local34 >> 14) + super.anInt7662;
				local336 = super.aClass90_Sub2_15.anInt8507 * local305 / local97 + arg2.anInt4479;
				local347 = arg2.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local325 / local97;
				local368 = (super.anInt7667 * local76 + super.anInt7669 * local34 + super.anInt7670 * local44 >> 14) + super.anInt7663;
				local388 = (super.anInt7672 * local34 + local76 * super.anInt7660 + super.anInt7661 * local44 >> 14) + super.anInt7662;
				local399 = local368 * super.aClass90_Sub2_15.anInt8507 / local95 + arg2.anInt4479;
				local410 = super.aClass90_Sub2_15.anInt8503 * local388 / local95 + arg2.anInt4481;
				local432 = super.anInt7663 + (local29 * super.anInt7669 + super.anInt7667 * local85 + local44 * super.anInt7670 >> 14);
				local443 = local432 * super.aClass90_Sub2_15.anInt8507 / local93 + arg2.anInt4479;
				local463 = (super.anInt7660 * local85 + local29 * super.anInt7672 + super.anInt7661 * local44 >> 14) + super.anInt7662;
				local474 = arg2.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local463 / local93;
			} else {
				local56 = super.anIntArrayArray66[arg0][arg1];
				if (super.anInt7673 == -1) {
					local65 = super.anInt7665 * local56;
					local98 = (local65 + local29 * super.anInt7671 + local39 * super.anInt7666 >> 14) + super.anInt7664;
					if (super.aClass90_Sub2_15.anInt8496 >= local98) {
						return;
					}
					local97 = (local39 * super.anInt7666 + local34 * super.anInt7671 + local65 >> 14) + super.anInt7664;
					if (local97 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local95 = super.anInt7664 + (super.anInt7666 * local44 + super.anInt7671 * local34 + local65 >> 14);
					if (local95 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local93 = (local44 * super.anInt7666 + super.anInt7671 * local29 + local65 >> 14) + super.anInt7664;
					if (local93 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
				} else {
					local93 = super.anInt7673;
					local95 = super.anInt7673;
					local97 = super.anInt7673;
					local98 = super.anInt7673;
				}
				local65 = super.anInt7667 * local56;
				local76 = local56 * super.anInt7660;
				local240 = (super.anInt7670 * local39 + local65 + local29 * super.anInt7669 >> 14) + super.anInt7663;
				local274 = (super.anInt7661 * local39 + local29 * super.anInt7672 + local76 >> 14) + super.anInt7662;
				local252 = arg2.anInt4479 + super.aClass90_Sub2_15.anInt8507 * local240 / local98;
				local305 = super.anInt7663 + (super.anInt7670 * local39 + local65 + super.anInt7669 * local34 >> 14);
				local285 = super.aClass90_Sub2_15.anInt8503 * local274 / local98 + arg2.anInt4481;
				local325 = super.anInt7662 + (local34 * super.anInt7672 + local76 + super.anInt7661 * local39 >> 14);
				local336 = super.aClass90_Sub2_15.anInt8507 * local305 / local97 + arg2.anInt4479;
				local368 = (local65 + local34 * super.anInt7669 + super.anInt7670 * local44 >> 14) + super.anInt7663;
				local347 = arg2.anInt4481 + local325 * super.aClass90_Sub2_15.anInt8503 / local97;
				local399 = arg2.anInt4479 + super.aClass90_Sub2_15.anInt8507 * local368 / local95;
				local388 = super.anInt7662 + (super.anInt7661 * local44 + local76 + local34 * super.anInt7672 >> 14);
				local432 = (super.anInt7670 * local44 + local65 + local29 * super.anInt7669 >> 14) + super.anInt7663;
				local410 = arg2.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local388 / local95;
				local463 = super.anInt7662 + (super.anInt7661 * local44 + local76 + local29 * super.anInt7672 >> 14);
				local443 = super.aClass90_Sub2_15.anInt8507 * local432 / local93 + arg2.anInt4479;
				local474 = super.aClass90_Sub2_15.anInt8503 * local463 / local93 + arg2.anInt4481;
			}
			if ((local399 - local443) * (local347 + -local474) - (local410 - local474) * (-local443 + local336) > 0) {
				arg2.aBoolean328 = local399 < 0 || local443 < 0 || local336 < 0 || arg2.anInt4477 < local399 || local443 > arg2.anInt4477 || arg2.anInt4477 < local336;
				if (local16.aShort53 >= 0) {
					if (this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local16.aShort53).aByte34)) {
						arg2.anInt4478 = 100;
					}
					arg2.method3805(local410, local474, local347, local399, local443, local336, local16.aShort51 & 0xFFFF, local16.aShort52 & 0xFFFF, local16.aShort50 & 0xFFFF, local240, local305, local432, local274, local325, local463, local98, local97, local93, local16.aShort53);
					arg2.anInt4478 = 0;
				} else {
					arg2.method3802(local410, local474, local347, local399, local443, local336, local16.aShort51 & 0xFFFF, local16.aShort52 & 0xFFFF, local16.aShort50 & 0xFFFF);
				}
			}
			if ((local474 - local347) * (local252 - local336) - (local443 - local336) * (local285 - local347) > 0) {
				arg2.aBoolean328 = local252 < 0 || local336 < 0 || local443 < 0 || arg2.anInt4477 < local252 || local336 > arg2.anInt4477 || arg2.anInt4477 < local443;
				if (local16.aShort53 >= 0) {
					if (this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local16.aShort53).aByte34)) {
						arg2.anInt4478 = 100;
					}
					arg2.method3805(local285, local347, local474, local252, local336, local443, local16.aShort54 & 0xFFFF, local16.aShort50 & 0xFFFF, local16.aShort52 & 0xFFFF, local240, local305, local432, local274, local325, local463, local98, local97, local93, local16.aShort53);
					arg2.anInt4478 = 0;
					return;
				}
				arg2.method3802(local285, local347, local474, local252, local336, local443, local16.aShort54 & 0xFFFF, local16.aShort50 & 0xFFFF, local16.aShort52 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([IIZLclient!jf;[IIB[I)V")
	private void method885(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class153 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class308 local12 = super.aClass308ArrayArray3[arg5][arg1];
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(43) int local43;
		@Pc(464) int local464;
		@Pc(528) int local528;
		@Pc(615) int local615;
		@Pc(677) int local677;
		@Pc(517) int local517;
		@Pc(561) int local561;
		@Pc(646) int local646;
		@Pc(689) int local689;
		@Pc(453) int local453;
		@Pc(505) int local505;
		@Pc(582) int local582;
		@Pc(635) int local635;
		@Pc(485) int local485;
		@Pc(550) int local550;
		@Pc(604) int local604;
		@Pc(666) int local666;
		@Pc(107) int local107;
		@Pc(106) int local106;
		@Pc(104) int local104;
		@Pc(102) int local102;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(230) int local230;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(249) int local249;
		if (local12 == null) {
			@Pc(1600) Class232 local1600 = super.aClass232ArrayArray3[arg5][arg1];
			if (local1600 != null) {
				if (super.anInt7673 == -1) {
					for (local677 = 0; local677 < local1600.aShort87; local677++) {
						local33 = local1600.aShortArray101[local677] + (arg5 << super.anInt10000);
						local38 = local1600.aShortArray105[local677];
						local43 = local1600.aShortArray104[local677] + (arg1 << super.anInt10000);
						local615 = (super.anInt7665 * local38 + local33 * super.anInt7671 + super.anInt7666 * local43 >> 14) + super.anInt7664;
						if (local615 <= super.aClass90_Sub2_15.anInt8496) {
							return;
						}
						arg4[local677] = 0;
						if (arg2) {
							local517 = local615 - super.aClass90_Sub2_15.anInt8505;
							if (local517 > 255) {
								local517 = 255;
							}
							if (local517 > 0) {
								arg4[local677] = local517;
								local561 = local517 * local1600.aShortArray106[local677] / 255;
								if (local561 > 0) {
									local38 -= local561;
								}
							}
						} else if (super.aClass90_Sub2_15.aBoolean550) {
							local517 = local615 - super.aClass90_Sub2_15.anInt8505;
							if (local517 > 0) {
								arg4[local677] = local517;
								if (arg4[local677] > 255) {
									arg4[local677] = 255;
								}
							}
						}
						local464 = (local43 * super.anInt7670 + super.anInt7667 * local38 + local33 * super.anInt7669 >> 14) + super.anInt7663;
						local528 = super.anInt7662 + (super.anInt7660 * local38 + super.anInt7672 * local33 + super.anInt7661 * local43 >> 14);
						arg0[local677] = local464 * super.aClass90_Sub2_15.anInt8507 / local615 + arg3.anInt4479;
						arg6[local677] = local528 * super.aClass90_Sub2_15.anInt8503 / local615 + arg3.anInt4481;
					}
				} else {
					for (local677 = 0; local677 < local1600.aShort87; local677++) {
						local33 = local1600.aShortArray101[local677] + (arg5 << super.anInt10000);
						local38 = local1600.aShortArray105[local677];
						local43 = local1600.aShortArray104[local677] + (arg1 << super.anInt10000);
						arg4[local677] = 0;
						if (arg2) {
							local517 = -super.aClass90_Sub2_15.anInt8505 + super.anInt7673;
							if (local517 > 255) {
								local517 = 255;
							}
							if (local517 > 0) {
								arg4[local677] = local517;
								local561 = local1600.aShortArray106[local677] * local517 / 255;
								if (local561 > 0) {
									local38 -= local561;
								}
							}
						} else if (super.aClass90_Sub2_15.aBoolean550) {
							local517 = -super.aClass90_Sub2_15.anInt8505 + super.anInt7673;
							if (local517 > 0) {
								arg4[local677] = local517;
								if (arg4[local677] > 255) {
									arg4[local677] = 255;
								}
							}
						}
						local464 = super.anInt7663 + (super.anInt7670 * local43 + local33 * super.anInt7669 + super.anInt7667 * local38 >> 14);
						local528 = (local38 * super.anInt7660 + local33 * super.anInt7672 + super.anInt7661 * local43 >> 14) + super.anInt7662;
						arg0[local677] = arg3.anInt4479 + local464 * super.aClass90_Sub2_15.anInt8507 / super.anInt7673;
						arg6[local677] = local528 * super.aClass90_Sub2_15.anInt8503 / super.anInt7673 + arg3.anInt4481;
					}
				}
				if (local1600.aShortArray103 == null) {
					for (local677 = 0; local677 < local1600.aShort88; local677++) {
						local517 = local677 * 3;
						local561 = local517 + 1;
						local646 = local561 + 1;
						local689 = arg0[local517];
						local453 = arg0[local561];
						local505 = arg0[local646];
						local582 = arg6[local517];
						local635 = arg6[local561];
						local485 = arg6[local646];
						local550 = arg4[local561] + arg4[local517] + arg4[local646];
						if (-((local505 - local453) * (-local635 + local582)) + (local485 - local635) * (-local453 + local689) > 0) {
							arg3.aBoolean328 = local689 < 0 || local453 < 0 || local505 < 0 || local689 > arg3.anInt4477 || arg3.anInt4477 < local453 || arg3.anInt4477 < local505;
							if (local550 >= 765) {
								arg3.method3800(local582, local635, local485, local689, local453, local505, super.aClass90_Sub2_15.anInt8499);
							} else if (local550 <= 0) {
								if ((local1600.anIntArray480[local517] & 0xFFFFFF) != 0) {
									arg3.method3809(local582, local635, local485, local689, local453, local505, local1600.anIntArray480[local517], local1600.anIntArray480[local561], local1600.anIntArray480[local646]);
								}
							} else if ((local1600.anIntArray480[local517] & 0xFFFFFF) != 0) {
								arg3.method3809(local582, local635, local485, local689, local453, local505, Static125.method1935(local1600.anIntArray480[local517], super.aClass90_Sub2_15.anInt8499, arg4[local517]), Static125.method1935(local1600.anIntArray480[local561], super.aClass90_Sub2_15.anInt8499, arg4[local561]), Static125.method1935(local1600.anIntArray480[local646], super.aClass90_Sub2_15.anInt8499, arg4[local646]));
							}
						}
					}
				} else {
					local677 = super.anIntArrayArray66[arg5][arg1];
					local517 = super.anIntArrayArray66[arg5 + 1][arg1];
					local561 = super.anIntArrayArray66[arg5][arg1 + 1];
					local646 = super.anInt9998 * arg5;
					local689 = super.anInt9998 + local646;
					local453 = arg1 * super.anInt9998;
					local505 = local453 + super.anInt9998;
					local582 = super.anInt7663 + (local453 * super.anInt7670 + local677 * super.anInt7667 + local646 * super.anInt7669 >> 14);
					local635 = (super.anInt7672 * local646 + local677 * super.anInt7660 + super.anInt7661 * local453 >> 14) + super.anInt7662;
					local485 = (super.anInt7665 * local677 + local646 * super.anInt7671 + super.anInt7666 * local453 >> 14) + super.anInt7664;
					local550 = (local453 * super.anInt7670 + super.anInt7667 * local517 + local689 * super.anInt7669 >> 14) + super.anInt7663;
					local604 = super.anInt7662 + (super.anInt7661 * local453 + local517 * super.anInt7660 + super.anInt7672 * local689 >> 14);
					local666 = (local453 * super.anInt7666 + super.anInt7671 * local689 + local517 * super.anInt7665 >> 14) + super.anInt7664;
					local107 = (local505 * super.anInt7670 + super.anInt7669 * local646 + super.anInt7667 * local561 >> 14) + super.anInt7663;
					local106 = (super.anInt7661 * local505 + super.anInt7660 * local561 + local646 * super.anInt7672 >> 14) + super.anInt7662;
					local104 = super.anInt7664 + (super.anInt7665 * local561 + super.anInt7671 * local646 + local505 * super.anInt7666 >> 14);
					for (local102 = 0; local102 < local1600.aShort88; local102++) {
						local45 = local102 * 3;
						local47 = local45 + 1;
						local49 = local47 + 1;
						local51 = arg0[local45];
						local230 = arg0[local47];
						local65 = arg0[local49];
						local74 = arg6[local45];
						local85 = arg6[local47];
						local94 = arg6[local49];
						local249 = arg4[local49] + arg4[local47] + arg4[local45];
						if ((local94 - local85) * (local51 - local230) - (local65 - local230) * (local74 - local85) > 0) {
							arg3.aBoolean328 = local51 < 0 || local230 < 0 || local65 < 0 || local51 > arg3.anInt4477 || local230 > arg3.anInt4477 || arg3.anInt4477 < local65;
							@Pc(2349) short local2349 = local1600.aShortArray103[local102];
							if (local249 >= 765) {
								arg3.method3800(local74, local85, local94, local51, local230, local65, super.aClass90_Sub2_15.anInt8499);
							} else {
								if (local2349 != -1 && this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local2349).aByte34)) {
									arg3.anInt4478 = 100;
								}
								if (local249 > 0) {
									if (local2349 != -1) {
										arg3.method3801(local74, local85, local94, local51, local230, local65, super.aClass90_Sub2_15.anInt8499, arg4[local45], arg4[local47], arg4[local49], local1600.anIntArray480[local45], local1600.anIntArray480[local47], local1600.anIntArray480[local49], local582, local550, local107, local635, local604, local106, local485, local666, local104, local2349);
									} else if ((local1600.anIntArray480[local45] & 0xFFFFFF) != 0) {
										arg3.method3809(local74, local85, local94, local51, local230, local65, Static277.method4166(super.aClass90_Sub2_15.anInt8499 | arg4[local45] << 24, local1600.anIntArray480[local45]), Static277.method4166(arg4[local47] << 24 | super.aClass90_Sub2_15.anInt8499, local1600.anIntArray480[local47]), Static277.method4166(super.aClass90_Sub2_15.anInt8499 | arg4[local49] << 24, local1600.anIntArray480[local49]));
									}
								} else if (local2349 != -1) {
									arg3.method3805(local74, local85, local94, local51, local230, local65, local1600.anIntArray480[local45], local1600.anIntArray480[local47], local1600.anIntArray480[local49], local582, local550, local107, local635, local604, local106, local485, local666, local104, local2349);
								} else if ((local1600.anIntArray480[local45] & 0xFFFFFF) != 0) {
									arg3.method3809(local74, local85, local94, local51, local230, local65, local1600.anIntArray480[local45], local1600.anIntArray480[local47], local1600.anIntArray480[local49]);
								}
								arg3.anInt4478 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte91 & 0x2) == 0) {
			@Pc(28) int local28 = super.anInt9998 * arg5;
			local33 = super.anInt9998 + local28;
			local38 = super.anInt9998 * arg1;
			local43 = super.anInt9998 + local38;
			local45 = 0;
			local47 = 0;
			local49 = 0;
			local51 = 0;
			if ((local12.aByte91 & 0x1) == 0 || arg2) {
				local65 = super.anIntArrayArray66[arg5][arg1];
				local74 = super.anIntArrayArray66[arg5 + 1][arg1];
				local85 = super.anIntArrayArray66[arg5 + 1][arg1 + 1];
				local94 = super.anIntArrayArray66[arg5][arg1 + 1];
				if (super.anInt7673 == -1) {
					local107 = super.anInt7664 + (local38 * super.anInt7666 + local65 * super.anInt7665 + super.anInt7671 * local28 >> 14);
					if (local107 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local106 = super.anInt7664 + (super.anInt7671 * local33 + super.anInt7665 * local74 + local38 * super.anInt7666 >> 14);
					if (super.aClass90_Sub2_15.anInt8496 >= local106) {
						return;
					}
					local104 = (local43 * super.anInt7666 + super.anInt7671 * local33 + super.anInt7665 * local85 >> 14) + super.anInt7664;
					if (super.aClass90_Sub2_15.anInt8496 >= local104) {
						return;
					}
					local102 = super.anInt7664 + (super.anInt7665 * local94 + super.anInt7671 * local28 + local43 * super.anInt7666 >> 14);
					if (local102 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
				} else {
					local102 = super.anInt7673;
					local104 = super.anInt7673;
					local106 = super.anInt7673;
					local107 = super.anInt7673;
				}
				if (arg2) {
					local230 = local107 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 255) {
						local230 = 255;
					}
					if (local230 > 0) {
						local45 = local230;
						local249 = local230 * local12.aShort110 / 255;
						if (local249 > 0) {
							local65 -= local249;
						}
					}
					local230 = local106 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 255) {
						local230 = 255;
					}
					if (local230 > 0) {
						local47 = local230;
						local249 = local230 * local12.aShort107 / 255;
						if (local249 > 0) {
							local74 -= local249;
						}
					}
					local230 = local104 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 255) {
						local230 = 255;
					}
					if (local230 > 0) {
						local49 = local230;
						local249 = local12.aShort109 * local230 / 255;
						if (local249 > 0) {
							local85 -= local249;
						}
					}
					local230 = local102 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 255) {
						local230 = 255;
					}
					if (local230 > 0) {
						local51 = local230;
						local249 = local12.aShort108 * local230 / 255;
						if (local249 > 0) {
							local94 -= local249;
						}
					}
				} else if (super.aClass90_Sub2_15.aBoolean550) {
					local230 = local107 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local45 = local230;
						if (local230 > 255) {
							local45 = 255;
						}
					}
					local230 = local106 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local47 = local230;
						if (local230 > 255) {
							local47 = 255;
						}
					}
					local230 = local104 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local49 = local230;
						if (local230 > 255) {
							local49 = 255;
						}
					}
					local230 = local102 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local51 = local230;
						if (local230 > 255) {
							local51 = 255;
						}
					}
				}
				local453 = super.anInt7663 + (local38 * super.anInt7670 + local28 * super.anInt7669 + super.anInt7667 * local65 >> 14);
				local464 = super.aClass90_Sub2_15.anInt8507 * local453 / local107 + arg3.anInt4479;
				local485 = super.anInt7662 + (super.anInt7660 * local65 + super.anInt7672 * local28 + local38 * super.anInt7661 >> 14);
				local505 = super.anInt7663 + (super.anInt7670 * local38 + local74 * super.anInt7667 + local33 * super.anInt7669 >> 14);
				local517 = arg3.anInt4481 + local485 * super.aClass90_Sub2_15.anInt8503 / local107;
				local528 = super.aClass90_Sub2_15.anInt8507 * local505 / local106 + arg3.anInt4479;
				local550 = super.anInt7662 + (super.anInt7672 * local33 + local74 * super.anInt7660 + super.anInt7661 * local38 >> 14);
				local561 = local550 * super.aClass90_Sub2_15.anInt8503 / local106 + arg3.anInt4481;
				local582 = super.anInt7663 + (local85 * super.anInt7667 + super.anInt7669 * local33 + super.anInt7670 * local43 >> 14);
				local604 = super.anInt7662 + (super.anInt7672 * local33 + super.anInt7660 * local85 + local43 * super.anInt7661 >> 14);
				local615 = local582 * super.aClass90_Sub2_15.anInt8507 / local104 + arg3.anInt4479;
				local635 = (super.anInt7667 * local94 + super.anInt7669 * local28 + super.anInt7670 * local43 >> 14) + super.anInt7663;
				local646 = arg3.anInt4481 + local604 * super.aClass90_Sub2_15.anInt8503 / local104;
				local666 = super.anInt7662 + (local43 * super.anInt7661 + local94 * super.anInt7660 + local28 * super.anInt7672 >> 14);
				local677 = super.aClass90_Sub2_15.anInt8507 * local635 / local102 + arg3.anInt4479;
				local689 = arg3.anInt4481 + local666 * super.aClass90_Sub2_15.anInt8503 / local102;
			} else {
				local65 = super.anIntArrayArray66[arg5][arg1];
				if (super.anInt7673 == -1) {
					local74 = super.anInt7665 * local65;
					local107 = (local28 * super.anInt7671 + local74 + local38 * super.anInt7666 >> 14) + super.anInt7664;
					if (local107 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local106 = super.anInt7664 + (local38 * super.anInt7666 + super.anInt7671 * local33 + local74 >> 14);
					if (local106 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local104 = super.anInt7664 + (local74 + local33 * super.anInt7671 + super.anInt7666 * local43 >> 14);
					if (local104 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
					local102 = (local28 * super.anInt7671 + local74 + local43 * super.anInt7666 >> 14) + super.anInt7664;
					if (local102 <= super.aClass90_Sub2_15.anInt8496) {
						return;
					}
				} else {
					local102 = super.anInt7673;
					local104 = super.anInt7673;
					local106 = super.anInt7673;
					local107 = super.anInt7673;
				}
				if (super.aClass90_Sub2_15.aBoolean550) {
					local230 = local107 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local45 = local230;
						if (local230 > 255) {
							local45 = 255;
						}
					}
					local230 = local106 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local47 = local230;
						if (local230 > 255) {
							local47 = 255;
						}
					}
					local230 = local104 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local49 = local230;
						if (local230 > 255) {
							local49 = 255;
						}
					}
					local230 = local102 - super.aClass90_Sub2_15.anInt8505;
					if (local230 > 0) {
						local51 = local230;
						if (local230 > 255) {
							local51 = 255;
						}
					}
				}
				local74 = super.anInt7667 * local65;
				local85 = local65 * super.anInt7660;
				local453 = super.anInt7663 + (local28 * super.anInt7669 + local74 + super.anInt7670 * local38 >> 14);
				local464 = super.aClass90_Sub2_15.anInt8507 * local453 / local107 + arg3.anInt4479;
				local485 = (local38 * super.anInt7661 + local85 + super.anInt7672 * local28 >> 14) + super.anInt7662;
				local505 = super.anInt7663 + (local74 + super.anInt7669 * local33 + local38 * super.anInt7670 >> 14);
				local517 = local485 * super.aClass90_Sub2_15.anInt8503 / local107 + arg3.anInt4481;
				local550 = super.anInt7662 + (local85 + super.anInt7672 * local33 + local38 * super.anInt7661 >> 14);
				local528 = super.aClass90_Sub2_15.anInt8507 * local505 / local106 + arg3.anInt4479;
				local582 = (super.anInt7670 * local43 + super.anInt7669 * local33 + local74 >> 14) + super.anInt7663;
				local561 = arg3.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local550 / local106;
				local604 = (local43 * super.anInt7661 + local85 + super.anInt7672 * local33 >> 14) + super.anInt7662;
				local615 = local582 * super.aClass90_Sub2_15.anInt8507 / local104 + arg3.anInt4479;
				local635 = super.anInt7663 + (super.anInt7669 * local28 + local74 + super.anInt7670 * local43 >> 14);
				local646 = arg3.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local604 / local104;
				local666 = (local43 * super.anInt7661 + local28 * super.anInt7672 + local85 >> 14) + super.anInt7662;
				local677 = arg3.anInt4479 + local635 * super.aClass90_Sub2_15.anInt8507 / local102;
				local689 = arg3.anInt4481 + super.aClass90_Sub2_15.anInt8503 * local666 / local102;
			}
			@Pc(1157) boolean local1157 = local12.aShort106 != -1 && this.method6115(super.aClass90_Sub2_15.anInterface2_15.method3085(local12.aShort106).aByte34);
			local74 = local51 + local49 + local47;
			if ((local615 - local677) * (local561 - local689) - (local528 - local677) * (local646 + -local689) > 0) {
				arg3.aBoolean328 = local615 < 0 || local677 < 0 || local528 < 0 || local615 > arg3.anInt4477 || local677 > arg3.anInt4477 || arg3.anInt4477 < local528;
				if (local74 >= 765) {
					arg3.method3800(local646, local689, local561, local615, local677, local528, super.aClass90_Sub2_15.anInt8499);
				} else {
					if (local1157) {
						arg3.anInt4478 = 100;
					}
					if (local74 > 0) {
						if (local12.aShort106 < 0) {
							arg3.method3809(local646, local689, local561, local615, local677, local528, Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local49 << 24, local12.anInt8716), Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local51 << 24, local12.anInt8714), Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local47 << 24, local12.anInt8717));
						} else {
							arg3.method3801(local646, local689, local561, local615, local677, local528, super.aClass90_Sub2_15.anInt8499, local49, local51, local47, local12.anInt8716, local12.anInt8714, local12.anInt8717, local582, local635, local505, local604, local666, local550, local104, local102, local106, local12.aShort106);
						}
					} else if (local12.aShort106 < 0) {
						arg3.method3809(local646, local689, local561, local615, local677, local528, local12.anInt8716, local12.anInt8714, local12.anInt8717);
					} else {
						arg3.method3805(local646, local689, local561, local615, local677, local528, local12.anInt8716, local12.anInt8714, local12.anInt8717, local582, local635, local505, local604, local666, local550, local104, local102, local106, local12.aShort106);
					}
					arg3.anInt4478 = 0;
				}
			}
			local74 = local51 + local45 + local47;
			if ((local689 - local561) * (-local528 + local464) - (local677 - local528) * (-local561 + local517) > 0) {
				arg3.aBoolean328 = local464 < 0 || local528 < 0 || local677 < 0 || local464 > arg3.anInt4477 || arg3.anInt4477 < local528 || local677 > arg3.anInt4477;
				if (local74 < 765) {
					if (local1157) {
						arg3.anInt4478 = 100;
					}
					if (local74 > 0) {
						if (local12.aShort106 >= 0) {
							arg3.method3801(local517, local561, local689, local464, local528, local677, super.aClass90_Sub2_15.anInt8499, local45, local47, local51, local12.anInt8715, local12.anInt8717, local12.anInt8714, local453, local505, local635, local485, local550, local666, local107, local106, local102, local12.aShort106);
						} else {
							arg3.method3809(local517, local561, local689, local464, local528, local677, Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local45 << 24, local12.anInt8715), Static277.method4166(super.aClass90_Sub2_15.anInt8499 | local47 << 24, local12.anInt8717), Static277.method4166(local51 << 24 | super.aClass90_Sub2_15.anInt8499, local12.anInt8714));
						}
					} else if (local12.aShort106 < 0) {
						arg3.method3809(local517, local561, local689, local464, local528, local677, local12.anInt8715, local12.anInt8717, local12.anInt8714);
					} else {
						arg3.method3805(local517, local561, local689, local464, local528, local677, local12.anInt8715, local12.anInt8717, local12.anInt8714, local453, local505, local635, local485, local550, local666, local107, local106, local102, local12.aShort106);
					}
					arg3.anInt4478 = 0;
					return;
				}
				arg3.method3800(local517, local561, local689, local464, local528, local677, super.aClass90_Sub2_15.anInt8499);
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
	@Override
	public void method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class38_Sub1 local9 = (Class38_Sub1) super.aClass90_Sub2_15.method6761(Thread.currentThread());
		local9.aClass153_1.anInt4478 = 0;
		if (super.aClass308ArrayArray3 != null) {
			this.method885(local9.anIntArray523, arg1, super.aClass90_Sub2_15.aBoolean551, local9.aClass153_1, local9.anIntArray526, arg0, local9.anIntArray534);
		} else if (super.aClass105ArrayArray3 != null) {
			this.method884(arg0, arg1, local9.aClass153_1, local9.anIntArray523, local9.anIntArray526, local9.anIntArray534);
			return;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7964(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class38_Sub1 local9 = (Class38_Sub1) super.aClass90_Sub2_15.method6761(Thread.currentThread());
		@Pc(12) Class153 local12 = local9.aClass153_1;
		local12.anInt4478 = 0;
		local12.aBoolean328 = false;
		if (super.aClass308ArrayArray3 != null) {
			this.method882(local9.anIntArray523, arg3, arg0, arg4, local12, arg1, local9.anIntArray534, arg2);
		} else if (super.aClass105ArrayArray3 != null) {
			this.method888(arg3, arg1, local12, local9.anIntArray534, arg4, local9.anIntArray523, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIILclient!jf;I[II[[ZI[III)V")
	private void method888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class153 arg2, @OriginalArg(5) int[] arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(9) int[] arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg0 - arg1) * 1024 / 256;
		arg2.aBoolean332 = false;
		arg2.aBoolean329 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg6; local32 < arg7; local32++) {
			for (@Pc(36) int local36 = arg1; local36 < arg0; local36++) {
				if (arg4[local32 - arg6][local36 - arg1]) {
					@Pc(72) int local72;
					if (super.aClass105ArrayArray3[local32][local36] != null) {
						@Pc(302) Class105 local302 = super.aClass105ArrayArray3[local32][local36];
						if (local302.aShort53 != -1 && (local302.aByte33 & 0x2) == 0 && local302.anInt2791 == -1) {
							local72 = super.aClass90_Sub2_15.method6763(local302.aShort53);
							arg2.method3802(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static222.method3512(local302.aShort51 & 0xFFFF, local72), Static222.method3512(local302.aShort52 & 0xFFFF, local72), Static222.method3512(local302.aShort50 & 0xFFFF, local72));
							arg2.method3802(local30, local30, local30 - 4, local26, local26 + 4, local26, Static222.method3512(local302.aShort54 & 0xFFFF, local72), Static222.method3512(local302.aShort50 & 0xFFFF, local72), Static222.method3512(local302.aShort52 & 0xFFFF, local72));
						} else if (local302.anInt2791 == -1) {
							arg2.method3802(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local302.aShort51 & 0xFFFF, local302.aShort52 & 0xFFFF, local302.aShort50 & 0xFFFF);
							arg2.method3802(local30, local30, local30 - 4, local26, local26 + 4, local26, local302.aShort54 & 0xFFFF, local302.aShort50 & 0xFFFF, local302.aShort52 & 0xFFFF);
						} else {
							local72 = local302.anInt2791;
							arg2.method3802(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local72, local72, local72);
							arg2.method3802(local30, local30, local30 - 4, local26, local26 + 4, local26, local72, local72, local72);
						}
					} else if (super.aClass326ArrayArray3[local32][local36] != null) {
						@Pc(70) Class326 local70 = super.aClass326ArrayArray3[local32][local36];
						for (local72 = 0; local72 < local70.aShort118; local72++) {
							arg5[local72] = local26 + local70.aShortArray147[local72] * 4 / super.anInt9998;
							arg3[local72] = local30 - local70.aShortArray153[local72] * 4 / super.anInt9998;
						}
						for (@Pc(114) int local114 = 0; local114 < local70.aShort119; local114++) {
							@Pc(121) short local121 = local70.aShortArray151[local114];
							@Pc(126) short local126 = local70.aShortArray152[local114];
							@Pc(131) short local131 = local70.aShortArray148[local114];
							@Pc(135) int local135 = arg5[local121];
							@Pc(139) int local139 = arg5[local126];
							@Pc(143) int local143 = arg5[local131];
							@Pc(147) int local147 = arg3[local121];
							@Pc(151) int local151 = arg3[local126];
							@Pc(155) int local155 = arg3[local131];
							@Pc(181) int local181;
							if (local70.anIntArray655 != null && local70.anIntArray655[local114] != -1) {
								local181 = local70.anIntArray655[local114];
								arg2.method3802(local147, local151, local155, local135, local139, local143, Static222.method3512(local70.aShortArray149[local121], local181), Static222.method3512(local70.aShortArray149[local126], local181), Static222.method3512(local70.aShortArray149[local131], local181));
							} else if (local70.aShortArray150 == null || local70.aShortArray150[local114] == -1) {
								local181 = local70.anIntArray654[local114];
								arg2.method3802(local147, local151, local155, local135, local139, local143, Static222.method3512(local70.aShortArray149[local121], local181), Static222.method3512(local70.aShortArray149[local126], local181), Static222.method3512(local70.aShortArray149[local131], local181));
							} else {
								local181 = super.aClass90_Sub2_15.method6763(local70.aShortArray150[local114]);
								arg2.method3802(local147, local151, local155, local135, local139, local143, Static222.method3512(local70.aShortArray149[local121], local181), Static222.method3512(local70.aShortArray149[local126], local181), Static222.method3512(local70.aShortArray149[local131], local181));
							}
						}
					}
				}
				local30 -= 4;
			}
			local26 += 4;
			local30 = local14;
		}
		arg2.aBoolean329 = true;
	}
}
