import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt6122;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!fi;")
	public static final Class77 aClass77_3 = new Class77(2);

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public static int anInt6124 = 0;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public static int anInt6125 = -1;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt6126 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method4779(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			arg0 = local12.aThrowable1;
			local8 = local12.aString61 + " | ";
		} else {
			local8 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local8 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(79) String local79;
			if (local67 == -1) {
				local79 = local61;
			} else {
				local79 = local61.substring(0, local67);
			}
			local79 = local79.trim();
			local79 = local79.substring(local79.lastIndexOf(32) + 1);
			local79 = local79.substring(local79.lastIndexOf(9) + 1);
			local8 = local8 + local79;
			if (local67 != -1 && local74 != -1) {
				@Pc(125) int local125 = local61.indexOf(".java:", local67);
				if (local125 >= 0) {
					local8 = local8 + local61.substring(local125 + 5, local74);
				}
			}
			local8 = local8 + ' ';
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public static void method4781(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static393.method5080(arg0, 7);
		local13.method3244();
	}
}
