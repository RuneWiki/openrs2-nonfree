import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.kg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "Hg", descriptor = "[I")
	public static final int[] anIntArray36 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!bea", name = "Yg", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16];

	@OriginalMember(owner = "client!bea", name = "dh", descriptor = "[I")
	public static final int[] anIntArray38 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!ef;B)I")
	public static int method1266(@OriginalArg(0) Class80 arg0) {
		if (arg0 == Static522.aClass80_4) {
			return 2;
		} else if (arg0 == Static512.aClass80_3) {
			return 0;
		} else if (arg0 == Static115.aClass80_1) {
			return 1;
		} else if (Static347.aClass80_2 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!oq;)I")
	public static int method1267(@OriginalArg(1) Class248 arg0) {
		if (arg0 == Static572.aClass248_10) {
			return 2;
		} else if (arg0 == Static255.aClass248_5) {
			return 3;
		} else if (arg0 == Static399.aClass248_9) {
			return 1;
		} else if (Static574.aClass248_11 == arg0) {
			return 4;
		} else if (Static258.aClass248_6 == arg0) {
			return 6;
		} else if (arg0 == Static173.aClass248_3) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qc;I)I")
	public static int method1269(@OriginalArg(0) Class272 arg0) {
		if (Static96.aClass272_1 == arg0) {
			return 1;
		} else if (arg0 == Static557.aClass272_6) {
			return 2;
		} else if (arg0 == Static281.aClass272_4) {
			return 3;
		} else if (Static174.aClass272_2 == arg0) {
			return 4;
		} else if (Static241.aClass272_3 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLclient!il;)I")
	public static int method1270(@OriginalArg(1) Class144 arg0) {
		if (arg0 == Static503.aClass144_4) {
			return 2;
		} else if (arg0 == Static438.aClass144_3) {
			return 4;
		} else if (Static558.aClass144_5 == arg0) {
			return 26;
		} else if (Static3.aClass144_1 == arg0) {
			return 7;
		} else if (arg0 == Static58.aClass144_2) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!nd;)I")
	public static int method1271(@OriginalArg(1) Class216 arg0) {
		if (Static121.aClass216_4 == arg0) {
			return 2;
		} else if (arg0 == Static581.aClass216_8) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(ILclient!kt;Lclient!kq;)I")
	public static int method1272(@OriginalArg(1) Class178 arg0, @OriginalArg(2) Class176 arg1) {
		if (Static302.aClass176_8 == arg1) {
			if (arg0 == Static457.aClass178_11) {
				return 22;
			}
			if (Static120.aClass178_4 == arg0) {
				return 21;
			}
			if (arg0 == Static268.aClass178_6) {
				return 28;
			}
			if (arg0 == Static321.aClass178_7) {
				return 50;
			}
			if (Static137.aClass178_5 == arg0) {
				return 51;
			}
			if (arg0 == Static493.aClass178_12) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!jagdx/IDirect3D;ILclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method1278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (kg.b(-7175, arg2.a(arg1, local9))) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(34) int local34 = 0; local34 < anIntArray38.length; local34++) {
						if (arg2.CheckDeviceType(arg1, arg4, local9.Format, anIntArray38[local34], true) == 0 && arg2.CheckDeviceFormat(arg1, arg4, local9.Format, 1, 1, anIntArray38[local34]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg4, anIntArray38[local34], true, local5) == 0)) {
							for (@Pc(83) int local83 = 0; local83 < anIntArray36.length; local83++) {
								if (arg2.CheckDeviceFormat(arg1, arg4, local9.Format, 2, 1, anIntArray36[local83]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg4, local9.Format, anIntArray38[local34], anIntArray36[local83]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg4, anIntArray36[local34], true, local5) == 0)) {
									local3 = anIntArray38[local34];
									local1 = anIntArray36[local83];
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
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local5;
			arg3.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(168) Throwable local168) {
			return false;
		}
	}
}
