import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fu", name = "D", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array8;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!bm;Lclient!uea;IILclient!ha;)Z")
	public static boolean method2925(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class3_Sub49 arg1, @OriginalArg(5) Class5 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray40 != null) {
			local13 = Static110.anInt3021 - (arg0.anInt1341 + arg1.anInt9437 - Static110.anInt3022) * (-Static110.anInt3016 + Static110.anInt3021) / (Static110.anInt3015 - Static110.anInt3022);
			local7 = (Static110.anInt3017 - Static110.anInt3018) * (arg1.anInt9439 + arg0.anInt1345 - Static110.anInt3023) / (Static110.anInt3013 - Static110.anInt3023) + Static110.anInt3018;
			local9 = Static110.anInt3018 + (Static110.anInt3017 - Static110.anInt3018) * (-Static110.anInt3023 + arg1.anInt9439 + arg0.anInt1331) / (Static110.anInt3013 - Static110.anInt3023);
			local11 = Static110.anInt3021 - (arg0.anInt1361 + arg1.anInt9437 - Static110.anInt3022) * (Static110.anInt3021 + -Static110.anInt3016) / (Static110.anInt3015 - Static110.anInt3022);
		}
		@Pc(106) Class24 local106 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg0.anInt1339 != -1) {
			if (arg1.aBoolean675 && arg0.anInt1366 != -1) {
				local106 = arg0.method1414(arg2, true);
			} else {
				local106 = arg0.method1414(arg2, false);
			}
			if (local106 != null) {
				local108 = arg1.anInt9438 - (local106.method8576() + 1 >> 1);
				if (local7 > local108) {
					local7 = local108;
				}
				local110 = arg1.anInt9438 + (local106.method8576() + 1 >> 1);
				local112 = arg1.anInt9440 - (local106.method8573() + 1 >> 1);
				if (local9 < local110) {
					local9 = local110;
				}
				local114 = arg1.anInt9440 + (local106.method8573() + 1 >> 1);
				if (local11 > local112) {
					local11 = local112;
				}
				if (local13 < local114) {
					local13 = local114;
				}
			}
		}
		@Pc(213) Class172 local213 = null;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(308) int local308;
		if (arg0.aString5 != null) {
			local213 = Static620.method8609(arg0.anInt1357);
			if (local213 != null) {
				local215 = Static607.aClass282_15.method7136(null, arg0.aString5, Static609.aStringArray38, null);
				local219 = arg1.anInt9440 - arg0.anInt1343 * (Static110.anInt3021 - Static110.anInt3016) / (Static110.anInt3015 - Static110.anInt3022);
				local217 = arg0.anInt1356 * (Static110.anInt3017 - Static110.anInt3018) / (Static110.anInt3013 - Static110.anInt3023) + arg1.anInt9438;
				if (local106 == null) {
					local219 -= local215 * local213.method4402() / 2;
				} else {
					local219 -= (local106.method8573() >> 1) + (local213.method4399() * local215);
				}
				for (local308 = 0; local308 < local215; local308++) {
					@Pc(314) String local314 = Static609.aStringArray38[local308];
					if (local215 - 1 > local308) {
						local314 = local314.substring(0, local314.length() - 4);
					}
					@Pc(335) int local335 = local213.method4403(local314);
					if (local221 < local335) {
						local221 = local335;
					}
				}
				local223 = local217 - local221 / 2;
				local225 = local221 / 2 + local217;
				if (local7 > local223) {
					local7 = local223;
				}
				local227 = local219;
				if (local9 < local225) {
					local9 = local225;
				}
				if (local11 > local227) {
					local11 = local227;
				}
				local229 = local215 * local213.method4399() + local219;
				if (local229 > local13) {
					local13 = local229;
				}
			}
		}
		if (local9 < Static110.anInt3018 || Static110.anInt3017 < local7 || local13 < Static110.anInt3016 || Static110.anInt3021 < local11) {
			return true;
		}
		Static110.method2790(arg2, arg1, arg0);
		if (local106 != null) {
			if (Static238.anInt4463 > 0 && (Static619.anInt10018 != -1 && arg1.anInt9434 == Static619.anInt10018 || Static109.anInt2368 != -1 && Static109.anInt2368 == arg0.anInt1351)) {
				if (Static165.anInt3234 > 50) {
					local308 = (100 - Static165.anInt3234) * 2;
				} else {
					local308 = Static165.anInt3234 * 2;
				}
				@Pc(478) int local478 = local308 << 24 | 0xFFFF00;
				arg2.method7553(arg1.anInt9440, arg1.anInt9438, local478, local106.method8558() / 2 + 7);
				arg2.method7553(arg1.anInt9440, arg1.anInt9438, local478, local106.method8558() / 2 + 5);
				arg2.method7553(arg1.anInt9440, arg1.anInt9438, local478, local106.method8558() / 2 + 3);
				arg2.method7553(arg1.anInt9440, arg1.anInt9438, local478, local106.method8558() / 2 + 1);
				arg2.method7553(arg1.anInt9440, arg1.anInt9438, local478, local106.method8558() / 2);
			}
			local106.method8559(arg1.anInt9438 - (local106.method8576() >> 1), arg1.anInt9440 - (local106.method8573() >> 1));
		}
		if (arg0.aString5 != null && local213 != null) {
			Static464.method7043(arg1, arg2, local213, local215, local221, local219, arg0, local217);
		}
		if (arg0.anInt1339 != -1 || arg0.aString5 != null) {
			@Pc(591) Class3_Sub33 local591 = new Class3_Sub33(arg1);
			local591.anInt5137 = local225;
			local591.anInt5139 = local108;
			local591.anInt5135 = local227;
			local591.anInt5141 = local223;
			local591.anInt5138 = local114;
			local591.anInt5140 = local112;
			local591.anInt5143 = local229;
			local591.anInt5134 = local110;
			Static566.aClass223_60.method5868(local591);
		}
		return false;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method2939(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static317.method5193(arg1, arg0, local11);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
