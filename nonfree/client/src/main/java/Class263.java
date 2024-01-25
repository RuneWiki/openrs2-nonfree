import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class263 implements Interface3 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BJLclient!vr;[I)Ljava/lang/String;")
	@Override
	public String method6056(@OriginalArg(1) long arg0, @OriginalArg(2) Class266 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static363.aClass266_122) {
			@Pc(18) Class43 local18 = Static166.aClass246_3.method5653(arg2[0]);
			return local18.method1209((int) arg0);
		} else if (arg1 == Static296.aClass266_136 || Static193.aClass266_76 == arg1) {
			@Pc(36) Class274 local36 = Static139.aClass193_1.method4650((int) arg0);
			return local36.aString82;
		} else if (arg1 == Static330.aClass266_113 || Static411.aClass266_125 == arg1 || Static176.aClass266_69 == arg1) {
			return Static166.aClass246_3.method5653(arg2[0]).method1209((int) arg0);
		} else {
			return null;
		}
	}
}
