import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static729 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!nca;II)Lclient!eu;")
	public static Class2_Sub21 method2358(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6087(arg2, arg1);
		return local5 == null ? null : new Class2_Sub21(new Class2_Sub20(local5));
	}
}
