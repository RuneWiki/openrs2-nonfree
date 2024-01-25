import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ok", name = "T", descriptor = "Lclient!rm;")
	public static Class215 aClass215_8;

	@OriginalMember(owner = "client!ok", name = "Y", descriptor = "Lclient!vg;")
	public static Class250 aClass250_6;

	@OriginalMember(owner = "client!ok", name = "Q", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_175 = new Class214(5, 14);

	@OriginalMember(owner = "client!ok", name = "X", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_188 = new Class137(8, 7);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
	public static boolean method3776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!mt;Lclient!mt;B)V")
	public static void method3777(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0.aClass1_Sub3_55 != null) {
			arg0.method5312();
		}
		arg0.aClass1_Sub3_55 = arg1;
		arg0.aClass1_Sub3_56 = arg1.aClass1_Sub3_56;
		arg0.aClass1_Sub3_55.aClass1_Sub3_56 = arg0;
		arg0.aClass1_Sub3_56.aClass1_Sub3_55 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIILclient!qa;IILclient!m;)V")
	public static void method3779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class128 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface8 arg5) {
		if (Static37.anInt732 < 100) {
			Static287.method3735(arg5, arg2);
		}
		arg2.pa(arg4, arg3, arg4 + arg0, arg3 - -arg1);
		@Pc(42) int local42;
		@Pc(53) int local53;
		if (Static37.anInt732 < 100) {
			local42 = arg4 + arg0 / 2;
			local53 = arg1 / 2 + arg3 - 18 - 20;
			arg2.NA(arg4, arg3, arg0, arg1, -16777216, 0);
			arg2.method3593(local42 - 152, local53, 304, 34, Static18.aColorArray1[Static168.anInt2764].getRGB(), 0);
			arg2.NA(local42 - 150, local53 + 2, Static37.anInt732 * 3, 30, Static76.aColorArray3[Static168.anInt2764].getRGB(), 0);
			Static227.aClass16_1.method5495(Static64.aColorArray2[Static168.anInt2764].getRGB(), -1, local42, local53 + 20, Static335.aClass151_175.method3122(Static188.anInt3028));
			return;
		}
		@Pc(116) int local116 = Static257.anInt6932 - (int) ((float) arg0 / Static114.aFloat93);
		local42 = Static2.anInt3076 + (int) ((float) arg1 / Static114.aFloat93);
		local53 = Static257.anInt6932 + (int) ((float) arg0 / Static114.aFloat93);
		Static164.anInt2704 = Static257.anInt6932 - (int) ((float) arg0 / Static114.aFloat93);
		Static249.anInt4070 = (int) ((float) (arg0 * 2) / Static114.aFloat93);
		Static197.anInt3151 = (int) ((float) (arg1 * 2) / Static114.aFloat93);
		@Pc(165) int local165 = Static2.anInt3076 - (int) ((float) arg1 / Static114.aFloat93);
		Static95.anInt1676 = Static2.anInt3076 - (int) ((float) arg1 / Static114.aFloat93);
		Static114.method5217(Static114.anInt6798 + local116, local42 - -Static114.anInt6800, local53 + Static114.anInt6798, local165 + Static114.anInt6800, arg4, arg3, arg0 + arg4, arg1 + arg3 + 1);
		Static114.method5219(arg2);
		@Pc(203) Class254 local203 = Static114.method5214(arg2);
		Static302.method3964(local203, arg2);
		if (Static409.anInt6639 > 0) {
			Static92.anInt1629--;
			if (Static92.anInt1629 == 0) {
				Static409.anInt6639--;
				Static92.anInt1629 = 20;
			}
		}
		if (!Static365.aBoolean510) {
			return;
		}
		@Pc(237) int local237 = arg0 + arg4 - 5;
		@Pc(243) int local243 = arg1 + arg3 - 8;
		Static275.aClass16_2.method5492("Fps:" + Static38.anInt741, 16776960, local237, local243);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static275.aClass16_2.method5492("Mem:" + local269 + "k", local271, local237, local258);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V")
	public static void method3780() {
		@Pc(9) int local9 = (int) ((double) Static425.anInt6922 * 34.46D);
		local9 <<= 0x0;
		if (Static213.aClass128_22.method3570()) {
			local9 += 128;
		}
		Static213.aClass128_22.JA(50, local9);
	}
}
