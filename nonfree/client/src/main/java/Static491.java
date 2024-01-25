import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.bea;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!tb", name = "wg", descriptor = "[I")
	private static final int[] anIntArray639 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!tb", name = "Ag", descriptor = "[I")
	private static final int[] anIntArray640 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!tb", name = "Rg", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!gaa;B)I")
	public static int method6858(@OriginalArg(0) Class115 arg0) {
		if (Static440.aClass115_11 == arg0) {
			return 2;
		} else if (Static167.aClass115_6 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kj;B)I")
	public static int method6859(@OriginalArg(0) Class192 arg0) {
		if (arg0 == Static430.aClass192_2) {
			return 2;
		} else if (arg0 == Static468.aClass192_3) {
			return 0;
		} else if (arg0 == Static493.aClass192_4) {
			return 1;
		} else if (Static308.aClass192_1 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kda;I)I")
	public static int method6860(@OriginalArg(0) Class185 arg0) {
		if (arg0 == Static288.aClass185_3) {
			return 2;
		} else if (Static62.aClass185_2 == arg0) {
			return 3;
		} else if (arg0 == Static408.aClass185_4) {
			return 1;
		} else if (arg0 == Static470.aClass185_5) {
			return 4;
		} else if (Static567.aClass185_6 == arg0) {
			return 6;
		} else if (Static29.aClass185_1 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!eca;Z)I")
	public static int method6862(@OriginalArg(0) Class82 arg0) {
		if (arg0 == Static447.aClass82_5) {
			return 2;
		} else if (Static292.aClass82_4 == arg0) {
			return 4;
		} else if (arg0 == Static116.aClass82_3) {
			return 26;
		} else if (Static59.aClass82_2 == arg0) {
			return 7;
		} else if (Static58.aClass82_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!ig;Lclient!lca;)I")
	public static int method6865(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class203 arg1) {
		if (arg0 == Static215.aClass155_10) {
			if (Static288.aClass203_11 == arg1) {
				return 22;
			}
			if (arg1 == Static129.aClass203_5) {
				return 21;
			}
			if (arg1 == Static194.aClass203_8) {
				return 28;
			}
			if (arg1 == Static565.aClass203_17) {
				return 50;
			}
			if (Static194.aClass203_7 == arg1) {
				return 51;
			}
			if (arg1 == Static457.aClass203_16) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!so;I)I")
	public static int method6866(@OriginalArg(0) Class309 arg0) {
		if (Static102.aClass309_1 == arg0) {
			return 1;
		} else if (Static117.aClass309_2 == arg0) {
			return 2;
		} else if (Static130.aClass309_3 == arg0) {
			return 3;
		} else if (arg0 == Static301.aClass309_5) {
			return 4;
		} else if (Static280.aClass309_4 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;)Z")
	public static boolean method6868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(17) D3DDISPLAYMODE local17 = new D3DDISPLAYMODE();
			if (bea.b(arg4.a(arg1, local17), -42)) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(41) int local41 = 0; local41 < anIntArray640.length; local41++) {
						if (arg4.CheckDeviceType(arg1, arg2, local17.Format, anIntArray640[local41], true) == 0 && arg4.CheckDeviceFormat(arg1, arg2, local17.Format, 1, 1, anIntArray640[local41]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg2, anIntArray640[local41], true, local5) == 0)) {
							for (@Pc(91) int local91 = 0; local91 < anIntArray639.length; local91++) {
								if (arg4.CheckDeviceFormat(arg1, arg2, local17.Format, 2, 1, anIntArray639[local91]) == 0 && arg4.CheckDepthStencilMatch(arg1, arg2, local17.Format, anIntArray640[local41], anIntArray639[local91]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg2, anIntArray639[local41], true, local5) == 0)) {
									local3 = anIntArray640[local41];
									local1 = anIntArray639[local91];
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
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local5;
			arg3.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(179) Throwable local179) {
			return false;
		}
	}
}
