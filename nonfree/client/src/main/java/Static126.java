import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Lclient!rh;")
	public static Class76 aClass76_4;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1096 = Static177.method3050("null");

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1097 = Static177.method3050(" has logged out)3");

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1098 = aClass46_1097;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean129 = true;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1099 = Static177.method3050("cookieprefix");

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1101 = Static177.method3050("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1100 = aClass46_1101;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public static int anInt3006 = 0;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public static int anInt3007 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BJ)V")
	public static void method2226(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZLclient!jd;)V")
	public static void method2227(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		Static90.aClass4_Sub11_Sub1_1.method1285(147);
		Static90.aClass4_Sub11_Sub1_1.method1237(arg0);
		Static90.aClass4_Sub11_Sub1_1.method1229(arg1.method1646());
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 method2228() {
		@Pc(10) Class4_Sub1_Sub7_Sub2 local10 = new Class4_Sub1_Sub7_Sub2();
		local10.anInt3405 = Static107.anIntArray248[0];
		local10.anInt3409 = Static137.anIntArray312[0];
		local10.anInt3406 = Static55.anIntArray147[0];
		local10.anInt3404 = Static35.anIntArray81[0];
		local10.anInt3408 = Static137.anInt3248;
		local10.anInt3407 = Static131.anInt3136;
		@Pc(42) int local42 = local10.anInt3405 * local10.anInt3404;
		local10.anIntArray323 = new int[local42];
		@Pc(54) byte[] local54 = Static12.aByteArrayArray1[0];
		for (@Pc(56) int local56 = 0; local56 < local42; local56++) {
			local10.anIntArray323[local56] = Static110.anIntArray253[local54[local56] & 0xFF];
		}
		Static130.method2308();
		return local10;
	}
}
