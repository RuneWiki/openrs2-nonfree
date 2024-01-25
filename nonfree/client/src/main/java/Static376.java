import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "Lclient!vea;")
	public static Class2_Sub7_Sub21 aClass2_Sub7_Sub21_4;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
	public static int anInt6481 = 0;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
	public static final int[] anIntArray420 = new int[3];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ei;I)V")
	public static void method5579(@OriginalArg(0) Class2_Sub17_Sub1 arg0) {
		arg0.method2461();
		@Pc(10) int local10 = Static608.anInt10056;
		@Pc(20) Class16_Sub1_Sub1_Sub3_Sub2 local20 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local10] = new Class16_Sub1_Sub1_Sub3_Sub2();
		local20.anInt8075 = local10;
		@Pc(28) int local28 = arg0.method2456(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray595[0] = local39 - Static406.anInt6899;
		local20.anInt8037 = (local20.anIntArray595[0] << 9) + (local20.method6999() << 8);
		local20.anIntArray594[0] = local43 - Static338.anInt5885;
		local20.anInt8034 = (local20.anIntArray594[0] << 9) + (local20.method6999() << 8);
		Static531.anInt8550 = local20.aByte109 = local20.aByte108 = local33;
		if (Static481.method6813(local20.anIntArray594[0], local20.anIntArray595[0])) {
			local20.aByte108++;
		}
		if (Static365.aClass2_Sub17Array1[local10] != null) {
			local20.method7023(Static365.aClass2_Sub17Array1[local10]);
		}
		Static649.anInt10495 = 0;
		Static426.anIntArray476[Static649.anInt10495++] = local10;
		Static306.aByteArray45[local10] = 0;
		Static277.anInt5108 = 0;
		for (@Pc(145) int local145 = 1; local145 < 2048; local145++) {
			if (local145 != local10) {
				@Pc(159) int local159 = arg0.method2456(18);
				@Pc(163) int local163 = local159 >> 16;
				@Pc(169) int local169 = local159 >> 8 & 0xFF;
				@Pc(173) int local173 = local159 & 0xFF;
				@Pc(181) Class122 local181 = Static44.aClass122Array1[local145] = new Class122();
				local181.anInt3504 = 0;
				local181.anInt3507 = local173 + (local163 << 28) + (local169 << 14);
				local181.anInt3503 = -1;
				local181.aBoolean269 = false;
				Static292.anIntArray335[Static277.anInt5108++] = local145;
				Static306.aByteArray45[local145] = 0;
			}
		}
		arg0.method2455();
	}
}
