import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!sf;II)Lclient!uf;")
	public static Class1_Sub23 method1972(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method107(arg2, arg1);
		return local5 == null ? null : new Class1_Sub23(new Class1_Sub12(local5));
	}
}
