import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!nca", name = "Dg", descriptor = "[I")
	private static final int[] anIntArray487 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!nca", name = "Fg", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[16];

	@OriginalMember(owner = "client!nca", name = "Ng", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(Lclient!pn;I)I")
	public static int method5076(@OriginalArg(0) Class224 arg0) {
		if (arg0 == Static112.aClass224_1) {
			return 1;
		} else if (Static532.aClass224_6 == arg0) {
			return 2;
		} else if (arg0 == Static217.aClass224_2) {
			return 3;
		} else if (arg0 == Static237.aClass224_3) {
			return 4;
		} else if (arg0 == Static422.aClass224_5) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!qq;)I")
	public static int method5077(@OriginalArg(1) Class240 arg0) {
		if (Static539.aClass240_11 == arg0) {
			return 2;
		} else if (Static442.aClass240_8 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLclient!lc;Lclient!jt;)I")
	public static int method5078(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Class150 arg1) {
		if (Static268.aClass171_10 == arg0) {
			if (arg1 == Static297.aClass150_11) {
				return 22;
			}
			if (arg1 == Static51.aClass150_1) {
				return 21;
			}
			if (arg1 == Static160.aClass150_3) {
				return 28;
			}
			if (arg1 == Static225.aClass150_9) {
				return 50;
			}
			if (Static189.aClass150_4 == arg1) {
				return 51;
			}
			if (arg1 == Static120.aClass150_2) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!ud;I)I")
	public static int method5079(@OriginalArg(0) Class281 arg0) {
		if (arg0 == Static160.aClass281_2) {
			return 2;
		} else if (arg0 == Static290.aClass281_4) {
			return 3;
		} else if (Static218.aClass281_3 == arg0) {
			return 1;
		} else if (arg0 == Static514.aClass281_6) {
			return 4;
		} else if (Static24.aClass281_1 == arg0) {
			return 6;
		} else if (Static421.aClass281_5 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!jagdx/D3DPRESENT_PARAMETERS;IILclient!jagdx/IDirect3D;)Z")
	public static boolean method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) D3DPRESENT_PARAMETERS arg2, @OriginalArg(4) int arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = arg4.b(arg3);
			label75: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(26) int local26 = 0; local26 < anIntArray487.length; local26++) {
						if (arg4.CheckDeviceType(arg3, arg1, local9.Format, anIntArray487[local26], true) == 0 && arg4.CheckDeviceFormat(arg3, arg1, local9.Format, 1, 1, anIntArray487[local26]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg1, anIntArray487[local26], true, local5) == 0)) {
							for (@Pc(76) int local76 = 0; local76 < anIntArray489.length; local76++) {
								if (arg4.CheckDeviceFormat(arg3, arg1, local9.Format, 2, 1, anIntArray489[local76]) == 0 && arg4.CheckDepthStencilMatch(arg3, arg1, local9.Format, anIntArray487[local26], anIntArray489[local76]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg1, anIntArray489[local26], true, local5) == 0)) {
									local3 = anIntArray487[local26];
									local1 = anIntArray489[local76];
									break label75;
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
			arg2.AutoDepthStencilFormat = local1;
			arg2.MultiSampleQuality = 0;
			arg2.MultiSampleType = local5;
			arg2.BackBufferFormat = local3;
			return true;
		} catch (@Pc(173) Throwable local173) {
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!kp;)I")
	public static int method5083(@OriginalArg(1) Class165 arg0) {
		if (Static99.aClass165_2 == arg0) {
			return 2;
		} else if (Static389.aClass165_3 == arg0) {
			return 4;
		} else if (arg0 == Static72.aClass165_1) {
			return 26;
		} else if (arg0 == Static420.aClass165_4) {
			return 7;
		} else if (arg0 == Static512.aClass165_5) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLclient!hba;)I")
	public static int method5084(@OriginalArg(1) Class111 arg0) {
		if (arg0 == Static132.aClass111_1) {
			return 2;
		} else if (arg0 == Static463.aClass111_4) {
			return 0;
		} else if (arg0 == Static409.aClass111_3) {
			return 1;
		} else if (arg0 == Static254.aClass111_2) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
