import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Lclient!fs;")
	public static Class76 aClass76_91;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_132 = new Class83("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_133 = new Class83("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!cw;)V")
	public static void method5117(@OriginalArg(1) Class4_Sub12_Sub1 arg0) {
		arg0.method1136();
		@Pc(10) int local10 = Static207.anInt5452;
		@Pc(20) Class16_Sub1_Sub5_Sub1 local20 = Static1.aClass16_Sub1_Sub5_Sub1_1 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local10] = new Class16_Sub1_Sub5_Sub1();
		local20.anInt6037 = local10;
		@Pc(28) int local28 = arg0.method1143(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray426[0] = local39 - Static180.anInt3453;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt6893 = (local20.anIntArray426[0] << 7) + (local20.method4751() << 6);
		local20.anIntArray427[0] = local51 - Static86.anInt1771;
		local20.anInt6892 = (local20.anIntArray427[0] << 7) + (local20.method4751() << 6);
		Static263.anInt4963 = local20.aByte82 = local33;
		if (Static354.aClass4_Sub12Array1[local10] != null) {
			local20.method3422(Static354.aClass4_Sub12Array1[local10]);
		}
		Static33.anInt606 = 0;
		Static99.anIntArray157[Static33.anInt606++] = local10;
		Static116.aByteArray63[local10] = 0;
		Static334.anInt5761 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local125 != local10) {
				@Pc(135) int local135 = arg0.method1143(18);
				@Pc(139) int local139 = local135 >> 16;
				@Pc(145) int local145 = local135 >> 8 & 0xFF;
				@Pc(149) int local149 = local135 & 0xFF;
				@Pc(157) Class253 local157 = Static306.aClass253Array1[local125] = new Class253();
				local157.anInt6949 = (local139 << 28) + (local145 << 14) + local149;
				local157.anInt6947 = 0;
				local157.anInt6946 = -1;
				local157.aBoolean648 = false;
				Static313.anIntArray374[Static334.anInt5761++] = local125;
				Static116.aByteArray63[local125] = 0;
			}
		}
		arg0.method1135();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public static void method5118() {
		Static65.anInt1373 = 0;
		@Pc(12) int local12 = (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7) + Static180.anInt3453;
		@Pc(19) int local19 = Static86.anInt1771 + (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static65.anInt1373 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static65.anInt1373 = 1;
		}
		if (Static65.anInt1373 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static65.anInt1373 = 0;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)Z")
	public static boolean method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static283.method3965(arg1, arg0) || Static23.method303(arg1, arg0);
	}
}
