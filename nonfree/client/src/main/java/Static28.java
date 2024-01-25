import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public static int anInt562;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "Lclient!ic;")
	public static Class113 aClass113_11;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
	public static final int[] anIntArray31 = new int[500];

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_37 = new Class137(32, -1);

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	public static int anInt564 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method501(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static71.anIntArray60[local15] = Static71.anIntArray60[local15 - 1];
			Static150.anIntArray127[local15] = Static150.anIntArray127[local15 - 1];
			Static265.aStringArray32[local15] = Static265.aStringArray32[local15 - 1];
			Static406.aStringArray51[local15] = Static406.aStringArray51[local15 - 1];
			Static321.aStringArray38[local15] = Static321.aStringArray38[local15 - 1];
			Static71.aStringArray9[local15] = Static71.aStringArray9[local15 - 1];
			Static263.anIntArray223[local15] = Static263.anIntArray223[local15 - 1];
		}
		Static71.anIntArray60[0] = arg1;
		Static150.anIntArray127[0] = arg6;
		Static265.aStringArray32[0] = arg4;
		Static406.aStringArray51[0] = arg3;
		Static321.aStringArray38[0] = arg0;
		Static71.aStringArray9[0] = arg2;
		Static101.anInt6647++;
		Static263.anIntArray223[0] = arg5;
		Static167.anInt2743 = Static443.anInt6230;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZB)V")
	public static void method503(@OriginalArg(0) boolean arg0) {
		Static201.method2762(arg0, Static126.anInt2202, Static169.anInt2522, Static92.anInt1618);
	}
}
