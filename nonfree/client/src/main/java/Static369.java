import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!og", name = "T", descriptor = "[Lclient!d;")
	public static Class62[] aClass62Array3;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	public static int anInt6984 = -1;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_51 = new Class245(4);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	public static void method5893(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub4_Sub6 local12 = Static68.method1408(11, arg0);
		local12.method3828();
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	public static void method5895() {
		if (Static454.anInt8403 == -1 || Static35.anInt1112 == -1) {
			return;
		}
		@Pc(23) int local23 = Static343.anInt6636 + (Static319.anInt6039 * (Static566.anInt9591 - Static343.anInt6636) >> 16);
		Static319.anInt6039 += local23;
		if (Static319.anInt6039 < 65535) {
			Static137.aBoolean241 = false;
			Static197.aBoolean342 = false;
		} else {
			if (Static137.aBoolean241) {
				Static197.aBoolean342 = false;
			} else {
				Static197.aBoolean342 = true;
			}
			Static319.anInt6039 = 65535;
			Static137.aBoolean241 = true;
		}
		@Pc(55) float local55 = (float) Static319.anInt6039 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static154.anInt3344 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(161) int local161;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static132.anIntArrayArrayArray22[Static454.anInt8403][local62][local64] * 3;
			local88 = Static132.anIntArrayArrayArray22[Static454.anInt8403][local62 + 1][local64] * 3;
			local121 = (Static132.anIntArrayArrayArray22[Static454.anInt8403][local62 + 2][local64] + Static132.anIntArrayArrayArray22[Static454.anInt8403][local62 + 2][local64] - Static132.anIntArrayArrayArray22[Static454.anInt8403][local62 + 3][local64]) * 3;
			local129 = Static132.anIntArrayArrayArray22[Static454.anInt8403][local62][local64];
			local134 = local88 - local76;
			local143 = local121 + local76 - local88 * 2;
			local161 = local88 + Static132.anIntArrayArrayArray22[Static454.anInt8403][local62 + 2][local64] - local121 - local129;
			local58[local64] = (float) local129 + (local55 * ((float) local143 + local55 * (float) local161) + (float) local134) * local55;
		}
		Static5.anInt142 = (int) local58[1] * -1;
		Static86.anInt2132 = (int) local58[0] - Static191.anInt4147 * 512;
		Static390.anInt7318 = (int) local58[2] - Static247.anInt5049 * 512;
		@Pc(215) float[] local215 = new float[3];
		local88 = Static402.anInt9648 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static132.anIntArrayArrayArray22[Static35.anInt1112][local88][local121] * 3;
			local134 = Static132.anIntArrayArrayArray22[Static35.anInt1112][local88 + 1][local121] * 3;
			local143 = (Static132.anIntArrayArrayArray22[Static35.anInt1112][local88 + 2][local121] + Static132.anIntArrayArrayArray22[Static35.anInt1112][local88 + 2][local121] - Static132.anIntArrayArrayArray22[Static35.anInt1112][local88 + 3][local121]) * 3;
			local161 = Static132.anIntArrayArrayArray22[Static35.anInt1112][local88][local121];
			@Pc(292) int local292 = local134 - local129;
			@Pc(301) int local301 = local143 + local129 - local134 * 2;
			@Pc(318) int local318 = Static132.anIntArrayArrayArray22[Static35.anInt1112][local88 + 2][local121] + local134 - local161 - local143;
			local215[local121] = (local55 * ((float) local318 * local55 + (float) local301) + (float) local292) * local55 + (float) local161;
		}
		@Pc(351) float local351 = local215[0] - local58[0];
		@Pc(361) float local361 = -1.0F * (local215[1] - local58[1]);
		@Pc(378) float local378 = local215[2] - local58[2];
		@Pc(388) double local388 = Math.sqrt((double) (local351 * local351 + local378 * local378));
		Static348.anInt6726 = (int) (Math.atan2((double) local361, local388) * 2607.5945876176133D) & 0x3FFF;
		Static393.anInt7341 = (int) (-Math.atan2((double) local351, (double) local378) * 2607.5945876176133D) & 0x3FFF;
		Static268.anInt9015 = ((Static132.anIntArrayArrayArray22[Static454.anInt8403][local62 + 2][3] - Static132.anIntArrayArrayArray22[Static454.anInt8403][local62][3]) * Static319.anInt6039 >> 16) + Static132.anIntArrayArrayArray22[Static454.anInt8403][local62][3];
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(B)Z")
	public static boolean method5896() {
		if (Static214.aBoolean361) {
			try {
				if ((Boolean) Static590.method5698("showingVideoAd", Static87.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}
}
