import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!q;")
	public static Class205 aClass205_6;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!ik;")
	public static Class135 aClass135_4;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Z")
	public static boolean aBoolean676;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt9236;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_124 = new Class158(82, 2);

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt9232 = 0;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public static int anInt9235 = -1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method7629() {
		if (Static443.anInt8112 == -1 || Static418.anInt7807 == -1) {
			return;
		}
		@Pc(24) int local24 = Static212.anInt4650 + (Static166.anInt6798 * (Static386.anInt7128 - Static212.anInt4650) >> 16);
		Static166.anInt6798 += local24;
		if (Static166.anInt6798 < 65535) {
			Static4.aBoolean655 = false;
			Static396.aBoolean511 = false;
		} else {
			if (Static4.aBoolean655) {
				Static396.aBoolean511 = false;
			} else {
				Static396.aBoolean511 = true;
			}
			Static166.anInt6798 = 65535;
			Static4.aBoolean655 = true;
		}
		@Pc(54) float local54 = (float) Static166.anInt6798 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static266.anInt5524 * 2;
		@Pc(87) int local87;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(162) int local162;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static395.anIntArrayArrayArray20[Static443.anInt8112][local61][local63] * 3;
			local87 = Static395.anIntArrayArrayArray20[Static443.anInt8112][local61 + 1][local63] * 3;
			local121 = (Static395.anIntArrayArrayArray20[Static443.anInt8112][local61 + 2][local63] + Static395.anIntArrayArrayArray20[Static443.anInt8112][local61 + 2][local63] - Static395.anIntArrayArrayArray20[Static443.anInt8112][local61 + 3][local63]) * 3;
			local129 = Static395.anIntArrayArrayArray20[Static443.anInt8112][local61][local63];
			local134 = local87 - local75;
			local143 = local75 + local121 - local87 * 2;
			local162 = Static395.anIntArrayArrayArray20[Static443.anInt8112][local61 + 2][local63] + local87 - local121 - local129;
			local57[local63] = local54 * ((float) local134 + ((float) local143 + local54 * (float) local162) * local54) + (float) local129;
		}
		Static311.anInt6050 = (int) local57[0] - Static223.anInt4827 * 512;
		Static347.anInt6620 = (int) local57[1] * -1;
		Static329.anInt6297 = (int) local57[2] - Static150.anInt3027 * 512;
		@Pc(216) float[] local216 = new float[3];
		local87 = Static46.anInt1081 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static395.anIntArrayArrayArray20[Static418.anInt7807][local87][local121] * 3;
			local134 = Static395.anIntArrayArrayArray20[Static418.anInt7807][local87 + 1][local121] * 3;
			local143 = (Static395.anIntArrayArrayArray20[Static418.anInt7807][local87 + 2][local121] + Static395.anIntArrayArrayArray20[Static418.anInt7807][local87 + 2][local121] - Static395.anIntArrayArrayArray20[Static418.anInt7807][local87 + 3][local121]) * 3;
			local162 = Static395.anIntArrayArrayArray20[Static418.anInt7807][local87][local121];
			@Pc(291) int local291 = local134 - local129;
			@Pc(300) int local300 = local143 + local129 - local134 * 2;
			@Pc(318) int local318 = local134 + Static395.anIntArrayArrayArray20[Static418.anInt7807][local87 - -2][local121] - local143 - local162;
			local216[local121] = (((float) local300 + local54 * (float) local318) * local54 + (float) local291) * local54 + (float) local162;
		}
		@Pc(351) float local351 = local216[0] - local57[0];
		@Pc(361) float local361 = (local216[1] - local57[1]) * -1.0F;
		@Pc(370) float local370 = local216[2] - local57[2];
		@Pc(380) double local380 = Math.sqrt((double) (local370 * local370 + local351 * local351));
		Static27.anInt778 = (int) (Math.atan2((double) local361, local380) * 2607.5945876176133D) & 0x3FFF;
		Static262.anInt5491 = (int) (-Math.atan2((double) local351, (double) local370) * 2607.5945876176133D) & 0x3FFF;
		Static100.anInt2054 = Static395.anIntArrayArrayArray20[Static443.anInt8112][local61][3] + (Static166.anInt6798 * (Static395.anIntArrayArrayArray20[Static443.anInt8112][local61 + 2][3] - Static395.anIntArrayArrayArray20[Static443.anInt8112][local61][3]) >> 16);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method7635(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg1, 2);
		local8.method6211();
		local8.aString61 = arg0;
	}
}
