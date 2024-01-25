import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static499 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public static int anInt8441;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!of;")
	public static final Class251 aClass251_5 = new Class251(0, 1);

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int anInt8440 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)I")
	public static int method7174(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
