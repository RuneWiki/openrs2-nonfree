import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class193 implements Interface3 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIJ[I)Ljava/lang/String;")
	@Override
	public String method4730(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == 0) {
			@Pc(14) Class1_Sub2_Sub2 local14 = Static181.method2988(arg2[0]);
			return local14.method152((int) arg1);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(34) Class102 local34 = Static49.method909((int) arg1);
			return local34.aString181;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static181.method2988(arg2[0]).method152((int) arg1);
		} else {
			return null;
		}
	}
}
