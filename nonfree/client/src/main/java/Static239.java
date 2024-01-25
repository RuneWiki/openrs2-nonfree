import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
	public static final int anInt2804 = 205;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method2540(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString40 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local45));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local24 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(85) String local85;
			if (local73 == -1) {
				local85 = local67;
			} else {
				local85 = local67.substring(0, local73);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local24 = local24 + local85;
			if (local73 != -1 && local80 != -1) {
				@Pc(132) int local132 = local67.indexOf(".java:", local73);
				if (local132 >= 0) {
					local24 = local24 + local67.substring(local132 + 5, local80);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
