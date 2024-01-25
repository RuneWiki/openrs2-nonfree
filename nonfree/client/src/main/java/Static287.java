import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	public static int anInt5307;

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "[Lclient!vt;")
	public static final Class2_Sub24[] aClass2_Sub24Array1 = new Class2_Sub24[2048];

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
	public static int anInt5313 = 0;

	@OriginalMember(owner = "client!qk", name = "bb", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_79 = new Class183(65, 3);

	@OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
	public static int anInt5316 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4731(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static240.method4260(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static240.method4260(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(54) int local54 = local14 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local54);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static165.method2919(local75)) {
				@Pc(83) char local83 = Static116.method2079(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
	public static void method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub7_Sub2 local16 = Static328.method5290(14, arg1);
		local16.method1198();
		local16.anInt1465 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "(B)V")
	public static void method4734() {
		if (Static296.anInt5530 == -1 || Static123.anInt5935 == -1) {
			return;
		}
		@Pc(25) int local25 = ((Static62.anInt4763 - Static260.anInt4977) * Static248.anInt4822 >> 16) + Static260.anInt4977;
		Static248.anInt4822 += local25;
		if (Static248.anInt4822 >= 65535) {
			if (aBoolean390) {
				Static387.aBoolean499 = false;
			} else {
				Static387.aBoolean499 = true;
			}
			Static248.anInt4822 = 65535;
			aBoolean390 = true;
		} else {
			Static387.aBoolean499 = false;
			aBoolean390 = false;
		}
		@Pc(57) float local57 = (float) Static248.anInt4822 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static340.anInt6279 * 2;
		@Pc(90) int local90;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(162) int local162;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static213.anIntArrayArrayArray8[Static296.anInt5530][local64][local66] * 3;
			local90 = Static213.anIntArrayArrayArray8[Static296.anInt5530][local64 + 1][local66] * 3;
			local123 = (Static213.anIntArrayArrayArray8[Static296.anInt5530][local64 + 2][local66] + Static213.anIntArrayArrayArray8[Static296.anInt5530][local64 + 2][local66] - Static213.anIntArrayArrayArray8[Static296.anInt5530][local64 + 3][local66]) * 3;
			local131 = Static213.anIntArrayArrayArray8[Static296.anInt5530][local64][local66];
			local135 = local90 - local78;
			local144 = local123 + local78 - local90 * 2;
			local162 = Static213.anIntArrayArrayArray8[Static296.anInt5530][local64 + 2][local66] + local90 - local123 - local131;
			local60[local66] = (float) local131 + local57 * (((float) local162 * local57 + (float) local144) * local57 + (float) local135);
		}
		Static145.anInt5345 = (int) local60[0] - Static279.anInt5198 * 128;
		Static266.anInt5034 = (int) local60[1] * -1;
		Static27.anInt2842 = (int) local60[2] - Static350.anInt6470 * 128;
		@Pc(216) float[] local216 = new float[3];
		local90 = Static154.anInt3221 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static213.anIntArrayArrayArray8[Static123.anInt5935][local90][local123] * 3;
			local135 = Static213.anIntArrayArrayArray8[Static123.anInt5935][local90 + 1][local123] * 3;
			local144 = (Static213.anIntArrayArrayArray8[Static123.anInt5935][local90 + 2][local123] + Static213.anIntArrayArrayArray8[Static123.anInt5935][local90 + 2][local123] - Static213.anIntArrayArrayArray8[Static123.anInt5935][local90 + 3][local123]) * 3;
			local162 = Static213.anIntArrayArrayArray8[Static123.anInt5935][local90][local123];
			@Pc(296) int local296 = local135 - local131;
			@Pc(305) int local305 = local144 + local131 - local135 * 2;
			@Pc(321) int local321 = local135 + Static213.anIntArrayArrayArray8[Static123.anInt5935][local90 + 2][local123] - local162 - local144;
			local216[local123] = (float) local162 + local57 * ((float) local296 + ((float) local321 * local57 + (float) local305) * local57);
		}
		@Pc(356) float local356 = local216[0] - local60[0];
		@Pc(367) float local367 = -1.0F * (local216[1] - local60[1]);
		@Pc(375) float local375 = local216[2] - local60[2];
		@Pc(385) double local385 = Math.sqrt((double) (local356 * local356 + local375 * local375));
		Static237.anInt4684 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static29.anInt444 = (int) (-Math.atan2((double) local356, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static11.anInt209 = Static213.anIntArrayArrayArray8[Static296.anInt5530][local64][3] + ((Static213.anIntArrayArrayArray8[Static296.anInt5530][local64 + 2][3] - Static213.anIntArrayArrayArray8[Static296.anInt5530][local64][3]) * Static248.anInt4822 >> 16);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([[II)V")
	public static void method4735(@OriginalArg(0) int[][] arg0) {
		Static152.anIntArrayArray30 = arg0;
	}
}
