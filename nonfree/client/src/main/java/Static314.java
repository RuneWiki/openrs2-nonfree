import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Lclient!od;")
	public static Class148 aClass148_4;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array24;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "Lclient!jm;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_174 = new Class34("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
	public static int anInt6116 = 1;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_55 = new Class87(50);

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
	public static int anInt6117 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!wo;I)V")
	public static void method5203(@OriginalArg(0) Class216 arg0) {
		Static53.aClass216_13 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V")
	public static void method5205() {
		if (Static275.aBoolean546) {
			Static91.aClass5_13 = null;
			Static77.aClass5_10 = null;
			Static275.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lclient!g;ILclient!uo;Lclient!ip;ZI)V")
	public static void method5206(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) boolean arg4) {
		@Pc(13) int local13;
		@Pc(30) int local30;
		if (!arg4) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (@Pc(9) int local9 = 0; local9 < Static233.anInt5573; local9++) {
					for (local13 = 0; local13 < Static134.anInt2971; local13++) {
						if ((Static200.aByteArrayArrayArray8[local5][local9][local13] & 0x1) != 0) {
							local30 = local5;
							if ((Static200.aByteArrayArrayArray8[1][local9][local13] & 0x2) != 0) {
								local30 = local5 - 1;
							}
							if (local30 >= 0) {
								arg0[local30].method1936(local13, local9);
							}
						}
					}
				}
			}
		}
		@Pc(80) int[][] local80 = new int[Static233.anInt5573][Static134.anInt2971];
		for (local13 = 0; local13 < arg1; local13++) {
			for (local30 = 0; local30 < Static134.anInt2971; local30++) {
				Static192.anIntArray375[local30] = 0;
				Static225.anIntArray419[local30] = 0;
				Static299.anIntArray107[local30] = 0;
				Static133.anIntArray263[local30] = 0;
				Static340.anIntArray521[local30] = 0;
			}
			for (@Pc(114) int local114 = -5; local114 < Static233.anInt5573; local114++) {
				@Pc(124) int local124;
				@Pc(141) int local141;
				@Pc(210) int local210;
				for (@Pc(118) int local118 = 0; local118 < Static134.anInt2971; local118++) {
					local124 = local114 + 5;
					@Pc(188) int local188;
					if (Static233.anInt5573 > local124) {
						local141 = Static332.aByteArrayArrayArray11[local13][local124][local118] & 0xFF;
						if (local141 > 0) {
							@Pc(152) Class181 local152 = Static269.method4742(local141 - 1);
							Static192.anIntArray375[local118] += local152.anInt5619;
							Static225.anIntArray419[local118] += local152.anInt5621;
							Static299.anIntArray107[local118] += local152.anInt5620;
							Static133.anIntArray263[local118] += local152.anInt5613;
							local188 = Static340.anIntArray521[local118]++;
						}
					}
					local141 = local114 - 5;
					if (local141 >= 0) {
						local210 = Static332.aByteArrayArrayArray11[local13][local141][local118] & 0xFF;
						if (local210 > 0) {
							@Pc(218) Class181 local218 = Static269.method4742(local210 - 1);
							Static192.anIntArray375[local118] -= local218.anInt5619;
							Static225.anIntArray419[local118] -= local218.anInt5621;
							Static299.anIntArray107[local118] -= local218.anInt5620;
							Static133.anIntArray263[local118] -= local218.anInt5613;
							local188 = Static340.anIntArray521[local118]--;
						}
					}
				}
				if (local114 >= 0) {
					local124 = 0;
					local141 = 0;
					local210 = 0;
					@Pc(274) int local274 = 0;
					@Pc(276) int local276 = 0;
					for (@Pc(278) int local278 = -5; local278 < Static134.anInt2971; local278++) {
						@Pc(284) int local284 = local278 + 5;
						if (Static134.anInt2971 > local284) {
							local141 += Static225.anIntArray419[local284];
							local274 += Static133.anIntArray263[local284];
							local124 += Static192.anIntArray375[local284];
							local276 += Static340.anIntArray521[local284];
							local210 += Static299.anIntArray107[local284];
						}
						@Pc(325) int local325 = local278 - 5;
						if (local325 >= 0) {
							local124 -= Static192.anIntArray375[local325];
							local274 -= Static133.anIntArray263[local325];
							local141 -= Static225.anIntArray419[local325];
							local210 -= Static299.anIntArray107[local325];
							local276 -= Static340.anIntArray521[local325];
						}
						if (local278 >= 0 && local274 > 0 && local276 > 0) {
							local80[local114][local278] = Static348.method5582(local124 * 256 / local274, local210 / local276, local141 / local276);
						}
					}
				}
			}
			Static262.method4655(local13, Static332.aByteArrayArrayArray11[local13], arg3, Static134.anInt2971, Static231.aByteArrayArrayArray9[local13], arg2, Static130.aByteArrayArrayArray5[local13], arg4, Static233.anInt5573, Static189.aByteArrayArrayArray6[local13], local80, Static298.aClass53Array3[local13]);
			Static332.aByteArrayArrayArray11[local13] = null;
			Static130.aByteArrayArrayArray5[local13] = null;
			Static231.aByteArrayArrayArray9[local13] = null;
			Static189.aByteArrayArrayArray6[local13] = null;
		}
		if (!arg4) {
			if (Static129.aBoolean269) {
				Static156.method3147();
			}
			if (Static163.anInt3549 != 0) {
				Static262.method4652();
			}
		}
		for (local30 = 0; local30 < arg1; local30++) {
			Static298.aClass53Array3[local30].method2787();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method5207() {
		Static144.anInt3144 = 0;
		Static99.anInt2377 = -1;
		Static239.anInt4960 = -1;
		Static266.anInt5402 = -1;
	}
}
