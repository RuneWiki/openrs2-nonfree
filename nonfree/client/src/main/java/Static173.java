import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	public static boolean aBoolean239;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public static int anInt3185;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt3177 = 0;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[I")
	public static int[] anIntArray381 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
	public static int[] anIntArray382 = new int[256];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method2617() {
		@Pc(8) int local8 = Static255.aByteArrayArray12.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static255.aByteArrayArray12[local10] != null) {
				@Pc(21) int local21 = -1;
				for (@Pc(23) int local23 = 0; local23 < Static260.anInt5248; local23++) {
					if (Static177.anIntArray389[local10] == Static93.anIntArray238[local23]) {
						local21 = local23;
						break;
					}
				}
				if (local21 == -1) {
					Static93.anIntArray238[Static260.anInt5248] = Static177.anIntArray389[local10];
					local21 = Static260.anInt5248++;
				}
				@Pc(58) int local58 = 0;
				@Pc(65) Class1_Sub18 local65 = new Class1_Sub18(Static255.aByteArrayArray12[local10]);
				while (local65.anInt3911 < Static255.aByteArrayArray12[local10].length && local58 < 511) {
					@Pc(81) int local81 = local65.method3107();
					@Pc(88) int local88 = local58++ << 6 | local21;
					@Pc(94) int local94 = local81 >> 7 & 0x3F;
					@Pc(98) int local98 = local81 >> 14;
					@Pc(102) int local102 = local81 & 0x3F;
					@Pc(115) int local115 = local94 + (Static177.anIntArray389[local10] >> 8) * 64 - Static224.anInt4695;
					@Pc(128) int local128 = (Static177.anIntArray389[local10] & 0xFF) * 64 + local102 - Static158.anInt2961;
					@Pc(136) Class19 local136 = Static24.method424(local65.method3107());
					if (Static211.aClass6_Sub6_Sub1Array2[local88] == null && (local136.aByte5 & 0x1) > 0 && local98 == Static92.anInt1754 && local115 >= 0 && local136.anInt629 + local115 < 104 && local128 >= 0 && local136.anInt629 + local128 < 104) {
						Static211.aClass6_Sub6_Sub1Array2[local88] = new Class6_Sub6_Sub1();
						@Pc(181) Class6_Sub6_Sub1 local181 = Static211.aClass6_Sub6_Sub1Array2[local88];
						Static75.anIntArray178[Static293.anInt5831++] = local88;
						local181.anInt4519 = Static261.anInt5259;
						local181.method3458(local136);
						local181.method3511(local181.aClass19_1.anInt629);
						local181.anInt4579 = local181.anInt4511 = Static43.anIntArray129[local181.aClass19_1.aByte3];
						local181.anInt4503 = local181.aClass19_1.anInt673;
						local181.anInt4546 = local181.aClass19_1.anInt656;
						if (local181.anInt4503 == 0) {
							local181.anInt4511 = 0;
						}
						local181.method3500(true, local128, local115, local181.method3509());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!jh;III)Ljava/awt/Frame;")
	public static Frame method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method1966()) {
			return null;
		}
		@Pc(28) Class34[] local28 = Static33.method617(arg2);
		if (local28 == null) {
			return null;
		}
		@Pc(35) boolean local35 = false;
		for (@Pc(37) int local37 = 0; local37 < local28.length; local37++) {
			if (local28[local37].anInt1118 == arg0 && local28[local37].anInt1121 == arg3 && (!local35 || local28[local37].anInt1119 > arg1)) {
				arg1 = local28[local37].anInt1119;
				local35 = true;
			}
		}
		if (!local35) {
			return null;
		}
		@Pc(109) Class118 local109 = arg2.method1969(arg0, arg1, arg3);
		while (local109.anInt3187 == 0) {
			Static275.method4233(10L);
		}
		@Pc(121) Frame local121 = (Frame) local109.anObject3;
		if (local121 == null) {
			return null;
		} else if (local109.anInt3187 == 2) {
			Static106.method1682(arg2, local121);
			return null;
		} else {
			return local121;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)[F")
	public static float[] method2619() {
		@Pc(3) float local3 = Static34.method622() + Static34.method626();
		@Pc(9) int local9 = Static34.method627();
		@Pc(30) float local30 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		Static270.aFloatArray31[3] = 1.0F;
		@Pc(43) float local43 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(50) float local50 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(52) float local52 = 0.58823526F;
		Static270.aFloatArray31[2] = local50 * Static37.aFloatArray23[2] * local52 * local3;
		Static270.aFloatArray31[1] = local3 * Static37.aFloatArray23[1] * local43 * local52;
		Static270.aFloatArray31[0] = local3 * Static37.aFloatArray23[0] * local30 * local52;
		return Static270.aFloatArray31;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
	public static int method2620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray235.length) {
			return local10.anIntArray235[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)I")
	public static int method2621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static242.aByteArrayArrayArray23[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static242.aByteArrayArrayArray23[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public static void method2622() {
		if (Static187.anIntArray407 != null && Static134.anIntArray305 != null) {
			return;
		}
		Static187.anIntArray407 = new int[256];
		Static134.anIntArray305 = new int[256];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(36) double local36 = (double) local26 / 255.0D * 6.283185307179586D;
			Static187.anIntArray407[local26] = (int) (Math.sin(local36) * 4096.0D);
			Static134.anIntArray305[local26] = (int) (Math.cos(local36) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!uk;")
	public static Class164 method2623(@OriginalArg(1) int arg0) {
		@Pc(10) Class164 local10 = (Class164) Static77.aClass31_13.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23 = Static4.aClass7_13.method253(arg0, 16);
		local10 = new Class164();
		if (local23 != null) {
			local10.method4179(new Class1_Sub18(local23));
		}
		Static77.aClass31_13.method851(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)I")
	public static int method2624(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class1_Sub10 local19 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg0);
		if (local19 == null) {
			return Static196.method2970(arg0).anInt1984;
		}
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = 0; local38 < local19.anIntArray235.length; local38++) {
			if (local19.anIntArray235[local38] == -1) {
				local36++;
			}
		}
		return local36 + Static196.method2970(arg0).anInt1984 - local19.anIntArray235.length;
	}
}
