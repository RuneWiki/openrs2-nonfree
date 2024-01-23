import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ta", name = "U", descriptor = "Lclient!lj;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ta", name = "Q", descriptor = "Lclient!i;")
	private static Class41 aClass41_1113 = method2923("Type");

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
	public static int anInt4236 = 0;

	@OriginalMember(owner = "client!ta", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_1114 = method2923("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "[I")
	public static int[] anIntArray438 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_1115 = aClass41_1113;

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
	public static int anInt4240 = 0;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "[S")
	public static short[] aShortArray140 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;)Lclient!i;")
	public static Class41 method2923(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = local6.length;
		@Pc(15) Class41 local15 = new Class41();
		local15.aByteArray26 = new byte[local11];
		while (local11 > local8) {
			@Pc(32) int local32 = local6[local8++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local11 <= local8) {
					break;
				}
				@Pc(50) int local50 = local6[local8++] & 0xFF;
				local15.aByteArray26[local15.anInt2012++] = (byte) ((local32 - 40) * 43 + local50 - 48);
			} else if (local32 != 0) {
				local15.aByteArray26[local15.anInt2012++] = (byte) local32;
			}
		}
		local15.method1418();
		return local15.method1390();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
	public static void method2925() {
		Static136.anIntArray332 = new int[104];
		Static26.anInt660 = 99;
		Static74.anIntArray194 = new int[104];
		Static196.anIntArray462 = new int[104];
		Static141.anIntArray337 = new int[104];
		Static196.anIntArray463 = new int[104];
		Static97.aByteArrayArrayArray6 = new byte[4][105][105];
		Static95.aByteArrayArrayArray5 = new byte[4][104][104];
		Static147.aByteArrayArrayArray9 = new byte[4][104][104];
		Static208.aByteArrayArrayArray13 = new byte[4][104][104];
		Static120.anIntArrayArrayArray15 = new int[4][105][105];
		Static7.aByteArrayArrayArray2 = new byte[4][104][104];
	}
}
