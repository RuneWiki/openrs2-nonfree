import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!na;II)Lclient!t;")
	public static Class2_Sub17 method1803(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1666(arg2, arg1);
		return local5 == null ? null : new Class2_Sub17(new Class2_Sub4(local5));
	}
}
