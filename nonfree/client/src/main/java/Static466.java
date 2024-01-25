import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!pp", name = "R", descriptor = "Lclient!wv;")
	public static Class2_Sub55 aClass2_Sub55_1;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_81 = new Class341(89, 2);

	@OriginalMember(owner = "client!pp", name = "Q", descriptor = "Lclient!bn;")
	public static final Class37 aClass37_9 = new Class37("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method7482(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString99 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local24 + "| " + local56;
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

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(DB)V")
	public static void method7484(@OriginalArg(0) double arg0) {
		Static25.aClass76_1.method9629(Static568.aClass76_15);
		Static25.aClass76_1.method9640(0, 0, (int) arg0);
		Static435.aClass101_11.method8067(Static25.aClass76_1);
	}
}
