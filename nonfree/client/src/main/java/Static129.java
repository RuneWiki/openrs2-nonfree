import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public static int anInt3262;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!af;")
	private static Class5 aClass5_1469 = Static45.method1937("wave2:");

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_1470 = aClass5_1469;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt3259 = 0;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!af;")
	private static Class5 aClass5_1478 = Static45.method1937("Connection lost");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_1471 = aClass5_1478;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!af;")
	private static Class5 aClass5_1480 = Static45.method1937("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_1472 = aClass5_1480;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public static final int anInt3260 = 50;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1473 = Static45.method1937("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_1474 = aClass5_1469;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1475 = Static45.method1937("<col=ff3000>");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_1477 = Static45.method1937("Could not complete login)3");

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_1476 = aClass5_1477;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_1479 = Static45.method1937("null");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
	public static int method2251(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method2252() {
		aClass5_1479 = null;
		aClass5_1469 = null;
		aClass5_1475 = null;
		aClass5_1471 = null;
		aLongArray6 = null;
		aClass5_1478 = null;
		aFontMetrics1 = null;
		aClass5_1477 = null;
		aClass5_1476 = null;
		aClass5_1474 = null;
		aClass5_1470 = null;
		aClass5_1480 = null;
		aClass5_1473 = null;
		aClass5_1472 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIII)V")
	public static void method2253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static74.anInt1725; local7++) {
			if (arg2 < Static76.anIntArray294[local7] + Static92.anIntArray352[local7] && Static76.anIntArray294[local7] < arg2 + arg0 && Static84.anIntArray330[local7] + Static28.anIntArray100[local7] > arg3 && Static84.anIntArray330[local7] < arg3 + arg1) {
				Static113.aBooleanArray25[local7] = true;
			}
		}
	}
}
