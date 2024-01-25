import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!wda;")
	public static Class343 aClass343_2;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public static int anInt8961;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	public static int anInt8966;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "[I")
	public static final int[] anIntArray789 = new int[6];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	public static void method7510(@OriginalArg(1) int arg0) {
		Static558.anInt9501 = arg0;
		@Pc(7) Class245 local7 = Static180.aClass245_33;
		synchronized (Static180.aClass245_33) {
			Static180.aClass245_33.method6079();
		}
		local7 = Static428.aClass245_59;
		synchronized (Static428.aClass245_59) {
			Static428.aClass245_59.method6079();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method7515(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static241.anInt4921; local17++) {
			if (arg0.equalsIgnoreCase(Static381.aStringArray42[local17])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95);
	}
}
