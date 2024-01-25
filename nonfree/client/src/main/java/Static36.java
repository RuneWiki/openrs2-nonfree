import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	public static int anInt602;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Lclient!pq;")
	public static Class251 aClass251_12;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	public static int anInt603;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z")
	public static boolean method512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
