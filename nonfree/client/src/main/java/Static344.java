import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!o;")
	public static final Class169 aClass169_302 = new Class169("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!re;")
	public static final Class1_Sub33 aClass1_Sub33_10 = new Class1_Sub33(new byte[5000]);

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	public static int anInt5589 = 0;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	public static final int[] anIntArray646 = new int[1000];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4809(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(155) int local155;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local112 <= local155) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(200) int local200;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local200 = 0; local200 < arg0; local200++) {
				if (local200 <= local155 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(246) int local246;
		for (local200 = 0; local200 < arg0; local200++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local246 >= local200 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(304) int local304;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local246 >> 1 >= local304) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(357) int local357;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local357 = arg0 - 1; local357 >= 0; local357--) {
				if (local304 << 1 <= local357) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(398) int local398;
		for (local357 = arg0 - 1; local357 >= 0; local357--) {
			for (local398 = arg0 - 1; local398 >= 0; local398--) {
				if (local357 >> 1 >= local398) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(443) int local443;
		for (local398 = arg0 - 1; local398 >= 0; local398--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local398 << 1 <= local443) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(484) int local484;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local484 = 0; local484 < arg0; local484++) {
				if (local443 >> 1 >= local484) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(525) int local525;
		for (local484 = 0; local484 < arg0; local484++) {
			for (local525 = arg0 - 1; local525 >= 0; local525--) {
				if (local525 >= local484 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(572) int local572;
		for (local525 = arg0 - 1; local525 >= 0; local525--) {
			for (local572 = 0; local572 < arg0; local572++) {
				if (local525 >> 1 <= local572) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(621) int local621;
		for (local572 = 0; local572 < arg0; local572++) {
			for (local621 = 0; local621 < arg0; local621++) {
				if (local572 << 1 >= local621) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(666) int local666;
		for (local621 = 0; local621 < arg0; local621++) {
			for (local666 = arg0 - 1; local666 >= 0; local666--) {
				if (local666 >= local621 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(719) int local719;
		for (local666 = arg0 - 1; local666 >= 0; local666--) {
			for (local719 = arg0 - 1; local719 >= 0; local719--) {
				if (local719 <= local666 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local719 = arg0 - 1; local719 >= 0; local719--) {
			for (@Pc(764) int local764 = arg0 - 1; local764 >= 0; local764--) {
				if (local764 >= local719 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(814) int local814;
		for (@Pc(810) int local810 = arg0 - 1; local810 >= 0; local810--) {
			for (local814 = 0; local814 < arg0; local814++) {
				if (local810 << 1 >= local814) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(856) int local856;
		for (local814 = 0; local814 < arg0; local814++) {
			for (local856 = 0; local856 < arg0; local856++) {
				if (local814 >> 1 <= local856) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(901) int local901;
		for (local856 = 0; local856 < arg0; local856++) {
			for (local901 = arg0 - 1; local901 >= 0; local901--) {
				if (local856 << 1 >= local901) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(939) int local939;
		for (local901 = 0; local901 < arg0; local901++) {
			for (local939 = 0; local939 < arg0; local939++) {
				if (local939 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(978) int local978;
		for (local939 = 0; local939 < arg0; local939++) {
			for (local978 = 0; local978 < arg0; local978++) {
				if (arg0 / 2 >= local939) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1025) int local1025;
		for (local978 = 0; local978 < arg0; local978++) {
			for (local1025 = 0; local1025 < arg0; local1025++) {
				if (local1025 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1068) int local1068;
		for (local1025 = 0; local1025 < arg0; local1025++) {
			for (local1068 = 0; local1068 < arg0; local1068++) {
				if (arg0 / 2 <= local1025) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1111) int local1111;
		for (local1068 = 0; local1068 < arg0; local1068++) {
			for (local1111 = 0; local1111 < arg0; local1111++) {
				if (local1111 <= local1068 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1162) int local1162;
		for (local1111 = arg0 - 1; local1111 >= 0; local1111--) {
			for (local1162 = 0; local1162 < arg0; local1162++) {
				if (local1162 <= local1111 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1213) int local1213;
		for (local1162 = arg0 - 1; local1162 >= 0; local1162--) {
			for (local1213 = arg0 - 1; local1213 >= 0; local1213--) {
				if (local1213 <= local1162 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1255) int local1255;
		for (local1213 = 0; local1213 < arg0; local1213++) {
			for (local1255 = arg0 - 1; local1255 >= 0; local1255--) {
				if (local1213 - arg0 / 2 >= local1255) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1307) int local1307;
		for (local1255 = 0; local1255 < arg0; local1255++) {
			for (local1307 = 0; local1307 < arg0; local1307++) {
				if (local1307 >= local1255 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1355) int local1355;
		for (local1307 = arg0 - 1; local1307 >= 0; local1307--) {
			for (local1355 = 0; local1355 < arg0; local1355++) {
				if (local1355 >= local1307 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1404) int local1404;
		for (local1355 = arg0 - 1; local1355 >= 0; local1355--) {
			for (local1404 = arg0 - 1; local1404 >= 0; local1404--) {
				if (local1404 >= local1355 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1404 = 0; local1404 < arg0; local1404++) {
			for (@Pc(1453) int local1453 = arg0 - 1; local1453 >= 0; local1453--) {
				if (local1404 - arg0 / 2 <= local1453) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
