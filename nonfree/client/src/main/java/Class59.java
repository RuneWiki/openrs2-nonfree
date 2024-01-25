import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class59 implements Interface7 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	@Override
	public String method1185(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(15) Class146 local15 = Static194.aClass103_1.method2198(arg0[0]);
			return local15.method3155((int) arg1);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(43) Class51 local43 = Static176.aClass78_3.method1641((int) arg1);
			return local43.aString13;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static194.aClass103_1.method2198(arg0[0]).method3155((int) arg1);
		} else {
			return null;
		}
	}
}
