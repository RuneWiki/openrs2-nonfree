import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!je;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Z")
	public static boolean aBoolean131;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public static int anInt1487;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!ka;")
	public static Class6_Sub15_Sub2 aClass6_Sub15_Sub2_1 = new Class6_Sub15_Sub2(8192);

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public static int anInt1485 = 0;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	public static int anInt1486 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class242 local13 = local7.aClass242_2; local13 != null; local13 = local13.aClass242_4) {
			@Pc(17) Class3_Sub3 local17 = local13.aClass3_Sub3_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort97 == arg1 && local17.aShort95 == arg2) {
				Static90.method1558(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Lclient!oa;")
	public static Class184_Sub1 method1393() {
		return Static148.aClass184_Sub1Array1.length > Static216.anInt3748 ? Static148.aClass184_Sub1Array1[Static216.anInt3748++] : null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILclient!qq;IZ)V")
	public static void method1396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int arg4) {
		arg3.method3570(arg1, arg0, arg4 + arg1, arg0 + arg2);
		arg3.method3531(arg1, -16777216, arg0, arg2, arg4);
		if (Static126.anInt4528 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static36.anInt2241 / (float) Static36.anInt2248;
		@Pc(35) int local35 = arg4;
		@Pc(37) int local37 = arg2;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg4);
		} else {
			local35 = (int) ((float) arg2 / local33);
		}
		@Pc(63) int local63 = arg0 + (arg2 - local37) / 2;
		@Pc(71) int local71 = arg1 + (arg4 - local35) / 2;
		if (Static116.aClass12_3 == null || Static116.aClass12_3.method5672() != arg4 || Static116.aClass12_3.method5664() != arg2) {
			Static36.method2046(Static36.anInt2246, Static36.anInt2241 + Static36.anInt2243, Static36.anInt2246 - -Static36.anInt2248, Static36.anInt2243, local71, local63, local35 + local71, local37 + local63);
			Static36.method2063(arg3);
			Static116.aClass12_3 = arg3.method3518(local71, local63, local35, local37, false);
		}
		Static116.aClass12_3.method5665(local71, local63);
		@Pc(127) int local127 = Static442.anInt6181 * local35 / Static36.anInt2248;
		@Pc(133) int local133 = local37 * Static337.anInt5671 / Static36.anInt2241;
		@Pc(141) int local141 = local35 * Static368.anInt6142 / Static36.anInt2248 + local71;
		@Pc(155) int local155 = local63 + local37 - local133 - local37 * Static171.anInt1651 / Static36.anInt2241;
		@Pc(157) int local157 = -1996554240;
		if (Static193.aClass44_3 == Static323.aClass44_4) {
			local157 = -1996488705;
		}
		arg3.method3559(local141, local155, local127, local133, local157, 1);
		arg3.method3506(local141, local155, local127, local133, local157, 0);
		if (anInt1487 <= 0) {
			return;
		}
		@Pc(192) int local192;
		if (Static119.anInt2070 > 50) {
			local192 = 500 - Static119.anInt2070 * 5;
		} else {
			local192 = Static119.anInt2070 * 5;
		}
		for (@Pc(203) Class6_Sub24 local203 = (Class6_Sub24) Static36.aClass88_24.method1882(); local203 != null; local203 = (Class6_Sub24) Static36.aClass88_24.method1891()) {
			@Pc(211) Class94 local211 = Static36.aClass254_5.method5834(local203.anInt4802);
			if (Static406.method5559(local211)) {
				@Pc(232) int local232;
				@Pc(244) int local244;
				if (local203.anInt4802 == Static26.anInt2329) {
					local232 = local203.anInt4798 * local35 / Static36.anInt2248 + local71;
					local244 = local63 + (Static36.anInt2241 - local203.anInt4805) * local37 / Static36.anInt2241;
					arg3.method3531(local232 - 2, local192 << 24 | 0xFFFF00, local244 - 2, 4, 4);
				} else if (Static18.anInt316 != -1 && Static18.anInt316 == local211.anInt2178) {
					local232 = local71 + local35 * local203.anInt4798 / Static36.anInt2248;
					local244 = (Static36.anInt2241 - local203.anInt4805) * local37 / Static36.anInt2241 + local63;
					arg3.method3531(local232 - 2, local192 << 24 | 0xFFFF00, local244 - 2, 4, 4);
				}
			}
		}
	}
}
