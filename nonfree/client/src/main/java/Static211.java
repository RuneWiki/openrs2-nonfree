import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ip", name = "Db", descriptor = "I")
	public static int anInt4657;

	@OriginalMember(owner = "client!ip", name = "yb", descriptor = "[J")
	public static final long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!ip", name = "Cb", descriptor = "I")
	public static int anInt4656 = 0;

	@OriginalMember(owner = "client!ip", name = "Hb", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3965(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString13 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
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
				return local21 + "| " + local56;
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
			local21 = local21 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local21 = local21 + local64.substring(local129 + 5, local77);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
