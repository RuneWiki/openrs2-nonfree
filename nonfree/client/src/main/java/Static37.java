import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "[[Lclient!po;")
	public static Class165[][] aClass165ArrayArray1;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method903() {
		Static324.aClass32_14.method2140(Static29.aFloat2 * ((float) Static13.anInt489 * 0.1F + 0.7F));
		Static324.aClass32_14.method2189(Static171.anInt3677, Static33.aFloat3, Static168.aFloat48, (float) Static219.anInt4616, (float) Static306.anInt6045, (float) Static341.anInt6553);
		Static324.aClass32_14.method2169(Static153.aClass114_1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method904(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString53 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local21 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(80) String local80;
			if (local65 == -1) {
				local80 = local59;
			} else {
				local80 = local59.substring(0, local65);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local21 = local21 + local80;
			if (local65 != -1 && local72 != -1) {
				@Pc(123) int local123 = local59.indexOf(".java:", local65);
				if (local123 >= 0) {
					local21 = local21 + local59.substring(local123 + 5, local72);
				}
			}
			local21 = local21 + ' ';
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public static void method905() {
		Static190.aClass87_36.method2485();
	}
}
