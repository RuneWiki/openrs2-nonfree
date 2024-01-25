import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rs", name = "G", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_126 = new Class253(41, 15);

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
	public static int anInt5669 = 1;

	@OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
	public static int anInt5673 = 0;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(III)V")
	public static void method4562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass26_Sub3_2 != null) {
			local7.aClass26_Sub3_2 = null;
		}
		if (local7.aClass26_Sub3_1 != null) {
			local7.aClass26_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
	public static void method4563() {
		Static97.anInt1979 = 0;
		@Pc(11) int local11 = Static210.aClass7_Sub14_Sub1_4.method3981();
		@Pc(15) int local15 = Static210.aClass7_Sub14_Sub1_4.method3946();
		@Pc(19) int local19 = Static210.aClass7_Sub14_Sub1_4.method3990();
		@Pc(30) boolean local30 = Static210.aClass7_Sub14_Sub1_4.method3968() == 1;
		Static100.method1743(local11);
		@Pc(43) int local43 = (Static205.anInt3627 - Static210.aClass7_Sub14_Sub1_4.anInt4989) / 16;
		Static220.anIntArrayArray29 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static220.anIntArrayArray29[local49][local53] = Static210.aClass7_Sub14_Sub1_4.method3938();
			}
		}
		Static333.aByteArrayArray14 = new byte[local43][];
		Static48.anIntArray70 = new int[local43];
		Static401.anIntArray574 = null;
		Static170.anIntArray421 = new int[local43];
		Static331.anIntArray494 = new int[local43];
		Static253.anIntArray367 = new int[local43];
		Static66.aByteArrayArray4 = new byte[local43][];
		Static36.anIntArray53 = new int[local43];
		Static420.aByteArrayArray22 = new byte[local43][];
		Static155.aByteArrayArray12 = new byte[local43][];
		Static3.aByteArrayArray1 = null;
		local43 = 0;
		for (local53 = (local15 - (Static333.anInt3375 >> 4)) / 8; local53 <= ((Static333.anInt3375 >> 4) + local15) / 8; local53++) {
			for (@Pc(130) int local130 = (local19 - (Static102.anInt2086 >> 4)) / 8; local130 <= (local19 + (Static102.anInt2086 >> 4)) / 8; local130++) {
				Static331.anIntArray494[local43] = (local53 << 8) + local130;
				Static253.anIntArray367[local43] = Static402.aClass178_123.method3836("m" + local53 + "_" + local130);
				Static48.anIntArray70[local43] = Static402.aClass178_123.method3836("l" + local53 + "_" + local130);
				Static36.anIntArray53[local43] = Static402.aClass178_123.method3836("um" + local53 + "_" + local130);
				Static170.anIntArray421[local43] = Static402.aClass178_123.method3836("ul" + local53 + "_" + local130);
				local43++;
			}
		}
		Static114.method1939(10, local19, local15, local30);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)Z")
	public static boolean method4564(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
