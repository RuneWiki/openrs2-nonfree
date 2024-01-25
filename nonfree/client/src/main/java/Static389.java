import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public static int anInt7106;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_110 = new Class98(49, -1);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
	public static void method5678(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}
