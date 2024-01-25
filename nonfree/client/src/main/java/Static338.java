import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	private static int anInt1383;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
	private static int anInt1384;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Z")
	private static boolean aBoolean108;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
	public static final int[] anIntArray86 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	public static int anInt1371 = 0;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public static int anInt1381 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZI)V")
	public static void method1137(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub30 local8 = Static9.method237(arg0, arg1);
		if (local8 != null) {
			local8.method5987();
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	public static void method1145() {
		Static369.aClass22_19 = null;
		Static239.anInt4586 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!sc;IIIII)V")
	public static void method1149(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5916 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static341.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class54 local35 = Static303.aClass54Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5916; local37++) {
							if (arg0.aClass3_Sub23Array3[local37] == local35.aClass3_Sub23_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass3_Sub23Array3[arg0.anInt5916++] = local35.aClass3_Sub23_1;
						if (arg0.anInt5916 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5916; local7 < 4; local7++) {
			arg0.aClass3_Sub23Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	public static void method1150() {
		if (Static265.aFloat64 < 1024.0F) {
			Static265.aFloat64 = 1024.0F;
		}
		while (Static235.aFloat60 >= 16384.0F) {
			Static235.aFloat60 -= 16384.0F;
		}
		if (Static265.aFloat64 > 3072.0F) {
			Static265.aFloat64 = 3072.0F;
		}
		while (Static235.aFloat60 < 0.0F) {
			Static235.aFloat60 += 16384.0F;
		}
		@Pc(37) int local37 = Static288.anInt5279 >> 7;
		@Pc(41) int local41 = Static334.anInt6158 >> 7;
		@Pc(47) int local47 = Static124.method2209(Static124.anInt2688, Static288.anInt5279, Static334.anInt6158);
		@Pc(49) int local49 = 0;
		@Pc(80) int local80;
		if (local37 > 3 && local41 > 3 && Static399.anInt6923 - 4 > local37 && local41 < Static127.anInt2696 - 4) {
			for (local80 = local37 - 4; local80 <= local37 + 4; local80++) {
				for (@Pc(85) int local85 = local41 - 4; local85 <= local41 + 4; local85++) {
					@Pc(88) int local88 = Static124.anInt2688;
					if (local88 < 3 && Static202.method3303(local85, local80)) {
						local88++;
					}
					@Pc(99) int local99 = 0;
					if (Static368.aClass4_Sub1_1.aByteArrayArrayArray8 != null && Static368.aClass4_Sub1_1.aByteArrayArrayArray8[local88] != null) {
						local99 = (Static368.aClass4_Sub1_1.aByteArrayArrayArray8[local88][local80][local85] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local99 + local47 - Static120.aClass64Array1[local88].I(local80, local85);
					if (local49 < local132) {
						local49 = local132;
					}
				}
			}
		}
		local80 = (local49 >> 0) * 1536;
		if (local80 > 786432) {
			local80 = 786432;
		}
		if (local80 < 262144) {
			local80 = 262144;
		}
		if (local80 > anInt1371) {
			anInt1371 += (local80 - anInt1371) / 24;
		} else if (anInt1371 > local80) {
			anInt1371 += (local80 - anInt1371) / 80;
		}
	}

	@OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lclient!hs;)V")
	private static void method1151(@OriginalArg(0) Class103 arg0) {
		Static295.aClass103_5 = arg0;
		Static129.aClass103_3 = arg0;
	}
}
