import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class153 implements Interface4 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	@Override
	public String method3902(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(13) Class2_Sub8_Sub9 local13 = Static244.method3898(arg2[0]);
			return local13.method2030((int) arg0);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(39) Class60 local39 = Static87.method1546((int) arg0);
			return local39.aString81;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static244.method3898(arg2[0]).method2030((int) arg0);
		} else {
			return null;
		}
	}
}
