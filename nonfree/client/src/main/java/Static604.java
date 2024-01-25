import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!pl;II)Lclient!uea;")
	public static Class331 method7303(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5985(arg2, arg1);
		return local5 == null ? null : new Class331(new Class2_Sub15(local5));
	}
}
