import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.vba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vg", name = "Jg", descriptor = "[I")
	private static final int[] anIntArray699 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!vg", name = "Pg", descriptor = "[I")
	public static final int[] anIntArray701 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!vg", name = "Qg", descriptor = "[F")
	public static final float[] aFloatArray90 = new float[16];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!nd;I)I")
	public static int method7663(@OriginalArg(0) Class214 arg0) {
		if (Static140.aClass214_2 == arg0) {
			return 2;
		} else if (arg0 == Static547.aClass214_5) {
			return 4;
		} else if (Static458.aClass214_3 == arg0) {
			return 26;
		} else if (arg0 == Static74.aClass214_1) {
			return 7;
		} else if (Static472.aClass214_4 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!qaa;B)I")
	public static int method7667(@OriginalArg(0) Class257 arg0) {
		if (Static467.aClass257_9 == arg0) {
			return 2;
		} else if (Static553.aClass257_11 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!uj;)I")
	public static int method7668(@OriginalArg(1) Class321 arg0) {
		if (arg0 == Static384.aClass321_5) {
			return 2;
		} else if (arg0 == Static543.aClass321_8) {
			return 3;
		} else if (Static302.aClass321_4 == arg0) {
			return 1;
		} else if (arg0 == Static104.aClass321_1) {
			return 4;
		} else if (arg0 == Static190.aClass321_6) {
			return 6;
		} else if (Static535.aClass321_7 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILclient!kh;)I")
	public static int method7669(@OriginalArg(1) Class172 arg0) {
		if (Static393.aClass172_6 == arg0) {
			return 1;
		} else if (Static573.aClass172_11 == arg0) {
			return 2;
		} else if (Static232.aClass172_10 == arg0) {
			return 3;
		} else if (arg0 == Static524.aClass172_8) {
			return 4;
		} else if (arg0 == Static27.aClass172_5) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!iv;I)I")
	public static int method7670(@OriginalArg(0) Class150 arg0) {
		if (arg0 == Static393.aClass150_6) {
			return 2;
		} else if (Static412.aClass150_8 == arg0) {
			return 0;
		} else if (arg0 == Static422.aClass150_7) {
			return 1;
		} else if (arg0 == Static20.aClass150_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;B)Z")
	public static boolean method7671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) IDirect3D arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (vba.a(arg3.a(arg1, local9), (byte) -92)) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(32) int local32 = 0; local32 < anIntArray699.length; local32++) {
						if (arg3.CheckDeviceType(arg1, arg2, local9.Format, anIntArray699[local32], true) == 0 && arg3.CheckDeviceFormat(arg1, arg2, local9.Format, 1, 1, anIntArray699[local32]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, anIntArray699[local32], true, local5) == 0)) {
							for (@Pc(91) int local91 = 0; local91 < anIntArray701.length; local91++) {
								if (arg3.CheckDeviceFormat(arg1, arg2, local9.Format, 2, 1, anIntArray701[local91]) == 0 && arg3.CheckDepthStencilMatch(arg1, arg2, local9.Format, anIntArray699[local32], anIntArray701[local91]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, anIntArray701[local32], true, local5) == 0)) {
									local3 = anIntArray699[local32];
									local1 = anIntArray701[local91];
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
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleType = local5;
			arg4.MultiSampleQuality = 0;
			arg4.BackBufferFormat = local3;
			return true;
		} catch (@Pc(190) Throwable local190) {
			return false;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ps;ZLclient!kf;)I")
	public static int method7672(@OriginalArg(0) Class254 arg0, @OriginalArg(2) Class171 arg1) {
		if (arg0 == Static407.aClass254_14) {
			if (arg1 == Static246.aClass171_17) {
				return 22;
			}
			if (Static493.aClass171_15 == arg1) {
				return 21;
			}
			if (arg1 == Static357.aClass171_12) {
				return 28;
			}
			if (Static436.aClass171_14 == arg1) {
				return 50;
			}
			if (arg1 == Static102.aClass171_6) {
				return 51;
			}
			if (arg1 == Static16.aClass171_1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
