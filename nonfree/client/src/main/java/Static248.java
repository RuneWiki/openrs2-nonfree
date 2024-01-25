import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!k", name = "y", descriptor = "[Lclient!sa;")
	public static Class131[] aClass131Array4;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_83 = new Class40("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_136 = new Class150(45, 14);

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_137 = new Class150(0, 8);

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "J")
	public static long aLong160 = -1L;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!oh;Z)V")
	public static void method4846(@OriginalArg(0) Class220 arg0) {
		@Pc(7) Class220 local7 = Static73.method1344(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static383.anInt6994;
			local13 = Static456.anInt7874;
		} else {
			local11 = local7.anInt6627;
			local13 = local7.anInt6681;
		}
		Static309.method5041(arg0, false, local11, local13);
		Static178.method3063(arg0, local11, local13);
	}
}
