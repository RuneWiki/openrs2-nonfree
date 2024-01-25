import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Lclient!ji;")
	public static Class3_Sub28 aClass3_Sub28_4 = null;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "[I")
	public static final int[] anIntArray395 = new int[3];

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "[I")
	public static final int[] anIntArray396 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method5615(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString118 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local45));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local10 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(84) String local84;
			if (local72 == -1) {
				local84 = local66;
			} else {
				local84 = local66.substring(0, local72);
			}
			local84 = local84.trim();
			local84 = local84.substring(local84.lastIndexOf(32) + 1);
			local84 = local84.substring(local84.lastIndexOf(9) + 1);
			local10 = local10 + local84;
			if (local72 != -1 && local79 != -1) {
				@Pc(131) int local131 = local66.indexOf(".java:", local72);
				if (local131 >= 0) {
					local10 = local10 + local66.substring(local131 + 5, local79);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(JILclient!ri;ZIIII)V")
	public static void method5616(@OriginalArg(0) long arg0, @OriginalArg(2) Class284 arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3) {
		Static426.anInt7533 = 10000;
		Static130.aClass284_126 = arg1;
		Static213.anInt4459 = arg3;
		Static288.anInt5396 = 0;
		Static508.anInt8798 = arg2;
		Static530.anInt9247 = 0;
		Static38.aBoolean94 = false;
		Static533.aClass3_Sub16_Sub3_3 = null;
		Static530.anInt9251 = 1;
		Static72.aLong34 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)V")
	public static void method5618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg1 * Static348.aClass3_Sub51_Sub1_5.anInt9952 >> 8;
		if (local6 == 0 || arg0 == -1) {
			return;
		}
		if (!Static168.aBoolean262 && Static526.anInt9227 != -1 && Static369.method5225()) {
			Static483.aClass3_Sub16_Sub3_2 = Static100.method7583();
			@Pc(43) Class3_Sub16_Sub3 local43 = Static554.method7604(Static483.aClass3_Sub16_Sub3_2);
			Static275.method4166(local43);
		}
		Static293.method4412(Static271.aClass284_81, local6, arg0);
		Static145.method2769(-1, 255);
		Static168.aBoolean262 = true;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLclient!r;J)V")
	public static void method5620(@OriginalArg(1) Class31 arg0, @OriginalArg(2) long arg1) {
		Static266.anInt5087 = 0;
		Static524.anInt9194 = 0;
		Static226.anInt4632 = Static65.anInt1813;
		Static65.anInt1813 = 0;
		@Pc(24) long local24 = Static96.method2000();
		for (@Pc(29) Class25_Sub7 local29 = (Class25_Sub7) Static344.aClass269_5.method5974(); local29 != null; local29 = (Class25_Sub7) Static344.aClass269_5.method5979()) {
			if (local29.method3783(arg0, arg1)) {
				Static524.anInt9194++;
			}
		}
		if (Static291.aBoolean373 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static344.aClass269_5.method5970() + ", running: " + Static524.anInt9194);
			System.out.println("Emitters: " + Static266.anInt5087 + " Particles: " + Static65.anInt1813 + ". Time taken: " + (Static96.method2000() - local24) + "ms");
		}
	}
}
