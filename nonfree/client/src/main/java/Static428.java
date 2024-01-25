import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public static int anInt7201;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	public static int anInt7198 = -1;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray68 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method5674() {
		if (Static16.aFloat6 < 1024.0F) {
			Static16.aFloat6 = 1024.0F;
		}
		while (Static149.aFloat53 >= 16384.0F) {
			Static149.aFloat53 -= 16384.0F;
		}
		if (Static16.aFloat6 > 3072.0F) {
			Static16.aFloat6 = 3072.0F;
		}
		while (Static149.aFloat53 < 0.0F) {
			Static149.aFloat53 += 16384.0F;
		}
		@Pc(41) int local41 = Static399.anInt6746 >> 7;
		@Pc(45) int local45 = Static440.anInt7366 >> 7;
		@Pc(55) int local55 = Static326.method4459(Static96.anInt1983, Static399.anInt6746, Static440.anInt7366);
		@Pc(57) int local57 = 0;
		@Pc(81) int local81;
		if (local41 > 3 && local45 > 3 && local41 < Static2.anInt7 - 4 && local45 < Static17.anInt315 - 4) {
			for (local81 = local41 - 4; local81 <= local41 + 4; local81++) {
				for (@Pc(87) int local87 = local45 - 4; local87 <= local45 + 4; local87++) {
					@Pc(91) int local91 = Static96.anInt1983;
					if (local91 < 3 && Static178.method2948(local87, local81)) {
						local91++;
					}
					@Pc(104) int local104 = 0;
					if (Static356.aClass101_Sub1_1.aByteArrayArrayArray10 != null && Static356.aClass101_Sub1_1.aByteArrayArrayArray10[local91] != null) {
						local104 = (Static356.aClass101_Sub1_1.aByteArrayArrayArray10[local91][local81][local87] & 0xFF) * 8;
					}
					@Pc(137) int local137 = local104 + local55 - Static332.aClass154Array3[local91].ua(local81, local87);
					if (local57 < local137) {
						local57 = local137;
					}
				}
			}
		}
		local81 = (local57 >> 0) * 1536;
		if (local81 > 786432) {
			local81 = 786432;
		}
		if (local81 < 262144) {
			local81 = 262144;
		}
		if (Static190.anInt3828 < local81) {
			Static190.anInt3828 += (local81 - Static190.anInt3828) / 24;
		} else if (Static190.anInt3828 > local81) {
			Static190.anInt3828 += (local81 - Static190.anInt3828) / 80;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!sf;I)V")
	public static void method5675(@OriginalArg(0) Class24_Sub3_Sub2_Sub2 arg0) {
		@Pc(16) Class10_Sub23 local16 = (Class10_Sub23) Static414.aClass167_32.method3709((long) arg0.anInt6228);
		if (local16 == null) {
			return;
		}
		if (local16.aClass10_Sub7_Sub1_2 != null) {
			Static461.aClass10_Sub7_Sub2_5.method1841(local16.aClass10_Sub7_Sub1_2);
			local16.aClass10_Sub7_Sub1_2 = null;
		}
		local16.method6033();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!za;)V")
	public static void method5677(@OriginalArg(1) Class50 arg0) {
		if (Static310.aClass163_37.method3614() == 0) {
			return;
		}
		@Pc(56) Class10_Sub39 local56;
		if (Static423.anInt7114 == 0) {
			for (local56 = (Class10_Sub39) Static310.aClass163_37.method3620(); local56 != null; local56 = (Class10_Sub39) Static310.aClass163_37.method3621()) {
				Static313.aClass272_2.method6070(local56.anInt5664, arg0, local56.anInt5661, local56.anInt5663, false, false, arg0, local56.anInt5659, Static383.aClass57_5, local56.aBoolean366 ? Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 : null, local56.anInt5665);
				local56.method6033();
			}
			Static448.method5473();
			return;
		}
		if (Static456.aClass50_11 == null) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(36, 32);
			Static456.aClass50_11 = Static461.method5836(Static171.aClass159_1, 0, local26, 0, Static413.anInterface7_7);
			Static92.aClass57_1 = Static456.aClass50_11.method5846(Static378.method5102(Static337.anInt5681, Static326.aClass187_99), Static463.method1664(Static21.aClass187_8, Static337.anInt5681));
		}
		for (local56 = (Class10_Sub39) Static310.aClass163_37.method3620(); local56 != null; local56 = (Class10_Sub39) Static310.aClass163_37.method3621()) {
			Static313.aClass272_2.method6070(local56.anInt5664, Static456.aClass50_11, local56.anInt5661, local56.anInt5663, false, false, arg0, local56.anInt5659, Static92.aClass57_1, local56.aBoolean366 ? Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 : null, local56.anInt5665);
			local56.method6033();
		}
	}
}
