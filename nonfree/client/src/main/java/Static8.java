import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!jd;")
	public static Class84 aClass84_5;

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ah", name = "db", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array1;

	@OriginalMember(owner = "client!ah", name = "eb", descriptor = "Lclient!rl;")
	public static Class2_Sub24 aClass2_Sub24_1;

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "Lclient!qi;")
	public static Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!ah", name = "U", descriptor = "[I")
	public static int[] anIntArray11 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
	public static int anInt271 = 0;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lclient!ec;")
	public static Class46 aClass46_3 = new Class46(20);

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!ah", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString12 = "wave:";

	@OriginalMember(owner = "client!ah", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString13 = null;

	@OriginalMember(owner = "client!ah", name = "hb", descriptor = "[S")
	public static short[] aShortArray1 = new short[256];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method242(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static19.aClass162_1);
		arg0.addMouseMotionListener(Static19.aClass162_1);
		arg0.addFocusListener(Static19.aClass162_1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!an;")
	public static RuntimeException_Sub1 method243(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString20 = local12.aString20 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)J")
	public static long method244() {
		return Static61.aClass22_2.method4643();
	}
}
