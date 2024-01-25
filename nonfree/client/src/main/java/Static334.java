import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public static int anInt6158;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_38 = new Class229();

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public static int anInt6159 = -1;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!dn;II)Lclient!ov;")
	public static Class179 method4856(@OriginalArg(1) Class56 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method1384(arg1, 0);
		return local14 == null ? null : new Class179(local14);
	}
}
