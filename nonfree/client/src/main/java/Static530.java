import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "Lclient!im;")
	public static final Class140 aClass140_145 = new Class140(46, -2);

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
	public static int anInt8918 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIILclient!pa;ILclient!ha;Lclient!jq;)V")
	public static void method7335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2 arg5, @OriginalArg(7) Class156 arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static448.anInt7701 == 4) {
			local14 = (int) Static404.aFloat156 & 0x3FFF;
		} else {
			local14 = Static265.anInt5084 + (int) Static404.aFloat156 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt4732 / 2, arg6.anInt4673 / 2) + 10;
		@Pc(43) int local43 = arg2 * arg2 + arg1 * arg1;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(57) int local57 = Class310.anIntArray827[local14];
		@Pc(61) int local61 = Class310.anIntArray826[local14];
		if (Static448.anInt7701 != 4) {
			local57 = local57 * 256 / (Static316.anInt5814 + 256);
			local61 = local61 * 256 / (Static316.anInt5814 + 256);
		}
		@Pc(96) int local96 = local57 * arg2 + local61 * arg1 >> 14;
		@Pc(107) int local107 = local61 * arg2 - arg1 * local57 >> 14;
		arg5.method7365(arg6.anInt4732 / 2 + arg4 + local96 - arg5.EA() / 2, -local107 + (arg0 - -(arg6.anInt4673 / 2)) - arg5.ma() / 2, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Z")
	public static boolean method7336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method7337(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString19 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local10 + "| " + local61;
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
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local10 = local10 + local64.substring(local129 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ge;II)Ljava/lang/String;")
	public static String method7339(@OriginalArg(0) Class1_Sub6 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3936();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local7];
			arg0.anInt4555 += Static154.aClass27_1.method896(arg0.aByteArray66, arg0.anInt4555, local7, local20, 0);
			return Static524.method7187(local7, local20, 0);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(III)Z")
	public static boolean method7340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
