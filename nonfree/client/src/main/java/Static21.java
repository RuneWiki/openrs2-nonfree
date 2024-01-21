import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
	public static int anInt622;

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_351 = Static28.method504("welle2:");

	@OriginalMember(owner = "client!db", name = "Sb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_353 = Static28.method504(": ");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method407(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local6 = local11.aString5 + " | ";
		} else {
			local6 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local6 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(88) String local88 = local64.substring(local70 + 1, local77);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local6 = local6 + local88 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local6 = local6 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public static void method414() {
		aClass39_353 = null;
		anIntArray61 = null;
		aClass39_351 = null;
	}
}
