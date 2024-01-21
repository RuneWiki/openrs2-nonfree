import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!h;")
	public static Class2_Sub7_Sub1 aClass2_Sub7_Sub1_1;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_639 = Static158.method3034("Welt");

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)Z")
	public static boolean method1881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(35) Class2_Sub1_Sub9 local35 = Static158.method3037(arg1);
		return local35.method1260(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!pe;)[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] method1883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		return Static52.method1229(arg0, arg2, arg1) ? Static44.method973() : null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!og;B)V")
	public static void method1884(@OriginalArg(0) Class2_Sub3 arg0) {
		if (Static148.aClass40_4 != null) {
			try {
				Static148.aClass40_4.method1928(0L);
				Static148.aClass40_4.method1918(arg0.aByteArray4, arg0.anInt273, 24);
			} catch (@Pc(26) Exception local26) {
			}
		}
		arg0.anInt273 += 24;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIII)Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 method1885(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg4 << 40) + ((long) arg0 << 38) + ((long) arg3 << 16) + (long) arg2;
		@Pc(31) Class2_Sub1_Sub7_Sub4 local31;
		if (!arg1) {
			local31 = (Class2_Sub1_Sub7_Sub4) Static87.aClass89_30.method3437(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class2_Sub1_Sub8 local39 = Static88.method2046(arg2);
		if (arg3 > 1 && local39.anIntArray147 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg3 >= local39.anIntArray146[local51] && local39.anIntArray146[local51] != 0) {
					local49 = local39.anIntArray147[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static88.method2046(local49);
			}
		}
		@Pc(88) Class2_Sub1_Sub1_Sub4_Sub1 local88 = local39.method1154();
		if (local88 == null) {
			return null;
		}
		@Pc(94) Class2_Sub1_Sub7_Sub4 local94 = null;
		if (local39.anInt1538 != -1) {
			local94 = method1885(1, true, local39.anInt1533, 10, 0);
			if (local94 == null) {
				return null;
			}
		}
		@Pc(113) int[] local113 = Static133.anIntArray309;
		@Pc(115) int local115 = Static133.anInt2685;
		@Pc(117) int local117 = Static133.anInt2688;
		@Pc(120) int[] local120 = new int[4];
		Static133.method2114(local120);
		local31 = new Class2_Sub1_Sub7_Sub4(36, 32);
		Static133.method2121(local31.anIntArray310, 36, 32);
		Static133.method2116();
		Static45.method1048();
		Static45.method1058(16, 16);
		@Pc(147) int local147 = local39.anInt1527;
		Static45.aBoolean52 = false;
		if (arg1) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg0 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(179) int local179 = Class2_Sub1_Sub7_Sub1.anIntArray133[local39.anInt1556] * local147 >> 16;
		@Pc(188) int local188 = Class2_Sub1_Sub7_Sub1.anIntArray129[local39.anInt1556] * local147 >> 16;
		local88.method1614(local39.anInt1547, local39.anInt1557, local39.anInt1556, local39.anInt1553, local179 + local39.anInt1529 - local88.method3179() / 2, local188 - -local39.anInt1529);
		if (arg0 >= 1) {
			local31.method2130(1);
		}
		if (arg0 >= 2) {
			local31.method2130(16777215);
		}
		if (arg4 != 0) {
			local31.method2141(arg4);
		}
		Static133.method2121(local31.anIntArray310, 36, 32);
		if (local94 != null) {
			local94.method2151(0, 0);
		}
		if (!arg1 && (local39.anInt1535 == 1 || arg3 != 1) && arg3 != -1) {
			Static136.aClass2_Sub1_Sub7_Sub3_Sub1_4.method1786(Static186.method3433(arg3), 0, 9, 16776960, 1);
		}
		if (!arg1) {
			Static87.aClass89_30.method3432(local31, local23);
		}
		Static133.method2121(local113, local115, local117);
		Static133.method2113(local120);
		Static45.method1048();
		Static45.aBoolean52 = true;
		return local31;
	}
}
