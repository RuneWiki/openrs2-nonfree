import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	public static int anInt3931;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1130 = Static181.method2795("Loaded config");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1131 = Static181.method2795(" ");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[100];

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public static int anInt3930 = 0;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1132 = Static181.method2795("welle2:");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1133 = Static181.method2795("Okay");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[50][];

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1134 = aClass83_1130;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1135 = aClass83_1131;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V")
	public static void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(11) int local11 = arg0; local11 <= arg2; local11++) {
			Static22.method438(arg3, arg1, arg4, Static14.anIntArrayArray18[local11]);
		}
	}
}
