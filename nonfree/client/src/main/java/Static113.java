import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Lclient!tb;")
	public static Class6_Sub40 aClass6_Sub40_1;

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_32 = new Class267("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	public static void method1983() {
		if (Static414.anInt7038 == 0) {
			return;
		}
		try {
			if (++Static172.anInt3437 > 1500) {
				if (Static177.aClass73_6 != null) {
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
				}
				if (Static331.anInt5769 >= 1) {
					Static107.anInt2300 = -5;
					Static414.anInt7038 = 0;
					return;
				}
				Static172.anInt3437 = 0;
				if (Static46.anInt1238 == Static426.anInt7595) {
					Static426.anInt7595 = Static135.anInt2875;
				} else {
					Static426.anInt7595 = Static46.anInt1238;
				}
				Static331.anInt5769++;
				Static414.anInt7038 = 1;
			}
			if (Static414.anInt7038 == 1) {
				Static294.aClass122_6 = Static45.aClass209_127.method4688(Static426.anInt7595, Static338.aString48);
				Static414.anInt7038 = 2;
			}
			@Pc(106) int local106;
			if (Static414.anInt7038 == 2) {
				if (Static294.aClass122_6.anInt3557 == 2) {
					throw new IOException();
				}
				if (Static294.aClass122_6.anInt3557 != 1) {
					return;
				}
				Static177.aClass73_6 = new Class73((Socket) Static294.aClass122_6.anObject7, Static45.aClass209_127);
				Static294.aClass122_6 = null;
				Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static141.method1127();
				local106 = Static177.aClass73_6.method1874();
				Static141.method1127();
				if (local106 != 101) {
					Static107.anInt2300 = local106;
					Static414.anInt7038 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
					return;
				}
				Static414.anInt7038 = 3;
			}
			if (Static414.anInt7038 == 3 && Static177.aClass73_6.method1872() >= 2) {
				local106 = Static177.aClass73_6.method1874() << 8 | Static177.aClass73_6.method1874();
				Static388.method5715(local106);
				if (Static118.anInt2485 == -1) {
					Static107.anInt2300 = 6;
					Static414.anInt7038 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
				} else {
					Static414.anInt7038 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
					Static293.method297();
				}
			}
		} catch (@Pc(181) IOException local181) {
			if (Static177.aClass73_6 != null) {
				Static177.aClass73_6.method1875();
				Static177.aClass73_6 = null;
			}
			if (Static331.anInt5769 < 1) {
				Static331.anInt5769++;
				Static172.anInt3437 = 0;
				Static414.anInt7038 = 1;
				if (Static46.anInt1238 == Static426.anInt7595) {
					Static426.anInt7595 = Static135.anInt2875;
				} else {
					Static426.anInt7595 = Static46.anInt1238;
				}
			} else {
				Static414.anInt7038 = 0;
				Static107.anInt2300 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)I")
	public static int method1985(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
