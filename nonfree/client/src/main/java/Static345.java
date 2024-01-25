import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Lclient!vba;")
	public static final Class366 aClass366_6 = new Class366();

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public static int anInt5912 = 0;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
	public static void method5019() {
		if (Static321.anIntArray550 != null) {
			return;
		}
		Static321.anIntArray550 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(83) float local83 = (1.0F - local45) * local54;
				@Pc(91) float local91 = (1.0F - local77 * local45) * local54;
				@Pc(101) float local101 = (1.0F - local45 * (1.0F - local77)) * local54;
				if (local71 == 0) {
					local58 = local101;
					local60 = local83;
					local56 = local54;
				} else if (local71 == 1) {
					local60 = local83;
					local58 = local54;
					local56 = local91;
				} else if (local71 == 2) {
					local58 = local54;
					local56 = local83;
					local60 = local101;
				} else if (local71 == 3) {
					local56 = local83;
					local60 = local54;
					local58 = local91;
				} else if (local71 == 4) {
					local58 = local83;
					local56 = local101;
					local60 = local54;
				} else if (local71 == 5) {
					local60 = local91;
					local56 = local54;
					local58 = local83;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(189) int local189 = (int) (local56 * 256.0F);
				@Pc(194) int local194 = (int) (local58 * 256.0F);
				@Pc(199) int local199 = (int) (local60 * 256.0F);
				@Pc(212) int local212 = (local194 << 8) + (local189 << 16) + local199 - 16777216;
				Static321.anIntArray550[local21++] = local212;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5022(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	public static void method5023(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static270.anInt4661 == 2) {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[0]);
				Static433.aClass298Array6[1].method6530(Static304.aClass283Array1[1]);
			} else if (Static270.anInt4661 == 3) {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[0]);
				Static433.aClass298Array6[1].method6530(Static304.aClass283Array1[1]);
				Static433.aClass298Array6[2].method6530(Static304.aClass283Array1[2]);
			} else {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[0]);
				Static433.aClass298Array6[1].method6530(Static304.aClass283Array1[1]);
				Static433.aClass298Array6[2].method6530(Static304.aClass283Array1[2]);
				Static433.aClass298Array6[3].method6530(Static304.aClass283Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static270.anInt4661 == 2) {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[2]);
			} else if (Static270.anInt4661 == 3) {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[3]);
				Static433.aClass298Array6[1].method6530(Static304.aClass283Array1[4]);
			} else {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[4]);
				Static433.aClass298Array6[1].method6530(Static304.aClass283Array1[5]);
				Static433.aClass298Array6[2].method6530(Static304.aClass283Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static270.anInt4661 == 2) {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[3]);
				return;
			}
			if (Static270.anInt4661 == 3) {
				Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[5]);
				return;
			}
			Static433.aClass298Array6[0].method6530(Static304.aClass283Array1[7]);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BZ)V")
	public static void method5025(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static671.aClass3_Sub5_Sub4_3 != null) {
			Static173.anInt3182 = Static671.aClass3_Sub5_Sub4_3.anInt1308;
		} else {
			Static173.anInt3182 = -1;
		}
		Static118.aClass265_13 = null;
		Static310.aClass302_27 = null;
		Static306.anInt5140 = 0;
		Static671.aClass3_Sub5_Sub4_3 = null;
		Static671.method7629();
		Static671.aClass302_68.method6614();
		Static426.anInt6954 = -1;
		Static146.anInt2698 = -1;
		Static290.aClass97_3 = null;
		Static405.aClass97_4 = null;
		Static654.aClass97_8 = null;
		Static515.aClass97_6 = null;
		Static465.aClass97_5 = null;
		Static671.aClass392_3 = null;
		Static30.aClass6_7 = null;
		Static635.aClass97_7 = null;
		Static26.aClass97_1 = null;
		Static142.aClass97_2 = null;
		if (Static671.aClass378_4 != null) {
			Static671.aClass378_4.method8706();
			Static671.aClass378_4.method8701(64, 128);
		}
		if (Static671.aClass208_13 != null) {
			Static671.aClass208_13.method4948(64, 64);
		}
		if (Static671.aClass340_5 != null) {
			Static671.aClass340_5.method7666(64);
		}
		Static400.aClass36_1.method1017(64);
	}
}
