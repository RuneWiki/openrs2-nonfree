import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!dd;II)Lclient!kc;")
	public static Class8_Sub12 method1011(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1156(arg2, arg1);
		return local5 == null ? null : new Class8_Sub12(new Class8_Sub20(local5));
	}
}
