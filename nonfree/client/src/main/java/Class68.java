import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class68 implements Interface2 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JBI[I)Lclient!qe;")
	@Override
	public Class78 method2462(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(11) Class2_Sub3_Sub26 local11 = Static13.method231(arg2[0]);
			return local11.method2995((int) arg0);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(35) Class2_Sub3_Sub23 local35 = Static32.method3209((int) arg0);
			return local35.aClass78_640;
		} else if (arg1 == 6 || arg1 == 7) {
			return Static13.method231(arg2[0]).method2995((int) arg0);
		} else {
			return null;
		}
	}
}
