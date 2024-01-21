import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!mb;II)Lclient!ob;")
	public static Class49 method1190(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1504(arg1, 0);
		return local5 == null ? null : new Class49(new Class3_Sub8(local5));
	}
}
