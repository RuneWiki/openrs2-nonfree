import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class199 implements Interface5 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B[ILclient!cq;J)Ljava/lang/String;")
	@Override
	public String method4081(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) long arg2) {
		if (Static147.aClass63_14 == arg1) {
			@Pc(18) Class108 local18 = Static407.aClass215_1.method4452(arg0[0]);
			return local18.method1997((int) arg2);
		} else if (arg1 == Static265.aClass63_22 || Static455.aClass63_35 == arg1) {
			@Pc(36) Class164 local36 = Static466.aClass130_2.method2311((int) arg2);
			return local36.aString48;
		} else if (Static150.aClass63_15 == arg1 || arg1 == Static489.aClass63_37 || Static334.aClass63_46 == arg1) {
			return Static407.aClass215_1.method4452(arg0[0]).method1997((int) arg2);
		} else {
			return null;
		}
	}
}
