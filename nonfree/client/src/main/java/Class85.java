import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class85 implements Interface2 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZJ[I)Ljava/lang/String;")
	@Override
	public String method2419(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == 0) {
			@Pc(14) Class4_Sub4_Sub9 local14 = Static355.method5665(arg2[0]);
			return local14.method3299((int) arg1);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(39) Class210 local39 = Static177.method3465((int) arg1);
			return local39.aString65;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static355.method5665(arg2[0]).method3299((int) arg1);
		} else {
			return null;
		}
	}
}
