import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_120 = new Class85(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ij;ILclient!ij;)V")
	public static void method4834(@OriginalArg(0) Class93 arg0, @OriginalArg(2) Class93 arg1) {
		Static277.aClass93_107 = arg1;
		Static357.aClass93_140 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIIB)I")
	public static int method4835(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg1; local7++) {
			local5 = local5 >>> 8 ^ Class5_Sub18.anIntArray164[(local5 ^ arg0[local7]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	public static void method4837() {
		Static196.aClass109_44.method2850();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BILclient!ea;III)V")
	public static void method4838(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.method5258(arg4, arg0, arg2 + arg4, arg3 + arg0);
		arg1.method5254(arg2, -16777216, arg3, arg4, arg0);
		if (Static149.anInt2919 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static290.anInt2766 / (float) Static290.anInt2777;
		@Pc(35) int local35 = arg2;
		@Pc(37) int local37 = arg3;
		if (local33 < 1.0F) {
			local37 = (int) ((float) arg2 * local33);
		} else {
			local35 = (int) ((float) arg3 / local33);
		}
		@Pc(64) int local64 = arg0 + (arg3 - local37) / 2;
		@Pc(80) int local80 = arg4 + (arg2 - local35) / 2;
		if (Static73.aClass95_3 == null || arg2 != Static73.aClass95_3.method5503() || arg3 != Static73.aClass95_3.method5506()) {
			Static290.method2560(Static290.anInt2776, Static290.anInt2766 + Static290.anInt2772, Static290.anInt2776 - -Static290.anInt2777, Static290.anInt2772, local80, local64, local80 + local35, local64 - -local37);
			Static290.method2550(arg1);
			Static73.aClass95_3 = arg1.method5157(local80, local64, local35, local37, false);
		}
		Static73.aClass95_3.method5491(local80, local64);
		@Pc(133) int local133 = Static329.anInt6377 * local35 / Static290.anInt2777;
		@Pc(139) int local139 = Static217.anInt4330 * local37 / Static290.anInt2766;
		@Pc(147) int local147 = local80 + Static69.anInt1364 * local35 / Static290.anInt2777;
		@Pc(160) int local160 = local64 + local37 - local139 - Static62.anInt1095 * local37 / Static290.anInt2766;
		@Pc(162) int local162 = -1996554240;
		if (Static111.anInt2077 == 1) {
			local162 = -1996488705;
		}
		arg1.method5205(local147, local160, local133, local139, local162, 1);
		arg1.method5204(local147, local160, local133, local139, local162, 0);
		if (Static191.anInt3783 <= 0) {
			return;
		}
		@Pc(200) int local200;
		if (Static229.anInt4619 > 50) {
			local200 = 500 - Static229.anInt4619 * 5;
		} else {
			local200 = Static229.anInt4619 * 5;
		}
		for (@Pc(211) Class5_Sub32 local211 = (Class5_Sub32) Static290.aClass103_69.method2756(); local211 != null; local211 = (Class5_Sub32) Static290.aClass103_69.method2748()) {
			@Pc(218) Class215 local218 = Static252.method4463(local211.anInt5146);
			if (Static233.method4156(local218)) {
				@Pc(235) int local235;
				@Pc(248) int local248;
				if (Static320.anInt6195 == local211.anInt5146) {
					local235 = local80 + local35 * local211.anInt5145 / Static290.anInt2777;
					local248 = local64 + (Static290.anInt2766 - local211.anInt5143) * local37 / Static290.anInt2766;
					arg1.method5254(4, local200 << 24 | 0xFFFF00, 4, local235 - 2, local248 - 2);
				} else if (Static73.anInt1412 != -1 && Static73.anInt1412 == local218.anInt6774) {
					local235 = local80 + local35 * local211.anInt5145 / Static290.anInt2777;
					local248 = (Static290.anInt2766 - local211.anInt5143) * local37 / Static290.anInt2766 + local64;
					arg1.method5254(4, local200 << 24 | 0xFFFF00, 4, local235 - 2, local248 + -2);
				}
			}
		}
	}
}
