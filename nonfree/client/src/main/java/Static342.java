import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array13;

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
	public static final int anInt5893 = 1407;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
	public static final int[] anIntArray412 = new int[1024];

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[5];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static112.method2030(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static231.anInt4434;
			@Pc(14) int local14 = arg2 << Static231.anInt4434;
			return Static299.method4088(local10 + 1, Static417.aClass65Array4[arg0].l(arg1, arg2) + arg3, local14 + 1) && Static299.method4088(local10 + Static4.anInt5935 - 1, Static417.aClass65Array4[arg0].l(arg1 + 1, arg2) + arg3, local14 + 1) && Static299.method4088(local10 + Static4.anInt5935 - 1, Static417.aClass65Array4[arg0].l(arg1 + 1, arg2 + 1) + arg3, local14 + Static4.anInt5935 - 1) && Static299.method4088(local10 + 1, Static417.aClass65Array4[arg0].l(arg1, arg2 + 1) + arg3, local14 + Static4.anInt5935 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIII)I")
	public static int method4632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg1;
		return ((local31 * (arg2 & 0xFF00) & 0xFF0000 | local31 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local26;
	}
}
