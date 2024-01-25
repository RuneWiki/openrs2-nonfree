import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "Lclient!bg;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "[I")
	public static final int[] anIntArray347 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "J")
	public static long aLong103 = -1L;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2851(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString40 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local10 + "| " + local62;
			}
			@Pc(71) int local71 = local65.indexOf(40);
			@Pc(78) int local78 = local65.indexOf(41, local71 + 1);
			@Pc(86) String local86;
			if (local71 == -1) {
				local86 = local65;
			} else {
				local86 = local65.substring(0, local71);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local10 = local10 + local86;
			if (local71 != -1 && local78 != -1) {
				@Pc(131) int local131 = local65.indexOf(".java:", local71);
				if (local131 >= 0) {
					local10 = local10 + local65.substring(local131 + 5, local78);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!qr;I)V")
	public static void method2853(@OriginalArg(0) Class12_Sub1_Sub2_Sub2 arg0) {
		@Pc(16) Class2_Sub42 local16 = (Class2_Sub42) Static208.aClass214_22.method5059((long) arg0.anInt5365);
		if (local16 == null) {
			Static52.method3357(arg0, null, arg0.aByte74, arg0.anIntArray659[0], 0, null, arg0.anIntArray658[0]);
		} else {
			local16.method5598();
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	public static void method2855() {
		Static391.aClass154_58.method3748();
	}
}
