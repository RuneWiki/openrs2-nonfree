import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.wd;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!rd", name = "Zg", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!rd", name = "fh", descriptor = "[I")
	public static final int[] anIntArray559 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!rd", name = "lh", descriptor = "[I")
	private static final int[] anIntArray560 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!bfa;I)I")
	public static int method6727(@OriginalArg(0) Class30 arg0) {
		if (arg0 == Static176.aClass30_1) {
			return 2;
		} else if (arg0 == Static439.aClass30_4) {
			return 3;
		} else if (Static608.aClass30_6 == arg0) {
			return 1;
		} else if (arg0 == Static286.aClass30_3) {
			return 4;
		} else if (Static482.aClass30_5 == arg0) {
			return 6;
		} else if (arg0 == Static249.aClass30_2) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!qs;)I")
	public static int method6729(@OriginalArg(1) Class291 arg0) {
		if (arg0 == Static634.aClass291_4) {
			return 2;
		} else if (Static113.aClass291_2 == arg0) {
			return 0;
		} else if (Static10.aClass291_1 == arg0) {
			return 1;
		} else if (arg0 == Static185.aClass291_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;ILclient!jagdx/D3DPRESENT_PARAMETERS;III)Z")
	public static boolean method6731(@OriginalArg(0) IDirect3D arg0, @OriginalArg(2) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (wd.a(arg0.a(arg2, local9), (byte) 108)) {
				return false;
			}
			label82: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(31) int local31 = 0; local31 < anIntArray560.length; local31++) {
						if (arg0.CheckDeviceType(arg2, arg3, local9.Format, anIntArray560[local31], true) == 0 && arg0.CheckDeviceFormat(arg2, arg3, local9.Format, 1, 1, anIntArray560[local31]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg2, arg3, anIntArray560[local31], true, local5) == 0)) {
							for (@Pc(84) int local84 = 0; local84 < anIntArray559.length; local84++) {
								if (arg0.CheckDeviceFormat(arg2, arg3, local9.Format, 2, 1, anIntArray559[local84]) == 0 && arg0.CheckDepthStencilMatch(arg2, arg3, local9.Format, anIntArray560[local31], anIntArray559[local84]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg2, arg3, anIntArray559[local31], true, local5) == 0)) {
									local3 = anIntArray560[local31];
									local1 = anIntArray559[local84];
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
			arg1.BackBufferFormat = local3;
			arg1.MultiSampleQuality = 0;
			arg1.MultiSampleType = local5;
			arg1.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(191) Throwable local191) {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!kf;Lclient!kea;I)I")
	public static int method6732(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class188 arg1) {
		if (Static290.aClass189_11 == arg0) {
			if (arg1 == Static566.aClass188_13) {
				return 22;
			}
			if (arg1 == Static393.aClass188_12) {
				return 21;
			}
			if (arg1 == Static588.aClass188_15) {
				return 28;
			}
			if (Static154.aClass188_7 == arg1) {
				return 50;
			}
			if (Static389.aClass188_11 == arg1) {
				return 51;
			}
			if (Static254.aClass188_9 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!tb;)I")
	public static int method6735(@OriginalArg(1) Class328 arg0) {
		if (arg0 == Static541.aClass328_10) {
			return 2;
		} else if (Static499.aClass328_9 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!efa;I)I")
	public static int method6736(@OriginalArg(0) Class85 arg0) {
		if (Static615.aClass85_4 == arg0) {
			return 1;
		} else if (arg0 == Static409.aClass85_3) {
			return 2;
		} else if (arg0 == Static55.aClass85_2) {
			return 3;
		} else if (Static629.aClass85_6 == arg0) {
			return 4;
		} else if (Static16.aClass85_1 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!hd;Z)I")
	public static int method6737(@OriginalArg(0) Class136 arg0) {
		if (Static225.aClass136_3 == arg0) {
			return 2;
		} else if (arg0 == Static483.aClass136_6) {
			return 4;
		} else if (arg0 == Static504.aClass136_8) {
			return 26;
		} else if (arg0 == Static248.aClass136_4) {
			return 7;
		} else if (arg0 == Static579.aClass136_7) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
