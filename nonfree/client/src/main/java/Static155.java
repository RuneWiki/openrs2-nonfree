import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1210;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
	public static int anInt3423;

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lclient!w;")
	public static Class123 aClass123_9 = new Class123(64);

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1208 = Static64.method1101("<img=0>");

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1211 = Static64.method1101("Select");

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1209 = aClass51_1211;

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
	public static int anInt3422 = -1;

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
	public static int anInt3424 = 255;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	public static void method2672() {
		Static127.aClass53_20.method1498();
		Static208.aClass53_28.method1498();
		Static118.aClass53_19.method1498();
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
	public static void method2673() {
		if (Static47.anInt1142 == 30) {
			Static142.method2482(25);
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Z")
	public static boolean method2674(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2675(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString7 + " | ";
		} else {
			local20 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local20 + "| " + local56;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local20 = local20 + local94 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local20 = local20 + local64 + ' ';
			}
		}
	}
}
