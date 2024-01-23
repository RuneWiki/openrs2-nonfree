import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	public static int anInt3267;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V")
	public static void method2820() {
		Static295.aClass175_42.method4287();
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(III)Z")
	public static boolean method2821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static91.aBoolean183) {
			return false;
		}
		@Pc(14) int local14 = arg1 >> 16;
		@Pc(18) int local18 = arg1 & 0xFFFF;
		if (Static176.aClass157ArrayArray1[local14] == null || Static176.aClass157ArrayArray1[local14][local18] == null) {
			return false;
		}
		@Pc(38) Class157 local38 = Static176.aClass157ArrayArray1[local14][local18];
		@Pc(51) int local51;
		if (arg0 == -1 && local38.anInt4748 == 0) {
			for (local51 = 0; local51 < Static241.anInt4470; local51++) {
				if (Static94.aShortArray46[local51] == 49 || Static94.aShortArray46[local51] == 1004 || Static94.aShortArray46[local51] == 28 || Static94.aShortArray46[local51] == 16 || Static94.aShortArray46[local51] == 33) {
					for (@Pc(92) Class157 local92 = Static206.method3444(Static195.anIntArray409[local51]); local92 != null; local92 = Static145.method2516(local92)) {
						if (local92.anInt4672 == local38.anInt4672) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < Static241.anInt4470; local51++) {
				if (Static266.anIntArray551[local51] == arg0 && local38.anInt4672 == Static195.anIntArray409[local51] && (Static94.aShortArray46[local51] == 49 || Static94.aShortArray46[local51] == 1004 || Static94.aShortArray46[local51] == 28 || Static94.aShortArray46[local51] == 16 || Static94.aShortArray46[local51] == 33)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(B)V")
	public static void method2822() {
		for (@Pc(14) Class1_Sub5_Sub24 local14 = (Class1_Sub5_Sub24) Static18.aClass96_1.method2340(); local14 != null; local14 = (Class1_Sub5_Sub24) Static18.aClass96_1.method2342()) {
			@Pc(20) Class11_Sub3 local20 = local14.aClass11_Sub3_1;
			if (Static132.anInt2608 != local20.anInt1825 || local20.anInt1809 < Static167.anInt637) {
				local14.method4573();
			} else if (Static167.anInt637 >= local20.anInt1817) {
				if (local20.anInt1806 > 0) {
					@Pc(43) Class11_Sub4_Sub2 local43 = Static138.aClass11_Sub4_Sub2Array2[local20.anInt1806 - 1];
					if (local43 != null && local43.anInt3865 >= 0 && local43.anInt3865 < 13312 && local43.anInt3856 >= 0 && local43.anInt3856 < 13312) {
						local20.method1683(local43.anInt3856, Static42.method768(local43.anInt3865, local20.anInt1825, local43.anInt3856) - local20.anInt1828, Static167.anInt637, local43.anInt3865);
					}
				}
				if (local20.anInt1806 < 0) {
					@Pc(99) int local99 = -local20.anInt1806 - 1;
					@Pc(104) Class11_Sub4_Sub1 local104;
					if (Static68.anInt1471 == local99) {
						local104 = Static138.aClass11_Sub4_Sub1_3;
					} else {
						local104 = Static14.aClass11_Sub4_Sub1Array1[local99];
					}
					if (local104 != null && local104.anInt3865 >= 0 && local104.anInt3865 < 13312 && local104.anInt3856 >= 0 && local104.anInt3856 < 13312) {
						local20.method1683(local104.anInt3856, Static42.method768(local104.anInt3865, local20.anInt1825, local104.anInt3856) - local20.anInt1828, Static167.anInt637, local104.anInt3865);
					}
				}
				local20.method1684(Static38.anInt722);
				Static168.method2837(Static132.anInt2608, (int) local20.aDouble7, (int) local20.aDouble6, (int) local20.aDouble3, 60, local20, local20.anInt1816, -1L, false);
			}
		}
	}
}
