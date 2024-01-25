import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class42 implements Interface1 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!fg;ZJ[I)Ljava/lang/String;")
	@Override
	public String method1218(@OriginalArg(0) Class70 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == Static251.aClass70_20) {
			@Pc(13) Class249 local13 = Static150.aClass218_1.method5113(arg2[0]);
			return local13.method5777((int) arg1);
		} else if (arg0 == Static139.aClass70_11 || arg0 == Static165.aClass70_10) {
			@Pc(31) Class209 local31 = Static158.aClass272_1.method6283((int) arg1);
			return local31.lb;
		} else if (Static194.aClass70_15 == arg0 || Static106.aClass70_18 == arg0 || arg0 == Static311.aClass70_17) {
			return Static150.aClass218_1.method5113(arg2[0]).method5777((int) arg1);
		} else {
			return null;
		}
	}
}
