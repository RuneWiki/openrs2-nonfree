import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!pe;")
	public static Class254 aClass254_120;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!ra;")
	public static Class276 aClass276_124;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt8731 = -1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7180(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method7181() {
		Static348.method2213(false);
		if (Static499.anInt9277 >= 0 && Static499.anInt9277 != 0) {
			Static63.method1592(Static499.anInt9277);
			Static499.anInt9277 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
	public static boolean method7183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!cda;I)V")
	public static void method7184(@OriginalArg(0) Class3_Sub7_Sub1 arg0) {
		arg0.method1500();
		@Pc(8) int local8 = Static381.anInt1560;
		@Pc(18) Class2_Sub2_Sub1_Sub1 local18 = Static443.aClass2_Sub2_Sub1_Sub1_2 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local8] = new Class2_Sub2_Sub1_Sub1();
		local18.anInt7603 = local8;
		@Pc(26) int local26 = arg0.method1499(30);
		@Pc(31) byte local31 = (byte) (local26 >> 28);
		@Pc(37) int local37 = local26 >> 14 & 0x3FFF;
		@Pc(41) int local41 = local26 & 0x3FFF;
		local18.anIntArray487[0] = local37 - Static230.anInt4667;
		local18.anInt9398 = (local18.anIntArray487[0] << 9) + (local18.method6311() << 8);
		local18.anIntArray488[0] = local41 - Static563.anInt10006;
		local18.anInt9396 = (local18.anIntArray488[0] << 9) + (local18.method6311() << 8);
		Static212.anInt4380 = local18.aByte103 = local31;
		if (Static1.aClass3_Sub7Array1[local8] != null) {
			local18.method2043(Static1.aClass3_Sub7Array1[local8]);
		}
		Static455.anInt8611 = 0;
		Static492.anIntArray589[Static455.anInt8611++] = local8;
		Static241.aByteArray60[local8] = 0;
		Static355.anInt5529 = 0;
		for (@Pc(119) int local119 = 1; local119 < 2048; local119++) {
			if (local8 != local119) {
				@Pc(128) int local128 = arg0.method1499(18);
				@Pc(132) int local132 = local128 >> 16;
				@Pc(138) int local138 = local128 >> 8 & 0xFF;
				@Pc(142) int local142 = local128 & 0xFF;
				@Pc(150) Class90 local150 = Static102.aClass90Array1[local119] = new Class90();
				local150.anInt2875 = -1;
				local150.aBoolean220 = false;
				local150.anInt2874 = 0;
				local150.anInt2871 = (local138 << 14) + (local132 << 28) + local142;
				Static335.anIntArray447[Static355.anInt5529++] = local119;
				Static241.aByteArray60[local119] = 0;
			}
		}
		arg0.method1491();
	}
}
