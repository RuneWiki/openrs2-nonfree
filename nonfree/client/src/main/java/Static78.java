import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Lclient!qp;")
	public static Class195 aClass195_2;

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBII)I")
	public static int method1354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = (arg1 & 0x7F) * arg0 + (arg2 & 0x7F) * local17 >> 7;
		@Pc(45) int local45 = (arg2 & 0x380) * local17 + arg0 * (arg1 & 0x380) >> 7;
		@Pc(59) int local59 = local17 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local45 & 0x380 | local59 & 0xFC00 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void method1355(@OriginalArg(0) Class2_Sub24_Sub2 arg0) {
		arg0.method5792();
		@Pc(10) int local10 = Static93.anInt1976;
		@Pc(20) Class1_Sub2_Sub1_Sub1 local20 = Static182.aClass1_Sub2_Sub1_Sub1_1 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local10] = new Class1_Sub2_Sub1_Sub1();
		local20.anInt5374 = local10;
		@Pc(28) int local28 = arg0.method5793(30);
		@Pc(38) byte local38 = (byte) (local28 >> 28);
		@Pc(44) int local44 = local28 >> 14 & 0x3FFF;
		local20.anIntArray466[0] = local44 - Static279.anInt5198;
		@Pc(56) int local56 = local28 & 0x3FFF;
		local20.anInt6800 = (local20.anIntArray466[0] << 7) + (local20.method4792() << 6);
		local20.anIntArray465[0] = local56 - Static350.anInt6470;
		local20.anInt6798 = (local20.anIntArray465[0] << 7) + (local20.method4792() << 6);
		Static241.anInt2711 = local20.aByte73 = local38;
		if (Static287.aClass2_Sub24Array1[local10] != null) {
			local20.method699(Static287.aClass2_Sub24Array1[local10]);
		}
		Static97.anInt2139 = 0;
		Static321.anIntArray512[Static97.anInt2139++] = local10;
		Static154.aByteArray37[local10] = 0;
		Static345.anInt6348 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local10 != local127) {
				@Pc(137) int local137 = arg0.method5793(18);
				@Pc(141) int local141 = local137 >> 16;
				@Pc(147) int local147 = local137 >> 8 & 0xFF;
				@Pc(151) int local151 = local137 & 0xFF;
				Static249.anIntArray396[local127] = local151 + (local147 << 14) + (local141 << 28);
				Static243.anIntArray393[local127] = 0;
				Static53.anIntArray84[local127] = -1;
				Static134.anIntArray224[Static345.anInt6348++] = local127;
				Static154.aByteArray37[local127] = 0;
			}
		}
		arg0.method5782();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ph;III[Z)Z")
	public static boolean method1356(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static128.aClass149Array1 != Static248.aClass149Array3) {
			@Pc(11) int local11 = Static210.aClass149Array5[arg1].method5839(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class149 local18 = Static210.aClass149Array5[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5839(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5841(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5832(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
	public static void method1357() {
		Static180.aClass12_1 = new Class12(8);
		Static345.anInt6353 = 0;
		for (@Pc(25) Class7_Sub3 local25 = (Class7_Sub3) Static228.aClass199_4.method4896(); local25 != null; local25 = (Class7_Sub3) Static228.aClass199_4.method4902()) {
			local25.method527();
		}
	}
}
