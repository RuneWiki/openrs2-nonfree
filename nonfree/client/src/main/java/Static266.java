import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
	public static final int[] anIntArray109 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "[Lclient!qp;")
	public static Class152_Sub1[] aClass152_Sub1Array2 = new Class152_Sub1[0];

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	public static void method1438() {
		for (@Pc(8) Class57_Sub4 local8 = (Class57_Sub4) Static4.aClass111_9.method2688(); local8 != null; local8 = (Class57_Sub4) Static4.aClass111_9.method2690()) {
			local8.method3246();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZII)V")
	public static void method1439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class74 local10 = new Class74(16);
		for (@Pc(22) Class6_Sub22 local22 = (Class6_Sub22) Static165.aClass74_15.method1889(); local22 != null; local22 = (Class6_Sub22) Static165.aClass74_15.method1881()) {
			local22.method6525();
			@Pc(33) int local33 = (int) (local22.aLong229 >> 28);
			@Pc(44) int local44 = (int) (local22.aLong229 >> 14 & 0x3FFFL) - arg1;
			@Pc(53) int local53 = (int) (local22.aLong229 & 0x3FFFL) - arg0;
			if (local53 >= 0 && local44 >= 0 && Static181.anInt3574 > local53 && Static117.anInt2450 > local44) {
				local10.method1890((long) (local53 | local44 << 14 | local33 << 28), local22);
			}
		}
		Static165.aClass74_15 = local10;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1443(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString21 + " | ";
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
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local10 = local10 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local10 = local10 + local64.substring(local130 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
	public static void method1445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static212.method3218(arg0, 9);
		local12.method3088();
		local12.anInt3744 = arg1;
		local12.anInt3749 = arg2;
	}
}
