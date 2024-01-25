import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!io", name = "Hb", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!io", name = "Kb", descriptor = "I")
	public static int anInt3017;

	@OriginalMember(owner = "client!io", name = "Sb", descriptor = "I")
	public static int anInt3022;

	@OriginalMember(owner = "client!io", name = "Lb", descriptor = "I")
	public static int anInt3018 = -1;

	@OriginalMember(owner = "client!io", name = "Ob", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_27 = new Class103(2);

	@OriginalMember(owner = "client!io", name = "Rb", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray8 = new int[2][][];

	@OriginalMember(owner = "client!io", name = "Ub", descriptor = "Z")
	public static boolean aBoolean227 = true;

	@OriginalMember(owner = "client!io", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray397 = new int[50];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IC)B")
	public static byte method2796(@OriginalArg(1) char arg0) {
		@Pc(22) byte local22;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local22 = (byte) arg0;
		} else if (arg0 == '€') {
			local22 = -128;
		} else if (arg0 == '‚') {
			local22 = -126;
		} else if (arg0 == 'ƒ') {
			local22 = -125;
		} else if (arg0 == '„') {
			local22 = -124;
		} else if (arg0 == '…') {
			local22 = -123;
		} else if (arg0 == '†') {
			local22 = -122;
		} else if (arg0 == '‡') {
			local22 = -121;
		} else if (arg0 == 'ˆ') {
			local22 = -120;
		} else if (arg0 == '‰') {
			local22 = -119;
		} else if (arg0 == 'Š') {
			local22 = -118;
		} else if (arg0 == '‹') {
			local22 = -117;
		} else if (arg0 == 'Œ') {
			local22 = -116;
		} else if (arg0 == 'Ž') {
			local22 = -114;
		} else if (arg0 == '‘') {
			local22 = -111;
		} else if (arg0 == '’') {
			local22 = -110;
		} else if (arg0 == '“') {
			local22 = -109;
		} else if (arg0 == '”') {
			local22 = -108;
		} else if (arg0 == '•') {
			local22 = -107;
		} else if (arg0 == '–') {
			local22 = -106;
		} else if (arg0 == '—') {
			local22 = -105;
		} else if (arg0 == '˜') {
			local22 = -104;
		} else if (arg0 == '™') {
			local22 = -103;
		} else if (arg0 == 'š') {
			local22 = -102;
		} else if (arg0 == '›') {
			local22 = -101;
		} else if (arg0 == 'œ') {
			local22 = -100;
		} else if (arg0 == 'ž') {
			local22 = -98;
		} else if (arg0 == 'Ÿ') {
			local22 = -97;
		} else {
			local22 = 63;
		}
		return local22;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!qf;III)V")
	public static void method2797(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static142.anIntArrayArrayArray11[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt3695 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass7_Sub16_Sub1Array3[arg0.anInt3695++] = Static116.aClass7_Sub16_Sub1Array1[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt3695; local19 < 4; local19++) {
			arg0.aClass7_Sub16_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(JZ)V")
	public static void method2804(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static302.anInt6436 + Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973;
		@Pc(16) int local16 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 + Static254.anInt4937;
		if (Static98.anInt1131 - local10 < -500 || Static98.anInt1131 - local10 > 500 || Static319.anInt6099 - local16 < -500 || Static319.anInt6099 - local16 > 500) {
			Static319.anInt6099 = local16;
			Static98.anInt1131 = local10;
		}
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (local10 != Static98.anInt1131) {
			local60 = local10 - Static98.anInt1131;
			local68 = (int) (arg0 * (long) local60 / 320L);
			if (local60 <= 0) {
				if (local68 == 0) {
					local68 = -1;
				} else if (local60 > local68) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = 1;
			} else if (local60 < local68) {
				local68 = local60;
			}
			Static98.anInt1131 += local68;
		}
		if (local16 != Static319.anInt6099) {
			local60 = local16 - Static319.anInt6099;
			local68 = (int) ((long) local60 * arg0 / 320L);
			if (local60 <= 0) {
				if (local68 == 0) {
					local68 = -1;
				} else if (local60 > local68) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = 1;
			} else if (local68 > local60) {
				local68 = local60;
			}
			Static319.anInt6099 += local68;
		}
		if (!Static268.aBoolean393) {
			Static351.aFloat80 += Static290.aFloat73 * (float) arg0 / 6.0F;
			Static18.aFloat7 += Static321.aFloat76 * (float) arg0 / 6.0F;
		}
		Static44.method977();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I[III[J)V")
	public static void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg2) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local24;
		@Pc(38) int local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg2; local50++) {
			if ((long) (local50 & 0x1) + local24 > arg3[local50]) {
				@Pc(70) long local70 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20] = local70;
				@Pc(84) int local84 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20++] = local84;
			}
		}
		arg3[arg2] = arg3[local20];
		arg3[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method2807(arg0, arg1, local20 - 1, arg3);
		method2807(local20 + 1, arg1, arg2, arg3);
	}
}
