import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public static int anInt2685;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!od;")
	private static Class60 aClass60_1038 = Static41.method597("Username: ");

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_1039 = aClass60_1038;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Lclient!od;")
	private static Class60 aClass60_1040 = Static41.method597("Enter your username (V password)3");

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_1041 = Static41.method597("gelb:");

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_1042 = aClass60_1040;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	public static int anInt2686 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lclient!wb;")
	public static Class4_Sub3_Sub16 method1854(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub16 local10 = (Class4_Sub3_Sub16) Static74.aClass12_13.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static22.aClass10_8.method1774(10, arg0);
		local10 = new Class4_Sub3_Sub16();
		local10.anInt2871 = arg0;
		if (local25 != null) {
			local10.method1959(new Class4_Sub9(local25));
		}
		local10.method1970();
		if (local10.anInt2863 != -1) {
			local10.method1966(method1854(local10.anInt2902), method1854(local10.anInt2863));
		}
		if (!Static128.aBoolean124 && local10.aBoolean125) {
			local10.aClass60Array22 = null;
			local10.aClass60_1128 = Static50.aClass60_508;
			local10.aClass60Array21 = null;
			local10.anInt2865 = 0;
		}
		Static74.aClass12_13.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
	public static void method1855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		@Pc(12) Class4_Sub3_Sub9 local12 = (Class4_Sub3_Sub9) Static97.aClass75_13.method1896(local6);
		if (local12 != null) {
			Static56.aClass59_2.method1284(local12);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method1856() {
		aClass60_1042 = null;
		aClass60_1040 = null;
		aClass60_1041 = null;
		aClass60_1039 = null;
		aClass60_1038 = null;
		aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Lclient!he;")
	public static Class4_Sub3_Sub8 method1857(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub3_Sub8 local15 = (Class4_Sub3_Sub8) Static102.aClass12_23.method289((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static133.aClass10_32.method1774(1, arg0);
		local15 = new Class4_Sub3_Sub8();
		if (local25 != null) {
			local15.method659(arg0, new Class4_Sub9(local25));
		}
		local15.method660();
		Static102.aClass12_23.method290(local15, (long) arg0);
		return local15;
	}
}
