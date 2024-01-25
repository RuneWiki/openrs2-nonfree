import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!kda;II)Lclient!ps;")
	public static Class1_Sub38 method5759(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4198(arg2, arg1);
		return local5 == null ? null : new Class1_Sub38(new Class1_Sub13(local5));
	}
}
