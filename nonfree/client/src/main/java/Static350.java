import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public static int anInt5894;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!tr;")
	public static Class110 aClass110_18;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_14 = new Class68(8, 3);

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public static final int anInt5899 = 12;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Z")
	public static boolean aBoolean451 = true;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!us;")
	public static final Class234 aClass234_120 = new Class234(31, 3);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZI)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static97.method1633(arg0, Static272.anInt4750, Static26.anInt345);
		@Pc(17) int local17 = Static97.method1633(arg3, Static272.anInt4750, Static26.anInt345);
		@Pc(23) int local23 = Static97.method1633(arg1, Static365.anInt6140, Static221.anInt3917);
		@Pc(29) int local29 = Static97.method1633(arg4, Static365.anInt6140, Static221.anInt3917);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static349.method5265(local23, local29, arg2, Static325.anIntArrayArray50[local31]);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!dt;)Ljava/lang/String;")
	public static String method5270(@OriginalArg(1) Class62 arg0) {
		if (Static48.method915(arg0).method5603() == 0) {
			return null;
		} else if (arg0.aString19 == null || arg0.aString19.trim().length() == 0) {
			return Static75.aBoolean129 ? "Hidden-use" : null;
		} else {
			return arg0.aString19;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method5274(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(20) RuntimeException_Sub1 local20 = (RuntimeException_Sub1) arg0;
			arg0 = local20.aThrowable1;
			local15 = local20.aString26 + " | ";
		} else {
			local15 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local15 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local64;
			} else {
				local82 = local64.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local15 = local15 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local15 = local15 + local64.substring(local129 + 5, local77);
				}
			}
			local15 = local15 + ' ';
		}
	}
}
