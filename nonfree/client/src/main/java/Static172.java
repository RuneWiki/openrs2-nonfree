import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!sa;")
	public static Class3_Sub3_Sub2_Sub3 aClass3_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_94 = new Class10();

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1646 = Static193.method3027("(U0a )2 in: ");

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1647 = Static193.method3027("::gc");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt3461 = 1;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1648 = Static193.method3027("<col=ffb000>");

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public static int anInt3462 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2606(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			arg0 = local12.aThrowable1;
			local8 = local12.aString1 + " | ";
		} else {
			local8 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local29);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local8 + "| " + local58;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(88) String local88 = local61.substring(local67 + 1, local74);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local8 = local8 + local88 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local8 = local8 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method2607() {
		Static156.aClass85_32.method2557();
	}
}
