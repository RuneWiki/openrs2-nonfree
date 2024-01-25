import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Z")
	public static boolean aBoolean720 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method8505(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(22) String local22;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(9) RuntimeException_Sub1 local9 = (RuntimeException_Sub1) arg0;
			arg0 = local9.aThrowable1;
			local22 = local9.aString24 + " | ";
		} else {
			local22 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local29);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(42) String local42 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local42));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local22 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(80) String local80;
			if (local67 == -1) {
				local80 = local61;
			} else {
				local80 = local61.substring(0, local67);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local22 = local22 + local80;
			if (local67 != -1 && local74 != -1) {
				@Pc(126) int local126 = local61.indexOf(".java:", local67);
				if (local126 >= 0) {
					local22 = local22 + local61.substring(local126 + 5, local74);
				}
			}
			local22 = local22 + ' ';
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method8506(@OriginalArg(1) String arg0) {
		if (Class33_Sub26.aString102.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class33_Sub26.aString102.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class33_Sub26.aString102.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
