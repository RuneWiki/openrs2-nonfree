import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	public static int anInt2845 = 0;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "[I")
	public static int[] anIntArray430 = new int[500];

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "[I")
	public static int[] anIntArray431 = new int[50];

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1322 = Static45.method1937("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!tc", name = "wb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1324 = Static45.method1937("Ausw-=hlen");

	@OriginalMember(owner = "client!tc", name = "Ab", descriptor = "Lclient!af;")
	private static Class5 aClass5_1325 = Static45.method1937("Too many connections from your address)3");

	@OriginalMember(owner = "client!tc", name = "Qb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1326 = aClass5_1325;

	@OriginalMember(owner = "client!tc", name = "Wb", descriptor = "I")
	public static int anInt2885 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method2020(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString5 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(52) String local52 = local32.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local60.readLine();
				if (local66 == null) {
					return local10 + "| " + local63;
				}
				@Pc(72) int local72 = local66.indexOf(40);
				@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(93) String local93 = local66.substring(local72 + 1, local79);
					@Pc(97) int local97 = local93.indexOf(".java:");
					if (local97 >= 0) {
						local93 = local93.substring(0, local97) + local93.substring(local97 + 5);
						local10 = local10 + local93 + ' ';
						continue;
					}
					local66 = local66.substring(0, local72);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local10 = local10 + local66 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Lclient!ne;")
	public static Class1_Sub3_Sub12 method2023(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub12 local10 = (Class1_Sub3_Sub12) Static121.aClass28_82.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static120.aClass41_16.method1710(9, arg0);
		local10 = new Class1_Sub3_Sub12();
		local10.anInt2105 = arg0;
		if (local20 != null) {
			local10.method1477(new Class1_Sub20(local20));
		}
		local10.method1473();
		Static121.aClass28_82.method789(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method2026() {
		aClass5_1326 = null;
		aClass5_1325 = null;
		aClass5_1324 = null;
		anIntArray430 = null;
		aClass5_1322 = null;
		anIntArray431 = null;
	}
}
