import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "Lclient!efa;")
	public static final Class90 aClass90_37 = new Class90(16);

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_117 = new Class154(74, 3);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method6638(@OriginalArg(1) long arg0) {
		Static16.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static16.aCalendar1.get(7);
		@Pc(17) int local17 = Static16.aCalendar1.get(5);
		@Pc(21) int local21 = Static16.aCalendar1.get(2);
		@Pc(33) int local33 = Static16.aCalendar1.get(1);
		@Pc(37) int local37 = Static16.aCalendar1.get(11);
		@Pc(41) int local41 = Static16.aCalendar1.get(12);
		@Pc(45) int local45 = Static16.aCalendar1.get(13);
		return Static384.aStringArray32[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static145.aStringArray14[local21] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!gk;)Ljava/lang/String;")
	public static String method6641(@OriginalArg(2) Class2_Sub7 arg0) {
		try {
			@Pc(12) int local12 = arg0.method4458();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local12];
			arg0.anInt5186 += Static11.aClass320_1.method6529(arg0.aByteArray52, local12, local24, 0, arg0.anInt5186);
			return Static72.method1195(0, local24, local12);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method6643() {
		@Pc(5) int local5 = 0;
		if (Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318)) {
			local5 = 55;
		}
		if (!Static257.aClass2_Sub35_Sub1_1.aBoolean624) {
			local5 |= 0x40;
		}
		Static272.method3969(local5);
		Static362.aClass290_2.method5798(local5);
		Static466.aClass130_2.method2315(local5);
		Static76.aClass361_1.method7585(local5);
		Static62.aClass49_1.method1023(local5);
		Static82.method1251(local5);
		Static67.method1107(local5);
		Static540.method7097(local5);
		Static238.method3427(local5);
		Static378.method5265();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)Z")
	public static boolean method6646(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
