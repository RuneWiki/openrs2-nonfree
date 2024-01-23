import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	public static int anInt938 = -1;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	public static int anInt939 = -1;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Lclient!hh;")
	private static Class50 aClass50_331 = Static186.method3527("Unable to find ");

	@OriginalMember(owner = "client!di", name = "u", descriptor = "Lclient!hh;")
	public static Class50 aClass50_333 = aClass50_331;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!hh;")
	public static Class50 aClass50_334 = Static186.method3527("0(U");

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_335 = Static186.method3527("<col=00ffff>");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method689(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString3 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local21 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local21 = local21 + local94 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local21 = local21 + local64 + ' ';
			}
		}
	}
}
