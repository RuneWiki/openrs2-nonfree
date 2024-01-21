import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!l;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!te;")
	public static Class3_Sub1_Sub17 aClass3_Sub1_Sub17_2;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_870 = Static56.method972("Add friend");

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_867 = aClass5_870;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!ae;")
	private static Class5 aClass5_868 = Static56.method972("Classic");

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_869 = Static56.method972("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_871 = aClass5_868;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Lclient!ae;")
	public static Class5 method1214(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static96.method1319(arg0);
		} else if (arg0 < 10000000) {
			return Static75.method1261(new Class5[] { Static96.method1319(arg0 / 1000), Static58.aClass5_773 });
		} else {
			return Static75.method1261(new Class5[] { Static96.method1319(arg0 / 1000000), Static27.aClass5_364 });
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1215() {
		if (Static93.aClass25_1 == null) {
			return;
		}
		if (Static42.anInt1188 < 0) {
			if (Static78.anInt1964 > 0) {
				Static78.anInt1964--;
				if (Static78.anInt1964 == 0) {
					if (Static44.aByteArray8 == null) {
						Static93.aClass25_1.method1156(256);
					} else {
						Static93.aClass25_1.method1156(Static112.anInt2928);
						Static42.anInt1188 = Static112.anInt2928;
						Static93.aClass25_1.method1154(Static112.anInt2928, Static44.aByteArray8, Static52.aBoolean66);
						Static44.aByteArray8 = null;
					}
					Static109.anInt2872 = 0;
				}
			}
		} else if (Static78.anInt1964 > 0) {
			Static109.anInt2872 += Static92.anInt2363;
			Static93.aClass25_1.method1158(Static109.anInt2872, Static42.anInt1188);
			Static78.anInt1964--;
			if (Static78.anInt1964 == 0) {
				Static93.aClass25_1.method1151();
				Static42.anInt1188 = -1;
				Static78.anInt1964 = 20;
			}
		}
		Static93.aClass25_1.method1157();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)I")
	public static int method1216(@OriginalArg(0) int arg0) {
		@Pc(7) Class3_Sub1_Sub9 local7 = Static35.method690(arg0);
		@Pc(10) int local10 = local7.anInt1446;
		@Pc(18) int local18 = local7.anInt1449;
		@Pc(24) int local24 = Class3_Sub1_Sub4.anIntArray106[local18 - local10];
		@Pc(27) int local27 = local7.anInt1443;
		return Static110.anIntArray373[local27] >> local10 & local24;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!te;B)Lclient!te;")
	public static Class3_Sub1_Sub17 method1217(@OriginalArg(0) Class3_Sub1_Sub17 arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = arg0.method1726();
		if (local10 == null) {
			local10 = arg0.aClass3_Sub1_Sub17_4;
		}
		return local10;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method1218() {
		aClass5_870 = null;
		aClass5_871 = null;
		aBooleanArray15 = null;
		aClass42_1 = null;
		aClass5_868 = null;
		aClass5_867 = null;
		aClass5_869 = null;
		aClass3_Sub1_Sub17_2 = null;
	}
}
