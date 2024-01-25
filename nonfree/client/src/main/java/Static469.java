import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!mn;II)Lclient!ko;")
	public static Class149 method3064(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3658(arg1, arg2);
		return local5 == null ? null : new Class149(new Class2_Sub17(local5));
	}
}
