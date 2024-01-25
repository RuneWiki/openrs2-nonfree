import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static389 {

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
	public static int anInt409;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "S")
	public static short aShort2 = 32767;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)Z")
	public static boolean method377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static432.method6082(arg1, arg0) || Static321.method4673(arg0, arg1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!i;)V")
	public static void method380(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1) {
		Static68.aClass34Array1[arg0] = arg1;
	}
}
