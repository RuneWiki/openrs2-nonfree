import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
	public static int anInt4369;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
	public static int anInt4370;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!bg;")
	public static final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_210 = new Class305(91, 6);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
	public static void method4064(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class1 local5 = Static339.aClass230_35.method6137(); local5 != null; local5 = Static339.aClass230_35.method6140()) {
			if ((long) arg0 == (local5.aLong251 >> 48 & 0xFFFFL)) {
				local5.method8239();
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I")
	public static int method4065() {
		if (Static189.aFrame1 == null) {
			return Static186.aBoolean315 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
