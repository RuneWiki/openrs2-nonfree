import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt3318 = 0;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "[Lclient!jj;")
	public static final Class2_Sub7_Sub10[] aClass2_Sub7_Sub10Array2 = new Class2_Sub7_Sub10[14];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	public static void method2837() {
		Static165.anInt3409 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static174.anInt3565; local3++) {
			@Pc(8) Class153 local8 = Static326.aClass153Array2[local3];
			@Pc(12) int local12;
			if (Static354.anIntArray555 != null) {
				for (local12 = 0; local12 < Static354.anIntArray555.length; local12++) {
					if (Static354.anIntArray555[local12] != -1000000 && (local8.anInt4372 <= Static354.anIntArray555[local12] || local8.anInt4361 <= Static354.anIntArray555[local12]) && (local8.anInt4382 <= Static353.anIntArray552[local12] || local8.anInt4363 <= Static353.anIntArray552[local12]) && (local8.anInt4382 >= Static264.anIntArray288[local12] || local8.anInt4363 >= Static264.anIntArray288[local12]) && (local8.anInt4377 <= Static247.anIntArray395[local12] || local8.anInt4370 <= Static247.anIntArray395[local12]) && (local8.anInt4377 >= Static75.anIntArray124[local12] || local8.anInt4370 >= Static75.anIntArray124[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt4376 == 1) {
				local12 = local8.anInt4364 + Static113.anInt5764 - Static284.anInt5626;
				if (local12 >= 0 && local12 <= Static113.anInt5764 + Static113.anInt5764) {
					local110 = local8.anInt4373 + Static113.anInt5764 - Static373.anInt6861;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4378 + Static113.anInt5764 - Static373.anInt6861;
					if (local121 > Static113.anInt5764 + Static113.anInt5764) {
						local121 = Static113.anInt5764 + Static113.anInt5764;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static133.aBooleanArrayArray3[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static181.anInt3807 - local8.anInt4382;
						if (local153 > Static169.anInt5691) {
							local8.anInt4374 = 1;
						} else {
							if (local153 >= -Static169.anInt5691) {
								continue;
							}
							local8.anInt4374 = 2;
							local153 = -local153;
						}
						local8.anInt4379 = (local8.anInt4377 - Static200.anInt4146 << 8) / local153;
						local8.anInt4365 = (local8.anInt4370 - Static200.anInt4146 << 8) / local153;
						local8.anInt4368 = (local8.anInt4372 - Static246.anInt3031 << 8) / local153;
						local8.anInt4366 = (local8.anInt4361 - Static246.anInt3031 << 8) / local153;
						Static299.aClass153Array1[Static165.anInt3409++] = local8;
					}
				}
			} else if (local8.anInt4376 == 2) {
				local12 = local8.anInt4373 + Static113.anInt5764 - Static373.anInt6861;
				if (local12 >= 0 && local12 <= Static113.anInt5764 + Static113.anInt5764) {
					local110 = local8.anInt4364 + Static113.anInt5764 - Static284.anInt5626;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4384 + Static113.anInt5764 - Static284.anInt5626;
					if (local121 > Static113.anInt5764 + Static113.anInt5764) {
						local121 = Static113.anInt5764 + Static113.anInt5764;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static133.aBooleanArrayArray3[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static200.anInt4146 - local8.anInt4377;
						if (local153 > Static169.anInt5691) {
							local8.anInt4374 = 3;
						} else {
							if (local153 >= -Static169.anInt5691) {
								continue;
							}
							local8.anInt4374 = 4;
							local153 = -local153;
						}
						local8.anInt4371 = (local8.anInt4382 - Static181.anInt3807 << 8) / local153;
						local8.anInt4375 = (local8.anInt4363 - Static181.anInt3807 << 8) / local153;
						local8.anInt4368 = (local8.anInt4372 - Static246.anInt3031 << 8) / local153;
						local8.anInt4366 = (local8.anInt4361 - Static246.anInt3031 << 8) / local153;
						Static299.aClass153Array1[Static165.anInt3409++] = local8;
					}
				}
			} else if (local8.anInt4376 == 4) {
				local12 = local8.anInt4372 - Static246.anInt3031;
				if (local12 > Static169.anInt5689) {
					local110 = local8.anInt4373 + Static113.anInt5764 - Static373.anInt6861;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4378 + Static113.anInt5764 - Static373.anInt6861;
					if (local121 > Static113.anInt5764 + Static113.anInt5764) {
						local121 = Static113.anInt5764 + Static113.anInt5764;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt4364 + Static113.anInt5764 - Static284.anInt5626;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt4384 + Static113.anInt5764 - Static284.anInt5626;
						if (local153 > Static113.anInt5764 + Static113.anInt5764) {
							local153 = Static113.anInt5764 + Static113.anInt5764;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static133.aBooleanArrayArray3[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt4374 = 5;
							local8.anInt4371 = (local8.anInt4382 - Static181.anInt3807 << 8) / local12;
							local8.anInt4375 = (local8.anInt4363 - Static181.anInt3807 << 8) / local12;
							local8.anInt4379 = (local8.anInt4377 - Static200.anInt4146 << 8) / local12;
							local8.anInt4365 = (local8.anInt4370 - Static200.anInt4146 << 8) / local12;
							Static299.aClass153Array1[Static165.anInt3409++] = local8;
						}
					}
				}
			}
		}
	}
}
