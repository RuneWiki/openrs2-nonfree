import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
	public static int anInt3911;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	public static int anInt3915 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
	public static void method3126() {
		for (@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) Static199.aClass243_23.method5208(); local10 != null; local10 = (Class3_Sub15) Static199.aClass243_23.method5203()) {
			if (Static263.aClass118ArrayArrayArray2 == null) {
				local10.method5977();
			} else {
				@Pc(32) int local32;
				@Pc(42) Class7_Sub4 local42;
				@Pc(55) Class7_Sub4_Sub3 local55;
				@Pc(130) Class7_Sub2 local130;
				@Pc(174) Class7_Sub1 local174;
				@Pc(83) Class7_Sub3 local83;
				@Pc(187) Class7_Sub1_Sub2 local187;
				@Pc(96) Class7_Sub3_Sub2 local96;
				if (local10.anInt2340 <= Static253.anInt4787) {
					local32 = Static196.anIntArray249[local10.anInt2331];
					if (local32 == 0) {
						local42 = Static321.method4376(local10.anInt2328, local10.anInt2322, local10.anInt2332);
						if (local42 instanceof Class7_Sub4_Sub3) {
							Static143.method1462(local10.anInt2328, local10.anInt2322, local10.anInt2332);
							local55 = (Class7_Sub4_Sub3) local42;
							if (local55.aClass7_Sub4_3 != null) {
								Static6.method41(local10.anInt2328, local10.anInt2322, local10.anInt2332, local55.aClass7_Sub4_3, null);
							}
						}
					} else if (local32 == 1) {
						local83 = Static113.method4396(local10.anInt2328, local10.anInt2322, local10.anInt2332);
						if (local83 instanceof Class7_Sub3_Sub2) {
							Static451.method5939(local10.anInt2328, local10.anInt2322, local10.anInt2332);
							local96 = (Class7_Sub3_Sub2) local83;
							if (local96.aClass7_Sub3_1 != null) {
								Static455.method5994(local10.anInt2328, local10.anInt2322, local10.anInt2332, local96.aClass7_Sub3_1, null);
							}
						}
					} else if (local32 == 2) {
						local130 = Static314.method4348(local10.anInt2328, local10.anInt2322, local10.anInt2332, pa.class);
						if (local130 instanceof Class7_Sub2_Sub1) {
							Static169.method4554(local10.anInt2328, local10.anInt2322, local10.anInt2332, pa.class);
							@Pc(151) Class7_Sub2_Sub1 local151 = (Class7_Sub2_Sub1) local130;
							if (local151.aClass7_Sub2_1 != null) {
								Static149.method2419(local151.aClass7_Sub2_1, false);
							}
						}
					} else if (local32 == 3) {
						local174 = Static166.method2721(local10.anInt2328, local10.anInt2322, local10.anInt2332);
						if (local174 instanceof Class7_Sub1_Sub2) {
							Static30.method642(local10.anInt2328, local10.anInt2322, local10.anInt2332);
							local187 = (Class7_Sub1_Sub2) local174;
							if (local187.aClass7_Sub1_2 != null) {
								Static135.method2143(local10.anInt2328, local10.anInt2322, local10.anInt2332, local187.aClass7_Sub1_2);
							}
						}
					}
					local10.method5977();
				} else if (Static253.anInt4787 == local10.anInt2333) {
					local32 = Static196.anIntArray249[local10.anInt2331];
					if (local32 == 0) {
						local42 = Static321.method4376(local10.anInt2328, local10.anInt2322, local10.anInt2332);
						if (local42 instanceof Class7_Sub4_Sub3) {
							local10.method5977();
						} else if (Static310.method4313(local10.anInt2328, local10.anInt2322, local10.anInt2332) == null) {
							local55 = new Class7_Sub4_Sub3(local10.anInt2331, local10.anInt2325, local10.anInt2336, local10.anInt2339, local10.anInt2323, local42);
							Static6.method41(local10.anInt2328, local10.anInt2322, local10.anInt2332, local55, null);
						} else {
							local10.method5977();
						}
					} else if (local32 == 1) {
						local83 = Static113.method4396(local10.anInt2328, local10.anInt2322, local10.anInt2332);
						if (local83 instanceof Class7_Sub3_Sub2) {
							local10.method5977();
						} else if (Static99.method1748(local10.anInt2328, local10.anInt2322, local10.anInt2332) == null) {
							local96 = new Class7_Sub3_Sub2(local10.anInt2331, local10.anInt2325, local10.anInt2336, local10.anInt2339, local10.anInt2323, local83);
							Static455.method5994(local10.anInt2328, local10.anInt2322, local10.anInt2332, local96, null);
						} else {
							local10.method5977();
						}
					} else if (local32 == 2) {
						local130 = Static314.method4348(local10.anInt2328, local10.anInt2322, local10.anInt2332, pa.class);
						if (local130 instanceof Class7_Sub2_Sub1) {
							local10.method5977();
						} else {
							Static169.method4554(local10.anInt2328, local10.anInt2322, local10.anInt2332, pa.class);
							@Pc(370) Class93 local370 = Static435.aClass30_4.method769(local10.anInt2337);
							@Pc(383) int local383;
							@Pc(386) int local386;
							if (local10.anInt2325 == 1 || local10.anInt2325 == 3) {
								local383 = local370.anInt2782;
								local386 = local370.anInt2762;
							} else {
								local383 = local370.anInt2762;
								local386 = local370.anInt2782;
							}
							@Pc(428) Class7_Sub2_Sub1 local428 = new Class7_Sub2_Sub1(local10.anInt2331, local10.anInt2325, local10.anInt2328, local10.anInt2336, local10.anInt2339, local10.anInt2323, local10.anInt2322, local383 + local10.anInt2322 - 1, local10.anInt2332, local10.anInt2332 + local386 - 1, local130);
							Static149.method2419(local428, false);
						}
					} else if (local32 == 3) {
						local174 = Static166.method2721(local10.anInt2328, local10.anInt2322, local10.anInt2332);
						if (local174 instanceof Class7_Sub1_Sub2) {
							local10.method5977();
						} else {
							local187 = new Class7_Sub1_Sub2(local10.anInt2336, local10.anInt2339, local10.anInt2323, local174);
							Static135.method2143(local10.anInt2328, local10.anInt2322, local10.anInt2332, local187);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method3127(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			@Pc(24) int local24 = arg0[arg2 + local15] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(40) char local40 = Static455.aCharArray9[local24 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local24 = local40;
				}
				local6[local8++] = (char) local24;
			}
		}
		return new String(local6, 0, local8);
	}
}
