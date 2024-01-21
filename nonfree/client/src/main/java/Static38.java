import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_7;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public static int[] anIntArray130 = new int[128];

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "[I")
	public static int[] anIntArray131 = new int[100];

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_506 = Static56.method816("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt926 = 2;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public static int anInt928 = 0;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "Lclient!ic;")
	public static Class34 aClass34_507 = Static56.method816("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	public static int anInt943 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method581() {
		anIntArray130 = null;
		aClass14_Sub1_7 = null;
		anIntArray131 = null;
		aClass34_506 = null;
		aClass34_507 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method583() {
		Static56.anInt1443 = 0;
		Static95.anInt2240 = 0;
		Static107.method1515();
		Static64.method1223();
		Static124.method1963();
		Static27.method494();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static56.anInt1443; local23++) {
			local29 = Static2.anIntArray2[local23];
			if (Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local29].anInt2057 != Static21.anInt655) {
				Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local29] = null;
			}
		}
		if (Static32.anInt872 != Static10.aClass8_Sub20_Sub1_1.anInt2853) {
			throw new RuntimeException("gpp1 pos:" + Static10.aClass8_Sub20_Sub1_1.anInt2853 + " psize:" + Static32.anInt872);
		}
		for (local29 = 0; local29 < Static41.anInt986; local29++) {
			if (Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + Static41.anInt986);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)I")
	public static int method584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * 57 + arg1;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = (local11 * 15731 * local11 + 789221) * local11 + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method587(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static16.aClass23_1);
		arg0.removeFocusListener(Static16.aClass23_1);
		Static96.anInt549 = -1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!wf;)Lclient!ic;")
	public static Class34 method590(@OriginalArg(1) Class8_Sub24 arg0) {
		if (Static47.method735(Static99.method1445(arg0)) == 0) {
			return null;
		} else if (arg0.aClass34_1439 == null || arg0.aClass34_1439.method812().method820() == 0) {
			return Static33.aBoolean42 ? Static30.aClass34_449 : null;
		} else {
			return arg0.aClass34_1439;
		}
	}
}
