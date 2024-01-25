import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt4124;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
	public static long aLong104 = -1L;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!tm;")
	public static Class337 aClass337_68 = null;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3767(@OriginalArg(1) long arg0) {
		Static21.aCalendar1.setTime(new Date(arg0));
		@Pc(21) int local21 = Static21.aCalendar1.get(7);
		@Pc(25) int local25 = Static21.aCalendar1.get(5);
		@Pc(29) int local29 = Static21.aCalendar1.get(2);
		@Pc(33) int local33 = Static21.aCalendar1.get(1);
		@Pc(37) int local37 = Static21.aCalendar1.get(11);
		@Pc(41) int local41 = Static21.aCalendar1.get(12);
		@Pc(45) int local45 = Static21.aCalendar1.get(13);
		return Static235.aStringArray29[local21 - 1] + ", " + local25 / 10 + local25 % 10 + "-" + Static306.aStringArray35[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method3768(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg1.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(78) char local78;
			if (local19 == '\u0000') {
				local78 = arg2.charAt(local15++);
			} else {
				local78 = local19;
			}
			local17 = Static321.method4873(local62);
			local19 = Static321.method4873(local78);
			local62 = Static604.method8678(arg0, local62);
			local78 = Static604.method8678(arg0, local78);
			if (local78 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local62 != local78) {
					return Static482.method7142(arg0, local62) - Static482.method7142(arg0, local78);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg0 == 2) {
				local13 = local8 - local143 - 1;
				local15 = local11 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(174) char local174 = arg1.charAt(local13);
			@Pc(178) char local178 = arg2.charAt(local15);
			if (local178 != local174 && Character.toUpperCase(local174) != Character.toUpperCase(local178)) {
				local174 = Character.toLowerCase(local174);
				local178 = Character.toLowerCase(local178);
				if (local178 != local174) {
					return Static482.method7142(arg0, local174) - Static482.method7142(arg0, local178);
				}
			}
		}
		@Pc(235) int local235 = local8 - local11;
		if (local235 != 0) {
			return local235;
		}
		for (@Pc(241) int local241 = 0; local241 < local141; local241++) {
			@Pc(247) char local247 = arg1.charAt(local241);
			@Pc(251) char local251 = arg2.charAt(local241);
			if (local247 != local251) {
				return Static482.method7142(arg0, local247) - Static482.method7142(arg0, local251);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!oj;I)V")
	public static void method3770(@OriginalArg(0) Class5_Sub5_Sub15 arg0) {
		if (arg0 == null) {
			return;
		}
		Static84.aClass330_6.method7917(arg0);
		Static491.anInt8293++;
		@Pc(40) Class5_Sub5_Sub4 local40;
		if (arg0.aBoolean473 || "".equals(arg0.aString75)) {
			local40 = new Class5_Sub5_Sub4(arg0.aString75);
			Static140.anInt2437++;
		} else {
			@Pc(48) long local48 = arg0.aLong173;
			for (local40 = (Class5_Sub5_Sub4) Static594.aClass273_45.method6581(local48); local40 != null && !local40.aString26.equals(arg0.aString75); local40 = (Class5_Sub5_Sub4) Static594.aClass273_45.method6582()) {
			}
			if (local40 == null) {
				local40 = (Class5_Sub5_Sub4) Static171.aClass87_94.method1805(local48);
				if (local40 != null && !local40.aString26.equals(arg0.aString75)) {
					local40 = null;
				}
				if (local40 == null) {
					local40 = new Class5_Sub5_Sub4(arg0.aString75);
				}
				Static594.aClass273_45.method6585(local48, local40);
				Static140.anInt2437++;
			}
		}
		if (local40.method1893(arg0)) {
			Static157.method2274(local40);
		}
	}
}
