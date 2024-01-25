import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
	public static int anInt2206;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array9;

	@OriginalMember(owner = "client!kn", name = "C", descriptor = "I")
	public static int anInt2210 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z")
	public static boolean method1874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static413.method5563(arg0, arg1) | (arg1 & 0x800) != 0 || Static582.method7550(arg0, arg1);
	}
}
