import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.hb;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gb", name = "sg", descriptor = "[I")
	public static final int[] anIntArray237 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!gb", name = "ug", descriptor = "[I")
	public static final int[] anIntArray238 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!gb", name = "Gg", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!up;I)I")
	public static int method3241(@OriginalArg(0) Class321 arg0) {
		if (arg0 == Static333.aClass321_7) {
			return 2;
		} else if (Static53.aClass321_1 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vd;B)I")
	public static int method3242(@OriginalArg(0) Class328 arg0) {
		if (Static112.aClass328_1 == arg0) {
			return 2;
		} else if (Static385.aClass328_5 == arg0) {
			return 3;
		} else if (arg0 == Static330.aClass328_4) {
			return 1;
		} else if (arg0 == Static492.aClass328_6) {
			return 4;
		} else if (arg0 == Static287.aClass328_3) {
			return 6;
		} else if (Static194.aClass328_2 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vw;B)I")
	public static int method3244(@OriginalArg(0) Class340 arg0) {
		if (Static526.aClass340_14 == arg0) {
			return 1;
		} else if (Static52.aClass340_4 == arg0) {
			return 2;
		} else if (arg0 == Static155.aClass340_12) {
			return 3;
		} else if (arg0 == Static204.aClass340_7) {
			return 4;
		} else if (arg0 == Static329.aClass340_10) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!nb;Lclient!vj;I)I")
	public static int method3245(@OriginalArg(0) Class220 arg0, @OriginalArg(1) Class333 arg1) {
		if (Static336.aClass220_12 == arg0) {
			if (arg1 == Static396.aClass333_12) {
				return 22;
			}
			if (Static487.aClass333_15 == arg1) {
				return 21;
			}
			if (arg1 == Static451.aClass333_14) {
				return 28;
			}
			if (arg1 == Static26.aClass333_2) {
				return 50;
			}
			if (arg1 == Static459.aClass333_7) {
				return 51;
			}
			if (arg1 == Static18.aClass333_1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!oh;)I")
	public static int method3246(@OriginalArg(1) Class238 arg0) {
		if (Static410.aClass238_3 == arg0) {
			return 2;
		} else if (arg0 == Static477.aClass238_4) {
			return 4;
		} else if (arg0 == Static71.aClass238_1) {
			return 26;
		} else if (Static167.aClass238_2 == arg0) {
			return 7;
		} else if (arg0 == Static551.aClass238_5) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;II)Z")
	public static boolean method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (hb.b(arg2.a(arg1, local15), (byte) 113)) {
				return false;
			}
			label78: while (arg0 >= 0) {
				if (arg0 != 1) {
					local11 = arg0;
					for (@Pc(40) int local40 = 0; local40 < anIntArray238.length; local40++) {
						if (arg2.CheckDeviceType(arg1, arg4, local15.Format, anIntArray238[local40], true) == 0 && arg2.CheckDeviceFormat(arg1, arg4, local15.Format, 1, 1, anIntArray238[local40]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg4, anIntArray238[local40], true, local11) == 0)) {
							for (@Pc(94) int local94 = 0; local94 < anIntArray237.length; local94++) {
								if (arg2.CheckDeviceFormat(arg1, arg4, local15.Format, 2, 1, anIntArray237[local94]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg4, local15.Format, anIntArray238[local40], anIntArray237[local94]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg4, anIntArray237[local40], true, local11) == 0)) {
									local1 = anIntArray237[local94];
									local9 = anIntArray238[local40];
									break label78;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local9 == 0 || local1 == 0) {
				return false;
			}
			arg3.BackBufferFormat = local9;
			arg3.MultiSampleType = local11;
			arg3.AutoDepthStencilFormat = local1;
			arg3.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(184) Throwable local184) {
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!cea;)I")
	public static int method3249(@OriginalArg(1) Class50 arg0) {
		if (Static503.aClass50_4 == arg0) {
			return 2;
		} else if (arg0 == Static237.aClass50_3) {
			return 0;
		} else if (Static49.aClass50_1 == arg0) {
			return 1;
		} else if (arg0 == Static140.aClass50_2) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
