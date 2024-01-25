import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "Lclient!gga;")
	public static Class124 aClass124_8;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "[Lclient!ea;")
	public static final Class15_Sub3_Sub3_Sub1_Sub1[] aClass15_Sub3_Sub3_Sub1_Sub1Array1 = new Class15_Sub3_Sub3_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method485(@OriginalArg(0) String arg0) {
		if (!Static537.aBoolean683 || (Static156.anInt3415 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static383.anInt7249;
		@Pc(18) int[] local18 = Static404.anIntArray362;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class15_Sub3_Sub3_Sub1_Sub1 local28 = aClass15_Sub3_Sub3_Sub1_Sub1Array1[local18[local20]];
			if (local28.aString29 != null && local28.aString29.equalsIgnoreCase(arg0) && (local28 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 && (Static156.anInt3415 & 0x10) != 0 || local28 != null && (Static156.anInt3415 & 0x8) != 0)) {
				@Pc(61) Class2_Sub52 local61 = Static311.method5098(Static670.aClass341_78, Static125.aClass179_1);
				local61.aClass2_Sub8_Sub2_2.method5187(local18[local20]);
				local61.aClass2_Sub8_Sub2_2.method5218(Static188.anInt8300);
				local61.aClass2_Sub8_Sub2_2.method5208(0);
				local61.aClass2_Sub8_Sub2_2.method5188(Static135.anInt2564);
				local61.aClass2_Sub8_Sub2_2.method5205(Static590.anInt10293);
				Static38.method791(local61);
				local14 = true;
				Static76.method1368(-2, 0, local28.method3690(), local28.anIntArray189[0], local28.method3690(), 0, true, local28.anIntArray188[0]);
				break;
			}
		}
		if (!local14) {
			Static439.method7152(Static205.aClass134_21.method3906(Static204.anInt8130) + arg0);
		}
		if (Static537.aBoolean683) {
			Static417.method6895();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!uf;Lclient!uf;)V")
	public static void method486(@OriginalArg(1) Class357 arg0, @OriginalArg(2) Class357 arg1) {
		@Pc(12) Class2_Sub52 local12 = Static311.method5098(Static104.aClass341_23, Static125.aClass179_1);
		local12.aClass2_Sub8_Sub2_2.method5194(arg0.anInt10460);
		local12.aClass2_Sub8_Sub2_2.method5218(arg1.anInt10396);
		local12.aClass2_Sub8_Sub2_2.method5218(arg0.anInt10432);
		local12.aClass2_Sub8_Sub2_2.method5218(arg1.anInt10432);
		local12.aClass2_Sub8_Sub2_2.method5188(arg1.anInt10460);
		local12.aClass2_Sub8_Sub2_2.method5218(arg0.anInt10396);
		Static38.method791(local12);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIII)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static230.aClass2_Sub54_15.aClass4_Sub22_1.method7520() != 0 && arg1 != 0 && Static356.anInt6821 < 50 && arg0 != -1) {
			Static307.aClass150Array1[Static356.anInt6821++] = new Class150((byte) 1, arg0, arg1, arg4, arg2, 0, arg3, (Class15_Sub3) null);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZBZ)V")
	public static void method489(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static435.anInt7920++;
			Static18.method348();
		}
		if (arg1) {
			Static8.anInt147++;
			Static559.method8526();
		}
	}
}
