import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class71 implements Interface4 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([IIJB)Lclient!kh;")
	@Override
	public Class60 method2192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		if (arg1 == 0) {
			@Pc(11) Class1_Sub1_Sub15 local11 = Static54.method1051(arg0[0]);
			return local11.method2118((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(28) Class1_Sub1_Sub18 local28 = Static191.method2990((int) arg2);
			return local28.aClass60_1043;
		} else if (arg1 == 6 || arg1 == 7) {
			return Static54.method1051(arg0[0]).method2118((int) arg2);
		} else {
			return null;
		}
	}
}
