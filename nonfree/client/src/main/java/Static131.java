import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!vh;")
	public static Class187 aClass187_71 = new Class187(30);

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString150 = "glow2:";

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJ)V")
	public static void method2238(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method2239() {
		if (Static17.aBoolean10) {
			Static97.aClass23_1 = null;
			Static17.aBoolean10 = false;
			Static141.aClass1_Sub2_Sub1_31 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!nk;IB)[Lclient!pa;")
	public static Class1_Sub2_Sub1[] method2240(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		return Static313.method2575(arg0, 0, arg1) ? Static247.method3906() : null;
	}
}
