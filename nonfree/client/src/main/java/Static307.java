import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_156 = new Class21(8);

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Z")
	public static boolean aBoolean439 = true;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method5312() {
		@Pc(1) Class21 local1 = Static232.aClass21_125;
		synchronized (Static232.aClass21_125) {
			Static232.aClass21_125.method844(5);
		}
		local1 = Static34.aClass21_35;
		synchronized (Static34.aClass21_35) {
			Static34.aClass21_35.method844(5);
		}
		local1 = Static244.aClass21_134;
		synchronized (Static244.aClass21_134) {
			Static244.aClass21_134.method844(5);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public static void method5316() {
		if (Static243.aClass63_6 != null) {
			Static243.aClass63_6.method4625();
			Static194.aClass33_2 = null;
			Static243.aClass63_6 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method5318(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : method5319(arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	private static String method5319(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		for (@Pc(43) int local43 = arg0 / 10; local43 != 0; local43 /= 10) {
			local39++;
		}
		@Pc(58) char[] local58 = new char[local39];
		local58[0] = '+';
		for (@Pc(66) int local66 = local39 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5321(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static270.aClass30_79.anInt1229 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(25) int local25 = 0; local25 < Static243.aClass220_2.anInt6933; local25++) {
			@Pc(32) Class22 local32 = Static243.aClass220_2.method5972(local25);
			if ((!arg1 || local32.aBoolean59) && local32.anInt891 == -1 && local32.anInt863 == -1 && local32.anInt869 == 0 && local32.aString2.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static126.anInt2758 = -1;
					Static171.aShortArray76 = null;
					return;
				}
				if (local14.length <= local16) {
					@Pc(82) short[] local82 = new short[local14.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local16; local84++) {
						local82[local84] = local14[local84];
					}
					local14 = local82;
				}
				local14[local16++] = (short) local25;
			}
		}
		Static105.anInt2399 = 0;
		Static171.aShortArray76 = local14;
		Static126.anInt2758 = local16;
		@Pc(122) String[] local122 = new String[Static126.anInt2758];
		for (@Pc(124) int local124 = 0; local124 < Static126.anInt2758; local124++) {
			local122[local124] = Static243.aClass220_2.method5972(local14[local124]).aString2;
		}
		Static176.method5670(Static171.aShortArray76, local122);
		Static270.aClass30_79.method1166();
		Static270.aClass30_79.anInt1229 = 2;
	}
}
