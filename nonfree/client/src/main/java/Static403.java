import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!g;II)Lclient!u;")
	public static Class2_Sub39 method5515(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1968(arg2, arg1);
		return local5 == null ? null : new Class2_Sub39(new Class2_Sub24(local5));
	}
}
