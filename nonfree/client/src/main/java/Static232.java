import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public static int anInt3956;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!ow;")
	public static Class181 aClass181_5;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_33 = new Class268(32);

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Z")
	public static boolean aBoolean291 = true;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JZ)V")
	public static void method3383(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
