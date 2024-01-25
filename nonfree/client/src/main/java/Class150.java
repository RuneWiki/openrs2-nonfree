import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class150 implements Interface2 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(JIB[I)Ljava/lang/String;")
	@Override
	public String method3962(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(11) Class4_Sub1_Sub17 local11 = Static257.method4394(arg2[0]);
			return local11.method4084((int) arg0);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(38) Class142 local38 = Static247.method4270((int) arg0);
			return local38.aString165;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static257.method4394(arg2[0]).method4084((int) arg0);
		} else {
			return null;
		}
	}
}
