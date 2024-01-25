import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "[Lclient!ea;")
	public static Class82[] aClass82Array2;

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lclient!at;")
	public static Class24 aClass24_13 = null;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ql;Z)V")
	public static void method5562(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.aClass3_Sub1_Sub3_Sub3_1 = null;
		if (Static156.anInt3957 < 20) {
			Static277.aClass325_3.method8013(arg0);
			Static156.anInt3957++;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
	public static int method5563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static64.method1966(4, arg1 + 91923, arg0 + 45365) + (Static64.method1966(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static64.method1966(1, arg1, arg0) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!wea;III)Ljava/awt/Frame;")
	public static Frame method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class370 arg2, @OriginalArg(3) int arg3) {
		if (!arg2.method9082()) {
			return null;
		}
		@Pc(20) Class25[] local20 = Static212.method4179(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg1 == local20[local28].anInt577 && local20[local28].anInt581 == arg0 && (!local26 || arg3 < local20[local28].anInt576)) {
				arg3 = local20[local28].anInt576;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(101) Class240 local101 = arg2.method9064(arg0, arg3, arg1);
		while (local101.anInt7566 == 0) {
			Static190.method3914(10L);
		}
		@Pc(116) Frame local116 = (Frame) local101.anObject13;
		if (local116 == null) {
			return null;
		} else if (local101.anInt7566 == 2) {
			Static265.method4893(local116, arg2);
			return null;
		} else {
			return local116;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIILclient!ha;ILclient!d;)V")
	public static void method5565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface4 arg5) {
		if (Static124.anInt11089 < 100) {
			Static477.method7481(arg5, arg3);
		}
		arg3.KA(arg0, arg4, arg1 + arg0, arg4 + arg2);
		@Pc(37) int local37;
		@Pc(48) int local48;
		if (Static124.anInt11089 < 100) {
			local37 = arg1 / 2 + arg0;
			local48 = arg4 + arg2 / 2 - 18 - 20;
			arg3.aa(arg0, arg4, arg1, arg2, -16777216, 0);
			arg3.method7231(local37 - 152, local48, 304, 34, Static272.aColorArray3[Static510.anInt9347].getRGB(), 0);
			arg3.aa(local37 - 150, local48 + 2, Static124.anInt11089 * 3, 30, Static43.aColorArray5[Static510.anInt9347].getRGB(), 0);
			Static571.aClass68_12.method8106(local37, Static202.aColorArray2[Static510.anInt9347].getRGB(), Static588.aClass351_20.method8691(Static476.anInt8915), -1, local48 + 20);
			return;
		}
		@Pc(114) int local114 = Static491.anInt9082 - (int) ((float) arg1 / Static303.aFloat5);
		local37 = (int) ((float) arg2 / Static303.aFloat5) + Static536.anInt9677;
		local48 = (int) ((float) arg1 / Static303.aFloat5) + Static491.anInt9082;
		Static528.anInt9612 = Static536.anInt9677 - (int) ((float) arg2 / Static303.aFloat5);
		Static158.anInt3976 = Static491.anInt9082 - (int) ((float) arg1 / Static303.aFloat5);
		@Pc(157) int local157 = Static536.anInt9677 - (int) ((float) arg2 / Static303.aFloat5);
		Static449.anInt8346 = (int) ((float) (arg2 * 2) / Static303.aFloat5);
		Static221.anInt4940 = (int) ((float) (arg1 * 2) / Static303.aFloat5);
		Static303.method148(local114 + Static303.anInt110, local37 + Static303.anInt108, local48 + Static303.anInt110, Static303.anInt108 + local157, arg0, arg4, arg1 + arg0, arg2 + arg4 + 1);
		Static303.method145(arg3);
		@Pc(210) Class341 local210 = Static303.method155(arg3);
		Static67.method2080(local210, arg3);
		if (Static302.anInt6299 > 0) {
			Static422.anInt7962--;
			if (Static422.anInt7962 == 0) {
				Static302.anInt6299--;
				Static422.anInt7962 = 20;
			}
		}
		if (!Static624.aBoolean742) {
			return;
		}
		@Pc(244) int local244 = arg0 + arg1 - 5;
		@Pc(250) int local250 = arg2 + arg4 - 8;
		Static300.aClass68_4.method8100("Fps:" + Static290.anInt6169, local250, 16776960, local244, -1);
		@Pc(267) int local267 = local250 - 15;
		@Pc(269) Runtime local269 = Runtime.getRuntime();
		@Pc(279) int local279 = (int) ((local269.totalMemory() - local269.freeMemory()) / 1024L);
		@Pc(281) int local281 = 16776960;
		if (local279 > 65536) {
			local281 = 16711680;
		}
		Static300.aClass68_4.method8100("Mem:" + local279 + "k", local267, local281, local244, -1);
		local250 = local267 - 15;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method5569() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static47.anInt1794; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static209.anInt4742; local17++) {
				if (Static47.method1689(local17, Static395.aClass100ArrayArrayArray3, local13, local11, true)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}
}
