import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!km;II)Lclient!h;")
	public static Class1_Sub16 method1681(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2495(arg1, arg2);
		return local5 == null ? null : new Class1_Sub16(new Class1_Sub11(local5));
	}
}
