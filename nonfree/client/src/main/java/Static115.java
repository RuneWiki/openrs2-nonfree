import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "J")
	public static long aLong88;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!qh;")
	public static Class4_Sub2_Sub18 aClass4_Sub2_Sub18_1;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public static int anInt2333;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_4;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public static int anInt2343;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Z")
	public static boolean aBoolean148;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2331 = 0;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public static int anInt2344 = -1;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
	public static int anInt2353 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!pi;)Lclient!bi;")
	public static Class14 method1917(@OriginalArg(1) Class4_Sub24 arg0) {
		@Pc(7) Class14 local7 = new Class14();
		local7.anInt519 = arg0.method3085();
		local7.aClass4_Sub2_Sub5_1 = Static67.method1178(local7.anInt519);
		return local7;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public static void method1918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 11);
		local8.method2876();
		local8.anInt3536 = arg2;
		local8.anInt3539 = arg1;
	}
}
