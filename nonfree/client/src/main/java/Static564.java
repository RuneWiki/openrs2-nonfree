import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "F")
	public static float aFloat189 = 0.25F;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	public static void method7257() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static306.aClass100ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static306.aClass100ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static173.anInt3719; local6++) {
					for (local9 = 0; local9 < Static357.anInt6212; local9++) {
						if (Static306.aClass100ArrayArrayArray1[local3][local6][local9] != null) {
							Static306.aClass100ArrayArrayArray1[local3][local6][local9].method2807();
						}
						Static306.aClass100ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static306.aClass100ArrayArrayArray1 = null;
		Static45.aClass16Array1 = null;
		if (Static391.aClass100ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static391.aClass100ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static173.anInt3719; local6++) {
					for (local9 = 0; local9 < Static357.anInt6212; local9++) {
						if (Static391.aClass100ArrayArrayArray3[local3][local6][local9] != null) {
							Static391.aClass100ArrayArrayArray3[local3][local6][local9].method2807();
						}
						Static391.aClass100ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static391.aClass100ArrayArrayArray3 = null;
		Static109.aClass16Array2 = null;
		Static309.aClass100ArrayArrayArray2 = null;
		Static112.aClass16Array3 = null;
		Static115.anInt2689 = 0;
		if (Static465.aClass125Array2 != null) {
			for (local3 = 0; local3 < Static115.anInt2689; local3++) {
				Static465.aClass125Array2[local3] = null;
			}
		}
		if (Static463.aClass10_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static593.anInt9755; local3++) {
				Static463.aClass10_Sub1Array3[local3] = null;
			}
			Static593.anInt9755 = 0;
		}
		if (Static22.aClass32Array1 != null) {
			for (local3 = 0; local3 < Static413.anInt7145; local3++) {
				Static22.aClass32Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static562.anInt9418; local6++) {
				for (local9 = 0; local9 < Static173.anInt3719; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static357.anInt6212; local160++) {
						Static348.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static413.anInt7145 = 0;
		}
		Static327.anIntArrayArrayArray21 = null;
		Static421.method7827();
		Static350.aClass8_4.method106();
		Static68.aByteArrayArray6 = null;
		Static577.anIntArrayArray78 = null;
		Static310.aShortArrayArray23 = null;
		Static146.aClass40_1 = null;
		Static203.aClass134_5 = null;
		Static474.aClass66_8 = null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
	public static boolean method7258(@OriginalArg(1) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(48) char local48 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local48 == '-') {
					local24 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local48 >= '0' && local48 <= '9') {
				local75 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local75 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local75 = local48 - 'W';
			} else {
				return false;
			}
			if (local75 >= 10) {
				return false;
			}
			if (local24) {
				local75 = -local75;
			}
			@Pc(117) int local117 = local75 + local28 * 10;
			if (local117 / 10 != local28) {
				return false;
			}
			local26 = true;
			local28 = local117;
		}
		return local26;
	}
}
