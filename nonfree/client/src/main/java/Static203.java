import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Lclient!tf;")
	public static Class322 aClass322_96;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!ub;")
	public static final Class3_Sub47 aClass3_Sub47_3 = new Class3_Sub47(0, 0);

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "J")
	public static long aLong146 = -1L;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public static void method4576(@OriginalArg(1) int arg0) {
		Static461.aLong219 = 1000000000L / (long) arg0;
	}
}
