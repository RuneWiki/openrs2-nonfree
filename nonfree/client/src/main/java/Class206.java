import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class206 implements Interface10 {

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[IJLclient!js;)Ljava/lang/String;")
	@Override
	public String method5659(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class156 arg2) {
		if (arg2 == Static313.aClass156_10) {
			@Pc(13) Class153 local13 = Static286.aClass249_1.method6540(arg0[0]);
			return local13.method4162((int) arg1);
		} else if (arg2 == Static413.aClass156_17 || Static209.aClass156_6 == arg2) {
			@Pc(35) Class180 local35 = Static181.aClass316_1.method8107((int) arg1);
			return local35.aString121;
		} else if (arg2 == Static505.aClass156_13 || arg2 == Static121.aClass156_5 || Static8.aClass156_1 == arg2) {
			return Static286.aClass249_1.method6540(arg0[0]).method4162((int) arg1);
		} else {
			return null;
		}
	}
}
