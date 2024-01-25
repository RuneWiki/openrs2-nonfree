import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!bi;")
	public static Class31 aClass31_52;

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "[Lclient!to;")
	public static final Class319[] aClass319Array1 = new Class319[2048];

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[50][];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method3990(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString85 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(77) String local77;
			if (local65 == -1) {
				local77 = local59;
			} else {
				local77 = local59.substring(0, local65);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local10 = local10 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(124) int local124 = local59.indexOf(".java:", local65);
				if (local124 >= 0) {
					local10 = local10 + local59.substring(local124 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZJ)V")
	public static void method3992(@OriginalArg(1) long arg0) {
		if (Static309.aClass100ArrayArrayArray2 != null) {
			if (Static555.anInt9335 == 1 || Static555.anInt9335 == 5) {
				Static363.method5451(arg0);
			} else if (Static555.anInt9335 == 4) {
				Static473.method6594(arg0);
			}
		}
		Static397.method5793((long) Static237.anInt7561, Static185.aClass66_14);
		if (Static249.anInt4945 != -1) {
			Static421.method7824(Static249.anInt4945);
		}
		for (@Pc(41) int local41 = 0; local41 < Static433.anInt7419; local41++) {
			if (Static271.aBooleanArray21[local41]) {
				Static424.aBooleanArray30[local41] = true;
			}
			Static231.aBooleanArray19[local41] = Static271.aBooleanArray21[local41];
			Static271.aBooleanArray21[local41] = false;
		}
		Static412.anInt7139 = Static237.anInt7561;
		if (Static185.aClass66_14.method6834()) {
			Static309.aBoolean424 = true;
		}
		if (Static249.anInt4945 != -1) {
			Static433.anInt7419 = 0;
			Static444.method6279();
		}
		Static185.aClass66_14.F();
		Static430.method6122(Static185.aClass66_14);
		@Pc(91) int local91 = Static268.method4361();
		if (local91 == -1) {
			local91 = Static485.anInt8162;
		}
		if (local91 == -1) {
			local91 = Static514.anInt8838;
		}
		Static436.method6199(local91);
		Static77.method1360(Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929, Static426.anInt7338);
		Static426.anInt7338 = 0;
	}
}
