import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_14;

	@OriginalMember(owner = "client!fa", name = "nb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
	public static int anInt1287 = 0;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_789 = Static107.method1838("green:");

	@OriginalMember(owner = "client!fa", name = "lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_790 = Static107.method1838("null");

	@OriginalMember(owner = "client!fa", name = "mb", descriptor = "Lclient!ch;")
	public static Class14 aClass14_75 = new Class14(30);

	@OriginalMember(owner = "client!fa", name = "ob", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4 = new byte[4][104][104];

	@OriginalMember(owner = "client!fa", name = "pb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_791 = Static107.method1838("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!fa", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_792 = aClass28_791;

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_793 = aClass28_789;

	@OriginalMember(owner = "client!fa", name = "tb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_794 = aClass28_789;

	@OriginalMember(owner = "client!fa", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_795 = Static107.method1838("auf der Hautpseite)3");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/awt/Component;IZ)Lclient!bg;")
	public static Class8 method925(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(15) Class local15 = Class.forName("Class8_Sub2");
			@Pc(19) Class8 local19 = (Class8) local15.getDeclaredConstructor().newInstance();
			local19.method2595(arg2, arg0, arg1);
			return local19;
		} catch (@Pc(28) Throwable local28) {
			@Pc(32) Class8_Sub1 local32 = new Class8_Sub1();
			local32.method2595(arg2, arg0, arg1);
			return local32;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Lclient!ah;")
	public static Class2_Sub4_Sub2 method926(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub4_Sub2 local6 = (Class2_Sub4_Sub2) Static93.aClass14_120.method603((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static123.aClass40_31.method1771(12, arg0);
		local6 = new Class2_Sub4_Sub2();
		if (local20 != null) {
			local6.method309(new Class2_Sub2(local20));
		}
		local6.method313();
		Static93.aClass14_120.method607((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method927() {
		aClass14_75 = null;
		aClass28_789 = null;
		aClass28_791 = null;
		aClass28_790 = null;
		aClass28_793 = null;
		aClass40_14 = null;
		aByteArrayArrayArray4 = null;
		aClass28_795 = null;
		aClass28_794 = null;
		aClass28_792 = null;
		aCanvas1 = null;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)Lclient!gg;")
	public static Class28 method928(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static83.method1481(new Class28[] { Static142.aClass28_1910, Static158.method2411(arg0), Static165.aClass28_2187 });
		} else if (arg0 < 10000000) {
			return Static83.method1481(new Class28[] { Static140.aClass28_1899, Static158.method2411(arg0 / 1000), Static117.aClass28_1663, Static165.aClass28_2187 });
		} else {
			return Static83.method1481(new Class28[] { Static165.aClass28_2188, Static158.method2411(arg0 / 1000000), Static129.aClass28_1780, Static165.aClass28_2187 });
		}
	}
}
