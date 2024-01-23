import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class174 implements Interface4 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JZ[II)Ljava/lang/String;")
	@Override
	public String method4728(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(20) Class1_Sub2_Sub18 local20 = Static11.method2227(arg1[0]);
			return local20.method4150((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(39) Class138 local39 = Static238.method4099((int) arg0);
			return local39.aString159;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static11.method2227(arg1[0]).method4150((int) arg0);
		} else {
			return null;
		}
	}
}
