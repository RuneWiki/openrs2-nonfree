import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class286 implements Interface16 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!pe;[IJZ)Ljava/lang/String;")
	@Override
	public String method6396(@OriginalArg(0) Class282 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Static440.aClass282_38 == arg0) {
			@Pc(13) Class127 local13 = Static116.aClass237_3.method5240(arg1[0]);
			return local13.method3102((int) arg2);
		} else if (arg0 == Static273.aClass282_25 || Static507.aClass282_50 == arg0) {
			@Pc(33) Class246 local33 = Static82.aClass134_1.method3191((int) arg2);
			return local33.aString77;
		} else if (arg0 == Static250.aClass282_24 || arg0 == Static174.aClass282_46 || arg0 == Static175.aClass282_9) {
			return Static116.aClass237_3.method5240(arg1[0]).method3102((int) arg2);
		} else {
			return null;
		}
	}
}
