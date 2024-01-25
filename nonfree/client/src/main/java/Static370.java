import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!oea", name = "D", descriptor = "Lclient!lf;")
	public static Class204 aClass204_5;

	@OriginalMember(owner = "client!oea", name = "I", descriptor = "Lclient!sea;")
	public static Class308 aClass308_131;

	@OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
	public static int anInt6680 = 0;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(III)V")
	public static void method5418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 13);
		local8.method4833();
		local8.anInt5968 = arg1;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIJZB)Ljava/lang/String;")
	public static String method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local22 = true;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg0 > 0) {
			for (local50 = 0; local50 < arg0; local50++) {
				local55 = (int) arg2;
				arg2 /= 10L;
				local38.append((char) (local55 + 48 - (int) arg2 * 10));
			}
			local38.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg2;
			arg2 /= 10L;
			local38.append((char) (local55 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local22) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg3) {
				local50++;
				if (local50 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "(I)Lclient!sc;")
	public static Class105 method5422() {
		try {
			return (Class105) Class.forName("Class105_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
