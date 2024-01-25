import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public static int anInt4404;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Z")
	public static boolean aBoolean294;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public static int anInt4403 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method3890(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			local8 = local12.aString108 + " | ";
			arg0 = local12.aThrowable1;
		} else {
			local8 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local29);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(46) String local46 = local29.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local8 + "| " + local57;
			}
			@Pc(66) int local66 = local60.indexOf(40);
			@Pc(73) int local73 = local60.indexOf(41, local66 + 1);
			@Pc(78) String local78;
			if (local66 == -1) {
				local78 = local60;
			} else {
				local78 = local60.substring(0, local66);
			}
			local78 = local78.trim();
			local78 = local78.substring(local78.lastIndexOf(32) + 1);
			local78 = local78.substring(local78.lastIndexOf(9) + 1);
			local8 = local8 + local78;
			if (local66 != -1 && local73 != -1) {
				@Pc(124) int local124 = local60.indexOf(".java:", local66);
				if (local124 >= 0) {
					local8 = local8 + local60.substring(local124 + 5, local73);
				}
			}
			local8 = local8 + ' ';
		}
	}
}
