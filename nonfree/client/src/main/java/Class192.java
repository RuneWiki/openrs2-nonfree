import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class192 implements Interface11 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([IJLclient!fp;I)Ljava/lang/String;")
	@Override
	public String method4063(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class83 arg2) {
		if (Static282.aClass83_9 == arg2) {
			@Pc(18) Class218 local18 = Static258.aClass208_1.method4373(arg0[0]);
			return local18.method4462((int) arg1);
		} else if (Static320.aClass83_12 == arg2 || Static27.aClass83_2 == arg2) {
			@Pc(36) Class45 local36 = Static259.aClass206_2.method4320((int) arg1);
			return local36.aString6;
		} else if (Static12.aClass83_1 == arg2 || Static253.aClass83_8 == arg2 || Static62.aClass83_3 == arg2) {
			return Static258.aClass208_1.method4373(arg0[0]).method4462((int) arg1);
		} else {
			return null;
		}
	}
}
