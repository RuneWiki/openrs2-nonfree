import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public static int anInt8447;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
	public static int anInt8459;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method6972(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static385.anInt10557;
		@Pc(9) int[] local9 = Static493.anIntArray555;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class2_Sub3_Sub1_Sub2_Sub2 local26 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local9[local18]];
			if (local26 != null && local26 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 && local26.aString68 != null && local26.aString68.equalsIgnoreCase(arg0)) {
				local16 = true;
				@Pc(60) Class3_Sub26 local60;
				if (arg1 == 1) {
					local60 = Static640.method8636(Static70.aClass344_23, Static403.aClass294_3);
					local60.aClass3_Sub15_Sub1_3.method8431(local9[local18]);
					local60.aClass3_Sub15_Sub1_3.method8439(0);
					Static472.method5189(local60);
				} else if (arg1 == 4) {
					local60 = Static640.method8636(Static238.aClass344_60, Static403.aClass294_3);
					local60.aClass3_Sub15_Sub1_3.method8441(0);
					local60.aClass3_Sub15_Sub1_3.method8464(local9[local18]);
					Static472.method5189(local60);
				} else if (arg1 == 5) {
					local60 = Static640.method8636(Static82.aClass344_24, Static403.aClass294_3);
					local60.aClass3_Sub15_Sub1_3.method8428(0);
					local60.aClass3_Sub15_Sub1_3.method8431(local9[local18]);
					Static472.method5189(local60);
				} else if (arg1 == 6) {
					local60 = Static640.method8636(Static480.aClass344_102, Static403.aClass294_3);
					local60.aClass3_Sub15_Sub1_3.method8464(local9[local18]);
					local60.aClass3_Sub15_Sub1_3.method8448(0);
					Static472.method5189(local60);
				} else if (arg1 == 7) {
					local60 = Static640.method8636(Static260.aClass344_64, Static403.aClass294_3);
					local60.aClass3_Sub15_Sub1_3.method8464(local9[local18]);
					local60.aClass3_Sub15_Sub1_3.method8441(0);
					Static472.method5189(local60);
				}
				break;
			}
		}
		if (!local16) {
			Static496.method7251(Static287.aClass176_21.method4986(Static380.anInt7247) + arg0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILclient!rj;)V")
	public static void method6973(@OriginalArg(1) int arg0, @OriginalArg(2) Class290 arg1) {
		if (Static224.anInt5125 >= 50 || (arg1 == null || arg1.anIntArrayArray87 == null || arg1.anIntArrayArray87.length <= arg0 || arg1.anIntArrayArray87[arg0] == null)) {
			return;
		}
		@Pc(42) int local42 = arg1.anIntArrayArray87[arg0][0];
		@Pc(46) int local46 = local42 >> 8;
		@Pc(52) int local52 = local42 >> 5 & 0x7;
		@Pc(69) int local69;
		if (arg1.anIntArrayArray87[arg0].length > 1) {
			local69 = (int) (Math.random() * (double) arg1.anIntArrayArray87[arg0].length);
			if (local69 > 0) {
				local46 = arg1.anIntArrayArray87[arg0][local69];
			}
		}
		local69 = 256;
		if (arg1.anIntArray544 != null && arg1.anIntArray549 != null) {
			local69 = Static277.method4946(arg1.anIntArray549[arg0], arg1.anIntArray544[arg0]);
		}
		if (arg1.aBoolean736) {
			Static474.method7012(0, 255, local46, local69, false, local52);
		} else {
			Static167.method3515(255, local46, local69, local52, 0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public static void method6978() {
		if (Static8.anIntArray7 != null && Static365.anIntArray410 != null) {
			return;
		}
		Static8.anIntArray7 = new int[256];
		Static365.anIntArray410 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static8.anIntArray7[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static365.anIntArray410[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "()V")
	public static void method6980() {
		Static625.aClass70_2 = Static625.aClass70_3;
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)V")
	public static void method6982() {
		Static174.aClass33_7.L(Static260.anInt5718, Static552.aClass3_Sub48_30.aClass23_Sub28_1.method7679() == 1 ? Static501.anInt9728 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6983(@OriginalArg(1) Class33 arg0) {
		if (Static599.aBoolean832) {
			Static551.method8446(arg0);
		} else {
			Static297.method5119(arg0);
		}
	}
}
