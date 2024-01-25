import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!aj;II)Lclient!ma;")
	public static Class209 method5274(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method517(arg2, arg1);
		return local5 == null ? null : new Class209(new Class3_Sub25(local5));
	}
}
