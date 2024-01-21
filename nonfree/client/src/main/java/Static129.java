import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tb;II)Lclient!ha;")
	public static Class3_Sub8 method796(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1146(arg1, arg2);
		return local5 == null ? null : new Class3_Sub8(new Class3_Sub2(local5));
	}
}
