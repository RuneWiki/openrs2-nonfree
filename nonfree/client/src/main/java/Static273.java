import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public static int anInt5444 = -1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZI)Z")
	public static boolean method4587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4596(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static332.method5312(Static458.aClass77_80);
		Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(arg0) + 1);
		Static383.aClass12_Sub8_Sub2_1.method5178(arg1);
		Static383.aClass12_Sub8_Sub2_1.method5180(arg0);
	}
}
