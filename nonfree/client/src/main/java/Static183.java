import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public static int anInt3155 = 0;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!v;")
	public static final Class362 aClass362_14 = new Class362();

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "S")
	public static short aShort48 = 205;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIZII)V")
	public static void method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static502.anInt8456 && Static153.anInt2554 >= arg3 && Static55.anInt4238 <= arg1 && arg4 <= Static292.anInt4921) {
			Static165.method2362(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static391.method5568(arg2, arg4, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2640(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(20) RuntimeException_Sub1 local20 = (RuntimeException_Sub1) arg0;
			local15 = local20.aString51 + " | ";
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
			@Pc(83) String local83;
			if (local70 == -1) {
				local83 = local64;
			} else {
				local83 = local64.substring(0, local70);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local15 = local15 + local83;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local15 = local15 + local64.substring(local130 + 5, local77);
				}
			}
			local15 = local15 + ' ';
		}
	}
}
