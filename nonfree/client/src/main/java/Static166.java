import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "Lclient!mj;")
	public static Class202 aClass202_9;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "[I")
	public static final int[] anIntArray370 = new int[13];

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_6 = new Class195("", 15);

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	public static int anInt4489 = -1;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3816(@OriginalArg(0) String arg0) {
		return Static109.method2940(arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IC)C")
	public static char method3817(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method3819(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(22) RuntimeException_Sub1 local22 = (RuntimeException_Sub1) arg0;
			local17 = local22.aString33 + " | ";
			arg0 = local22.aThrowable1;
		} else {
			local17 = "";
		}
		@Pc(39) StringWriter local39 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local39);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local39.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local17 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(87) String local87;
			if (local72 == -1) {
				local87 = local66;
			} else {
				local87 = local66.substring(0, local72);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local17 = local17 + local87;
			if (local72 != -1 && local79 != -1) {
				@Pc(131) int local131 = local66.indexOf(".java:", local72);
				if (local131 >= 0) {
					local17 = local17 + local66.substring(local131 + 5, local79);
				}
			}
			local17 = local17 + ' ';
		}
	}
}
