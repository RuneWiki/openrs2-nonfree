import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.nba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!ss", name = "Cg", descriptor = "[F")
	public static final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!ss", name = "Hg", descriptor = "[I")
	private static final int[] anIntArray647 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ss", name = "ah", descriptor = "[I")
	private static final int[] anIntArray648 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!gf;)I")
	public static int method6998(@OriginalArg(1) Class120 arg0) {
		if (arg0 == Static22.aClass120_2) {
			return 2;
		} else if (arg0 == Static184.aClass120_3) {
			return 0;
		} else if (arg0 == Static232.aClass120_4) {
			return 1;
		} else if (arg0 == Static19.aClass120_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ob;B)I")
	public static int method7001(@OriginalArg(0) Class247 arg0) {
		if (arg0 == Static238.aClass247_6) {
			return 2;
		} else if (arg0 == Static318.aClass247_4) {
			return 3;
		} else if (arg0 == Static71.aClass247_1) {
			return 1;
		} else if (Static453.aClass247_5 == arg0) {
			return 4;
		} else if (arg0 == Static130.aClass247_2) {
			return 6;
		} else if (arg0 == Static543.aClass247_7) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;IILclient!jagdx/IDirect3D;II)Z")
	public static boolean method7003(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(1) int arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (nba.a(arg2.a(arg1, local9), (int) -20)) {
				return false;
			}
			label82: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(35) int local35 = 0; local35 < anIntArray648.length; local35++) {
						if (arg2.CheckDeviceType(arg1, arg4, local9.Format, anIntArray648[local35], true) == 0 && arg2.CheckDeviceFormat(arg1, arg4, local9.Format, 1, 1, anIntArray648[local35]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg4, anIntArray648[local35], true, local5) == 0)) {
							for (@Pc(90) int local90 = 0; local90 < anIntArray647.length; local90++) {
								if (arg2.CheckDeviceFormat(arg1, arg4, local9.Format, 2, 1, anIntArray647[local90]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg4, local9.Format, anIntArray648[local35], anIntArray647[local90]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg4, anIntArray647[local35], true, local5) == 0)) {
									local1 = anIntArray647[local90];
									local3 = anIntArray648[local35];
									break label82;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg0.MultiSampleQuality = 0;
			arg0.BackBufferFormat = local3;
			arg0.MultiSampleType = local5;
			arg0.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(190) Throwable local190) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!nea;B)I")
	public static int method7004(@OriginalArg(0) Class240 arg0) {
		if (Static174.aClass240_2 == arg0) {
			return 2;
		} else if (Static152.aClass240_1 == arg0) {
			return 4;
		} else if (arg0 == Static440.aClass240_3) {
			return 26;
		} else if (Static598.aClass240_5 == arg0) {
			return 7;
		} else if (Static494.aClass240_4 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Lclient!hi;Lclient!ne;I)I")
	public static int method7005(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class239 arg1) {
		if (arg1 == Static349.aClass239_12) {
			if (arg0 == Static431.aClass141_11) {
				return 22;
			}
			if (arg0 == Static85.aClass141_2) {
				return 21;
			}
			if (Static106.aClass141_3 == arg0) {
				return 28;
			}
			if (arg0 == Static128.aClass141_6) {
				return 50;
			}
			if (arg0 == Static471.aClass141_13) {
				return 51;
			}
			if (arg0 == Static129.aClass141_7) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!cba;)I")
	public static int method7007(@OriginalArg(1) Class46 arg0) {
		if (arg0 == Static472.aClass46_9) {
			return 2;
		} else if (arg0 == Static393.aClass46_12) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!eb;B)I")
	public static int method7008(@OriginalArg(0) Class81 arg0) {
		if (Static592.aClass81_9 == arg0) {
			return 1;
		} else if (arg0 == Static49.aClass81_4) {
			return 2;
		} else if (arg0 == Static482.aClass81_7) {
			return 3;
		} else if (arg0 == Static209.aClass81_8) {
			return 4;
		} else if (Static253.aClass81_6 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}
}
