import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public static int anInt4100;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!ct;")
	public static Class30 aClass30_60;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
	public static int anInt4105;

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array10;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_140 = new Class106("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method3811() {
		@Pc(13) Class21 local13 = Static14.aClass21_133;
		synchronized (Static14.aClass21_133) {
			Static14.aClass21_133.method857();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public static void method3813(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 7);
		local8.method3481();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ct;Lclient!ct;I)V")
	public static void method3816(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		Static320.aClass30_66 = arg1;
		Static83.aClass30_22 = arg0;
		Static83.aClass30_22.method1180(34);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)Z")
	public static boolean method3817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static217.aBoolean322) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static341.aClass112ArrayArray1[local18] == null || Static341.aClass112ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class112 local40 = Static341.aClass112ArrayArray1[local18][local22];
		@Pc(51) Class1_Sub22 local51;
		if (arg0 == -1 && local40.anInt3373 == 0) {
			for (local51 = (Class1_Sub22) Static317.aClass42_43.method1543(); local51 != null; local51 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
				if (local51.anInt2822 == 2 || local51.anInt2822 == 1004 || local51.anInt2822 == 57 || local51.anInt2822 == 13 || local51.anInt2822 == 50) {
					for (@Pc(143) Class112 local143 = Static188.method3536(local51.anInt2821); local143 != null; local143 = Static131.method2690(local143)) {
						if (local143.anInt3376 == local40.anInt3376) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class1_Sub22) Static317.aClass42_43.method1543(); local51 != null; local51 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
				if (arg0 == local51.anInt2828 && local40.anInt3376 == local51.anInt2821 && (local51.anInt2822 == 2 || local51.anInt2822 == 1004 || local51.anInt2822 == 57 || local51.anInt2822 == 13 || local51.anInt2822 == 50)) {
					return true;
				}
			}
		}
		return false;
	}
}
