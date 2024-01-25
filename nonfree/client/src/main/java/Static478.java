import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "J")
	public static long aLong261;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "J")
	public static long aLong260 = -1L;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public static int anInt8119 = -1;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public static void method7148() {
		@Pc(8) Class6_Sub15_Sub1 local8 = Static525.aClass260_4.aClass6_Sub15_Sub1_2;
		while (local8.method2477(Static525.aClass260_4.anInt7198) >= 15) {
			@Pc(20) int local20 = local8.method2468(15);
			if (local20 == 32767) {
				break;
			}
			@Pc(27) boolean local27 = false;
			@Pc(34) Class6_Sub11 local34 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local20);
			@Pc(40) Class60_Sub1_Sub1_Sub3_Sub2 local40;
			if (local34 == null) {
				local40 = new Class60_Sub1_Sub1_Sub3_Sub2();
				local40.anInt4845 = local20;
				local34 = new Class6_Sub11(local40);
				Static419.aClass74_45.method1399(local34, (long) local20);
				Static216.aClass6_Sub11Array1[Static251.anInt4781++] = local34;
				local27 = true;
			}
			local40 = local34.aClass60_Sub1_Sub1_Sub3_Sub2_1;
			Static531.anIntArray580[Static201.anInt4069++] = local20;
			local40.anInt4866 = Static49.anInt596;
			if (local40.aClass294_1 != null && local40.aClass294_1.method7159((byte) -71)) {
				Static85.method1252(local40);
			}
			@Pc(98) int local98 = local8.method2468(5);
			if (local98 > 15) {
				local98 -= 32;
			}
			@Pc(111) int local111 = local8.method2468(1);
			@Pc(116) int local116 = local8.method2468(1);
			if (local116 == 1) {
				Static610.anIntArray630[Static563.anInt9103++] = local20;
			}
			@Pc(134) int local134 = local8.method2468(2);
			local40.method4435(Static221.aClass164_1.method4157(local8.method2468(14)));
			@Pc(149) int local149 = local8.method2468(5);
			if (local149 > 15) {
				local149 -= 32;
			}
			@Pc(166) int local166 = local8.method2468(3) + 4 << 11 & 0x3CED;
			local40.method4432(local40.aClass294_1.anInt8169);
			local40.anInt4865 = local40.aClass294_1.anInt8162 << 3;
			if (local27) {
				local40.method4423(true, local166);
			}
			local40.method4440(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] + local98, local40.method4424((byte) -28), local111 == 1, local149 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0], local134);
			if (local40.aClass294_1.method7159((byte) -114)) {
				Static268.method4558((Class60_Sub1_Sub1_Sub3_Sub1) null, local40.anIntArray264[0], 0, local40.anIntArray263[0], local40, (Class125) null, local40.aByte135);
			}
		}
		local8.method2472();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
	public static void method7149(@OriginalArg(1) int arg0) {
		Static248.method4319();
		@Pc(11) int local11 = Static469.aClass47_1.method679(arg0).anInt10261;
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static303.aClass55_2.anIntArray73[arg0];
		if (local11 == 5) {
			Static76.anInt1069 = local23;
		}
		if (local11 == 6) {
			Static583.anInt9304 = local23;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public static void method7150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static398.anInt6878 = 0;
		Static605.anInt9561 = 0;
		Static223.anInt4380 = arg0;
		Static8.anInt136 = arg1;
	}
}
