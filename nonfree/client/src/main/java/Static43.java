import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_89 = new Class237(43, -2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4229(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method4231(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString56 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local10 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local10 = local10 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(128) int local128 = local64.indexOf(".java:", local70);
				if (local128 >= 0) {
					local10 = local10 + local64.substring(local128 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
