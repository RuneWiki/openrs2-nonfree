import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt2540;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt2545;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
	public static int[] anIntArray429 = new int[2000];

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1423 = Static106.method1849("wishes to trade with you)3");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1424 = Static106.method1849("Art");

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1425 = Static106.method1849("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1426 = aClass66_1423;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1427 = Static106.method1849("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!sc;Lclient!sc;)V")
	public static void method1791(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class66 arg2) {
		Static12.method384(null, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!sf;ILclient!sc;Lclient!sc;IZ)V")
	public static void method1792(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(8) int local8 = arg0.method122(arg1);
		@Pc(14) int local14 = arg0.method116(local8, arg2);
		Static63.method1352(local14, arg0, local8, 255);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method1794() {
		while (true) {
			@Pc(10) Class61 local10 = Static108.aClass61_3;
			@Pc(17) Class1_Sub18 local17;
			synchronized (Static108.aClass61_3) {
				local17 = (Class1_Sub18) Static27.aClass61_7.method1756();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass5_Sub1_22.method136(local17.aByteArray21, local17.aClass22_12, false, (int) local17.aLong130);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1796() {
		aClass66_1426 = null;
		anIntArray429 = null;
		aClass66_1427 = null;
		aClass66_1425 = null;
		aClass66_1423 = null;
		aClass66_1424 = null;
	}
}
