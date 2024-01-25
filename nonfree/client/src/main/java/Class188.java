import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class188 implements Interface16 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!db;[IIJ)Ljava/lang/String;")
	@Override
	public String method4897(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == Static253.aClass57_7) {
			@Pc(17) Class301 local17 = Static402.aClass60_2.method1602(arg1[0]);
			return local17.method7226((int) arg2);
		} else if (Static322.aClass57_11 == arg0 || arg0 == Static274.aClass57_9) {
			@Pc(35) Class27 local35 = Static99.aClass96_7.method2508((int) arg2);
			return local35.aString8;
		} else if (arg0 == Static156.aClass57_3 || arg0 == Static403.aClass57_12 || Static499.aClass57_5 == arg0) {
			return Static402.aClass60_2.method1602(arg1[0]).method7226((int) arg2);
		} else {
			return null;
		}
	}
}
