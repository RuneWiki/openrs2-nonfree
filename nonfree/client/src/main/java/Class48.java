import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class48 implements Interface23 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(JILclient!vq;[I)Ljava/lang/String;")
	@Override
	public String method1002(@OriginalArg(0) long arg0, @OriginalArg(2) Class382 arg1, @OriginalArg(3) int[] arg2) {
		if (Static32.aClass382_23 == arg1) {
			@Pc(13) Class33 local13 = Static153.aClass322_1.method7940(arg2[0]);
			return local13.method656((int) arg0);
		} else if (arg1 == Static83.aClass382_9 || arg1 == Static502.aClass382_18) {
			@Pc(33) Class284 local33 = Static252.aClass56_1.method1052((int) arg0);
			return local33.aString89;
		} else if (arg1 == Static309.aClass382_17 || Static538.aClass382_19 == arg1 || arg1 == Static187.aClass382_14) {
			return Static153.aClass322_1.method7940(arg2[0]).method656((int) arg0);
		} else {
			return null;
		}
	}
}
