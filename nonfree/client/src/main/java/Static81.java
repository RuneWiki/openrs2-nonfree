import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!client;")
	public static client aClient7;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!ik;")
	public static Class162 aClass162_11;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt9840;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Z")
	public static boolean aBoolean696 = false;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	public static int anInt9842 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z")
	public static boolean method8046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static59.method859(arg1, arg0) | (arg0 & 0x70000) != 0 || Static442.method6257(arg1, arg0);
	}
}
