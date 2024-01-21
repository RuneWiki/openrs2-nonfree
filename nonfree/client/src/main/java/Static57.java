import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public static int anInt1364;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array4;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public static int anInt1368;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_704 = Static45.method1937("::gc");

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!af;")
	private static Class5 aClass5_706 = Static45.method1937("Loading sprites )2 ");

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_705 = aClass5_706;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!af;")
	private static Class5 aClass5_709 = Static45.method1937("K");

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_707 = aClass5_709;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_708 = Static45.method1937("leuchten2:");

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_710 = aClass5_709;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!af;")
	private static Class5 aClass5_712 = Static45.method1937("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!af;")
	public static Class5 aClass5_711 = aClass5_712;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	public static void method1039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub17 local8 = Static18.method2150(arg2, arg1);
		if (local8 != null && local8.anObjectArray19 != null) {
			@Pc(23) Class1_Sub6 local23 = new Class1_Sub6();
			local23.aClass1_Sub17_26 = local8;
			local23.anObjectArray1 = local8.anObjectArray19;
			Static71.method1228(local23);
		}
		Static84.anInt2143 = arg2;
		Static20.anInt654 = arg1;
		Static47.aBoolean35 = true;
		Static8.anInt265 = arg0;
		Static119.method2161(local8);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1041() {
		while (true) {
			@Pc(10) Class53 local10 = Static8.aClass53_4;
			@Pc(17) Class1_Sub19 local17;
			synchronized (Static8.aClass53_4) {
				local17 = (Class1_Sub19) Static127.aClass53_18.method1452();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass41_Sub1_18.method1732(local17.aByteArray34, (int) local17.aLong95, false, local17.aClass70_3);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method1042(@OriginalArg(1) Class41 arg0) {
		Static93.aClass41_19 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)I")
	public static int method1043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method1045() {
		aClass5_710 = null;
		aClass5_708 = null;
		aClass5_705 = null;
		aClass5_712 = null;
		aClass5_709 = null;
		aClass1_Sub3_Sub1_Sub3Array4 = null;
		aBooleanArray16 = null;
		aClass5_704 = null;
		aClass5_706 = null;
		aClass5_707 = null;
		aClass5_711 = null;
	}
}
