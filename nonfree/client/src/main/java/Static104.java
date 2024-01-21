import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	public static int anInt2384;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1039 = Static51.method932("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1040 = aClass10_1039;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1041 = Static51.method932(" loggt sich aus)3");

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1042 = Static51.method932(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1043 = Static51.method932("headicons_prayer");

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	public static void method1687() {
		Static97.anInt2273 = 0;
		Static94.anInt2248 = 0;
		Static33.method673();
		Static124.method2000();
		Static63.method1122();
		Static53.method958();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static94.anInt2248; local25++) {
			local31 = Static53.anIntArray144[local25];
			if (Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local31].anInt3491 != Static14.anInt386) {
				Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local31] = null;
			}
		}
		if (Static174.anInt3743 != Static75.aClass2_Sub11_Sub1_1.anInt2077) {
			throw new RuntimeException("gpp1 pos:" + Static75.aClass2_Sub11_Sub1_1.anInt2077 + " psize:" + Static174.anInt3743);
		}
		for (local31 = 0; local31 < Static54.anInt1354; local31++) {
			if (Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local31]] == null) {
				throw new RuntimeException("gpp2 pos:" + local31 + " size:" + Static54.anInt1354);
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method1688(@OriginalArg(1) Class29 arg0) {
		Static111.aClass29_50 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
	public static void method1689(@OriginalArg(1) boolean arg0) {
		if (Static58.aClass34_2 == null) {
			return;
		}
		try {
			@Pc(16) Class2_Sub11 local16 = new Class2_Sub11(4);
			local16.method1439(arg0 ? 2 : 3);
			local16.method1478(0);
			Static58.aClass34_2.method1130(4, local16.aByteArray24);
		} catch (@Pc(37) IOException local37) {
			try {
				Static58.aClass34_2.method1136();
			} catch (@Pc(42) Exception local42) {
			}
			Static58.aClass34_2 = null;
			Static36.anInt926++;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	public static void method1690() {
		aClass10_1040 = null;
		aClass10_1039 = null;
		aClass10_1042 = null;
		aClass10_1043 = null;
		aClass10_1041 = null;
	}
}
