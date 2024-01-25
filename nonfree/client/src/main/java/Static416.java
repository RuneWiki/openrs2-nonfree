import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Lclient!ns;")
	public static Class166 aClass166_278;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	public static int anInt7072 = -1;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "F")
	public static float aFloat208 = 1024.0F;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
	public static int anInt7075 = 0;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZI)Lclient!jh;")
	public static Class4_Sub1_Sub8 method5456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class4_Sub1_Sub8 local20 = (Class4_Sub1_Sub8) Static278.aClass196_40.method4477((long) arg1 << 32 | (long) arg0);
		if (local20 == null) {
			local20 = new Class4_Sub1_Sub8(arg1, arg0);
			Static278.aClass196_40.method4474(local20.aLong225, local20);
		}
		return local20;
	}
}
