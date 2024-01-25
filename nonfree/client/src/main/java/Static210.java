import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public static int anInt3833 = 0;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public static volatile int anInt3837 = -1;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
	public static int anInt3844 = 0;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "[I")
	public static final int[] anIntArray450 = new int[32];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!cj;II)Lclient!ja;")
	public static Class81 method3750(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		return new Class81_Sub2(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3751(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString302 + " | ";
		} else {
			local24 = "";
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
				return local24 + "| " + local56;
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
			local24 = local24 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(125) int local125 = local59.indexOf(".java:", local65);
				if (local125 >= 0) {
					local24 = local24 + local59.substring(local125 + 5, local72);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Lclient!gi;")
	public static Class6_Sub2_Sub6 method3753(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub6 local10 = (Class6_Sub2_Sub6) Static9.aClass70_4.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static316.aClass53_144.method1033(arg0, 26);
		local10 = new Class6_Sub2_Sub6();
		if (local20 != null) {
			local10.method2078(new Class6_Sub10(local20));
		}
		Static9.aClass70_4.method1406(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public static void method3754() {
		Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
		Static340.anInt654 = 0;
		Static303.anInt5738 = 0;
		Static24.anInt387 = -1;
		Static31.anInt578 = 0;
		Static334.anInt6115 = -1;
		Static242.anInt4533 = -1;
		Static336.anInt6134 = -1;
		Static142.aClass6_Sub10_Sub1_3.anInt4188 = 0;
		Static353.method5802();
		Static103.method2105();
		for (@Pc(36) int local36 = 0; local36 < Static343.aClass44_Sub4_Sub4_Sub1Array1.length; local36++) {
			if (Static343.aClass44_Sub4_Sub4_Sub1Array1[local36] != null) {
				Static343.aClass44_Sub4_Sub4_Sub1Array1[local36].anInt5103 = -1;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static239.aClass44_Sub4_Sub4_Sub2Array8.length; local54++) {
			if (Static239.aClass44_Sub4_Sub4_Sub2Array8[local54] != null) {
				Static239.aClass44_Sub4_Sub4_Sub2Array8[local54].anInt5103 = -1;
			}
		}
		Static240.method3873();
		Static334.anInt6112 = 1;
		Static290.method4952(30);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static103.aBooleanArray18[local81] = true;
		}
		Static166.method3283();
	}
}
