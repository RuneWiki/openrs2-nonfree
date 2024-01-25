import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
	public static int anInt6164;

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
	public static int anInt6169 = 0;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static145.method3218(arg1, arg0) || Static423.method6817(arg1, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!ua;B)V")
	public static void method5251(@OriginalArg(0) Class2_Sub11_Sub2 arg0) {
		arg0.method8407();
		@Pc(10) int local10 = Static569.anInt10211;
		@Pc(20) Class3_Sub1_Sub3_Sub3_Sub2 local20 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local10] = new Class3_Sub1_Sub3_Sub3_Sub2();
		local20.anInt6083 = local10;
		@Pc(28) int local28 = arg0.method8400(30);
		@Pc(38) byte local38 = (byte) (local28 >> 28);
		@Pc(44) int local44 = local28 >> 14 & 0x3FFF;
		local20.anIntArray358[0] = local44 - Static84.anInt2565;
		@Pc(56) int local56 = local28 & 0x3FFF;
		local20.anInt10303 = (local20.anIntArray358[0] << 9) + (local20.method5214() << 8);
		local20.anIntArray357[0] = local56 - Static32.anInt723;
		local20.anInt10310 = (local20.anIntArray357[0] << 9) + (local20.method5214() << 8);
		Static12.anInt172 = local20.aByte132 = local20.aByte131 = local38;
		if (Static30.method735(local20.anIntArray357[0], local20.anIntArray358[0])) {
			local20.aByte131++;
		}
		if (Static405.aClass2_Sub11Array1[local10] != null) {
			local20.method5222(Static405.aClass2_Sub11Array1[local10]);
		}
		Static71.anInt3990 = 0;
		Static549.anIntArray643[Static71.anInt3990++] = local10;
		Static143.aByteArray113[local10] = 0;
		Static329.anInt6646 = 0;
		for (@Pc(147) int local147 = 1; local147 < 2048; local147++) {
			if (local10 != local147) {
				@Pc(161) int local161 = arg0.method8400(18);
				@Pc(165) int local165 = local161 >> 16;
				@Pc(171) int local171 = local161 >> 8 & 0xFF;
				@Pc(175) int local175 = local161 & 0xFF;
				@Pc(183) Class102 local183 = Static259.aClass102Array1[local147] = new Class102();
				local183.aBoolean257 = false;
				local183.anInt3411 = (local171 << 14) + (local165 << 28) + local175;
				local183.anInt3413 = 0;
				local183.anInt3415 = -1;
				Static274.anIntArray338[Static329.anInt6646++] = local147;
				Static143.aByteArray113[local147] = 0;
			}
		}
		arg0.method8402();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZI)Lclient!mf;")
	public static Class206_Sub1 method5252(@OriginalArg(1) int arg0) {
		return Static471.aBoolean644 && Static154.anInt7074 <= arg0 && arg0 <= Static167.anInt4124 ? Static507.aClass206_Sub1Array2[arg0 - Static154.anInt7074] : null;
	}
}
