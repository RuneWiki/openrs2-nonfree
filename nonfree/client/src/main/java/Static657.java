import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!wu;II)Lclient!tca;")
	public static Class322 method7709(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8885(arg1, arg2);
		return local5 == null ? null : new Class322(new Class5_Sub12(local5));
	}
}
