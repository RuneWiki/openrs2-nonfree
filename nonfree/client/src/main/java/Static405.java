import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lclient!fa;")
	public static Interface5 anInterface5_9;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "Lclient!ida;")
	public static Class153 aClass153_2;

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
	public static int anInt7060 = 0;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method5913(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(18) String local18;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(23) RuntimeException_Sub1 local23 = (RuntimeException_Sub1) arg0;
			arg0 = local23.aThrowable1;
			local18 = local23.aString51 + " | ";
		} else {
			local18 = "";
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
				return local18 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(86) String local86;
			if (local73 == -1) {
				local86 = local67;
			} else {
				local86 = local67.substring(0, local73);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local18 = local18 + local86;
			if (local73 != -1 && local80 != -1) {
				@Pc(133) int local133 = local67.indexOf(".java:", local73);
				if (local133 >= 0) {
					local18 = local18 + local67.substring(local133 + 5, local80);
				}
			}
			local18 = local18 + ' ';
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 512 || arg1 < 512 || Static188.anInt3850 * 512 - 1024 < arg6 || (Static49.anInt1174 - 2) * 512 < arg1) {
			Static318.anIntArray418[0] = Static318.anIntArray418[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static524.method7217(arg6, arg4, arg1) - arg0;
		Static509.aClass68_7.U(arg2, 0, 0);
		Static307.aClass100_6.method6217(Static509.aClass68_7);
		Static307.aClass100_6.AA(arg6, local50, arg1, Static318.anIntArray418);
		Static509.aClass68_7.U(-arg2, 0, 0);
		Static307.aClass100_6.method6217(Static509.aClass68_7);
	}
}
