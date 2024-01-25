import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "[Lclient!oa;")
	public static Class184_Sub1[] aClass184_Sub1Array3;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
	public static int anInt5902;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Lclient!uf;")
	public static Class242 aClass242_3;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_97 = new Class231("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)V")
	public static void method4958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class125 local13 = Static78.aClass125ArrayArray1[arg2][arg1];
		Static74.method118(local13 == null ? Static350.aClass125_2 : local13, arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)I")
	public static int method4959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 >>> 24;
		@Pc(22) int local22 = 255 - local17;
		@Pc(40) int local40 = (local17 * (arg1 & 0xFF00) & 0xFF0000 | local17 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00) * local22 & 0xFF0000 | (arg0 & 0xFF00FF) * local22 & 0xFF00FF00) >>> 8) + local40;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V")
	public static void method4961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static8.aClass173_Sub1_1.anInt4406 != 0 && arg1 != 0 && Static117.anInt2050 < 50 && arg0 != -1) {
			Static127.aClass197Array1[Static117.anInt2050++] = new Class197((byte) 1, arg0, arg1, arg2, arg4, arg3);
		}
	}
}
