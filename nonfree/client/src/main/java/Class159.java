import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class159 implements Interface4 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(J[III)Ljava/lang/String;")
	@Override
	public String method4344(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(14) Class11_Sub4_Sub19 local14 = Static155.method2502(arg1[0]);
			return local14.method5329((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(35) Class170 local35 = Static283.method4717((int) arg0);
			return local35.aString53;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static155.method2502(arg1[0]).method5329((int) arg0);
		} else {
			return null;
		}
	}
}
