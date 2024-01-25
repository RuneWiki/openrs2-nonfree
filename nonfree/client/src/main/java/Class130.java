import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class130 implements Interface6 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(JILclient!go;[I)Ljava/lang/String;")
	@Override
	public String method2718(@OriginalArg(0) long arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static337.aClass97_2) {
			@Pc(18) Class64 local18 = Static248.aClass242_1.method5027(arg2[0]);
			return local18.method1325((int) arg0);
		} else if (arg1 == Static318.aClass97_11 || arg1 == Static325.aClass97_12) {
			@Pc(36) Class74 local36 = Static227.aClass65_2.method1327((int) arg0);
			return local36.aString14;
		} else if (Static264.aClass97_8 == arg1 || Static194.aClass97_6 == arg1 || Static349.aClass97_13 == arg1) {
			return Static248.aClass242_1.method5027(arg2[0]).method1325((int) arg0);
		} else {
			return null;
		}
	}
}
