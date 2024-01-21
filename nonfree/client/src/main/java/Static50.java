import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!hd", name = "Gb", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_7;

	@OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
	public static int anInt1243;

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "Lclient!af;")
	private static Class5 aClass5_645 = Static45.method1937("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "Lclient!af;")
	public static Class5 aClass5_641 = aClass5_645;

	@OriginalMember(owner = "client!hd", name = "dc", descriptor = "Lclient!af;")
	private static Class5 aClass5_650 = Static45.method1937("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "Lclient!af;")
	public static Class5 aClass5_642 = aClass5_650;

	@OriginalMember(owner = "client!hd", name = "xb", descriptor = "Lclient!af;")
	public static Class5 aClass5_643 = Static45.method1937(":tradereq:");

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_644 = Static45.method1937("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!hd", name = "Tb", descriptor = "Lclient!af;")
	public static Class5 aClass5_646 = Static45.method1937("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!hd", name = "Ub", descriptor = "Lclient!af;")
	public static Class5 aClass5_647 = Static45.method1937("::errortest");

	@OriginalMember(owner = "client!hd", name = "Vb", descriptor = "Lclient!af;")
	public static Class5 aClass5_648 = Static45.method1937("Texturen geladen)3");

	@OriginalMember(owner = "client!hd", name = "Zb", descriptor = "I")
	public static int anInt1250 = 0;

	@OriginalMember(owner = "client!hd", name = "bc", descriptor = "Lclient!af;")
	public static Class5 aClass5_649 = Static45.method1937(" <col=ffffff>");

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public static void method890() {
		Static76.anIntArray296 = null;
		Static75.anIntArray290 = null;
		Static48.anIntArray196 = null;
		Static109.anIntArray409 = null;
		Static27.anIntArray97 = null;
		Static73.aByteArrayArray7 = null;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method891() {
		aClass5_645 = null;
		aClass5_641 = null;
		aClass5_650 = null;
		aClass5_648 = null;
		aClass5_643 = null;
		aClass5_644 = null;
		aClass41_Sub1_7 = null;
		aClass5_646 = null;
		aClass5_649 = null;
		aClass5_647 = null;
		aClass5_642 = null;
		aByteArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)V")
	public static void method892() {
		for (@Pc(7) int local7 = 0; local7 < Static93.anInt2338; local7++) {
			@Pc(18) int local18 = Static131.anIntArray468[local7];
			@Pc(22) Class1_Sub3_Sub4_Sub2_Sub2 local22 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local18];
			if (local22 != null) {
				Static36.method681(local22.aClass1_Sub3_Sub12_1.anInt2092, local22);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!af;ILclient!af;I)V")
	public static void method893(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2) {
		Static95.method1604(arg2, arg0, null, arg1);
	}
}
