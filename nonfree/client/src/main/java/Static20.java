import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!od;")
	public static Class60 aClass60_209 = Static41.method597("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!od;")
	public static Class60 aClass60_210 = Static41.method597("<col=ffff00>");

	@OriginalMember(owner = "client!da", name = "W", descriptor = "Lclient!od;")
	private static Class60 aClass60_217 = Static41.method597("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Lclient!od;")
	public static Class60 aClass60_212 = aClass60_217;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "Lclient!od;")
	private static Class60 aClass60_213 = Static41.method597("Loading interfaces )2 ");

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "Lclient!od;")
	private static Class60 aClass60_219 = Static41.method597("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!od;")
	public static Class60 aClass60_214 = aClass60_219;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "Lclient!od;")
	public static Class60 aClass60_215 = Static41.method597(" loggt sich aus)3");

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	public static int anInt703 = 0;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	public static final int anInt704 = 2301979;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	public static int anInt705 = 0;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_216 = Static41.method597("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!da", name = "X", descriptor = "Lclient!od;")
	public static Class60 aClass60_218 = Static41.method597("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "Lclient!od;")
	public static Class60 aClass60_220 = aClass60_213;

	@OriginalMember(owner = "client!da", name = "db", descriptor = "Lclient!od;")
	public static Class60 aClass60_221 = Static41.method597("Weiter");

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "Lclient!od;")
	private static Class60 aClass60_222 = Static41.method597("Walk here");

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "Lclient!od;")
	public static Class60 aClass60_223 = aClass60_222;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)V")
	public static void method383(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static83.anInt1972 >= 100 && anInt703 != 1 || Static83.anInt1972 >= 200) {
			Static90.method1469(0, Static23.aClass60_253, Static54.aClass60_528);
			return;
		}
		@Pc(39) Class60 local39 = Static56.method885(arg0).method1322();
		for (@Pc(46) int local46 = 0; local46 < Static83.anInt1972; local46++) {
			if (Static35.aLongArray4[local46] == arg0) {
				Static90.method1469(0, Static23.aClass60_253, Static12.method1761(new Class60[] { local39, Static47.aClass60_431 }));
				return;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < Static59.anInt1560; local83++) {
			if (Static26.aLongArray3[local83] == arg0) {
				Static90.method1469(0, Static23.aClass60_253, Static12.method1761(new Class60[] { Static84.aClass60_826, local39, Static54.aClass60_519 }));
				return;
			}
		}
		if (local39.method1311(Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass60_139)) {
			Static90.method1469(0, Static23.aClass60_253, Static2.aClass60_9);
			return;
		}
		Static32.aClass60Array4[Static83.anInt1972] = local39;
		Static35.aLongArray4[Static83.anInt1972] = arg0;
		Static61.anIntArray177[Static83.anInt1972] = 0;
		Static46.anIntArray116[Static83.anInt1972] = 0;
		Static8.anInt94 = Static87.anInt2052;
		Static83.anInt1972++;
		Static14.aClass4_Sub9_Sub1_1.method826(82);
		Static14.aClass4_Sub9_Sub1_1.method805(arg0);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	public static void method384() {
		aClass60_209 = null;
		aClass60_218 = null;
		aClass60_210 = null;
		aClass60_222 = null;
		aClass60_215 = null;
		aClass60_214 = null;
		aClass60_216 = null;
		anIntArray78 = null;
		aClass60_213 = null;
		aClass60_221 = null;
		aClass60_212 = null;
		aFrame1 = null;
		aClass60_219 = null;
		aClass60_220 = null;
		aClass60_217 = null;
		aClass60_223 = null;
	}
}
