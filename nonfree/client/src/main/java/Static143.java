import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	public static int anInt2837;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!vh;")
	public static Class177 aClass177_6;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public static int anInt2832 = 0;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public static int anInt2833 = 1;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
	public static int[] anIntArray232 = new int[64];

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public static int anInt2834 = 1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public static void method2289() {
		for (@Pc(3) int local3 = 0; local3 < Static99.anInt1950; local3++) {
			@Pc(10) int local10 = Static123.anIntArray214[local3];
			@Pc(14) Class13_Sub5_Sub2 local14 = Static260.aClass13_Sub5_Sub2Array114[local10];
			if (local14 != null) {
				Static48.method954(local14, local14.aClass185_1.anInt5803);
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
	public static void method2290(@OriginalArg(0) boolean arg0) {
		Static170.anIntArray283 = new int[104];
		Static55.anInt1243 = 99;
		@Pc(16) byte local16;
		if (arg0) {
			local16 = 1;
		} else {
			local16 = 4;
		}
		Static241.aByteArrayArrayArray13 = new byte[local16][104][104];
		Static8.anIntArrayArrayArray1 = new int[local16][105][105];
		Static121.aByteArrayArrayArray8 = new byte[local16][104][104];
		Static32.aByteArrayArrayArray3 = new byte[local16][104][104];
		Static66.aByteArrayArrayArray15 = new byte[local16][104][104];
		Static279.anIntArray435 = new int[104];
		Static22.aByteArrayArrayArray1 = new byte[local16][105][105];
		Static71.anIntArray138 = new int[104];
		Static288.anIntArray455 = new int[5];
		Static184.anIntArray306 = new int[104];
		Static199.anIntArray243 = new int[104];
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(ZI)V")
	public static void method2292(@OriginalArg(0) boolean arg0) {
		Static65.method4578(arg0, Static292.anInt5674, Static189.anInt5672, Static56.anInt1264);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Lclient!di;")
	public static Class4_Sub2_Sub6 method2293(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub2_Sub6 local16 = (Class4_Sub2_Sub6) Static12.aClass111_1.method2890((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static261.aClass22_88.method665(26, arg0);
		local16 = new Class4_Sub2_Sub6();
		if (local27 != null) {
			local16.method1022(new Class4_Sub24(local27));
		}
		Static12.aClass111_1.method2886((long) arg0, local16);
		return local16;
	}
}
