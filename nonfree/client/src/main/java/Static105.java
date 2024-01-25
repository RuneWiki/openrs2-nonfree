import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "S")
	public static short aShort29 = 320;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[Lclient!ss;")
	public static final Class16_Sub1[] aClass16_Sub1Array1 = new Class16_Sub1[29];

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
	public static final int[] anIntArray442 = new int[100];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!nl;Lclient!nl;Lclient!nl;Lclient!nl;B)V")
	public static void method2210(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		Static233.aClass171_54 = arg0;
		Static246.aClass171_60 = arg1;
		Static79.aClass171_67 = arg2;
		Static293.aClass171_97 = arg3;
		Static183.aClass4ArrayArray1 = new Class4[Static233.aClass171_54.method3770()][];
		Static350.aBooleanArray22 = new boolean[Static233.aClass171_54.method3770()];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2213(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString49 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local21 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(86) String local86;
			if (local73 == -1) {
				local86 = local67;
			} else {
				local86 = local67.substring(0, local73);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local21 = local21 + local86;
			if (local73 != -1 && local80 != -1) {
				@Pc(132) int local132 = local67.indexOf(".java:", local73);
				if (local132 >= 0) {
					local21 = local21 + local67.substring(local132 + 5, local80);
				}
			}
			local21 = local21 + ' ';
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ae;II)V")
	public static void method2214(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static242.aClass4_22 != null || Static269.aBoolean349 || (arg0 == null || Static35.method635(arg0) == null)) {
			return;
		}
		Static242.aClass4_22 = arg0;
		Static102.aClass4_11 = Static35.method635(arg0);
		Static224.anInt3999 = arg1;
		Static115.aBoolean190 = false;
		Static254.anInt4494 = 0;
		Static371.anInt6283 = arg2;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
	public static void method2215() {
		if (Static152.anInt2983 != 3) {
			Static347.anInt5864 = -1;
		}
	}
}
