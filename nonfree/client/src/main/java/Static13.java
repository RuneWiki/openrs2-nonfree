import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int anInt230;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_101 = Static134.method2017("");

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_102 = Static134.method2017("k");

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_103 = Static134.method2017("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!v;")
	private static Class76 aClass76_104 = Static134.method2017("Your profile will be transferred in:");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public static int anInt223 = 0;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_105 = Static134.method2017("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!v;")
	private static Class76 aClass76_108 = Static134.method2017("wave2:");

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_106 = aClass76_108;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_107 = aClass76_104;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public static final int anInt227 = 2301979;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_109 = aClass76_108;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "Lclient!v;")
	public static Class76 aClass76_110 = Static134.method2017("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!la;Lclient!la;B)V")
	public static void method161(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1) {
		Static61.aClass17_21 = arg0;
		Static43.aClass17_5 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method164() {
		Static9.aClass2_1.method1399();
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			Static124.aLongArray65[local11] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static49.aLongArray30[local29] = 0L;
		}
		Static123.anInt2705 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method165() {
		aClass76_109 = null;
		aClass76_110 = null;
		aClass76_107 = null;
		aClass76_104 = null;
		aClass76_102 = null;
		aClass76_103 = null;
		aShortArrayArray3 = null;
		aClass76_101 = null;
		aClass76_108 = null;
		aClass76_106 = null;
		aClass76_105 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIIII)V")
	public static void method166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = arg3; local15 <= arg3 + arg1; local15++) {
			for (@Pc(19) int local19 = arg0; local19 <= arg0 + arg2; local19++) {
				if (local19 >= 0 && local19 < 104 && local15 >= 0 && local15 < 104) {
					Static84.aByteArrayArrayArray5[0][local19][local15] = 127;
					if (arg0 == local19 && local19 > 0) {
						Static66.anIntArrayArrayArray3[0][local19][local15] = Static66.anIntArrayArrayArray3[0][local19 - 1][local15];
					}
					if (arg0 + arg2 == local19 && local19 < 103) {
						Static66.anIntArrayArrayArray3[0][local19][local15] = Static66.anIntArrayArrayArray3[0][local19 + 1][local15];
					}
					if (local15 == arg3 && local15 > 0) {
						Static66.anIntArrayArrayArray3[0][local19][local15] = Static66.anIntArrayArrayArray3[0][local19][local15 - 1];
					}
					if (local15 == arg3 + arg1 && local15 < 103) {
						Static66.anIntArrayArrayArray3[0][local19][local15] = Static66.anIntArrayArrayArray3[0][local19][local15 + 1];
					}
				}
			}
		}
	}
}
