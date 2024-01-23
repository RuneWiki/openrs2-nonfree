import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public static int anInt4937;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[S")
	public static short[] aShortArray67;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray33 = new int[5][5000];

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public static int anInt4933 = 0;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
	public static int[] anIntArray483 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3956(@OriginalArg(1) String arg0) {
		Static6.aString4 = arg0;
		if (Static164.aClass102_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static164.aClass102_2.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static164.aClass102_2.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static76.method1437(Static221.method3670() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static322.method2906(Static164.aClass102_2.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(92) Throwable local92) {
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!dj;")
	public static Class2_Sub8_Sub5_Sub1 method3957(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub8_Sub5_Sub1 local6 = (Class2_Sub8_Sub5_Sub1) Static87.aClass157_16.method4031((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static256.aClass42_79.method1256(arg0, 0);
		local6 = new Class2_Sub8_Sub5_Sub1(local21);
		local6.method1225(Static9.aClass93Array5, null);
		Static87.aClass157_16.method4026((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lclient!gb;")
	public static Class58_Sub1 method3958(@OriginalArg(1) int arg0) {
		return Static218.aBoolean299 && arg0 >= Static5.anInt4794 && arg0 <= Static13.anInt260 ? Static279.aClass58_Sub1Array2[arg0 - Static5.anInt4794] : null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[B)Lclient!je;")
	public static Class2_Sub8_Sub5 method3960(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(20) Class2_Sub8_Sub5 local20;
		if (Static116.aBoolean184) {
			local20 = new Class2_Sub8_Sub5_Sub2(arg0, Static311.anIntArray591, Static275.anIntArray522, Static299.anIntArray561, Static187.anIntArray397, Static165.aByteArrayArray9);
		} else {
			local20 = new Class2_Sub8_Sub5_Sub1(arg0, Static311.anIntArray591, Static275.anIntArray522, Static299.anIntArray561, Static187.anIntArray397, Static165.aByteArrayArray9);
		}
		Static293.method4502();
		return local20;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	public static void method3961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(13, arg0);
		local12.method2052();
		local12.anInt2698 = arg1;
	}
}
