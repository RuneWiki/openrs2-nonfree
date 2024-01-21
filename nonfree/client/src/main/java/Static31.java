import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!w;")
	public static Class15 aClass15_17;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "[Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2[] aClass10_Sub1_Sub1_Sub2Array3;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!va;")
	private static Class61 aClass61_371 = Static88.method1421("Add friend");

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!va;")
	public static Class61 aClass61_370 = aClass61_371;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!va;")
	public static Class61 aClass61_372 = Static88.method1421("q8_full");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method556() {
		aClass61_370 = null;
		aClass15_17 = null;
		aClass61_372 = null;
		aClass61_371 = null;
		aClass10_Sub1_Sub1_Sub2Array3 = null;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	public static int method557() {
		return 19;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method559(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			local17 = local7.aString1 + " | ";
			arg0 = local7.aThrowable1;
		} else {
			local17 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local41));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local17 + "| " + local56;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local17 = local17 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local17 = local17 + local64 + ' ';
			}
		}
	}
}
