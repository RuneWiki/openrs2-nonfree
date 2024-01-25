import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bfa", name = "Tg", descriptor = "[I")
	private static final int[] anIntArray55 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!bfa", name = "ah", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16];

	@OriginalMember(owner = "client!bfa", name = "mh", descriptor = "[I")
	public static final int[] anIntArray57 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!ria;B)I")
	public static int method1325(@OriginalArg(0) Class298 arg0) {
		if (Static292.aClass298_5 == arg0) {
			return 2;
		} else if (Static486.aClass298_10 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!hj;B)I")
	public static int method1326(@OriginalArg(0) Class134 arg0) {
		if (arg0 == Static545.aClass134_7) {
			return 2;
		} else if (Static481.aClass134_5 == arg0) {
			return 3;
		} else if (Static593.aClass134_8 == arg0) {
			return 1;
		} else if (arg0 == Static539.aClass134_6) {
			return 4;
		} else if (Static150.aClass134_3 == arg0) {
			return 6;
		} else if (arg0 == Static465.aClass134_4) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!sia;)I")
	public static int method1328(@OriginalArg(1) Class315 arg0) {
		if (Static492.aClass315_4 == arg0) {
			return 2;
		} else if (Static425.aClass315_3 == arg0) {
			return 4;
		} else if (Static542.aClass315_5 == arg0) {
			return 26;
		} else if (arg0 == Static361.aClass315_2) {
			return 7;
		} else if (arg0 == Static176.aClass315_1) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!baa;Lclient!wq;)I")
	public static int method1331(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class375 arg1) {
		if (arg0 == Static29.aClass26_4) {
			if (Static55.aClass375_38 == arg1) {
				return 22;
			}
			if (Static354.aClass375_31 == arg1) {
				return 21;
			}
			if (Static155.aClass375_18 == arg1) {
				return 28;
			}
			if (Static520.aClass375_44 == arg1) {
				return 50;
			}
			if (arg1 == Static463.aClass375_39) {
				return 51;
			}
			if (arg1 == Static77.aClass375_49) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!kf;I)I")
	public static int method1334(@OriginalArg(0) Class177 arg0) {
		if (Static118.aClass177_1 == arg0) {
			return 2;
		} else if (arg0 == Static360.aClass177_5) {
			return 0;
		} else if (Static154.aClass177_4 == arg0) {
			return 1;
		} else if (Static165.aClass177_3 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(ILclient!tr;)I")
	public static int method1336(@OriginalArg(1) Class332 arg0) {
		if (arg0 == Static280.aClass332_4) {
			return 1;
		} else if (arg0 == Static547.aClass332_6) {
			return 2;
		} else if (arg0 == Static155.aClass332_2) {
			return 3;
		} else if (Static28.aClass332_1 == arg0) {
			return 4;
		} else if (arg0 == Static436.aClass332_5) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;IILclient!jagdx/IDirect3D;II)Z")
	public static boolean method1337(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(2) int arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (ue.a((byte) 97, arg2.a(arg1, local9))) {
				return false;
			}
			label82: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(33) int local33 = 0; local33 < anIntArray55.length; local33++) {
						if (arg2.CheckDeviceType(arg1, arg3, local9.Format, anIntArray55[local33], true) == 0 && arg2.CheckDeviceFormat(arg1, arg3, local9.Format, 1, 1, anIntArray55[local33]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg3, anIntArray55[local33], true, local5) == 0)) {
							for (@Pc(86) int local86 = 0; local86 < anIntArray57.length; local86++) {
								if (arg2.CheckDeviceFormat(arg1, arg3, local9.Format, 2, 1, anIntArray57[local86]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg3, local9.Format, anIntArray55[local33], anIntArray57[local86]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg3, anIntArray57[local33], true, local5) == 0)) {
									local1 = anIntArray57[local86];
									local3 = anIntArray55[local33];
									break label82;
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
			arg0.MultiSampleType = local5;
			arg0.AutoDepthStencilFormat = local1;
			arg0.MultiSampleQuality = 0;
			arg0.BackBufferFormat = local3;
			return true;
		} catch (@Pc(185) Throwable local185) {
			return false;
		}
	}
}
