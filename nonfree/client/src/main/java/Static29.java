import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array1;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	public static int anInt1069;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_7;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!wd;")
	private static Class80 aClass80_359 = Static2.method59("wishes to duel with you)3");

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_355 = aClass80_359;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	public static int[] anIntArray125 = new int[200];

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!wd;")
	private static Class80 aClass80_356 = Static2.method59("Enter name of player to add to list");

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_357 = aClass80_356;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_358 = Static2.method59("Freunde");

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public static volatile int anInt1062 = 0;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_360 = Static2.method59(")3runescape)3com");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
	public static boolean method564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static93.aClass64_1.method1622(Static16.anInt444, arg2, arg0, arg1);
		@Pc(18) int local18 = arg1 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(27) int local27 = local12 & 0x1F;
		@Pc(33) int local33 = local12 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(72) Class2_Sub1_Sub10 local72 = Static18.method404(local18);
			@Pc(83) int local83;
			@Pc(80) int local80;
			if (local33 == 0 || local33 == 2) {
				local83 = local72.anInt1634;
				local80 = local72.anInt1630;
			} else {
				local80 = local72.anInt1634;
				local83 = local72.anInt1630;
			}
			@Pc(94) int local94 = local72.anInt1621;
			if (local33 != 0) {
				local94 = (local94 << local33 & 0xF) + (local94 >> 4 - local33);
			}
			Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, local94, 0, local80, local83, arg0, arg2, true, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
		} else {
			Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], local27 + 1, 2, 0, local33, 0, 0, arg0, arg2, true, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
		}
		Static3.anInt123 = Static13.anInt365;
		Static55.anInt1316 = Static108.anInt2880;
		Static65.anInt1848 = 0;
		Static76.anInt1968 = 2;
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method565() {
		aClass11_Sub1_7 = null;
		aClass80_360 = null;
		aClass80_357 = null;
		aClass80_358 = null;
		aClass80_356 = null;
		aClass80_359 = null;
		anIntArray125 = null;
		aClass80_355 = null;
		aClass2_Sub1_Sub9_Sub3Array1 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public static void method566(@OriginalArg(1) int arg0) {
		Static36.anInt1185 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)V")
	public static void method567(@OriginalArg(1) boolean arg0) {
		if (Static51.aClass10_3 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub17 local11 = new Class2_Sub17(4);
			local11.method1769(arg0 ? 2 : 3);
			local11.method1771(0);
			Static51.aClass10_3.method256(local11.aByteArray38, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				Static51.aClass10_3.method255();
			} catch (@Pc(41) Exception local41) {
			}
			Static111.anInt2999++;
			Static51.aClass10_3 = null;
		}
	}
}
