import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "F")
	public static float aFloat283;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Lclient!tj;")
	public static Class4 aClass4_13;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_54 = new Class307(8);

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_13 = new Class6();

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method8546(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString17 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local24 = local24 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local24 = local24 + local64.substring(local129 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZBLjava/io/File;)V")
	public static void method8547(@OriginalArg(2) File arg0) {
		if (Static365.anObject11 == null) {
			Static509.method7393();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static365.anObject11, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(59) Exception local59) {
			System.out.println("HeapDump error:");
			local59.printStackTrace();
		}
	}
}
