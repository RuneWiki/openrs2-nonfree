import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class187 implements Interface6 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	@Override
	public String method4994(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(16) Class1_Sub2_Sub4 local16 = Static106.method1653(arg0[0]);
			return local16.method1535((int) arg1);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(35) Class102 local35 = Static348.method5333((int) arg1);
			return local35.aString95;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static106.method1653(arg0[0]).method1535((int) arg1);
		} else {
			return null;
		}
	}
}
