import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!vc;")
	public static Class3_Sub8_Sub1 aClass3_Sub8_Sub1_3 = new Class3_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static int anInt465 = 0;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!v;")
	private static Class62 aClass62_170 = Static45.method753("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_171 = Static45.method753("q8_full");

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_172 = Static45.method753("huffman");

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_173 = aClass62_170;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_174 = Static45.method753("leuchten2:");

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!v;")
	private static Class62 aClass62_176 = Static45.method753("Loading ignore list");

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Lclient!v;")
	public static Class62 aClass62_175 = aClass62_176;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
	public static int[] anIntArray43 = new int[5];

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Lclient!v;")
	public static Class62 aClass62_177 = Static45.method753("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "Lclient!jb;")
	public static Class34 aClass34_5 = new Class34(10);

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "Lclient!v;")
	private static Class62 aClass62_178 = Static45.method753("Prepared sound engine");

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_179 = Static45.method753("Ung\u001c1ltiger Benutzername oder Passwort)3");

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Lclient!v;")
	public static Class62 aClass62_180 = aClass62_178;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "Lclient!v;")
	public static Class62 aClass62_181 = Static45.method753("Side panel redrawn");

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Lclient!mc;")
	public static Class43 aClass43_1 = new Class43(4096);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
	public static int method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static55.method914(arg1 - 1, arg0 - 1) + Static55.method914(arg1 - 1, arg0 + 1) + Static55.method914(arg1 + 1, arg0 + -1) + Static55.method914(arg1 - -1, arg0 - -1);
		@Pc(68) int local68 = Static55.method914(arg1, arg0 - 1) + Static55.method914(arg1, arg0 + 1) + Static55.method914(arg1 + -1, arg0) + Static55.method914(arg1 + 1, arg0);
		@Pc(73) int local73 = Static55.method914(arg1, arg0);
		return local73 / 4 + local40 / 16 + local68 / 8;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method323() {
		for (@Pc(9) int local9 = 0; local9 < Static39.anInt1159; local9++) {
			@Pc(15) int local15 = Static16.anIntArray52[local9];
			@Pc(19) Class3_Sub1_Sub3_Sub1_Sub2 local19 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local15];
			if (local19 != null) {
				Static17.method1870(local19.aClass3_Sub1_Sub4_1.anInt648, local19);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!bd;)V")
	public static void method324(@OriginalArg(1) Class3_Sub1_Sub3_Sub1 arg0) {
		if (arg0.anInt1840 == Static12.anInt451 || arg0.anInt1868 == -1 || arg0.anInt1843 != 0 || arg0.anInt1852 + 1 > Static41.method705(arg0.anInt1868).anIntArray231[arg0.anInt1851]) {
			@Pc(46) int local46 = arg0.anInt1840 - arg0.anInt1857;
			@Pc(51) int local51 = Static12.anInt451 - arg0.anInt1857;
			@Pc(61) int local61 = arg0.anInt1886 * 128 + arg0.anInt1861 * 64;
			@Pc(71) int local71 = arg0.anInt1861 * 64 + arg0.anInt1858 * 128;
			@Pc(82) int local82 = arg0.anInt1880 * 128 + arg0.anInt1861 * 64;
			@Pc(92) int local92 = arg0.anInt1878 * 128 + arg0.anInt1861 * 64;
			arg0.anInt1882 = (local61 * (local46 - local51) + local92 * local51) / local46;
			arg0.anInt1887 = (local51 * local82 + (local46 - local51) * local71) / local46;
		}
		if (arg0.anInt1866 == 0) {
			arg0.anInt1834 = 1024;
		}
		arg0.anInt1881 = 0;
		if (arg0.anInt1866 == 1) {
			arg0.anInt1834 = 1536;
		}
		if (arg0.anInt1866 == 2) {
			arg0.anInt1834 = 0;
		}
		if (arg0.anInt1866 == 3) {
			arg0.anInt1834 = 512;
		}
		arg0.anInt1849 = arg0.anInt1834;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method326() {
		anIntArray43 = null;
		aClass62_174 = null;
		aClass62_171 = null;
		aClass62_181 = null;
		aClass62_178 = null;
		aClass34_5 = null;
		aClass62_177 = null;
		aClass3_Sub8_Sub1_3 = null;
		aClass62_170 = null;
		aClass62_176 = null;
		aClass62_180 = null;
		aClass3_Sub1_Sub1_Sub1_6 = null;
		aClass62_179 = null;
		aClass62_173 = null;
		aClass62_172 = null;
		aClass62_175 = null;
		aClass43_1 = null;
	}
}
