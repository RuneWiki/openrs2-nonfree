import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class107 implements Interface5 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([IJII)Ljava/lang/String;")
	@Override
	public String method2687(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(13) Class61 local13 = Static25.aClass84_3.method1984(arg0[0]);
			return local13.method1380((int) arg1);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(35) Class152 local35 = Static57.aClass196_1.method4827((int) arg1);
			return local35.aString35;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static25.aClass84_3.method1984(arg0[0]).method1380((int) arg1);
		} else {
			return null;
		}
	}
}
