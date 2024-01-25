import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ci;II)Lclient!bf;")
	public static Class4_Sub5 method374(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1039(arg2, arg1);
		return local5 == null ? null : new Class4_Sub5(new Class4_Sub20(local5));
	}
}
