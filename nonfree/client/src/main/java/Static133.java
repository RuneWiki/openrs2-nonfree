import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "Lclient!dd;")
	public static Class17 aClass17_20 = new Class17(64);

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_900 = Static38.method685("Loaded title screen");

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_896 = aClass6_900;

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_898 = Static38.method685("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!qb", name = "db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_897 = aClass6_898;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_899 = Static38.method685("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2087(@OriginalArg(0) Component arg0) {
		@Pc(13) Method local13 = Static71.aMethod2;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static86.aClass15_1);
		arg0.addFocusListener(Static86.aClass15_1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!c;ILclient!c;)V")
	public static void method2088(@OriginalArg(0) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		Static143.aClass10_112 = arg1;
		Static177.aClass10_141 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
	public static void method2089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static10.anInt232; local7++) {
			if (arg0 < Static58.anIntArray97[local7] + Static60.anIntArray92[local7] && Static58.anIntArray97[local7] < arg0 + arg1 && Static27.anIntArray30[local7] + Static4.anIntArray1[local7] > arg3 && Static27.anIntArray30[local7] < arg3 + arg2) {
				Static86.aBooleanArray5[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)V")
	public static void method2090() {
		Static83.anIntArray149 = new int[33];
		Static61.anIntArray99 = new int[151];
		Static122.anIntArray244 = new int[33];
		Static151.anIntArray347 = new int[151];
		@Pc(21) int local21;
		@Pc(19) int local19;
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < 33; local15++) {
			local19 = 0;
			local21 = 999;
			for (local23 = 0; local23 < 34; local23++) {
				if (Static89.aClass2_Sub3_Sub2_Sub3_2.aByteArray46[Static89.aClass2_Sub3_Sub2_Sub3_2.anInt3620 * local15 + local23] == 0) {
					if (local21 == 999) {
						local21 = local23;
					}
				} else if (local21 != 999) {
					local19 = local23;
					break;
				}
			}
			Static83.anIntArray149[local15] = local21;
			Static122.anIntArray244[local15] = local19 - local21;
		}
		for (local21 = 5; local21 < 156; local21++) {
			local23 = 0;
			local19 = 999;
			for (@Pc(90) int local90 = 25; local90 < 172; local90++) {
				if (Static89.aClass2_Sub3_Sub2_Sub3_2.aByteArray46[local90 + Static89.aClass2_Sub3_Sub2_Sub3_2.anInt3620 * local21] == 0 && (local90 > 34 || local21 > 34)) {
					if (local19 == 999) {
						local19 = local90;
					}
				} else if (local19 != 999) {
					local23 = local90;
					break;
				}
			}
			Static151.anIntArray347[local21 - 5] = local19 - 25;
			Static61.anIntArray99[local21 - 5] = local23 - local19;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!me;I)Lclient!ai;")
	public static Class6 method2091(@OriginalArg(0) Class2_Sub13 arg0) {
		return Static21.method380(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	public static void method2093() {
		aClass6_900 = null;
		aClass6_897 = null;
		anIntArray281 = null;
		aClass6_899 = null;
		aClass17_20 = null;
		aClass6_898 = null;
		aClass6_896 = null;
	}
}
