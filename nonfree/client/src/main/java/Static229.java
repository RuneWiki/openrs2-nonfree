import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!nl", name = "S", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!nl", name = "R", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_160 = new Class62("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_67 = new Class183(25, -1);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg5 && arg2 == arg6 && arg3 == arg0 && arg4 == arg7) {
			Static114.method2038(arg0, arg7, arg8, arg5, arg2);
			return;
		}
		@Pc(27) int local27 = arg5;
		@Pc(29) int local29 = arg2;
		@Pc(33) int local33 = arg5 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(62) int local62 = local41 + arg0 - local49 - arg5;
		@Pc(72) int local72 = arg7 + local45 - local53 - arg2;
		@Pc(82) int local82 = local33 + local49 - local41 - local41;
		@Pc(93) int local93 = local53 + local37 - local45 - local45;
		@Pc(98) int local98 = local41 - local33;
		@Pc(102) int local102 = local45 - local37;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local104 * local112 >> 12;
			@Pc(122) int local122 = local62 * local118;
			@Pc(126) int local126 = local72 * local118;
			@Pc(130) int local130 = local82 * local112;
			@Pc(134) int local134 = local93 * local112;
			@Pc(138) int local138 = local104 * local98;
			@Pc(142) int local142 = local102 * local104;
			@Pc(152) int local152 = arg5 + (local138 + local130 + local122 >> 12);
			@Pc(162) int local162 = (local134 + local126 + local142 >> 12) + arg2;
			Static114.method2038(local152, local162, arg8, local27, local29);
			local29 = local162;
			local27 = local152;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)Z")
	public static boolean method4164() {
		if (Static271.aBoolean375) {
			try {
				Static406.method5995(Static154.aClass123_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}
