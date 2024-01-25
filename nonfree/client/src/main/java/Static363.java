import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	public static int anInt6280;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[I")
	public static final int[] anIntArray409 = new int[1024];

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_109 = new Class145(48, 3);

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
	public static boolean method5407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFIIF)F")
	public static float method5408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg3 - arg6;
		@Pc(15) float local15 = arg1 - arg0;
		@Pc(20) float local20 = arg2 - arg4;
		@Pc(27) float local27 = 0.0F;
		@Pc(29) float local29 = 0.0F;
		@Pc(31) float local31 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(39) float local39 = local11 * local7 + arg6;
			@Pc(45) float local45 = local7 * local15 + arg0;
			@Pc(51) float local51 = local20 * local7 + arg4;
			@Pc(56) int local56 = (int) local39 >> 9;
			@Pc(61) int local61 = (int) local51 >> 9;
			if (local56 > 0 && local61 > 0 && local56 < Static456.anInt7428 && Static5.anInt112 > local61) {
				@Pc(77) int local77 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109;
				if (local77 < 3 && (Static372.aByteArrayArrayArray3[1][local56][local61] & 0x2) != 0) {
					local77++;
				}
				@Pc(101) int local101 = Static124.aClass91Array1[local77].method7446((int) local39, (int) local51);
				if ((float) local101 < local45) {
					if (arg5 >= 2) {
						return local7 + method5408(local29, local45, local51, local39, local31, arg5 + -1, local27) * 0.1F - 0.1F;
					}
					return local7;
				}
			}
			local7 += 0.1F;
			local29 = local45;
			local31 = local51;
			local27 = local39;
		}
		return -1.0F;
	}
}
