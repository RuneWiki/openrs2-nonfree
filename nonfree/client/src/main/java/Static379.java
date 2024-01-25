import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "J")
	public static long aLong201;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
	public static int anInt6500;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public static int anInt6501;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Z")
	public static boolean aBoolean502 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method5556(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(16) String local16;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(21) RuntimeException_Sub1 local21 = (RuntimeException_Sub1) arg0;
			local16 = local21.aString137 + " | ";
			arg0 = local21.aThrowable1;
		} else {
			local16 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local16 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(92) String local92;
			if (local73 == -1) {
				local92 = local67;
			} else {
				local92 = local67.substring(0, local73);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local16 = local16 + local92;
			if (local73 != -1 && local80 != -1) {
				@Pc(140) int local140 = local67.indexOf(".java:", local73);
				if (local140 >= 0) {
					local16 = local16 + local67.substring(local140 + 5, local80);
				}
			}
			local16 = local16 + ' ';
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(JJ)J")
	public static long method5558(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
