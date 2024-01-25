import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!hg", name = "Dg", descriptor = "[I")
	private static final int[] anIntArray294 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hg", name = "Rg", descriptor = "[I")
	private static final int[] anIntArray295 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hg", name = "Tg", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;IZILclient!jagdx/IDirect3D;I)Z")
	public static boolean method3484(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		@Pc(13) D3DDISPLAYMODE local13 = arg3.c(arg4);
		label69: while (arg2 >= 0) {
			if (arg2 != 1) {
				local9 = arg2;
				for (@Pc(27) int local27 = 0; local27 < anIntArray294.length; local27++) {
					if (arg3.CheckDeviceType(arg4, arg1, local13.Format, anIntArray294[local27], true) == 0 && arg3.CheckDeviceFormat(arg4, arg1, local13.Format, 1, 1, anIntArray294[local27]) == 0 && (arg2 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, anIntArray294[local27], true, local9) == 0)) {
						for (@Pc(83) int local83 = 0; local83 < anIntArray295.length; local83++) {
							if (arg3.CheckDeviceFormat(arg4, arg1, local13.Format, 2, 1, anIntArray295[local83]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg1, local13.Format, anIntArray294[local27], anIntArray295[local83]) == 0 && (arg2 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, anIntArray295[local27], true, local9) == 0)) {
								local3 = anIntArray294[local27];
								local1 = anIntArray295[local83];
								break label69;
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
		arg0.BackBufferFormat = local3;
		arg0.AutoDepthStencilFormat = local1;
		arg0.MultiSampleType = local9;
		arg0.MultiSampleQuality = 0;
		return true;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!sc;B)I")
	public static int method3485(@OriginalArg(0) Class263 arg0) {
		if (arg0 == Static298.aClass263_4) {
			return 2;
		} else if (Static489.aClass263_6 == arg0) {
			return 3;
		} else if (Static504.aClass263_7 == arg0) {
			return 1;
		} else if (arg0 == Static416.aClass263_5) {
			return 4;
		} else if (arg0 == Static57.aClass263_3) {
			return 6;
		} else if (Static192.aClass263_2 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!ie;)I")
	public static int method3488(@OriginalArg(1) Class136 arg0) {
		if (Static114.aClass136_8 == arg0) {
			return 2;
		} else if (Static519.aClass136_7 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!bg;)I")
	public static int method3490(@OriginalArg(1) Class27 arg0) {
		if (arg0 == Static360.aClass27_5) {
			return 2;
		} else if (arg0 == Static503.aClass27_3) {
			return 0;
		} else if (arg0 == Static226.aClass27_1) {
			return 1;
		} else if (arg0 == Static319.aClass27_4) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!raa;)I")
	public static int method3491(@OriginalArg(1) Class246 arg0) {
		if (arg0 == Static428.aClass246_3) {
			return 2;
		} else if (Static459.aClass246_5 == arg0) {
			return 4;
		} else if (arg0 == Static449.aClass246_4) {
			return 26;
		} else if (arg0 == Static157.aClass246_1) {
			return 7;
		} else if (arg0 == Static409.aClass246_2) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ft;I)I")
	public static int method3492(@OriginalArg(0) Class107 arg0) {
		if (arg0 == Static259.aClass107_3) {
			return 1;
		} else if (Static333.aClass107_5 == arg0) {
			return 2;
		} else if (arg0 == Static159.aClass107_2) {
			return 3;
		} else if (arg0 == Static470.aClass107_7) {
			return 4;
		} else if (arg0 == Static273.aClass107_4) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!g;ILclient!vp;)I")
	public static int method3493(@OriginalArg(0) Class110 arg0, @OriginalArg(2) Class308 arg1) {
		if (Static517.aClass308_15 == arg1) {
			if (arg0 == Static56.aClass110_3) {
				return 22;
			}
			if (arg0 == Static171.aClass110_13) {
				return 21;
			}
			if (arg0 == Static504.aClass110_22) {
				return 28;
			}
			if (Static281.aClass110_17 == arg0) {
				return 50;
			}
			if (arg0 == Static533.aClass110_25) {
				return 51;
			}
			if (arg0 == Static264.aClass110_26) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
