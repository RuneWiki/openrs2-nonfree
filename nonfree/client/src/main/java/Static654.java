import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!wu;II)Lclient!rp;")
	public static Class2_Sub42 method6897(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8620(arg1, arg2);
		return local5 == null ? null : new Class2_Sub42(new Class2_Sub22(local5));
	}
}
