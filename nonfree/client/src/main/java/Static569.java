import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
	public static int anInt7644 = -1;

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "Lclient!mo;")
	public static Class221 aClass221_27 = new Class221(8);

	@OriginalMember(owner = "client!vu", name = "z", descriptor = "[Lclient!hea;")
	public static final Class4_Sub6_Sub8[] aClass4_Sub6_Sub8Array5 = new Class4_Sub6_Sub8[14];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public static void method5999() {
		for (@Pc(11) Class4_Sub36 local11 = (Class4_Sub36) Static593.aClass22_65.method895(); local11 != null; local11 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			if (Static210.method8155(local11.anInt7137)) {
				Static59.method1362(local11);
			}
		}
		if (Static384.anInt7556 == 1) {
			Static221.method954();
			return;
		}
		Static430.method6395(Static593.anInt10604, Static303.anInt6098, Static469.anInt8895, Static340.anInt6537);
		@Pc(53) int local53 = Static503.aClass198_12.method4769(Static223.aClass152_28.method3624(Static142.anInt3088));
		for (@Pc(60) Class4_Sub36 local60 = (Class4_Sub36) Static593.aClass22_65.method895(); local60 != null; local60 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			@Pc(66) int local66 = Static67.method1483(local60);
			if (local66 > local53) {
				local53 = local66;
			}
		}
		Static340.anInt6537 = Static384.anInt7556 * 16 + (Static70.aBoolean150 ? 26 : 22);
		Static303.anInt6098 = local53 + 8;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZZ)I")
	public static int method6000(@OriginalArg(1) boolean arg0) {
		if (Static459.anIntArray457 == null) {
			return 0;
		} else if (arg0 || Static144.aClass279Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static459.anIntArray457.length; local27++) {
				@Pc(33) int local33 = Static459.anIntArray457[local27];
				if (Static1.aClass348_53.method7960(local33)) {
					local20++;
				}
				if (Static386.aClass348_93.method7960(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static459.anIntArray457.length * 2;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)Lclient!ufa;")
	public static Class21_Sub1_Sub1_Sub1 method6001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class182 local11 = Static571.aClass182ArrayArrayArray3[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class21_Sub1_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class192 local22 = local11.aClass192_2; local22 != null; local22 = local22.aClass192_3) {
			@Pc(26) Class21_Sub1_Sub1 local26 = local22.aClass21_Sub1_Sub1_1;
			if (local26 instanceof Class21_Sub1_Sub1_Sub1) {
				@Pc(32) Class21_Sub1_Sub1_Sub1 local32 = (Class21_Sub1_Sub1_Sub1) local26;
				@Pc(44) int local44 = (local32.method3339() - 1) * 256 + 252;
				@Pc(51) int local51 = local32.anInt10551 - local44 >> 9;
				@Pc(59) int local59 = local32.anInt10550 - local44 >> 9;
				@Pc(67) int local67 = local32.anInt10551 + local44 >> 9;
				@Pc(74) int local74 = local44 + local32.anInt10550 >> 9;
				if (local51 <= arg2 && local59 <= arg1 && arg2 <= local67 && local74 >= arg1) {
					@Pc(108) int local108 = (local74 + 1 - arg1) * (-arg2 + (local67 - -1));
					if (local108 > local19) {
						local17 = local32;
						local19 = local108;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIB)V")
	public static void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static189.aFloat83 = local15;
		if (Static300.anInt6053 == 2) {
			Static233.anInt4905 = local3;
			Static470.anInt8934 = 0;
			Static353.anInt6831 = local15;
		}
		Static155.aFloat73 = local3;
		Static424.method6349();
		Static521.aBoolean651 = true;
	}
}
