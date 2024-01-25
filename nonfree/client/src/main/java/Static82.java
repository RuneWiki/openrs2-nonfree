import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "[Lclient!lba;")
	public static Class9_Sub5[] aClass9_Sub5Array1;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "Lclient!eaa;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
	public static final int anInt2602 = 1406;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
	public static boolean method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
