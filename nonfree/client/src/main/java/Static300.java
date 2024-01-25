import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[[Lclient!eo;")
	public static Class68[][] aClass68ArrayArray3;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_195 = new Class184(77, 10);

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "[B")
	public static final byte[] aByteArray62 = new byte[16384];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!mv;ZII)V")
	public static void method4441(@OriginalArg(1) Class1_Sub3_Sub3_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) int local12 = arg0.anIntArray453[0];
		@Pc(17) int local17 = arg0.anIntArray454[0];
		if (local12 < 0 || Static399.anInt6923 <= local12 || local17 < 0 || Static127.anInt2696 <= local17 || (arg1 < 0 || Static399.anInt6923 <= arg1 || arg2 < 0 || Static127.anInt2696 <= arg2)) {
			return;
		}
		@Pc(72) int local72 = Static183.method3360(arg0.method4831(), Static271.anIntArray429, true, arg1, local12, Static222.anIntArray325, Static389.aClass23Array1[arg0.aByte77], 0, -4, local17, 0, 0, arg2, 0);
		if (local72 >= 1 && local72 <= 3) {
			for (@Pc(86) int local86 = 0; local86 < local72 - 1; local86++) {
				arg0.method3932(Static271.anIntArray429[local86], Static222.anIntArray325[local86], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
	public static void method4442(@OriginalArg(0) boolean arg0) {
		Static157.method2732(Static337.anInt6221, Static385.anInt6686, arg0, Static120.anInt2616);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBI)I")
	public static int method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(31) int local31 = (arg0 & 0x7F) * arg2 + (arg1 & 0x7F) * local17 >> 7;
		@Pc(51) int local51 = local17 * (arg1 & 0x380) + arg2 * (arg0 & 0x380) >> 7;
		@Pc(65) int local65 = (arg1 & 0xFC00) * local17 + (arg0 & 0xFC00) * arg2 >> 7;
		return local65 & 0xFC00 | local51 & 0x380 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!m;BIIIILclient!qa;)V")
	public static void method4444(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		if (Static281.anInt5171 < 100) {
			Static54.method1101(arg0, arg5);
		}
		arg5.pa(arg4, arg1, arg3 + arg4, arg2 + arg1);
		@Pc(35) int local35;
		@Pc(47) int local47;
		if (Static281.anInt5171 < 100) {
			local35 = arg3 / 2 + arg4;
			local47 = arg1 + arg2 / 2 - 18 - 20;
			arg5.NA(arg4, arg1, arg3, arg2, -16777216, 0);
			arg5.method2637(local35 - 152, local47, 304, 34, Static376.aColorArray6[Static411.anInt7105].getRGB(), 0);
			arg5.NA(local35 - 150, local47 + 2, Static281.anInt5171 * 3, 30, Static233.aColorArray2[Static411.anInt7105].getRGB(), 0);
			Static399.aClass65_7.method5804(Static309.aClass175_184.method4201(Static216.anInt4257), local35, local47 + 20, Static149.aColorArray1[Static411.anInt7105].getRGB(), -1);
			return;
		}
		@Pc(111) int local111 = Static189.anInt3807 - (int) ((float) arg3 / Static210.aFloat97);
		local35 = Static372.anInt1537 + (int) ((float) arg2 / Static210.aFloat97);
		local47 = Static189.anInt3807 + (int) ((float) arg3 / Static210.aFloat97);
		@Pc(143) int local143 = Static372.anInt1537 - (int) ((float) arg2 / Static210.aFloat97);
		Static307.anInt5600 = Static372.anInt1537 - (int) ((float) arg2 / Static210.aFloat97);
		Static200.anInt3951 = Static189.anInt3807 - (int) ((float) arg3 / Static210.aFloat97);
		Static315.anInt5738 = (int) ((float) (arg2 * 2) / Static210.aFloat97);
		Static381.anInt2831 = (int) ((float) (arg3 * 2) / Static210.aFloat97);
		Static210.method5883(Static210.anInt7505 + local111, Static210.anInt7496 + local35, local47 + Static210.anInt7505, local143 + Static210.anInt7496, arg4, arg1, arg4 + arg3, arg1 + 1 + arg2);
		Static210.method5889(arg5);
		@Pc(205) Class229 local205 = Static210.method5886(arg5);
		Static401.method5433(local205, arg5);
		if (Static284.anInt5213 > 0) {
			Static27.anInt771--;
			if (Static27.anInt771 == 0) {
				Static284.anInt5213--;
				Static27.anInt771 = 20;
			}
		}
		if (!Static156.aBoolean259) {
			return;
		}
		@Pc(236) int local236 = arg3 + arg4 - 5;
		@Pc(242) int local242 = arg2 + arg1 - 8;
		Static277.aClass65_5.method5813(local236, local242, "Fps:" + Static53.anInt1285, 16776960);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static277.aClass65_5.method5813(local236, local257, "Mem:" + local268 + "k", local270);
		local242 = local257 - 15;
	}
}
