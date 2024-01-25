import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class288 implements Interface17 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!rb;B[IJ)Ljava/lang/String;")
	@Override
	public String method7272(@OriginalArg(0) Class245 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static483.aClass245_19 == arg0) {
			@Pc(18) Class251 local18 = Static171.aClass17_1.method621(arg1[0]);
			return local18.method6537((int) arg2);
		} else if (arg0 == Static522.aClass245_21 || Static216.aClass245_13 == arg0) {
			@Pc(36) Class300 local36 = Static464.aClass115_1.method2970((int) arg2);
			return local36.aString197;
		} else if (arg0 == Static472.aClass245_17 || Static318.aClass245_15 == arg0 || arg0 == Static478.aClass245_18) {
			return Static171.aClass17_1.method621(arg1[0]).method6537((int) arg2);
		} else {
			return null;
		}
	}
}
