import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "Lclient!la;")
	public static Class196 aClass196_58;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "Z")
	public static boolean aBoolean346 = true;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!jc;B)V")
	public static void method4711(@OriginalArg(0) Class3_Sub3_Sub2 arg0) {
		arg0.method4273();
		@Pc(10) int local10 = Static97.anInt2234;
		@Pc(20) Class4_Sub1_Sub2_Sub1_Sub2 local20 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local10] = new Class4_Sub1_Sub2_Sub1_Sub2();
		local20.anInt5759 = local10;
		@Pc(28) int local28 = arg0.method4276(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray310[0] = local39 - Static299.anInt5307;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt8916 = (local20.anIntArray310[0] << 9) + (local20.method5059() << 8);
		local20.anIntArray309[0] = local51 - Static171.anInt3340;
		local20.anInt8911 = (local20.anIntArray309[0] << 9) + (local20.method5059() << 8);
		Static549.anInt9262 = local20.aByte123 = local20.aByte124 = local33;
		if (Static486.method7232(local20.anIntArray309[0], local20.anIntArray310[0])) {
			local20.aByte124++;
		}
		if (Static56.aClass3_Sub3Array1[local10] != null) {
			local20.method5075(Static56.aClass3_Sub3Array1[local10]);
		}
		Static274.anInt4964 = 0;
		Static70.anIntArray392[Static274.anInt4964++] = local10;
		Static289.aByteArray95[local10] = 0;
		Static327.anInt6118 = 0;
		for (@Pc(146) int local146 = 1; local146 < 2048; local146++) {
			if (local10 != local146) {
				@Pc(156) int local156 = arg0.method4276(18);
				@Pc(160) int local160 = local156 >> 16;
				@Pc(166) int local166 = local156 >> 8 & 0xFF;
				@Pc(170) int local170 = local156 & 0xFF;
				@Pc(178) Class12 local178 = Static135.aClass12Array1[local146] = new Class12();
				local178.anInt748 = 0;
				local178.anInt751 = local170 + (local160 << 28) + (local166 << 14);
				local178.anInt749 = -1;
				local178.aBoolean59 = false;
				Static446.anIntArray493[Static327.anInt6118++] = local146;
				Static289.aByteArray95[local146] = 0;
			}
		}
		arg0.method4278();
	}
}
