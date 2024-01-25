import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class45 implements Interface7 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([ILclient!ra;IJ)Ljava/lang/String;")
	@Override
	public String method1255(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(3) long arg2) {
		if (Static107.aClass208_5 == arg1) {
			@Pc(13) Class204 local13 = Static293.aClass24_6.method442(arg0[0]);
			return local13.method4683((int) arg2);
		} else if (arg1 == Static46.aClass208_2 || Static180.aClass208_9 == arg1) {
			@Pc(40) Class30 local40 = Static350.aClass149_2.method3483((int) arg2);
			return local40.aString5;
		} else if (arg1 == Static438.aClass208_15 || arg1 == Static246.aClass208_10 || Static42.aClass208_1 == arg1) {
			return Static293.aClass24_6.method442(arg0[0]).method4683((int) arg2);
		} else {
			return null;
		}
	}
}
