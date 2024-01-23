import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class76 implements Interface1 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(JII[I)Lclient!sc;")
	@Override
	public Class107 method2118(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(14) Class1_Sub2_Sub17 local14 = Static31.method2201(arg2[0]);
			return local14.method3280((int) arg0);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(33) Class75 local33 = Static128.method2147((int) arg0);
			return local33.aClass107_737;
		} else if (arg1 == 6 || arg1 == 7) {
			return Static31.method2201(arg2[0]).method3280((int) arg0);
		} else {
			return null;
		}
	}
}
