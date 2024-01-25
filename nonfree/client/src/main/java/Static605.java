import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!pl;II)Lclient!vw;")
	public static Class2_Sub49 method7745(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5985(arg2, arg1);
		return local5 == null ? null : new Class2_Sub49(new Class2_Sub15(local5));
	}
}
