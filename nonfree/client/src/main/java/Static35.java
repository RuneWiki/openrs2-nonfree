import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[Lclient!fd;")
	public static Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "J")
	private static long aLong61;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_479 = Static9.method266("Passwort: ");

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!mc;")
	public static Class48 aClass48_5 = new Class48(8);

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public static int anInt1003 = 0;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_480 = Static9.method266("Stufe)2");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_481 = Static9.method266("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!fd;)Lclient!id;")
	public static Class34 method631(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (!Static64.method1109(arg0, Static84.method1448(arg1)) && arg1.anObjectArray16 == null) {
			return null;
		} else if (arg1.aClass34Array8 == null || arg0 >= arg1.aClass34Array8.length || arg1.aClass34Array8[arg0] == null || arg1.aClass34Array8[arg0].method957().method982() == 0) {
			return Static36.aBoolean60 ? Static91.method1554(new Class34[] { Static116.aClass34_1423, Static85.method1456(arg0) }) : null;
		} else {
			return arg1.aClass34Array8[arg0];
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public static int method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class1_Sub7 local17 = (Class1_Sub7) Static14.aClass48_2.method1340((long) arg1);
		if (local17 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local17.anIntArray78.length; local31++) {
				if (local17.anIntArray79[local31] == arg0) {
					local29 += local17.anIntArray78[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
	public static void method633(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)J")
	public static synchronized long method634() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static70.aLong94) {
			aLong61 += Static70.aLong94 - local5;
		}
		Static70.aLong94 = local5;
		return aLong61 + local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method635() {
		aClass34_479 = null;
		aClass1_Sub9Array1 = null;
		aClass48_5 = null;
		aClass34_480 = null;
		aClass34_481 = null;
	}
}
