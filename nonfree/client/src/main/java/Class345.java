import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class345 implements Interface6 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z[ILclient!hk;J)Ljava/lang/String;")
	@Override
	public String method8557(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) long arg2) {
		if (arg1 == Static374.aClass146_7) {
			@Pc(13) Class289 local13 = Static203.aClass164_1.method4433(arg0[0]);
			return local13.method7508((int) arg2);
		} else if (Static63.aClass146_2 == arg1 || Static558.aClass146_13 == arg1) {
			@Pc(36) Class351 local36 = Static372.aClass343_1.method8549((int) arg2);
			return local36.aString119;
		} else if (Static509.aClass146_12 == arg1 || arg1 == Static77.aClass146_3 || arg1 == Static469.aClass146_10) {
			return Static203.aClass164_1.method4433(arg0[0]).method7508((int) arg2);
		} else {
			return null;
		}
	}
}
