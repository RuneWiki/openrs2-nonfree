import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int anInt1617;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt1621;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!id;")
	private static Class34 aClass34_762 = Static9.method266("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_763 = Static9.method266("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_764 = Static9.method266("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_765 = aClass34_762;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static volatile int anInt1620 = 0;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_766 = Static9.method266(")1j");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1026() {
		for (@Pc(10) Class1_Sub23 local10 = (Class1_Sub23) Static127.aClass38_16.method1034(); local10 != null; local10 = (Class1_Sub23) Static127.aClass38_16.method1038()) {
			if (local10.aClass1_Sub1_Sub16_1 != null) {
				local10.method1918();
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method1027() {
		aBooleanArray12 = null;
		aClass34_764 = null;
		aClass34_765 = null;
		aClass34_762 = null;
		aClass34_766 = null;
		aClass34_763 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!pa;II)V")
	public static void method1028(@OriginalArg(0) Class35_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static128.aClass1_Sub19_6 == null) {
			Static91.method1558(255, (byte) 0, 0, 255, true, null);
			Static126.aClass35_Sub1Array1[arg1] = arg0;
		} else {
			Static128.aClass1_Sub19_6.anInt3111 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static128.aClass1_Sub19_6.method2046();
			@Pc(20) int local20 = Static128.aClass1_Sub19_6.method2046();
			arg0.method1585(local16, local20);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BILclient!ic;I)V")
	public static void method1029(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub18 local7 = new Class1_Sub18();
		local7.anInt2222 = 0;
		local7.aClass33_1 = arg1;
		local7.aLong162 = arg2;
		local7.aByteArray38 = arg0;
		@Pc(22) Class38 local22 = Static43.aClass38_8;
		synchronized (Static43.aClass38_8) {
			Static43.aClass38_8.method1046(local7);
		}
		Static132.method2101();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lclient!ub;")
	public static Class11 method1030() {
		try {
			return (Class11) Class.forName("Class11_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class11_Sub1();
		}
	}
}
