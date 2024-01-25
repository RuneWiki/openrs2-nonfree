import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public static int anInt1533;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_41 = new Class119("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIII)I")
	public static int method1351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = arg0 * (arg2 & 0x7F) + local17 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = local17 * (arg1 & 0x380) + (arg2 & 0x380) * arg0 >> 7;
		@Pc(65) int local65 = local17 * (arg1 & 0xFC00) + (arg2 & 0xFC00) * arg0 >> 7;
		return local50 & 0x380 | local65 & 0xFC00 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!kh;B)V")
	public static void method1352(@OriginalArg(0) Class1_Sub28_Sub1 arg0) {
		arg0.method3077();
		@Pc(12) int local12 = Static296.anInt5181;
		@Pc(22) Class25_Sub5_Sub1_Sub2 local22 = Static447.aClass25_Sub5_Sub1_Sub2_4 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local12] = new Class25_Sub5_Sub1_Sub2();
		local22.anInt4284 = local12;
		@Pc(30) int local30 = arg0.method3084(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		local22.anIntArray283[0] = local41 - Static199.anInt3480;
		@Pc(53) int local53 = local30 & 0x3FFF;
		local22.anInt5518 = (local22.anIntArray283[0] << 7) + (local22.method3427() << 6);
		local22.anIntArray284[0] = local53 - Static164.anInt2731;
		local22.anInt5514 = (local22.anIntArray284[0] << 7) + (local22.method3427() << 6);
		Static265.anInt4807 = local22.aByte94 = local35;
		if (Static7.aClass1_Sub28Array1[local12] != null) {
			local22.method3448(Static7.aClass1_Sub28Array1[local12]);
		}
		Static285.anInt5015 = 0;
		Static103.anIntArray135[Static285.anInt5015++] = local12;
		Static349.aByteArray74[local12] = 0;
		Static145.anInt1965 = 0;
		for (@Pc(126) int local126 = 1; local126 < 2048; local126++) {
			if (local126 != local12) {
				@Pc(140) int local140 = arg0.method3084(18);
				@Pc(144) int local144 = local140 >> 16;
				@Pc(150) int local150 = local140 >> 8 & 0xFF;
				@Pc(154) int local154 = local140 & 0xFF;
				@Pc(162) Class44 local162 = Static162.aClass44Array1[local126] = new Class44();
				local162.anInt1174 = 0;
				local162.anInt1172 = -1;
				local162.aBoolean122 = false;
				local162.anInt1171 = local154 + (local150 << 14) + (local144 << 28);
				Static308.anIntArray354[Static145.anInt1965++] = local126;
				Static349.aByteArray74[local126] = 0;
			}
		}
		arg0.method3083();
	}
}
