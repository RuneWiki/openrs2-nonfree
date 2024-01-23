import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class30 implements Interface3 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([IBIJ)Lclient!hh;")
	@Override
	public Class50 method815(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 == 0) {
			@Pc(16) Class1_Sub1_Sub4 local16 = Static159.method3316(arg0[0]);
			return local16.method282((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(37) Class70 local37 = Static16.method227((int) arg2);
			return local37.aClass50_833;
		} else if (arg1 == 6 || arg1 == 7) {
			return Static159.method3316(arg0[0]).method282((int) arg2);
		} else {
			return null;
		}
	}
}
