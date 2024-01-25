import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lclient!nd;")
	public static Class9_Sub3_Sub2_Sub1[] aClass9_Sub3_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt6328 = 0;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public static int anInt6329 = -50;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Z")
	public static boolean method5463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static171.method2838(arg0, arg1) || Static505.method7347(arg1, arg0);
	}
}
