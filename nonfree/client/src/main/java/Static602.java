import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!sea;II)Lclient!nfa;")
	public static Class1_Sub36 method5160(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6569(arg1, arg2);
		return local5 == null ? null : new Class1_Sub36(new Class1_Sub3(local5));
	}
}
