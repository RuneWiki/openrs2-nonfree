import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class302 implements Interface8 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JB[ILclient!dv;)Ljava/lang/String;")
	@Override
	public String method7404(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class96 arg2) {
		if (arg2 == Static575.aClass96_23) {
			@Pc(13) Class200 local13 = Static102.aClass156_20.method3083(arg1[0]);
			return local13.method4720((int) arg0);
		} else if (arg2 == Static659.aClass96_26 || arg2 == Static547.aClass96_21) {
			@Pc(33) Class204 local33 = Static201.aClass127_1.method2501((int) arg0);
			return local33.aString72;
		} else if (Static358.aClass96_13 == arg2 || Static518.aClass96_18 == arg2 || Static286.aClass96_11 == arg2) {
			return Static102.aClass156_20.method3083(arg1[0]).method4720((int) arg0);
		} else {
			return null;
		}
	}
}
