import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!sd;")
	public static Class29 aClass29_51;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_33;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!ia;")
	public static Class5_Sub2_Sub8 aClass5_Sub2_Sub8_4;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!mb;")
	private static Class45 aClass45_919 = Static63.method1251("Enter amount:");

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_916 = aClass45_919;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_917 = Static63.method1251("blinken1:");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_918 = Static63.method1251("Benutzername: ");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_920 = Static63.method1251("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!o", name = "j", descriptor = "J")
	public static long aLong98 = 0L;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	public static int anInt2201 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public static void method1478() {
		if (Static71.aClass63_1 != null) {
			@Pc(7) Class63 local7 = Static71.aClass63_1;
			synchronized (Static71.aClass63_1) {
				Static71.aClass63_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
	public static int method1479(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIZI)Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 method1480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(21) long local21 = ((long) arg2 << 40) + ((long) arg4 << 38) + ((long) arg0 << 16) + (long) arg1;
		@Pc(29) Class5_Sub2_Sub6_Sub3 local29;
		if (!arg3) {
			local29 = (Class5_Sub2_Sub6_Sub3) Static19.aClass67_6.method1823(local21);
			if (local29 != null) {
				return local29;
			}
		}
		@Pc(39) Class5_Sub2_Sub3 local39 = Static81.method1515(arg1);
		if (arg0 > 1 && local39.anIntArray30 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (local39.anIntArray29[local51] <= arg0 && local39.anIntArray29[local51] != 0) {
					local49 = local39.anIntArray30[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static81.method1515(local49);
			}
		}
		@Pc(86) Class5_Sub2_Sub4_Sub2 local86 = local39.method160(1);
		if (local86 == null) {
			return null;
		}
		@Pc(92) Class5_Sub2_Sub6_Sub3 local92 = null;
		if (local39.anInt275 != -1) {
			local92 = method1480(10, local39.anInt232, 0, true, 1);
			if (local92 == null) {
				return null;
			}
		}
		@Pc(112) int[] local112 = Static118.anIntArray414;
		@Pc(114) int local114 = Static118.anInt2722;
		@Pc(116) int local116 = Static118.anInt2725;
		@Pc(118) int local118 = Static118.anInt2721;
		@Pc(120) int local120 = Static118.anInt2724;
		@Pc(122) int local122 = Static118.anInt2723;
		@Pc(124) int local124 = Static118.anInt2720;
		@Pc(126) int[] local126 = Static86.method1669();
		@Pc(128) int local128 = Static86.anInt2476;
		@Pc(130) int local130 = Static86.anInt2473;
		local29 = new Class5_Sub2_Sub6_Sub3(36, 32);
		Static118.method1859(local29.anIntArray377, 36, 32);
		Static42.anIntArray133 = Static86.method1661(Static42.anIntArray133);
		Static118.method1858(0, 0, 36, 32, 0);
		Static86.aBoolean112 = false;
		Static86.method1673(16, 16);
		@Pc(158) int local158 = local39.anInt237;
		if (arg3) {
			local158 = (int) ((double) local158 * 1.5D);
		} else if (arg4 == 2) {
			local158 = (int) ((double) local158 * 1.04D);
		}
		@Pc(185) int local185 = Class5_Sub2_Sub6_Sub2.anIntArray362[local39.anInt246] * local158 >> 16;
		@Pc(194) int local194 = Class5_Sub2_Sub6_Sub2.anIntArray360[local39.anInt246] * local158 >> 16;
		local86.method419();
		local86.method429(local39.anInt269, local39.anInt253, local39.anInt246, local39.anInt270, local86.anInt2379 / 2 + local194 + local39.anInt249, local185 - -local39.anInt249);
		if (arg4 >= 1) {
			local29.method1760(1);
		}
		if (arg4 >= 2) {
			local29.method1760(16777215);
		}
		if (arg2 != 0) {
			local29.method1764(arg2);
		}
		Static118.method1859(local29.anIntArray377, 36, 32);
		if (local39.anInt275 != -1) {
			local92.method1781(0, 0);
		}
		if (!arg3 && (local39.anInt268 == 1 || arg0 != 1) && arg0 != -1) {
			Static30.aClass5_Sub2_Sub6_Sub1_3.method506(Static61.method1223(arg0), 1, 10, 1);
			Static30.aClass5_Sub2_Sub6_Sub1_3.method506(Static61.method1223(arg0), 0, 9, 16776960);
		}
		if (!arg3) {
			Static19.aClass67_6.method1818(local29, local21);
		}
		Static118.method1859(local112, local114, local116);
		Static118.method1869(local118, local120, local122, local124);
		Static86.method1661(local126);
		Static86.anInt2473 = local130;
		Static86.anInt2476 = local128;
		Static86.method1671();
		Static86.aBoolean112 = true;
		return local29;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1481() {
		aClass45_919 = null;
		aClass45_918 = null;
		aClass45_917 = null;
		aClass45_920 = null;
		aClass5_Sub2_Sub8_4 = null;
		aClass29_Sub1_33 = null;
		aClass29_51 = null;
		aClass45_916 = null;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method1482() {
		Static54.aClass5_Sub7_Sub4_3.method2052();
		Static47.aClass29_31 = null;
		Static45.anInt1317 = 1;
	}
}
