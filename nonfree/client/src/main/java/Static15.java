import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public static int anInt384;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBI)Lclient!bk;")
	public static Class2_Sub2_Sub2 method236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class2_Sub2_Sub2 local23 = (Class2_Sub2_Sub2) Static174.aClass240_16.method5439((long) arg0 | (long) arg1 << 32);
		if (local23 == null) {
			local23 = new Class2_Sub2_Sub2(arg1, arg0);
			Static174.aClass240_16.method5430(local23.aLong227, local23);
		}
		return local23;
	}
}
