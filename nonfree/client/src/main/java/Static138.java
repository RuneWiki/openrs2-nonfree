import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!fd;II)Lclient!pe;")
	public static Class2_Sub18 method1616(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1931(arg2, arg1);
		return local5 == null ? null : new Class2_Sub18(new Class2_Sub9(local5));
	}
}
