import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.qi;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!eda", name = "ug", descriptor = "[I")
	private static final int[] anIntArray106 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!eda", name = "Cg", descriptor = "[I")
	public static final int[] anIntArray107 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!eda", name = "Pg", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLclient!bs;)I")
	public static int method2404(@OriginalArg(1) Class40 arg0) {
		if (Static33.aClass40_3 == arg0) {
			return 2;
		} else if (arg0 == Static16.aClass40_1) {
			return 3;
		} else if (Static132.aClass40_13 == arg0) {
			return 1;
		} else if (arg0 == Static379.aClass40_9) {
			return 4;
		} else if (Static24.aClass40_2 == arg0) {
			return 6;
		} else if (Static263.aClass40_7 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!dj;I)I")
	public static int method2405(@OriginalArg(0) Class71 arg0) {
		if (Static567.aClass71_11 == arg0) {
			return 2;
		} else if (Static347.aClass71_8 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!gb;Z)I")
	public static int method2407(@OriginalArg(0) Class108 arg0) {
		if (arg0 == Static164.aClass108_3) {
			return 2;
		} else if (arg0 == Static425.aClass108_4) {
			return 0;
		} else if (arg0 == Static160.aClass108_2) {
			return 1;
		} else if (Static62.aClass108_1 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLclient!sea;)I")
	public static int method2409(@OriginalArg(1) Class307 arg0) {
		if (arg0 == Static534.aClass307_7) {
			return 2;
		} else if (arg0 == Static19.aClass307_1) {
			return 4;
		} else if (Static479.aClass307_6 == arg0) {
			return 26;
		} else if (Static177.aClass307_2 == arg0) {
			return 7;
		} else if (Static334.aClass307_5 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!sq;ZLclient!rt;)I")
	public static int method2411(@OriginalArg(0) Class314 arg0, @OriginalArg(2) Class298 arg1) {
		if (Static471.aClass298_15 == arg1) {
			if (arg0 == Static485.aClass314_20) {
				return 22;
			}
			if (arg0 == Static469.aClass314_11) {
				return 21;
			}
			if (arg0 == Static213.aClass314_19) {
				return 28;
			}
			if (arg0 == Static394.aClass314_17) {
				return 50;
			}
			if (Static386.aClass314_16 == arg0) {
				return 51;
			}
			if (arg0 == Static366.aClass314_15) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!nd;I)I")
	public static int method2413(@OriginalArg(0) Class222 arg0) {
		if (arg0 == Static294.aClass222_15) {
			return 1;
		} else if (arg0 == Static3.aClass222_12) {
			return 2;
		} else if (Static586.aClass222_7 == arg0) {
			return 3;
		} else if (Static334.aClass222_9 == arg0) {
			return 4;
		} else if (arg0 == Static400.aClass222_13) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;II)Z")
	public static boolean method2414(@OriginalArg(0) int arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (qi.a((int) arg2.a(arg3, local9), 0)) {
				return false;
			}
			label78: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(39) int local39 = 0; local39 < anIntArray107.length; local39++) {
						if (arg2.CheckDeviceType(arg3, arg0, local9.Format, anIntArray107[local39], true) == 0 && arg2.CheckDeviceFormat(arg3, arg0, local9.Format, 1, 1, anIntArray107[local39]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg0, anIntArray107[local39], true, local5) == 0)) {
							for (@Pc(85) int local85 = 0; local85 < anIntArray106.length; local85++) {
								if (arg2.CheckDeviceFormat(arg3, arg0, local9.Format, 2, 1, anIntArray106[local85]) == 0 && arg2.CheckDepthStencilMatch(arg3, arg0, local9.Format, anIntArray107[local39], anIntArray106[local85]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg0, anIntArray106[local39], true, local5) == 0)) {
									local1 = anIntArray106[local85];
									local3 = anIntArray107[local39];
									break label78;
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
			arg1.MultiSampleQuality = 0;
			arg1.MultiSampleType = local5;
			arg1.AutoDepthStencilFormat = local1;
			arg1.BackBufferFormat = local3;
			return true;
		} catch (@Pc(188) Throwable local188) {
			return false;
		}
	}
}
