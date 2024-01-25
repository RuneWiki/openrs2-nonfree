import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
	public static int anInt7575;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	public static int anInt7576;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	public static int anInt7573 = 0;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
	public static int anInt7577 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(JJ)J")
	public static long method6560(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
