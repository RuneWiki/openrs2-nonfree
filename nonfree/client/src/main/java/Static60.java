import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_7;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "Lclient!fd;")
	public static Class24 aClass24_17;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "Lclient!je;")
	private static Class40 aClass40_821 = Static69.method1231("Cancel");

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "Lclient!je;")
	public static Class40 aClass40_822 = Static69.method1231("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
	public static volatile int anInt1676 = 0;

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "[I")
	public static int[] anIntArray168 = new int[100];

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "Lclient!je;")
	public static Class40 aClass40_823 = aClass40_821;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	public static void method1106() {
		aClass40_823 = null;
		aClass24_Sub1_7 = null;
		aClass40_822 = null;
		aClass24_17 = null;
		anIntArray168 = null;
		aFont1 = null;
		aClass40_821 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1107(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static52.aClass12_1);
		arg0.removeFocusListener(Static52.aClass12_1);
		Static67.anInt1838 = -1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!mc;")
	public static Class2_Sub1_Sub6 method1108(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub6 local10 = (Class2_Sub1_Sub6) Static34.aClass55_31.method1410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static63.method277(arg0, Static77.aClass24_23, Static112.aClass24_30);
		if (local10 != null) {
			Static34.aClass55_31.method1411((long) arg0, local10);
		}
		return local10;
	}
}
