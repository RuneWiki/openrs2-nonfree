import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	public static int anInt893;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_9 = new Class77(57, 11);

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
	public static void method891() {
		Static542.anInt9614 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static127.anInt2935; local3++) {
			@Pc(8) Class103 local8 = Static176.aClass103Array2[local3];
			@Pc(12) int local12;
			if (Static310.anIntArray660 != null) {
				for (local12 = 0; local12 < Static310.anIntArray660.length; local12++) {
					if (Static310.anIntArray660[local12] != -1000000 && (local8.anInt3141 <= Static310.anIntArray660[local12] || local8.anInt3132 <= Static310.anIntArray660[local12]) && (local8.anInt3135 <= Static88.anIntArray192[local12] || local8.anInt3124 <= Static88.anIntArray192[local12]) && (local8.anInt3135 >= Static518.anIntArray679[local12] || local8.anInt3124 >= Static518.anIntArray679[local12]) && (local8.anInt3120 <= Static400.anIntArray500[local12] || local8.anInt3136 <= Static400.anIntArray500[local12]) && (local8.anInt3120 >= Static363.anIntArray466[local12] || local8.anInt3136 >= Static363.anIntArray466[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3142 == 1) {
				local12 = local8.anInt3122 + Static307.anInt5970 - Static176.anInt3987;
				if (local12 >= 0 && local12 <= Static307.anInt5970 + Static307.anInt5970) {
					local110 = local8.anInt3131 + Static307.anInt5970 - Static412.anInt7717;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static307.anInt5970 + Static307.anInt5970) {
						continue;
					}
					local128 = local8.anInt3123 + Static307.anInt5970 - Static412.anInt7717;
					if (local128 > Static307.anInt5970 + Static307.anInt5970) {
						local128 = Static307.anInt5970 + Static307.anInt5970;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static243.aBooleanArrayArray6[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static432.anInt7994 - local8.anInt3135;
						if (local164 > Static14.anInt231) {
							local8.anInt3121 = 1;
						} else {
							if (local164 >= -Static14.anInt231) {
								continue;
							}
							local8.anInt3121 = 2;
							local164 = -local164;
						}
						local8.anInt3125 = (local8.anInt3120 - Static87.anInt2071 << 8) / local164;
						local8.anInt3130 = (local8.anInt3136 - Static87.anInt2071 << 8) / local164;
						local8.anInt3140 = (local8.anInt3141 - Static154.anInt3372 << 8) / local164;
						local8.anInt3134 = (local8.anInt3132 - Static154.anInt3372 << 8) / local164;
						Static79.aClass103Array1[Static542.anInt9614++] = local8;
					}
				}
			} else if (local8.anInt3142 == 2) {
				local12 = local8.anInt3131 + Static307.anInt5970 - Static412.anInt7717;
				if (local12 >= 0 && local12 <= Static307.anInt5970 + Static307.anInt5970) {
					local110 = local8.anInt3122 + Static307.anInt5970 - Static176.anInt3987;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static307.anInt5970 + Static307.anInt5970) {
						continue;
					}
					local128 = local8.anInt3129 + Static307.anInt5970 - Static176.anInt3987;
					if (local128 > Static307.anInt5970 + Static307.anInt5970) {
						local128 = Static307.anInt5970 + Static307.anInt5970;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static243.aBooleanArrayArray6[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static87.anInt2071 - local8.anInt3120;
						if (local164 > Static14.anInt231) {
							local8.anInt3121 = 3;
						} else {
							if (local164 >= -Static14.anInt231) {
								continue;
							}
							local8.anInt3121 = 4;
							local164 = -local164;
						}
						local8.anInt3128 = (local8.anInt3135 - Static432.anInt7994 << 8) / local164;
						local8.anInt3137 = (local8.anInt3124 - Static432.anInt7994 << 8) / local164;
						local8.anInt3140 = (local8.anInt3141 - Static154.anInt3372 << 8) / local164;
						local8.anInt3134 = (local8.anInt3132 - Static154.anInt3372 << 8) / local164;
						Static79.aClass103Array1[Static542.anInt9614++] = local8;
					}
				}
			} else if (local8.anInt3142 == 4) {
				local12 = local8.anInt3141 - Static154.anInt3372;
				if (local12 > anInt893) {
					local110 = local8.anInt3131 + Static307.anInt5970 - Static412.anInt7717;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static307.anInt5970 + Static307.anInt5970) {
						continue;
					}
					local128 = local8.anInt3123 + Static307.anInt5970 - Static412.anInt7717;
					if (local128 > Static307.anInt5970 + Static307.anInt5970) {
						local128 = Static307.anInt5970 + Static307.anInt5970;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3122 + Static307.anInt5970 - Static176.anInt3987;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static307.anInt5970 + Static307.anInt5970) {
						continue;
					}
					local164 = local8.anInt3129 + Static307.anInt5970 - Static176.anInt3987;
					if (local164 > Static307.anInt5970 + Static307.anInt5970) {
						local164 = Static307.anInt5970 + Static307.anInt5970;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static243.aBooleanArrayArray6[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3121 = 5;
						local8.anInt3128 = (local8.anInt3135 - Static432.anInt7994 << 8) / local12;
						local8.anInt3137 = (local8.anInt3124 - Static432.anInt7994 << 8) / local12;
						local8.anInt3125 = (local8.anInt3120 - Static87.anInt2071 << 8) / local12;
						local8.anInt3130 = (local8.anInt3136 - Static87.anInt2071 << 8) / local12;
						Static79.aClass103Array1[Static542.anInt9614++] = local8;
					}
				}
			}
		}
	}
}
