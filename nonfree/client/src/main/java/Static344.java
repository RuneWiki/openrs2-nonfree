import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public static int anInt6693;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static int anInt6697;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString254 = "scroll:";

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	public static int anInt6694 = -1;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public static int anInt6696 = 0;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "[S")
	public static final short[] aShortArray113 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	public static int anInt6698 = 0;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
	public static void method5611() {
		Static216.aClass198_39.method5243(5);
		Static164.aClass198_58.method5243(5);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method5614(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local11 > local15 - local24) {
			if (local13 - local22 >= local8) {
				return -1;
			}
			if (local15 - local24 >= local11) {
				return 1;
			}
			@Pc(68) char local68;
			if (local22 == '\u0000') {
				local68 = arg2.charAt(local13++);
			} else {
				local68 = local22;
			}
			@Pc(81) char local81;
			if (local24 == '\u0000') {
				local81 = arg0.charAt(local15++);
			} else {
				local81 = local24;
			}
			local22 = Static117.method2036(local68);
			local24 = Static117.method2036(local81);
			local68 = Static237.method4026(local68, arg1);
			local81 = Static237.method4026(local81, arg1);
			if (local81 != local68 && Character.toUpperCase(local68) != Character.toUpperCase(local81)) {
				local68 = Character.toLowerCase(local68);
				local81 = Character.toLowerCase(local81);
				if (local68 != local81) {
					return Static90.method1436(arg1, local68) - Static90.method1436(arg1, local81);
				}
			}
		}
		@Pc(145) int local145 = Math.min(local8, local11);
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			if (arg1 == 2) {
				local13 = local8 - local147 - 1;
				local15 = local11 - local147 - 1;
			} else {
				local15 = local147;
				local13 = local147;
			}
			@Pc(175) char local175 = arg2.charAt(local13);
			@Pc(179) char local179 = arg0.charAt(local15);
			if (local175 != local179 && Character.toUpperCase(local175) != Character.toUpperCase(local179)) {
				local175 = Character.toLowerCase(local175);
				local179 = Character.toLowerCase(local179);
				if (local175 != local179) {
					return Static90.method1436(arg1, local175) - Static90.method1436(arg1, local179);
				}
			}
		}
		@Pc(227) int local227 = local8 - local11;
		if (local227 != 0) {
			return local227;
		}
		for (@Pc(233) int local233 = 0; local233 < local145; local233++) {
			@Pc(239) char local239 = arg2.charAt(local233);
			@Pc(243) char local243 = arg0.charAt(local233);
			if (local243 != local239) {
				return Static90.method1436(arg1, local239) - Static90.method1436(arg1, local243);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!tj;Lclient!km;III)V")
	public static void method5615(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class45 local12;
		if (arg3 < Static103.anInt2156) {
			local12 = Static256.aClass45ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass5_Sub3_1 != null && local12.aClass5_Sub3_1.method5327()) {
				arg1.method5333(0, arg0, 0, true, local12.aClass5_Sub3_1, 128);
			}
		}
		if (arg4 < Static103.anInt2156) {
			local12 = Static256.aClass45ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass5_Sub3_1 != null && local12.aClass5_Sub3_1.method5327()) {
				arg1.method5333(128, arg0, 0, true, local12.aClass5_Sub3_1, 0);
			}
		}
		if (arg3 < Static103.anInt2156 && arg4 < Static116.anInt2499) {
			local12 = Static256.aClass45ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass5_Sub3_1 != null && local12.aClass5_Sub3_1.method5327()) {
				arg1.method5333(128, arg0, 0, true, local12.aClass5_Sub3_1, 128);
			}
		}
		if (arg3 < Static103.anInt2156 && arg4 > 0) {
			local12 = Static256.aClass45ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass5_Sub3_1 != null && local12.aClass5_Sub3_1.method5327()) {
				arg1.method5333(-128, arg0, 0, true, local12.aClass5_Sub3_1, 128);
			}
		}
	}
}
