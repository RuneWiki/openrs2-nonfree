import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.te;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!ui", name = "Ng", descriptor = "[I")
	public static final int[] anIntArray666 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ui", name = "Rg", descriptor = "[I")
	public static final int[] anIntArray668 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ui", name = "bh", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[16];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!tk;)I")
	public static int method7300(@OriginalArg(1) Class305 arg0) {
		if (arg0 == Static67.aClass305_1) {
			return 2;
		} else if (arg0 == Static121.aClass305_2) {
			return 0;
		} else if (Static197.aClass305_3 == arg0) {
			return 1;
		} else if (Static257.aClass305_4 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!jagdx/D3DPRESENT_PARAMETERS;IILclient!jagdx/IDirect3D;I)Z")
	public static boolean method7301(@OriginalArg(0) int arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(17) D3DDISPLAYMODE local17 = new D3DDISPLAYMODE();
			if (te.a((byte) 112, arg4.a(arg0, local17))) {
				return false;
			}
			label80: while (arg2 >= 0) {
				if (arg2 != 1) {
					local5 = arg2;
					for (@Pc(41) int local41 = 0; local41 < anIntArray666.length; local41++) {
						if (arg4.CheckDeviceType(arg0, arg3, local17.Format, anIntArray666[local41], true) == 0 && arg4.CheckDeviceFormat(arg0, arg3, local17.Format, 1, 1, anIntArray666[local41]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg3, anIntArray666[local41], true, local5) == 0)) {
							for (@Pc(95) int local95 = 0; local95 < anIntArray668.length; local95++) {
								if (arg4.CheckDeviceFormat(arg0, arg3, local17.Format, 2, 1, anIntArray668[local95]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg3, local17.Format, anIntArray666[local41], anIntArray668[local95]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg3, anIntArray668[local41], true, local5) == 0)) {
									local3 = anIntArray666[local41];
									local1 = anIntArray668[local95];
									break label80;
								}
							}
						}
					}
				}
				arg2--;
			}
			if (arg2 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg1.MultiSampleType = local5;
			arg1.BackBufferFormat = local3;
			arg1.MultiSampleQuality = 0;
			arg1.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(192) Throwable local192) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!cv;I)I")
	public static int method7303(@OriginalArg(0) Class59 arg0) {
		if (arg0 == Static526.aClass59_4) {
			return 2;
		} else if (arg0 == Static241.aClass59_1) {
			return 4;
		} else if (arg0 == Static351.aClass59_3) {
			return 26;
		} else if (Static570.aClass59_5 == arg0) {
			return 7;
		} else if (arg0 == Static281.aClass59_2) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!td;B)I")
	public static int method7304(@OriginalArg(0) Class301 arg0) {
		if (arg0 == Static563.aClass301_11) {
			return 2;
		} else if (Static188.aClass301_6 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!eea;Lclient!nl;I)I")
	public static int method7305(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class214 arg1) {
		if (Static108.aClass82_8 == arg0) {
			if (Static43.aClass214_3 == arg1) {
				return 22;
			}
			if (arg1 == Static255.aClass214_8) {
				return 21;
			}
			if (Static490.aClass214_14 == arg1) {
				return 28;
			}
			if (arg1 == Static134.aClass214_6) {
				return 50;
			}
			if (arg1 == Static316.aClass214_10) {
				return 51;
			}
			if (Static466.aClass214_13 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!kca;I)I")
	public static int method7306(@OriginalArg(0) Class168 arg0) {
		if (arg0 == Static174.aClass168_2) {
			return 1;
		} else if (Static478.aClass168_6 == arg0) {
			return 2;
		} else if (Static360.aClass168_5 == arg0) {
			return 3;
		} else if (Static268.aClass168_3 == arg0) {
			return 4;
		} else if (Static101.aClass168_1 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!fo;I)I")
	public static int method7309(@OriginalArg(0) Class107 arg0) {
		if (Static379.aClass107_8 == arg0) {
			return 2;
		} else if (arg0 == Static159.aClass107_3) {
			return 3;
		} else if (arg0 == Static201.aClass107_7) {
			return 1;
		} else if (Static503.aClass107_2 == arg0) {
			return 4;
		} else if (Static221.aClass107_6 == arg0) {
			return 6;
		} else if (Static171.aClass107_4 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
