import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.fma;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!tha", name = "Tg", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[16];

	@OriginalMember(owner = "client!tha", name = "zg", descriptor = "[I")
	public static final int[] anIntArray694 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!tha", name = "vg", descriptor = "[I")
	private static final int[] anIntArray695 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!le;)I")
	public static int method8191(@OriginalArg(1) Class222 arg0) {
		if (Static323.aClass222_3 == arg0) {
			return 1;
		} else if (Static606.aClass222_6 == arg0) {
			return 2;
		} else if (Static508.aClass222_5 == arg0) {
			return 3;
		} else if (Static500.aClass222_4 == arg0) {
			return 4;
		} else if (Static187.aClass222_2 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!hu;Lclient!sca;I)I")
	public static int method8193(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class335 arg1) {
		if (arg0 == Static259.aClass167_7) {
			if (arg1 == Static661.aClass335_16) {
				return 22;
			}
			if (arg1 == Static646.aClass335_14) {
				return 21;
			}
			if (Static702.aClass335_19 == arg1) {
				return 28;
			}
			if (Static514.aClass335_15 == arg1) {
				return 50;
			}
			if (Static109.aClass335_4 == arg1) {
				return 51;
			}
			if (Static684.aClass335_17 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IILclient!jagdx/IDirect3D;IILclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method8194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(3) int arg3, @OriginalArg(5) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (fma.a(arg2.a(arg1, local9), (int) 0)) {
				return false;
			}
			label81: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(46) int local46 = 0; local46 < anIntArray694.length; local46++) {
						if (arg2.CheckDeviceType(arg1, arg3, local9.Format, anIntArray694[local46], true) == 0 && arg2.CheckDeviceFormat(arg1, arg3, local9.Format, 1, 1, anIntArray694[local46]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg3, anIntArray694[local46], true, local5) == 0)) {
							for (@Pc(105) int local105 = 0; local105 < anIntArray695.length; local105++) {
								if (arg2.CheckDeviceFormat(arg1, arg3, local9.Format, 2, 1, anIntArray695[local105]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg3, local9.Format, anIntArray694[local46], anIntArray695[local105]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg3, anIntArray695[local46], true, local5) == 0)) {
									local3 = anIntArray694[local46];
									local1 = anIntArray695[local105];
									break label81;
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
			arg4.MultiSampleType = local5;
			arg4.MultiSampleQuality = 0;
			arg4.BackBufferFormat = local3;
			arg4.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(215) Throwable local215) {
			return false;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!vga;)I")
	public static int method8196(@OriginalArg(1) Class392 arg0) {
		if (Static358.aClass392_1 == arg0) {
			return 2;
		} else if (arg0 == Static407.aClass392_2) {
			return 0;
		} else if (Static671.aClass392_4 == arg0) {
			return 1;
		} else if (arg0 == Static547.aClass392_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!on;I)I")
	public static int method8200(@OriginalArg(0) Class280 arg0) {
		if (arg0 == Static131.aClass280_4) {
			return 2;
		} else if (Static267.aClass280_5 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!ug;I)I")
	public static int method8201(@OriginalArg(0) Class372 arg0) {
		if (Static468.aClass372_3 == arg0) {
			return 2;
		} else if (arg0 == Static503.aClass372_4) {
			return 4;
		} else if (Static240.aClass372_6 == arg0) {
			return 26;
		} else if (arg0 == Static666.aClass372_7) {
			return 7;
		} else if (arg0 == Static503.aClass372_5) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLclient!lma;)I")
	public static int method8202(@OriginalArg(1) Class234 arg0) {
		if (arg0 == Static35.aClass234_2) {
			return 2;
		} else if (Static346.aClass234_4 == arg0) {
			return 3;
		} else if (Static397.aClass234_5 == arg0) {
			return 1;
		} else if (Static492.aClass234_6 == arg0) {
			return 4;
		} else if (Static339.aClass234_3 == arg0) {
			return 6;
		} else if (arg0 == Static32.aClass234_1) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
