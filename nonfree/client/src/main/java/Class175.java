import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class175 implements Interface3 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	@Override
	public String method4659(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(13) Class2_Sub3_Sub9 local13 = Static82.method4614(arg2[0]);
			return local13.method1985((int) arg0);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(30) Class155 local30 = Static152.method2616((int) arg0);
			return local30.aString239;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static82.method4614(arg2[0]).method1985((int) arg0);
		} else {
			return null;
		}
	}
}
