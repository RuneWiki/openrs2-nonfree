import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public static int anInt4133 = 0;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
	public static final int[] anIntArray393 = new int[32];

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!kp;")
	public static final Class167 aClass167_6 = new Class167(3);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)I")
	public static int method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static2.anIntArray75[arg0 & 0x3] : Static447.anIntArray694[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)V")
	public static void method3429(@OriginalArg(0) byte arg0) {
		if (Static58.aByteArrayArrayArray2 == null) {
			Static58.aByteArrayArrayArray2 = new byte[4][Static118.anInt2527][Static549.anInt9482];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static118.anInt2527; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static549.anInt9482; local22++) {
					Static58.aByteArrayArrayArray2[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public static void method3430() {
		Static515.aClass3_Sub27_Sub1_2.method7594(Static23.aClass161_84.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static480.aClass161_106.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static492.aClass161_109.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static469.aClass161_101.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static402.aClass161_107.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static307.aClass161_51.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static460.aClass161_42.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static549.aClass161_119.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static19.aClass161_7.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static345.aClass161_74.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static26.aClass161_9.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static494.aClass161_110.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static310.aClass161_61.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static62.aClass161_105.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static135.aClass161_28.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static365.aClass161_80.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static211.aClass161_49.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static197.aClass161_44.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static205.aClass161_46.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static350.aClass161_75.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static326.aClass161_66.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static350.aClass161_76.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static166.aClass161_78.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static4.aClass161_114.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static357.aClass161_77.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static424.aClass161_94.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static306.aClass161_60.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static191.aClass161_43.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static274.aClass161_59.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static70.aClass161_6.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static498.aClass161_113.method4253());
		Static515.aClass3_Sub27_Sub1_2.method7594(Static243.aClass161_54.method4253());
	}
}
