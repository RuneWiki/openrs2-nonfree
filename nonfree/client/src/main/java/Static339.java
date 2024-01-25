import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
	public static boolean aBoolean677;

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
	public static int anInt9925 = 0;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
	public static int anInt9927 = -1;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method8375(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(29) String local29;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			arg0 = local16.aThrowable1;
			local29 = local16.aString27 + " | ";
		} else {
			local29 = "";
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
				return local29 + "| " + local61;
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
			local29 = local29 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local29 = local29 + local64.substring(local129 + 5, local77);
				}
			}
			local29 = local29 + ' ';
		}
	}
}
