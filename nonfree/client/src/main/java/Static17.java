import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!d", name = "K", descriptor = "Lclient!pa;")
	public static Class51 aClass51_11;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_3;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!ke;")
	private static Class39 aClass39_254 = Static2.method66("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	public static int anInt489 = 0;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "Lclient!ke;")
	public static Class39 aClass39_255 = Static2.method66("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_256 = Static2.method66("blinken1:");

	@OriginalMember(owner = "client!d", name = "E", descriptor = "Lclient!ke;")
	public static Class39 aClass39_257 = Static2.method66("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!ke;")
	public static Class39 aClass39_258 = Static2.method66("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!d", name = "W", descriptor = "Lclient!ke;")
	private static Class39 aClass39_262 = Static2.method66("No reply from loginserver)3");

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!ke;")
	public static Class39 aClass39_259 = aClass39_262;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "Lclient!ke;")
	public static Class39 aClass39_260 = aClass39_254;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "Lclient!ke;")
	private static Class39 aClass39_263 = Static2.method66("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!ke;")
	public static Class39 aClass39_261 = aClass39_263;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method393() {
		aClass2_Sub1_Sub4_Sub3_3 = null;
		aClass39_263 = null;
		aClass39_262 = null;
		aClass39_255 = null;
		aClass39_261 = null;
		aClass39_260 = null;
		aClass51_11 = null;
		aClass39_257 = null;
		aClass39_254 = null;
		aClass2_Sub1_Sub4_Sub3_2 = null;
		aClass39_256 = null;
		aClass39_258 = null;
		aClass39_259 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method394(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local6 = local11.aString8 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local6 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local6 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local6 = local6 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local6 = local6 + local64 + ' ';
			}
		}
	}
}
