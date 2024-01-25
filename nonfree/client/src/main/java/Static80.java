import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.pp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cu", name = "Ig", descriptor = "[I")
	public static final int[] anIntArray78 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!cu", name = "Yg", descriptor = "[I")
	public static final int[] anIntArray80 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!cu", name = "eh", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!sea;)I")
	public static int method2118(@OriginalArg(1) Class304 arg0) {
		if (arg0 == Static39.aClass304_1) {
			return 2;
		} else if (Static499.aClass304_6 == arg0) {
			return 3;
		} else if (Static319.aClass304_4 == arg0) {
			return 1;
		} else if (Static338.aClass304_5 == arg0) {
			return 4;
		} else if (arg0 == Static88.aClass304_2) {
			return 6;
		} else if (Static90.aClass304_3 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!vv;)I")
	public static int method2121(@OriginalArg(1) Class363 arg0) {
		if (arg0 == Static64.aClass363_7) {
			return 2;
		} else if (Static25.aClass363_1 == arg0) {
			return 4;
		} else if (arg0 == Static95.aClass363_3) {
			return 26;
		} else if (arg0 == Static428.aClass363_4) {
			return 7;
		} else if (arg0 == Static537.aClass363_6) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!wga;I)I")
	public static int method2124(@OriginalArg(0) Class371 arg0) {
		if (arg0 == Static419.aClass371_4) {
			return 2;
		} else if (arg0 == Static133.aClass371_2) {
			return 0;
		} else if (arg0 == Static25.aClass371_1) {
			return 1;
		} else if (arg0 == Static139.aClass371_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(ILclient!kh;)I")
	public static int method2125(@OriginalArg(1) Class180 arg0) {
		if (Static551.aClass180_8 == arg0) {
			return 1;
		} else if (Static235.aClass180_4 == arg0) {
			return 2;
		} else if (arg0 == Static310.aClass180_7) {
			return 3;
		} else if (arg0 == Static264.aClass180_6) {
			return 4;
		} else if (arg0 == Static20.aClass180_1) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ew;Lclient!em;I)I")
	public static int method2127(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class82 arg1) {
		if (Static137.aClass89_8 == arg0) {
			if (arg1 == Static358.aClass82_12) {
				return 22;
			}
			if (Static333.aClass82_9 == arg1) {
				return 21;
			}
			if (Static104.aClass82_3 == arg1) {
				return 28;
			}
			if (Static300.aClass82_10 == arg1) {
				return 50;
			}
			if (Static201.aClass82_6 == arg1) {
				return 51;
			}
			if (arg1 == Static576.aClass82_16) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;III)Z")
	public static boolean method2128(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (pp.a(arg2.a(arg4, local9), -84)) {
				return false;
			}
			label80: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(33) int local33 = 0; local33 < anIntArray80.length; local33++) {
						if (arg2.CheckDeviceType(arg4, arg1, local9.Format, anIntArray80[local33], true) == 0 && arg2.CheckDeviceFormat(arg4, arg1, local9.Format, 1, 1, anIntArray80[local33]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg4, arg1, anIntArray80[local33], true, local5) == 0)) {
							for (@Pc(88) int local88 = 0; local88 < anIntArray78.length; local88++) {
								if (arg2.CheckDeviceFormat(arg4, arg1, local9.Format, 2, 1, anIntArray78[local88]) == 0 && arg2.CheckDepthStencilMatch(arg4, arg1, local9.Format, anIntArray80[local33], anIntArray78[local88]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg4, arg1, anIntArray78[local33], true, local5) == 0)) {
									local3 = anIntArray80[local33];
									local1 = anIntArray78[local88];
									break label80;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg0.MultiSampleQuality = 0;
			arg0.MultiSampleType = local5;
			arg0.BackBufferFormat = local3;
			arg0.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(191) Throwable local191) {
			return false;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!bba;)I")
	public static int method2129(@OriginalArg(1) Class26 arg0) {
		if (arg0 == Static229.aClass26_6) {
			return 2;
		} else if (arg0 == Static310.aClass26_7) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
