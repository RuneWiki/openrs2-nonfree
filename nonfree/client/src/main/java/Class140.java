import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class140 implements Interface3 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IJLclient!oaa;[I)Ljava/lang/String;")
	@Override
	public String method4297(@OriginalArg(1) long arg0, @OriginalArg(2) Class234 arg1, @OriginalArg(3) int[] arg2) {
		if (Static523.aClass234_23 == arg1) {
			@Pc(13) Class218 local13 = Static176.aClass145_1.method4404(arg2[0]);
			return local13.method6199((int) arg0);
		} else if (Static107.aClass234_20 == arg1 || Static645.aClass234_26 == arg1) {
			@Pc(33) Class301 local33 = Static635.aClass336_2.method8424((int) arg0);
			return local33.aString97;
		} else if (arg1 == Static332.aClass234_16 || arg1 == Static183.aClass234_11 || Static292.aClass234_14 == arg1) {
			return Static176.aClass145_1.method4404(arg2[0]).method6199((int) arg0);
		} else {
			return null;
		}
	}
}
