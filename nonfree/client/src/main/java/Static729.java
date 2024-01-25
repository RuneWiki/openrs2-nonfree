import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static729 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ik;II)Lclient!bc;")
	public static Class3_Sub8 method1125(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3985(arg2, arg1);
		return local5 == null ? null : new Class3_Sub8(new Class3_Sub2(local5));
	}
}
