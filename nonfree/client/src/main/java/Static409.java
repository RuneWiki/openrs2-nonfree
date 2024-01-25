import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "[Lclient!is;")
	public static final Class128[] aClass128Array1 = new Class128[4];

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Lclient!nh;")
	public static final Class4_Sub27 aClass4_Sub27_1 = new Class4_Sub27(0, 0);

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_97 = new Class146(41, 4);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
	public static void method5555() {
		Static264.anInt4365 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static349.anInt5769; local3++) {
			@Pc(8) Class145 local8 = Static190.aClass145Array1[local3];
			@Pc(12) int local12;
			if (Static386.anIntArray501 != null) {
				for (local12 = 0; local12 < Static386.anIntArray501.length; local12++) {
					if (Static386.anIntArray501[local12] != -1000000 && (local8.anInt3588 <= Static386.anIntArray501[local12] || local8.anInt3584 <= Static386.anIntArray501[local12]) && (local8.anInt3587 <= Static140.anIntArray210[local12] || local8.anInt3598 <= Static140.anIntArray210[local12]) && (local8.anInt3587 >= Static284.anIntArray378[local12] || local8.anInt3598 >= Static284.anIntArray378[local12]) && (local8.anInt3593 <= Static209.anIntArray272[local12] || local8.anInt3590 <= Static209.anIntArray272[local12]) && (local8.anInt3593 >= Static86.anIntArray126[local12] || local8.anInt3590 >= Static86.anIntArray126[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3585 == 1) {
				local12 = local8.anInt3591 + Static387.anInt6326 - Static32.anInt531;
				if (local12 >= 0 && local12 <= Static387.anInt6326 + Static387.anInt6326) {
					local110 = local8.anInt3595 + Static387.anInt6326 - Static150.anInt2733;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static387.anInt6326 + Static387.anInt6326) {
						continue;
					}
					local128 = local8.anInt3597 + Static387.anInt6326 - Static150.anInt2733;
					if (local128 > Static387.anInt6326 + Static387.anInt6326) {
						local128 = Static387.anInt6326 + Static387.anInt6326;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static458.aBooleanArrayArray8[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static35.anInt570 - local8.anInt3587;
						if (local164 > Static36.anInt599) {
							local8.anInt3599 = 1;
						} else {
							if (local164 >= -Static36.anInt599) {
								continue;
							}
							local8.anInt3599 = 2;
							local164 = -local164;
						}
						local8.anInt3583 = (local8.anInt3593 - Static70.anInt1418 << 8) / local164;
						local8.anInt3589 = (local8.anInt3590 - Static70.anInt1418 << 8) / local164;
						local8.anInt3594 = (local8.anInt3588 - Static315.anInt5094 << 8) / local164;
						local8.anInt3592 = (local8.anInt3584 - Static315.anInt5094 << 8) / local164;
						Static399.aClass145Array2[Static264.anInt4365++] = local8;
					}
				}
			} else if (local8.anInt3585 == 2) {
				local12 = local8.anInt3595 + Static387.anInt6326 - Static150.anInt2733;
				if (local12 >= 0 && local12 <= Static387.anInt6326 + Static387.anInt6326) {
					local110 = local8.anInt3591 + Static387.anInt6326 - Static32.anInt531;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static387.anInt6326 + Static387.anInt6326) {
						continue;
					}
					local128 = local8.anInt3596 + Static387.anInt6326 - Static32.anInt531;
					if (local128 > Static387.anInt6326 + Static387.anInt6326) {
						local128 = Static387.anInt6326 + Static387.anInt6326;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static458.aBooleanArrayArray8[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static70.anInt1418 - local8.anInt3593;
						if (local164 > Static36.anInt599) {
							local8.anInt3599 = 3;
						} else {
							if (local164 >= -Static36.anInt599) {
								continue;
							}
							local8.anInt3599 = 4;
							local164 = -local164;
						}
						local8.anInt3582 = (local8.anInt3587 - Static35.anInt570 << 8) / local164;
						local8.anInt3586 = (local8.anInt3598 - Static35.anInt570 << 8) / local164;
						local8.anInt3594 = (local8.anInt3588 - Static315.anInt5094 << 8) / local164;
						local8.anInt3592 = (local8.anInt3584 - Static315.anInt5094 << 8) / local164;
						Static399.aClass145Array2[Static264.anInt4365++] = local8;
					}
				}
			} else if (local8.anInt3585 == 4) {
				local12 = local8.anInt3588 - Static315.anInt5094;
				if (local12 > Static406.anInt6850) {
					local110 = local8.anInt3595 + Static387.anInt6326 - Static150.anInt2733;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static387.anInt6326 + Static387.anInt6326) {
						continue;
					}
					local128 = local8.anInt3597 + Static387.anInt6326 - Static150.anInt2733;
					if (local128 > Static387.anInt6326 + Static387.anInt6326) {
						local128 = Static387.anInt6326 + Static387.anInt6326;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3591 + Static387.anInt6326 - Static32.anInt531;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static387.anInt6326 + Static387.anInt6326) {
						continue;
					}
					local164 = local8.anInt3596 + Static387.anInt6326 - Static32.anInt531;
					if (local164 > Static387.anInt6326 + Static387.anInt6326) {
						local164 = Static387.anInt6326 + Static387.anInt6326;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static458.aBooleanArrayArray8[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3599 = 5;
						local8.anInt3582 = (local8.anInt3587 - Static35.anInt570 << 8) / local12;
						local8.anInt3586 = (local8.anInt3598 - Static35.anInt570 << 8) / local12;
						local8.anInt3583 = (local8.anInt3593 - Static70.anInt1418 << 8) / local12;
						local8.anInt3589 = (local8.anInt3590 - Static70.anInt1418 << 8) / local12;
						Static399.aClass145Array2[Static264.anInt4365++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
	public static void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg1 != Static419.anInt6404) {
			Static226.anIntArray284 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static226.anIntArray284[local9] = (local9 << 12) / arg1;
			}
			Static449.anInt7499 = arg1 * 32;
			Static419.anInt6404 = arg1;
			Static211.anInt3669 = arg1 - 1;
		}
		if (Static91.anInt1740 == arg0) {
			return;
		}
		if (Static419.anInt6404 == arg0) {
			Static334.anIntArray437 = Static226.anIntArray284;
		} else {
			Static334.anIntArray437 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static334.anIntArray437[local9] = (local9 << 12) / arg0;
			}
		}
		Static91.anInt1740 = arg0;
		Static204.anInt3610 = arg0 - 1;
	}
}
