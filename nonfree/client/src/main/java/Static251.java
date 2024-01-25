import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "Lclient!pq;")
	public static Class251 aClass251_87;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "Lclient!pq;")
	public static Class251 aClass251_88;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	public static final int anInt4829 = Static154.method2268(1600);

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
	public static void method4150() {
		if (Static141.anInt2540 == -1 || Static544.anInt9197 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static395.anInt6993 * (Static232.anInt3958 - Static263.anInt4339) >> 16) + Static263.anInt4339;
		Static395.anInt6993 += local24;
		if (Static395.anInt6993 >= 65535) {
			if (Static82.aBoolean95) {
				Static123.aBoolean140 = false;
			} else {
				Static123.aBoolean140 = true;
			}
			Static395.anInt6993 = 65535;
			Static82.aBoolean95 = true;
		} else {
			Static123.aBoolean140 = false;
			Static82.aBoolean95 = false;
		}
		@Pc(56) float local56 = (float) Static395.anInt6993 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static29.anInt524 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(161) int local161;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static215.anIntArrayArrayArray7[Static141.anInt2540][local63][local65] * 3;
			local89 = Static215.anIntArrayArrayArray7[Static141.anInt2540][local63 + 1][local65] * 3;
			local122 = (Static215.anIntArrayArrayArray7[Static141.anInt2540][local63 + 2][local65] + Static215.anIntArrayArrayArray7[Static141.anInt2540][local63 + 2][local65] - Static215.anIntArrayArrayArray7[Static141.anInt2540][local63 + 3][local65]) * 3;
			local130 = Static215.anIntArrayArrayArray7[Static141.anInt2540][local63][local65];
			local135 = local89 - local77;
			local143 = local122 + local77 - local89 * 2;
			local161 = Static215.anIntArrayArrayArray7[Static141.anInt2540][local63 + 2][local65] + local89 - local122 - local130;
			local59[local65] = local56 * (((float) local161 * local56 + (float) local143) * local56 + (float) local135) + (float) local130;
		}
		Static388.anInt6921 = (int) local59[0] - Static218.anInt3718 * 512;
		Static33.anInt568 = (int) local59[1] * -1;
		Static220.anInt3753 = (int) local59[2] - Static167.anInt3048 * 512;
		@Pc(214) float[] local214 = new float[3];
		local89 = Static246.anInt4088 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static215.anIntArrayArrayArray7[Static544.anInt9197][local89][local122] * 3;
			local135 = Static215.anIntArrayArrayArray7[Static544.anInt9197][local89 + 1][local122] * 3;
			local143 = (Static215.anIntArrayArrayArray7[Static544.anInt9197][local89 + 2][local122] + Static215.anIntArrayArrayArray7[Static544.anInt9197][local89 + 2][local122] - Static215.anIntArrayArrayArray7[Static544.anInt9197][local89 - -3][local122]) * 3;
			local161 = Static215.anIntArrayArrayArray7[Static544.anInt9197][local89][local122];
			@Pc(290) int local290 = local135 - local130;
			@Pc(299) int local299 = local130 + local143 - local135 * 2;
			@Pc(317) int local317 = local135 + Static215.anIntArrayArrayArray7[Static544.anInt9197][local89 + 2][local122] - local143 - local161;
			local214[local122] = (float) local161 + (((float) local299 + local56 * (float) local317) * local56 + (float) local290) * local56;
		}
		@Pc(350) float local350 = local214[0] - local59[0];
		@Pc(361) float local361 = (local214[1] - local59[1]) * -1.0F;
		@Pc(370) float local370 = local214[2] - local59[2];
		@Pc(380) double local380 = Math.sqrt((double) (local370 * local370 + local350 * local350));
		Static162.anInt2840 = (int) (Math.atan2((double) local361, local380) * 2607.5945876176133D) & 0x3FFF;
		Static261.anInt4257 = (int) (-Math.atan2((double) local350, (double) local370) * 2607.5945876176133D) & 0x3FFF;
		Static218.anInt3720 = ((Static215.anIntArrayArrayArray7[Static141.anInt2540][local63 + 2][3] - Static215.anIntArrayArrayArray7[Static141.anInt2540][local63][3]) * Static395.anInt6993 >> 16) + Static215.anIntArrayArrayArray7[Static141.anInt2540][local63][3];
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BILclient!fca;ILclient!fa;IJII)V")
	public static void method4152(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class16 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = arg6 * arg6 + arg0 * arg0;
		if ((long) local19 > arg5) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg1.anInt2340 / 2, arg1.anInt2305 / 2);
		if (local19 <= local35 * local35) {
			Static518.method2902(arg0, arg6, arg2, arg7, arg3, arg1, Static367.aClass4Array12[arg4]);
			return;
		}
		local35 -= 10;
		@Pc(65) int local65;
		if (Static354.anInt6233 == 4) {
			local65 = (int) Static399.aFloat167 & 0x3FFF;
		} else {
			local65 = Static574.anInt6272 + (int) Static399.aFloat167 & 0x3FFF;
		}
		@Pc(78) int local78 = Class138.anIntArray392[local65];
		@Pc(82) int local82 = Class138.anIntArray393[local65];
		if (Static354.anInt6233 != 4) {
			local78 = local78 * 256 / (Static291.anInt4749 + 256);
			local82 = local82 * 256 / (Static291.anInt4749 + 256);
		}
		@Pc(112) int local112 = local78 * arg0 + arg6 * local82 >> 14;
		@Pc(123) int local123 = arg0 * local82 - local78 * arg6 >> 14;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local35);
		@Pc(143) int local143 = (int) ((double) local35 * Math.cos(local129));
		Static384.aClass4Array13[arg4].method6512((float) local136 + (float) arg2 + (float) arg1.anInt2340 / 2.0F, (float) -local143 + (float) arg7 + (float) arg1.anInt2305 / 2.0F, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}
}
