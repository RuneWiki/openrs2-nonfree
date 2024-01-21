import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "[Lclient!fc;")
	public static Class29[] aClass29Array7;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public static volatile int anInt3534 = 0;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1017 = Static181.method2795("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1016 = aClass83_1017;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1020 = Static181.method2795("OFF");

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1018 = aClass83_1020;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public static int anInt3536 = -1;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1019 = Static181.method2795("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt3539 = 0;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public static int anInt3540 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method2657(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString4 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(49) String local49 = local32.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			while (true) {
				@Pc(63) String local63 = local57.readLine();
				if (local63 == null) {
					return local21 + "| " + local60;
				}
				@Pc(69) int local69 = local63.indexOf(40);
				@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
				if (local69 >= 0 && local76 >= 0) {
					@Pc(87) String local87 = local63.substring(local69 + 1, local76);
					@Pc(91) int local91 = local87.indexOf(".java:");
					if (local91 >= 0) {
						local87 = local87.substring(0, local91) + local87.substring(local91 + 5);
						local21 = local21 + local87 + ' ';
						continue;
					}
					local63 = local63.substring(0, local69);
				}
				local63 = local63.trim();
				local63 = local63.substring(local63.lastIndexOf(32) + 1);
				local63 = local63.substring(local63.lastIndexOf(9) + 1);
				local21 = local21 + local63 + ' ';
			}
		}
	}
}
