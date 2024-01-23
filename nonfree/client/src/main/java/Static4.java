import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Lclient!i;")
	public static Class41 aClass41_36;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public static int anInt108 = 0;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!i;")
	private static Class41 aClass41_35 = Static184.method2923("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_37 = aClass41_35;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_39 = Static184.method2923("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_40 = Static184.method2923(")4l");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!q;)V")
	public static void method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class80 arg2) {
		if (Static219.anInt4791 != 0 && Static219.anInt4791 != 3) {
			return;
		}
		@Pc(16) int local16 = arg1 - arg2.anInt3660 / 2;
		@Pc(23) int local23 = arg0 - arg2.anInt3635 / 2;
		@Pc(29) int local29 = Static183.anInt1324 + Static47.anInt1372 & 0x7FF;
		@Pc(33) int local33 = Class79.anIntArray375[local29];
		@Pc(37) int local37 = Class79.anIntArray377[local29];
		@Pc(45) int local45 = (Static58.anInt1635 + 256) * local33 >> 8;
		@Pc(53) int local53 = (Static58.anInt1635 + 256) * local37 >> 8;
		@Pc(69) int local69 = local23 * local45 + local53 * local16 >> 11;
		@Pc(76) int local76 = local69 + Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7;
		@Pc(87) int local87 = local45 * local16 - local23 * local53 >> 11;
		@Pc(95) int local95 = Static213.aClass12_Sub3_Sub1_1.anInt3949 - local87 >> 7;
		@Pc(117) boolean local117 = Static183.method925(0, 0, local95, local76, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 1, true, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
		if (!local117) {
			return;
		}
		Static131.aClass2_Sub3_Sub1_2.method208(local23);
		Static131.aClass2_Sub3_Sub1_2.method208(local16);
		Static131.aClass2_Sub3_Sub1_2.method167(Static183.anInt1324);
		Static131.aClass2_Sub3_Sub1_2.method208(57);
		Static131.aClass2_Sub3_Sub1_2.method208(Static47.anInt1372);
		Static131.aClass2_Sub3_Sub1_2.method208(Static58.anInt1635);
		Static131.aClass2_Sub3_Sub1_2.method208(89);
		Static131.aClass2_Sub3_Sub1_2.method167(Static213.aClass12_Sub3_Sub1_1.anInt3961);
		Static131.aClass2_Sub3_Sub1_2.method167(Static213.aClass12_Sub3_Sub1_1.anInt3949);
		Static131.aClass2_Sub3_Sub1_2.method208(Static106.anInt2579);
		Static131.aClass2_Sub3_Sub1_2.method208(63);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ea;B)V")
	public static void method80(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(9) byte[] local9 = new byte[24];
		if (Static157.aClass56_3 != null) {
			@Pc(25) int local25;
			try {
				Static157.aClass56_3.method1794(0L);
				Static157.aClass56_3.method1786(local9);
				for (local25 = 0; local25 < 24 && local9[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local25 = 0; local25 < 24; local25++) {
					local9[local25] = -1;
				}
			}
		}
		arg0.method187(24, local9);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public static void method81(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static57.aClass70_3.method2205((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray397.length; local17++) {
				local12.anIntArray397[local17] = -1;
				local12.anIntArray396[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public static void method84(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static58.anInt1633 != 0 && arg0 != -1) {
			Static48.method960(Static118.aClass15_Sub1_75, arg0, Static58.anInt1633);
			Static96.aBoolean127 = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)Z")
	public static boolean method85(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
