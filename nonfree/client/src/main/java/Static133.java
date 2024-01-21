import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!oc;II)Lclient!jb;")
	public static Class1_Sub10 method1044(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1269(arg1, arg2);
		return local5 == null ? null : new Class1_Sub10(new Class1_Sub5(local5));
	}
}
