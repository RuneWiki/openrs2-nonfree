import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!pu;II)Lclient!ek;")
	public static Class90 method1812(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5704(arg1, arg2);
		return local5 == null ? null : new Class90(new Class1_Sub35(local5));
	}
}
