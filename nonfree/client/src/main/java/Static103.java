import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "Lclient!kh;")
	public static Class29 aClass29_45;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1033 = Static51.method932("Lade Sprites )2 ");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBI)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static162.anIntArrayArrayArray8[arg2][arg1 + local11][local15 + arg0] = 0;
			}
		}
		if (arg1 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static162.anIntArrayArrayArray8[arg2][arg1][arg0 + local15] = Static162.anIntArrayArrayArray8[arg2][arg1 - 1][local15 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static162.anIntArrayArrayArray8[arg2][arg1 + local15][arg0] = Static162.anIntArrayArrayArray8[arg2][arg1 + local15][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static162.anIntArrayArrayArray8[arg2][arg1 - 1][arg0] != 0) {
			Static162.anIntArrayArrayArray8[arg2][arg1][arg0] = Static162.anIntArrayArrayArray8[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static162.anIntArrayArrayArray8[arg2][arg1][arg0 - 1] != 0) {
			Static162.anIntArrayArrayArray8[arg2][arg1][arg0] = Static162.anIntArrayArrayArray8[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static162.anIntArrayArrayArray8[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static162.anIntArrayArrayArray8[arg2][arg1][arg0] = Static162.anIntArrayArrayArray8[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	public static void method1680() {
		aClass29_45 = null;
		aClass10_1033 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!va;Lclient!pc;IB)V")
	public static void method1682(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class2_Sub23 local13 = new Class2_Sub23();
		local13.anInt3341 = arg0.method1461();
		local13.anInt3338 = arg0.method1449();
		local13.aClass15Array1 = new Class15[local13.anInt3341];
		local13.anIntArray357 = new int[local13.anInt3341];
		local13.anIntArray356 = new int[local13.anInt3341];
		local13.aClass15Array2 = new Class15[local13.anInt3341];
		local13.anIntArray355 = new int[local13.anInt3341];
		local13.aByteArrayArrayArray10 = new byte[local13.anInt3341][][];
		for (@Pc(59) int local59 = 0; local59 < local13.anInt3341; local59++) {
			try {
				@Pc(65) int local65 = arg0.method1461();
				@Pc(84) String local84;
				@Pc(93) String local93;
				@Pc(75) int local75;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local75 = 0;
					local84 = new String(arg0.method1452().method359());
					local93 = new String(arg0.method1452().method359());
					if (local65 == 1) {
						local75 = arg0.method1449();
					}
					local13.anIntArray357[local59] = local65;
					local13.anIntArray355[local59] = local75;
					local13.aClass15Array2[local59] = arg1.method1958(Static5.method87(local84), local93);
				} else if (local65 == 3 || local65 == 4) {
					local84 = new String(arg0.method1452().method359());
					local93 = new String(arg0.method1452().method359());
					local75 = arg0.method1461();
					@Pc(158) String[] local158 = new String[local75];
					for (@Pc(160) int local160 = 0; local160 < local75; local160++) {
						local158[local160] = new String(arg0.method1452().method359());
					}
					@Pc(184) byte[][] local184 = new byte[local75][];
					@Pc(197) int local197;
					if (local65 == 3) {
						for (@Pc(191) int local191 = 0; local191 < local75; local191++) {
							local197 = arg0.method1449();
							local184[local191] = new byte[local197];
							arg0.method1473(local197, local184[local191]);
						}
					}
					local13.anIntArray357[local59] = local65;
					@Pc(226) Class[] local226 = new Class[local75];
					for (local197 = 0; local197 < local75; local197++) {
						local226[local197] = Static5.method87(local158[local197]);
					}
					local13.aClass15Array1[local59] = arg1.method1955(local93, Static5.method87(local84), local226);
					local13.aByteArrayArrayArray10[local59] = local184;
				}
			} catch (@Pc(261) ClassNotFoundException local261) {
				local13.anIntArray356[local59] = -1;
			} catch (@Pc(268) SecurityException local268) {
				local13.anIntArray356[local59] = -2;
			} catch (@Pc(275) NullPointerException local275) {
				local13.anIntArray356[local59] = -3;
			} catch (@Pc(282) Exception local282) {
				local13.anIntArray356[local59] = -4;
			} catch (@Pc(289) Throwable local289) {
				local13.anIntArray356[local59] = -5;
			}
		}
		Static10.aClass12_1.method382(local13);
	}
}
