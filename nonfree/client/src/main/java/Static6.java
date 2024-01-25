import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.vq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "Og", descriptor = "[I")
	private static final int[] anIntArray6 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ad", name = "Pg", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[16];

	@OriginalMember(owner = "client!ad", name = "Wg", descriptor = "[I")
	private static final int[] anIntArray7 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!kca;BLclient!wq;)I")
	public static int method647(@OriginalArg(0) Class182 arg0, @OriginalArg(2) Class376 arg1) {
		if (Static637.aClass376_16 == arg1) {
			if (arg0 == Static160.aClass182_5) {
				return 22;
			}
			if (Static502.aClass182_14 == arg0) {
				return 21;
			}
			if (arg0 == Static355.aClass182_12) {
				return 28;
			}
			if (Static220.aClass182_7 == arg0) {
				return 50;
			}
			if (Static118.aClass182_3 == arg0) {
				return 51;
			}
			if (arg0 == Static369.aClass182_13) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;I)I")
	public static int method648(@OriginalArg(0) Class9 arg0) {
		if (Static333.aClass9_2 == arg0) {
			return 2;
		} else if (arg0 == Static578.aClass9_5) {
			return 0;
		} else if (Static482.aClass9_4 == arg0) {
			return 1;
		} else if (arg0 == Static161.aClass9_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;IBILclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method649(@OriginalArg(0) IDirect3D arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (vq.a(arg0.a(arg2, local9), -2420)) {
				return false;
			}
			label80: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(39) int local39 = 0; local39 < anIntArray6.length; local39++) {
						if (arg0.CheckDeviceType(arg2, arg1, local9.Format, anIntArray6[local39], true) == 0 && arg0.CheckDeviceFormat(arg2, arg1, local9.Format, 1, 1, anIntArray6[local39]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg2, arg1, anIntArray6[local39], true, local5) == 0)) {
							for (@Pc(91) int local91 = 0; local91 < anIntArray7.length; local91++) {
								if (arg0.CheckDeviceFormat(arg2, arg1, local9.Format, 2, 1, anIntArray7[local91]) == 0 && arg0.CheckDepthStencilMatch(arg2, arg1, local9.Format, anIntArray6[local39], anIntArray7[local91]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg2, arg1, anIntArray7[local39], true, local5) == 0)) {
									local1 = anIntArray7[local91];
									local3 = anIntArray6[local39];
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
			arg3.AutoDepthStencilFormat = local1;
			arg3.MultiSampleQuality = 0;
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleType = local5;
			return true;
		} catch (@Pc(185) Throwable local185) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!wk;B)I")
	public static int method650(@OriginalArg(0) Class374 arg0) {
		if (Static314.aClass374_2 == arg0) {
			return 2;
		} else if (Static514.aClass374_5 == arg0) {
			return 4;
		} else if (arg0 == Static275.aClass374_1) {
			return 26;
		} else if (Static377.aClass374_3 == arg0) {
			return 7;
		} else if (arg0 == Static480.aClass374_4) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!uia;I)I")
	public static int method653(@OriginalArg(0) Class340 arg0) {
		if (Static427.aClass340_5 == arg0) {
			return 1;
		} else if (arg0 == Static190.aClass340_2) {
			return 2;
		} else if (Static96.aClass340_1 == arg0) {
			return 3;
		} else if (Static602.aClass340_6 == arg0) {
			return 4;
		} else if (Static206.aClass340_3 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!rf;)I")
	public static int method656(@OriginalArg(1) Class292 arg0) {
		if (arg0 == Static620.aClass292_7) {
			return 2;
		} else if (Static493.aClass292_4 == arg0) {
			return 3;
		} else if (Static571.aClass292_5 == arg0) {
			return 1;
		} else if (arg0 == Static67.aClass292_2) {
			return 4;
		} else if (Static62.aClass292_6 == arg0) {
			return 6;
		} else if (arg0 == Static490.aClass292_3) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ui;B)I")
	public static int method657(@OriginalArg(0) Class339 arg0) {
		if (Static108.aClass339_3 == arg0) {
			return 2;
		} else if (arg0 == Static313.aClass339_9) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
