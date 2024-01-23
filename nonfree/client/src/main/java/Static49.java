import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public static int anInt1133;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public static int anInt1134;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!km;")
	public static Class91 aClass91_44;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!km;")
	public static Class91 aClass91_45;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int anInt1127 = 0;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!qc;")
	public static Class135 aClass135_2 = new Class135(50);

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public static int anInt1128 = 0;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public static int anInt1129 = 100;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method937(@OriginalArg(1) int arg0) {
		Static88.anInt1962 = arg0;
		Static22.anInt448 = -1;
		Static258.anInt5077 = -1;
		Static196.method1928();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method939() {
		@Pc(2) Class138 local2 = Static48.aClass138_1;
		synchronized (Static48.aClass138_1) {
			Static66.anInt1384 = Static113.anInt2604;
			Static224.anInt4445 = Static64.anInt1373;
			Static244.anInt4846++;
			Static8.anInt226 = Static199.anInt4055;
			Static123.anInt2804 = Static149.anInt3218;
			Static249.anInt4936 = Static133.anInt2899;
			Static40.anInt1015 = Static189.anInt3907;
			Static183.aLong160 = Static140.aLong113;
			Static149.anInt3218 = 0;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void method940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg2, 4);
		local8.method3905();
		local8.anInt5000 = arg0;
		local8.anInt5004 = arg1;
		local8.anInt5005 = arg3;
	}
}
