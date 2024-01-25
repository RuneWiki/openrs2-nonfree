import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public static int anInt1109;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_40 = new Class151("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!d", name = "I", descriptor = "I")
	public static int anInt1112 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)Z")
	public static boolean method968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	public static void method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static77.anInt1449 == 1) {
			Static27.aClass49Array26[Static426.anInt6943 / 100].method5636(Static168.anInt2765 - 8, Static154.anInt5699 + -8);
		}
		if (Static77.anInt1449 == 2) {
			Static27.aClass49Array26[Static426.anInt6943 / 100 + 4].method5636(Static168.anInt2765 - 8, Static154.anInt5699 + -8);
		}
		Static165.method4636();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!kn;Lclient!oq;IILclient!se;BII)V")
	public static void method970(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class20_Sub3_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub3_Sub3_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class1_Sub42 local9 = new Class1_Sub42();
		local9.anInt6732 = arg3 << 7;
		local9.anInt6733 = arg5 << 7;
		local9.anInt6731 = arg6;
		if (arg0 != null) {
			local9.aClass141_1 = arg0;
			@Pc(142) int local142 = arg0.anInt3423;
			@Pc(145) int local145 = arg0.anInt3403;
			if (arg2 == 1 || arg2 == 3) {
				local142 = arg0.anInt3403;
				local145 = arg0.anInt3423;
			}
			local9.anInt6729 = arg0.anInt3425;
			local9.anInt6723 = arg0.anInt3402 << 7;
			local9.anInt6734 = arg0.anInt3384;
			local9.anInt6721 = arg5 + local142 << 7;
			local9.anInt6728 = arg3 + local145 << 7;
			local9.anInt6724 = arg0.anInt3385;
			local9.anInt6722 = arg0.anInt3406;
			local9.anIntArray449 = arg0.anIntArray186;
			if (arg0.anIntArray184 != null) {
				local9.aBoolean550 = true;
				local9.method5165();
			}
			if (local9.anIntArray449 != null) {
				local9.anInt6730 = (int) (Math.random() * (double) (local9.anInt6722 - local9.anInt6724)) + local9.anInt6724;
			}
			Static335.aClass254_40.method5430(local9);
		} else if (arg4 != null) {
			local9.aClass20_Sub3_Sub3_Sub2_1 = arg4;
			@Pc(84) Class246 local84 = arg4.aClass246_1;
			if (local84.anIntArray459 != null) {
				local9.aBoolean550 = true;
				local84 = local84.method5255(Static364.aClass259_1);
			}
			if (local84 != null) {
				local9.anInt6728 = local84.anInt6830 + arg3 << 7;
				local9.anInt6721 = local84.anInt6830 + arg5 << 7;
				local9.anInt6729 = Static254.method3259(arg4);
				local9.anInt6734 = local84.anInt6860;
				local9.anInt6723 = local84.anInt6852 << 7;
			}
			Static24.aClass254_3.method5430(local9);
		} else if (arg1 != null) {
			local9.aClass20_Sub3_Sub3_Sub1_2 = arg1;
			local9.anInt6721 = arg5 + arg1.method4678() << 7;
			local9.anInt6728 = arg3 + arg1.method4678() << 7;
			local9.anInt6729 = Static117.method1606(arg1);
			local9.anInt6734 = arg1.anInt4963;
			local9.anInt6723 = arg1.anInt4953 << 7;
			Static374.aClass257_29.method5504(local9, (long) arg1.anInt6045);
		}
	}
}
