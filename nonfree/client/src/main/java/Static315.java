import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.sw;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!mba", name = "tg", descriptor = "[I")
	private static final int[] anIntArray432 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!mba", name = "zg", descriptor = "[I")
	private static final int[] anIntArray434 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!mba", name = "Og", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16];

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!gga;B)I")
	public static int method5493(@OriginalArg(0) Class120 arg0) {
		if (Static490.aClass120_5 == arg0) {
			return 2;
		} else if (Static65.aClass120_1 == arg0) {
			return 4;
		} else if (Static162.aClass120_2 == arg0) {
			return 26;
		} else if (Static220.aClass120_4 == arg0) {
			return 7;
		} else if (arg0 == Static189.aClass120_3) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!gv;Z)I")
	public static int method5495(@OriginalArg(0) Class130 arg0) {
		if (arg0 == Static247.aClass130_8) {
			return 2;
		} else if (arg0 == Static39.aClass130_7) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IILclient!jagdx/IDirect3D;ILclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method5496(@OriginalArg(1) int arg0, @OriginalArg(2) IDirect3D arg1, @OriginalArg(3) int arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (sw.a((int) arg1.a(arg2, local9), -123)) {
				return false;
			}
			label82: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(34) int local34 = 0; local34 < anIntArray432.length; local34++) {
						if (arg1.CheckDeviceType(arg2, arg4, local9.Format, anIntArray432[local34], true) == 0 && arg1.CheckDeviceFormat(arg2, arg4, local9.Format, 1, 1, anIntArray432[local34]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg2, arg4, anIntArray432[local34], true, local5) == 0)) {
							for (@Pc(87) int local87 = 0; local87 < anIntArray434.length; local87++) {
								if (arg1.CheckDeviceFormat(arg2, arg4, local9.Format, 2, 1, anIntArray434[local87]) == 0 && arg1.CheckDepthStencilMatch(arg2, arg4, local9.Format, anIntArray432[local34], anIntArray434[local87]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg2, arg4, anIntArray434[local34], true, local5) == 0)) {
									local3 = anIntArray432[local34];
									local1 = anIntArray434[local87];
									break label82;
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
			arg3.AutoDepthStencilFormat = local1;
			arg3.MultiSampleType = local5;
			arg3.MultiSampleQuality = 0;
			arg3.BackBufferFormat = local3;
			return true;
		} catch (@Pc(186) Throwable local186) {
			return false;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!ej;B)I")
	public static int method5498(@OriginalArg(0) Class85 arg0) {
		if (arg0 == Static159.aClass85_1) {
			return 2;
		} else if (Static454.aClass85_2 == arg0) {
			return 0;
		} else if (arg0 == Static457.aClass85_4) {
			return 1;
		} else if (Static531.aClass85_5 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!bm;I)I")
	public static int method5500(@OriginalArg(0) Class32 arg0) {
		if (arg0 == Static300.aClass32_10) {
			return 2;
		} else if (Static358.aClass32_9 == arg0) {
			return 3;
		} else if (Static290.aClass32_6 == arg0) {
			return 1;
		} else if (Static18.aClass32_2 == arg0) {
			return 4;
		} else if (Static34.aClass32_3 == arg0) {
			return 6;
		} else if (arg0 == Static17.aClass32_7) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLclient!wq;)I")
	public static int method5501(@OriginalArg(1) Class359 arg0) {
		if (arg0 == Static308.aClass359_8) {
			return 1;
		} else if (arg0 == Static317.aClass359_13) {
			return 2;
		} else if (arg0 == Static158.aClass359_6) {
			return 3;
		} else if (Static515.aClass359_14 == arg0) {
			return 4;
		} else if (arg0 == Static41.aClass359_2) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!pw;ILclient!lj;)I")
	public static int method5502(@OriginalArg(0) Class261 arg0, @OriginalArg(2) Class200 arg1) {
		if (Static302.aClass200_11 == arg1) {
			if (arg0 == Static593.aClass261_16) {
				return 22;
			}
			if (arg0 == Static492.aClass261_14) {
				return 21;
			}
			if (Static379.aClass261_10 == arg0) {
				return 28;
			}
			if (arg0 == Static120.aClass261_9) {
				return 50;
			}
			if (Static249.aClass261_8 == arg0) {
				return 51;
			}
			if (arg0 == Static438.aClass261_11) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
