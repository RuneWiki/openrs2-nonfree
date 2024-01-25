import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	public static int anInt4224;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!gs;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
	public static void method3575() {
		Static127.anInt2702 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static386.anInt6859; local3++) {
			@Pc(8) Class16 local8 = Static300.aClass16Array4[local3];
			@Pc(12) int local12;
			if (Static404.anIntArray497 != null) {
				for (local12 = 0; local12 < Static404.anIntArray497.length; local12++) {
					if (Static404.anIntArray497[local12] != -1000000 && (local8.anInt510 <= Static404.anIntArray497[local12] || local8.anInt517 <= Static404.anIntArray497[local12]) && (local8.anInt512 <= Static172.anIntArray217[local12] || local8.anInt526 <= Static172.anIntArray217[local12]) && (local8.anInt512 >= Static244.anIntArray543[local12] || local8.anInt526 >= Static244.anIntArray543[local12]) && (local8.anInt511 <= Static411.anIntArray506[local12] || local8.anInt528 <= Static411.anIntArray506[local12]) && (local8.anInt511 >= Static189.anIntArray231[local12] || local8.anInt528 >= Static189.anIntArray231[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt519 == 1) {
				local12 = local8.anInt514 + Static195.anInt7212 - Static6.anInt253;
				if (local12 >= 0 && local12 <= Static195.anInt7212 + Static195.anInt7212) {
					local110 = local8.anInt509 + Static195.anInt7212 - Static370.anInt6673;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static195.anInt7212 + Static195.anInt7212) {
						continue;
					}
					local128 = local8.anInt521 + Static195.anInt7212 - Static370.anInt6673;
					if (local128 > Static195.anInt7212 + Static195.anInt7212) {
						local128 = Static195.anInt7212 + Static195.anInt7212;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static202.aBooleanArrayArray7[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static332.anInt5784 - local8.anInt512;
						if (local164 > Static4.anInt7919) {
							local8.anInt522 = 1;
						} else {
							if (local164 >= -Static4.anInt7919) {
								continue;
							}
							local8.anInt522 = 2;
							local164 = -local164;
						}
						local8.anInt516 = (local8.anInt511 - Static440.anInt7781 << 8) / local164;
						local8.anInt527 = (local8.anInt528 - Static440.anInt7781 << 8) / local164;
						local8.anInt525 = (local8.anInt510 - Static32.anInt6598 << 8) / local164;
						local8.anInt515 = (local8.anInt517 - Static32.anInt6598 << 8) / local164;
						Static183.aClass16Array3[Static127.anInt2702++] = local8;
					}
				}
			} else if (local8.anInt519 == 2) {
				local12 = local8.anInt509 + Static195.anInt7212 - Static370.anInt6673;
				if (local12 >= 0 && local12 <= Static195.anInt7212 + Static195.anInt7212) {
					local110 = local8.anInt514 + Static195.anInt7212 - Static6.anInt253;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static195.anInt7212 + Static195.anInt7212) {
						continue;
					}
					local128 = local8.anInt530 + Static195.anInt7212 - Static6.anInt253;
					if (local128 > Static195.anInt7212 + Static195.anInt7212) {
						local128 = Static195.anInt7212 + Static195.anInt7212;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static202.aBooleanArrayArray7[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static440.anInt7781 - local8.anInt511;
						if (local164 > Static4.anInt7919) {
							local8.anInt522 = 3;
						} else {
							if (local164 >= -Static4.anInt7919) {
								continue;
							}
							local8.anInt522 = 4;
							local164 = -local164;
						}
						local8.anInt523 = (local8.anInt512 - Static332.anInt5784 << 8) / local164;
						local8.anInt518 = (local8.anInt526 - Static332.anInt5784 << 8) / local164;
						local8.anInt525 = (local8.anInt510 - Static32.anInt6598 << 8) / local164;
						local8.anInt515 = (local8.anInt517 - Static32.anInt6598 << 8) / local164;
						Static183.aClass16Array3[Static127.anInt2702++] = local8;
					}
				}
			} else if (local8.anInt519 == 4) {
				local12 = local8.anInt510 - Static32.anInt6598;
				if (local12 > Static8.anInt325) {
					local110 = local8.anInt509 + Static195.anInt7212 - Static370.anInt6673;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static195.anInt7212 + Static195.anInt7212) {
						continue;
					}
					local128 = local8.anInt521 + Static195.anInt7212 - Static370.anInt6673;
					if (local128 > Static195.anInt7212 + Static195.anInt7212) {
						local128 = Static195.anInt7212 + Static195.anInt7212;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt514 + Static195.anInt7212 - Static6.anInt253;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static195.anInt7212 + Static195.anInt7212) {
						continue;
					}
					local164 = local8.anInt530 + Static195.anInt7212 - Static6.anInt253;
					if (local164 > Static195.anInt7212 + Static195.anInt7212) {
						local164 = Static195.anInt7212 + Static195.anInt7212;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static202.aBooleanArrayArray7[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt522 = 5;
						local8.anInt523 = (local8.anInt512 - Static332.anInt5784 << 8) / local12;
						local8.anInt518 = (local8.anInt526 - Static332.anInt5784 << 8) / local12;
						local8.anInt516 = (local8.anInt511 - Static440.anInt7781 << 8) / local12;
						local8.anInt527 = (local8.anInt528 - Static440.anInt7781 << 8) / local12;
						Static183.aClass16Array3[Static127.anInt2702++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!ps;Lclient!qn;Ljava/awt/Canvas;III)Lclient!eq;")
	public static Class66 method3576(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return new Class66_Sub2(arg4, arg2, arg0, arg3, arg1);
	}
}
