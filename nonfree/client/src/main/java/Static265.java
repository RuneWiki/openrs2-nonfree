import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!ln;")
	public static final Class203 aClass203_3 = new Class203();

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "S")
	public static short aShort45 = 32767;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IC)B")
	public static byte method4367(@OriginalArg(1) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIILclient!kp;)Z")
	public static boolean method4369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class28_Sub1_Sub4 arg3) {
		if (!Static237.aBoolean328 || !Static665.aBoolean805) {
			return false;
		} else if (Static293.anInt4968 < 100) {
			return false;
		} else if (Static304.method4669(arg1, arg0, arg2)) {
			@Pc(26) int local26 = arg1 << Static391.anInt10262;
			@Pc(30) int local30 = arg0 << Static391.anInt10262;
			@Pc(40) int local40 = Static121.aClass21Array2[arg2].method7973(arg1, arg0) - 1;
			@Pc(52) int local52 = local40 + arg3.method9296();
			if (arg3.aShort104 == 1) {
				if (!Static9.method160(local40, local26, local52, local26, local26, local30, local52, local30, Static207.anInt4003 + local30)) {
					return false;
				} else if (Static9.method160(local40, local26, local40, local26, local26, local30, local52, local30 + Static207.anInt4003, local30 - -Static207.anInt4003)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 == 2) {
				if (!Static9.method160(local40, local26, local52, Static207.anInt4003 + local26, local26, Static207.anInt4003 + local30, local52, local30 + Static207.anInt4003, Static207.anInt4003 + local30)) {
					return false;
				} else if (Static9.method160(local40, local26 + Static207.anInt4003, local52, local26 + Static207.anInt4003, local26, local30 + Static207.anInt4003, local40, Static207.anInt4003 + local30, local30 - -Static207.anInt4003)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 == 4) {
				if (!Static9.method160(local40, local26 + Static207.anInt4003, local52, local26 + Static207.anInt4003, Static207.anInt4003 + local26, local30, local52, local30, local30 + Static207.anInt4003)) {
					return false;
				} else if (Static9.method160(local40, Static207.anInt4003 + local26, local40, local26 + Static207.anInt4003, Static207.anInt4003 + local26, local30, local52, Static207.anInt4003 + local30, Static207.anInt4003 + local30)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 == 8) {
				if (!Static9.method160(local40, local26, local52, Static207.anInt4003 + local26, local26, local30, local52, local30, local30)) {
					return false;
				} else if (Static9.method160(local40, Static207.anInt4003 + local26, local52, Static207.anInt4003 + local26, local26, local30, local40, local30, local30)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 == 16) {
				if (Static85.method1626(local40, local52, Static597.anInt9602, Static597.anInt9602, Static597.anInt9602 + local30, local26)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 == 32) {
				if (Static85.method1626(local40, local52, Static597.anInt9602, Static597.anInt9602, Static597.anInt9602 + local30, local26 - -Static597.anInt9602)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 == 64) {
				if (Static85.method1626(local40, local52, Static597.anInt9602, Static597.anInt9602, local30, Static597.anInt9602 + local26)) {
					Static336.anInt5540++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort104 != 128) {
				return true;
			} else if (Static85.method1626(local40, local52, Static597.anInt9602, Static597.anInt9602, local30, local26)) {
				Static336.anInt5540++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[FI)[F")
	public static float[] method4370(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static684.method5323(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
