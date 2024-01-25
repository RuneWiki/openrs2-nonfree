import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.oo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cka", name = "Mg", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16];

	@OriginalMember(owner = "client!cka", name = "ch", descriptor = "[I")
	private static final int[] anIntArray71 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!cka", name = "jh", descriptor = "[I")
	private static final int[] anIntArray72 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!jf;B)I")
	public static int method1754(@OriginalArg(0) Class178 arg0) {
		if (arg0 == Static138.aClass178_2) {
			return 2;
		} else if (arg0 == Static606.aClass178_4) {
			return 4;
		} else if (Static512.aClass178_3 == arg0) {
			return 26;
		} else if (arg0 == Static654.aClass178_5) {
			return 7;
		} else if (arg0 == Static11.aClass178_1) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;BIILclient!jagdx/IDirect3D;I)Z")
	public static boolean method1755(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (oo.a((byte) -69, arg3.a(arg1, local9))) {
				return false;
			}
			label81: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(40) int local40 = 0; local40 < anIntArray72.length; local40++) {
						if (arg3.CheckDeviceType(arg1, arg2, local9.Format, anIntArray72[local40], true) == 0 && arg3.CheckDeviceFormat(arg1, arg2, local9.Format, 1, 1, anIntArray72[local40]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, anIntArray72[local40], true, local5) == 0)) {
							for (@Pc(98) int local98 = 0; local98 < anIntArray71.length; local98++) {
								if (arg3.CheckDeviceFormat(arg1, arg2, local9.Format, 2, 1, anIntArray71[local98]) == 0 && arg3.CheckDepthStencilMatch(arg1, arg2, local9.Format, anIntArray72[local40], anIntArray71[local98]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, anIntArray71[local40], true, local5) == 0)) {
									local1 = anIntArray71[local98];
									local3 = anIntArray72[local40];
									break label81;
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
			arg0.MultiSampleQuality = 0;
			arg0.AutoDepthStencilFormat = local1;
			arg0.BackBufferFormat = local3;
			return true;
		} catch (@Pc(192) Throwable local192) {
			return false;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!hu;B)I")
	public static int method1758(@OriginalArg(0) Class155 arg0) {
		if (Static493.aClass155_5 == arg0) {
			return 2;
		} else if (Static106.aClass155_2 == arg0) {
			return 3;
		} else if (Static490.aClass155_4 == arg0) {
			return 1;
		} else if (arg0 == Static72.aClass155_1) {
			return 4;
		} else if (arg0 == Static504.aClass155_6) {
			return 6;
		} else if (arg0 == Static246.aClass155_3) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!cja;I)I")
	public static int method1760(@OriginalArg(0) Class64 arg0) {
		if (Static536.aClass64_4 == arg0) {
			return 2;
		} else if (Static235.aClass64_2 == arg0) {
			return 0;
		} else if (Static169.aClass64_1 == arg0) {
			return 1;
		} else if (Static413.aClass64_3 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!kka;B)I")
	public static int method1761(@OriginalArg(0) Class198 arg0) {
		if (arg0 == Static556.aClass198_4) {
			return 1;
		} else if (Static102.aClass198_1 == arg0) {
			return 2;
		} else if (Static581.aClass198_5 == arg0) {
			return 3;
		} else if (Static591.aClass198_6 == arg0) {
			return 4;
		} else if (Static532.aClass198_3 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILclient!ds;Lclient!tn;)I")
	public static int method1763(@OriginalArg(1) Class89 arg0, @OriginalArg(2) Class339 arg1) {
		if (arg0 == Static120.aClass89_7) {
			if (Static626.aClass339_16 == arg1) {
				return 22;
			}
			if (Static435.aClass339_15 == arg1) {
				return 21;
			}
			if (Static67.aClass339_4 == arg1) {
				return 28;
			}
			if (arg1 == Static115.aClass339_5) {
				return 50;
			}
			if (arg1 == Static676.aClass339_17) {
				return 51;
			}
			if (arg1 == Static241.aClass339_6) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!qt;B)I")
	public static int method1764(@OriginalArg(0) Class294 arg0) {
		if (arg0 == Static516.aClass294_10) {
			return 2;
		} else if (Static393.aClass294_6 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
