import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!fda;[[BZ)V")
	public static void method2308(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(27) byte[] local27 = arg1[local21];
			if (local27 != null) {
				@Pc(34) Class3_Sub27 local34 = new Class3_Sub27(local27);
				local40 = Static467.anIntArray715[local21] >> 8;
				@Pc(46) int local46 = Static467.anIntArray715[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static223.anInt4827;
				@Pc(59) int local59 = local46 * 64 - Static150.anInt3027;
				Static442.method6680();
				arg0.method2283(Static150.anInt3027, Static95.aClass306Array1, local59, Static223.anInt4827, local34, local53);
				arg0.method2290(local12, local53, local59, Static121.aClass5_7, local34);
				if (!arg0.aBoolean202 && local40 == Static429.anInt7899 / 8 && local46 == Static34.anInt888 / 8 && local12[0] != -1) {
					Static87.aClass178_1 = Static443.aClass72_1.method2107(local12[0], Static144.aClass274_1, local12[1], local12[3], local12[2]);
					Static500.anInt8793 = local12[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local15; local127++) {
			@Pc(140) int local140 = (Static467.anIntArray715[local127] >> 8) * 64 - Static223.anInt4827;
			local40 = (Static467.anIntArray715[local127] & 0xFF) * 64 - Static150.anInt3027;
			@Pc(154) byte[] local154 = arg1[local127];
			if (local154 == null && Static34.anInt888 < 800) {
				Static442.method6680();
				arg0.method2286(local140, local40);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIB)V")
	public static void method2311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class92 local13 = Static313.aClass92ArrayArray1[arg0][arg1];
		if (local13 != null) {
			Static190.anInt4325 = local13.anInt2893;
			Static265.anInt5514 = local13.anInt2894;
			Static421.anInt7832 = local13.anInt2890;
		}
		Static192.method3683();
	}
}
