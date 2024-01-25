import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!bm;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!jj;")
	public static Class98 aClass98_8;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "Lclient!nc;")
	public static Class133 aClass133_5;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ah;")
	public static RuntimeException_Sub1 method5190(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIII)V")
	public static void method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg3 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (arg1 >= Static228.anInt920 && Static307.anInt6214 >= arg1) {
			local91 = Static24.method734(Static96.anInt2180, arg2 + arg4, Static124.anInt4221);
			local100 = Static24.method734(Static96.anInt2180, arg4 - arg2, Static124.anInt4221);
			Static205.method3670(arg0, local91, Static146.anIntArrayArray91[arg1], local100);
		}
		@Pc(114) int local114 = (arg3 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local77 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local7++;
				local77 += local55;
				local63 += local55;
			}
			local38 += -local114;
			local47 += -local71;
			local71 -= local51;
			local114 -= local51;
			local9--;
			local91 = arg1 - local9;
			local100 = local9 + arg1;
			if (Static228.anInt920 <= local100 && Static307.anInt6214 >= local91) {
				@Pc(203) int local203 = Static24.method734(Static96.anInt2180, local7 + arg4, Static124.anInt4221);
				@Pc(212) int local212 = Static24.method734(Static96.anInt2180, arg4 - local7, Static124.anInt4221);
				if (Static228.anInt920 <= local91) {
					Static205.method3670(arg0, local203, Static146.anIntArrayArray91[local91], local212);
				}
				if (Static307.anInt6214 >= local100) {
					Static205.method3670(arg0, local203, Static146.anIntArrayArray91[local100], local212);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5193(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static335.aClass93_114.method2819(Static21.anInt455) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static128.aClass93_53.method2819(Static21.anInt455) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	public static void method5194() {
		if (Static202.anInt3957 == -1 || Static44.anInt988 == -1) {
			return;
		}
		@Pc(24) int local24 = Static99.anInt2255 + ((Static76.anInt1626 - Static99.anInt2255) * Static304.anInt6124 >> 16);
		Static304.anInt6124 += local24;
		if (Static304.anInt6124 < 65535) {
			Static106.aBoolean205 = false;
			Static99.aBoolean196 = false;
		} else {
			if (Static106.aBoolean205) {
				Static99.aBoolean196 = false;
			} else {
				Static99.aBoolean196 = true;
			}
			Static304.anInt6124 = 65535;
			Static106.aBoolean205 = true;
		}
		@Pc(56) float local56 = (float) Static304.anInt6124 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static139.anInt2896 * 2;
		@Pc(89) int local89;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(144) int local144;
		@Pc(163) int local163;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = anIntArrayArrayArray13[Static202.anInt3957][local63][local65] * 3;
			local89 = anIntArrayArrayArray13[Static202.anInt3957][local63 + 1][local65] * 3;
			local123 = (anIntArrayArrayArray13[Static202.anInt3957][local63 + 2][local65] + anIntArrayArrayArray13[Static202.anInt3957][local63 + 2][local65] - anIntArrayArrayArray13[Static202.anInt3957][local63 + 3][local65]) * 3;
			local131 = anIntArrayArrayArray13[Static202.anInt3957][local63][local65];
			local136 = local89 - local77;
			local144 = local123 + local77 - local89 * 2;
			local163 = anIntArrayArrayArray13[Static202.anInt3957][local63 + 2][local65] + local89 - local123 - local131;
			local59[local65] = (float) local131 + ((float) local136 + ((float) local163 * local56 + (float) local144) * local56) * local56;
		}
		Static163.anInt1495 = (int) local59[1] * -1;
		Static290.anInt5837 = (int) local59[2] - Static342.anInt6864 * 128;
		Static287.anInt5819 = (int) local59[0] - Static138.anInt2879 * 128;
		@Pc(215) float[] local215 = new float[3];
		local89 = Static308.anInt5052 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = anIntArrayArrayArray13[Static44.anInt988][local89][local123] * 3;
			local136 = anIntArrayArrayArray13[Static44.anInt988][local89 + 1][local123] * 3;
			local144 = (anIntArrayArrayArray13[Static44.anInt988][local89 + 2][local123] + anIntArrayArrayArray13[Static44.anInt988][local89 + 2][local123] - anIntArrayArrayArray13[Static44.anInt988][local89 + 3][local123]) * 3;
			local163 = anIntArrayArrayArray13[Static44.anInt988][local89][local123];
			@Pc(290) int local290 = local136 - local131;
			@Pc(299) int local299 = local131 + local144 - local136 * 2;
			@Pc(317) int local317 = anIntArrayArrayArray13[Static44.anInt988][local89 + 2][local123] + local136 - local163 - local144;
			local215[local123] = local56 * (local56 * ((float) local299 + (float) local317 * local56) + (float) local290) + (float) local163;
		}
		@Pc(349) float local349 = local215[0] - local59[0];
		@Pc(360) float local360 = (local215[1] - local59[1]) * -1.0F;
		@Pc(369) float local369 = local215[2] - local59[2];
		@Pc(379) double local379 = Math.sqrt((double) (local349 * local349 + local369 * local369));
		Static283.anInt5723 = (int) (Math.atan2((double) local360, local379) * 2607.5945876176133D) & 0x3FFF;
		Static291.anInt5883 = (int) (-Math.atan2((double) local349, (double) local369) * 2607.5945876176133D) & 0x3FFF;
		Static344.anInt6885 = anIntArrayArrayArray13[Static202.anInt3957][local63][3] + ((anIntArrayArrayArray13[Static202.anInt3957][local63 + 2][3] - anIntArrayArrayArray13[Static202.anInt3957][local63][3]) * Static304.anInt6124 >> 16);
	}
}
