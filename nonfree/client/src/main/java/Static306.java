import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.aq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!ki", name = "Ng", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!ki", name = "ch", descriptor = "[I")
	private static final int[] anIntArray284 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ki", name = "dh", descriptor = "[I")
	private static final int[] anIntArray285 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!si;)I")
	public static int method4605(@OriginalArg(1) Class323 arg0) {
		if (Static409.aClass323_3 == arg0) {
			return 2;
		} else if (arg0 == Static149.aClass323_1) {
			return 3;
		} else if (Static584.aClass323_5 == arg0) {
			return 1;
		} else if (arg0 == Static536.aClass323_4) {
			return 4;
		} else if (arg0 == Static672.aClass323_6) {
			return 6;
		} else if (Static228.aClass323_2 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;I)Z")
	public static boolean method4606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) D3DPRESENT_PARAMETERS arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (aq.a(-74, arg3.a(arg4, local14))) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local10 = arg0;
					for (@Pc(35) int local35 = 0; local35 < anIntArray284.length; local35++) {
						if (arg3.CheckDeviceType(arg4, arg1, local14.Format, anIntArray284[local35], true) == 0 && arg3.CheckDeviceFormat(arg4, arg1, local14.Format, 1, 1, anIntArray284[local35]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, anIntArray284[local35], true, local10) == 0)) {
							for (@Pc(82) int local82 = 0; local82 < anIntArray285.length; local82++) {
								if (arg3.CheckDeviceFormat(arg4, arg1, local14.Format, 2, 1, anIntArray285[local82]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg1, local14.Format, anIntArray284[local35], anIntArray285[local82]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, anIntArray285[local35], true, local10) == 0)) {
									local8 = anIntArray284[local35];
									local6 = anIntArray285[local82];
									break label80;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local8 == 0 || local6 == 0) {
				return false;
			}
			arg2.MultiSampleType = local10;
			arg2.MultiSampleQuality = 0;
			arg2.AutoDepthStencilFormat = local6;
			arg2.BackBufferFormat = local8;
			return true;
		} catch (@Pc(173) Throwable local173) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ada;B)I")
	public static int method4607(@OriginalArg(0) Class6 arg0) {
		if (arg0 == Static371.aClass6_2) {
			return 2;
		} else if (arg0 == Static600.aClass6_4) {
			return 4;
		} else if (Static460.aClass6_3 == arg0) {
			return 26;
		} else if (Static346.aClass6_1 == arg0) {
			return 7;
		} else if (Static646.aClass6_5 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ofa;ILclient!kn;)I")
	public static int method4609(@OriginalArg(0) Class255 arg0, @OriginalArg(2) Class206 arg1) {
		if (arg1 == Static314.aClass206_12) {
			if (arg0 == Static91.aClass255_21) {
				return 22;
			}
			if (Static92.aClass255_3 == arg0) {
				return 21;
			}
			if (arg0 == Static83.aClass255_1) {
				return 28;
			}
			if (Static199.aClass255_10 == arg0) {
				return 50;
			}
			if (Static368.aClass255_16 == arg0) {
				return 51;
			}
			if (arg0 == Static138.aClass255_7) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!pd;)I")
	public static int method4612(@OriginalArg(1) Class270 arg0) {
		if (Static275.aClass270_4 == arg0) {
			return 1;
		} else if (Static73.aClass270_1 == arg0) {
			return 2;
		} else if (Static357.aClass270_5 == arg0) {
			return 3;
		} else if (Static458.aClass270_6 == arg0) {
			return 4;
		} else if (arg0 == Static219.aClass270_3) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!eca;)I")
	public static int method4613(@OriginalArg(1) Class90 arg0) {
		if (Static663.aClass90_4 == arg0) {
			return 2;
		} else if (arg0 == Static619.aClass90_3) {
			return 0;
		} else if (arg0 == Static85.aClass90_2) {
			return 1;
		} else if (arg0 == Static85.aClass90_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!cr;)I")
	public static int method4614(@OriginalArg(1) Class67 arg0) {
		if (Static671.aClass67_11 == arg0) {
			return 2;
		} else if (Static76.aClass67_1 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
