import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!um;II)Lclient!sp;")
	public static Class5_Sub37 method4952(@OriginalArg(0) Class243 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5455(arg2, arg1);
		return local5 == null ? null : new Class5_Sub37(new Class5_Sub15(local5));
	}
}
