import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!jb;II)Lclient!me;")
	public static Class3_Sub14 method1476(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method931(arg2, arg1);
		return local5 == null ? null : new Class3_Sub14(new Class3_Sub12(local5));
	}
}
