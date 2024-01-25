import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.co;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fi", name = "Ng", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!fi", name = "Og", descriptor = "[I")
	private static final int[] anIntArray203 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!fi", name = "lh", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!lf;B)I")
	public static int method2984(@OriginalArg(0) Class187 arg0) {
		if (arg0 == Static622.aClass187_4) {
			return 2;
		} else if (arg0 == Static200.aClass187_1) {
			return 0;
		} else if (Static506.aClass187_3 == arg0) {
			return 1;
		} else if (Static456.aClass187_2 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ej;I)I")
	public static int method2986(@OriginalArg(0) Class82 arg0) {
		if (Static55.aClass82_1 == arg0) {
			return 2;
		} else if (Static514.aClass82_10 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!wl;)I")
	public static int method2987(@OriginalArg(1) Class377 arg0) {
		if (Static169.aClass377_6 == arg0) {
			return 1;
		} else if (Static104.aClass377_2 == arg0) {
			return 2;
		} else if (arg0 == Static197.aClass377_12) {
			return 3;
		} else if (arg0 == Static237.aClass377_7) {
			return 4;
		} else if (arg0 == Static10.aClass377_1) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;IIII)Z")
	public static boolean method2989(@OriginalArg(0) IDirect3D arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (co.a(arg0.a(arg3, local9), 2005530599)) {
				return false;
			}
			label79: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(40) int local40 = 0; local40 < anIntArray203.length; local40++) {
						if (arg0.CheckDeviceType(arg3, arg2, local9.Format, anIntArray203[local40], true) == 0 && arg0.CheckDeviceFormat(arg3, arg2, local9.Format, 1, 1, anIntArray203[local40]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg2, anIntArray203[local40], true, local5) == 0)) {
							for (@Pc(88) int local88 = 0; local88 < anIntArray202.length; local88++) {
								if (arg0.CheckDeviceFormat(arg3, arg2, local9.Format, 2, 1, anIntArray202[local88]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg2, local9.Format, anIntArray203[local40], anIntArray202[local88]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg2, anIntArray202[local40], true, local5) == 0)) {
									local1 = anIntArray202[local88];
									local3 = anIntArray203[local40];
									break label79;
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
			arg1.BackBufferFormat = local3;
			arg1.MultiSampleType = local5;
			arg1.MultiSampleQuality = 0;
			arg1.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(182) Throwable local182) {
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!pd;Lclient!ok;)I")
	public static int method2992(@OriginalArg(1) Class250 arg0, @OriginalArg(2) Class242 arg1) {
		if (arg1 == Static409.aClass242_13) {
			if (Static600.aClass250_16 == arg0) {
				return 22;
			}
			if (arg0 == Static203.aClass250_7) {
				return 21;
			}
			if (arg0 == Static598.aClass250_15) {
				return 28;
			}
			if (arg0 == Static23.aClass250_8) {
				return 50;
			}
			if (arg0 == Static458.aClass250_12) {
				return 51;
			}
			if (Static360.aClass250_11 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ef;Z)I")
	public static int method2993(@OriginalArg(0) Class77 arg0) {
		if (arg0 == Static507.aClass77_4) {
			return 2;
		} else if (arg0 == Static101.aClass77_1) {
			return 3;
		} else if (Static538.aClass77_5 == arg0) {
			return 1;
		} else if (Static295.aClass77_2 == arg0) {
			return 4;
		} else if (arg0 == Static364.aClass77_3) {
			return 6;
		} else if (arg0 == Static622.aClass77_6) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLclient!pha;)I")
	public static int method2994(@OriginalArg(1) Class256 arg0) {
		if (arg0 == Static436.aClass256_4) {
			return 2;
		} else if (Static266.aClass256_3 == arg0) {
			return 4;
		} else if (Static190.aClass256_2 == arg0) {
			return 26;
		} else if (arg0 == Static114.aClass256_1) {
			return 7;
		} else if (Static574.aClass256_5 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
