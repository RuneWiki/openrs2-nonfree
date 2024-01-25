import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!uda", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!uda", name = "o", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!uda", name = "s", descriptor = "Z")
	public static boolean aBoolean503;

	@OriginalMember(owner = "client!uda", name = "v", descriptor = "J")
	public static long aLong147;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "[Lclient!ij;")
	public static final Class153[] aClass153Array6 = new Class153[2048];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method5612(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class61 local9 = Static237.aClass61Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static237.aClass61Array1[local11] = Static237.aClass61Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class61(arg0, arg7, arg2, arg1, arg6, arg5, arg4, arg3);
		} else {
			local9.method1706(arg0, arg5, arg6, arg1, arg3, arg2, arg4, arg7);
		}
		Static374.anInt7028 = Static32.anInt1035;
		Static237.aClass61Array1[0] = local9;
		Static127.anInt2829++;
	}
}
