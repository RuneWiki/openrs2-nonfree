import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static729 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!lb;II)Lclient!lv;")
	public static Class3_Sub32 method5712(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5089(arg2, arg1);
		return local5 == null ? null : new Class3_Sub32(new Class3_Sub28(local5));
	}
}
