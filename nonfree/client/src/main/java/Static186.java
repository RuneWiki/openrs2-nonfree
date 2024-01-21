import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!dd;II)Lclient!ph;")
	public static Class1_Sub20 method2432(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2254(arg2, arg1);
		return local5 == null ? null : new Class1_Sub20(new Class1_Sub6(local5));
	}
}
