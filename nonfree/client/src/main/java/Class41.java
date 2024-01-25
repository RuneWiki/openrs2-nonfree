import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class41 implements Interface6 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!sc;JI[I)Ljava/lang/String;")
	@Override
	public String method992(@OriginalArg(0) Class220 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static77.aClass220_33 == arg0) {
			@Pc(15) Class218 local15 = Static418.aClass189_1.method3856(arg2[0]);
			return local15.method4721((int) arg1);
		} else if (Static96.aClass220_42 == arg0 || arg0 == Static17.aClass220_10) {
			@Pc(35) Class40 local35 = Static306.aClass67_3.method1452((int) arg1);
			return local35.aString5;
		} else if (Static226.aClass220_81 == arg0 || Static356.aClass220_126 == arg0 || arg0 == Static428.aClass220_149) {
			return Static418.aClass189_1.method3856(arg2[0]).method4721((int) arg1);
		} else {
			return null;
		}
	}
}
