import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class128 implements Interface22 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([IJBLclient!fr;)Ljava/lang/String;")
	@Override
	public String method3000(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class123 arg2) {
		if (Static266.aClass123_3 == arg2) {
			@Pc(13) Class241 local13 = Static298.aClass322_1.method7220(arg0[0]);
			return local13.method5331((int) arg1);
		} else if (Static488.aClass123_9 == arg2 || arg2 == Static412.aClass123_8) {
			@Pc(40) Class275 local40 = Static606.aClass62_2.method1887((int) arg1);
			return local40.aString94;
		} else if (arg2 == Static150.aClass123_1 || arg2 == Static297.aClass123_5 || arg2 == Static181.aClass123_2) {
			return Static298.aClass322_1.method7220(arg0[0]).method5331((int) arg1);
		} else {
			return null;
		}
	}
}
