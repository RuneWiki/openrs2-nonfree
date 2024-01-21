import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ff;II)Lclient!pe;")
	public static Class5_Sub18 method1617(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1038(arg1, arg2);
		return local5 == null ? null : new Class5_Sub18(new Class5_Sub14(local5));
	}
}
