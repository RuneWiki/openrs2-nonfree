import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "R", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public static int anInt138 = 0;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	public static int anInt141 = -1;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!ke;")
	private static Class39 aClass39_72 = Static2.method66(" from your ignore list first");

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public static volatile int anInt143 = 0;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "[I")
	public static int[] anIntArray21 = new int[2048];

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[Lclient!qc;")
	public static Class53[] aClass53Array1 = new Class53[12];

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	public static int anInt148 = -1;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	public static int anInt151 = 0;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "[I")
	public static int[] anIntArray23 = new int[4000];

	@OriginalMember(owner = "client!b", name = "F", descriptor = "Lclient!ke;")
	public static Class39 aClass39_73 = aClass39_72;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "I")
	public static int anInt156 = 0;

	@OriginalMember(owner = "client!b", name = "N", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "Lclient!qd;")
	public static Class54 aClass54_3 = new Class54(64);

	@OriginalMember(owner = "client!b", name = "U", descriptor = "I")
	public static int anInt161 = -1;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "I")
	public static int anInt163 = 0;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_74 = Static2.method66("@yel@*V");

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "Lclient!qd;")
	public static Class54 aClass54_4 = new Class54(64);

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
	public static int anInt165 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method109() {
		aClass54_4 = null;
		anIntArray23 = null;
		aClass39_72 = null;
		aClass54_3 = null;
		aClass39_73 = null;
		aClass39_74 = null;
		anIntArray21 = null;
		aClass53Array1 = null;
		aCanvas1 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V")
	public static void method110(@OriginalArg(1) boolean arg0) {
		Static64.anInt1898++;
		if (Static64.anInt1898 < 50 && !arg0) {
			return;
		}
		Static64.anInt1898 = 0;
		if (Static46.aBoolean67 || Static85.aClass10_3 == null) {
			return;
		}
		Static50.aClass2_Sub5_Sub1_2.method1302(217);
		try {
			Static85.aClass10_3.method260(Static50.aClass2_Sub5_Sub1_2.anInt1772, Static50.aClass2_Sub5_Sub1_2.aByteArray16);
			Static50.aClass2_Sub5_Sub1_2.anInt1772 = 0;
		} catch (@Pc(46) IOException local46) {
			Static46.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)I")
	public static int method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static55.method1085(arg0 + 91923, arg1 + 45365, 4) + (Static55.method1085(arg0 + 37821, arg1 - -10294, 2) - 128 >> 1) + (Static55.method1085(arg0, arg1, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
