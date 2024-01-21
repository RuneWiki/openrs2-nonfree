import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt545;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_11;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_212 = Static45.method753("Ung\u001c1ltiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!v;")
	public static Class62 aClass62_213 = Static45.method753(": ");

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt544 = 0;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_214 = Static45.method753("m");

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!v;")
	public static Class62 aClass62_215 = Static45.method753("titlebutton");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!v;")
	public static Class62 aClass62_216 = Static45.method753("Chat panel redrawn");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	public static int anInt553 = 0;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt554 = 0;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	public static int anInt560 = 0;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_217 = Static45.method753("backhmid1");

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_218 = Static45.method753("scape main");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rd;II)V")
	public static void method363(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static77.aClass3_Sub8_4 == null) {
			Static27.method526(true, 255, 0, (byte) 0, 255, null);
			Static105.aClass42_Sub1Array1[arg1] = arg0;
		} else {
			Static77.aClass3_Sub8_4.anInt2704 = arg1 * 4 + 5;
			@Pc(25) int local25 = Static77.aClass3_Sub8_4.method1770();
			arg0.method1532(local25);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	public static void method365() {
		aClass62_212 = null;
		aClass42_Sub1_11 = null;
		aClass62_215 = null;
		aClass62_216 = null;
		aClass62_214 = null;
		aClass62_218 = null;
		aClass62_213 = null;
		aClass62_217 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!bd;)V")
	public static void method366(@OriginalArg(1) Class3_Sub1_Sub3_Sub1 arg0) {
		arg0.aBoolean109 = false;
		@Pc(18) Class3_Sub1_Sub11 local18;
		if (arg0.anInt1854 != -1) {
			local18 = Static41.method705(arg0.anInt1854);
			arg0.anInt1848++;
			if (local18.anIntArray232.length > arg0.anInt1832 && local18.anIntArray231[arg0.anInt1832] < arg0.anInt1848) {
				arg0.anInt1848 = 1;
				arg0.anInt1832++;
			}
			if (local18.anIntArray232.length <= arg0.anInt1832) {
				arg0.anInt1848 = 0;
				arg0.anInt1832 = 0;
			}
		}
		if (arg0.anInt1859 != -1 && Static12.anInt451 >= arg0.anInt1830) {
			if (arg0.anInt1870 < 0) {
				arg0.anInt1870 = 0;
			}
			@Pc(87) int local87 = Static105.method1827(arg0.anInt1859).anInt2528;
			if (local87 == -1) {
				arg0.anInt1859 = -1;
			} else {
				@Pc(97) Class3_Sub1_Sub11 local97 = Static41.method705(local87);
				arg0.anInt1872++;
				if (local97.anIntArray232.length > arg0.anInt1870 && local97.anIntArray231[arg0.anInt1870] < arg0.anInt1872) {
					arg0.anInt1872 = 1;
					arg0.anInt1870++;
				}
				if (arg0.anInt1870 >= local97.anIntArray232.length && (arg0.anInt1870 < 0 || arg0.anInt1870 >= local97.anIntArray232.length)) {
					arg0.anInt1859 = -1;
				}
			}
		}
		if (arg0.anInt1868 != -1 && arg0.anInt1843 <= 1) {
			local18 = Static41.method705(arg0.anInt1868);
			if (local18.anInt2018 == 1 && arg0.anInt1855 > 0 && arg0.anInt1857 <= Static12.anInt451 && arg0.anInt1840 < Static12.anInt451) {
				arg0.anInt1843 = 1;
				return;
			}
		}
		if (arg0.anInt1868 != -1 && arg0.anInt1843 == 0) {
			local18 = Static41.method705(arg0.anInt1868);
			arg0.anInt1852++;
			if (arg0.anInt1851 < local18.anIntArray232.length && arg0.anInt1852 > local18.anIntArray231[arg0.anInt1851]) {
				arg0.anInt1851++;
				arg0.anInt1852 = 1;
			}
			if (local18.anIntArray232.length <= arg0.anInt1851) {
				arg0.anInt1851 -= local18.anInt2016;
				arg0.anInt1853++;
				if (local18.anInt2015 <= arg0.anInt1853) {
					arg0.anInt1868 = -1;
				}
				if (arg0.anInt1851 < 0 || arg0.anInt1851 >= local18.anIntArray232.length) {
					arg0.anInt1868 = -1;
				}
			}
			arg0.aBoolean109 = local18.aBoolean117;
		}
		if (arg0.anInt1843 > 0) {
			arg0.anInt1843--;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;Lclient!mb;I)I")
	public static int method367(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1517(Static74.aClass62_874, Static40.aClass62_503)) {
			local5++;
		}
		if (arg0.method1517(Static74.aClass62_874, Static52.aClass62_494)) {
			local5++;
		}
		if (arg0.method1517(Static74.aClass62_874, Static96.aClass62_1170)) {
			local5++;
		}
		if (arg0.method1517(Static74.aClass62_874, aClass62_215)) {
			local5++;
		}
		if (arg0.method1517(Static74.aClass62_874, Static95.aClass62_1154)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	public static boolean method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(24) Class3_Sub1_Sub9 local24 = Static10.method1322(arg0);
		return local24.method648(arg1);
	}
}
