import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "Lclient!oa;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray82 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString202 = "scroll:";

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!e;Lclient!hm;III)V")
	public static void method4794(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class213 local12;
		if (arg3 < Static233.anInt4556) {
			local12 = Static98.aClass213ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method5339()) {
				arg1.method5335(0, arg0, 0, true, local12.aClass10_Sub5_1, 128);
			}
		}
		if (arg4 < Static233.anInt4556) {
			local12 = Static98.aClass213ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method5339()) {
				arg1.method5335(128, arg0, 0, true, local12.aClass10_Sub5_1, 0);
			}
		}
		if (arg3 < Static233.anInt4556 && arg4 < Static180.anInt3712) {
			local12 = Static98.aClass213ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method5339()) {
				arg1.method5335(128, arg0, 0, true, local12.aClass10_Sub5_1, 128);
			}
		}
		if (arg3 < Static233.anInt4556 && arg4 > 0) {
			local12 = Static98.aClass213ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method5339()) {
				arg1.method5335(-128, arg0, 0, true, local12.aClass10_Sub5_1, 128);
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZILjava/lang/String;B)Z")
	public static boolean method4795(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(92) int local92;
			if (local46 >= '0' && local46 <= '9') {
				local92 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local92 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local92 = local46 - 'W';
			} else {
				return false;
			}
			if (local92 >= 10) {
				return false;
			}
			if (local26) {
				local92 = -local92;
			}
			@Pc(117) int local117 = local35 * 10 + local92;
			if (local35 != local117 / 10) {
				return false;
			}
			local35 = local117;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!kp;I)V")
	public static void method4796(@OriginalArg(0) Class14_Sub19 arg0) {
		arg0.aBoolean424 = false;
		if (arg0.aClass14_Sub11_5 != null) {
			arg0.aClass14_Sub11_5.anInt3558 = 0;
		}
		for (@Pc(23) Class14_Sub19 local23 = arg0.method5506(); local23 != null; local23 = arg0.method5508()) {
			method4796(local23);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)I")
	public static int method4797(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
