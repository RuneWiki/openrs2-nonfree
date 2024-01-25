import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!tg;")
	public static Class348 aClass348_1;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public static int anInt10021;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
	public static boolean aBoolean710 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!oe;ILclient!rda;)V")
	public static void method8566(@OriginalArg(1) Class264 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub1 arg2) {
		if (Static65.anInt1087 >= 50 || (arg0 == null || arg0.anIntArrayArray46 == null || arg1 >= arg0.anIntArrayArray46.length || arg0.anIntArrayArray46[arg1] == null)) {
			return;
		}
		@Pc(44) int local44 = arg0.anIntArrayArray46[arg1][0];
		@Pc(48) int local48 = local44 >> 8;
		@Pc(61) int local61 = local44 >> 5 & 0x7;
		@Pc(65) int local65 = local44 & 0x1F;
		@Pc(84) int local84;
		if (arg0.anIntArrayArray46[arg1].length > 1) {
			local84 = (int) ((double) arg0.anIntArrayArray46[arg1].length * Math.random());
			if (local84 > 0) {
				local48 = arg0.anIntArrayArray46[arg1][local84];
			}
		}
		local84 = 256;
		if (arg0.anIntArray424 != null && arg0.anIntArray421 != null) {
			local84 = arg0.anIntArray424[arg1] + (int) ((double) (arg0.anIntArray421[arg1] - arg0.anIntArray424[arg1]) * Math.random());
		}
		@Pc(134) int local134 = arg0.anIntArray420 == null ? 255 : arg0.anIntArray420[arg1];
		if (local65 == 0) {
			if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == arg2) {
				if (!arg0.aBoolean469) {
					Static649.method8959(local134, local84, local61, 0, local48);
					return;
				}
				Static152.method2787(local61, local84, local48, 0, local134, false);
			}
		} else if (Static577.aClass5_Sub19_25.aClass17_Sub15_3.method5251() != 0) {
			@Pc(181) int local181 = arg2.anInt9805 - 256 >> 9;
			@Pc(188) int local188 = arg2.anInt9803 - 256 >> 9;
			@Pc(210) int local210 = arg2 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 ? 0 : local65 + (local188 << 8) + (arg2.aByte139 << 24) + (local181 << 16);
			Static24.aClass248Array1[Static65.anInt1087++] = new Class248((byte) (arg0.aBoolean469 ? 2 : 1), local48, local61, 0, local134, local210, local84, arg2);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Z")
	public static boolean method8567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static59.method3611(arg0, arg1) & Static388.method5740(arg0, arg1);
	}
}
