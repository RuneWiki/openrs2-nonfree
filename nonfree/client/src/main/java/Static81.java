import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
	public static int anInt1682;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	public static int anInt1678 = -1;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Lclient!ht;")
	public static final Class151 aClass151_2 = new Class151();

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)V")
	public static void method1368(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class5 local10 = Static421.aClass273_26.method6577(); local10 != null; local10 = Static421.aClass273_26.method6589()) {
			if ((local10.aLong278 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method9047();
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	public static void method1370() {
		Static360.aClass330_30 = new Class330();
	}
}
