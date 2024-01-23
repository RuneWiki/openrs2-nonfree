import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public static int anInt4374;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Lclient!id;")
	public static Class43 aClass43_22 = new Class43(64);

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Lclient!i;")
	private static Class41 aClass41_1156 = Static184.method2923("slide:");

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_1153 = aClass41_1156;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_1154 = aClass41_1156;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "Lclient!i;")
	private static Class41 aClass41_1157 = Static184.method2923("Select");

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!i;")
	public static Class41 aClass41_1155 = aClass41_1157;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)Lclient!ac;")
	public static Class2_Sub2_Sub1 method3025(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub2_Sub1 local14 = (Class2_Sub2_Sub1) Static143.aClass43_15.method1464((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(24) byte[] local24 = Static160.aClass15_34.method387(arg0, 11);
		local14 = new Class2_Sub2_Sub1();
		if (local24 != null) {
			local14.method82(new Class2_Sub3(local24));
		}
		Static143.aClass43_15.method1462((long) arg0, local14);
		return local14;
	}
}
