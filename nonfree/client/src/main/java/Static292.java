import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	public static int anInt4989;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Lclient!rda;")
	public static Class3_Sub4_Sub3 aClass3_Sub4_Sub3_1;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
	public static final int[] anIntArray279 = new int[1];

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_98 = new Class56(91, 4);

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Z")
	public static boolean aBoolean364 = false;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ce;)V")
	public static void method4374(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		arg0.method1384();
		@Pc(10) int local10 = Static166.anInt3327;
		@Pc(20) Class41_Sub2_Sub1_Sub4_Sub2 local20 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local10] = new Class41_Sub2_Sub1_Sub4_Sub2();
		local20.anInt9472 = local10;
		@Pc(33) int local33 = arg0.method1383(30);
		@Pc(38) byte local38 = (byte) (local33 >> 28);
		@Pc(44) int local44 = local33 >> 14 & 0x3FFF;
		local20.anIntArray629[0] = local44 - Static335.anInt5608;
		@Pc(55) int local55 = local33 & 0x3FFF;
		local20.anInt9444 = (local20.anIntArray629[0] << 9) + (local20.method7858() << 8);
		local20.anIntArray628[0] = local55 - Static246.anInt4344;
		local20.anInt9442 = (local20.anIntArray628[0] << 9) + (local20.method7858() << 8);
		Static117.anInt2694 = local20.aByte117 = local20.aByte118 = local38;
		if (Static511.method6886(local20.anIntArray628[0], local20.anIntArray629[0])) {
			local20.aByte118++;
		}
		if (Static164.aClass3_Sub11Array1[local10] != null) {
			local20.method7873(Static164.aClass3_Sub11Array1[local10]);
		}
		Static403.anInt6982 = 0;
		Static430.anIntArray447[Static403.anInt6982++] = local10;
		Static214.aByteArray43[local10] = 0;
		Static539.anInt8645 = 0;
		for (@Pc(146) int local146 = 1; local146 < 2048; local146++) {
			if (local10 != local146) {
				@Pc(156) int local156 = arg0.method1383(18);
				@Pc(160) int local160 = local156 >> 16;
				@Pc(166) int local166 = local156 >> 8 & 0xFF;
				@Pc(170) int local170 = local156 & 0xFF;
				@Pc(178) Class252 local178 = Static352.aClass252Array1[local146] = new Class252();
				local178.anInt6965 = -1;
				local178.anInt6967 = (local160 << 28) + (local166 << 14) + local170;
				local178.aBoolean522 = false;
				local178.anInt6970 = 0;
				Static159.anIntArray157[Static539.anInt8645++] = local146;
				Static214.aByteArray43[local146] = 0;
			}
		}
		arg0.method1392();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method4376() {
		@Pc(1) Class6 local1 = Static475.aClass6_58;
		synchronized (Static475.aClass6_58) {
			Static475.aClass6_58.method94();
		}
	}
}
