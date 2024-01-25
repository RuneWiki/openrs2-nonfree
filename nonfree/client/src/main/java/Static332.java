import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Lclient!vw;")
	public static Class355 aClass355_4;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "[I")
	public static int[] anIntArray459;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	public static int anInt5938 = -1;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIBIILclient!fh;III)Z")
	public static boolean method5130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class95 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg2;
		@Pc(26) int local26 = arg5 - 64;
		Static227.anIntArrayArray33[64][64] = 99;
		@Pc(37) int local37 = arg2 - 64;
		Static594.anIntArrayArray72[64][64] = 0;
		@Pc(45) byte local45 = 0;
		Static425.anIntArray560[0] = arg5;
		@Pc(51) int local51 = 0;
		@Pc(54) int local54 = local45 + 1;
		Static554.anIntArray652[0] = arg2;
		@Pc(59) int[][] local59 = arg6.anIntArrayArray22;
		while (local51 != local54) {
			local9 = Static554.anIntArray652[local51];
			local7 = Static425.anIntArray560[local51];
			@Pc(73) int local73 = local9 - local37;
			@Pc(77) int local77 = local7 - local26;
			local51 = local51 + 1 & 0xFFF;
			@Pc(89) int local89 = local7 - arg6.anInt3047;
			@Pc(94) int local94 = local9 - arg6.anInt3057;
			if (arg4 == -4) {
				if (local7 == arg3 && arg1 == local9) {
					Static531.anInt8359 = local9;
					Static526.anInt8326 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static461.method6384(arg0, arg1, local7, 2, arg8, 2, local9, arg3)) {
					Static526.anInt8326 = local7;
					Static531.anInt8359 = local9;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg6.method2727(2, arg0, arg1, local9, arg8, arg7, local7, 2, arg3)) {
					Static531.anInt8359 = local9;
					Static526.anInt8326 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg6.method2734(arg3, arg7, arg1, arg0, local9, 2, arg8, local7)) {
					Static526.anInt8326 = local7;
					Static531.anInt8359 = local9;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg6.method2737(arg3, arg4, 2, arg1, arg9, local9, local7)) {
					Static526.anInt8326 = local7;
					Static531.anInt8359 = local9;
					return true;
				}
			} else if (arg6.method2735(2, arg3, local9, arg4, arg1, arg9, local7)) {
				Static531.anInt8359 = local9;
				Static526.anInt8326 = local7;
				return true;
			}
			@Pc(248) int local248 = Static594.anIntArrayArray72[local77][local73] + 1;
			if (local77 > 0 && Static227.anIntArrayArray33[local77 - 1][local73] == 0 && (local59[local89 - 1][local94] & 0x43A40000) == 0 && (local59[local89 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static425.anIntArray560[local54] = local7 - 1;
				Static554.anIntArray652[local54] = local9;
				Static227.anIntArrayArray33[local77 - 1][local73] = 2;
				local54 = local54 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local77 - 1][local73] = local248;
			}
			if (local77 < 126 && Static227.anIntArrayArray33[local77 + 1][local73] == 0 && (local59[local89 + 2][local94] & 0x60E40000) == 0 && (local59[local89 + 2][local94 + 1] & 0x78240000) == 0) {
				Static425.anIntArray560[local54] = local7 + 1;
				Static554.anIntArray652[local54] = local9;
				Static227.anIntArrayArray33[local77 + 1][local73] = 8;
				local54 = local54 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local77 + 1][local73] = local248;
			}
			if (local73 > 0 && Static227.anIntArrayArray33[local77][local73 - 1] == 0 && (local59[local89][local94 - 1] & 0x43A40000) == 0 && (local59[local89 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static425.anIntArray560[local54] = local7;
				Static554.anIntArray652[local54] = local9 - 1;
				Static227.anIntArrayArray33[local77][local73 - 1] = 1;
				local54 = local54 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local77][local73 - 1] = local248;
			}
			if (local73 < 126 && Static227.anIntArrayArray33[local77][local73 + 1] == 0 && (local59[local89][local94 + 2] & 0x4E240000) == 0 && (local59[local89 + 1][local94 + 2] & 0x78240000) == 0) {
				Static425.anIntArray560[local54] = local7;
				Static554.anIntArray652[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local77][local73 + 1] = 4;
				Static594.anIntArrayArray72[local77][local73 + 1] = local248;
			}
			if (local77 > 0 && local73 > 0 && Static227.anIntArrayArray33[local77 - 1][local73 - 1] == 0 && (local59[local89 - 1][local94] & 0x4FA40000) == 0 && (local59[local89 - 1][local94 - 1] & 0x43A40000) == 0 && (local59[local89][local94 - 1] & 0x63E40000) == 0) {
				Static425.anIntArray560[local54] = local7 - 1;
				Static554.anIntArray652[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local77 - 1][local73 - 1] = 3;
				Static594.anIntArrayArray72[local77 - 1][local73 - 1] = local248;
			}
			if (local77 < 126 && local73 > 0 && Static227.anIntArrayArray33[local77 + 1][local73 - 1] == 0 && (local59[local89 + 1][local94 - 1] & 0x63E40000) == 0 && (local59[local89 + 2][local94 - 1] & 0x60E40000) == 0 && (local59[local89 + 2][local94] & 0x78E40000) == 0) {
				Static425.anIntArray560[local54] = local7 + 1;
				Static554.anIntArray652[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local77 + 1][local73 - 1] = 9;
				Static594.anIntArrayArray72[local77 + 1][local73 - 1] = local248;
			}
			if (local77 > 0 && local73 < 126 && Static227.anIntArrayArray33[local77 - 1][local73 + 1] == 0 && (local59[local89 - 1][local94 + 1] & 0x4FA40000) == 0 && (local59[local89 - 1][local94 + 2] & 0x4E240000) == 0 && (local59[local89][local94 + 2] & 0x7E240000) == 0) {
				Static425.anIntArray560[local54] = local7 - 1;
				Static554.anIntArray652[local54] = local9 + 1;
				Static227.anIntArrayArray33[local77 - 1][local73 + 1] = 6;
				local54 = local54 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local77 - 1][local73 + 1] = local248;
			}
			if (local77 < 126 && local73 < 126 && Static227.anIntArrayArray33[local77 + 1][local73 + 1] == 0 && (local59[local89 + 1][local94 + 2] & 0x7E240000) == 0 && (local59[local89 + 2][local94 + 2] & 0x78240000) == 0 && (local59[local89 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static425.anIntArray560[local54] = local7 + 1;
				Static554.anIntArray652[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local77 + 1][local73 + 1] = 12;
				Static594.anIntArrayArray72[local77 + 1][local73 + 1] = local248;
			}
		}
		Static531.anInt8359 = local9;
		Static526.anInt8326 = local7;
		return false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lclient!ai;")
	public static Class3_Sub3_Sub3 method5132() {
		return Static284.aClass3_Sub3_Sub3_3;
	}
}
