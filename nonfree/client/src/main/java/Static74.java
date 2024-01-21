import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_7;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_1056 = Static6.method100("Weiter");

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_1057 = Static6.method100("au");

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public static int anInt2081 = 0;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!md", name = "m", descriptor = "[I")
	public static int[] anIntArray201 = new int[5];

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!he;")
	private static Class26 aClass26_1058 = Static6.method100(" ");

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1059 = aClass26_1058;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public static int anInt2082 = -1;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_1060 = Static6.method100("gleiten:");

	@OriginalMember(owner = "client!md", name = "s", descriptor = "[I")
	public static int[] anIntArray202 = new int[25];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZII)V")
	public static void method1345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static56.anInt1720 != 0 && arg0 != -1) {
			Static113.method2067(Static56.anInt1720, Static39.aClass16_Sub1_5, 0, arg0);
			Static42.aBoolean70 = true;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1346(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString1 + " | ";
		} else {
			local10 = "";
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
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(88) String local88 = local64.substring(local70 + 1, local77);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local10 = local10 + local88 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1347() {
		Class46.anIntArray199 = null;
		aByteArrayArrayArray5 = null;
		anIntArray200 = null;
		aClass3_Sub14_7 = null;
		aClass26_1057 = null;
		aClass26_1056 = null;
		aClass26_1058 = null;
		aClass26_1059 = null;
		anIntArray202 = null;
		aClass26_1060 = null;
		anIntArray201 = null;
	}
}
