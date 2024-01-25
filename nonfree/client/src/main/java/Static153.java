import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_44 = new Class146(39, 15);

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2172(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString5 + " | ";
		} else {
			local24 = "";
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
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local24 = local24 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local24 = local24 + local64.substring(local130 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
