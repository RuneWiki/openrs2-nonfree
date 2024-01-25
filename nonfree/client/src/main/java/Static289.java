import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
	public static final int[] anIntArray549 = new int[100];

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
	public static boolean aBoolean472 = true;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_51 = new Class109(500);

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Lclient!ka;")
	public static Class109 aClass109_52 = new Class109(128);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([I[IIII)V")
	public static void method5013(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg3) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) int local28 = arg1[local22];
		arg1[local22] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(42) int local42 = arg0[local22];
		arg0[local22] = arg0[arg3];
		arg0[arg3] = local42;
		for (@Pc(54) int local54 = arg2; local54 < arg3; local54++) {
			if (arg1[local54] < local28 + (local54 & 0x1)) {
				@Pc(74) int local74 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24] = local74;
				@Pc(88) int local88 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24++] = local88;
			}
		}
		arg1[arg3] = arg1[local24];
		arg1[local24] = local28;
		arg0[arg3] = arg0[local24];
		arg0[local24] = local42;
		method5013(arg0, arg1, arg2, local24 - 1);
		method5013(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5015(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static312.method5459(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local12 && Static312.method5459(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(49) int local49 = local12 - local9;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local9; local66 < local12; local66++) {
			@Pc(71) char local71 = arg0.charAt(local66);
			if (Static26.method479(local71)) {
				@Pc(79) char local79 = Static196.method3472(local71);
				if (local79 != '\u0000') {
					local64.append(local79);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5016(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 3);
		local8.method850();
		local8.aString7 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5017(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static164.aCharArray1[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
