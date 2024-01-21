import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_11;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!w;")
	public static Class2_Sub3_Sub2 aClass2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_12;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1273 = Static14.method2017("p12_full");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1274 = Static14.method2017("(X100(U(Y");

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt2609 = 0;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1275 = Static14.method2017("overlay_multiway");

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public static int anInt2614 = 0;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1276 = Static14.method2017("Enter name of player to add to list");

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1277 = Static14.method2017("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1278 = aClass36_1276;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public static int anInt2618 = 128;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	public static volatile int anInt2620 = -1;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1279 = Static14.method2017("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
	public static int anInt2623 = 0;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1280 = aClass36_1277;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Lclient!df;")
	public static Class2_Sub1_Sub1_Sub2 method1850() {
		@Pc(12) Class2_Sub1_Sub1_Sub2 local12 = new Class2_Sub1_Sub1_Sub2(Static64.anIntArray204, Static92.anIntArray293, Static36.anIntArray132, Static43.anIntArray161, Static42.aByteArrayArray19);
		Static40.method1545();
		return local12;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
	public static boolean method1851(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Lclient!ke;")
	public static Class27 method1852() {
		try {
			return (Class27) Class.forName("Class27_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class27_Sub2();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method1853() {
		aClass36_1273 = null;
		aBooleanArray14 = null;
		aClass2_Sub3_Sub2_1 = null;
		aClass36_1277 = null;
		aClass36_1274 = null;
		aClass36_1278 = null;
		aClass3_Sub1_11 = null;
		aClass36_1275 = null;
		aClass36_1276 = null;
		aClass36_1279 = null;
		aClass36_1280 = null;
		aClass3_Sub1_12 = null;
		aFont1 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!kc;")
	public static Class36 method1854() {
		@Pc(3) Class36 local3 = new Class36();
		local3.aByteArray9 = new byte[100];
		local3.anInt1442 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ac;IIII)[B")
	public static byte[] method1855(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(27) long local27 = ((long) arg1 << 32) + ((long) (arg2 << 16)) + (long) (arg2 * 37 + arg3 & 0xFFFF);
		if (Static9.aClass22_3 != null) {
			@Pc(35) Class2_Sub1_Sub7 local35 = (Class2_Sub1_Sub7) Static9.aClass22_3.method711(local27);
			if (local35 != null) {
				return local35.aByteArray6;
			}
		}
		@Pc(46) byte[] local46 = arg0.method928(arg3, arg2);
		if (local46 == null) {
			return null;
		} else {
			if (Static9.aClass22_3 != null) {
				Static9.aClass22_3.method712(new Class2_Sub1_Sub7(local46), local27);
			}
			return local46;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BII)Z")
	public static boolean method1856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}
}
