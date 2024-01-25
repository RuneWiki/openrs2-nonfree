import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class182 implements Interface25 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B[IJLclient!o;)Ljava/lang/String;")
	@Override
	public String method4156(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class246 arg2) {
		if (Static625.aClass246_33 == arg2) {
			@Pc(13) Class255 local13 = Static28.aClass190_1.method4283(arg0[0]);
			return local13.method6280((int) arg1);
		} else if (arg2 == Static86.aClass246_9 || Static147.aClass246_13 == arg2) {
			@Pc(31) Class216 local31 = Static340.aClass121_1.method2647((int) arg1);
			return local31.aString77;
		} else if (Static483.aClass246_28 == arg2 || arg2 == Static512.aClass246_30 || arg2 == Static471.aClass246_27) {
			return Static28.aClass190_1.method4283(arg0[0]).method6280((int) arg1);
		} else {
			return null;
		}
	}
}
