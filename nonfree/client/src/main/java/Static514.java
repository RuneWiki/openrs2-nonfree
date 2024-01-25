import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array41;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "Lclient!ud;")
	public static final Class281 aClass281_6 = new Class281();

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	public static int anInt8971 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	public static void method7502() {
		Static64.anInt1241 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static511.anInt8888; local3++) {
			@Pc(8) Class266 local8 = Static432.aClass266Array2[local3];
			@Pc(12) int local12;
			if (Static110.anIntArray229 != null) {
				for (local12 = 0; local12 < Static110.anIntArray229.length; local12++) {
					if (Static110.anIntArray229[local12] != -1000000 && (local8.anInt8149 <= Static110.anIntArray229[local12] || local8.anInt8159 <= Static110.anIntArray229[local12]) && (local8.anInt8151 <= Static217.anIntArray401[local12] || local8.anInt8154 <= Static217.anIntArray401[local12]) && (local8.anInt8151 >= Static519.anIntArray693[local12] || local8.anInt8154 >= Static519.anIntArray693[local12]) && (local8.anInt8162 <= Static361.anIntArray522[local12] || local8.anInt8163 <= Static361.anIntArray522[local12]) && (local8.anInt8162 >= Static538.anIntArray760[local12] || local8.anInt8163 >= Static538.anIntArray760[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt8156 == 1) {
				local12 = local8.anInt8150 + Static207.anInt3723 - Static364.anInt6864;
				if (local12 >= 0 && local12 <= Static207.anInt3723 + Static207.anInt3723) {
					local110 = local8.anInt8144 + Static207.anInt3723 - Static113.anInt2306;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static207.anInt3723 + Static207.anInt3723) {
						continue;
					}
					local128 = local8.anInt8143 + Static207.anInt3723 - Static113.anInt2306;
					if (local128 > Static207.anInt3723 + Static207.anInt3723) {
						local128 = Static207.anInt3723 + Static207.anInt3723;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static533.aBooleanArrayArray6[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static2.anInt66 - local8.anInt8151;
						if (local164 > Static74.anInt1556) {
							local8.anInt8157 = 1;
						} else {
							if (local164 >= -Static74.anInt1556) {
								continue;
							}
							local8.anInt8157 = 2;
							local164 = -local164;
						}
						local8.anInt8158 = (local8.anInt8162 - Static412.anInt7685 << 8) / local164;
						local8.anInt8153 = (local8.anInt8163 - Static412.anInt7685 << 8) / local164;
						local8.anInt8145 = (local8.anInt8149 - Static152.anInt8131 << 8) / local164;
						local8.anInt8160 = (local8.anInt8159 - Static152.anInt8131 << 8) / local164;
						Static250.aClass266Array1[Static64.anInt1241++] = local8;
					}
				}
			} else if (local8.anInt8156 == 2) {
				local12 = local8.anInt8144 + Static207.anInt3723 - Static113.anInt2306;
				if (local12 >= 0 && local12 <= Static207.anInt3723 + Static207.anInt3723) {
					local110 = local8.anInt8150 + Static207.anInt3723 - Static364.anInt6864;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static207.anInt3723 + Static207.anInt3723) {
						continue;
					}
					local128 = local8.anInt8152 + Static207.anInt3723 - Static364.anInt6864;
					if (local128 > Static207.anInt3723 + Static207.anInt3723) {
						local128 = Static207.anInt3723 + Static207.anInt3723;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static533.aBooleanArrayArray6[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static412.anInt7685 - local8.anInt8162;
						if (local164 > Static74.anInt1556) {
							local8.anInt8157 = 3;
						} else {
							if (local164 >= -Static74.anInt1556) {
								continue;
							}
							local8.anInt8157 = 4;
							local164 = -local164;
						}
						local8.anInt8147 = (local8.anInt8151 - Static2.anInt66 << 8) / local164;
						local8.anInt8148 = (local8.anInt8154 - Static2.anInt66 << 8) / local164;
						local8.anInt8145 = (local8.anInt8149 - Static152.anInt8131 << 8) / local164;
						local8.anInt8160 = (local8.anInt8159 - Static152.anInt8131 << 8) / local164;
						Static250.aClass266Array1[Static64.anInt1241++] = local8;
					}
				}
			} else if (local8.anInt8156 == 4) {
				local12 = local8.anInt8149 - Static152.anInt8131;
				if (local12 > Static136.anInt2575) {
					local110 = local8.anInt8144 + Static207.anInt3723 - Static113.anInt2306;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static207.anInt3723 + Static207.anInt3723) {
						continue;
					}
					local128 = local8.anInt8143 + Static207.anInt3723 - Static113.anInt2306;
					if (local128 > Static207.anInt3723 + Static207.anInt3723) {
						local128 = Static207.anInt3723 + Static207.anInt3723;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt8150 + Static207.anInt3723 - Static364.anInt6864;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static207.anInt3723 + Static207.anInt3723) {
						continue;
					}
					local164 = local8.anInt8152 + Static207.anInt3723 - Static364.anInt6864;
					if (local164 > Static207.anInt3723 + Static207.anInt3723) {
						local164 = Static207.anInt3723 + Static207.anInt3723;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static533.aBooleanArrayArray6[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt8157 = 5;
						local8.anInt8147 = (local8.anInt8151 - Static2.anInt66 << 8) / local12;
						local8.anInt8148 = (local8.anInt8154 - Static2.anInt66 << 8) / local12;
						local8.anInt8158 = (local8.anInt8162 - Static412.anInt7685 << 8) / local12;
						local8.anInt8153 = (local8.anInt8163 - Static412.anInt7685 << 8) / local12;
						Static250.aClass266Array1[Static64.anInt1241++] = local8;
					}
				}
			}
		}
	}
}
