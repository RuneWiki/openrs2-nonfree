import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "Lclient!rn;")
	public static Class155 aClass155_37;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "Lclient!rn;")
	public static Class155 aClass155_38;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public static int anInt1533 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[II[I)V")
	public static void method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg1];
		arg2[arg1] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg1; local47++) {
			if (arg3[local47] > (local47 & 0x1) + local21) {
				@Pc(68) int local68 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17] = local68;
				@Pc(82) int local82 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local82;
			}
		}
		arg3[arg1] = arg3[local17];
		arg3[local17] = local21;
		arg2[arg1] = arg2[local17];
		arg2[local17] = local35;
		method1253(arg0, local17 - 1, arg2, arg3);
		method1253(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1255(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString16 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(65) String local65 = local53.readLine();
			if (local65 == null) {
				return local24 + "| " + local56;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(86) String local86;
			if (local73 == -1) {
				local86 = local65;
			} else {
				local86 = local65.substring(0, local73);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local24 = local24 + local86;
			if (local73 != -1 && local80 != -1) {
				@Pc(133) int local133 = local65.indexOf(".java:", local73);
				if (local133 >= 0) {
					local24 = local24 + local65.substring(local133 + 5, local80);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
