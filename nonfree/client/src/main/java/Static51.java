import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Lclient!kf;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public static int anInt1017;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public static int anInt1018;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public static int anInt1013 = 0;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!vh;")
	public static Class187 aClass187_32 = new Class187(64);

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public static int anInt1016 = -1;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public static volatile int anInt1019 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)Lclient!kh;")
	public static Class92 method953(@OriginalArg(1) int arg0) {
		@Pc(10) Class92 local10 = (Class92) Static236.aClass187_119.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static229.aClass121_99.method3115(31, arg0);
		local10 = new Class92();
		if (local27 != null) {
			local10.method2484(arg0, new Class1_Sub14(local27));
		}
		Static236.aClass187_119.method4524((long) arg0, local10);
		return local10;
	}
}
