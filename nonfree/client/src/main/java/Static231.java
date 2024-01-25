import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.gfa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ik", name = "Cg", descriptor = "[I")
	private static final int[] anIntArray279 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ik", name = "Fg", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!ik", name = "Mg", descriptor = "[I")
	public static final int[] anIntArray281 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;IB)Z")
	public static boolean method3299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) D3DPRESENT_PARAMETERS arg2, @OriginalArg(3) IDirect3D arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (gfa.a(arg3.a(arg0, local9), (byte) 86)) {
				return false;
			}
			label80: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(43) int local43 = 0; local43 < anIntArray279.length; local43++) {
						if (arg3.CheckDeviceType(arg0, arg1, local9.Format, anIntArray279[local43], true) == 0 && arg3.CheckDeviceFormat(arg0, arg1, local9.Format, 1, 1, anIntArray279[local43]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg1, anIntArray279[local43], true, local5) == 0)) {
							for (@Pc(96) int local96 = 0; local96 < anIntArray281.length; local96++) {
								if (arg3.CheckDeviceFormat(arg0, arg1, local9.Format, 2, 1, anIntArray281[local96]) == 0 && arg3.CheckDepthStencilMatch(arg0, arg1, local9.Format, anIntArray279[local43], anIntArray281[local96]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg1, anIntArray281[local43], true, local5) == 0)) {
									local1 = anIntArray281[local96];
									local3 = anIntArray279[local43];
									break label80;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg2.MultiSampleQuality = 0;
			arg2.AutoDepthStencilFormat = local1;
			arg2.MultiSampleType = local5;
			arg2.BackBufferFormat = local3;
			return true;
		} catch (@Pc(191) Throwable local191) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!pca;)I")
	public static int method3300(@OriginalArg(1) Class263 arg0) {
		if (arg0 == Static191.aClass263_2) {
			return 2;
		} else if (arg0 == Static491.aClass263_3) {
			return 0;
		} else if (Static64.aClass263_1 == arg0) {
			return 1;
		} else if (arg0 == Static504.aClass263_4) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!nw;I)I")
	public static int method3303(@OriginalArg(0) Class247 arg0) {
		if (arg0 == Static317.aClass247_2) {
			return 2;
		} else if (Static460.aClass247_4 == arg0) {
			return 4;
		} else if (Static584.aClass247_5 == arg0) {
			return 26;
		} else if (arg0 == Static449.aClass247_3) {
			return 7;
		} else if (Static100.aClass247_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!id;I)I")
	public static int method3304(@OriginalArg(0) Class155 arg0) {
		if (Static151.aClass155_3 == arg0) {
			return 2;
		} else if (arg0 == Static172.aClass155_4) {
			return 3;
		} else if (Static48.aClass155_2 == arg0) {
			return 1;
		} else if (arg0 == Static523.aClass155_6) {
			return 4;
		} else if (arg0 == Static248.aClass155_5) {
			return 6;
		} else if (Static21.aClass155_1 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!kk;Z)I")
	public static int method3306(@OriginalArg(0) Class195 arg0) {
		if (Class12_Sub2_Sub5_Sub2.lb == arg0) {
			return 2;
		} else if (Static55.aClass195_1 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lclient!wu;Lclient!bk;I)I")
	public static int method3307(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class35 arg1) {
		if (arg1 == Static42.aClass35_4) {
			if (arg0 == Static43.aClass366_2) {
				return 22;
			}
			if (Static225.aClass366_3 == arg0) {
				return 21;
			}
			if (arg0 == Static398.aClass366_10) {
				return 28;
			}
			if (arg0 == Static527.aClass366_12) {
				return 50;
			}
			if (Static4.aClass366_1 == arg0) {
				return 51;
			}
			if (Static505.aClass366_11 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILclient!vf;)I")
	public static int method3308(@OriginalArg(1) Class348 arg0) {
		if (arg0 == Static371.aClass348_6) {
			return 1;
		} else if (Static194.aClass348_4 == arg0) {
			return 2;
		} else if (arg0 == Static14.aClass348_3) {
			return 3;
		} else if (Static79.aClass348_8 == arg0) {
			return 4;
		} else if (arg0 == Static428.aClass348_7) {
			return 256;
		} else {
			return 0;
		}
	}
}
