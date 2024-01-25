import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!dda;II)Lclient!bh;")
	public static Class2_Sub8 method760(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1616(arg2, arg1);
		return local5 == null ? null : new Class2_Sub8(new Class2_Sub29(local5));
	}
}
