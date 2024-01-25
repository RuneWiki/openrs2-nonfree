import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.em;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kfa", name = "Wg", descriptor = "[I")
	private static final int[] anIntArray310 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!kfa", name = "dh", descriptor = "[I")
	public static final int[] anIntArray312 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!kfa", name = "kh", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[16];

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!jt;Lclient!iv;I)I")
	public static int method5042(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class168 arg1) {
		if (Static280.aClass182_8 == arg0) {
			if (arg1 == Static361.aClass168_7) {
				return 22;
			}
			if (arg1 == Static95.aClass168_2) {
				return 21;
			}
			if (arg1 == Static491.aClass168_11) {
				return 28;
			}
			if (arg1 == Static480.aClass168_10) {
				return 50;
			}
			if (Static168.aClass168_3 == arg1) {
				return 51;
			}
			if (Static66.aClass168_1 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!wi;)I")
	public static int method5043(@OriginalArg(1) Class376 arg0) {
		if (arg0 == Static310.aClass376_4) {
			return 2;
		} else if (arg0 == Static525.aClass376_7) {
			return 3;
		} else if (arg0 == Static57.aClass376_5) {
			return 1;
		} else if (Static525.aClass376_6 == arg0) {
			return 4;
		} else if (Static52.aClass376_1 == arg0) {
			return 6;
		} else if (Static171.aClass376_3 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!tha;Z)I")
	public static int method5044(@OriginalArg(0) Class324 arg0) {
		if (Static468.aClass324_7 == arg0) {
			return 2;
		} else if (arg0 == Static47.aClass324_1) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!ip;)I")
	public static int method5047(@OriginalArg(1) Class165 arg0) {
		if (arg0 == Static527.aClass165_4) {
			return 2;
		} else if (Static309.aClass165_2 == arg0) {
			return 0;
		} else if (arg0 == Static430.aClass165_3) {
			return 1;
		} else if (arg0 == Static302.aClass165_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!jagdx/IDirect3D;IIILclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method5048(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3D arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) D3DPRESENT_PARAMETERS arg4) {
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (em.a(arg1.a(arg3, local14), (byte) -57)) {
				return false;
			}
			label78: while (arg0 >= 0) {
				if (arg0 != 1) {
					local10 = arg0;
					for (@Pc(37) int local37 = 0; local37 < anIntArray310.length; local37++) {
						if (arg1.CheckDeviceType(arg3, arg2, local14.Format, anIntArray310[local37], true) == 0 && arg1.CheckDeviceFormat(arg3, arg2, local14.Format, 1, 1, anIntArray310[local37]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg2, anIntArray310[local37], true, local10) == 0)) {
							for (@Pc(88) int local88 = 0; local88 < anIntArray312.length; local88++) {
								if (arg1.CheckDeviceFormat(arg3, arg2, local14.Format, 2, 1, anIntArray312[local88]) == 0 && arg1.CheckDepthStencilMatch(arg3, arg2, local14.Format, anIntArray310[local37], anIntArray312[local88]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg2, anIntArray312[local37], true, local10) == 0)) {
									local6 = anIntArray312[local88];
									local8 = anIntArray310[local37];
									break label78;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local8 == 0 || local6 == 0) {
				return false;
			}
			arg4.BackBufferFormat = local8;
			arg4.MultiSampleQuality = 0;
			arg4.MultiSampleType = local10;
			arg4.AutoDepthStencilFormat = local6;
			return true;
		} catch (@Pc(180) Throwable local180) {
			return false;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!ef;)I")
	public static int method5051(@OriginalArg(1) Class88 arg0) {
		if (Static443.aClass88_3 == arg0) {
			return 2;
		} else if (arg0 == Static131.aClass88_1) {
			return 4;
		} else if (Static603.aClass88_5 == arg0) {
			return 26;
		} else if (arg0 == Static418.aClass88_2) {
			return 7;
		} else if (Static457.aClass88_4 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Lclient!kq;I)I")
	public static int method5053(@OriginalArg(0) Class193 arg0) {
		if (arg0 == Static73.aClass193_2) {
			return 1;
		} else if (Static230.aClass193_3 == arg0) {
			return 2;
		} else if (Static647.aClass193_9 == arg0) {
			return 3;
		} else if (Static447.aClass193_5 == arg0) {
			return 4;
		} else if (Static36.aClass193_8 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}
}
