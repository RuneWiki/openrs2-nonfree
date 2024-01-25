import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class30 implements Interface11 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([IJLclient!ed;I)Ljava/lang/String;")
	@Override
	public String method789(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class93 arg2) {
		if (Static33.aClass93_21 == arg2) {
			@Pc(13) Class25 local13 = Static597.aClass311_1.method6836(arg0[0]);
			return local13.method728((int) arg1);
		} else if (Static329.aClass93_12 == arg2 || arg2 == Static398.aClass93_15) {
			@Pc(33) Class15 local33 = Static117.aClass197_2.method4518((int) arg1);
			return local33.aString6;
		} else if (arg2 == Static116.aClass93_3 || Static364.aClass93_13 == arg2 || Static197.aClass93_7 == arg2) {
			return Static597.aClass311_1.method6836(arg0[0]).method728((int) arg1);
		} else {
			return null;
		}
	}
}
