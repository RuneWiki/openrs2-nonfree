import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!dn;II)Lclient!sda;")
	public static Class1_Sub45 method6858(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1888(arg2, arg1);
		return local5 == null ? null : new Class1_Sub45(new Class1_Sub17(local5));
	}
}
