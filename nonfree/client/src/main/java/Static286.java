import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "[S")
	public static short[] aShortArray93;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static volatile int anInt5587 = 0;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
	public static int[] anIntArray449 = new int[14];

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!ul;")
	public static Class172 aClass172_47 = new Class172(500);

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
	public static int[] anIntArray453 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	public static int anInt5602 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[Lclient!wb;")
	public static Class4_Sub2_Sub4[] method4472() {
		@Pc(8) Class4_Sub2_Sub4[] local8 = new Class4_Sub2_Sub4[Static150.anInt2948];
		for (@Pc(10) int local10 = 0; local10 < Static150.anInt2948; local10++) {
			@Pc(17) byte[] local17 = Static99.aByteArrayArray8[local10];
			@Pc(25) int local25 = Static107.anIntArray188[local10] * Static246.anIntArray386[local10];
			@Pc(28) int[] local28 = new int[local25];
			for (@Pc(30) int local30 = 0; local30 < local25; local30++) {
				local28[local30] = Static138.anIntArray228[local17[local30] & 0xFF];
			}
			if (Static251.aBoolean330) {
				local8[local10] = new Class4_Sub2_Sub4_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local10], Static278.anIntArray422[local10], Static107.anIntArray188[local10], Static246.anIntArray386[local10], local28);
			} else {
				local8[local10] = new Class4_Sub2_Sub4_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local10], Static278.anIntArray422[local10], Static107.anIntArray188[local10], Static246.anIntArray386[local10], local28);
			}
		}
		Static184.method2969();
		return local8;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIBIII)V")
	public static void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static48.method951(arg6)) {
			Static41.method793(Static217.aClass97ArrayArray1[arg6], -1, arg0, arg2, arg5, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4477(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < Static15.anInt334; local24++) {
			if (arg0.equalsIgnoreCase(Static224.aStringArray29[local24])) {
				return true;
			}
		}
		return false;
	}
}
