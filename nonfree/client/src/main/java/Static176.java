import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!oa;")
	public static Class121 aClass121_5;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public static int anInt3143 = 0;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public static final int anInt3146 = 1401;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	public static int anInt3154 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)I")
	public static int method2699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(CI)B")
	public static byte method2702(@OriginalArg(0) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ud;ILclient!dw;ILclient!uca;IZI)V")
	public static void method2703(@OriginalArg(0) Class29_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class29_Sub2_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class313 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class6_Sub22 local7 = new Class6_Sub22();
		local7.anInt3159 = arg1;
		local7.anInt3147 = arg3 << 9;
		local7.anInt3157 = arg6 << 9;
		if (arg4 != null) {
			local7.aClass313_1 = arg4;
			@Pc(32) int local32 = arg4.anInt8478;
			@Pc(35) int local35 = arg4.anInt8463;
			if (arg5 == 1 || arg5 == 3) {
				local35 = arg4.anInt8478;
				local32 = arg4.anInt8463;
			}
			local7.aBoolean213 = arg4.aBoolean591;
			local7.anInt3156 = arg3 + local32 << 9;
			local7.anIntArray346 = arg4.anIntArray652;
			local7.anInt3149 = arg4.anInt8487;
			local7.anInt3155 = arg4.anInt8483;
			local7.anInt3145 = arg4.anInt8486 << 9;
			local7.anInt3148 = arg4.anInt8462;
			local7.aBoolean211 = arg4.aBoolean580;
			local7.anInt3144 = arg4.anInt8459;
			local7.anInt3150 = local35 + arg6 << 9;
			if (arg4.anIntArray650 != null) {
				local7.aBoolean212 = true;
				local7.method2700();
			}
			if (local7.anIntArray346 != null) {
				local7.anInt3152 = local7.anInt3155 + (int) (Math.random() * (double) (local7.anInt3149 - local7.anInt3155));
			}
			Static429.aClass275_156.method6370(local7);
		} else if (arg2 != null) {
			local7.aClass29_Sub2_Sub1_Sub1_1 = arg2;
			@Pc(188) Class257 local188 = arg2.aClass257_1;
			if (local188.anIntArray571 != null) {
				local7.aBoolean212 = true;
				local188 = local188.method5935(Static505.aClass30_1);
			}
			if (local188 != null) {
				local7.anInt3156 = arg3 + local188.anInt7167 << 9;
				local7.anInt3150 = arg6 + local188.anInt7167 << 9;
				local7.anInt3144 = Static439.method6316(arg2);
				local7.aBoolean213 = local188.aBoolean500;
				local7.anInt3145 = local188.anInt7139 << 9;
				local7.anInt3148 = local188.anInt7154;
			}
			Static292.aClass275_101.method6370(local7);
		} else if (arg0 != null) {
			local7.aClass29_Sub2_Sub1_Sub2_1 = arg0;
			local7.anInt3156 = arg3 + arg0.method7008() << 9;
			local7.anInt3150 = arg0.method7008() + arg6 << 9;
			local7.anInt3144 = Static441.method6342(arg0);
			local7.aBoolean213 = arg0.aBoolean604;
			local7.anInt3145 = arg0.anInt8619 << 9;
			local7.anInt3148 = arg0.anInt8618;
			Static214.aClass212_12.method5104((long) arg0.anInt8541, local7);
			return;
		}
	}
}
