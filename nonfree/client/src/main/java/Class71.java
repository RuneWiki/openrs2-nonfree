import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class71 implements Interface13 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([ILclient!dc;JZ)Ljava/lang/String;")
	@Override
	public String method1825(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) long arg2) {
		if (arg1 == Static284.aClass68_10) {
			@Pc(13) Class168 local13 = Static167.aClass291_2.method6677(arg0[0]);
			return local13.method3983((int) arg2);
		} else if (Static300.aClass68_11 == arg1 || Static353.aClass68_12 == arg1) {
			@Pc(31) Class236 local31 = Static338.aClass29_1.method977((int) arg2);
			return local31.aString139;
		} else if (arg1 == Static488.aClass68_17 || Static539.aClass68_18 == arg1 || Static407.aClass68_15 == arg1) {
			return Static167.aClass291_2.method6677(arg0[0]).method3983((int) arg2);
		} else {
			return null;
		}
	}
}
