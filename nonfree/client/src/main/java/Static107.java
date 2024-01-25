import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ala;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!de", name = "Vg", descriptor = "[I")
	public static final int[] anIntArray104 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!de", name = "Yg", descriptor = "[I")
	private static final int[] anIntArray106 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!de", name = "Eg", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[16];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!br;)I")
	public static int method1918(@OriginalArg(1) Class37 arg0) {
		if (arg0 == Static573.aClass37_3) {
			return 2;
		} else if (Static496.aClass37_2 == arg0) {
			return 4;
		} else if (arg0 == Static477.aClass37_1) {
			return 26;
		} else if (arg0 == Static722.aClass37_5) {
			return 7;
		} else if (Static614.aClass37_4 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!pc;)I")
	public static int method1919(@OriginalArg(1) Class281 arg0) {
		if (arg0 == Static626.aClass281_8) {
			return 2;
		} else if (Static541.aClass281_6 == arg0) {
			return 3;
		} else if (arg0 == Static97.aClass281_2) {
			return 1;
		} else if (arg0 == Static508.aClass281_7) {
			return 4;
		} else if (arg0 == Static63.aClass281_1) {
			return 6;
		} else if (arg0 == Static332.aClass281_5) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!vea;I)I")
	public static int method1922(@OriginalArg(0) Class384 arg0) {
		if (arg0 == Static108.aClass384_7) {
			return 2;
		} else if (arg0 == Static278.aClass384_8) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Lclient!ela;I)I")
	public static int method1923(@OriginalArg(0) Class96 arg0) {
		if (Static414.aClass96_4 == arg0) {
			return 1;
		} else if (Static32.aClass96_1 == arg0) {
			return 2;
		} else if (arg0 == Static234.aClass96_3) {
			return 3;
		} else if (Static583.aClass96_6 == arg0) {
			return 4;
		} else if (Static190.aClass96_2 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;IB)Z")
	public static boolean method1926(@OriginalArg(0) int arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(2) int arg2, @OriginalArg(3) IDirect3D arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (ala.b(-30611, arg3.a(arg0, local14))) {
				return false;
			}
			label82: while (arg4 >= 0) {
				if (arg4 != 1) {
					local10 = arg4;
					for (@Pc(42) int local42 = 0; local42 < anIntArray104.length; local42++) {
						if (arg3.CheckDeviceType(arg0, arg2, local14.Format, anIntArray104[local42], true) == 0 && arg3.CheckDeviceFormat(arg0, arg2, local14.Format, 1, 1, anIntArray104[local42]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg2, anIntArray104[local42], true, local10) == 0)) {
							for (@Pc(102) int local102 = 0; local102 < anIntArray106.length; local102++) {
								if (arg3.CheckDeviceFormat(arg0, arg2, local14.Format, 2, 1, anIntArray106[local102]) == 0 && arg3.CheckDepthStencilMatch(arg0, arg2, local14.Format, anIntArray104[local42], anIntArray106[local102]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg2, anIntArray106[local42], true, local10) == 0)) {
									local8 = anIntArray104[local42];
									local6 = anIntArray106[local102];
									break label82;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local8 == 0 || local6 == 0) {
				return false;
			}
			arg1.AutoDepthStencilFormat = local6;
			arg1.MultiSampleQuality = 0;
			arg1.BackBufferFormat = local8;
			arg1.MultiSampleType = local10;
			return true;
		} catch (@Pc(202) Throwable local202) {
			return false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ns;Lclient!hd;Z)I")
	public static int method1928(@OriginalArg(0) Class261 arg0, @OriginalArg(1) Class145 arg1) {
		if (Static438.aClass261_14 == arg0) {
			if (Static702.aClass145_15 == arg1) {
				return 22;
			}
			if (Static557.aClass145_14 == arg1) {
				return 21;
			}
			if (Static407.aClass145_13 == arg1) {
				return 28;
			}
			if (Static184.aClass145_7 == arg1) {
				return 50;
			}
			if (Static349.aClass145_9 == arg1) {
				return 51;
			}
			if (arg1 == Static618.aClass145_11) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ct;)I")
	public static int method1929(@OriginalArg(1) Class58 arg0) {
		if (arg0 == Static143.aClass58_1) {
			return 2;
		} else if (Static653.aClass58_4 == arg0) {
			return 0;
		} else if (arg0 == Static273.aClass58_2) {
			return 1;
		} else if (arg0 == Static472.aClass58_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
