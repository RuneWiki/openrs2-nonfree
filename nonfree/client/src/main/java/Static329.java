import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lclient!sg;")
	public static Class311[] aClass311Array1;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!mv;")
	public static Class229 aClass229_79;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public static void method4757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static25.anInt442 != 0) {
			if (arg0 >= 0) {
				Static462.anIntArray496[arg0] = arg1;
			} else {
				for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
					Static462.anIntArray496[local16] = arg1;
				}
			}
		}
		Static84.aClass2_Sub3_Sub2_7.method2048(arg1, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method4758(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static448.anInt1236 == 2) {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[0]);
				Static49.aClass128Array2[1].method2306(Static228.aClass318Array1[1]);
			} else if (Static448.anInt1236 == 3) {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[0]);
				Static49.aClass128Array2[1].method2306(Static228.aClass318Array1[1]);
				Static49.aClass128Array2[2].method2306(Static228.aClass318Array1[2]);
			} else {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[0]);
				Static49.aClass128Array2[1].method2306(Static228.aClass318Array1[1]);
				Static49.aClass128Array2[2].method2306(Static228.aClass318Array1[2]);
				Static49.aClass128Array2[3].method2306(Static228.aClass318Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static448.anInt1236 == 2) {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[2]);
			} else if (Static448.anInt1236 == 3) {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[3]);
				Static49.aClass128Array2[1].method2306(Static228.aClass318Array1[4]);
			} else {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[4]);
				Static49.aClass128Array2[1].method2306(Static228.aClass318Array1[5]);
				Static49.aClass128Array2[2].method2306(Static228.aClass318Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static448.anInt1236 == 2) {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[3]);
				return;
			}
			if (Static448.anInt1236 == 3) {
				Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[5]);
				return;
			}
			Static49.aClass128Array2[0].method2306(Static228.aClass318Array1[7]);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method4760(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString60 + " | ";
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
			@Pc(66) String local66 = local53.readLine();
			if (local66 == null) {
				return local21 + "| " + local56;
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
			local21 = local21 + local84;
			if (local72 != -1 && local79 != -1) {
				@Pc(130) int local130 = local66.indexOf(".java:", local72);
				if (local130 >= 0) {
					local21 = local21 + local66.substring(local130 + 5, local79);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
