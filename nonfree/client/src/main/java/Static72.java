import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public static int anInt1815;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!ek;")
	public static Class42 aClass42_21;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
	public static boolean aBoolean116;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!sf;")
	public static Class157 aClass157_12 = new Class157(64);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "J")
	public static long aLong65 = 0L;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	public static void method1391(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(9, arg0);
		local8.method2043();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBLclient!ek;)Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 method1393(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1) {
		return Static47.method882(arg1, arg0) ? Static60.method1165() : null;
	}
}
