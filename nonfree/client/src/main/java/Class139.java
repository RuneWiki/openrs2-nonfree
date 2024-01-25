import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class139 implements Interface16 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([IIJLclient!hj;)Ljava/lang/String;")
	@Override
	public String method3725(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class158 arg2) {
		if (Static108.aClass158_1 == arg2) {
			@Pc(13) Class311 local13 = Static146.aClass32_1.method445(arg0[0]);
			return local13.method7471((int) arg1);
		} else if (Static421.aClass158_10 == arg2 || arg2 == Static538.aClass158_12) {
			@Pc(33) Class282 local33 = Static149.aClass244_1.method5958((int) arg1);
			return local33.aString87;
		} else if (Static678.aClass158_15 == arg2 || Static321.aClass158_8 == arg2 || arg2 == Static593.aClass158_14) {
			return Static146.aClass32_1.method445(arg0[0]).method7471((int) arg1);
		} else {
			return null;
		}
	}
}
