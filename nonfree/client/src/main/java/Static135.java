import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!g;II)Lclient!rd;")
	public static Class2_Sub18 method1578(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1358(arg2, arg1);
		return local5 == null ? null : new Class2_Sub18(new Class2_Sub10(local5));
	}
}
