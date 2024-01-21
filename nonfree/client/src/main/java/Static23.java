import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	public static int anInt699 = 0;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ea;")
	public static Class18 aClass18_201 = Static8.method128("nav");

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!ea;")
	public static Class18 aClass18_202 = Static8.method128("cross");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_203 = Static8.method128(")3");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_3 = new Class66(64);

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt710 = 0;

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	public static void method424() {
		aClass66_3 = null;
		aClass18_201 = null;
		aClass18_202 = null;
		aClass18_203 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method427(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local6 = local11.aString1 + " | ";
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(53) String local53 = local28.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local6 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(91) String local91 = local67.substring(local73 + 1, local80);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local6 = local6 + local91 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local6 = local6 + local67 + ' ';
			}
		}
	}
}
