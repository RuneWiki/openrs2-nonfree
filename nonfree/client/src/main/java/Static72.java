import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "[Lclient!qf;")
	public static Class146[] aClass146Array1;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public static int anInt1374;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!nm;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!wi;")
	public static Class103_Sub2 aClass103_Sub2_1 = null;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public static int anInt1376 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)V")
	public static void method1159(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
