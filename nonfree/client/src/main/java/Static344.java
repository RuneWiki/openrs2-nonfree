import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.pia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!lj", name = "Qg", descriptor = "[I")
	private static final int[] anIntArray314 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!lj", name = "Wg", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[16];

	@OriginalMember(owner = "client!lj", name = "Xg", descriptor = "[I")
	private static final int[] anIntArray315 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;)Z")
	public static boolean method5965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) D3DPRESENT_PARAMETERS arg2, @OriginalArg(4) int arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (pia.a((byte) -110, arg4.a(arg1, local9))) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(32) int local32 = 0; local32 < anIntArray315.length; local32++) {
						if (arg4.CheckDeviceType(arg1, arg3, local9.Format, anIntArray315[local32], true) == 0 && arg4.CheckDeviceFormat(arg1, arg3, local9.Format, 1, 1, anIntArray315[local32]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg3, anIntArray315[local32], true, local5) == 0)) {
							for (@Pc(83) int local83 = 0; local83 < anIntArray314.length; local83++) {
								if (arg4.CheckDeviceFormat(arg1, arg3, local9.Format, 2, 1, anIntArray314[local83]) == 0 && arg4.CheckDepthStencilMatch(arg1, arg3, local9.Format, anIntArray315[local32], anIntArray314[local83]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg3, anIntArray314[local32], true, local5) == 0)) {
									local3 = anIntArray315[local32];
									local1 = anIntArray314[local83];
									break label80;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg2.AutoDepthStencilFormat = local1;
			arg2.MultiSampleType = local5;
			arg2.MultiSampleQuality = 0;
			arg2.BackBufferFormat = local3;
			return true;
		} catch (@Pc(173) Throwable local173) {
			return false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!rha;I)I")
	public static int method5966(@OriginalArg(0) Class315 arg0) {
		if (Static100.aClass315_2 == arg0) {
			return 2;
		} else if (arg0 == Static173.aClass315_8) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!vt;)I")
	public static int method5968(@OriginalArg(1) Class381 arg0) {
		if (arg0 == Static512.aClass381_5) {
			return 2;
		} else if (Static175.aClass381_3 == arg0) {
			return 4;
		} else if (arg0 == Static98.aClass381_1) {
			return 26;
		} else if (arg0 == Static238.aClass381_4) {
			return 7;
		} else if (arg0 == Static136.aClass381_2) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!gca;)I")
	public static int method5969(@OriginalArg(1) Class118 arg0) {
		if (Static44.aClass118_1 == arg0) {
			return 2;
		} else if (Static312.aClass118_3 == arg0) {
			return 0;
		} else if (Static175.aClass118_2 == arg0) {
			return 1;
		} else if (Static660.aClass118_5 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!nea;Lclient!dr;B)I")
	public static int method5970(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class79 arg1) {
		if (Static114.aClass79_7 == arg1) {
			if (arg0 == Static142.aClass244_5) {
				return 22;
			}
			if (Static584.aClass244_9 == arg0) {
				return 21;
			}
			if (Static612.aClass244_15 == arg0) {
				return 28;
			}
			if (arg0 == Static314.aClass244_12) {
				return 50;
			}
			if (arg0 == Static105.aClass244_4) {
				return 51;
			}
			if (Static412.aClass244_13 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLclient!rl;)I")
	public static int method5974(@OriginalArg(1) Class320 arg0) {
		if (arg0 == Static605.aClass320_5) {
			return 2;
		} else if (arg0 == Static310.aClass320_4) {
			return 3;
		} else if (Static80.aClass320_2 == arg0) {
			return 1;
		} else if (Static627.aClass320_6 == arg0) {
			return 4;
		} else if (arg0 == Static70.aClass320_1) {
			return 6;
		} else if (Static120.aClass320_3 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILclient!saa;)I")
	public static int method5976(@OriginalArg(1) Class327 arg0) {
		if (Static306.aClass327_2 == arg0) {
			return 1;
		} else if (arg0 == Static174.aClass327_1) {
			return 2;
		} else if (arg0 == Static647.aClass327_5) {
			return 3;
		} else if (arg0 == Static656.aClass327_6) {
			return 4;
		} else if (Static622.aClass327_4 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}
}
