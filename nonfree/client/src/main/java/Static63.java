import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cw", name = "Lb", descriptor = "Lclient!kk;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!cw", name = "Eb", descriptor = "I")
	public static int anInt1262 = 0;

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "(I)V")
	public static void method1134() {
		Static263.method3809(Static323.aClass50_Sub1_1.anInt3434);
		@Pc(17) int local17 = (Static180.anInt3453 >> 3) + (Static163.anInt3197 >> 10);
		@Pc(25) int local25 = (Static86.anInt1771 >> 3) + (Static145.anInt2906 >> 10);
		Static263.anInt4963 = Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 = 0;
		Static1.aClass16_Sub1_Sub5_Sub1_1.method3426(8, 8);
		Static34.aByteArrayArray1 = new byte[18][];
		Static225.anIntArray291 = new int[18];
		Static346.anIntArray418 = new int[18];
		Static193.aByteArrayArray13 = new byte[18][];
		Static435.aByteArrayArray30 = new byte[18][];
		Static386.aByteArrayArray15 = new byte[18][];
		Static376.anIntArrayArray50 = new int[18][4];
		Static175.anIntArray222 = new int[18];
		Static95.anIntArray155 = new int[18];
		Static308.anIntArray372 = new int[18];
		Static189.anIntArray236 = new int[18];
		Static247.aByteArrayArray16 = new byte[18][];
		@Pc(78) int local78 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local17 - (Static326.anInt5666 >> 4)) / 8; local87 <= (local17 + (Static326.anInt5666 >> 4)) / 8; local87++) {
			for (local98 = (local25 - (Static283.anInt5187 >> 4)) / 8; local98 <= ((Static283.anInt5187 >> 4) + local25) / 8; local98++) {
				@Pc(106) int local106 = local98 + (local87 << 8);
				Static308.anIntArray372[local78] = local106;
				Static225.anIntArray291[local78] = Static49.aClass76_27.method2099("m" + local87 + "_" + local98);
				Static346.anIntArray418[local78] = Static49.aClass76_27.method2099("l" + local87 + "_" + local98);
				Static175.anIntArray222[local78] = Static49.aClass76_27.method2099("n" + local87 + "_" + local98);
				Static95.anIntArray155[local78] = Static49.aClass76_27.method2099("um" + local87 + "_" + local98);
				Static189.anIntArray236[local78] = Static49.aClass76_27.method2099("ul" + local87 + "_" + local98);
				if (Static175.anIntArray222[local78] == -1) {
					Static225.anIntArray291[local78] = -1;
					Static346.anIntArray418[local78] = -1;
					Static95.anIntArray155[local78] = -1;
					Static189.anIntArray236[local78] = -1;
				}
				local78++;
			}
		}
		for (local98 = local78; local98 < Static175.anIntArray222.length; local98++) {
			Static175.anIntArray222[local98] = -1;
			Static225.anIntArray291[local98] = -1;
			Static346.anIntArray418[local98] = -1;
			Static95.anIntArray155[local98] = -1;
			Static189.anIntArray236[local98] = -1;
		}
		Static311.method4167(true, local25, local17, false);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!uu;B)V")
	public static void method1142(@OriginalArg(0) Class247 arg0) {
		if (arg0.anInt6798 == Static250.anInt4639) {
			Static416.aBooleanArray21[arg0.anInt6852] = true;
		}
	}
}
