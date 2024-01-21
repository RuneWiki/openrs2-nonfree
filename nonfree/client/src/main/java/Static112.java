import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!k;II)Lclient!kb;")
	public static Class35 method964(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1150(0, arg1);
		return local5 == null ? null : new Class35(new Class2_Sub8(local5));
	}
}
