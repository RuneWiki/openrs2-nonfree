import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!in;II)Lclient!dl;")
	public static Class2_Sub14 method2686(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4564(arg1, arg2);
		return local5 == null ? null : new Class2_Sub14(new Class2_Sub11(local5));
	}
}
