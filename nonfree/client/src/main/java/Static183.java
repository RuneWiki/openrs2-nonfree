import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "Lclient!ks;")
	public static final Class209 aClass209_4 = new Class209("", 10);

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!iw;I)V")
	public static void method3164(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		arg0.method3701();
		@Pc(10) int local10 = Static177.anInt2910;
		@Pc(20) Class41_Sub1_Sub1_Sub3_Sub2 local20 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local10] = new Class41_Sub1_Sub1_Sub3_Sub2();
		local20.anInt9469 = local10;
		@Pc(28) int local28 = arg0.method3702(30);
		@Pc(38) byte local38 = (byte) (local28 >> 28);
		@Pc(44) int local44 = local28 >> 14 & 0x3FFF;
		local20.anIntArray528[0] = local44 - Static454.anInt7910;
		@Pc(56) int local56 = local28 & 0x3FFF;
		local20.anInt10366 = (local20.anIntArray528[0] << 9) + (local20.method7917() << 8);
		local20.anIntArray527[0] = local56 - Static48.anInt750;
		local20.anInt10367 = (local20.anIntArray527[0] << 9) + (local20.method7917() << 8);
		Static458.anInt7955 = local20.aByte149 = local20.aByte150 = local38;
		if (Static488.method7149(local20.anIntArray528[0], local20.anIntArray527[0])) {
			local20.aByte150++;
		}
		if (Static628.aClass5_Sub15Array1[local10] != null) {
			local20.method7944(Static628.aClass5_Sub15Array1[local10]);
		}
		Static72.anInt9084 = 0;
		Static388.anIntArray381[Static72.anInt9084++] = local10;
		Static291.aByteArray110[local10] = 0;
		Static28.anInt389 = 0;
		for (@Pc(146) int local146 = 1; local146 < 2048; local146++) {
			if (local10 != local146) {
				@Pc(160) int local160 = arg0.method3702(18);
				@Pc(164) int local164 = local160 >> 16;
				@Pc(170) int local170 = local160 >> 8 & 0xFF;
				@Pc(174) int local174 = local160 & 0xFF;
				@Pc(182) Class177 local182 = Static105.aClass177Array1[local146] = new Class177();
				local182.anInt4235 = 0;
				local182.anInt4236 = -1;
				local182.aBoolean282 = false;
				local182.anInt4233 = local174 + (local164 << 28) + (local170 << 14);
				local182.aBoolean283 = false;
				Static670.anIntArray612[Static28.anInt389++] = local146;
				Static291.aByteArray110[local146] = 0;
			}
		}
		arg0.method3710();
	}
}
