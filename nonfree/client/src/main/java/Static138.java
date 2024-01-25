import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!vo;Lclient!pda;Lclient!vo;Lclient!vo;Lclient!pn;)Z")
	public static boolean method2484(@OriginalArg(1) Class348 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class348 arg2, @OriginalArg(4) Class348 arg3, @OriginalArg(5) Class4_Sub21_Sub4 arg4) {
		Static197.aClass15_1 = arg1;
		Static53.aClass348_129 = arg2;
		Static478.aClass348_112 = arg0;
		Static550.aClass348_125 = arg3;
		Static365.aClass4_Sub21_Sub4_6 = arg4;
		for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
			Static364.anIntArray391[local22] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2485(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString179 + " | ";
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
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local10 + "| " + local56;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local64;
			} else {
				local82 = local64.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local10 = local10 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local10 = local10 + local64.substring(local130 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
