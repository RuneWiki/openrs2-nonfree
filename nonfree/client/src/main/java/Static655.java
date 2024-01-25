import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!la;II)Lclient!tp;")
	public static Class5_Sub49 method7999(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4681(arg1, arg2);
		return local5 == null ? null : new Class5_Sub49(new Class5_Sub22(local5));
	}
}
