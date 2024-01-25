import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("889d74e61f5ca63385b2d76ae0ed4b6fadda370c2bd644475c547ddff7e2d8a278eb8df7c7e9775b25ca4df40d720878315711ffe53f0fe28415783d2a6b05ab", 16);

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg0;
		@Pc(20) int local20 = arg3 - arg0;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = (1 - local56) * local24 + local40;
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(86) int local86 = local48 + (1 - local60) * local32;
		@Pc(94) int local94 = local36 - (local60 - 1) * local52;
		@Pc(98) int local98 = local24 << 2;
		@Pc(102) int local102 = local28 << 2;
		@Pc(106) int local106 = local32 << 2;
		@Pc(110) int local110 = local36 << 2;
		@Pc(118) int local118 = local40 * 3;
		@Pc(124) int local124 = local44 * (local56 - 3);
		@Pc(128) int local128 = local48 * 3;
		@Pc(134) int local134 = local52 * (local60 - 3);
		@Pc(136) int local136 = local102;
		@Pc(142) int local142 = local98 * (arg3 - 1);
		@Pc(144) int local144 = local110;
		@Pc(150) int local150 = (local20 - 1) * local106;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (arg6 >= Static4.anInt6709 && Static492.anInt8451 >= arg6) {
			@Pc(168) int[] local168 = Static352.anIntArrayArray51[arg6];
			local177 = Static418.method6023(Static398.anInt7144, arg2 - arg1, Static71.anInt4958);
			local186 = Static418.method6023(Static398.anInt7144, arg2 + arg1, Static71.anInt4958);
			local195 = Static418.method6023(Static398.anInt7144, arg2 - local15, Static71.anInt4958);
			local203 = Static418.method6023(Static398.anInt7144, arg2 + local15, Static71.anInt4958);
			Static321.method5153(arg5, local177, local168, local195);
			Static321.method5153(arg4, local195, local168, local203);
			Static321.method5153(arg5, local203, local168, local186);
		}
		while (local9 > 0) {
			@Pc(234) boolean local234 = local9 <= local20;
			if (local68 < 0) {
				while (local68 < 0) {
					local77 += local136;
					local68 += local118;
					local118 += local102;
					local7++;
					local136 += local102;
				}
			}
			if (local234) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local128;
						local94 += local144;
						local144 += local110;
						local128 += local110;
						local11++;
					}
				}
				if (local94 < 0) {
					local86 += local128;
					local94 += local144;
					local11++;
					local144 += local110;
					local128 += local110;
				}
				local86 += -local150;
				local94 += -local134;
				local134 -= local106;
				local150 -= local106;
			}
			if (local77 < 0) {
				local77 += local136;
				local68 += local118;
				local118 += local102;
				local136 += local102;
				local7++;
			}
			local68 += -local142;
			local77 += -local124;
			local9--;
			local124 -= local98;
			local142 -= local98;
			local177 = arg6 - local9;
			local186 = arg6 + local9;
			if (Static4.anInt6709 <= local186 && Static492.anInt8451 >= local177) {
				local195 = Static418.method6023(Static398.anInt7144, local7 + arg2, Static71.anInt4958);
				local203 = Static418.method6023(Static398.anInt7144, arg2 - local7, Static71.anInt4958);
				if (local234) {
					@Pc(410) int local410 = Static418.method6023(Static398.anInt7144, arg2 + local11, Static71.anInt4958);
					@Pc(419) int local419 = Static418.method6023(Static398.anInt7144, arg2 - local11, Static71.anInt4958);
					@Pc(430) int[] local430;
					if (Static4.anInt6709 <= local177) {
						local430 = Static352.anIntArrayArray51[local177];
						Static321.method5153(arg5, local203, local430, local419);
						Static321.method5153(arg4, local419, local430, local410);
						Static321.method5153(arg5, local410, local430, local195);
					}
					if (Static492.anInt8451 >= local186) {
						local430 = Static352.anIntArrayArray51[local186];
						Static321.method5153(arg5, local203, local430, local419);
						Static321.method5153(arg4, local419, local430, local410);
						Static321.method5153(arg5, local410, local430, local195);
					}
				} else {
					if (local177 >= Static4.anInt6709) {
						Static321.method5153(arg5, local203, Static352.anIntArrayArray51[local177], local195);
					}
					if (local186 <= Static492.anInt8451) {
						Static321.method5153(arg5, local203, Static352.anIntArrayArray51[local186], local195);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
	public static void method2824() {
		Static113.method2237();
	}
}
