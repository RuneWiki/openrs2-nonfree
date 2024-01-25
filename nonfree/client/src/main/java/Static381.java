import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "[I")
	public static int[] anIntArray533;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public static int anInt6276 = 0;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
	public static final int[] anIntArray534 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!mg;Lclient!ya;B)V")
	public static void method4980(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class49 arg1) {
		@Pc(10) Class85[] local10 = Static459.method2071(arg0, Static135.anInt2883);
		Static131.aClass17Array5 = new Class17[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static131.aClass17Array5[local16] = arg1.method4435(local10[local16]);
		}
		local10 = Static459.method2071(arg0, Static309.anInt5485);
		Static333.aClass17Array13 = new Class17[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static333.aClass17Array13[local47] = arg1.method4435(local10[local47]);
		}
		local10 = Static459.method2071(arg0, Static390.anInt6562);
		Static270.aClass17Array11 = new Class17[local10.length];
		for (@Pc(79) int local79 = 0; local79 < local10.length; local79++) {
			Static270.aClass17Array11[local79] = arg1.method4435(local10[local79]);
		}
		local10 = Static459.method2071(arg0, Static58.anInt1317);
		Static388.aClass17Array15 = new Class17[local10.length];
		for (@Pc(110) int local110 = 0; local110 < local10.length; local110++) {
			Static388.aClass17Array15[local110] = arg1.method4435(local10[local110]);
		}
		local10 = Static459.method2071(arg0, Static7.anInt222);
		Static246.aClass17Array9 = new Class17[local10.length];
		for (@Pc(137) int local137 = 0; local137 < local10.length; local137++) {
			Static246.aClass17Array9[local137] = arg1.method4435(local10[local137]);
		}
		local10 = Static459.method2071(arg0, Static348.anInt4696);
		Static226.aClass17Array7 = new Class17[local10.length];
		for (@Pc(164) int local164 = 0; local164 < local10.length; local164++) {
			Static226.aClass17Array7[local164] = arg1.method4435(local10[local164]);
		}
		local10 = Static459.method2071(arg0, Static150.anInt4208);
		Static359.aClass17Array14 = new Class17[local10.length];
		for (@Pc(195) int local195 = 0; local195 < local10.length; local195++) {
			Static359.aClass17Array14[local195] = arg1.method4435(local10[local195]);
		}
		local10 = Static459.method2071(arg0, Static110.anInt2579);
		Static248.aClass17Array10 = new Class17[local10.length];
		for (@Pc(226) int local226 = 0; local226 < local10.length; local226++) {
			Static248.aClass17Array10[local226] = arg1.method4435(local10[local226]);
		}
		local10 = Static459.method2071(arg0, Static227.anInt4372);
		Static416.aClass17Array16 = new Class17[local10.length];
		for (@Pc(253) int local253 = 0; local253 < local10.length; local253++) {
			Static416.aClass17Array16[local253] = arg1.method4435(local10[local253]);
		}
		local10 = Static459.method2071(arg0, Static116.anInt2643);
		Static81.aClass17Array2 = new Class17[local10.length];
		for (@Pc(284) int local284 = 0; local284 < local10.length; local284++) {
			Static81.aClass17Array2[local284] = arg1.method4435(local10[local284]);
		}
		local10 = Static459.method2071(arg0, Static43.anInt2397);
		Static100.aClass17Array4 = new Class17[local10.length];
		for (@Pc(311) int local311 = 0; local311 < local10.length; local311++) {
			Static100.aClass17Array4[local311] = arg1.method4435(local10[local311]);
		}
		local10 = Static459.method2071(arg0, Static435.anInt7174);
		Static279.aClass17Array12 = new Class17[local10.length];
		for (@Pc(338) int local338 = 0; local338 < local10.length; local338++) {
			Static279.aClass17Array12[local338] = arg1.method4435(local10[local338]);
		}
		Static147.aClass17_50 = arg1.method4435(Static459.method2069(arg0, Static45.anInt804, 0));
		Static31.aClass17_4 = arg1.method4435(Static459.method2069(arg0, Static24.anInt5066, 0));
		local10 = Static459.method2071(arg0, Static35.anInt697);
		Static224.aClass17Array8 = new Class17[local10.length];
		for (@Pc(381) int local381 = 0; local381 < local10.length; local381++) {
			Static224.aClass17Array8[local381] = arg1.method4435(local10[local381]);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method4982(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(20) RuntimeException_Sub1 local20 = (RuntimeException_Sub1) arg0;
			local15 = local20.aString62 + " | ";
			arg0 = local20.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local15 + "| " + local61;
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
			local15 = local15 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local15 = local15 + local64.substring(local129 + 5, local77);
				}
			}
			local15 = local15 + ' ';
		}
	}
}
