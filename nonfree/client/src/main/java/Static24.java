import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bh", name = "Gb", descriptor = "I")
	public static int anInt672;

	@OriginalMember(owner = "client!bh", name = "Jb", descriptor = "Lclient!qj;")
	public static Class165 aClass165_7;

	@OriginalMember(owner = "client!bh", name = "Zb", descriptor = "Lclient!jm;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!bh", name = "Fb", descriptor = "I")
	public static int anInt671 = 0;

	@OriginalMember(owner = "client!bh", name = "Ib", descriptor = "I")
	public static int anInt674 = 0;

	@OriginalMember(owner = "client!bh", name = "Lb", descriptor = "[Lclient!ie;")
	public static final Class91[] aClass91Array1 = new Class91[4];

	@OriginalMember(owner = "client!bh", name = "Nb", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Members object";

	@OriginalMember(owner = "client!bh", name = "Qb", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!bh", name = "Tb", descriptor = "Ljava/lang/String;")
	public static String aString20 = "Loaded wordpack";

	@OriginalMember(owner = "client!bh", name = "Xb", descriptor = "[Lclient!qo;")
	public static final Class169[] aClass169Array1 = new Class169[6];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!pm;)V")
	public static void method732(@OriginalArg(0) Class1_Sub31_Sub1 arg0) {
		if (Static160.anInt3182 >= 255) {
			return;
		}
		Static327.aClass1_Sub31_Sub1Array3[Static160.anInt3182] = arg0;
		Static30.aBooleanArray3[Static160.anInt3182] = false;
		Static160.anInt3182++;
		@Pc(18) int local18 = arg0.anInt4698;
		if (arg0.aBoolean396) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4698;
		if (arg0.aBoolean394) {
			local26 = Static56.anInt1240 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4693 + 64 - arg0.anInt4688 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4693 + arg0.anInt4688 - 64 >> 7;
			if (local66 >= Static74.anInt3404) {
				local66 = Static74.anInt3404 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray76[local38++];
				@Pc(96) int local96 = (arg0.anInt4687 + 64 - arg0.anInt4688 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static222.anInt4391) {
					local104 = Static222.anInt4391 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static116.anIntArrayArrayArray7[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static116.anIntArrayArrayArray7[local35][local117][local75] = local126 | Static160.anInt3182;
					} else if ((local126 & 0xFF00) == 0) {
						Static116.anIntArrayArrayArray7[local35][local117][local75] = local126 | Static160.anInt3182 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static116.anIntArrayArrayArray7[local35][local117][local75] = local126 | Static160.anInt3182 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static116.anIntArrayArrayArray7[local35][local117][local75] = local126 | Static160.anInt3182 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "(I)V")
	public static void method734() {
		@Pc(8) int[] local8 = new int[Static279.anInt5425];
		@Pc(10) int local10 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static279.anInt5425; local16++) {
			@Pc(22) Class61 local22 = Static241.method4285(local16);
			if (local22.anInt1795 >= 0 || local22.anInt1796 >= 0) {
				local8[local10++] = local16;
			}
		}
		Static155.anIntArray356 = new int[local10];
		for (@Pc(49) int local49 = 0; local49 < local10; local49++) {
			Static155.anIntArray356[local49] = local8[local49];
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIII)V")
	public static void method735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub36 local10 = (Class1_Sub36) Static233.aClass195_41.method5029(); local10 != null; local10 = (Class1_Sub36) Static233.aClass195_41.method5021()) {
			Static39.method962(arg2, arg3, arg0, local10, arg1);
		}
		for (@Pc(36) Class1_Sub36 local36 = (Class1_Sub36) Static193.aClass195_38.method5029(); local36 != null; local36 = (Class1_Sub36) Static193.aClass195_38.method5021()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class45 local45 = local36.aClass5_Sub3_Sub3_Sub2_1.method4533();
			if (local36.aClass5_Sub3_Sub3_Sub2_1.aBoolean412) {
				local40 = 0;
			} else if (local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1490 || local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1494 || local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1481 || local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1489) {
				local40 = 2;
			} else if (local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1504 || local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1476 || local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1500 || local36.aClass5_Sub3_Sub3_Sub2_1.anInt4975 == local45.anInt1482) {
				local40 = 3;
			}
			if (local40 != local36.anInt5635) {
				@Pc(136) int local136 = Static73.method1436(local36.aClass5_Sub3_Sub3_Sub2_1);
				if (local36.anInt5650 != local136) {
					if (local36.aClass1_Sub6_Sub3_1 != null) {
						Static170.aClass1_Sub6_Sub4_2.method1665(local36.aClass1_Sub6_Sub3_1);
						local36.aClass1_Sub6_Sub3_1 = null;
					}
					local36.anInt5650 = local136;
				}
				local36.anInt5635 = local40;
			}
			local36.anInt5655 = local36.aClass5_Sub3_Sub3_Sub2_1.anInt5050;
			local36.anInt5649 = local36.aClass5_Sub3_Sub3_Sub2_1.anInt5050 + local36.aClass5_Sub3_Sub3_Sub2_1.method4541() * 64;
			local36.anInt5637 = local36.aClass5_Sub3_Sub3_Sub2_1.anInt5047;
			local36.anInt5648 = local36.aClass5_Sub3_Sub3_Sub2_1.anInt5047 + local36.aClass5_Sub3_Sub3_Sub2_1.method4541() * 64;
			Static39.method962(arg2, arg3, arg0, local36, arg1);
		}
		for (@Pc(212) Class1_Sub36 local212 = (Class1_Sub36) Static130.aClass26_18.method871(); local212 != null; local212 = (Class1_Sub36) Static130.aClass26_18.method878()) {
			@Pc(216) byte local216 = 1;
			@Pc(223) Class45 local223 = local212.aClass5_Sub3_Sub3_Sub1_2.method4533();
			if (local212.aClass5_Sub3_Sub3_Sub1_2.aBoolean412) {
				local216 = 0;
			} else if (local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975 == local223.anInt1490 || local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975 == local223.anInt1494 || local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975 == local223.anInt1481 || local223.anInt1489 == local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975) {
				local216 = 2;
			} else if (local223.anInt1504 == local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975 || local223.anInt1476 == local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975 || local223.anInt1500 == local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975 || local223.anInt1482 == local212.aClass5_Sub3_Sub3_Sub1_2.anInt4975) {
				local216 = 3;
			}
			if (local212.anInt5635 != local216) {
				@Pc(324) int local324 = Static223.method4084(local212.aClass5_Sub3_Sub3_Sub1_2);
				if (local324 != local212.anInt5650) {
					if (local212.aClass1_Sub6_Sub3_1 != null) {
						Static170.aClass1_Sub6_Sub4_2.method1665(local212.aClass1_Sub6_Sub3_1);
						local212.aClass1_Sub6_Sub3_1 = null;
					}
					local212.anInt5650 = local324;
				}
				local212.anInt5635 = local216;
			}
			local212.anInt5655 = local212.aClass5_Sub3_Sub3_Sub1_2.anInt5050;
			local212.anInt5649 = local212.aClass5_Sub3_Sub3_Sub1_2.anInt5050 + local212.aClass5_Sub3_Sub3_Sub1_2.method4541() * 64;
			local212.anInt5637 = local212.aClass5_Sub3_Sub3_Sub1_2.anInt5047;
			local212.anInt5648 = local212.aClass5_Sub3_Sub3_Sub1_2.anInt5047 + local212.aClass5_Sub3_Sub3_Sub1_2.method4541() * 64;
			Static39.method962(arg2, arg3, arg0, local212, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
	public static void method736(@OriginalArg(1) int arg0) {
		if (Static3.anInt77 == 0) {
			Static121.aClass1_Sub6_Sub1_2.method558(arg0);
		} else {
			Static160.anInt3183 = arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "(II)V")
	public static void method737() {
		Static261.aClass140_133.method3824(5);
	}
}
