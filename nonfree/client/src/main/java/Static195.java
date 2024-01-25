import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.rj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hb", name = "Lg", descriptor = "[I")
	private static final int[] anIntArray189 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hb", name = "Vg", descriptor = "[I")
	public static final int[] anIntArray191 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hb", name = "Yg", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[16];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!we;)I")
	public static int method3484(@OriginalArg(1) Class373 arg0) {
		if (Static339.aClass373_7 == arg0) {
			return 1;
		} else if (Static337.aClass373_6 == arg0) {
			return 2;
		} else if (Static573.aClass373_2 == arg0) {
			return 3;
		} else if (Static330.aClass373_5 == arg0) {
			return 4;
		} else if (Static255.aClass373_4 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ht;Z)I")
	public static int method3485(@OriginalArg(0) Class151 arg0) {
		if (arg0 == Static481.aClass151_8) {
			return 2;
		} else if (Static524.aClass151_11 == arg0) {
			return 4;
		} else if (arg0 == Static132.aClass151_7) {
			return 26;
		} else if (Static81.aClass151_2 == arg0) {
			return 7;
		} else if (Static1.aClass151_10 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ri;I)I")
	public static int method3486(@OriginalArg(0) Class303 arg0) {
		if (Static533.aClass303_5 == arg0) {
			return 2;
		} else if (arg0 == Static48.aClass303_1) {
			return 3;
		} else if (Static172.aClass303_3 == arg0) {
			return 1;
		} else if (arg0 == Static68.aClass303_2) {
			return 4;
		} else if (arg0 == Static538.aClass303_6) {
			return 6;
		} else if (Static215.aClass303_4 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!mq;)I")
	public static int method3487(@OriginalArg(1) Class236 arg0) {
		if (Static626.aClass236_6 == arg0) {
			return 2;
		} else if (Static273.aClass236_3 == arg0) {
			return 0;
		} else if (arg0 == Static229.aClass236_2) {
			return 1;
		} else if (arg0 == Static105.aClass236_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!gca;B)I")
	public static int method3491(@OriginalArg(0) Class116 arg0) {
		if (arg0 == Static415.aClass116_12) {
			return 2;
		} else if (Static197.aClass116_15 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!lw;BLclient!al;)I")
	public static int method3493(@OriginalArg(0) Class223 arg0, @OriginalArg(2) Class19 arg1) {
		if (Static20.aClass19_4 == arg1) {
			if (arg0 == Static20.aClass223_3) {
				return 22;
			}
			if (arg0 == Static576.aClass223_16) {
				return 21;
			}
			if (arg0 == Static356.aClass223_12) {
				return 28;
			}
			if (arg0 == Static498.aClass223_13) {
				return 50;
			}
			if (arg0 == Static9.aClass223_2) {
				return 51;
			}
			if (arg0 == Static3.aClass223_17) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!jagdx/D3DPRESENT_PARAMETERS;IILclient!jagdx/IDirect3D;)Z")
	public static boolean method3494(@OriginalArg(1) int arg0, @OriginalArg(2) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (rj.b(arg4.a(arg0, local9), 4456)) {
				return false;
			}
			label80: while (arg2 >= 0) {
				if (arg2 != 1) {
					local5 = arg2;
					for (@Pc(35) int local35 = 0; local35 < anIntArray191.length; local35++) {
						if (arg4.CheckDeviceType(arg0, arg3, local9.Format, anIntArray191[local35], true) == 0 && arg4.CheckDeviceFormat(arg0, arg3, local9.Format, 1, 1, anIntArray191[local35]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg3, anIntArray191[local35], true, local5) == 0)) {
							for (@Pc(80) int local80 = 0; local80 < anIntArray189.length; local80++) {
								if (arg4.CheckDeviceFormat(arg0, arg3, local9.Format, 2, 1, anIntArray189[local80]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg3, local9.Format, anIntArray191[local35], anIntArray189[local80]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg3, anIntArray189[local35], true, local5) == 0)) {
									local3 = anIntArray191[local35];
									local1 = anIntArray189[local80];
									break label80;
								}
							}
						}
					}
				}
				arg2--;
			}
			if (arg2 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg1.MultiSampleQuality = 0;
			arg1.MultiSampleType = local5;
			arg1.AutoDepthStencilFormat = local1;
			arg1.BackBufferFormat = local3;
			return true;
		} catch (@Pc(176) Throwable local176) {
			return false;
		}
	}
}
