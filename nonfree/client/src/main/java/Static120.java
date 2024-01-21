import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_15;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!lc;")
	public static Class40 aClass40_58;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	public static int anInt1940;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_16;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_774 = Static121.method2047("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!qc;")
	private static Class60 aClass60_775 = Static121.method2047("Loaded title screen");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lclient!ca;")
	public static Class4_Sub4_Sub1_Sub2_Sub1[] aClass4_Sub4_Sub1_Sub2_Sub1Array2 = new Class4_Sub4_Sub1_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_776 = Static121.method2047("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!mf;")
	public static Class48 aClass48_45 = new Class48(200);

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_777 = aClass60_775;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_778 = Static121.method2047("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "Lclient!qc;")
	private static Class60 aClass60_788 = Static121.method2047("Please try using a different world)3");

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_779 = aClass60_788;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Lclient!qc;")
	private static Class60 aClass60_782 = Static121.method2047("World");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_780 = aClass60_782;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!qc;")
	public static Class60 aClass60_781 = aClass60_788;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_783 = aClass60_788;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_784 = aClass60_788;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	public static int anInt1939 = 0;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!qc;")
	public static Class60 aClass60_785 = aClass60_782;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_786 = Static121.method2047("null");

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Lclient!qc;")
	public static Class60 aClass60_787 = Static121.method2047("Neuer Benutzer");

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	public static int anInt1941 = 0;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!qc;")
	public static Class60 aClass60_789 = aClass60_788;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Lclient!qc;")
	public static Class60 aClass60_790 = aClass60_788;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
	public static int anInt1942 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1444() {
		aClass60_776 = null;
		aClass60_781 = null;
		aClass40_58 = null;
		aClass60_779 = null;
		aClass60_782 = null;
		aClass60_790 = null;
		aClass60_789 = null;
		aClass60_783 = null;
		aClass40_Sub1_16 = null;
		aClass4_Sub4_Sub1_Sub2_Sub1Array2 = null;
		aClass48_45 = null;
		anIntArrayArray17 = null;
		aClass60_775 = null;
		aClass60_780 = null;
		aClass60_785 = null;
		aClass60_784 = null;
		aClass60_787 = null;
		aClass60_788 = null;
		aClass60_777 = null;
		aClass60_774 = null;
		aClass40_Sub1_15 = null;
		aClass60_778 = null;
		aClass60_786 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Z")
	public static boolean method1445(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIII)V")
	public static void method1446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static35.anInt913 == 0 || arg2 == 0 || Static130.anInt3022 >= 50) {
			return;
		}
		Static131.anIntArray339[Static130.anInt3022] = arg0;
		Static87.anIntArray206[Static130.anInt3022] = arg2;
		Static85.anIntArray204[Static130.anInt3022] = arg1;
		Static20.aClass73Array1[Static130.anInt3022] = null;
		Static87.anIntArray207[Static130.anInt3022] = 0;
		Static130.anInt3022++;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method1449() {
		@Pc(9) int local9 = Static87.aClass4_Sub4_Sub3_Sub4_5.method1743(Static34.aClass60_375);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static25.anInt693; local11++) {
			local19 = Static87.aClass4_Sub4_Sub3_Sub4_5.method1743(Static43.method726(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		Static46.anInt1203 = Static25.anInt693 * 15 + 22;
		Static93.aBoolean105 = true;
		local9 += 8;
		local19 = Static25.anInt693 * 15 + 21;
		Static31.anInt849 = local9;
		@Pc(52) int local52 = Static128.anInt2648 - local9 / 2;
		@Pc(54) int local54 = Static22.anInt652;
		if (local19 + local54 > 503) {
			local54 = 503 - local19;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		if (local52 + local9 > 765) {
			local52 = 765 - local9;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		Static55.anInt1407 = local54;
		Static33.anInt889 = local52;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)Lclient!qc;")
	public static Class60 method1450(@OriginalArg(1) int arg0) {
		return Static67.method1979(false, arg0);
	}
}
