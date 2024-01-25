import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
	public static int anInt1871;

	@OriginalMember(owner = "client!dk", name = "Q", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!dk", name = "R", descriptor = "Lclient!fu;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!dk", name = "W", descriptor = "Lclient!he;")
	public static Class100 aClass100_11;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
	public static final int[] anIntArray110 = new int[2048];

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_87 = new Class123(59, -2);

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_23 = new Class267("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!dk", name = "K", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "Lclient!um;")
	public static final Class244 aClass244_10 = new Class244();

	@OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
	public static final int anInt1875 = 1403;

	@OriginalMember(owner = "client!dk", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString12 = null;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lclient!ou;")
	public static Class188 method1454(@OriginalArg(0) int arg0) {
		@Pc(10) Class188 local10 = (Class188) Static129.aClass44_13.method1353((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static285.aClass100_83.method2520(arg0, 0);
		local10 = new Class188();
		if (local20 != null) {
			local10.method4394(new Class6_Sub1(local20));
		}
		local10.method4396();
		Static129.aClass44_13.method1349(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
	public static void method1455() {
		Static273.aClass244_24 = new Class244();
	}
}
