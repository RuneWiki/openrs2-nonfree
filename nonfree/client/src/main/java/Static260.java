import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!om;")
	public static Class246 aClass246_124;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "F")
	public static float aFloat107 = 1.0F;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!bs;")
	public static Class35 aClass35_1 = new Class35(8);

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	public static int anInt4932 = -1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!bw;B)V")
	public static void method4318(@OriginalArg(0) Class3_Sub11_Sub1 arg0) {
		arg0.method992();
		@Pc(10) int local10 = Static502.anInt8011;
		@Pc(20) Class9_Sub1_Sub1_Sub2_Sub2 local20 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local10] = new Class9_Sub1_Sub1_Sub2_Sub2();
		local20.anInt6429 = local10;
		@Pc(28) int local28 = arg0.method990(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray518[0] = local39 - Static529.anInt8344;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt8975 = (local20.anIntArray518[0] << 9) + (local20.method5569() << 8);
		local20.anIntArray517[0] = local51 - Static463.anInt7588;
		local20.anInt8980 = (local20.anIntArray517[0] << 9) + (local20.method5569() << 8);
		Static209.anInt8182 = local20.aByte126 = local20.aByte125 = local33;
		if (Static425.method6053(local20.anIntArray518[0], local20.anIntArray517[0])) {
			local20.aByte125++;
		}
		if (Static375.aClass3_Sub11Array1[local10] != null) {
			local20.method5589(Static375.aClass3_Sub11Array1[local10]);
		}
		Static476.anInt8277 = 0;
		Static10.anIntArray19[Static476.anInt8277++] = local10;
		Static297.aByteArray60[local10] = 0;
		Static524.anInt8287 = 0;
		for (@Pc(142) int local142 = 1; local142 < 2048; local142++) {
			if (local10 != local142) {
				@Pc(152) int local152 = arg0.method990(18);
				@Pc(156) int local156 = local152 >> 16;
				@Pc(162) int local162 = local152 >> 8 & 0xFF;
				@Pc(166) int local166 = local152 & 0xFF;
				@Pc(174) Class74 local174 = Static250.aClass74Array1[local142] = new Class74();
				local174.anInt2641 = -1;
				local174.anInt2638 = 0;
				local174.aBoolean213 = false;
				local174.anInt2639 = (local162 << 14) + ((local156 << 28) + local166);
				Static49.anIntArray94[Static524.anInt8287++] = local142;
				Static297.aByteArray60[local142] = 0;
			}
		}
		arg0.method989();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(CB)Z")
	public static boolean method4319(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
