import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	public static int anInt4096;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "Lclient!lh;")
	public static Class210 aClass210_5;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	public static int anInt4081 = 1;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_89 = new Class136(24, 3);

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_90 = new Class136(31, -1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3720(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString109 + " | ";
		} else {
			local24 = "";
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
				return local24 + "| " + local61;
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
			local24 = local24 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local24 = local24 + local64.substring(local130 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
