import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
	public static int anInt9439 = 0;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(JJ)J")
	public static long method7884(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
