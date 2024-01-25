import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hu", name = "P", descriptor = "Lclient!la;")
	public static Class196 aClass196_25;

	@OriginalMember(owner = "client!hu", name = "R", descriptor = "I")
	private static int anInt1881;

	@OriginalMember(owner = "client!hu", name = "S", descriptor = "Z")
	private static boolean aBoolean118;

	@OriginalMember(owner = "client!hu", name = "T", descriptor = "Z")
	private static boolean aBoolean119;

	@OriginalMember(owner = "client!hu", name = "U", descriptor = "I")
	private static int anInt1882;

	@OriginalMember(owner = "client!hu", name = "V", descriptor = "I")
	private static int anInt1883;

	@OriginalMember(owner = "client!hu", name = "W", descriptor = "Z")
	private static boolean aBoolean120;

	@OriginalMember(owner = "client!hu", name = "X", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!hu", name = "Y", descriptor = "I")
	private static int anInt1884;

	@OriginalMember(owner = "client!hu", name = "Z", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!hu", name = "ab", descriptor = "I")
	private static int anInt1885;

	@OriginalMember(owner = "client!hu", name = "bb", descriptor = "I")
	private static int anInt1886;

	@OriginalMember(owner = "client!hu", name = "cb", descriptor = "I")
	private static int anInt1887;

	@OriginalMember(owner = "client!hu", name = "db", descriptor = "I")
	private static int anInt1888;

	@OriginalMember(owner = "client!hu", name = "eb", descriptor = "I")
	private static int anInt1889;

	@OriginalMember(owner = "client!hu", name = "fb", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!hu", name = "gb", descriptor = "I")
	private static int anInt1890;

	@OriginalMember(owner = "client!hu", name = "hb", descriptor = "I")
	private static int anInt1891;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_35 = new Class130(11, 3);

	@OriginalMember(owner = "client!hu", name = "M", descriptor = "Lclient!ak;")
	public static final Class15 aClass15_3 = new Class15();

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_4 = new Class74(8, 0, 4, 1);

	@OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
	public static int anInt1879 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)Lclient!ss;")
	public static Class205 method1811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 76724863L ^ (long) arg5 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg4 * 67481L ^ (long) arg0 * 97549L ^ (long) arg1 * 475427L;
		@Pc(44) Class205 local44 = (Class205) Static553.aClass102_58.method2677(local33);
		if (local44 == null) {
			local44 = Static383.aClass5_12.method7486(arg4, arg0, arg1, arg2, arg5, arg3);
			Static553.aClass102_58.method2674(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBIZ)V")
	public static void method1814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static597.aClass280_45.method7107((long) arg0) != null) {
			return;
		}
		if (Static36.aBoolean80) {
			@Pc(26) Class3_Sub25 local26 = new Class3_Sub25(arg0, new Class119_Sub1(4096, Static177.aClass196_36, arg0), arg1, arg2);
			local26.aClass119_Sub1_1.method3524(Static141.aStringArray7[Static325.anInt6083]);
			Static597.aClass280_45.method7109(local26, (long) arg0);
		} else {
			Static618.method8554(arg0, arg2);
		}
	}
}
