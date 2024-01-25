import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
	public static int[] anIntArray596;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static int anInt9671;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!vd;")
	public static Class353 aClass353_123;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt9673;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
	public static final int[] anIntArray595 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8194(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BJ)V")
	public static void method8202(@OriginalArg(1) long arg0) {
		if (Static272.aClass97ArrayArrayArray3 != null) {
			if (Static334.anInt6354 == 1 || Static334.anInt6354 == 5) {
				Static228.method3905(arg0);
			} else if (Static334.anInt6354 == 4) {
				Static609.method8504(arg0);
			}
		}
		Static251.method4490((long) Static113.anInt2243, Static162.aClass100_7);
		if (Static554.anInt1822 != -1) {
			Static571.method8292(Static554.anInt1822);
		}
		for (@Pc(42) int local42 = 0; local42 < Static595.anInt9912; local42++) {
			if (Static501.aBooleanArray46[local42]) {
				Static623.aBooleanArray57[local42] = true;
			}
			Static567.aBooleanArray53[local42] = Static501.aBooleanArray46[local42];
			Static501.aBooleanArray46[local42] = false;
		}
		Static498.anInt8628 = Static113.anInt2243;
		Static165.method3050(-1, (Class302) null, -1);
		Static275.method4852(-1, (Class302) null, -1);
		if (Static554.anInt1822 != -1) {
			Static595.anInt9912 = 0;
			Static19.method335();
		}
		Static162.aClass100_7.la();
		Static498.method7428(Static162.aClass100_7);
		@Pc(96) int local96 = Static77.method1323();
		if (local96 == -1) {
			local96 = Static351.anInt6586;
		}
		if (local96 == -1) {
			local96 = Static648.anInt10745;
		}
		Static384.method6193(local96);
		@Pc(117) int local117 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() << 8;
		Static612.method7504(local117 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725, local117 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729, Static333.anInt9456, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131);
		Static333.anInt9456 = 0;
	}
}
