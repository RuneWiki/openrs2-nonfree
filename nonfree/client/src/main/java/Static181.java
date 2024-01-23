import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt4311 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[104][104];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3180(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(25) String local25;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local25 = local15.aString9 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local25 = "";
		}
		@Pc(36) StringWriter local36 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local36);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local36.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			while (true) {
				@Pc(63) String local63 = local57.readLine();
				if (local63 == null) {
					return local25 + "| " + local60;
				}
				@Pc(69) int local69 = local63.indexOf(40);
				@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
				if (local69 >= 0 && local76 >= 0) {
					@Pc(90) String local90 = local63.substring(local69 + 1, local76);
					@Pc(94) int local94 = local90.indexOf(".java:");
					if (local94 >= 0) {
						local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
						local25 = local25 + local90 + ' ';
						continue;
					}
					local63 = local63.substring(0, local69);
				}
				local63 = local63.trim();
				local63 = local63.substring(local63.lastIndexOf(32) + 1);
				local63 = local63.substring(local63.lastIndexOf(9) + 1);
				local25 = local25 + local63 + ' ';
			}
		}
	}
}
