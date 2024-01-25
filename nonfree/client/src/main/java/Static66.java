import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cea", name = "Gb", descriptor = "I")
	public static int anInt10075;

	@OriginalMember(owner = "client!cea", name = "ab", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_12 = new Class6(1, 2);

	@OriginalMember(owner = "client!cea", name = "Fb", descriptor = "[J")
	public static final long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IBI)I")
	public static int method8327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "(I)V")
	public static void method8350() {
		if (Static36.aClass20_1 != null) {
			Static36.aClass20_1.method7238();
			Static297.aClass68_8 = null;
			Static36.aClass20_1 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "(II)V")
	public static void method8375(@OriginalArg(1) int arg0) {
		if (arg0 == Static529.anInt9623) {
			return;
		}
		if (arg0 == 13) {
			if (Static431.aString91 == null) {
				Static558.method8316(Static456.aString69, Static291.anInt6172, Static415.aString88);
			} else {
				Static280.method5109(Static291.anInt6172);
			}
		}
		if (arg0 != 13 && Static497.aClass116_2 != null) {
			Static497.aClass116_2.method3740();
			Static497.aClass116_2 = null;
		}
		if (arg0 == 3) {
			Static461.method6815(Static475.anInt10143 != Static603.anInt7122);
		}
		if (arg0 == 7) {
			Static353.method6003(Static258.anInt5506 != Static475.anInt10143);
		}
		if (arg0 == 5) {
			if (Static431.aString91 == null) {
				Static402.method6563(Static415.aString88, Static456.aString69);
			} else {
				Static449.method7068();
			}
		} else if (arg0 == 6) {
			if (Static431.aString91 == null) {
				Static558.method8316(Static456.aString69, Static291.anInt6172, Static415.aString88);
			} else {
				Static280.method5109(Static291.anInt6172);
			}
		} else if (arg0 == 9) {
			if (Static431.aString91 == null) {
				Static558.method8316(Static456.aString69, Static291.anInt6172, Static415.aString88);
			} else {
				Static280.method5109(Static291.anInt6172);
			}
		} else if (arg0 == 12) {
			if (Static431.aString91 == null) {
				Static402.method6563(Static415.aString88, Static456.aString69);
			} else {
				Static449.method7068();
			}
		}
		if (Static579.method8630(Static529.anInt9623)) {
			Static337.aClass157_172.anInt5303 = 2;
			Static539.aClass157_263.anInt5303 = 2;
			Static335.aClass157_169.anInt5303 = 2;
			Static499.aClass157_245.anInt5303 = 2;
			Static435.aClass157_222.anInt5303 = 2;
			Static563.aClass157_278.anInt5303 = 2;
			Static309.aClass157_152.anInt5303 = 2;
		}
		if (Static579.method8630(arg0)) {
			Static228.anInt5049 = 1;
			Static234.anInt5126 = 0;
			Static633.anInt10995 = 1;
			Static405.anInt7686 = 0;
			Static60.anInt2005 = 0;
			Static328.method5641(true);
			Static337.aClass157_172.anInt5303 = 1;
			Static539.aClass157_263.anInt5303 = 1;
			Static335.aClass157_169.anInt5303 = 1;
			Static499.aClass157_245.anInt5303 = 1;
			Static435.aClass157_222.anInt5303 = 1;
			Static563.aClass157_278.anInt5303 = 1;
			Static309.aClass157_152.anInt5303 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static420.method6785();
		}
		@Pc(226) boolean local226 = arg0 == 2 || Static461.method6813(arg0) || Static115.method2851(arg0);
		@Pc(241) boolean local241 = Static529.anInt9623 == 2 || Static461.method6813(Static529.anInt9623) || Static115.method2851(Static529.anInt9623);
		if (local226 != local241) {
			if (local226) {
				Static580.anInt10350 = Static121.anInt9613;
				if (Static74.aClass2_Sub13_5.aClass14_Sub6_3.method3223() == 0) {
					Static428.method5138();
				} else {
					Static73.method2123(Static74.aClass2_Sub13_5.aClass14_Sub6_3.method3223(), Static100.aClass157_64, Static121.anInt9613);
					Static75.method2188();
				}
				Static142.aClass329_3.method8117(false);
			} else {
				Static428.method5138();
				Static142.aClass329_3.method8117(true);
			}
		}
		if (Static579.method8630(arg0) || arg0 == 13) {
			Static186.aClass20_4.method7276();
		}
		Static529.anInt9623 = arg0;
	}
}
