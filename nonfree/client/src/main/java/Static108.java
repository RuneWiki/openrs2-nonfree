import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static int anInt3456;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt3458;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Z")
	public static boolean aBoolean266;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt3455 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2811(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			local8 = local12.aString49 + " | ";
			arg0 = local12.aThrowable1;
		} else {
			local8 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local29);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(47) String local47 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local8 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(82) String local82;
			if (local67 == -1) {
				local82 = local61;
			} else {
				local82 = local61.substring(0, local67);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local8 = local8 + local82;
			if (local67 != -1 && local74 != -1) {
				@Pc(125) int local125 = local61.indexOf(".java:", local67);
				if (local125 >= 0) {
					local8 = local8 + local61.substring(local125 + 5, local74);
				}
			}
			local8 = local8 + ' ';
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V")
	public static void method2814(@OriginalArg(0) boolean arg0) {
		Static143.method2556();
		if (Static142.anInt3209 != 30 && Static142.anInt3209 != 25) {
			return;
		}
		Static292.anInt5353++;
		if (Static292.anInt5353 < 50 && !arg0) {
			return;
		}
		Static292.anInt5353 = 0;
		if (!Static206.aBoolean328 && Static122.aClass27_1 != null) {
			Static414.method5552(Static198.aClass92_122);
			try {
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
				Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
			} catch (@Pc(54) IOException local54) {
				Static206.aBoolean328 = true;
			}
		}
		Static143.method2556();
	}
}
