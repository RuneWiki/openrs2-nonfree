import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public static int anInt4335 = 127;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public static int anInt4337 = 1;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
	public static final int[] anIntArray397 = new int[50];

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[Lclient!s;")
	public static final Class51_Sub1[] aClass51_Sub1Array4 = new Class51_Sub1[29];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lclient!sg;")
	public static Class1_Sub4_Sub20 method3915(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub4_Sub20 local10 = (Class1_Sub4_Sub20) Static304.aClass87_52.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static252.aClass216_82.method5648(26, arg0);
		local10 = new Class1_Sub4_Sub20();
		if (local20 != null) {
			local10.method4916(new Class1_Sub8(local20));
		}
		Static304.aClass87_52.method2481(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;)V")
	public static void method3916(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static158.method3155(-1, arg4, null, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIFIIIZI)[[I")
	public static int[][] method3918(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub3_Sub26 local13 = new Class1_Sub3_Sub26();
		local13.anInt4524 = (int) (arg0 * 4096.0F);
		local13.anInt4534 = 3;
		local13.anInt4532 = 4;
		local13.aBoolean430 = false;
		local13.anInt4529 = 8;
		local13.method5535();
		Static78.method1761(64, 256);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method4080(local9[local47], local47);
		}
		return local9;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	public static void method3919() {
		if (Static243.aString52.length() == 0) {
			return;
		}
		Static344.method5517("--> " + Static243.aString52);
		Static49.method1304(false, Static243.aString52);
		Static300.anInt5954 = 0;
		Static276.anInt5645 = 0;
		Static243.aString52 = "";
	}
}
