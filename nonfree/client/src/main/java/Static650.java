import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!uu;II)Lclient!aha;")
	public static Class3_Sub6 method234(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8132(arg1, arg2);
		return local5 == null ? null : new Class3_Sub6(new Class3_Sub9(local5));
	}
}
