import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!re", name = "T", descriptor = "Lclient!ag;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	public static int anInt4493 = 0;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!vd;")
	public static Class140 aClass140_12 = new Class140(16);

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public static void method3392(@OriginalArg(1) int arg0) {
		Static206.anInt4549 = -1;
		if (arg0 == 37) {
			Static17.aFloat3 = 3.0F;
		} else if (arg0 == 50) {
			Static17.aFloat3 = 4.0F;
		} else if (arg0 == 75) {
			Static17.aFloat3 = 6.0F;
		} else if (arg0 == 100) {
			Static17.aFloat3 = 8.0F;
		} else if (arg0 == 200) {
			Static17.aFloat3 = 16.0F;
		}
		Static206.anInt4549 = -1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3393(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static167.anInt3911; local16++) {
			if (arg0.equalsIgnoreCase(Static226.aStringArray37[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!d;Lclient!ql;ZI)V")
	public static void method3394(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub1 local9 = new Class1_Sub1();
		local9.anInt22 = arg1.method1772();
		local9.anInt27 = arg1.method1802();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt22][][];
		local9.aClass145Array1 = new Class145[local9.anInt22];
		local9.anIntArray1 = new int[local9.anInt22];
		local9.anIntArray2 = new int[local9.anInt22];
		local9.aClass145Array2 = new Class145[local9.anInt22];
		local9.anIntArray4 = new int[local9.anInt22];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt22; local55++) {
			try {
				@Pc(61) int local61 = arg1.method1772();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(75) int local75;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local75 = 0;
					local79 = arg1.method1774();
					local83 = arg1.method1774();
					if (local61 == 1) {
						local75 = arg1.method1802();
					}
					local9.anIntArray2[local55] = local61;
					local9.anIntArray1[local55] = local75;
					local9.aClass145Array1[local55] = arg0.method720(Static129.method2458(local79), local83);
				} else if (local61 == 3 || local61 == 4) {
					local79 = arg1.method1774();
					local83 = arg1.method1774();
					local75 = arg1.method1772();
					@Pc(138) String[] local138 = new String[local75];
					for (@Pc(140) int local140 = 0; local140 < local75; local140++) {
						local138[local140] = arg1.method1774();
					}
					@Pc(159) byte[][] local159 = new byte[local75][];
					@Pc(170) int local170;
					if (local61 == 3) {
						for (@Pc(164) int local164 = 0; local164 < local75; local164++) {
							local170 = arg1.method1802();
							local159[local164] = new byte[local170];
							arg1.method1787(local170, local159[local164]);
						}
					}
					local9.anIntArray2[local55] = local61;
					@Pc(195) Class[] local195 = new Class[local75];
					for (local170 = 0; local170 < local75; local170++) {
						local195[local170] = Static129.method2458(local138[local170]);
					}
					local9.aClass145Array2[local55] = arg0.method717(Static129.method2458(local79), local195, local83);
					local9.aByteArrayArrayArray1[local55] = local159;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local9.anIntArray4[local55] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local9.anIntArray4[local55] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local9.anIntArray4[local55] = -3;
			} catch (@Pc(255) Exception local255) {
				local9.anIntArray4[local55] = -4;
			} catch (@Pc(262) Throwable local262) {
				local9.anIntArray4[local55] = -5;
			}
		}
		Static89.aClass3_11.method28(local9);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZI)V")
	public static void method3395(@OriginalArg(2) boolean arg0) {
		Static121.aBoolean167 = arg0;
		Static231.anInt5057 = 2;
		Static107.anInt2862 = 22050;
	}
}
