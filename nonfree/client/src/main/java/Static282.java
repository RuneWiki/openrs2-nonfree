import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public static int anInt5372 = 0;

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "[I")
	public static final int[] anIntArray488 = new int[5];

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
	public static int anInt5377 = 127;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
	public static int anInt5380 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lclient!jk;")
	public static Class14_Sub2_Sub10 method4779(@OriginalArg(1) int arg0) {
		@Pc(10) Class14_Sub2_Sub10 local10 = (Class14_Sub2_Sub10) Static138.aClass178_6.method4772((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static92.aClass143_52.method3745(Static123.method5334(arg0), Static238.method4172(arg0));
		local10 = new Class14_Sub2_Sub10();
		if (local32 != null) {
			local10.method2996(new Class14_Sub4(local32));
		}
		Static138.aClass178_6.method4767(local10, (long) arg0);
		return local10;
	}
}
