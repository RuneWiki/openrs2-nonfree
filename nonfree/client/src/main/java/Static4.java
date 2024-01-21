import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public static int anInt67;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!nd;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_49 = Static32.method683("huffman");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!l;")
	public static Class46 aClass46_1 = new Class46();

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
	public static int[] anIntArray7 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	public static int anInt65 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!lf;")
	private static Class49 aClass49_50 = Static32.method683("No reply from loginserver)3");

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!lf;")
	private static Class49 aClass49_54 = Static32.method683("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!lf;")
	public static Class49 aClass49_51 = aClass49_54;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_52 = Static32.method683("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	public static int anInt68 = 0;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public static int anInt69 = 0;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!lf;")
	public static Class49 aClass49_53 = aClass49_50;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_55 = aClass49_54;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method51(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static79.aClass67_41);
		arg0.removeMouseMotionListener(Static79.aClass67_41);
		arg0.removeFocusListener(Static79.aClass67_41);
		Static48.anInt1123 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
	public static int method52(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZIIZ)Lclient!oh;")
	public static Class11_Sub1 method53(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class88 local10 = null;
		if (Static157.aClass37_3 != null) {
			local10 = new Class88(arg2, Static157.aClass37_3, Static85.aClass37Array1[arg2], 1000000);
		}
		return new Class11_Sub1(local10, Static15.aClass88_1, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method54() {
		aClass46_1 = null;
		aClass49_54 = null;
		aClass49_50 = null;
		anIntArray7 = null;
		aClass49_55 = null;
		aClass49_49 = null;
		aClass49_53 = null;
		aClass49_51 = null;
		aClass57_1 = null;
		aClass49_52 = null;
	}
}
