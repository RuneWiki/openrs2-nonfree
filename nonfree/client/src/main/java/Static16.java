import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public static int anInt441;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Lclient!dd;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!ea;")
	private static Class18 aClass18_150 = Static8.method128("scroll:");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_147 = aClass18_150;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!ea;")
	private static Class18 aClass18_148 = Static8.method128(" more options");

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!da;")
	public static Class14 aClass14_1 = new Class14(4096);

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_149 = aClass18_150;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_151 = aClass18_148;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_152 = Static8.method128("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_153 = Static8.method128("Versteckt");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public static void method274() {
		aClass18_152 = null;
		aClass18_149 = null;
		aClass18_151 = null;
		aClass18_153 = null;
		aClass16_1 = null;
		aClass18_148 = null;
		aClass14_1 = null;
		aClass18_150 = null;
		aClass18_147 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method275(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static136.aClass10_1);
		arg0.removeMouseMotionListener(Static136.aClass10_1);
		arg0.removeFocusListener(Static136.aClass10_1);
		Static146.anInt4045 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILclient!dd;)Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 method276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2) {
		return Static65.method1300(arg1, arg2, arg0) ? Static74.method1570() : null;
	}
}
