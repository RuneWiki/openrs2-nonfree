import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public static int anInt5124;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method4263(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(23) String local23;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local23 = local11.aString126 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local23 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(56) String local56 = local34.toString();
		@Pc(64) BufferedReader local64 = new BufferedReader(new StringReader(local56));
		@Pc(67) String local67 = local64.readLine();
		while (true) {
			@Pc(70) String local70 = local64.readLine();
			if (local70 == null) {
				return local23 + "| " + local67;
			}
			@Pc(76) int local76 = local70.indexOf(40);
			@Pc(83) int local83 = local70.indexOf(41, local76 + 1);
			@Pc(92) String local92;
			if (local76 == -1) {
				local92 = local70;
			} else {
				local92 = local70.substring(0, local76);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local23 = local23 + local92;
			if (local76 != -1 && local83 != -1) {
				@Pc(142) int local142 = local70.indexOf(".java:", local76);
				if (local142 >= 0) {
					local23 = local23 + local70.substring(local142 + 5, local83);
				}
			}
			local23 = local23 + ' ';
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4264(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		while (local12 < local15 && Static566.method7871(arg0.charAt(local12))) {
			local12++;
		}
		while (local15 > local12 && Static566.method7871(arg0.charAt(local15 - 1))) {
			local15--;
		}
		@Pc(62) int local62 = local15 - local12;
		if (local62 < 1 || local62 > 12) {
			return null;
		}
		@Pc(80) StringBuffer local80 = new StringBuffer(local62);
		for (@Pc(82) int local82 = local12; local82 < local15; local82++) {
			@Pc(99) char local99 = arg0.charAt(local82);
			if (Static52.method678(local99)) {
				@Pc(107) char local107 = Static376.method5427(local99);
				if (local107 != '\u0000') {
					local80.append(local107);
				}
			}
		}
		if (local80.length() == 0) {
			return null;
		} else {
			return local80.toString();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIB)Z")
	public static boolean method4266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static119.method2065(arg0, arg1) | (arg0 & 0x70000) != 0 || Static486.method7076(arg0, arg1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)I")
	public static int method4267(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
