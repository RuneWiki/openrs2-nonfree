import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class41 implements Interface2 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIJ[I)Ljava/lang/String;")
	@Override
	public String method1255(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == 0) {
			@Pc(16) Class1_Sub2_Sub16 local16 = Static101.method2100(arg2[0]);
			return local16.method3709((int) arg1);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(37) Class89 local37 = Static93.method2006((int) arg1);
			return local37.aString235;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static101.method2100(arg2[0]).method3709((int) arg1);
		} else {
			return null;
		}
	}
}
