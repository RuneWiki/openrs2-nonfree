import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_76 = new Class381(84, -1);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I")
	public static int method2997() {
		@Pc(11) Class168 local11 = Static62.aClass168_11;
		synchronized (Static62.aClass168_11) {
			return Static62.aClass168_11.method3848();
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(III)V")
	public static void method2999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg0 | (long) arg1 << 32, 18);
		local16.method7444();
	}
}
