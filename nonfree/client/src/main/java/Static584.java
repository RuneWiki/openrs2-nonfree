import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Lclient!fa;")
	public static Interface7 anInterface7_12;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_290 = new Class235(95, 6);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)S")
	public static short method7802(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(41) int local41 = local37 + local19;
		@Pc(47) int local47;
		if (local41 == 0) {
			local47 = local37 << 1;
		} else {
			local47 = (local37 << 8) / local41;
		}
		return (short) (local41 | local47 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!bga;")
	public static Class31 method7803(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static226.aFloat137 == 3.0D) {
				return Static215.aClass31_2;
			}
			if ((double) Static226.aFloat137 == 4.0D) {
				return Static395.aClass31_8;
			}
			if ((double) Static226.aFloat137 == 6.0D) {
				return Static575.aClass31_11;
			}
			if ((double) Static226.aFloat137 >= 8.0D) {
				return Static470.aClass31_10;
			}
		} else if (arg0 == 1) {
			if ((double) Static226.aFloat137 == 3.0D) {
				return Static575.aClass31_11;
			}
			if ((double) Static226.aFloat137 == 4.0D) {
				return Static470.aClass31_10;
			}
			if ((double) Static226.aFloat137 == 6.0D) {
				return Static358.aClass31_7;
			}
			if ((double) Static226.aFloat137 >= 8.0D) {
				return Static17.aClass31_1;
			}
		} else if (arg0 == 2) {
			if ((double) Static226.aFloat137 == 3.0D) {
				return Static358.aClass31_7;
			}
			if ((double) Static226.aFloat137 == 4.0D) {
				return Static17.aClass31_1;
			}
			if ((double) Static226.aFloat137 == 6.0D) {
				return Static517.aClass31_12;
			}
			if ((double) Static226.aFloat137 >= 8.0D) {
				return Static343.aClass31_5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method7804() {
		Static399.aClient1.method1118();
		Static256.method3751();
		Static5.anInt62 = 0;
		Static122.aClass235_80 = null;
		Static73.aClass235_31 = null;
		Static125.aClass235_83 = null;
		Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
		Static388.anInt6676 = 0;
		Static434.method6058();
		Static162.anInt2936 = 0;
		Static281.anInt4916 = 0;
		Static482.anInt8105 = 0;
		Static550.aString92 = null;
		Static301.aClass218Array1 = null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!pda;)V")
	public static void method7806(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aClass1_Sub17_5 != null) {
			arg0.aClass1_Sub17_5.anInt5537 = 0;
		}
		arg0.aBoolean593 = false;
		for (@Pc(21) Class1_Sub7 local21 = arg0.method6134(); local21 != null; local21 = arg0.method6136()) {
			method7806(local21);
		}
	}
}
