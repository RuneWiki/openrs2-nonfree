import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	public static int anInt5951;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	public static int anInt5952 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public static void method4955(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class5 local9 = Static236.aClass42_17.method1103(); local9 != null; local9 = Static236.aClass42_17.method1105()) {
			if ((long) arg0 == (local9.aLong253 >> 48 & 0xFFFFL)) {
				local9.method7425();
			}
		}
	}
}
