import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public static void method6599() {
		Static431.aBoolean550 = true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!eea;Z)V")
	public static void method6603(@OriginalArg(0) Class6_Sub15_Sub1 arg0) {
		arg0.method2469();
		@Pc(10) int local10 = Static503.anInt8407;
		@Pc(20) Class60_Sub1_Sub1_Sub3_Sub1 local20 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local10] = new Class60_Sub1_Sub1_Sub3_Sub1();
		local20.anInt4845 = local10;
		@Pc(35) int local35 = arg0.method2468(30);
		@Pc(40) byte local40 = (byte) (local35 >> 28);
		@Pc(46) int local46 = local35 >> 14 & 0x3FFF;
		@Pc(50) int local50 = local35 & 0x3FFF;
		local20.anIntArray263[0] = local46 - Static50.anInt606;
		local20.anInt9048 = (local20.anIntArray263[0] << 9) + (local20.method4424((byte) -28) << 8);
		local20.anIntArray264[0] = local50 - Static404.anInt7039;
		local20.anInt9057 = (local20.anIntArray264[0] << 9) + (local20.method4424((byte) -28) << 8);
		Static504.anInt8428 = local20.aByte135 = local20.aByte134 = local40;
		if (Static180.method3417(1, local20.anIntArray263[0], local20.anIntArray264[0])) {
			local20.aByte134++;
		}
		if (Static372.aClass6_Sub15Array4[local10] != null) {
			local20.method2706(Static372.aClass6_Sub15Array4[local10]);
		}
		Static661.anInt10532 = 0;
		Static591.anIntArray611[Static661.anInt10532++] = local10;
		Static313.aByteArray52[local10] = 0;
		Static215.anInt4264 = 0;
		for (@Pc(152) int local152 = 1; local152 < 2048; local152++) {
			if (local152 != local10) {
				@Pc(168) int local168 = arg0.method2468(18);
				@Pc(172) int local172 = local168 >> 16;
				@Pc(178) int local178 = local168 >> 8 & 0xFF;
				@Pc(182) int local182 = local168 & 0xFF;
				@Pc(190) Class353 local190 = Static395.aClass353Array1[local152] = new Class353();
				local190.anInt9540 = 0;
				local190.aBoolean710 = false;
				local190.anInt9538 = -1;
				local190.anInt9537 = local182 + (local172 << 28) + (local178 << 14);
				local190.aBoolean711 = false;
				Static541.anIntArray602[Static215.anInt4264++] = local152;
				Static313.aByteArray52[local152] = 0;
			}
		}
		arg0.method2472();
	}
}
