import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
	public static int anInt9129 = 0;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V")
	public static void method7504(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static448.aBooleanArray32[arg0]) {
			Static552.aClass31_118.method677(arg0);
			Static458.aClass115ArrayArray2[arg0] = null;
			Static355.aClass115ArrayArray1[arg0] = null;
			Static448.aBooleanArray32[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZZ)Z")
	public static boolean method7505(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!cea;Z)V")
	public static void method7506(@OriginalArg(0) Class4_Sub9_Sub1 arg0) {
		arg0.method1039();
		@Pc(10) int local10 = Static416.anInt7186;
		@Pc(20) Class10_Sub1_Sub2_Sub2 local20 = Static129.aClass10_Sub1_Sub2_Sub2_1 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local10] = new Class10_Sub1_Sub2_Sub2();
		local20.anInt8531 = local10;
		@Pc(28) int local28 = arg0.method1046(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray653[0] = local39 - Static373.anInt6695;
		local20.anInt8934 = (local20.anIntArray653[0] << 9) + (local20.method7021() << 8);
		local20.anIntArray654[0] = local43 - Static6.anInt97;
		local20.anInt8929 = (local20.anIntArray654[0] << 9) + (local20.method7021() << 8);
		Static320.anInt5748 = local20.aByte101 = local33;
		if (Static590.aClass4_Sub9Array1[local10] != null) {
			local20.method7048(Static590.aClass4_Sub9Array1[local10]);
		}
		Static272.anInt5182 = 0;
		Static362.anIntArray519[Static272.anInt5182++] = local10;
		Static41.aByteArray11[local10] = 0;
		Static135.anInt3093 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local10 != local124) {
				@Pc(138) int local138 = arg0.method1046(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				@Pc(160) Class319 local160 = Static230.aClass319Array1[local124] = new Class319();
				local160.anInt8807 = (local148 << 14) + ((local142 << 28) + local152);
				local160.anInt8810 = -1;
				local160.aBoolean611 = false;
				local160.anInt8809 = 0;
				Static45.anIntArray134[Static135.anInt3093++] = local124;
				Static41.aByteArray11[local124] = 0;
			}
		}
		arg0.method1036();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!cea;)I")
	public static int method7507(@OriginalArg(1) Class4_Sub9_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method1046(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.method1046(5);
		} else if (local10 == 2) {
			local22 = arg0.method1046(8);
		} else {
			local22 = arg0.method1046(11);
		}
		return local22;
	}
}
