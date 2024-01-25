import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!ij;II)Lclient!dl;")
	public static Class50 method926(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2410(arg2, arg1);
		return local5 == null ? null : new Class50(new Class5_Sub12(local5));
	}
}
