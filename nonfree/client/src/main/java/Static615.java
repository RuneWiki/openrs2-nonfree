import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	public static int anInt10126;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method8658() {
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			Static552.aBooleanArray22[local14] = false;
		}
		Static345.anInt5863 = Static70.anInt1085;
		Static188.anInt3131 = 0;
		Static297.anInt5326 = Static669.anInt10940;
		Static487.anInt8435 = Static153.anInt2372;
		Static193.anInt9748 = Static530.anInt9105;
		Static680.anInt11080 = 0;
		Static627.anInt10294 = -1;
		Static124.anInt2024 = -1;
		Static507.anInt8817 = -1;
		Static170.anInt2635 = Static126.anInt9524;
		Static304.anInt5410 = 5;
		Static600.anInt9908 = -1;
		Static142.anInt2273 = Static229.anInt4393;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!jc;B)Lclient!ug;")
	public static Class363 method8659(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(16) int local16 = arg0.method7748();
		return new Class363(local16);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method8660(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(9) RuntimeException_Sub1 local9 = (RuntimeException_Sub1) arg0;
			local21 = local9.aString29 + " | ";
			arg0 = local9.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(31) StringWriter local31 = new StringWriter();
		@Pc(36) PrintWriter local36 = new PrintWriter(local31);
		arg0.printStackTrace(local36);
		local36.close();
		@Pc(52) String local52 = local31.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local21 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(87) String local87;
			if (local72 == -1) {
				local87 = local66;
			} else {
				local87 = local66.substring(0, local72);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local21 = local21 + local87;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local66.indexOf(".java:", local72);
				if (local133 >= 0) {
					local21 = local21 + local66.substring(local133 + 5, local79);
				}
			}
			local21 = local21 + ' ';
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
	public static int method8661(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)V")
	public static void method8662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class14_Sub2_Sub9 local22 = Static499.method7527((long) arg1 | (long) arg0 << 32, 18);
		local22.method4001();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	public static void method8663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static649.anInt10660 = arg1;
		Static453.anInt7570 = arg0;
		if (Static18.anInt243 == 0) {
			Static347.anInt5886 = Static302.anInt5402 * 2 + Static649.anInt10660;
			Static187.anInt3099 = Static296.anInt5320 * 2 + Static453.anInt7570;
		} else if (Static18.anInt243 == 1) {
			Static93.anInt1647 = Static453.anInt7570 / Static599.anInt9885 + Static469.anInt11070 + 2;
			Static117.anInt1906 = Static649.anInt10660 / Static611.anInt10061 + Static322.anInt5594 + 2;
			Static347.anInt5886 = Static611.anInt10061 * Static117.anInt1906;
			Static187.anInt3099 = Static93.anInt1647 * Static599.anInt9885;
			Static296.anInt5320 = Static187.anInt3099 - Static453.anInt7570 >> 1;
			Static302.anInt5402 = Static347.anInt5886 - Static649.anInt10660 >> 1;
		} else if (Static18.anInt243 == 2) {
			Static187.anInt3099 = Static453.anInt7570;
			Static347.anInt5886 = Static649.anInt10660;
		}
	}
}
