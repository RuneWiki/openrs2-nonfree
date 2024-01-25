import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static389 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!wp;")
	public static Class270 aClass270_6;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public static int anInt6612;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	public static int anInt6604 = 1;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Z")
	public static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)Z")
	public static boolean method5181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
