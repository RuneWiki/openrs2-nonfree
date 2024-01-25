import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
	public static int anInt5918;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
	public static int anInt5920;

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_88 = new Class40("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!oh;ZILclient!pa;Lclient!ha;II)V")
	public static void method4921(@OriginalArg(0) int arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class87 arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static166.anInt3343 == 4) {
			local19 = (int) Static476.aFloat339 & 0x3FFF;
		} else {
			local19 = (int) Static476.aFloat339 + Static352.anInt6565 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg1.anInt6627 / 2, arg1.anInt6681 / 2) + 10;
		@Pc(46) int local46 = arg0 * arg0 + arg2 * arg2;
		if (local38 * local38 < local46) {
			return;
		}
		@Pc(60) int local60 = Class5_Sub2_Sub16.anIntArray411[local19];
		@Pc(64) int local64 = Class5_Sub2_Sub16.anIntArray410[local19];
		if (Static166.anInt3343 != 4) {
			local64 = local64 * 256 / (Static145.anInt3048 + 256);
			local60 = local60 * 256 / (Static145.anInt3048 + 256);
		}
		@Pc(99) int local99 = arg2 * local60 + local64 * arg0 >> 15;
		@Pc(109) int local109 = local64 * arg2 - local60 * arg0 >> 15;
		arg4.method6965(local99 + arg1.anInt6627 / 2 + arg5 - arg4.EA() / 2, -local109 + arg1.anInt6681 / 2 + arg6 + -(arg4.ma() / 2), arg3, arg5, arg6);
	}
}
