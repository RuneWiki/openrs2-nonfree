import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static735 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!nca;II)Lclient!mt;")
	public static Class250 method6017(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6087(arg2, arg1);
		return local5 == null ? null : new Class250(new Class2_Sub20(local5));
	}
}
