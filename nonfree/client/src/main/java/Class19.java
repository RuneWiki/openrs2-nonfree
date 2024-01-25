import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class19 implements Interface2 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	@Override
	public String method697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		if (arg1 == 0) {
			@Pc(11) Class2_Sub11_Sub5 local11 = Static194.method3506(arg0[0]);
			return local11.method2281((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(30) Class208 local30 = Static282.method5080((int) arg2);
			return local30.aString63;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static194.method3506(arg0[0]).method2281((int) arg2);
		} else {
			return null;
		}
	}
}
