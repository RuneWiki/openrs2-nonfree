import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	public static boolean aBoolean208 = true;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!at;II)V")
	public static void method2718(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte3 == 0) {
			arg1.anInt269 = arg1.anInt255;
		} else if (arg1.aByte3 == 1) {
			arg1.anInt269 = arg1.anInt255 + (arg0 - arg1.anInt285) / 2;
		} else if (arg1.aByte3 == 2) {
			arg1.anInt269 = arg0 - arg1.anInt285 - arg1.anInt255;
		} else if (arg1.aByte3 == 3) {
			arg1.anInt269 = arg0 * arg1.anInt255 >> 14;
		} else if (arg1.aByte3 == 4) {
			arg1.anInt269 = (arg0 - arg1.anInt285) / 2 + (arg1.anInt255 * arg0 >> 14);
		} else {
			arg1.anInt269 = arg0 - arg1.anInt285 - (arg0 * arg1.anInt255 >> 14);
		}
		if (arg1.aByte4 == 0) {
			arg1.anInt316 = arg1.anInt340;
		} else if (arg1.aByte4 == 1) {
			arg1.anInt316 = arg1.anInt340 + (arg2 - arg1.anInt294) / 2;
		} else if (arg1.aByte4 == 2) {
			arg1.anInt316 = arg2 - arg1.anInt294 - arg1.anInt340;
		} else if (arg1.aByte4 == 3) {
			arg1.anInt316 = arg1.anInt340 * arg2 >> 14;
		} else if (arg1.aByte4 == 4) {
			arg1.anInt316 = (arg2 * arg1.anInt340 >> 14) + (arg2 - arg1.anInt294) / 2;
		} else {
			arg1.anInt316 = arg2 - arg1.anInt294 - (arg1.anInt340 * arg2 >> 14);
		}
		if (!Static95.aBoolean158) {
			return;
		}
		if (Static55.method815(arg1).anInt1904 == 0 && arg1.anInt298 != 0) {
			return;
		}
		if (arg1.anInt316 < 0) {
			arg1.anInt316 = 0;
		} else if (arg1.anInt294 + arg1.anInt316 > arg2) {
			arg1.anInt316 = arg2 - arg1.anInt294;
		}
		if (arg1.anInt269 < 0) {
			arg1.anInt269 = 0;
			return;
		}
		if (arg1.anInt285 + arg1.anInt269 > arg0) {
			arg1.anInt269 = arg0 - arg1.anInt285;
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!nf;I)V")
	public static void method2719(@OriginalArg(1) Class2_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static250.anInt4042 = 0;
		Static223.aBoolean489 = false;
		Static291.method3890(arg0);
		Static455.method5707(arg0);
		if (Static223.aBoolean489) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt4347 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4347 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method2721() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static101.aBooleanArray9[local7] = true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIIII)V")
	public static void method2722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static317.anInt6670 && Static215.anInt3546 >= arg0) {
			@Pc(19) int local19 = Static331.method4435(arg2, Static155.anInt2670, Static219.anInt6125);
			@Pc(25) int local25 = Static331.method4435(arg3, Static155.anInt2670, Static219.anInt6125);
			Static340.method5397(local25, arg1, local19, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Lclient!vu;")
	public static Class260 method2723(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static282.aFloat35 == 3.0D) {
				return Static447.aClass260_9;
			}
			if ((double) Static282.aFloat35 == 4.0D) {
				return Static424.aClass260_7;
			}
			if ((double) Static282.aFloat35 == 6.0D) {
				return Static266.aClass260_4;
			}
			if ((double) Static282.aFloat35 >= 8.0D) {
				return Static132.aClass260_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static282.aFloat35 == 3.0D) {
				return Static266.aClass260_4;
			}
			if ((double) Static282.aFloat35 == 4.0D) {
				return Static132.aClass260_2;
			}
			if ((double) Static282.aFloat35 == 6.0D) {
				return Static64.aClass260_1;
			}
			if ((double) Static282.aFloat35 >= 8.0D) {
				return Static434.aClass260_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static282.aFloat35 == 3.0D) {
				return Static64.aClass260_1;
			}
			if ((double) Static282.aFloat35 == 4.0D) {
				return Static434.aClass260_8;
			}
			if ((double) Static282.aFloat35 == 6.0D) {
				return Static221.aClass260_3;
			}
			if ((double) Static282.aFloat35 >= 8.0D) {
				return Static307.aClass260_5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)I")
	public static int method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static253.aByteArrayArrayArray11[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static253.aByteArrayArrayArray11[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
