import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	public static int anInt5176;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Z")
	public static boolean aBoolean264;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "[Lclient!ag;")
	public static Class7[] aClass7Array5;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	public static int anInt5179;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!ab;")
	public static Class3 aClass3_22 = new Class3();

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	public static int anInt5180 = 0;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZBLclient!hc;Lclient!hg;Lclient!hc;)V")
	public static void method3952(@OriginalArg(2) Class51 arg0, @OriginalArg(3) Class1_Sub2_Sub7_Sub1 arg1, @OriginalArg(4) Class51 arg2) {
		Static51.aBoolean83 = true;
		Static259.aClass51_84 = arg0;
		Static84.aClass51_29 = arg2;
		@Pc(20) int local20 = Static84.aClass51_29.method1859() - 1;
		Static94.anInt4255 = local20 * 256 + Static84.aClass51_29.method1875(local20);
		Static38.aStringArray5 = new String[] { null, null, null, null, Static26.aString28 };
		Static2.aStringArray2 = new String[] { null, null, Static247.aString376, null, null };
		Static98.aClass1_Sub2_Sub7_Sub1_2 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)Lclient!o;")
	public static Class1_Sub2_Sub11 method3953(@OriginalArg(1) int arg0) {
		return (Class1_Sub2_Sub11) Static203.aClass140_12.method4014((long) arg0);
	}
}
