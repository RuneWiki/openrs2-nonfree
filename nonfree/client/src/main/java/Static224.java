import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!eh;II)Lclient!sf;")
	public static Class90 method2701(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method852(arg2, arg1);
		return local5 == null ? null : new Class90(new Class2_Sub3(local5));
	}
}
