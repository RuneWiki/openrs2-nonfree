import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!wu;II)Lclient!ue;")
	public static Class5_Sub45 method8039(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8885(arg1, arg2);
		return local5 == null ? null : new Class5_Sub45(new Class5_Sub12(local5));
	}
}
