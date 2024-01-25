import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class197 implements Interface4 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[ILclient!sd;J)Ljava/lang/String;")
	@Override
	public String method4322(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class220 arg1, @OriginalArg(3) long arg2) {
		if (arg1 == Static21.aClass220_1) {
			@Pc(17) Class144 local17 = Static18.aClass40_1.method983(arg0[0]);
			return local17.method3278((int) arg2);
		} else if (arg1 == Static435.aClass220_38 || arg1 == Static226.aClass220_23) {
			@Pc(37) Class162 local37 = Static342.aClass155_2.method3548((int) arg2);
			return local37.aString55;
		} else if (arg1 == Static388.aClass220_36 || arg1 == Static261.aClass220_30 || Static390.aClass220_37 == arg1) {
			return Static18.aClass40_1.method983(arg0[0]).method3278((int) arg2);
		} else {
			return null;
		}
	}
}
