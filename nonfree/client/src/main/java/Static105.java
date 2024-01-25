import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	public static int anInt8047 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!mw;)V")
	public static void method6465(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		arg0.method4996();
		@Pc(10) int local10 = Static310.anInt5693;
		@Pc(20) Class11_Sub1_Sub1_Sub3_Sub1 local20 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local10] = new Class11_Sub1_Sub1_Sub3_Sub1();
		local20.anInt7524 = local10;
		@Pc(28) int local28 = arg0.method4994(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray455[0] = local39 - Static539.anInt9045;
		local20.anInt8902 = (local20.anIntArray455[0] << 9) + (local20.method6058() << 8);
		local20.anIntArray454[0] = local43 - Static311.anInt5708;
		local20.anInt8906 = (local20.anIntArray454[0] << 9) + (local20.method6058() << 8);
		Static240.anInt4414 = local20.aByte113 = local20.aByte112 = local33;
		if (Static34.method641(local20.anIntArray455[0], local20.anIntArray454[0])) {
			local20.aByte112++;
		}
		if (Static351.aClass1_Sub3Array1[local10] != null) {
			local20.method2957(Static351.aClass1_Sub3Array1[local10]);
		}
		Static75.anInt1461 = 0;
		Static167.anIntArray145[Static75.anInt1461++] = local10;
		Static344.aByteArray65[local10] = 0;
		Static525.anInt8937 = 0;
		for (@Pc(145) int local145 = 1; local145 < 2048; local145++) {
			if (local145 != local10) {
				@Pc(155) int local155 = arg0.method4994(18);
				@Pc(159) int local159 = local155 >> 16;
				@Pc(165) int local165 = local155 >> 8 & 0xFF;
				@Pc(169) int local169 = local155 & 0xFF;
				@Pc(177) Class66 local177 = Static459.aClass66Array1[local145] = new Class66();
				local177.anInt1756 = (local159 << 28) + (local165 << 14) + local169;
				local177.anInt1755 = 0;
				local177.aBoolean115 = false;
				local177.anInt1754 = -1;
				Static547.anIntArray578[Static525.anInt8937++] = local145;
				Static344.aByteArray65[local145] = 0;
			}
		}
		arg0.method4997();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)Z")
	public static boolean method6466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ba;III)V")
	public static void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.aClass1_Sub3_Sub1_1.method7936(arg3);
		arg1.aClass1_Sub3_Sub1_1.method7937(arg2);
		arg1.aClass1_Sub3_Sub1_1.method7912(arg0);
	}
}
