import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_115 = new Class55("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "[Lclient!lu;")
	public static final Class150[] aClass150Array1 = new Class150[8];

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V")
	public static void method4301() {
		Static370.aClass103_1 = new Class103(8);
		Static5.anInt18 = 0;
		for (@Pc(17) Class28_Sub3 local17 = (Class28_Sub3) Static14.aClass169_1.method3598(); local17 != null; local17 = (Class28_Sub3) Static14.aClass169_1.method3597()) {
			local17.method3169();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!mh;II)V")
	public static void method4302(@OriginalArg(0) Class156 arg0, @OriginalArg(2) int arg1) {
		if (Static294.aBoolean305) {
			arg1 = 0;
			Static294.aBoolean305 = false;
		}
		if (Static34.aClass156_1 != null && Static34.aClass156_1.method3349(arg0)) {
			return;
		}
		Static34.aClass156_1 = arg0;
		Static188.aLong118 = Static158.method2342();
		Static139.anInt2671 = arg1;
		Static284.anInt870 = arg1;
		if (Static284.anInt870 == 0) {
			Static370.method4738();
			return;
		}
		Static254.anInt4290 = Static295.anInt4913;
		Static190.anInt3383 = Static427.anInt7140;
		Static203.aClass96_2 = Static147.aClass96_1;
		Static170.aFloat135 = Static360.aFloat167;
		Static172.aFloat91 = Static374.aFloat174;
		Static275.aFloat133 = Static431.aFloat214;
		Static298.aFloat146 = Static220.aFloat109;
		Static394.anInt6303 = Static312.anInt5171;
		Static329.aFloat156 = Static80.aFloat46;
		Static133.aFloat63 = Static203.aFloat103;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ec;I)I")
	public static int method4303(@OriginalArg(1) Class61 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method4306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg2 && arg7 == arg5 && arg0 == arg1 && arg4 == arg6) {
			Static197.method2829(arg8, arg4, arg2, arg1, arg7);
			return;
		}
		@Pc(36) int local36 = arg2;
		@Pc(38) int local38 = arg7;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(72) int local72 = local50 + arg1 - local58 - arg2;
		@Pc(82) int local82 = arg4 + local54 - local62 - arg7;
		@Pc(93) int local93 = local58 + local42 - local50 - local50;
		@Pc(103) int local103 = local62 + local46 - local54 - local54;
		@Pc(108) int local108 = local50 - local42;
		@Pc(113) int local113 = local54 - local46;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local129 * local72;
			@Pc(137) int local137 = local129 * local82;
			@Pc(141) int local141 = local123 * local93;
			@Pc(145) int local145 = local123 * local103;
			@Pc(149) int local149 = local108 * local115;
			@Pc(153) int local153 = local113 * local115;
			@Pc(163) int local163 = (local149 + local141 + local133 >> 12) + arg2;
			@Pc(175) int local175 = (local137 + local145 + local153 >> 12) + arg7;
			Static197.method2829(arg8, local175, local36, local163, local38);
			local36 = local163;
			local38 = local175;
		}
	}
}
