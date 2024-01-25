import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "v", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Lclient!wd;")
	public static final Class366 aClass366_1 = new Class366(1);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IJ)V")
	public static void method849(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}
}
