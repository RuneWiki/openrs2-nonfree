import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mc", name = "Bb", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!mc", name = "Db", descriptor = "I")
	public static int anInt9292;

	@OriginalMember(owner = "client!mc", name = "Fb", descriptor = "Lclient!pu;")
	public static Class50 aClass50_34;

	@OriginalMember(owner = "client!mc", name = "rb", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_63 = new Class114();

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method7862(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			local8 = local12.aString12 + " | ";
			arg0 = local12.aThrowable1;
		} else {
			local8 = "";
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
				return local8 + "| " + local53;
			}
			@Pc(62) int local62 = local56.indexOf(40);
			@Pc(69) int local69 = local56.indexOf(41, local62 + 1);
			@Pc(77) String local77;
			if (local62 == -1) {
				local77 = local56;
			} else {
				local77 = local56.substring(0, local62);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local8 = local8 + local77;
			if (local62 != -1 && local69 != -1) {
				@Pc(119) int local119 = local56.indexOf(".java:", local62);
				if (local119 >= 0) {
					local8 = local8 + local56.substring(local119 + 5, local69);
				}
			}
			local8 = local8 + ' ';
		}
	}
}
