import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Lclient!f;")
	public static Class8 aClass8_14;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public static int anInt3946 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public static void method3165() {
		Static169.anInt5820 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static135.anInt2831; local3++) {
			@Pc(8) Class155 local8 = Static161.aClass155Array1[local3];
			@Pc(12) int local12;
			if (Static39.anIntArray77 != null) {
				for (local12 = 0; local12 < Static39.anIntArray77.length; local12++) {
					if (Static39.anIntArray77[local12] != -1000000 && (local8.anInt4781 <= Static39.anIntArray77[local12] || local8.anInt4786 <= Static39.anIntArray77[local12]) && (local8.anInt4776 <= Static320.anIntArray371[local12] || local8.anInt4788 <= Static320.anIntArray371[local12]) && (local8.anInt4776 >= Static79.anIntArray382[local12] || local8.anInt4788 >= Static79.anIntArray382[local12]) && (local8.anInt4773 <= Static239.anIntArray106[local12] || local8.anInt4784 <= Static239.anIntArray106[local12]) && (local8.anInt4773 >= Static245.anIntArray303[local12] || local8.anInt4784 >= Static245.anIntArray303[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt4783 == 1) {
				local12 = local8.anInt4780 + Static80.anInt2001 - Static310.anInt5498;
				if (local12 >= 0 && local12 <= Static80.anInt2001 + Static80.anInt2001) {
					local110 = local8.anInt4779 + Static80.anInt2001 - Static111.anInt2450;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static80.anInt2001 + Static80.anInt2001) {
						continue;
					}
					local128 = local8.anInt4778 + Static80.anInt2001 - Static111.anInt2450;
					if (local128 > Static80.anInt2001 + Static80.anInt2001) {
						local128 = Static80.anInt2001 + Static80.anInt2001;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static313.aBooleanArrayArray6[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static3.anInt65 - local8.anInt4776;
						if (local164 > Static254.anInt4882) {
							local8.anInt4772 = 1;
						} else {
							if (local164 >= -Static254.anInt4882) {
								continue;
							}
							local8.anInt4772 = 2;
							local164 = -local164;
						}
						local8.anInt4774 = (local8.anInt4773 - Static254.anInt4875 << 8) / local164;
						local8.anInt4775 = (local8.anInt4784 - Static254.anInt4875 << 8) / local164;
						local8.anInt4789 = (local8.anInt4781 - Static180.anInt3574 << 8) / local164;
						local8.anInt4777 = (local8.anInt4786 - Static180.anInt3574 << 8) / local164;
						Static269.aClass155Array2[Static169.anInt5820++] = local8;
					}
				}
			} else if (local8.anInt4783 == 2) {
				local12 = local8.anInt4779 + Static80.anInt2001 - Static111.anInt2450;
				if (local12 >= 0 && local12 <= Static80.anInt2001 + Static80.anInt2001) {
					local110 = local8.anInt4780 + Static80.anInt2001 - Static310.anInt5498;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static80.anInt2001 + Static80.anInt2001) {
						continue;
					}
					local128 = local8.anInt4785 + Static80.anInt2001 - Static310.anInt5498;
					if (local128 > Static80.anInt2001 + Static80.anInt2001) {
						local128 = Static80.anInt2001 + Static80.anInt2001;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static313.aBooleanArrayArray6[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static254.anInt4875 - local8.anInt4773;
						if (local164 > Static254.anInt4882) {
							local8.anInt4772 = 3;
						} else {
							if (local164 >= -Static254.anInt4882) {
								continue;
							}
							local8.anInt4772 = 4;
							local164 = -local164;
						}
						local8.anInt4771 = (local8.anInt4776 - Static3.anInt65 << 8) / local164;
						local8.anInt4782 = (local8.anInt4788 - Static3.anInt65 << 8) / local164;
						local8.anInt4789 = (local8.anInt4781 - Static180.anInt3574 << 8) / local164;
						local8.anInt4777 = (local8.anInt4786 - Static180.anInt3574 << 8) / local164;
						Static269.aClass155Array2[Static169.anInt5820++] = local8;
					}
				}
			} else if (local8.anInt4783 == 4) {
				local12 = local8.anInt4781 - Static180.anInt3574;
				if (local12 > Static73.anInt1832) {
					local110 = local8.anInt4779 + Static80.anInt2001 - Static111.anInt2450;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static80.anInt2001 + Static80.anInt2001) {
						continue;
					}
					local128 = local8.anInt4778 + Static80.anInt2001 - Static111.anInt2450;
					if (local128 > Static80.anInt2001 + Static80.anInt2001) {
						local128 = Static80.anInt2001 + Static80.anInt2001;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt4780 + Static80.anInt2001 - Static310.anInt5498;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static80.anInt2001 + Static80.anInt2001) {
						continue;
					}
					local164 = local8.anInt4785 + Static80.anInt2001 - Static310.anInt5498;
					if (local164 > Static80.anInt2001 + Static80.anInt2001) {
						local164 = Static80.anInt2001 + Static80.anInt2001;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static313.aBooleanArrayArray6[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt4772 = 5;
						local8.anInt4771 = (local8.anInt4776 - Static3.anInt65 << 8) / local12;
						local8.anInt4782 = (local8.anInt4788 - Static3.anInt65 << 8) / local12;
						local8.anInt4774 = (local8.anInt4773 - Static254.anInt4875 << 8) / local12;
						local8.anInt4775 = (local8.anInt4784 - Static254.anInt4875 << 8) / local12;
						Static269.aClass155Array2[Static169.anInt5820++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!le;Lclient!le;I)V")
	public static void method3166(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg1.aClass3_Sub4_57 != null) {
			arg1.method5949();
		}
		arg1.aClass3_Sub4_57 = arg0;
		arg1.aClass3_Sub4_58 = arg0.aClass3_Sub4_58;
		arg1.aClass3_Sub4_57.aClass3_Sub4_58 = arg1;
		arg1.aClass3_Sub4_58.aClass3_Sub4_57 = arg1;
	}
}
