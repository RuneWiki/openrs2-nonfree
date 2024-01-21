import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!f;II)Lclient!ie;")
	public static Class3_Sub14 method1210(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method348(arg1, arg2);
		return local5 == null ? null : new Class3_Sub14(new Class3_Sub12(local5));
	}
}
