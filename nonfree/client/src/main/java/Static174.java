import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "Lclient!jg;")
	public static Class44 aClass44_31;

	@OriginalMember(owner = "client!ve", name = "xb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	public static int anInt3804 = 0;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "Lclient!nb;")
	public static Class57 aClass57_30 = new Class57(30);

	@OriginalMember(owner = "client!ve", name = "qb", descriptor = "I")
	public static int anInt3823 = 0;

	@OriginalMember(owner = "client!ve", name = "rb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1371 = Static65.method1172("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ve", name = "tb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1372 = Static65.method1172("<br>(X");

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1373 = Static65.method1172("Please enter your username)3");

	@OriginalMember(owner = "client!ve", name = "vb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1374 = aClass46_1373;

	@OriginalMember(owner = "client!ve", name = "wb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1375 = Static65.method1172(" <col=ffffff>");

	@OriginalMember(owner = "client!ve", name = "yb", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2738(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static156.aClass70_1);
		arg0.addMouseMotionListener(Static156.aClass70_1);
		arg0.addFocusListener(Static156.aClass70_1);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public static void method2745() {
		aClass46_1373 = null;
		aFont1 = null;
		aClass46_1375 = null;
		aClass46_1371 = null;
		aByteArrayArrayArray6 = null;
		aClass46_1372 = null;
		aClass46_1374 = null;
		aClass44_31 = null;
		aClass57_30 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
	public static int method2746(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(22) int local22 = local12 | local12 >>> 4;
		@Pc(34) int local34 = local22 | local22 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}
}
