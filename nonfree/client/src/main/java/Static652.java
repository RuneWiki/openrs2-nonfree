import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!kha;II)Lclient!dj;")
	public static Class64 method2497(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5023(arg1, arg2);
		return local5 == null ? null : new Class64(new Class3_Sub15(local5));
	}
}
