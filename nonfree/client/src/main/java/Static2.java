import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lclient!gl;")
	public static Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "[I")
	public static final int[] anIntArray1 = new int[4];

	@OriginalMember(owner = "client!aaa", name = "r", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!ha;ZJ)V")
	public static void method30(@OriginalArg(0) Class33 arg0, @OriginalArg(2) long arg1) {
		Static493.anInt8770 = Static342.anInt6740;
		Static642.anInt10522 = 0;
		Static396.anInt7579 = 0;
		Static342.anInt6740 = 0;
		@Pc(16) long local16 = Static444.method6719();
		for (@Pc(26) Class2_Sub2 local26 = (Class2_Sub2) Static477.aClass375_7.method8638(); local26 != null; local26 = (Class2_Sub2) Static477.aClass375_7.method8635()) {
			if (local26.method237(arg0, arg1)) {
				Static642.anInt10522++;
			}
		}
		if (Static535.aBoolean551 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static477.aClass375_7.method8641() + ", running: " + Static642.anInt10522);
			System.out.println("Emitters: " + Static396.anInt7579 + " Particles: " + Static342.anInt6740 + ". Time taken: " + (Static444.method6719() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIBIII)Z")
	public static boolean method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg0; local15 <= arg3; local15++) {
			for (@Pc(19) int local19 = arg4; local19 <= arg2; local19++) {
				if (arg1 == Static188.anIntArrayArray40[local15][local19] && Static396.anIntArrayArray74[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public static void method33() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static479.aBooleanArray20[local3] = false;
		}
		Static190.anInt4448 = 0;
		Static155.anInt3810 = -1;
		Static531.anInt9157 = -1;
		Static516.anInt9019 = 1;
		Static322.anInt6492 = -1;
		Static518.anInt10102 = -1;
		Static513.anInt9000 = 0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!fc;)V")
	public static void method34(@OriginalArg(0) Class93 arg0) {
		if (Static252.anInt5591 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub27 local6 = arg0.aClass3_Sub27_2;
		Static523.aClass93Array1[Static252.anInt5591] = arg0;
		Static511.aBooleanArray23[Static252.anInt5591] = false;
		Static252.anInt5591++;
		@Pc(21) int local21 = arg0.anInt3588;
		if (arg0.aBoolean298) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt3588;
		if (arg0.aBoolean297) {
			local29 = Static626.anInt10336 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5630() + Static510.anInt8986 - local6.method5624() >> Static276.anInt5846;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5630() + local6.method5624() - Static510.anInt8986 >> Static276.anInt5846;
			if (local73 >= Static158.anInt3845) {
				local73 = Static158.anInt3845 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray33[local41++];
				@Pc(105) int local105 = (local6.method5627() + Static510.anInt8986 - local6.method5624() >> Static276.anInt5846) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static642.anInt10523) {
					local113 = Static642.anInt10523 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static408.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static408.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static252.anInt5591;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static408.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static252.anInt5591 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static408.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static252.anInt5591 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static408.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static252.anInt5591 << 48;
					}
				}
			}
		}
	}
}
