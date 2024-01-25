import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.hia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hda", name = "fh", descriptor = "[I")
	public static final int[] anIntArray215 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hda", name = "dh", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[16];

	@OriginalMember(owner = "client!hda", name = "kh", descriptor = "[I")
	public static final int[] anIntArray216 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZLclient!pj;)I")
	public static int method3732(@OriginalArg(1) Class287 arg0) {
		if (arg0 == Static284.aClass287_1) {
			return 2;
		} else if (Static345.aClass287_2 == arg0) {
			return 4;
		} else if (arg0 == Static448.aClass287_4) {
			return 26;
		} else if (Static408.aClass287_3 == arg0) {
			return 7;
		} else if (arg0 == Static650.aClass287_5) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!o;ILclient!al;)I")
	public static int method3733(@OriginalArg(0) Class260 arg0, @OriginalArg(2) Class19 arg1) {
		if (Static18.aClass19_4 == arg1) {
			if (Static466.aClass260_10 == arg0) {
				return 22;
			}
			if (arg0 == Static641.aClass260_12) {
				return 21;
			}
			if (Static60.aClass260_3 == arg0) {
				return 28;
			}
			if (arg0 == Static393.aClass260_8) {
				return 50;
			}
			if (Static608.aClass260_11 == arg0) {
				return 51;
			}
			if (arg0 == Static646.aClass260_13) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ke;I)I")
	public static int method3734(@OriginalArg(0) Class199 arg0) {
		if (arg0 == Static208.aClass199_11) {
			return 1;
		} else if (arg0 == Static282.aClass199_6) {
			return 2;
		} else if (arg0 == Static323.aClass199_7) {
			return 3;
		} else if (arg0 == Static402.aClass199_9) {
			return 4;
		} else if (arg0 == Static472.aClass199_12) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;II)Z")
	public static boolean method3736(@OriginalArg(1) int arg0, @OriginalArg(2) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (hia.a(arg2.a(arg0, local14), (int) -97)) {
				return false;
			}
			label81: while (arg3 >= 0) {
				if (arg3 != 1) {
					local10 = arg3;
					for (@Pc(45) int local45 = 0; local45 < anIntArray216.length; local45++) {
						if (arg2.CheckDeviceType(arg0, arg4, local14.Format, anIntArray216[local45], true) == 0 && arg2.CheckDeviceFormat(arg0, arg4, local14.Format, 1, 1, anIntArray216[local45]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg4, anIntArray216[local45], true, local10) == 0)) {
							for (@Pc(108) int local108 = 0; local108 < anIntArray215.length; local108++) {
								if (arg2.CheckDeviceFormat(arg0, arg4, local14.Format, 2, 1, anIntArray215[local108]) == 0 && arg2.CheckDepthStencilMatch(arg0, arg4, local14.Format, anIntArray216[local45], anIntArray215[local108]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg4, anIntArray215[local45], true, local10) == 0)) {
									local8 = anIntArray216[local45];
									local1 = anIntArray215[local108];
									break label81;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local8 == 0 || local1 == 0) {
				return false;
			}
			arg1.MultiSampleQuality = 0;
			arg1.AutoDepthStencilFormat = local1;
			arg1.MultiSampleType = local10;
			arg1.BackBufferFormat = local8;
			return true;
		} catch (@Pc(215) Throwable local215) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!gk;)I")
	public static int method3738(@OriginalArg(1) Class137 arg0) {
		if (Static306.aClass137_8 == arg0) {
			return 2;
		} else if (Static488.aClass137_10 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!gn;)I")
	public static int method3740(@OriginalArg(1) Class138 arg0) {
		if (arg0 == Static308.aClass138_4) {
			return 2;
		} else if (Static627.aClass138_6 == arg0) {
			return 0;
		} else if (Static225.aClass138_3 == arg0) {
			return 1;
		} else if (Static216.aClass138_5 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZLclient!l;)I")
	public static int method3741(@OriginalArg(1) Class213 arg0) {
		if (arg0 == Static374.aClass213_29) {
			return 2;
		} else if (Static67.aClass213_6 == arg0) {
			return 3;
		} else if (arg0 == Static227.aClass213_19) {
			return 1;
		} else if (arg0 == Static469.aClass213_46) {
			return 4;
		} else if (Static378.aClass213_30 == arg0) {
			return 6;
		} else if (Static18.aClass213_1 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
