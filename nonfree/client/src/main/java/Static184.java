import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!sb;")
	public static Class77 aClass77_106;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt4144;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1516 = Static177.method3050("Please enter your username)3");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1517 = Static177.method3050("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1518 = aClass46_1516;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1519 = Static177.method3050("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1520 = Static177.method3050(" GMT");

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt4142 = 1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method3169(@OriginalArg(0) int arg0) {
		Static172.anInt3876 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static57.anInt1408; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static84.anInt4112; local6++) {
				if (Static28.aClass4_Sub7ArrayArrayArray1[arg0][local3][local6] == null) {
					Static28.aClass4_Sub7ArrayArrayArray1[arg0][local3][local6] = new Class4_Sub7(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public static void method3171() {
		for (@Pc(8) int local8 = 0; local8 < Static87.anInt2219; local8++) {
			@Pc(14) int local14 = Static35.anIntArray82[local8];
			@Pc(18) Class4_Sub1_Sub1_Sub1_Sub2 local18 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local14];
			if (local18 != null) {
				Static45.method758(local18, local18.aClass4_Sub1_Sub11_1.anInt2251);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public static void method3172() {
		Static25.aClass20_1 = new Class20(32);
	}
}
