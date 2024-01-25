import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
	public static int anInt2613;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method2102(@OriginalArg(1) int arg0) {
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
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(113) int local113;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local73 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(152) int local152;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local113 <= local152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(201) int local201;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local152 >> 1 >= local201) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(250) int local250;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local250 = 0; local250 < arg0; local250++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local250 >= local201 << 1) {
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
		@Pc(307) int local307;
		for (local250 = 0; local250 < arg0; local250++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local307 <= local250 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(360) int local360;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local360 = arg0 - 1; local360 >= 0; local360--) {
				if (local307 << 1 <= local360) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(404) int local404;
		for (local360 = arg0 - 1; local360 >= 0; local360--) {
			for (local404 = arg0 - 1; local404 >= 0; local404--) {
				if (local360 >> 1 >= local404) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(447) int local447;
		for (local404 = arg0 - 1; local404 >= 0; local404--) {
			for (local447 = 0; local447 < arg0; local447++) {
				if (local447 >= local404 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(485) int local485;
		for (local447 = 0; local447 < arg0; local447++) {
			for (local485 = 0; local485 < arg0; local485++) {
				if (local485 <= local447 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(534) int local534;
		for (local485 = 0; local485 < arg0; local485++) {
			for (local534 = arg0 - 1; local534 >= 0; local534--) {
				if (local485 << 1 <= local534) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(578) int local578;
		for (local534 = arg0 - 1; local534 >= 0; local534--) {
			for (local578 = 0; local578 < arg0; local578++) {
				if (local534 >> 1 <= local578) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(627) int local627;
		for (local578 = 0; local578 < arg0; local578++) {
			for (local627 = 0; local627 < arg0; local627++) {
				if (local578 << 1 >= local627) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(676) int local676;
		for (local627 = 0; local627 < arg0; local627++) {
			for (local676 = arg0 - 1; local676 >= 0; local676--) {
				if (local676 >= local627 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(725) int local725;
		for (local676 = arg0 - 1; local676 >= 0; local676--) {
			for (local725 = arg0 - 1; local725 >= 0; local725--) {
				if (local725 <= local676 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(776) int local776;
		for (local725 = arg0 - 1; local725 >= 0; local725--) {
			for (local776 = arg0 - 1; local776 >= 0; local776--) {
				if (local776 >= local725 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(825) int local825;
		for (local776 = arg0 - 1; local776 >= 0; local776--) {
			for (local825 = 0; local825 < arg0; local825++) {
				if (local825 <= local776 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(863) int local863;
		for (local825 = 0; local825 < arg0; local825++) {
			for (local863 = 0; local863 < arg0; local863++) {
				if (local863 >= local825 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(908) int local908;
		for (local863 = 0; local863 < arg0; local863++) {
			for (local908 = arg0 - 1; local908 >= 0; local908--) {
				if (local863 << 1 >= local908) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(946) int local946;
		for (local908 = 0; local908 < arg0; local908++) {
			for (local946 = 0; local946 < arg0; local946++) {
				if (arg0 / 2 >= local946) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(993) int local993;
		for (local946 = 0; local946 < arg0; local946++) {
			for (local993 = 0; local993 < arg0; local993++) {
				if (local946 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1040) int local1040;
		for (local993 = 0; local993 < arg0; local993++) {
			for (local1040 = 0; local1040 < arg0; local1040++) {
				if (local1040 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1083) int local1083;
		for (local1040 = 0; local1040 < arg0; local1040++) {
			for (local1083 = 0; local1083 < arg0; local1083++) {
				if (arg0 / 2 <= local1040) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1122) int local1122;
		for (local1083 = 0; local1083 < arg0; local1083++) {
			for (local1122 = 0; local1122 < arg0; local1122++) {
				if (local1083 - arg0 / 2 >= local1122) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1170) int local1170;
		for (local1122 = arg0 - 1; local1122 >= 0; local1122--) {
			for (local1170 = 0; local1170 < arg0; local1170++) {
				if (local1122 - arg0 / 2 >= local1170) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1225) int local1225;
		for (local1170 = arg0 - 1; local1170 >= 0; local1170--) {
			for (local1225 = arg0 - 1; local1225 >= 0; local1225--) {
				if (local1170 - arg0 / 2 >= local1225) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1274) int local1274;
		for (local1225 = 0; local1225 < arg0; local1225++) {
			for (local1274 = arg0 - 1; local1274 >= 0; local1274--) {
				if (local1225 - arg0 / 2 >= local1274) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1322) int local1322;
		for (local1274 = 0; local1274 < arg0; local1274++) {
			for (local1322 = 0; local1322 < arg0; local1322++) {
				if (local1322 >= local1274 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1370) int local1370;
		for (local1322 = arg0 - 1; local1322 >= 0; local1322--) {
			for (local1370 = 0; local1370 < arg0; local1370++) {
				if (local1370 >= local1322 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1419) int local1419;
		for (local1370 = arg0 - 1; local1370 >= 0; local1370--) {
			for (local1419 = arg0 - 1; local1419 >= 0; local1419--) {
				if (local1370 - arg0 / 2 <= local1419) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1419 = 0; local1419 < arg0; local1419++) {
			for (@Pc(1464) int local1464 = arg0 - 1; local1464 >= 0; local1464--) {
				if (local1464 >= local1419 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
	public static void method2103() {
		if (Static9.anInt758 == 7) {
			Static254.method4043(false);
		} else {
			Static58.aClass36_1 = Static528.aClass36_2;
			Static528.aClass36_2 = null;
			Static231.method3759(13);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!is;II)V")
	public static void method2104(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class67 local8 = arg1.method3701(Static39.aClass7_2);
		if (local8 == null) {
			return;
		}
		Static39.aClass7_2.da(arg0, arg2, arg0 + arg1.anInt4806, arg1.anInt4831 + arg2);
		if (Static291.anInt5976 < 3) {
			Static595.aClass88_39.method8041((float) arg1.anInt4806 / 2.0F + (float) arg0, (float) arg2 + (float) arg1.anInt4831 / 2.0F, ((int) -Static189.aFloat83 & 0x3FFF) << 2, local8, arg0, arg2);
		} else {
			Static39.aClass7_2.FA(-16777216, local8, arg0, arg2);
		}
	}
}
