import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.hl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kaa", name = "xg", descriptor = "[I")
	private static final int[] anIntArray242 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!kaa", name = "Fg", descriptor = "[I")
	public static final int[] anIntArray244 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!kaa", name = "Pg", descriptor = "[F")
	public static final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;IBIILclient!jagdx/IDirect3D;)Z")
	public static boolean method4377(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (hl.a(arg4.a(arg3, local9), true)) {
				return false;
			}
			label80: while (arg1 >= 0) {
				if (arg1 != 1) {
					local5 = arg1;
					for (@Pc(33) int local33 = 0; local33 < anIntArray244.length; local33++) {
						if (arg4.CheckDeviceType(arg3, arg2, local9.Format, anIntArray244[local33], true) == 0 && arg4.CheckDeviceFormat(arg3, arg2, local9.Format, 1, 1, anIntArray244[local33]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg2, anIntArray244[local33], true, local5) == 0)) {
							for (@Pc(85) int local85 = 0; local85 < anIntArray242.length; local85++) {
								if (arg4.CheckDeviceFormat(arg3, arg2, local9.Format, 2, 1, anIntArray242[local85]) == 0 && arg4.CheckDepthStencilMatch(arg3, arg2, local9.Format, anIntArray244[local33], anIntArray242[local85]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg2, anIntArray242[local33], true, local5) == 0)) {
									local1 = anIntArray242[local85];
									local3 = anIntArray244[local33];
									break label80;
								}
							}
						}
					}
				}
				arg1--;
			}
			if (arg1 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg0.BackBufferFormat = local3;
			arg0.MultiSampleQuality = 0;
			arg0.AutoDepthStencilFormat = local1;
			arg0.MultiSampleType = local5;
			return true;
		} catch (@Pc(180) Throwable local180) {
			return false;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!fw;I)I")
	public static int method4379(@OriginalArg(0) Class110 arg0) {
		if (Static63.aClass110_1 == arg0) {
			return 2;
		} else if (arg0 == Static307.aClass110_6) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!gga;I)I")
	public static int method4380(@OriginalArg(0) Class117 arg0) {
		if (Static379.aClass117_7 == arg0) {
			return 2;
		} else if (Static573.aClass117_9 == arg0) {
			return 4;
		} else if (Static435.aClass117_8 == arg0) {
			return 26;
		} else if (arg0 == Static341.aClass117_4) {
			return 7;
		} else if (Static463.aClass117_6 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!uf;I)I")
	public static int method4382(@OriginalArg(0) Class328 arg0) {
		if (arg0 == Static519.aClass328_4) {
			return 2;
		} else if (Static233.aClass328_1 == arg0) {
			return 0;
		} else if (arg0 == Static283.aClass328_5) {
			return 1;
		} else if (arg0 == Static447.aClass328_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!qf;B)I")
	public static int method4383(@OriginalArg(0) Class271 arg0) {
		if (Static501.aClass271_7 == arg0) {
			return 2;
		} else if (arg0 == Static535.aClass271_9) {
			return 3;
		} else if (arg0 == Static221.aClass271_4) {
			return 1;
		} else if (Static262.aClass271_5 == arg0) {
			return 4;
		} else if (Static344.aClass271_6 == arg0) {
			return 6;
		} else if (Static379.aClass271_8 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!vg;I)I")
	public static int method4384(@OriginalArg(0) Class340 arg0) {
		if (Static386.aClass340_5 == arg0) {
			return 1;
		} else if (Static88.aClass340_2 == arg0) {
			return 2;
		} else if (arg0 == Static282.aClass340_4) {
			return 3;
		} else if (arg0 == Static484.aClass340_7) {
			return 4;
		} else if (arg0 == Static418.aClass340_6) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLclient!fca;Lclient!bv;)I")
	public static int method4385(@OriginalArg(1) Class97 arg0, @OriginalArg(2) Class42 arg1) {
		if (Static53.aClass42_4 == arg1) {
			if (Static352.aClass97_38 == arg0) {
				return 22;
			}
			if (Static7.aClass97_5 == arg0) {
				return 21;
			}
			if (arg0 == Static362.aClass97_41) {
				return 28;
			}
			if (arg0 == Static466.aClass97_52) {
				return 50;
			}
			if (Static480.aClass97_55 == arg0) {
				return 51;
			}
			if (Static258.aClass97_24 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
