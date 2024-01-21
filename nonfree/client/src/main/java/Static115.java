import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_29;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array12;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!na;")
	public static Class56 aClass56_35;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public static int[] anIntArray335 = new int[100];

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1085 = Static119.method1462("Stufe)2");

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1092 = Static119.method1462("Service unavailable)3");

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1086 = aClass65_1092;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1089 = Static119.method1462("Players");

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1087 = aClass65_1089;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1090 = Static119.method1462("K");

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1088 = aClass65_1090;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1091 = aClass65_1090;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
	public static int[] anIntArray336 = new int[50];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZII)V")
	public static void method1836(@OriginalArg(1) boolean arg0) {
		Static4.anInt1218 = 2;
		Static28.aBoolean29 = arg0;
		Static107.anInt2405 = 22050;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method1837() {
		aClass65_1085 = null;
		anIntArray335 = null;
		aClass65_1089 = null;
		aClass65_1090 = null;
		aClass56_Sub1_29 = null;
		anIntArray336 = null;
		aClass65_1092 = null;
		aClass65_1091 = null;
		aClass2_Sub1_Sub4_Sub1Array12 = null;
		aClass56_35 = null;
		aClass65_1088 = null;
		aCanvas1 = null;
		aClass65_1087 = null;
		aClass65_1086 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
	public static boolean method1838() {
		@Pc(5) Class43 local5 = Static96.aClass43_1;
		synchronized (Static96.aClass43_1) {
			if (Static68.anInt2857 == Static86.anInt1844) {
				return false;
			} else {
				Static70.anInt1633 = Static70.anIntArray196[Static68.anInt2857];
				Static94.anInt2129 = Static132.anIntArray412[Static68.anInt2857];
				Static68.anInt2857 = Static68.anInt2857 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Lclient!rb;")
	public static Class2_Sub1_Sub13 method1840(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub1_Sub13 local15 = (Class2_Sub1_Sub13) Static6.aClass8_9.method172((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static14.aClass56_7.method1666(arg0, 16);
		local15 = new Class2_Sub1_Sub13();
		if (local25 != null) {
			local15.method1649(new Class2_Sub4(local25));
		}
		Static6.aClass8_9.method176((long) arg0, local15);
		return local15;
	}
}
