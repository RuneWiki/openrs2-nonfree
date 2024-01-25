import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!kb;")
	public static Class143 aClass143_5;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	public static int anInt2796 = 0;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_45 = new Class15("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
	public static int anInt2800 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZI)Z")
	public static boolean method2158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IF)F")
	public static float method2164(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg8 && arg4 == arg7 && arg3 == arg0 && arg5 == arg6) {
			Static444.method5920(arg6, arg4, arg1, arg0, arg2);
			return;
		}
		@Pc(27) int local27 = arg1;
		@Pc(29) int local29 = arg4;
		@Pc(33) int local33 = arg1 * 3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(62) int local62 = arg0 + local41 - local49 - arg1;
		@Pc(70) int local70 = arg6 + local45 - local53 - arg4;
		@Pc(81) int local81 = local49 + local33 - local41 - local41;
		@Pc(91) int local91 = local53 + local37 - local45 - local45;
		@Pc(96) int local96 = local41 - local33;
		@Pc(101) int local101 = local45 - local37;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local103 * local111 >> 12;
			@Pc(121) int local121 = local62 * local117;
			@Pc(125) int local125 = local70 * local117;
			@Pc(129) int local129 = local111 * local81;
			@Pc(133) int local133 = local91 * local111;
			@Pc(137) int local137 = local103 * local96;
			@Pc(141) int local141 = local101 * local103;
			@Pc(151) int local151 = arg1 + (local137 + local121 + local129 >> 12);
			@Pc(161) int local161 = (local141 + local133 + local125 >> 12) + arg4;
			Static444.method5920(local161, local29, local27, local151, arg2);
			local27 = local151;
			local29 = local161;
		}
	}
}
