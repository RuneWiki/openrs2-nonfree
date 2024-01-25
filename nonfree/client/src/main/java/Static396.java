import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	public static int anInt6606;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "Lclient!cl;")
	public static Class57 aClass57_8;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_71 = new Class46(43, 3);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBZ)V")
	public static void method5883(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class5_Sub38 local10 = Static478.method7058(arg0, arg1);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray364.length; local20++) {
				local10.anIntArray364[local20] = -1;
				local10.anIntArray363[local20] = 0;
			}
		}
	}
}
