import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!wia;II)Lclient!uea;")
	public static Class14_Sub51 method8458(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method9196(arg2, arg1);
		return local5 == null ? null : new Class14_Sub51(new Class14_Sub29(local5));
	}
}
