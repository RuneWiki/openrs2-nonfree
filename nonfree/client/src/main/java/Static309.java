import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	public static int anInt6172;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	public static int anInt6170 = 0;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
	public static int anInt6178 = -2;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!fd;Z)Lclient!rw;")
	public static Class260_Sub1 method5149(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(7) Class260 local7 = Static152.method2969(arg0);
		@Pc(16) int local16 = arg0.method6535();
		@Pc(20) int local20 = arg0.method6535();
		@Pc(24) int local24 = arg0.method6535();
		@Pc(28) int local28 = arg0.method6535();
		@Pc(32) int local32 = arg0.method6535();
		@Pc(36) int local36 = arg0.method6535();
		return new Class260_Sub1(local7.aClass100_11, local7.aClass237_11, local7.anInt9472, local7.anInt9473, local7.anInt9475, local7.anInt9476, local7.anInt9468, local7.anInt9478, local7.anInt9477, local16, local20, local24, local28, local32, local36);
	}
}
