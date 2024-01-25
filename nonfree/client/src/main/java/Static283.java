import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!od", name = "p", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_85 = new Class231(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method4258(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static368.aString55 = arg2;
		Static27.aString4 = arg0;
		Static32.anInt522 = arg1;
		if (Static27.aString4.equals("") || Static368.aString55.equals("")) {
			Static189.anInt6579 = 3;
		} else if (Static53.anInt1053 == -1) {
			Static65.anInt1374 = 1;
			Static189.anInt6579 = -3;
			Static229.anInt3888 = 0;
			Static254.anInt3861 = 0;
			@Pc(39) Class6_Sub15 local39 = new Class6_Sub15(128);
			local39.method3075(10);
			local39.method3107((int) (Math.random() * 9.9999999E7D));
			local39.method3115(Static293.method4335(Static27.aString4));
			local39.method3107((int) (Math.random() * 9.9999999E7D));
			local39.method3094(Static368.aString55);
			local39.method3107((int) (Math.random() * 9.9999999E7D));
			local39.method3087(Static35.aBigInteger1, Static318.aBigInteger2);
			Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
			Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_10.anInt414);
			Static449.aClass6_Sub15_Sub1_2.method3075(local39.anInt3487 + 2);
			Static449.aClass6_Sub15_Sub1_2.method3100(581);
			Static449.aClass6_Sub15_Sub1_2.method3135(local39.anInt3487, local39.aByteArray51);
		} else {
			Static420.method5694();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)V")
	public static void method4260(@OriginalArg(0) long arg0) {
		if (Static30.aClass189ArrayArrayArray2 != null) {
			if (Static9.anInt164 == 1 || Static9.anInt164 == 5) {
				Static197.method3143(arg0);
			} else if (Static9.anInt164 == 4) {
				Static406.method5561(arg0);
			}
		}
		Static315.method3815((long) Static125.anInt2225, Static44.aClass28_14);
		if (Static313.anInt5099 != -1) {
			Static59.method1102(Static313.anInt5099);
		}
		for (@Pc(43) int local43 = 0; local43 < Static299.anInt4962; local43++) {
			if (Static194.aBooleanArray25[local43]) {
				Static298.aBooleanArray21[local43] = true;
			}
			Static73.aBooleanArray10[local43] = Static194.aBooleanArray25[local43];
			Static194.aBooleanArray25[local43] = false;
		}
		Static272.anInt4644 = Static125.anInt2225;
		if (Static44.aClass28_14.method3481()) {
			Static185.aBoolean348 = true;
		}
		if (Static313.anInt5099 != -1) {
			Static299.anInt4962 = 0;
			Static10.method5376();
		}
		Static44.aClass28_14.method3554();
		Static216.method3344(Static44.aClass28_14);
		@Pc(100) int local100 = Static179.method2799();
		if (local100 == -1) {
			local100 = Static54.anInt1132;
		}
		if (local100 == -1) {
			local100 = Static415.anInt6946;
		}
		Static151.method2482(local100);
		Static102.method4406(Static338.anInt5679, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675);
		Static338.anInt5679 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)I")
	public static int method4261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static126.anInt4528 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg0 - Static36.anInt2246;
		@Pc(24) int local24 = arg2 - Static36.anInt2243;
		for (@Pc(29) Class6_Sub24 local29 = (Class6_Sub24) Static36.aClass88_24.method1882(); local29 != null; local29 = (Class6_Sub24) Static36.aClass88_24.method1891()) {
			if (local29.anInt4802 == arg1) {
				@Pc(42) int local42 = local29.anInt4798;
				@Pc(45) int local45 = local29.anInt4805;
				@Pc(56) int local56 = Static36.anInt2246 + local42 << 14 | local45 + Static36.anInt2243;
				@Pc(75) int local75 = (local19 - local42) * (local19 + -local42) + (local24 - local45) * (local24 + -local45);
				if (local12 < 0 || local14 > local75) {
					local12 = local56;
					local14 = local75;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg0 == arg8 && arg1 == arg7 && arg5 == arg2) {
			Static433.method3964(arg6, arg5, arg1, arg3, arg8);
			return;
		}
		@Pc(28) int local28 = arg6;
		@Pc(30) int local30 = arg8;
		@Pc(34) int local34 = arg6 * 3;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(64) int local64 = local42 + arg1 - local50 - arg6;
		@Pc(74) int local74 = arg5 + local46 - local54 - arg8;
		@Pc(84) int local84 = local50 + local34 - local42 - local42;
		@Pc(94) int local94 = local54 + local38 - local46 - local46;
		@Pc(99) int local99 = local42 - local34;
		@Pc(104) int local104 = local46 - local38;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(114) int local114 = local106 * local106 >> 12;
			@Pc(120) int local120 = local106 * local114 >> 12;
			@Pc(124) int local124 = local120 * local64;
			@Pc(128) int local128 = local120 * local74;
			@Pc(132) int local132 = local114 * local84;
			@Pc(136) int local136 = local94 * local114;
			@Pc(140) int local140 = local99 * local106;
			@Pc(144) int local144 = local106 * local104;
			@Pc(155) int local155 = arg6 + (local140 + local124 + local132 >> 12);
			@Pc(167) int local167 = arg8 + (local128 + local136 + local144 >> 12);
			Static433.method3964(local28, local167, local155, arg3, local30);
			local28 = local155;
			local30 = local167;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!lt;B)V")
	public static void method4263(@OriginalArg(0) Class158 arg0) {
		Static198.aClass158_43 = arg0;
	}
}
