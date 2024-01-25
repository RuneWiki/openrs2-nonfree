import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Lclient!ga;")
	public static Class111 aClass111_53;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)J")
	public static synchronized long method4035() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static533.aLong387 > local10) {
			Static107.aLong100 += Static533.aLong387 - local10;
		}
		Static533.aLong387 = local10;
		return local10 + Static107.aLong100;
	}
}
