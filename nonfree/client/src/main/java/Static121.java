import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_28;

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
	public static int anInt2809 = 0;

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1647 = Static106.method1849("Mitglieder)2Welt");

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1648 = Static106.method1849("b12_full");

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1649 = Static106.method1849("<img=0>");

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
	public static int anInt2820 = 0;

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[B")
	public static byte[] aByteArray40 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!v", name = "sb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1650 = Static106.method1849("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BB)V")
	public static void method1987(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class1_Sub12 local6 = new Class1_Sub12(arg0);
		local6.anInt1694 = arg0.length - 2;
		Static35.anInt869 = local6.method1176();
		Static14.anIntArray80 = new int[Static35.anInt869];
		Static99.anIntArray181 = new int[Static35.anInt869];
		Static28.anIntArray105 = new int[Static35.anInt869];
		Static125.anIntArray493 = new int[Static35.anInt869];
		Static29.aByteArrayArray2 = new byte[Static35.anInt869][];
		local6.anInt1694 = arg0.length - Static35.anInt869 * 8 - 7;
		Static98.anInt2486 = local6.method1176();
		Static48.anInt1502 = local6.method1176();
		@Pc(62) int local62 = (local6.method1190() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static35.anInt869; local64++) {
			Static99.anIntArray181[local64] = local6.method1176();
		}
		for (@Pc(78) int local78 = 0; local78 < Static35.anInt869; local78++) {
			Static28.anIntArray105[local78] = local6.method1176();
		}
		for (@Pc(98) int local98 = 0; local98 < Static35.anInt869; local98++) {
			Static125.anIntArray493[local98] = local6.method1176();
		}
		for (@Pc(112) int local112 = 0; local112 < Static35.anInt869; local112++) {
			Static14.anIntArray80[local112] = local6.method1176();
		}
		local6.anInt1694 = arg0.length + 3 - local62 * 3 - Static35.anInt869 * 8 - 7;
		Static16.anIntArray81 = new int[local62];
		for (@Pc(146) int local146 = 1; local146 < local62; local146++) {
			Static16.anIntArray81[local146] = local6.method1215();
			if (Static16.anIntArray81[local146] == 0) {
				Static16.anIntArray81[local146] = 1;
			}
		}
		local6.anInt1694 = 0;
		for (@Pc(174) int local174 = 0; local174 < Static35.anInt869; local174++) {
			@Pc(180) int local180 = Static125.anIntArray493[local174];
			@Pc(184) int local184 = Static14.anIntArray80[local174];
			@Pc(188) int local188 = local180 * local184;
			@Pc(191) byte[] local191 = new byte[local188];
			Static29.aByteArrayArray2[local174] = local191;
			@Pc(199) int local199 = local6.method1190();
			@Pc(206) int local206;
			if (local199 == 0) {
				for (local206 = 0; local206 < local188; local206++) {
					local191[local206] = local6.method1211();
				}
			} else if (local199 == 1) {
				for (local206 = 0; local206 < local180; local206++) {
					for (@Pc(229) int local229 = 0; local229 < local184; local229++) {
						local191[local180 * local229 + local206] = local6.method1211();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
	public static int method1989() {
		return Static54.anInt1750++;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1990() {
		aClass66_1649 = null;
		aClass66_1647 = null;
		aByteArray40 = null;
		aClass66_1648 = null;
		aClass5_Sub1_28 = null;
		aClass66_1650 = null;
	}
}
