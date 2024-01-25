import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bl", name = "Ic", descriptor = "I")
	public static int anInt891;

	@OriginalMember(owner = "client!bl", name = "Cc", descriptor = "[S")
	public static final short[] aShortArray34 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!bl", name = "Fc", descriptor = "I")
	public static int anInt888 = 0;

	@OriginalMember(owner = "client!bl", name = "Mc", descriptor = "I")
	public static int anInt894 = -1;

	@OriginalMember(owner = "client!bl", name = "Tc", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_13 = new Class177(27, -1);

	@OriginalMember(owner = "client!bl", name = "Xc", descriptor = "[I")
	public static final int[] anIntArray68 = new int[1];

	@OriginalMember(owner = "client!bl", name = "bd", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!bl", name = "cd", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLclient!bl;)V")
	public static void method668(@OriginalArg(1) Class30_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) Static262.aClass203_17.method4548(); local15 != null; local15 = (Class1_Sub22) Static262.aClass203_17.method4545()) {
			if (arg0 == local15.aClass30_Sub1_Sub1_Sub1_1) {
				if (local15.aClass1_Sub19_Sub4_3 != null) {
					Static12.aClass1_Sub19_Sub2_1.method3181(local15.aClass1_Sub19_Sub4_3);
					local15.aClass1_Sub19_Sub4_3 = null;
				}
				local15.method6178();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V")
	public static void method671() {
		if (Static238.anIntArray440 != null) {
			return;
		}
		Static238.anIntArray440 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
			@Pc(39) float local39 = ((float) (local26 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(48) float local48 = (float) (local26 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(50) int local50 = 0; local50 < 128; local50++) {
				@Pc(56) float local56 = (float) local50 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local39 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(79) float local79 = (float) -local69 + local66;
				@Pc(85) float local85 = (1.0F - local48) * local56;
				@Pc(93) float local93 = local56 * (1.0F - local48 * local79);
				@Pc(103) float local103 = local56 * (1.0F - (1.0F - local79) * local48);
				if (local73 == 0) {
					local58 = local56;
					local60 = local103;
					local62 = local85;
				} else if (local73 == 1) {
					local62 = local85;
					local58 = local93;
					local60 = local56;
				} else if (local73 == 2) {
					local58 = local85;
					local62 = local103;
					local60 = local56;
				} else if (local73 == 3) {
					local60 = local93;
					local62 = local56;
					local58 = local85;
				} else if (local73 == 4) {
					local58 = local103;
					local62 = local56;
					local60 = local85;
				} else if (local73 == 5) {
					local60 = local85;
					local62 = local93;
					local58 = local56;
				}
				local58 = (float) Math.pow((double) local58, local17);
				local60 = (float) Math.pow((double) local60, local17);
				local62 = (float) Math.pow((double) local62, local17);
				@Pc(192) int local192 = (int) (local58 * 256.0F);
				@Pc(197) int local197 = (int) (local60 * 256.0F);
				@Pc(202) int local202 = (int) (local62 * 256.0F);
				@Pc(214) int local214 = local202 + (local197 << 8) + (local192 << 16) - 16777216;
				Static238.anIntArray440[local19++] = local214;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIFBIII)[I")
	public static int[] method674(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub8_Sub37 local10 = new Class1_Sub8_Sub37();
		local10.aBoolean487 = true;
		local10.anInt7546 = 35;
		local10.anInt7549 = 8;
		local10.anInt7539 = 8;
		local10.anInt7545 = 4;
		local10.anInt7538 = (int) (arg0 * 4096.0F);
		local10.method6033();
		Static258.method3817(1, 2048);
		local10.method5759(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BJ)V")
	public static void method675(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static224.anInt7016;
		@Pc(9) int local9 = Static459.anInt7963;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local7 != Static162.anInt3418) {
			local21 = local7 - Static162.anInt3418;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static162.anInt3418 += local29;
		}
		if (Static323.anInt5976 != local9) {
			local21 = local9 - Static323.anInt5976;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local21 < local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local21 > local29) {
				local29 = local21;
			}
			Static323.anInt5976 += local29;
		}
		if (!Static12.aClass34_Sub1_1.aBoolean454) {
			Static26.aFloat5 += (float) arg0 * Static191.aFloat61 / 40.0F * 8.0F;
			Static267.aFloat83 += Static214.aFloat101 * (float) arg0 / 40.0F * 8.0F;
		}
		Static208.method3584();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method677(@OriginalArg(1) Class177 arg0) {
		Static433.aClass1_Sub3_Sub1_11.method322(arg0.method4037());
	}
}
