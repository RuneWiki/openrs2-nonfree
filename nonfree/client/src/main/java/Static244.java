import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "Lclient!rk;")
	public static Class180 aClass180_62;

	@OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
	public static int anInt4835;

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
	public static int anInt4838;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt4807 = 2;

	@OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
	public static int anInt4842 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4208(@OriginalArg(0) long arg0) {
		Static207.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static207.aCalendar2.get(7);
		@Pc(17) int local17 = Static207.aCalendar2.get(5);
		@Pc(21) int local21 = Static207.aCalendar2.get(2);
		@Pc(30) int local30 = Static207.aCalendar2.get(1);
		@Pc(34) int local34 = Static207.aCalendar2.get(11);
		@Pc(38) int local38 = Static207.aCalendar2.get(12);
		@Pc(42) int local42 = Static207.aCalendar2.get(13);
		return Static61.aStringArray14[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static102.aStringArray28[local21] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(CIZ)I")
	public static int method4212(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
	public static void method4213() {
		Static80.method1708();
		Static238.method4098();
		Static168.method3221();
		Static338.method5378();
		Static293.method4827();
		Static237.method4094();
		Static12.method179();
		Static271.method4519();
		Static246.method4259();
		Static353.method2007();
		Static240.method5449();
		Static5.method64();
		Static57.method1171();
		Static326.method5233();
		Static94.method1907();
		Static250.method4284();
		Static59.method1196();
		Static354.method5697();
		Static293.method4826();
		Static299.method4866();
		Static97.method1990();
		Static45.method1037();
		Static85.method1804();
		Static54.aClass103_14.method2684();
		Static263.aClass103_53.method2684();
		Static171.aClass103_28.method2684();
		Static33.aClass103_9.method2684();
		Static83.aClass103_21.method2684();
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)J")
	public static long method4218() {
		return Static81.aClass34_1.method5275();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V")
	public static void method4219(@OriginalArg(0) int arg0) {
		Static300.method4855();
		Static226.method4016();
		Static119.method2528(true, arg0);
		Static150.method1570(Static139.aClass180_36, Static128.aClass89_3, Static312.aClass180_89);
		Static264.method4437(Static312.aClass180_89, Static128.aClass89_3);
		Static69.method1371(Static160.aClass52Array10);
		Static242.method3141();
		Static183.method3347();
		if (Static85.anInt2215 == 10) {
			Static280.method4170(false);
		} else if (Static85.anInt2215 == 30) {
			Static82.method1759(25);
			return;
		} else if (Static85.anInt2215 == 5) {
			Static251.method5279(Static312.aClass180_89, Static128.aClass89_3);
			return;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!bd;)V")
	public static void method4220(@OriginalArg(1) Class21 arg0) {
		@Pc(5) Class207 local5 = null;
		try {
			@Pc(14) Class99 local14 = arg0.method386();
			while (local14.anInt2836 == 0) {
				Static129.method2634(1L);
			}
			if (local14.anInt2836 == 1) {
				local5 = (Class207) local14.anObject2;
				@Pc(34) Class7_Sub3 local34 = Static200.method3575();
				local5.method5337(local34.aByteArray33, 0, local34.anInt3005);
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			if (local5 != null) {
				local5.method5336();
			}
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Lclient!fr;")
	public static Class78 method4224(@OriginalArg(0) int arg0) {
		@Pc(10) Class78 local10 = (Class78) Static343.aClass103_71.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static237.aClass180_59.method4560(arg0, 1);
		local10 = new Class78();
		if (local25 != null) {
			local10.method1904(new Class7_Sub3(local25), arg0);
		}
		Static343.aClass103_71.method2687(local10, (long) arg0);
		return local10;
	}
}
