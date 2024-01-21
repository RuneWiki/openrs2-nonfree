import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!bc;II)Lclient!wb;")
	public static Class3_Sub25 method3113(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method60(arg1, arg2);
		return local5 == null ? null : new Class3_Sub25(new Class3_Sub17(local5));
	}
}
