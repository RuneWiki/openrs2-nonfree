import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
	public static int anInt1473;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
	public static final int anInt1472 = 0;

	@OriginalMember(owner = "client!dq", name = "T", descriptor = "Z")
	public static boolean aBoolean103 = true;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V")
	public static void method1207() {
		@Pc(8) int local8 = Static415.aByteArrayArray18.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static415.aByteArrayArray18[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static8.anInt187; local20++) {
					if (Static312.anIntArray364[local20] == Static362.anIntArray418[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static312.anIntArray364[Static8.anInt187] = Static362.anIntArray418[local10];
					local18 = Static8.anInt187++;
				}
				@Pc(64) Class5_Sub15 local64 = new Class5_Sub15(Static415.aByteArrayArray18[local10]);
				@Pc(66) int local66 = 0;
				while (local64.anInt7013 < Static415.aByteArrayArray18[local10].length && local66 < 511 && Static424.anInt7114 < 1023) {
					@Pc(85) int local85 = local66++ << 6 | local18;
					@Pc(89) int local89 = local64.method5598();
					@Pc(93) int local93 = local89 >> 14;
					@Pc(99) int local99 = local89 >> 7 & 0x3F;
					@Pc(103) int local103 = local89 & 0x3F;
					@Pc(115) int local115 = (Static362.anIntArray418[local10] >> 8) * 64 + local99 - Static31.anInt618;
					@Pc(128) int local128 = local103 + (Static362.anIntArray418[local10] & 0xFF) * 64 - Static226.anInt3768;
					@Pc(135) Class131 local135 = Static196.aClass180_1.method3713(local64.method5598());
					@Pc(142) Class5_Sub7 local142 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local85);
					if (local142 == null && (local135.aByte41 & 0x1) > 0 && Static123.anInt2187 == local93 && local115 >= 0 && local115 + local135.anInt3463 < Static433.anInt7210 && local128 >= 0 && Static418.anInt6969 > local128 + local135.anInt3463) {
						@Pc(183) Class2_Sub1_Sub3_Sub1 local183 = new Class2_Sub1_Sub3_Sub1();
						local183.anInt6126 = local85;
						@Pc(191) Class5_Sub7 local191 = new Class5_Sub7(local183);
						Static380.aClass252_36.method5658(local191, (long) local85);
						Static277.aClass5_Sub7Array1[Static111.anInt1879++] = local191;
						Static218.anIntArray351[Static424.anInt7114++] = local85;
						local183.anInt6163 = Static85.anInt1536;
						local183.method4091(local135);
						local183.method4904(local183.aClass131_1.anInt3463);
						local183.anInt6134 = local183.aClass131_1.anInt3460 << 3;
						local183.method4909(local183.aClass131_1.aByte34 + 4 << 11 & 0x3A3F, true);
						local183.method4083(local93, local128, local183.method4913(), true, local115);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[BZ)[B")
	public static byte[] method1208(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static468.method3858(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "(I)V")
	public static void method1209() {
		@Pc(9) int local9 = (int) ((double) Static433.anInt7210 * 34.46D);
		local9 <<= 0x0;
		if (Static407.aClass200_9.method5833()) {
			local9 += 128;
		}
		Static407.aClass200_9.d(50, local9);
	}
}
