import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!f;")
	public static Class39 aClass39_11;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ks;I)V")
	public static void method4647(@OriginalArg(0) Class2_Sub15_Sub2 arg0) {
		arg0.method4362();
		@Pc(12) int local12 = Static222.anInt4184;
		@Pc(22) Class6_Sub1_Sub1_Sub1_Sub2 local22 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class6_Sub1_Sub1_Sub1_Sub2();
		local22.lb = local12;
		@Pc(30) int local30 = arg0.method4355(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		local22.anIntArray510[0] = local41 - Static35.anInt906;
		@Pc(52) int local52 = local30 & 0x3FFF;
		local22.anInt8761 = (local22.anIntArray510[0] << 9) + (local22.method6165() << 8);
		local22.anIntArray509[0] = local52 - Static130.anInt5246;
		local22.anInt8764 = (local22.anIntArray509[0] << 9) + (local22.method6165() << 8);
		Static566.anInt9278 = local22.aByte112 = local22.aByte111 = local35;
		if (Static551.method7475(local22.anIntArray509[0], local22.anIntArray510[0])) {
			local22.aByte111++;
		}
		if (Static566.aClass2_Sub15Array1[local12] != null) {
			local22.method6180(Static566.aClass2_Sub15Array1[local12]);
		}
		Static376.anInt6647 = 0;
		Static557.anIntArray665[Static376.anInt6647++] = local12;
		Static506.aByteArray85[local12] = 0;
		Static319.anInt5951 = 0;
		for (@Pc(141) int local141 = 1; local141 < 2048; local141++) {
			if (local12 != local141) {
				@Pc(151) int local151 = arg0.method4355(18);
				@Pc(155) int local155 = local151 >> 16;
				@Pc(161) int local161 = local151 >> 8 & 0xFF;
				@Pc(165) int local165 = local151 & 0xFF;
				@Pc(173) Class274 local173 = Static119.aClass274Array1[local141] = new Class274();
				local173.anInt7767 = -1;
				local173.aBoolean614 = false;
				local173.anInt7769 = (local155 << 28) - (-(local161 << 14) - local165);
				local173.anInt7766 = 0;
				Static162.anIntArray195[Static319.anInt5951++] = local141;
				Static506.aByteArray85[local141] = 0;
			}
		}
		arg0.method4361();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4648(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class2_Sub36 local7 = null;
		for (@Pc(14) Class2_Sub36 local14 = (Class2_Sub36) Static524.aClass8_62.method210(); local14 != null; local14 = (Class2_Sub36) Static524.aClass8_62.method218()) {
			if (local14.anInt6573 == arg0 && arg5 == local14.anInt6574 && arg4 == local14.anInt6564 && local14.anInt6568 == arg6) {
				local7 = local14;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub36();
			local7.anInt6574 = arg5;
			local7.anInt6564 = arg4;
			local7.anInt6568 = arg6;
			local7.anInt6573 = arg0;
			if (arg5 >= 0 && arg4 >= 0 && arg5 < Static188.anInt3850 && arg4 < Static49.anInt1174) {
				Static462.method6520(local7);
			}
			Static524.aClass8_62.method212(local7);
		}
		local7.anInt6567 = -1;
		local7.anInt6565 = arg2;
		local7.anInt6572 = 0;
		local7.anInt6566 = arg3;
		local7.anInt6575 = arg1;
	}
}
