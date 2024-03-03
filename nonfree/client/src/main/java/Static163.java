import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Lclient!nj;")
	public static Class123 aClass123_2;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 7)
	public static void method1508() {
		@Pc(5) byte local5 = 0;
		if (Static203.aClass177_Sub1_2.aBoolean364) {
			local5 = 55;
		}
		Static85.method1965(local5);
		Static334.aClass202_4.method5156(local5);
		Static290.aClass107_2.method2767(local5);
		Static6.aClass219_1.method5579(local5);
		Static299.aClass211_2.method5413(local5);
		Static10.method237(local5);
		Static145.method2785(local5);
		Static294.method5550(local5);
		Static189.method3679(local5);
		if (Class2_Sub3_Sub35.anInt6430 == 10) {
			Static313.method5706(28);
		} else if (Class2_Sub3_Sub35.anInt6430 == 30) {
			Static313.method5706(25);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 45)
	public static void method1509() {
		Static358.aBoolean485 = false;
		Class123.anInt3361 = 1;
		Static98.anInt2180 = -1;
		Static109.aClass197_26 = null;
		Static318.anInt6364 = -1;
		Static331.anInt6628 = 0;
		Static27.anInt672 = 2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!bt;)Lclient!vo;", line = 65)
	public static Class173_Sub4 method1510(@OriginalArg(1) Class2_Sub4 arg0) {
		return new Class173_Sub4(arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4834(), arg0.method4816());
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 78)
	public static String method1511(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString23 + " | ";
		} else {
			local10 = "";
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
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(77) String local77;
			if (local65 == -1) {
				local77 = local59;
			} else {
				local77 = local59.substring(0, local65);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local10 = local10 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(123) int local123 = local59.indexOf(".java:", local65);
				if (local123 >= 0) {
					local10 = local10 + local59.substring(local123 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
