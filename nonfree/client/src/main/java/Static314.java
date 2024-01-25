import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Lclient!f;")
	public static Class3 aClass3_15;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	public static int anInt5624;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)Z")
	public static boolean method4329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static433.method5558(arg0, arg1) & Static158.method2335(arg0, arg1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBI)Z")
	public static boolean method4330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
