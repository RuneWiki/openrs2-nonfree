import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kia", name = "p", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
	public static int anInt4876;

	@OriginalMember(owner = "client!kia", name = "u", descriptor = "Lclient!hu;")
	public static Class157 aClass157_5;

	@OriginalMember(owner = "client!kia", name = "v", descriptor = "Lclient!tf;")
	public static Class17 aClass17_46;

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_111 = new Class151(52, 3);

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!es;Z)V")
	public static void method4346(@OriginalArg(0) Class4_Sub11 arg0) {
		if (arg0.aByteArray107.length - arg0.anInt10466 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method8865();
		if (local24 < 0 || local24 > 1 || arg0.aByteArray107.length - arg0.anInt10466 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method8859();
		if (local49 * 6 > arg0.aByteArray107.length - arg0.anInt10466) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local49; local66++) {
			@Pc(72) int local72 = arg0.method8859();
			@Pc(76) int local76 = arg0.method8850();
			if (local72 < Static509.anIntArray546.length && Static51.aBooleanArray3[local72] && (Static189.aClass376_1.method8472(local72).aChar1 != '1' || local76 >= -1 && local76 <= 1)) {
				Static509.anIntArray546[local72] = local76;
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z")
	public static boolean method4348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static481.method6598(arg0, arg1) || Static638.method8538(arg1, arg0) || Static299.method4205(arg1, arg0);
	}
}
