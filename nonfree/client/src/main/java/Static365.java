import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!em;")
	public static Class83 aClass83_141;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_29 = new Class91(64);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)Lclient!taa;")
	public static Class1_Sub45 method5366(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) long local12 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class1_Sub45) Static288.aClass91_22.method2271(local12);
	}
}
