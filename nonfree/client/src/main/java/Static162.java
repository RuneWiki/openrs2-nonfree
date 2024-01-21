import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "[I")
	public static int[] anIntArray377 = new int[50];

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1137 = Static38.method685("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lclient!dd;")
	public static Class17 aClass17_25 = new Class17(50);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2602(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString2 + " | ";
		} else {
			local20 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local20 + "| " + local61;
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!wa;I)Z")
	public static boolean method2603(@OriginalArg(0) Class87 arg0) {
		@Pc(6) int local6 = arg0.anInt4101;
		if (local6 == 205) {
			Static132.anInt3074 = 250;
			return true;
		}
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (local6 >= 300 && local6 <= 313) {
			local27 = (local6 - 300) / 2;
			local31 = local6 & 0x1;
			Static144.aClass55_2.method1699(local31 == 1, local27);
		}
		if (local6 >= 314 && local6 <= 323) {
			local27 = (local6 - 314) / 2;
			local31 = local6 & 0x1;
			Static144.aClass55_2.method1700(local27, local31 == 1);
		}
		if (local6 == 324) {
			Static144.aClass55_2.method1702(false);
		}
		if (local6 == 325) {
			Static144.aClass55_2.method1702(true);
		}
		if (local6 == 326) {
			Static66.aClass2_Sub13_Sub1_2.method1455(202);
			Static144.aClass55_2.method1708(Static66.aClass2_Sub13_Sub1_2);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method2604() {
		aClass17_25 = null;
		anIntArray377 = null;
		aShortArray32 = null;
		aClass6_1137 = null;
	}
}
