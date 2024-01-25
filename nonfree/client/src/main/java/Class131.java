import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class131 implements Interface12 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[ILclient!gfa;J)Ljava/lang/String;")
	@Override
	public String method3230(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class116 arg1, @OriginalArg(3) long arg2) {
		if (arg1 == Static242.aClass116_3) {
			@Pc(18) Class40 local18 = Static231.aClass87_1.method2467(arg0[0]);
			return local18.method673((int) arg2);
		} else if (Static4.aClass116_1 == arg1 || Static519.aClass116_12 == arg1) {
			@Pc(36) Class242 local36 = Static521.aClass273_2.method6712((int) arg2);
			return local36.aString71;
		} else if (arg1 == Static447.aClass116_11 || Static566.aClass116_13 == arg1 || Static370.aClass116_5 == arg1) {
			return Static231.aClass87_1.method2467(arg0[0]).method673((int) arg2);
		} else {
			return null;
		}
	}
}
