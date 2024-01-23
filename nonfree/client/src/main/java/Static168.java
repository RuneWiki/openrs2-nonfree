import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!pj", name = "ib", descriptor = "[Lclient!pg;")
	public static Class64[] aClass64Array6;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array21 = new Class107[500];

	@OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
	public static int anInt3626 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IJ)Lclient!sc;")
	public static Class107 method2685(@OriginalArg(1) long arg0) {
		Static211.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static211.aCalendar2.get(7);
		@Pc(17) int local17 = Static211.aCalendar2.get(5);
		@Pc(21) int local21 = Static211.aCalendar2.get(2);
		@Pc(25) int local25 = Static211.aCalendar2.get(1);
		@Pc(34) int local34 = Static211.aCalendar2.get(11);
		@Pc(38) int local38 = Static211.aCalendar2.get(12);
		@Pc(42) int local42 = Static211.aCalendar2.get(13);
		return Static149.method2437(new Class107[] { Static61.aClass107Array6[local13 - 1], Static17.aClass107_140, Static115.method2001(local17 / 10), Static115.method2001(local17 % 10), Static70.aClass107_460, Static33.aClass107Array4[local21], Static70.aClass107_460, Static115.method2001(local25), Static73.aClass107_489, Static115.method2001(local34 / 10), Static115.method2001(local34 % 10), Static140.aClass107_235, Static115.method2001(local38 / 10), Static115.method2001(local38 % 10), Static140.aClass107_235, Static115.method2001(local42 / 10), Static115.method2001(local42 % 10), Static2.aClass107_40 });
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(III)V")
	public static void method2687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < Static201.anInt4358; local8++) {
			@Pc(14) Class29 local14 = Static94.method1589(local8);
			if (local14 != null) {
				@Pc(19) int local19 = local14.anInt956;
				if (local19 >= 0 && !Static74.anInterface4_1.method1634(local19)) {
					local19 = -1;
				}
				@Pc(52) int local52;
				@Pc(61) int local61;
				@Pc(68) int local68;
				@Pc(92) int local92;
				if (local14.anInt955 >= 0) {
					local61 = local14.anInt955;
					local68 = arg0 + (local61 & 0x7F);
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 127) {
						local68 = 127;
					}
					local92 = (local61 & 0x380) + (arg1 + local61 & 0xFC00) + local68;
					local52 = Static74.anIntArray158[Static171.method2730(96, local92)];
				} else if (local19 >= 0) {
					local52 = Static74.anIntArray158[Static171.method2730(96, Static74.anInterface4_1.method1632(local19))];
				} else if (local14.anInt952 == -1) {
					local52 = -1;
				} else {
					local61 = local14.anInt952;
					local68 = (local61 & 0x7F) + arg0;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 127) {
						local68 = 127;
					}
					local92 = (local61 & 0x380) + ((arg1 + local61 & 0xFC00) + local68);
					local52 = Static74.anIntArray158[Static171.method2730(96, local92)];
				}
				Static1.anIntArray1[local8 + 1] = local52;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(JI)V")
	public static void method2688(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static174.anInt3793; local14++) {
			if (arg0 == Static201.aLongArray7[local14]) {
				Static174.anInt3793--;
				for (@Pc(28) int local28 = local14; local28 < Static174.anInt3793; local28++) {
					Static201.aLongArray7[local28] = Static201.aLongArray7[local28 + 1];
					Static16.aClass107Array1[local28] = Static16.aClass107Array1[local28 + 1];
				}
				Static82.anInt1779 = Static218.anInt4760;
				Static193.aClass1_Sub26_Sub1_2.method3000(94);
				Static193.aClass1_Sub26_Sub1_2.method2940(arg0);
				break;
			}
		}
	}
}
