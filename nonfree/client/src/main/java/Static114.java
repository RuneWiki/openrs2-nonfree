import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "Lclient!nm;")
	public static Class119 aClass119_43;

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
	public static int anInt2344;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
	public static int anInt2343 = 0;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString80 = "glow1:";

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)Lclient!nk;")
	public static Class1_Sub5_Sub15 method2082(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub5_Sub15 local10 = (Class1_Sub5_Sub15) Static66.aClass112_4.method2951((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static315.aClass119_97.method3235(Static4.method85(arg0), Static189.method3249(arg0));
		local10 = new Class1_Sub5_Sub15();
		if (local25 != null) {
			local10.method3180(new Class1_Sub13(local25));
		}
		Static66.aClass112_4.method2950((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!nm;II)Z")
	public static boolean method2083(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) byte[] local19 = arg1.method3235(arg2, arg0);
		if (local19 == null) {
			return false;
		} else {
			Static56.method1017(local19);
			return true;
		}
	}
}
