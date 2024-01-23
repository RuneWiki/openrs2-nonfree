import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Lclient!gi;")
	public static Class39 aClass39_7;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "[I")
	public static int[] anIntArray472 = new int[32];

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "Lclient!id;")
	public static Class43 aClass43_23 = new Class43(64);

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	public static int anInt4573 = 0;

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_1224 = Static184.method2923("<col=80ff00>");

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_1225 = Static184.method2923(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "Lclient!i;")
	private static Class41 aClass41_1227 = Static184.method2923("Take");

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_1226 = aClass41_1227;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI[BI)I")
	public static int method3165(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local3 = local3 >>> 8 ^ Class2_Sub26.anIntArray450[(local3 ^ arg1[local9]) & 0xFF];
		}
		return ~local3;
	}
}
