import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	public static int anInt148;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	public static int anInt150 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method71() {
		for (@Pc(14) Class1_Sub19 local14 = (Class1_Sub19) Static96.aClass31_54.method1000(); local14 != null; local14 = (Class1_Sub19) Static96.aClass31_54.method1003()) {
			if (local14.anInt2828 == -1) {
				local14.anInt2837 = 0;
				Static105.method1879(local14);
			} else {
				local14.method2128();
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!q;Lclient!kd;Lclient!kd;)[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] method72(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(8) int local8 = arg0.method2015(arg1);
		@Pc(21) int local21 = arg0.method2012(local8, arg2);
		return Static118.method2044(local21, arg0, local8);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B)[B")
	public static byte[] method73(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub18 local8 = new Class1_Sub18(arg0);
		@Pc(12) int local12 = local8.method2169();
		@Pc(16) int local16 = local8.method2185();
		if (local16 < 0 || Static2.anInt129 != 0 && Static2.anInt129 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(82) byte[] local82 = new byte[local16];
			local8.method2167(local82, local16);
			return local82;
		} else {
			@Pc(44) int local44 = local8.method2185();
			if (local44 < 0 || Static2.anInt129 != 0 && Static2.anInt129 < local44) {
				throw new RuntimeException();
			}
			@Pc(61) byte[] local61 = new byte[local44];
			if (local12 == 1) {
				Static61.method1118(local61, local44, arg0, local16);
			} else {
				Static108.aClass64_1.method1821(local8, local61);
			}
			return local61;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	public static int method74(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(15) int local15 = method74(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			return local15;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method75(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local6 = local11.aString2 + " | ";
		} else {
			local6 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local6 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local6 = local6 + local94 + ' ';
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
