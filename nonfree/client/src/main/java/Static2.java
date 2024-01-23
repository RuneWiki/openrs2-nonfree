import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
	public static int anInt59;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
	public static int anInt62 = 0;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
	public static volatile int anInt65 = 0;

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "[I")
	public static int[] anIntArray12 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIBI)Lclient!un;")
	public static Class181 method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(41) long local41 = (long) arg2 & 0xFFFFL | ((long) arg3 & 0xFFFFL) << 16 | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32;
		@Pc(49) Class181 local49 = (Class181) Static48.aClass157_10.method4031(local41);
		if (local49 != null) {
			return local49;
		}
		@Pc(58) Class189 local58 = Static262.method4104(arg2);
		@Pc(60) Class8[] local60 = null;
		if (local58.anIntArray575 != null) {
			local60 = new Class8[local58.anIntArray575.length];
			for (@Pc(70) int local70 = 0; local70 < local60.length; local70++) {
				@Pc(85) Class32 local85 = Static20.method343(local58.anIntArray575[local70]);
				local60[local70] = new Class8(local85.anInt1199, local85.anInt1195, local85.anInt1196, local85.anInt1194, local85.anInt1193, local85.anInt1197, local85.anInt1203, local85.aBoolean82);
			}
		}
		local49 = new Class181(local58.anInt5894, local60, local58.anInt5898, arg0, arg1, arg3);
		Static48.aClass157_10.method4026(local41, local49);
		return local49;
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
	public static void method73() {
		for (@Pc(11) int local11 = 0; local11 < Static76.anInt1889; local11++) {
			@Pc(22) int local22 = Static278.anIntArray524[local11]--;
			if (Static278.anIntArray524[local11] >= -10) {
				@Pc(100) Class173 local100 = Static73.aClass173Array1[local11];
				if (local100 == null) {
					local100 = Static326.method4332(Static185.aClass42_101, Static10.anIntArray26[local11], 0);
					if (local100 == null) {
						continue;
					}
					Static278.anIntArray524[local11] += local100.method4330();
					Static73.aClass173Array1[local11] = local100;
				}
				if (Static278.anIntArray524[local11] < 0) {
					@Pc(234) int local234;
					if (Static246.anIntArray478[local11] == 0) {
						local234 = Static99.anInt2343 * Static29.anIntArray64[local11] >> 8;
					} else {
						@Pc(144) int local144 = Static246.anIntArray478[local11] >> 16 & 0xFF;
						@Pc(152) int local152 = (Static246.anIntArray478[local11] & 0xFF) * 128;
						@Pc(162) int local162 = local144 * 128 + 64 - Static22.aClass15_Sub2_Sub2_1.anInt5358;
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(179) int local179 = Static246.anIntArray478[local11] >> 8 & 0xFF;
						@Pc(189) int local189 = local179 * 128 + 64 - Static22.aClass15_Sub2_Sub2_1.anInt5371;
						if (local189 < 0) {
							local189 = -local189;
						}
						@Pc(204) int local204 = local189 + local162 - 128;
						if (local204 > local152) {
							Static278.anIntArray524[local11] = -100;
							continue;
						}
						if (local204 < 0) {
							local204 = 0;
						}
						local234 = (local152 - local204) * Static201.anInt4203 * Static29.anIntArray64[local11] / local152 >> 8;
					}
					if (local234 > 0) {
						@Pc(251) Class2_Sub19_Sub1 local251 = local100.method4333().method2904(Static99.aClass23_1);
						@Pc(256) Class2_Sub3_Sub2 local256 = Static316.method401(local251, local234);
						local256.method405(Static193.anIntArray403[local11] - 1);
						Static173.aClass2_Sub3_Sub4_2.method4657(local256);
					}
					Static278.anIntArray524[local11] = -100;
				}
			} else {
				Static76.anInt1889--;
				for (@Pc(39) int local39 = local11; local39 < Static76.anInt1889; local39++) {
					Static10.anIntArray26[local39] = Static10.anIntArray26[local39 + 1];
					Static73.aClass173Array1[local39] = Static73.aClass173Array1[local39 + 1];
					Static193.anIntArray403[local39] = Static193.anIntArray403[local39 + 1];
					Static278.anIntArray524[local39] = Static278.anIntArray524[local39 + 1];
					Static246.anIntArray478[local39] = Static246.anIntArray478[local39 + 1];
					Static29.anIntArray64[local39] = Static29.anIntArray64[local39 + 1];
				}
				local11--;
			}
		}
		if (Static297.aBoolean384 && !Static90.method1596()) {
			if (Static287.anInt5651 != 0 && Static7.anInt116 != -1) {
				Static237.method3831(Static7.anInt116, Static287.anInt5651, Static251.aClass42_77);
			}
			Static297.aBoolean384 = false;
		} else if (Static287.anInt5651 != 0 && Static7.anInt116 != -1 && !Static90.method1596()) {
			Static211.aClass2_Sub16_Sub1_2.method2198(151);
			Static211.aClass2_Sub16_Sub1_2.method2186(Static7.anInt116);
			Static7.anInt116 = -1;
		}
	}
}
