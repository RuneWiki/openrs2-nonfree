import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "Lclient!pe;")
	public static Class13 aClass13_36;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!ra;")
	public static Class72 aClass72_11 = null;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_61 = new Class89(64);

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1135 = Static158.method3034(")3");

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	public static int anInt4119 = -1;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public static int anInt4121 = 0;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1137 = Static158.method3034("Enter your username (V password)3");

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1136 = aClass60_1137;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "[I")
	public static final int[] anIntArray455 = new int[256];

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public static void method3119() {
		Static78.aClass2_Sub7_Sub1_1.method1533();
		Static179.anInt4363 = 1;
		Static108.aClass13_24 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!gf;)V")
	public static void method3120(@OriginalArg(1) Class2_Sub6 arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(7) int local7 = -1;
		if (arg0.anInt1928 == 0) {
			local1 = Static197.method3579(arg0.anInt1915, arg0.anInt1921, arg0.anInt1926);
		}
		if (arg0.anInt1928 == 1) {
			local1 = Static102.method2330(arg0.anInt1915, arg0.anInt1921, arg0.anInt1926);
		}
		if (arg0.anInt1928 == 2) {
			local1 = Static41.method911(arg0.anInt1915, arg0.anInt1921, arg0.anInt1926);
		}
		if (arg0.anInt1928 == 3) {
			local1 = Static160.method1485(arg0.anInt1915, arg0.anInt1921, arg0.anInt1926);
		}
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = 0;
		if (local1 != 0L) {
			local63 = (int) local1 >> 20 & 0x3;
			local61 = (int) local1 >> 14 & 0x1F;
			local7 = (int) (local1 >>> 32) & Integer.MAX_VALUE;
		}
		arg0.anInt1920 = local63;
		arg0.anInt1911 = local7;
		arg0.anInt1924 = local61;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
	public static boolean method3121(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)I")
	public static int method3122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			arg0--;
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method3123() {
		Static88.aClass51_7 = new Class51(32);
	}
}
