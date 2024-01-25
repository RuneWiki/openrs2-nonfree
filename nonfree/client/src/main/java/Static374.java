import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
	public static int anInt6625;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "Lclient!po;")
	public static Class281 aClass281_6;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_129 = new Class126(84, 4);

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
	public static int[] anIntArray410 = new int[1];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5523(@OriginalArg(0) String arg0) {
		@Pc(6) Class3_Sub44 local6 = Static17.method714();
		local6.aClass3_Sub17_Sub2_3.method4849(Static97.aClass326_12.anInt8904);
		local6.aClass3_Sub17_Sub2_3.method4876(0);
		@Pc(21) int local21 = local6.aClass3_Sub17_Sub2_3.lb;
		local6.aClass3_Sub17_Sub2_3.method4876(642);
		@Pc(30) int[] local30 = Static419.method5981(local6);
		@Pc(34) int local34 = local6.aClass3_Sub17_Sub2_3.lb;
		local6.aClass3_Sub17_Sub2_3.method4878(arg0);
		local6.aClass3_Sub17_Sub2_3.method4849(Static319.anInt5939);
		local6.aClass3_Sub17_Sub2_3.lb += 7;
		local6.aClass3_Sub17_Sub2_3.method4863(local34, local6.aClass3_Sub17_Sub2_3.lb, local30);
		local6.aClass3_Sub17_Sub2_3.method4855(local6.aClass3_Sub17_Sub2_3.lb - local21);
		Static616.method8089(local6);
		Static99.anInt2127 = 0;
		Static30.anInt915 = 0;
		Static312.anInt5782 = -3;
		Static111.anInt10350 = 1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!ha;I)V")
	public static void method5524(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		if (!Static44.aBoolean107 || !Static262.aBoolean400) {
			Static447.anInt7715 = 0;
			return;
		}
		if (Static477.aBoolean614) {
			Static323.aLong148 = Static645.aClass171_1.method7250();
		}
		Static293.anInt5388 = 0;
		Static77.anInt1743 = 0;
		Static236.anInt4477 = 0;
		@Pc(33) int[] local33 = arg0.Y();
		Static665.anInt10247 = (int) ((float) local33[3] / 3.0F);
		Static420.anInt7096 = (int) ((float) local33[2] / 3.0F);
		arg0.method8190(Static174.anIntArray595);
		if (Static526.anInt8708 != (int) ((float) Static174.anIntArray595[0] / 3.0F) || Static652.anInt10051 != (int) ((float) Static174.anIntArray595[1] / 3.0F)) {
			Static526.anInt8708 = (int) ((float) Static174.anIntArray595[0] / 3.0F);
			Static652.anInt10051 = (int) ((float) Static174.anIntArray595[1] / 3.0F);
			Static600.anIntArray615 = new int[Static526.anInt8708 * Static652.anInt10051];
			Static626.anInt9703 = Static526.anInt8708 >> 1;
			Static643.anInt9908 = Static652.anInt10051 >> 1;
		}
		Static186.aClass25_2 = arg0.method8159();
		Static447.anInt7715 = 0;
		for (@Pc(114) int local114 = 0; local114 < Static114.anInt2292; local114++) {
			Static410.method5822(arg0, Static491.aClass167Array16[local114], arg1);
		}
		for (@Pc(129) int local129 = 0; local129 < Static246.anInt4586; local129++) {
			Static410.method5822(arg0, Static243.aClass167Array11[local129], arg1);
		}
		for (@Pc(144) int local144 = 0; local144 < Static22.anInt704; local144++) {
			Static410.method5822(arg0, Static67.aClass167Array15[local144], arg1);
		}
		Static594.anInt9366 = 0;
		if (Static447.anInt7715 > 0) {
			@Pc(164) int local164 = Static600.anIntArray615.length;
			@Pc(170) int local170 = local164 - local164 & 0x7;
			@Pc(172) int local172 = 0;
			while (local170 > local172) {
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
			}
			while (local172 < local164) {
				Static600.anIntArray615[local172++] = Integer.MAX_VALUE;
			}
			Static96.anInt2066 = 1;
			for (@Pc(231) int local231 = 0; local231 < Static447.anInt7715; local231++) {
				@Pc(237) Class167 local237 = Static142.aClass167Array12[local231];
				Static496.method7043(local237.aShortArray98[1], local237.aShortArray97[3], local237.aShortArray96[1], local237.aShortArray97[0], local237.aShortArray97[1], local237.aShortArray98[0], local237.aShortArray96[3], local237.aShortArray96[0], local237.aShortArray98[3]);
				Static496.method7043(local237.aShortArray98[2], local237.aShortArray97[3], local237.aShortArray96[2], local237.aShortArray97[1], local237.aShortArray97[2], local237.aShortArray98[1], local237.aShortArray96[3], local237.aShortArray96[1], local237.aShortArray98[3]);
			}
			Static96.anInt2066 = 2;
		}
		if (Static477.aBoolean614) {
			Static472.aLong231 = Static645.aClass171_1.method7250() - Static323.aLong148;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method5525(@OriginalArg(0) Class208 arg0) {
		if (arg0.anInt5611 == Static618.anInt9583) {
			Static119.aBooleanArray10[arg0.anInt5615] = true;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	public static int method5526(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
