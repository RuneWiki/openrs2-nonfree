import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!la", name = "kc", descriptor = "Lclient!da;")
	public static Class15 aClass15_43;

	@OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
	public static final int anInt1804 = 50;

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "[I")
	public static int[] anIntArray235 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "Qb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_826 = Static24.method441("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_819 = aClass65_826;

	@OriginalMember(owner = "client!la", name = "eb", descriptor = "Lclient!qa;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_19 = new Class2_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!la", name = "pb", descriptor = "[Lclient!wb;")
	public static Class65[] aClass65Array7 = new Class65[anInt1804];

	@OriginalMember(owner = "client!la", name = "tb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_821 = Static24.method441("Loaded interfaces");

	@OriginalMember(owner = "client!la", name = "yb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_822 = Static24.method441("Einloggen");

	@OriginalMember(owner = "client!la", name = "zb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_823 = Static24.method441("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!la", name = "Bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_824 = Static24.method441("backvmid3");

	@OriginalMember(owner = "client!la", name = "Eb", descriptor = "I")
	public static int anInt1817 = 0;

	@OriginalMember(owner = "client!la", name = "Fb", descriptor = "[B")
	public static byte[] aByteArray48 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!la", name = "Ib", descriptor = "[I")
	public static int[] anIntArray238 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "Jb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_825 = aClass65_821;

	@OriginalMember(owner = "client!la", name = "Mb", descriptor = "[I")
	public static int[] anIntArray239 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "Sb", descriptor = "[I")
	public static int[] anIntArray240 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "Wb", descriptor = "[I")
	public static int[] anIntArray241 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "ic", descriptor = "[I")
	public static int[] anIntArray244 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "lc", descriptor = "[I")
	public static int[] anIntArray245 = new int[anInt1804];

	@OriginalMember(owner = "client!la", name = "mc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_827 = Static24.method441("Privater Chat");

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
	public static void method1069() {
		aClass65_826 = null;
		anIntArray244 = null;
		anIntArray241 = null;
		aClass65_822 = null;
		aClass65_823 = null;
		aClass65_824 = null;
		anIntArray235 = null;
		aClass65_825 = null;
		anIntArray245 = null;
		anIntArray240 = null;
		aClass65_827 = null;
		aClass2_Sub8_Sub1_19 = null;
		aClass15_43 = null;
		aClass65Array7 = null;
		anIntArray238 = null;
		aClass65_821 = null;
		anIntArray239 = null;
		aByteArray48 = null;
		aClass65_819 = null;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
	public static void method1070() {
		for (@Pc(7) int local7 = 0; local7 < Static39.anInt1251; local7++) {
			@Pc(18) int local18 = Static61.anIntArray248[local7];
			@Pc(22) Class2_Sub1_Sub1_Sub2_Sub2 local22 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local18];
			@Pc(26) int local26 = aClass2_Sub8_Sub1_19.method1410();
			if ((local26 & 0x8) != 0) {
				local26 += aClass2_Sub8_Sub1_19.method1410() << 8;
			}
			Static30.method572(local22, local26, local18);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1072(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static50.aClass26_1);
		arg0.removeFocusListener(Static50.aClass26_1);
	}
}
