import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class143 implements Interface10 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!jd;JZ[I)Ljava/lang/String;")
	@Override
	public String method3574(@OriginalArg(0) Class119 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == Static224.aClass119_12) {
			@Pc(23) Class58 local23 = Static58.aClass192_1.method4696(arg2[0]);
			return local23.method1409((int) arg1);
		} else if (Static152.aClass119_10 == arg0 || Static321.aClass119_15 == arg0) {
			@Pc(41) Class191 local41 = Static89.aClass157_1.method3832((int) arg1);
			return local41.aString56;
		} else if (Static284.aClass119_14 == arg0 || arg0 == Static36.aClass119_3 || Static236.aClass119_13 == arg0) {
			return Static58.aClass192_1.method4696(arg2[0]).method1409((int) arg1);
		} else {
			return null;
		}
	}
}
