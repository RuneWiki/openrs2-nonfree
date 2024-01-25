import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public static int anInt2301;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	public static int anInt2305;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	public static int anInt2306;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array7;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Lclient!ap;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
	public static int anInt2312;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "Lclient!vd;")
	public static Class205 aClass205_7;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Lclient!ne;")
	public static Class146 aClass146_24 = null;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!e;)V")
	public static void method2264(@OriginalArg(1) Class46 arg0) {
		@Pc(7) int local7 = Static349.anInt6632;
		@Pc(9) int local9 = Static127.anInt2787;
		@Pc(15) int local15 = Static124.anInt2716;
		@Pc(17) int local17 = Static147.anInt2656;
		arg0.method5108(local15, local7, local17, -10660793, local9);
		arg0.method5108(local15 - 2, local7 + 1, 16, -16777216, local9 + 1);
		arg0.method5087(local9 + 18, local17 + -19, local7 + 1, -16777216, -2 + local15);
		Static164.aClass30_5.method5572(local7 + 3, -1, -10660793, local9 + 14, Static325.aString231);
		@Pc(73) int local73 = Static63.anInt1529;
		@Pc(75) int local75 = Static328.anInt6333;
		@Pc(77) int local77 = 0;
		for (@Pc(82) Class14_Sub23 local82 = (Class14_Sub23) Static95.aClass18_9.method459(); local82 != null; local82 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			@Pc(97) int local97 = local9 + (-local77 + -1 + Static41.anInt980) * 16 + 31;
			@Pc(99) short local99 = -1;
			if (local7 < local73 && local7 + local15 > local73 && local75 > local97 - 13 && local75 < local97 + 3) {
				local99 = -256;
			}
			@Pc(133) int[] local133 = null;
			if (Static31.method760(local82.anInt4355)) {
				local133 = Static296.method5066((int) local82.aLong128).anIntArray647;
			} else if (Static194.method3670(local82.anInt4355)) {
				@Pc(188) Class10_Sub3_Sub3_Sub1 local188 = Static266.aClass10_Sub3_Sub3_Sub1Array1[(int) local82.aLong128];
				if (local188 != null) {
					local133 = local188.aClass192_1.anIntArray527;
				}
			} else if (Static254.method4389(local82.anInt4355)) {
				if (local82.anInt4355 == 1001) {
					local133 = Static232.method2200((int) local82.aLong128).anIntArray171;
				} else {
					local133 = Static232.method2200((int) (local82.aLong128 >>> 32 & 0x7FFFFFFFL)).anIntArray171;
				}
			}
			@Pc(198) String local198 = Static206.method6002(local82);
			if (local133 != null) {
				local198 = local198 + Static38.method915(local133);
			}
			Static164.aClass30_5.method5575(local97, local198, Static58.anIntArray95, 0, local99, local7 + 3, Static235.aClass2Array14);
			local77++;
		}
		Static51.method1234(Static349.anInt6632, Static147.anInt2656, Static127.anInt2787, Static124.anInt2716);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public static void method2267() {
		@Pc(12) Class43 local12 = Static65.aClass43_3;
		synchronized (Static65.aClass43_3) {
			Static347.anInt6625 = Static182.anInt3773;
			Static269.anInt5122++;
			@Pc(31) int local31;
			if (Static115.anInt2550 >= 0) {
				while (Static115.anInt2550 != Static176.anInt3875) {
					local31 = Static158.anIntArray296[Static176.anInt3875];
					Static176.anInt3875 = Static176.anInt3875 + 1 & 0x7F;
					if (local31 < 0) {
						Static345.aBooleanArray30[~local31] = false;
					} else {
						Static345.aBooleanArray30[local31] = true;
					}
				}
			} else {
				for (local31 = 0; local31 < 112; local31++) {
					Static345.aBooleanArray30[local31] = false;
				}
				Static115.anInt2550 = Static176.anInt3875;
			}
			Static182.anInt3773 = Static260.anInt5000;
		}
	}
}
