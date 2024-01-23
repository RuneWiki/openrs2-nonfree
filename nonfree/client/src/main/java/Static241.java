import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!ph;")
	public static Class138 aClass138_64;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!g;")
	public static Class58 aClass58_13 = new Class58(64);

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
	public static int[] anIntArray437 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[S")
	public static short[] aShortArray76 = new short[500];

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[F")
	public static float[] aFloatArray27 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[Lclient!o;Z[BB)V")
	public static void method3766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg4);
		@Pc(24) int local24 = -1;
		while (true) {
			@Pc(28) int local28 = local10.method2608();
			if (local28 == 0) {
				return;
			}
			local24 += local28;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(40) int local40 = local10.method2648();
				if (local40 == 0) {
					break;
				}
				local36 += local40 - 1;
				@Pc(59) int local59 = local36 >> 6 & 0x3F;
				@Pc(63) int local63 = local36 >> 12;
				@Pc(67) int local67 = local36 & 0x3F;
				@Pc(71) int local71 = local10.method2595();
				@Pc(75) int local75 = arg1 + local59;
				@Pc(79) int local79 = local71 & 0x3;
				@Pc(83) int local83 = local71 >> 2;
				@Pc(87) int local87 = local67 + arg0;
				if (local75 > 0 && local87 > 0 && local75 < 103 && local87 < 103) {
					@Pc(105) Class122 local105 = null;
					if (!arg3) {
						@Pc(109) int local109 = local63;
						if ((Static94.aByteArrayArrayArray9[1][local75][local87] & 0x2) == 2) {
							local109 = local63 - 1;
						}
						if (local109 >= 0) {
							local105 = arg2[local109];
						}
					}
					Static293.method4623(arg3, local24, local63, local105, local87, !arg3, local75, local63, local79, local83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method3768() {
		if (Static31.anInt560 == 0) {
			return;
		}
		try {
			if (++Static34.anInt622 > 2000) {
				if (Static81.aClass7_2 != null) {
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
				}
				if (Static117.anInt2310 >= 1) {
					Static282.anInt5385 = -5;
					Static31.anInt560 = 0;
					return;
				}
				Static31.anInt560 = 1;
				Static34.anInt622 = 0;
				if (Static27.anInt508 == Static286.anInt5441) {
					Static27.anInt508 = Static61.anInt1208;
				} else {
					Static27.anInt508 = Static286.anInt5441;
				}
				Static117.anInt2310++;
			}
			if (Static31.anInt560 == 1) {
				Static110.aClass10_5 = Static117.aClass117_3.method2996(Static27.anInt508, Static216.aString139);
				Static31.anInt560 = 2;
			}
			@Pc(125) int local125;
			if (Static31.anInt560 == 2) {
				if (Static110.aClass10_5.anInt151 == 2) {
					throw new IOException();
				}
				if (Static110.aClass10_5.anInt151 != 1) {
					return;
				}
				Static81.aClass7_2 = new Class7((Socket) Static110.aClass10_5.anObject1, Static117.aClass117_3);
				Static110.aClass10_5 = null;
				Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, Static137.aClass1_Sub14_Sub1_6.anInt3290);
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				local125 = Static81.aClass7_2.method103();
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				if (local125 != 21) {
					Static282.anInt5385 = local125;
					Static31.anInt560 = 0;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				}
				Static31.anInt560 = 3;
			}
			if (Static31.anInt560 == 3) {
				if (Static81.aClass7_2.method104() < 1) {
					return;
				}
				Static27.aStringArray4 = new String[Static81.aClass7_2.method103()];
				Static31.anInt560 = 4;
			}
			if (Static31.anInt560 == 4) {
				if (Static81.aClass7_2.method104() < Static27.aStringArray4.length * 8) {
					return;
				}
				Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
				Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, Static27.aStringArray4.length * 8);
				for (local125 = 0; local125 < Static27.aStringArray4.length; local125++) {
					Static27.aStringArray4[local125] = Static159.method2693(Static237.aClass1_Sub14_Sub1_7.method2587());
				}
				Static282.anInt5385 = 21;
				Static31.anInt560 = 0;
				Static81.aClass7_2.method105();
				Static81.aClass7_2 = null;
				return;
			}
		} catch (@Pc(245) IOException local245) {
			if (Static81.aClass7_2 != null) {
				Static81.aClass7_2.method105();
				Static81.aClass7_2 = null;
			}
			if (Static117.anInt2310 >= 1) {
				Static31.anInt560 = 0;
				Static282.anInt5385 = -4;
			} else {
				Static31.anInt560 = 1;
				Static34.anInt622 = 0;
				Static117.anInt2310++;
				if (Static286.anInt5441 == Static27.anInt508) {
					Static27.anInt508 = Static61.anInt1208;
				} else {
					Static27.anInt508 = Static286.anInt5441;
				}
			}
		}
	}
}
