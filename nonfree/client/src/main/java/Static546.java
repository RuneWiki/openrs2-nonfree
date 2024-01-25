import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!rea", name = "L", descriptor = "[I")
	public static final int[] anIntArray608 = new int[1];

	@OriginalMember(owner = "client!rea", name = "H", descriptor = "[I")
	public static final int[] anIntArray609 = new int[2];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method7629(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(23) String local23;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local23 = local11.aString117 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local23 = "";
		}
		@Pc(41) StringWriter local41 = new StringWriter();
		@Pc(46) PrintWriter local46 = new PrintWriter(local41);
		arg0.printStackTrace(local46);
		local46.close();
		@Pc(54) String local54 = local41.toString();
		@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local54));
		@Pc(65) String local65 = local62.readLine();
		while (true) {
			@Pc(68) String local68 = local62.readLine();
			if (local68 == null) {
				return local23 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(91) String local91;
			if (local74 == -1) {
				local91 = local68;
			} else {
				local91 = local68.substring(0, local74);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local23 = local23 + local91;
			if (local74 != -1 && local81 != -1) {
				@Pc(143) int local143 = local68.indexOf(".java:", local74);
				if (local143 >= 0) {
					local23 = local23 + local68.substring(local143 + 5, local81);
				}
			}
			local23 = local23 + ' ';
		}
	}
}
