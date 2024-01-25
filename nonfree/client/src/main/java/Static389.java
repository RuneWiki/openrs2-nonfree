import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tp", name = "F", descriptor = "I")
	public static int anInt6521;

	@OriginalMember(owner = "client!tp", name = "J", descriptor = "Lclient!l;")
	public static Class57 aClass57_22;

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
	public static int anInt6526 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IJ)V")
	public static void method5115(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}
}
