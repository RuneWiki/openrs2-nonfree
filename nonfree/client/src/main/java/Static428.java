import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
	public static int anInt5962;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	public static int anInt5953 = 0;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger10 = new BigInteger("81623a54b9f051249834ac97893910ee91109ccd1a87694f9e128982180113d8a7e9e11579269bca981fbc40e666cd1d03a27a32eee39ab94be2f8d8efef02d9", 16);

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	public static int anInt5961 = -1;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_60 = new Class94(31, 1);

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)V")
	public static void method5138() {
		Static177.anInt4267 = -1;
		Static603.aClass2_Sub8_Sub3_5 = null;
		Static122.aBoolean721 = false;
		Static42.aClass157_33 = null;
		Static77.anInt10672 = -1;
		Static436.anInt8106 = 2;
		Static614.anInt10750 = 1;
		Static267.anInt5676 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method5140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg8 && arg6 == arg0 && arg5 == arg3 && arg1 == arg4) {
			Static438.method6940(arg8, arg6, arg4, arg3, arg7);
			return;
		}
		@Pc(23) int local23 = arg8;
		@Pc(25) int local25 = arg6;
		@Pc(29) int local29 = arg8 * 3;
		@Pc(33) int local33 = arg6 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(59) int local59 = local37 + arg3 - arg8 - local45;
		@Pc(69) int local69 = local41 + arg4 - arg6 - local49;
		@Pc(79) int local79 = local29 + local45 - local37 - local37;
		@Pc(90) int local90 = local49 + local33 - local41 - local41;
		@Pc(95) int local95 = local37 - local29;
		@Pc(99) int local99 = local41 - local33;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local109 * local101 >> 12;
			@Pc(119) int local119 = local59 * local115;
			@Pc(123) int local123 = local115 * local69;
			@Pc(127) int local127 = local79 * local109;
			@Pc(131) int local131 = local109 * local90;
			@Pc(135) int local135 = local95 * local101;
			@Pc(139) int local139 = local99 * local101;
			@Pc(149) int local149 = arg8 + (local119 + local127 + local135 >> 12);
			@Pc(160) int local160 = arg6 + (local123 + local131 + local139 >> 12);
			Static438.method6940(local23, local25, local160, local149, arg7);
			local25 = local160;
			local23 = local149;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg6;
		@Pc(21) int local21 = arg0 - arg6;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = local53 * (local61 - 3);
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg0 - 1);
		@Pc(151) int local151 = local113;
		@Pc(157) int local157 = (local21 - 1) * local109;
		@Pc(161) int[] local161 = Static208.anIntArrayArray20[arg5];
		Static280.method5108(arg4 - local16, local161, arg4 - arg2, arg3);
		Static280.method5108(arg4 + local16, local161, arg4 - local16, arg1);
		Static280.method5108(arg2 + arg4, local161, arg4 + local16, arg3);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local135 += local105;
					local7++;
					local117 += local105;
				}
			}
			if (local202) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local151;
						local88 += local127;
						local11++;
						local151 += local113;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local151;
					local88 += local127;
					local127 += local113;
					local11++;
					local151 += local113;
				}
				local97 += -local133;
				local88 += -local157;
				local133 -= local109;
				local157 -= local109;
			}
			if (local79 < 0) {
				local79 += local135;
				local70 += local117;
				local135 += local105;
				local7++;
				local117 += local105;
			}
			local79 += -local123;
			local70 += -local141;
			local123 -= local101;
			local9--;
			local141 -= local101;
			@Pc(342) int local342 = arg5 - local9;
			@Pc(347) int local347 = arg5 + local9;
			@Pc(351) int local351 = local7 + arg4;
			@Pc(356) int local356 = arg4 - local7;
			if (local202) {
				@Pc(362) int local362 = arg4 + local11;
				@Pc(367) int local367 = arg4 - local11;
				Static280.method5108(local367, Static208.anIntArrayArray20[local342], local356, arg3);
				Static280.method5108(local362, Static208.anIntArrayArray20[local342], local367, arg1);
				Static280.method5108(local351, Static208.anIntArrayArray20[local342], local362, arg3);
				Static280.method5108(local367, Static208.anIntArrayArray20[local347], local356, arg3);
				Static280.method5108(local362, Static208.anIntArrayArray20[local347], local367, arg1);
				Static280.method5108(local351, Static208.anIntArrayArray20[local347], local362, arg3);
			} else {
				Static280.method5108(local351, Static208.anIntArrayArray20[local342], local356, arg3);
				Static280.method5108(local351, Static208.anIntArrayArray20[local347], local356, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I")
	public static int method5144(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!cea;B)V")
	public static void method5145(@OriginalArg(0) Class2_Sub11 arg0) {
		if (arg0.aByteArray128.length - arg0.anInt10066 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method8383();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray128.length - arg0.anInt10066 < 2) {
			return;
		}
		@Pc(55) int local55 = arg0.method8326();
		if (local55 * 6 > arg0.aByteArray128.length - arg0.anInt10066) {
			return;
		}
		for (@Pc(69) int local69 = 0; local69 < local55; local69++) {
			@Pc(75) int local75 = arg0.method8326();
			@Pc(79) int local79 = arg0.method8381();
			if (local75 < Static306.anIntArray372.length && Static544.aBooleanArray25[local75] && (Static436.aClass338_1.method8462(local75).aChar4 != '1' || local79 >= -1 && local79 <= 1)) {
				Static306.anIntArray372[local75] = local79;
			}
		}
	}
}
