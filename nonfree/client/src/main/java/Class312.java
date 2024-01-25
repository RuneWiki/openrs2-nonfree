import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class312 implements Interface20 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([ILclient!io;IJ)Ljava/lang/String;")
	@Override
	public String method7291(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(3) long arg2) {
		if (Static481.aClass148_14 == arg1) {
			@Pc(18) Class254 local18 = Static518.aClass241_1.method5714(arg0[0]);
			return local18.method6085((int) arg2);
		} else if (Static33.aClass148_1 == arg1 || Static480.aClass148_13 == arg1) {
			@Pc(36) Class22 local36 = Static451.aClass67_2.method2006((int) arg2);
			return local36.aString15;
		} else if (arg1 == Static309.aClass148_9 || Static352.aClass148_11 == arg1 || arg1 == Static235.aClass148_7) {
			return Static518.aClass241_1.method5714(arg0[0]).method6085((int) arg2);
		} else {
			return null;
		}
	}
}
