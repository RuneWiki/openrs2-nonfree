import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static638 {

	@OriginalMember(owner = "client!vk", name = "Vc", descriptor = "Lclient!nj;")
	public static Class64 aClass64_4;

	@OriginalMember(owner = "client!vk", name = "sd", descriptor = "I")
	public static int anInt10024;

	@OriginalMember(owner = "client!vk", name = "yd", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array18;

	@OriginalMember(owner = "client!vk", name = "dd", descriptor = "Z")
	public static boolean aBoolean779 = false;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(III)Z")
	public static boolean method8538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static135.method2423(arg1, arg0)) {
			return Static333.method4594(arg0, arg1) | (arg0 & 0xB000) != 0 | Static345.method4661(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static16.method300(arg1, arg0) | Static225.method3274(arg0, arg1));
		} else {
			return false;
		}
	}
}
