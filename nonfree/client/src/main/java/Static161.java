import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "[Lclient!tl;")
	public static Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!hia;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Lclient!nca;")
	public static Class254 aClass254_61;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Lclient!pm;")
	public static final Class295 aClass295_5 = new Class295(1);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!vo;III)Ljava/awt/Frame;")
	public static Frame method2377(@OriginalArg(1) int arg0, @OriginalArg(2) Class389 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method9275()) {
			return null;
		}
		@Pc(24) Class242[] local24 = Static310.method4326(arg1);
		if (local24 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local24.length; local33++) {
			if (local24[local33].anInt6519 == arg2 && arg3 == local24[local33].anInt6517 && (!local31 || arg0 < local24[local33].anInt6516)) {
				local31 = true;
				arg0 = local24[local33].anInt6516;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(123) Class163 local123 = arg1.method9274(arg2, arg0, arg3);
		while (local123.anInt3843 == 0) {
			Static570.method7907(10L);
		}
		@Pc(140) Frame local140 = (Frame) local123.anObject5;
		if (local140 == null) {
			return null;
		} else if (local123.anInt3843 == 2) {
			Static94.method1458(local140, arg1);
			return null;
		} else {
			return local140;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(ZII)V")
	public static void method2378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(16, (long) arg0);
		local14.method6239();
		local14.anInt6936 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)Z")
	public static boolean method2380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static154.method2199(arg0, arg1) || Static207.method2929(arg0, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method2381() {
		for (@Pc(8) int local8 = 0; local8 < Static672.anInt10469; local8++) {
			Static437.aClass252Array3[local8] = null;
		}
		Static672.anInt10469 = 0;
		@Pc(38) int local38;
		@Pc(42) int local42;
		for (@Pc(32) int local32 = 0; local32 < Static97.anInt1761; local32++) {
			for (local38 = 0; local38 < Static372.anInt5930; local38++) {
				for (local42 = 0; local42 < Static545.anInt8590; local42++) {
					@Pc(52) Class311 local52 = Static632.aClass311ArrayArrayArray3[local32][local42][local38];
					if (local52 != null) {
						if (local52.aShort111 > 0) {
							local52.aShort111 = (short) (local52.aShort111 * -1);
						}
						if (local52.aShort114 > 0) {
							local52.aShort114 = (short) (local52.aShort114 * -1);
						}
					}
				}
			}
		}
		for (local38 = 0; local38 < Static97.anInt1761; local38++) {
			for (local42 = 0; local42 < Static372.anInt5930; local42++) {
				for (@Pc(117) int local117 = 0; local117 < Static545.anInt8590; local117++) {
					@Pc(127) Class311 local127 = Static632.aClass311ArrayArrayArray3[local38][local117][local42];
					if (local127 != null) {
						@Pc(153) boolean local153 = Static632.aClass311ArrayArrayArray3[0][local117][local42] != null && Static632.aClass311ArrayArrayArray3[0][local117][local42].aClass311_1 != null;
						@Pc(158) int local158;
						@Pc(160) int local160;
						@Pc(174) Class311 local174;
						@Pc(184) int local184;
						@Pc(372) int local372;
						@Pc(389) int local389;
						@Pc(396) int local396;
						@Pc(413) int local413;
						@Pc(420) int local420;
						@Pc(424) int local424;
						@Pc(428) int local428;
						@Pc(434) int local434;
						@Pc(473) int local473;
						@Pc(477) int local477;
						if (local127.aShort114 < 0) {
							local158 = local42;
							local160 = local42;
							local174 = Static632.aClass311ArrayArrayArray3[local38][local117][local42 - 1];
							local184 = Static126.aClass133Array1[local38].method8217(local117, local42);
							while (local158 > 0 && local174 != null && local174.aShort114 < 0 && local174.aShort114 == local127.aShort114 && local127.aShort113 == local174.aShort113 && local184 == Static126.aClass133Array1[local38].method8217(local117, local158 - 1) && (local158 - 1 <= 0 || Static126.aClass133Array1[local38].method8217(local117, local158 - 2) == local184)) {
								local158--;
								local174 = Static632.aClass311ArrayArrayArray3[local38][local117][local158 - 1];
							}
							for (local174 = Static632.aClass311ArrayArrayArray3[local38][local117][local42 + 1]; local160 < Static545.anInt8590 && local174 != null && local174.aShort114 < 0 && local174.aShort114 == local127.aShort114 && local174.aShort113 == local127.aShort113 && local184 == Static126.aClass133Array1[local38].method8217(local117, local160 + 1) && (Static545.anInt8590 <= local160 + 1 || local184 == Static126.aClass133Array1[local38].method8217(local117, local160 + 2)); local174 = Static632.aClass311ArrayArrayArray3[local38][local117][local160 + 1]) {
								local160++;
							}
							local372 = local38 + 1 - local38;
							local389 = Static126.aClass133Array1[local153 ? local38 + 1 : local38].method8217(local117, local158);
							local396 = local389 + local372 * local127.aShort114;
							local413 = Static126.aClass133Array1[local153 ? local38 + 1 : local38].method8217(local117, local160 + 1);
							local420 = local127.aShort114 * local372 + local413;
							local424 = local117 << Static260.anInt4053;
							local428 = local158 << Static260.anInt4053;
							local434 = Static60.anInt1042 + (local160 << Static260.anInt4053);
							Static437.aClass252Array3[Static672.anInt10469++] = new Class252(1, local38, local127.aShort113 + local424, local127.aShort113 + local424, local424 + local127.aShort113, local424 + local127.aShort113, local389, local413, local420, local396, local428, local434, local434, local428);
							for (local473 = local38; local473 <= local38; local473++) {
								for (local477 = local158; local477 <= local160; local477++) {
									Static632.aClass311ArrayArrayArray3[local473][local117][local477].aShort114 = (short) (Static632.aClass311ArrayArrayArray3[local473][local117][local477].aShort114 * -1);
								}
							}
						}
						if (local127.aShort111 < 0) {
							local158 = local117;
							local160 = local117;
							local174 = Static632.aClass311ArrayArrayArray3[local38][local117 - 1][local42];
							local184 = Static126.aClass133Array1[local38].method8217(local117, local42);
							while (local158 > 0 && local174 != null && local174.aShort111 < 0 && local174.aShort111 == local127.aShort111 && local127.aShort112 == local174.aShort112 && Static126.aClass133Array1[local38].method8217(local158 - 1, local42) == local184 && (local158 - 1 <= 0 || Static126.aClass133Array1[local38].method8217(local158 - 2, local42) == local184)) {
								local158--;
								local174 = Static632.aClass311ArrayArrayArray3[local38][local158 - 1][local42];
							}
							for (local174 = Static632.aClass311ArrayArrayArray3[local38][local117 + 1][local42]; Static372.anInt5930 > local160 && local174 != null && local174.aShort111 < 0 && local174.aShort111 == local127.aShort111 && local127.aShort112 == local174.aShort112 && Static126.aClass133Array1[local38].method8217(local160 + 1, local42) == local184 && (local160 + 1 >= Static372.anInt5930 || local184 == Static126.aClass133Array1[local38].method8217(local160 + 2, local42)); local174 = Static632.aClass311ArrayArrayArray3[local38][local160 + 1][local42]) {
								local160++;
							}
							local372 = local38 + 1 - local38;
							local389 = Static126.aClass133Array1[local153 ? local38 + 1 : local38].method8217(local158, local42);
							local396 = local127.aShort111 * local372 + local389;
							local413 = Static126.aClass133Array1[local153 ? local38 + 1 : local38].method8217(local160 + 1, local42);
							local420 = local413 + local372 * local127.aShort111;
							local424 = local158 << Static260.anInt4053;
							local428 = (local160 << Static260.anInt4053) + Static60.anInt1042;
							local434 = local42 << Static260.anInt4053;
							Static437.aClass252Array3[Static672.anInt10469++] = new Class252(2, local38, local424, local428, local428, local424, local389, local413, local420, local396, local434 + local127.aShort112, local127.aShort112 + local434, local127.aShort112 + local434, local127.aShort112 + local434);
							for (local473 = local38; local473 <= local38; local473++) {
								for (local477 = local158; local477 <= local160; local477++) {
									Static632.aClass311ArrayArrayArray3[local473][local477][local42].aShort111 = (short) (Static632.aClass311ArrayArrayArray3[local473][local477][local42].aShort111 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static30.aBoolean65 = true;
	}
}
