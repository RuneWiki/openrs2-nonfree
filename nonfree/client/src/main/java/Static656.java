import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!kha;II)Lclient!paa;")
	public static Class3_Sub33 method6548(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5023(arg1, arg2);
		return local5 == null ? null : new Class3_Sub33(new Class3_Sub15(local5));
	}
}
