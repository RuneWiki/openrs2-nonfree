import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "[I")
	public static final int[] anIntArray541 = new int[25];

	@OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
	public static int anInt6502 = -1;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString243 = "Examine";

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString244 = "Choose Option";

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "[Lclient!nh;")
	public static final Class143[] aClass143Array1 = new Class143[50];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[[[Lclient!dh;)V")
	public static void method5494(@OriginalArg(1) Class45[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class45[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class45 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass5_Sub3_1 instanceof Interface5) {
							((Interface5) local32.aClass5_Sub3_1).method5343();
						}
						if (local32.aClass5_Sub1_1 instanceof Interface5) {
							((Interface5) local32.aClass5_Sub1_1).method5343();
						}
						if (local32.aClass5_Sub1_2 instanceof Interface5) {
							((Interface5) local32.aClass5_Sub1_2).method5343();
						}
						if (local32.aClass5_Sub5_1 instanceof Interface5) {
							((Interface5) local32.aClass5_Sub5_1).method5343();
						}
						if (local32.aClass5_Sub5_2 instanceof Interface5) {
							((Interface5) local32.aClass5_Sub5_2).method5343();
						}
						for (@Pc(82) Class160 local82 = local32.aClass160_1; local82 != null; local82 = local82.aClass160_3) {
							@Pc(87) Class5_Sub4 local87 = local82.aClass5_Sub4_1;
							if (local87 instanceof Interface5) {
								((Interface5) local87).method5343();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method5495(@OriginalArg(0) Class5_Sub4_Sub4 arg0) {
		if (arg0 instanceof Class5_Sub4_Sub4_Sub2) {
			@Pc(15) Class5_Sub4_Sub4_Sub2 local15 = (Class5_Sub4_Sub4_Sub2) arg0;
			if (local15.aClass119_1 != null) {
				Static77.method1166(local15);
			}
		} else if (arg0 instanceof Class5_Sub4_Sub4_Sub1) {
			Static277.method4639((Class5_Sub4_Sub4_Sub1) arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5496(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static291.aClass3_Sub4_Sub2_3.method3682(95);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0));
			Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5497(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
