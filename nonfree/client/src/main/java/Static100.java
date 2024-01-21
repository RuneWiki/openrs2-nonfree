import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!r", name = "ld", descriptor = "Lclient!q;")
	public static Class62 aClass62_29;

	@OriginalMember(owner = "client!r", name = "od", descriptor = "I")
	public static int anInt2551;

	@OriginalMember(owner = "client!r", name = "ed", descriptor = "Lclient!wb;")
	public static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_4 = new Class1_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!r", name = "wd", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1232 = Static108.method1915("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!r", name = "jd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1231 = aClass39_1232;

	@OriginalMember(owner = "client!r", name = "kd", descriptor = "I")
	public static int anInt2549 = 0;

	@OriginalMember(owner = "client!r", name = "rd", descriptor = "[I")
	public static int[] anIntArray390 = new int[500];

	@OriginalMember(owner = "client!r", name = "vd", descriptor = "I")
	public static int anInt2556 = 0;

	@OriginalMember(owner = "client!r", name = "xd", descriptor = "[[[Lclient!ie;")
	public static Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!r", name = "yd", descriptor = "[I")
	public static int[] anIntArray391 = new int[256];

	@OriginalMember(owner = "client!r", name = "Cd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1233 = Static108.method1915("Fertigkeit)2");

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	public static void method1805() {
		aClass31ArrayArrayArray1 = null;
		aClass62_29 = null;
		aClass39_1233 = null;
		aClass39_1231 = null;
		anIntArray391 = null;
		anIntArray390 = null;
		aClass1_Sub18_Sub1_4 = null;
		aClass39_1232 = null;
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)I")
	public static int method1806() {
		return Static22.anInt754++;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1807(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static98.aClass71_1);
		arg0.removeFocusListener(Static98.aClass71_1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)I")
	public static int method1808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static51.aByteArrayArrayArray3[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static51.aByteArrayArrayArray3[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
