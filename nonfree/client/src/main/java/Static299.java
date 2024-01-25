import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!pc;")
	public static Class188 aClass188_79;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!ql;BII)V")
	public static void method4335(@OriginalArg(1) Class4_Sub2_Sub2_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray436[0];
		@Pc(15) int local15 = arg0.anIntArray437[0];
		if (local10 < 0 || local10 >= Static81.anInt1950 || local15 < 0 || local15 >= Static171.anInt3288 || (arg1 < 0 || arg1 >= Static81.anInt1950 || arg2 < 0 || Static171.anInt3288 <= arg2)) {
			return;
		}
		@Pc(66) int local66 = Static408.method5530(0, 0, 0, arg2, local10, -4, local15, Static332.aClass37Array1[arg0.aByte92], Static150.anIntArray199, arg0.method5118(), Static174.anIntArray222, arg1, 0, true);
		if (local66 >= 1 && local66 <= 3) {
			for (@Pc(78) int local78 = 0; local78 < local66 - 1; local78++) {
				arg0.method4601((byte) 2, Static150.anIntArray199[local78], Static174.anIntArray222[local78]);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!cd;[[B)V")
	public static void method4336(@OriginalArg(1) Class33_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub20 local30 = new Class2_Sub20(local23);
				local36 = Static96.anIntArray119[local17] >> 8;
				@Pc(42) int local42 = Static96.anIntArray119[local17] & 0xFF;
				@Pc(48) int local48 = local36 * 64 - Static173.anInt3340;
				@Pc(55) int local55 = local42 * 64 - Static379.anInt6721;
				Static438.method5925();
				arg0.method916(Static379.anInt6721, Static173.anInt3340, local55, local48, Static332.aClass37Array1, local30);
				arg0.method927(local48, Static387.aClass26_9, local55, local12, local30);
				if (!arg0.aBoolean106 && Static447.anInt4685 / 8 == local36 && local42 == Static190.anInt3756 / 8 && local12[0] != -1) {
					Static45.aClass243_4 = Static303.aClass35_1.method991(Static148.aClass123_1, local12[3], local12[0], local12[2], local12[1]);
					Static47.anInt1254 = local12[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local15; local128++) {
			@Pc(140) int local140 = (Static96.anIntArray119[local128] >> 8) * 64 - Static173.anInt3340;
			local36 = (Static96.anIntArray119[local128] & 0xFF) * 64 - Static379.anInt6721;
			@Pc(155) byte[] local155 = arg1[local128];
			if (local155 == null && Static190.anInt3756 < 800) {
				Static438.method5925();
				arg0.method918(local140, local36);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
	public static void method4339(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static272.aBooleanArray51[arg0]) {
			Static320.aClass188_129.method4303(arg0);
			Static450.aClass41ArrayArray2[arg0] = null;
			Static117.aClass41ArrayArray1[arg0] = null;
			Static272.aBooleanArray51[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method4340(@OriginalArg(1) Class26 arg0) {
		arg0.pa(0, 0, Static96.anInt2175, 350);
		arg0.NA(0, 0, Static96.anInt2175, 350, Static308.anInt5417 << 24 | 0x332277, 1);
		@Pc(35) int local35 = 350 / Static386.anInt6717;
		@Pc(47) int local47;
		if (Static372.anInt6682 > 0) {
			local47 = 346 - Static386.anInt6717 - 4;
			@Pc(57) int local57 = local47 * local35 / (Static372.anInt6682 + local35 - 1);
			@Pc(59) int local59 = 4;
			if (Static372.anInt6682 > 1) {
				local59 = (local47 - local57) * (Static372.anInt6682 + -1 - Static22.anInt467) / (Static372.anInt6682 - 1) + 4;
			}
			arg0.NA(Static96.anInt2175 - 16, local59, 12, local57, Static308.anInt5417 << 24 | 0x332277, 2);
			for (@Pc(95) int local95 = Static22.anInt467; local95 < Static22.anInt467 + local35 && local95 < Static372.anInt6682; local95++) {
				@Pc(104) String[] local104 = Static40.method745(Static359.aStringArray25[local95], '\b');
				@Pc(113) int local113 = (Static96.anInt2175 - 16 - 8) / local104.length;
				for (@Pc(115) int local115 = 0; local115 < local104.length; local115++) {
					@Pc(124) int local124 = local113 * local115 + 8;
					arg0.pa(local124, 0, local124 + local113 - 8, 350);
					Static184.aClass56_2.method5848(local104[local115], 350 - Static316.anInt5581 - Static56.aClass210_2.anInt5944 - (-Static22.anInt467 + local95) * Static386.anInt6717 - 2, -1, local124, -16777216);
				}
			}
		}
		arg0.pa(0, 0, Static96.anInt2175, 350);
		arg0.method2237(-1, Static96.anInt2175, 350 - Static316.anInt5581, 0);
		Static193.aClass56_3.method5848("--> " + Static224.aString38, 350 - Static55.aClass210_1.anInt5944 - 1, -1, 10, -16777216);
		local47 = -1;
		if (Static164.anInt3206 % 30 > 15) {
			local47 = 16777215;
		}
		arg0.method2277(339 - Static55.aClass210_1.anInt5944, local47, 12, Static55.aClass210_1.method4758("--> " + Static224.aString38.substring(0, Static126.anInt2500)) + 10);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)I")
	public static int method4341(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}
