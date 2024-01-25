import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	public static int anInt4485;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public static void method4108() {
		if (Static619.anInt9777 == -1 || Static560.anInt9040 == -1) {
			return;
		}
		@Pc(27) int local27 = (Static47.anInt578 * (Static221.anInt4356 - Static93.anInt1379) >> 16) + Static93.anInt1379;
		Static47.anInt578 += local27;
		if (Static47.anInt578 >= 65535) {
			if (Static356.aBoolean443) {
				Static28.aBoolean28 = false;
			} else {
				Static28.aBoolean28 = true;
			}
			Static47.anInt578 = 65535;
			Static356.aBoolean443 = true;
		} else {
			Static356.aBoolean443 = false;
			Static28.aBoolean28 = false;
		}
		@Pc(67) float local67 = (float) Static47.anInt578 / 65535.0F;
		@Pc(75) float[] local75 = new float[3];
		@Pc(79) int local79 = Static209.anInt4178 * 2;
		@Pc(107) int local107;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(153) int local153;
		@Pc(161) int local161;
		@Pc(180) int local180;
		for (@Pc(81) int local81 = 0; local81 < 3; local81++) {
			@Pc(95) int local95 = Static375.anIntArrayArrayArray15[Static619.anInt9777][local79][local81] * 3;
			local107 = Static375.anIntArrayArrayArray15[Static619.anInt9777][local79 + 1][local81] * 3;
			local140 = (Static375.anIntArrayArrayArray15[Static619.anInt9777][local79 + 2][local81] + Static375.anIntArrayArrayArray15[Static619.anInt9777][local79 + 2][local81] - Static375.anIntArrayArrayArray15[Static619.anInt9777][local79 + 3][local81]) * 3;
			local148 = Static375.anIntArrayArrayArray15[Static619.anInt9777][local79][local81];
			local153 = local107 - local95;
			local161 = local140 + local95 - local107 * 2;
			local180 = Static375.anIntArrayArrayArray15[Static619.anInt9777][local79 + 2][local81] + local107 - local148 - local140;
			local75[local81] = local67 * ((local67 * (float) local180 + (float) local161) * local67 + (float) local153) + (float) local148;
		}
		Static475.anInt8090 = (int) local75[0] - Static50.anInt606 * 512;
		Static406.anInt7076 = (int) local75[1] * -1;
		Static365.anInt6155 = (int) local75[2] - Static404.anInt7039 * 512;
		@Pc(236) float[] local236 = new float[3];
		local107 = Static358.anInt6046 * 2;
		for (local140 = 0; local140 < 3; local140++) {
			local148 = Static375.anIntArrayArrayArray15[Static560.anInt9040][local107][local140] * 3;
			local153 = Static375.anIntArrayArrayArray15[Static560.anInt9040][local107 + 1][local140] * 3;
			local161 = (Static375.anIntArrayArrayArray15[Static560.anInt9040][local107 + 2][local140] + Static375.anIntArrayArrayArray15[Static560.anInt9040][local107 + 2][local140] - Static375.anIntArrayArrayArray15[Static560.anInt9040][local107 + 3][local140]) * 3;
			local180 = Static375.anIntArrayArrayArray15[Static560.anInt9040][local107][local140];
			@Pc(315) int local315 = local153 - local148;
			@Pc(324) int local324 = local148 + local161 - local153 * 2;
			@Pc(343) int local343 = Static375.anIntArrayArrayArray15[Static560.anInt9040][local107 + 2][local140] + local153 - local161 - local180;
			local236[local140] = (local67 * ((float) local343 * local67 + (float) local324) + (float) local315) * local67 + (float) local180;
		}
		@Pc(377) float local377 = local236[0] - local75[0];
		@Pc(388) float local388 = (local236[1] - local75[1]) * -1.0F;
		@Pc(396) float local396 = local236[2] - local75[2];
		@Pc(406) double local406 = Math.sqrt((double) (local396 * local396 + local377 * local377));
		Static337.anInt5759 = (int) (Math.atan2((double) local388, local406) * 2607.5945876176133D) & 0x3FFF;
		Static21.anInt279 = (int) (-Math.atan2((double) local377, (double) local396) * 2607.5945876176133D) & 0x3FFF;
		Static200.anInt4059 = ((Static375.anIntArrayArrayArray15[Static619.anInt9777][local79 + 2][3] - Static375.anIntArrayArrayArray15[Static619.anInt9777][local79][3]) * Static47.anInt578 >> 16) + Static375.anIntArrayArrayArray15[Static619.anInt9777][local79][3];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)I")
	public static int method4109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Z)V")
	public static void method4110() {
		if (Static233.anInt4508 <= 0) {
			Static623.aString118 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static177.aStringArray14.length; local18++) {
			if (Static177.aStringArray14[local18].indexOf("--> ") != -1) {
				local16++;
				if (local16 == Static233.anInt4508) {
					Static623.aString118 = Static177.aStringArray14[local18].substring(Static177.aStringArray14[local18].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Z")
	public static boolean method4111(@OriginalArg(0) int arg0) {
		return arg0 == 23 || arg0 == 13 || arg0 == 15 || arg0 == 10 || arg0 == 53 || arg0 == 46 || arg0 == 58 || arg0 == 59 || arg0 == 30 || arg0 == 25 || arg0 == 48;
	}
}
