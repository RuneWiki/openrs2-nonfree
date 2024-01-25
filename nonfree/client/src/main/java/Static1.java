import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
	public static final int[] anIntArray1 = new int[32];

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IFIFF)F")
	public static float method28(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static39.aFloatArrayArray2[arg1];
		return arg3 * local12[0] + local12[1] * arg0 + local12[2] * arg2;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public static void method29() {
		if (!Static222.aBoolean305) {
			return;
		}
		@Pc(11) Class126 local11 = Static299.method4154(Static8.anInt336, Static14.anInt5474);
		if (local11 != null && local11.anObjectArray7 != null) {
			@Pc(20) Class4_Sub40 local20 = new Class4_Sub40();
			local20.aClass126_16 = local11;
			local20.anObjectArray35 = local11.anObjectArray7;
			Static172.method2513(local20);
		}
		Static384.anInt6284 = -1;
		Static222.aBoolean305 = false;
		Static52.anInt1389 = -1;
		if (local11 != null) {
			Static430.method5524(local11);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!vj;)V")
	public static void method30(@OriginalArg(0) Class6_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort82; local2 <= arg0.aShort84; local2++) {
			for (@Pc(6) int local6 = arg0.aShort85; local6 <= arg0.aShort83; local6++) {
				@Pc(16) Class53 local16 = Static40.aClass53ArrayArrayArray2[arg0.aByte86][local2][local6];
				if (local16 != null) {
					@Pc(21) Class165 local21 = local16.aClass165_1;
					@Pc(23) Class165 local23 = null;
					while (local21 != null) {
						if (local21.aClass6_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass165_1 = local21.aClass165_2;
							} else {
								local23.aClass165_2 = local21.aClass165_2;
							}
							local21.method3654();
							break;
						}
						local23 = local21;
						local21 = local21.aClass165_2;
					}
					local16.aByte34 = 0;
					for (@Pc(56) Class165 local56 = local16.aClass165_1; local56 != null; local56 = local56.aClass165_2) {
						local16.aByte34 = (byte) (local16.aByte34 | local56.anInt4788);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLclient!jb;I)V")
	public static void method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class126 arg3) {
		@Pc(8) int local8 = arg3.anInt3421;
		@Pc(11) int local11 = arg3.anInt3442;
		if (arg3.aByte64 == 0) {
			arg3.anInt3421 = arg3.anInt3402;
		} else if (arg3.aByte64 == 1) {
			arg3.anInt3421 = arg1 - arg3.anInt3402;
		} else if (arg3.aByte64 == 2) {
			arg3.anInt3421 = arg1 * arg3.anInt3402 >> 14;
		}
		if (arg3.aByte63 == 0) {
			arg3.anInt3442 = arg3.anInt3418;
		} else if (arg3.aByte63 == 1) {
			arg3.anInt3442 = arg0 - arg3.anInt3418;
		} else if (arg3.aByte63 == 2) {
			arg3.anInt3442 = arg0 * arg3.anInt3418 >> 14;
		}
		if (arg3.aByte64 == 4) {
			arg3.anInt3421 = arg3.anInt3436 * arg3.anInt3442 / arg3.anInt3445;
		}
		if (arg3.aByte63 == 4) {
			arg3.anInt3442 = arg3.anInt3421 * arg3.anInt3445 / arg3.anInt3436;
		}
		if (Static197.aBoolean436 && (Static55.method1118(arg3).anInt5771 != 0 || arg3.anInt3426 == 0)) {
			if (arg3.anInt3442 < 5 && arg3.anInt3421 < 5) {
				arg3.anInt3421 = 5;
				arg3.anInt3442 = 5;
			} else {
				if (arg3.anInt3442 <= 0) {
					arg3.anInt3442 = 5;
				}
				if (arg3.anInt3421 <= 0) {
					arg3.anInt3421 = 5;
				}
			}
		}
		if (arg3.anInt3434 == Static30.anInt695) {
			Static310.aClass126_13 = arg3;
		}
		if (arg2 && arg3.anObjectArray28 != null && (arg3.anInt3421 != local8 || local11 != arg3.anInt3442)) {
			@Pc(201) Class4_Sub40 local201 = new Class4_Sub40();
			local201.anObjectArray35 = arg3.anObjectArray28;
			local201.aClass126_16 = arg3;
			Static447.aClass258_49.method5526(local201);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!j;III[Z)Z")
	public static boolean method33(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static346.aClass146Array2 != Static117.aClass146Array1) {
			@Pc(11) int local11 = Static422.aClass146Array3[arg1].va(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class146 local18 = Static422.aClass146Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.va(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3606(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.SA(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
