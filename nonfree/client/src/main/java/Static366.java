import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
	public static int anInt5498 = -1;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)[B")
	public static byte[] method4836(@OriginalArg(1) int arg0) {
		@Pc(19) Class4_Sub5_Sub7 local19 = (Class4_Sub5_Sub7) Static587.aClass300_4.method6604((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static149.method2598(local30, local52);
				@Pc(61) byte local61 = local24[local57];
				local24[local57] = local24[local52];
				local24[local52] = local24[511 - local45] = local61;
			}
			local19 = new Class4_Sub5_Sub7(local24);
			Static587.aClass300_4.method6600((long) arg0, local19);
		}
		return local19.aByteArray39;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!es;)Lclient!vn;")
	public static Class256 method4838(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(14) int local14 = arg0.method8859();
		@Pc(21) Class291 local21 = Static305.method4279()[arg0.method8865()];
		@Pc(28) Class125 local28 = Static640.method8546()[arg0.method8865()];
		@Pc(32) int local32 = arg0.method8834();
		@Pc(36) int local36 = arg0.method8834();
		return new Class256(local14, local21, local28, local32, local36);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IJ)V")
	public static void method4840(@OriginalArg(1) long arg0) {
		if (Static267.aClass73ArrayArrayArray2 != null) {
			if (Static259.anInt4200 == 1 || Static259.anInt4200 == 5) {
				Static254.method3687(arg0);
			} else if (Static259.anInt4200 == 4) {
				Static585.method7691(arg0);
			}
		}
		Static669.method8921((long) Static177.anInt3088, Static582.aClass33_13);
		if (Static77.anInt1630 != -1) {
			Static245.method6855(Static77.anInt1630);
		}
		for (@Pc(50) int local50 = 0; local50 < Static463.anInt7418; local50++) {
			if (Static109.aBooleanArray4[local50]) {
				Static387.aBooleanArray12[local50] = true;
			}
			Static146.aBooleanArray6[local50] = Static109.aBooleanArray4[local50];
			Static109.aBooleanArray4[local50] = false;
		}
		Static308.anInt9999 = Static177.anInt3088;
		Static369.method4868(-1, -1, (Class199) null);
		Static492.method6685(-1, -1, (Class199) null);
		if (Static77.anInt1630 != -1) {
			Static463.anInt7418 = 0;
			Static559.method7423();
		}
		Static582.aClass33_13.la();
		Static585.method7690(Static582.aClass33_13);
		@Pc(107) int local107 = Static417.method5291();
		if (local107 == -1) {
			local107 = Static530.anInt8205;
		}
		if (local107 == -1) {
			local107 = Static203.anInt3317;
		}
		Static244.method3606(local107);
		@Pc(127) int local127 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() << 8;
		Static660.method8783(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 + local127, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141, Static88.anInt1794, local127 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917);
		Static88.anInt1794 = 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	public static void method4841() {
		if (Static75.anInt1621 == -1 || Static558.anInt8603 == -1) {
			return;
		}
		@Pc(25) int local25 = Static219.anInt3532 + (Static657.anInt10372 * (Static606.anInt9316 - Static219.anInt3532) >> 16);
		Static657.anInt10372 += local25;
		if (Static657.anInt10372 >= 65535) {
			if (Static234.aBoolean163) {
				Static379.aBoolean423 = false;
			} else {
				Static379.aBoolean423 = true;
			}
			Static657.anInt10372 = 65535;
			Static234.aBoolean163 = true;
		} else {
			Static379.aBoolean423 = false;
			Static234.aBoolean163 = false;
		}
		@Pc(57) float local57 = (float) Static657.anInt10372 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static143.anInt2612 * 2;
		@Pc(90) int local90;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(145) int local145;
		@Pc(164) int local164;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static107.anIntArrayArrayArray7[Static75.anInt1621][local64][local66] * 3;
			local90 = Static107.anIntArrayArrayArray7[Static75.anInt1621][local64 + 1][local66] * 3;
			local123 = (Static107.anIntArrayArrayArray7[Static75.anInt1621][local64 + 2][local66] + Static107.anIntArrayArrayArray7[Static75.anInt1621][local64 + 2][local66] - Static107.anIntArrayArrayArray7[Static75.anInt1621][local64 + 3][local66]) * 3;
			local131 = Static107.anIntArrayArrayArray7[Static75.anInt1621][local64][local66];
			local136 = local90 - local78;
			local145 = local78 + local123 - local90 * 2;
			local164 = Static107.anIntArrayArrayArray7[Static75.anInt1621][local64 + 2][local66] + local90 - local131 - local123;
			local60[local66] = (float) local131 + (((float) local164 * local57 + (float) local145) * local57 + (float) local136) * local57;
		}
		Static652.anInt10283 = (int) local60[2] - Static321.anInt5000 * 512;
		Static618.anInt9710 = (int) local60[1] * -1;
		Static611.anInt9382 = (int) local60[0] - Static445.anInt6949 * 512;
		@Pc(217) float[] local217 = new float[3];
		local90 = Static263.anInt4258 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static107.anIntArrayArrayArray7[Static558.anInt8603][local90][local123] * 3;
			local136 = Static107.anIntArrayArrayArray7[Static558.anInt8603][local90 + 1][local123] * 3;
			local145 = (Static107.anIntArrayArrayArray7[Static558.anInt8603][local90 + 2][local123] + Static107.anIntArrayArrayArray7[Static558.anInt8603][local90 + 2][local123] - Static107.anIntArrayArrayArray7[Static558.anInt8603][local90 + 3][local123]) * 3;
			local164 = Static107.anIntArrayArrayArray7[Static558.anInt8603][local90][local123];
			@Pc(299) int local299 = local136 - local131;
			@Pc(308) int local308 = local145 + local131 - local136 * 2;
			@Pc(326) int local326 = Static107.anIntArrayArrayArray7[Static558.anInt8603][local90 + 2][local123] + local136 - local164 - local145;
			local217[local123] = local57 * (((float) local308 + (float) local326 * local57) * local57 + (float) local299) + (float) local164;
		}
		@Pc(361) float local361 = local217[0] - local60[0];
		@Pc(371) float local371 = -1.0F * (local217[1] - local60[1]);
		@Pc(380) float local380 = local217[2] - local60[2];
		@Pc(390) double local390 = Math.sqrt((double) (local380 * local380 + local361 * local361));
		Static383.anInt9871 = (int) (Math.atan2((double) local371, local390) * 2607.5945876176133D) & 0x3FFF;
		Static226.anInt3586 = (int) (-Math.atan2((double) local361, (double) local380) * 2607.5945876176133D) & 0x3FFF;
		Static571.anInt8879 = ((Static107.anIntArrayArrayArray7[Static75.anInt1621][local64 + 2][3] - Static107.anIntArrayArrayArray7[Static75.anInt1621][local64][3]) * Static657.anInt10372 >> 16) + Static107.anIntArrayArrayArray7[Static75.anInt1621][local64][3];
	}
}
