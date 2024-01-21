import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_18;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!a;")
	private static Class1 aClass1_1912 = Static94.method1596("Enter object name");

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1913 = Static94.method1596("null");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_1914 = Static94.method1596("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt1885 = 0;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_1915 = Static94.method1596("Handel)4Duell");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Z")
	public static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!a;")
	private static Class1 aClass1_1916 = Static94.method1596("Enter message to send to ");

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
	public static int anInt1889 = 0;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "[I")
	public static int[] anIntArray203 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_1917 = Static94.method1596("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_1918 = aClass1_1916;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "Lclient!a;")
	public static Class1 aClass1_1919 = aClass1_1912;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!bd;BILclient!bd;Z)Lclient!t;")
	public static Class2_Sub1_Sub16 method1310(@OriginalArg(0) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8 arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) int[] local17 = arg0.method1704(arg1);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(29) byte[] local29 = arg0.method1694(local17[local19], arg1);
			if (local29 == null) {
				local12 = false;
			} else {
				@Pc(49) int local49 = local29[1] & 0xFF | (local29[0] & 0xFF) << 8;
				@Pc(65) byte[] local65 = arg2.method1694(0, local49);
				if (local65 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub16(arg0, arg2, arg1, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1312() {
		aClass1_1912 = null;
		aByteArrayArrayArray5 = null;
		aClass1_1913 = null;
		aClass1_1918 = null;
		aFrame1 = null;
		anIntArray203 = null;
		aClass1_1917 = null;
		aClass1_1916 = null;
		aClass2_Sub1_Sub2_Sub2_18 = null;
		aClass1_1919 = null;
		aClass1_1914 = null;
		aClass1_1915 = null;
	}
}
