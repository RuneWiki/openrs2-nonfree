import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_10 = new Class201(11, 0, 1, 2);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ag;)V")
	public static void method1288(@OriginalArg(1) Class12_Sub1 arg0) {
		@Pc(20) byte[] local20;
		if (Static546.anObject21 == null) {
			@Pc(13) Class6_Sub2_Sub2 local13 = new Class6_Sub2_Sub2();
			local20 = local13.method6634();
			Static546.anObject21 = Static183.method3216(local20);
		}
		if (Static120.anObject4 == null) {
			@Pc(31) Class6_Sub1_Sub1 local31 = new Class6_Sub1_Sub1();
			local20 = local31.method4554();
			Static120.anObject4 = Static183.method3216(local20);
		}
		@Pc(46) Class359 local46 = arg0.aClass359_1;
		if (local46.method7838() && Static387.anObject13 == null) {
			local20 = Static449.method6371(0.6F, 4.0F, new Class130_Sub1(419684), 0.5F, 16.0F, 4.0F);
			Static387.anObject13 = Static183.method3216(local20);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!jd;B)V")
	public static void method1290(@OriginalArg(0) Class1_Sub20_Sub1 arg0) {
		arg0.method3927();
		@Pc(15) int local15 = Static594.anInt9653;
		@Pc(25) Class20_Sub2_Sub4_Sub1_Sub1 local25 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local15] = new Class20_Sub2_Sub4_Sub1_Sub1();
		local25.anInt6407 = local15;
		@Pc(33) int local33 = arg0.method3924(30);
		@Pc(38) byte local38 = (byte) (local33 >> 28);
		@Pc(44) int local44 = local33 >> 14 & 0x3FFF;
		@Pc(48) int local48 = local33 & 0x3FFF;
		local25.anIntArray437[0] = local44 - Static376.anInt6631;
		local25.anInt8796 = (local25.anIntArray437[0] << 9) + (local25.method5349() << 8);
		local25.anIntArray436[0] = local48 - Static24.anInt674;
		local25.anInt8795 = (local25.anIntArray436[0] << 9) + (local25.method5349() << 8);
		Static240.anInt4595 = local25.aByte116 = local25.aByte117 = local38;
		if (Static70.method1506(local25.anIntArray436[0], local25.anIntArray437[0])) {
			local25.aByte117++;
		}
		if (Static137.aClass1_Sub20Array1[local15] != null) {
			local25.method4152(Static137.aClass1_Sub20Array1[local15]);
		}
		Static60.anInt1505 = 0;
		Static346.anIntArray413[Static60.anInt1505++] = local15;
		Static436.aByteArray80[local15] = 0;
		Static167.anInt3037 = 0;
		for (@Pc(149) int local149 = 1; local149 < 2048; local149++) {
			if (local15 != local149) {
				@Pc(159) int local159 = arg0.method3924(18);
				@Pc(163) int local163 = local159 >> 16;
				@Pc(169) int local169 = local159 >> 8 & 0xFF;
				@Pc(173) int local173 = local159 & 0xFF;
				@Pc(181) Class228 local181 = Static496.aClass228Array1[local149] = new Class228();
				local181.aBoolean442 = false;
				local181.anInt6256 = (local169 << 14) + ((local163 << 28) + local173);
				local181.anInt6253 = -1;
				local181.anInt6257 = 0;
				Static244.anIntArray281[Static167.anInt3037++] = local149;
				Static436.aByteArray80[local149] = 0;
			}
		}
		arg0.method3932();
	}
}
