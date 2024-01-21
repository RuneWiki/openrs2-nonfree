import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public static int anInt2015;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[I")
	public static int[] anIntArray248 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public static int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!ke;")
	private static Class39 aClass39_891 = Static2.method66("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int anInt2009 = 0;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public static volatile int anInt2010 = 0;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public static int anInt2011 = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_892 = Static2.method66("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int anInt2013 = 1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!ke;")
	private static Class39 aClass39_893 = Static2.method66("Report abuse");

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_894 = aClass39_891;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_895 = aClass39_893;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1436() {
		aClass39_891 = null;
		aByteArrayArrayArray4 = null;
		aClass39_895 = null;
		anImage1 = null;
		aLongArray6 = null;
		aClass39_892 = null;
		anIntArray248 = null;
		anIntArray249 = null;
		aClass39_894 = null;
		aClass39_893 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1437() {
		Static81.aClass54_22.method1635();
		Static44.aClass54_11.method1635();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(JI)V")
	public static void method1438(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static72.anInt2061; local14++) {
			if (Static1.aLongArray1[local14] == arg0) {
				Static97.aBoolean120 = true;
				Static72.anInt2061--;
				for (@Pc(38) int local38 = local14; local38 < Static72.anInt2061; local38++) {
					Static75.aClass39Array4[local38] = Static75.aClass39Array4[local38 + 1];
					Static45.anIntArray177[local38] = Static45.anIntArray177[local38 + 1];
					Static1.aLongArray1[local38] = Static1.aLongArray1[local38 + 1];
				}
				Static50.aClass2_Sub5_Sub1_2.method1302(139);
				Static50.aClass2_Sub5_Sub1_2.method1270(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class2_Sub1_Sub1 method1439(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub1 local10 = (Class2_Sub1_Sub1) Static107.aClass54_27.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static37.aClass36_29.method1761(12, arg0);
		local10 = new Class2_Sub1_Sub1();
		if (local20 != null) {
			local10.method53(new Class2_Sub5(local20));
		}
		local10.method64();
		Static107.aClass54_27.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!jd;Lclient!jd;)V")
	public static void method1440(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class36 arg1) {
		Static79.aClass36_71 = arg0;
		Static58.aClass36_39 = arg1;
	}
}
