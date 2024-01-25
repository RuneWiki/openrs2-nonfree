import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method3079(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(22) String local22;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(9) RuntimeException_Sub1 local9 = (RuntimeException_Sub1) arg0;
			arg0 = local9.aThrowable1;
			local22 = local9.aString34 + " | ";
		} else {
			local22 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local29);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(42) String local42 = local29.toString();
		@Pc(50) BufferedReader local50 = new BufferedReader(new StringReader(local42));
		@Pc(53) String local53 = local50.readLine();
		while (true) {
			@Pc(56) String local56 = local50.readLine();
			if (local56 == null) {
				return local22 + "| " + local53;
			}
			@Pc(62) int local62 = local56.indexOf(40);
			@Pc(69) int local69 = local56.indexOf(41, local62 + 1);
			@Pc(78) String local78;
			if (local62 == -1) {
				local78 = local56;
			} else {
				local78 = local56.substring(0, local62);
			}
			local78 = local78.trim();
			local78 = local78.substring(local78.lastIndexOf(32) + 1);
			local78 = local78.substring(local78.lastIndexOf(9) + 1);
			local22 = local22 + local78;
			if (local62 != -1 && local69 != -1) {
				@Pc(120) int local120 = local56.indexOf(".java:", local62);
				if (local120 >= 0) {
					local22 = local22 + local56.substring(local120 + 5, local69);
				}
			}
			local22 = local22 + ' ';
		}
	}
}
