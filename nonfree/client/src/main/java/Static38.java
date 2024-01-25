import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!to;")
	public static Class197[] aClass197Array1;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public static int anInt832;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!qk;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!am;")
	public static Class11 aClass11_14;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static final int[] anIntArray104 = new int[4096];

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt830 = 0;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!uc;")
	public static Class198 aClass198_5 = new Class198(8);

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public static int anInt833 = 0;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Loading - please wait.";

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method721() {
		for (@Pc(10) int local10 = -1; local10 < Static156.anInt3506; local10++) {
			@Pc(20) int local20;
			if (local10 == -1) {
				local20 = 2047;
			} else {
				local20 = Static39.anIntArray105[local10];
			}
			@Pc(28) Class2_Sub2_Sub1_Sub1 local28 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local20];
			if (local28 != null) {
				Static145.method2848(local28, local28.method5425());
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBC)I")
	public static int method722(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lh;BLclient!tq;I)V")
	public static void method723(@OriginalArg(0) Class120 arg0, @OriginalArg(2) Class4_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub23 local9 = new Class4_Sub23();
		local9.anInt3196 = arg1.method2380();
		local9.anInt3197 = arg1.method2389();
		local9.aByteArrayArrayArray5 = new byte[local9.anInt3196][][];
		local9.aClass51Array2 = new Class51[local9.anInt3196];
		local9.aClass51Array1 = new Class51[local9.anInt3196];
		local9.anIntArray287 = new int[local9.anInt3196];
		local9.anIntArray285 = new int[local9.anInt3196];
		local9.anIntArray286 = new int[local9.anInt3196];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3196; local51++) {
			try {
				@Pc(57) int local57 = arg1.method2380();
				@Pc(69) String local69;
				@Pc(73) String local73;
				@Pc(75) int local75;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local69 = arg1.method2379();
					local73 = arg1.method2379();
					local75 = 0;
					if (local57 == 1) {
						local75 = arg1.method2389();
					}
					local9.anIntArray285[local51] = local57;
					local9.anIntArray286[local51] = local75;
					local9.aClass51Array1[local51] = arg0.method3242(Static221.method3808(local69), local73);
				} else if (local57 == 3 || local57 == 4) {
					local69 = arg1.method2379();
					local73 = arg1.method2379();
					local75 = arg1.method2380();
					@Pc(136) String[] local136 = new String[local75];
					for (@Pc(138) int local138 = 0; local138 < local75; local138++) {
						local136[local138] = arg1.method2379();
					}
					@Pc(155) byte[][] local155 = new byte[local75][];
					@Pc(170) int local170;
					if (local57 == 3) {
						for (@Pc(162) int local162 = 0; local162 < local75; local162++) {
							local170 = arg1.method2389();
							local155[local162] = new byte[local170];
							arg1.method2381(local155[local162], local170);
						}
					}
					local9.anIntArray285[local51] = local57;
					@Pc(199) Class[] local199 = new Class[local75];
					for (local170 = 0; local170 < local75; local170++) {
						local199[local170] = Static221.method3808(local136[local170]);
					}
					local9.aClass51Array2[local51] = arg0.method3220(local73, local199, Static221.method3808(local69));
					local9.aByteArrayArrayArray5[local51] = local155;
				}
			} catch (@Pc(244) ClassNotFoundException local244) {
				local9.anIntArray287[local51] = -1;
			} catch (@Pc(251) SecurityException local251) {
				local9.anIntArray287[local51] = -2;
			} catch (@Pc(258) NullPointerException local258) {
				local9.anIntArray287[local51] = -3;
			} catch (@Pc(265) Exception local265) {
				local9.anIntArray287[local51] = -4;
			} catch (@Pc(272) Throwable local272) {
				local9.anIntArray287[local51] = -5;
			}
		}
		Static251.aClass130_114.method3510(local9);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBI)Lclient!ml;")
	public static Class4_Sub1_Sub13 method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg0 << 8;
		@Pc(18) Class4_Sub1_Sub13 local18 = (Class4_Sub1_Sub13) Static205.aClass15_8.method356((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static54.aClass11_21.method300(Static54.aClass11_21.method297(local9));
		if (local30 == null) {
			local9 = arg1 + 65536 << 8 | arg2;
			local18 = (Class4_Sub1_Sub13) Static205.aClass15_8.method356((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static54.aClass11_21.method300(Static54.aClass11_21.method297(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class4_Sub1_Sub13) Static205.aClass15_8.method356((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static54.aClass11_21.method300(Static54.aClass11_21.method297(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static116.method860(local30);
					local18.anInt4197 = arg2;
					Static205.aClass15_8.method352((long) local9 << 16, local18);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static116.method860(local30);
				local18.anInt4197 = arg2;
				Static205.aClass15_8.method352((long) local9 << 16, local18);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static116.method860(local30);
			local18.anInt4197 = arg2;
			Static205.aClass15_8.method352((long) local9 << 16, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBII)V")
	public static void method726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static186.anInt5635 = arg2;
		Static167.anInt3730 = arg1;
		Static311.anInt6247 = arg3;
		Static316.anInt5500 = arg0;
	}
}
