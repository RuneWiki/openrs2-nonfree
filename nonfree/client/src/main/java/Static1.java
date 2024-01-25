import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public static int anInt10287;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array21;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_120 = new Class257(52, 0);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt10286 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!wp;)V")
	public static void method8307(@OriginalArg(1) Class8_Sub8_Sub2 arg0) {
		arg0.method8592();
		@Pc(10) int local10 = Static616.anInt10362;
		@Pc(20) Class15_Sub1_Sub2_Sub2_Sub1 local20 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local10] = new Class15_Sub1_Sub2_Sub2_Sub1();
		local20.anInt8075 = local10;
		@Pc(28) int local28 = arg0.method8586(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray435[0] = local39 - Static628.anInt10493;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt10301 = (local20.anIntArray435[0] << 9) + (local20.method6692() << 8);
		local20.anIntArray436[0] = local51 - Static594.anInt10160;
		local20.anInt10298 = (local20.anIntArray436[0] << 9) + (local20.method6692() << 8);
		Static128.anInt3428 = local20.aByte124 = local20.aByte125 = local33;
		if (Static61.method1675(local20.anIntArray436[0], local20.anIntArray435[0])) {
			local20.aByte125++;
		}
		if (Static524.aClass8_Sub8Array1[local10] != null) {
			local20.method2763(Static524.aClass8_Sub8Array1[local10]);
		}
		Static315.anInt9128 = 0;
		Static533.anIntArray506[Static315.anInt9128++] = local10;
		Static67.aByteArray9[local10] = 0;
		Static314.anInt6379 = 0;
		for (@Pc(142) int local142 = 1; local142 < 2048; local142++) {
			if (local142 != local10) {
				@Pc(152) int local152 = arg0.method8586(18);
				@Pc(156) int local156 = local152 >> 16;
				@Pc(162) int local162 = local152 >> 8 & 0xFF;
				@Pc(166) int local166 = local152 & 0xFF;
				@Pc(174) Class272 local174 = Static408.aClass272Array1[local142] = new Class272();
				local174.anInt8302 = local166 + (local156 << 28) + (local162 << 14);
				local174.anInt8303 = 0;
				local174.anInt8304 = -1;
				local174.aBoolean596 = false;
				Static566.anIntArray540[Static314.anInt6379++] = local142;
				Static67.aByteArray9[local142] = 0;
			}
		}
		arg0.method8590();
	}
}
