import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	public static int anInt3149;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!ie;")
	public static Class53 aClass53_23 = new Class53(100);

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!uh;")
	public static Class116 aClass116_5 = new Class116();

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[Lclient!vb;")
	public static Class70_Sub1[] aClass70_Sub1Array1 = new Class70_Sub1[256];

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1111 = Static64.method1101("; Max)2Age=");

	@OriginalMember(owner = "client!od", name = "h", descriptor = "[I")
	public static int[] anIntArray214 = new int[4096];

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public static int anInt3150 = 0;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1112 = Static64.method1101("underlay)3dat");

	@OriginalMember(owner = "client!od", name = "k", descriptor = "[I")
	public static int[] anIntArray215 = new int[200];

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!vf;")
	public static Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)J")
	public static synchronized long method2489() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static191.aLong142) {
			Static66.aLong52 += Static191.aLong142 - local10;
		}
		Static191.aLong142 = local10;
		return Static66.aLong52 + local10;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method2490(@OriginalArg(0) int arg0) {
		Static125.anInt3565 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static58.anInt1373; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static172.anInt3854; local6++) {
				if (Static22.aClass1_Sub7ArrayArrayArray1[arg0][local3][local6] == null) {
					Static22.aClass1_Sub7ArrayArrayArray1[arg0][local3][local6] = new Class1_Sub7(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!wa;")
	public static Class124 method2492(@OriginalArg(1) int arg0) {
		@Pc(10) Class124 local10 = (Class124) Static30.aClass53_17.method1501((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static195.aClass70_28.method3509(Static180.method3044(arg0), Static33.method588(arg0));
		local10 = new Class124();
		if (local24 != null) {
			local10.method3647(new Class1_Sub16(local24));
		}
		Static30.aClass53_17.method1497(local10, (long) arg0);
		return local10;
	}
}
