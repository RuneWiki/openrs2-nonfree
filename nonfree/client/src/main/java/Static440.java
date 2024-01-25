import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ck;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!os", name = "Yg", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!os", name = "Kg", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!os", name = "Vg", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!cb;)I")
	public static int method6854(@OriginalArg(1) Class51 arg0) {
		if (arg0 == Static258.aClass51_7) {
			return 2;
		} else if (arg0 == Static96.aClass51_3) {
			return 3;
		} else if (arg0 == Static272.aClass51_2) {
			return 1;
		} else if (Static118.aClass51_4 == arg0) {
			return 4;
		} else if (arg0 == Static492.aClass51_6) {
			return 6;
		} else if (arg0 == Static345.aClass51_8) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!oba;I)I")
	public static int method6855(@OriginalArg(0) Class261 arg0) {
		if (arg0 == Static24.aClass261_1) {
			return 2;
		} else if (Static51.aClass261_2 == arg0) {
			return 0;
		} else if (arg0 == Static110.aClass261_3) {
			return 1;
		} else if (arg0 == Static389.aClass261_8) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!kl;)I")
	public static int method6857(@OriginalArg(1) Class211 arg0) {
		if (arg0 == Static67.aClass211_1) {
			return 1;
		} else if (Static82.aClass211_2 == arg0) {
			return 2;
		} else if (arg0 == Static243.aClass211_3) {
			return 3;
		} else if (arg0 == Static554.aClass211_5) {
			return 4;
		} else if (Static601.aClass211_6 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!td;Z)I")
	public static int method6858(@OriginalArg(0) Class338 arg0) {
		if (Static673.aClass338_15 == arg0) {
			return 2;
		} else if (Static389.aClass338_14 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!on;Lclient!hh;)I")
	public static int method6860(@OriginalArg(1) Class274 arg0, @OriginalArg(2) Class155 arg1) {
		if (Static435.aClass274_13 == arg0) {
			if (Static265.aClass155_24 == arg1) {
				return 22;
			}
			if (arg1 == Static432.aClass155_45) {
				return 21;
			}
			if (Static212.aClass155_46 == arg1) {
				return 28;
			}
			if (Static290.aClass155_60 == arg1) {
				return 50;
			}
			if (Static487.aClass155_62 == arg1) {
				return 51;
			}
			if (arg1 == Static522.aClass155_50) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;Z)Z")
	public static boolean method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(4) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (ck.b(arg4.a(arg2, local9), -2005530585)) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(36) int local36 = 0; local36 < anIntArray485.length; local36++) {
						if (arg4.CheckDeviceType(arg2, arg1, local9.Format, anIntArray485[local36], true) == 0 && arg4.CheckDeviceFormat(arg2, arg1, local9.Format, 1, 1, anIntArray485[local36]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg2, arg1, anIntArray485[local36], true, local5) == 0)) {
							for (@Pc(89) int local89 = 0; local89 < anIntArray486.length; local89++) {
								if (arg4.CheckDeviceFormat(arg2, arg1, local9.Format, 2, 1, anIntArray486[local89]) == 0 && arg4.CheckDepthStencilMatch(arg2, arg1, local9.Format, anIntArray485[local36], anIntArray486[local89]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg2, arg1, anIntArray486[local36], true, local5) == 0)) {
									local3 = anIntArray485[local36];
									local1 = anIntArray486[local89];
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
			arg3.AutoDepthStencilFormat = local1;
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local5;
			return true;
		} catch (@Pc(199) Throwable local199) {
			return false;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!tka;)I")
	public static int method6866(@OriginalArg(1) Class344 arg0) {
		if (arg0 == Static571.aClass344_5) {
			return 2;
		} else if (arg0 == Static257.aClass344_2) {
			return 4;
		} else if (Static399.aClass344_3 == arg0) {
			return 26;
		} else if (Static421.aClass344_4 == arg0) {
			return 7;
		} else if (Static256.aClass344_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
