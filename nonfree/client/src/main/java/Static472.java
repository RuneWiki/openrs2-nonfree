import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!uu;II)Lclient!qv;")
	public static Class204 method4861(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5806(arg1, arg2);
		return local5 == null ? null : new Class204(new Class3_Sub25(local5));
	}
}
