import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!bca;")
	public static final Class26 aClass26_8 = new Class26("", 13);

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_91 = new Class181(8, -1);

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public static int anInt7916 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!jo;)V")
	public static void method6620(@OriginalArg(1) Class168 arg0) {
		Static129.anInt2834 = arg0.method4432("p11_full");
		Static523.anInt9090 = arg0.method4432("p12_full");
		Static323.anInt6114 = arg0.method4432("b12_full");
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method6621(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString61 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(81) String local81;
			if (local65 == -1) {
				local81 = local59;
			} else {
				local81 = local59.substring(0, local65);
			}
			local81 = local81.trim();
			local81 = local81.substring(local81.lastIndexOf(32) + 1);
			local81 = local81.substring(local81.lastIndexOf(9) + 1);
			local10 = local10 + local81;
			if (local65 != -1 && local72 != -1) {
				@Pc(126) int local126 = local59.indexOf(".java:", local65);
				if (local126 >= 0) {
					local10 = local10 + local59.substring(local126 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
