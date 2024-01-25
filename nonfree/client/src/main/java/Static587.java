import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "[[Lclient!vw;")
	public static Class348[][] aClass348ArrayArray1;

	@OriginalMember(owner = "client!wj", name = "Q", descriptor = "Lclient!he;")
	public static Class6_Sub18_Sub2 aClass6_Sub18_Sub2_3;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "Z")
	public static boolean aBoolean733 = false;

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!wj", name = "S", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_154 = new Class47(47, -1);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	public static void method7796() {
		Static367.anInt6493 = 0;
		@Pc(11) int local11 = Static282.aClass6_Sub21_Sub2_1.method6069();
		@Pc(15) int local15 = Static282.aClass6_Sub21_Sub2_1.method6056();
		@Pc(19) int local19 = Static282.aClass6_Sub21_Sub2_1.method6068();
		@Pc(30) boolean local30 = Static282.aClass6_Sub21_Sub2_1.method6035() == 1;
		Static265.method4443();
		Static361.method6651(local11);
		@Pc(43) int local43 = (Static177.anInt3710 - Static282.aClass6_Sub21_Sub2_1.anInt7338) / 16;
		Static486.anIntArrayArray73 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static486.anIntArrayArray73[local49][local53] = Static282.aClass6_Sub21_Sub2_1.method6036();
			}
		}
		Static98.anIntArray154 = new int[local43];
		Static220.anIntArray273 = new int[local43];
		Static378.anIntArray493 = null;
		Static365.anIntArray477 = new int[local43];
		Static64.aByteArrayArray18 = new byte[local43][];
		Static334.aByteArrayArray19 = new byte[local43][];
		Static542.aByteArrayArray30 = null;
		Static30.aByteArrayArray2 = new byte[local43][];
		Static228.anIntArray281 = new int[local43];
		Static380.aByteArrayArray22 = new byte[local43][];
		Static347.anIntArray461 = new int[local43];
		local43 = 0;
		for (local53 = (local15 - (Static473.anInt8075 >> 4)) / 8; local53 <= (local15 + (Static473.anInt8075 >> 4)) / 8; local53++) {
			for (@Pc(133) int local133 = (local19 - (Static165.anInt6749 >> 4)) / 8; local133 <= ((Static165.anInt6749 >> 4) + local19) / 8; local133++) {
				Static365.anIntArray477[local43] = (local53 << 8) + local133;
				Static220.anIntArray273[local43] = Static70.aClass251_58.method5764("m" + local53 + "_" + local133);
				Static228.anIntArray281[local43] = Static70.aClass251_58.method5764("l" + local53 + "_" + local133);
				Static98.anIntArray154[local43] = Static70.aClass251_58.method5764("um" + local53 + "_" + local133);
				Static347.anIntArray461[local43] = Static70.aClass251_58.method5764("ul" + local53 + "_" + local133);
				local43++;
			}
		}
		Static66.method1315(local30, 11, local19, local15);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
	public static int method7797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static454.anIntArray562[arg0 & 0x3] : Static489.anIntArray602[arg0 & 0x3];
	}
}
