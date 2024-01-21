import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!mb;")
	public static Class45 aClass45_943 = Static63.method1251("backright1");

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_947 = Static63.method1251(" is already on your ignore list");

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "Lclient!mb;")
	public static Class45 aClass45_944 = aClass45_947;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lclient!sa;")
	public static Class67 aClass67_18 = new Class67(50);

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "[I")
	public static int[] anIntArray313 = new int[1000];

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lclient!mb;")
	public static Class45 aClass45_945 = Static63.method1251("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_946 = Static63.method1251("@yel@");

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
	public static int anInt2240 = 0;

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_948 = Static63.method1251("(U4");

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lclient!mb;")
	private static Class45 aClass45_949 = Static63.method1251("Password: ");

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_950 = Static63.method1251("Angreifen");

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_951 = aClass45_949;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
	public static void method1501() {
		try {
			@Pc(14) Graphics local14 = Static75.aCanvas1.getGraphics();
			Static12.aClass11_137.method2148(local14, 550, 4);
		} catch (@Pc(22) Exception local22) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	public static void method1502() {
		aClass45_951 = null;
		aClass45_947 = null;
		aClass45_949 = null;
		aClass45_950 = null;
		aClass45_943 = null;
		anIntArray313 = null;
		aClass45_948 = null;
		aByteArrayArray7 = null;
		anIntArray314 = null;
		aClass67_18 = null;
		aClass45_946 = null;
		aClass45_944 = null;
		aClass45_945 = null;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V")
	public static void method1503() {
		Static43.aBoolean57 = false;
		Static103.aBoolean122 = false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!ia;)Lclient!ia;")
	public static Class5_Sub2_Sub8 method1504(@OriginalArg(1) Class5_Sub2_Sub8 arg0) {
		@Pc(12) Class5_Sub2_Sub8 local12 = Static122.method2156(arg0);
		if (local12 == null) {
			local12 = arg0.aClass5_Sub2_Sub8_3;
		}
		return local12;
	}
}
