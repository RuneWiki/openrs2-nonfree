import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "Lclient!jk;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
	public static int anInt840 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIILclient!ch;)V")
	public static void method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub10 arg4) {
		if (arg4.anInt864 == -1 && arg4.anIntArray41 == null) {
			return;
		}
		@Pc(25) int local25 = 0;
		if (arg0 > arg4.anInt855) {
			local25 = arg0 - arg4.anInt855;
		} else if (arg4.anInt859 > arg0) {
			local25 = arg4.anInt859 - arg0;
		}
		@Pc(63) int local63 = arg4.anInt858 * Static453.aClass136_Sub1_1.anInt4441 >> 8;
		if (arg1 > arg4.anInt867) {
			local25 += arg1 - arg4.anInt867;
		} else if (arg4.anInt856 > arg1) {
			local25 += arg4.anInt856 - arg1;
		}
		if (arg4.anInt857 == 0 || arg4.anInt857 < local25 - 64 || Static453.aClass136_Sub1_1.anInt4441 == 0 || arg4.anInt861 != arg2) {
			if (arg4.aClass1_Sub6_Sub3_1 != null) {
				Static355.aClass1_Sub6_Sub4_2.method5179(arg4.aClass1_Sub6_Sub3_1);
				arg4.aClass1_Sub6_Sub3_1 = null;
			}
			if (arg4.aClass1_Sub6_Sub3_2 != null) {
				Static355.aClass1_Sub6_Sub4_2.method5179(arg4.aClass1_Sub6_Sub3_2);
				arg4.aClass1_Sub6_Sub3_2 = null;
			}
			return;
		}
		local25 -= 64;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(157) int local157 = local63 * (arg4.anInt857 - local25) / arg4.anInt857;
		if (arg4.aClass1_Sub6_Sub3_1 != null) {
			arg4.aClass1_Sub6_Sub3_1.method4667(local157);
		} else if (arg4.anInt864 >= 0) {
			@Pc(169) Class211 local169 = Static467.method4741(Static257.aClass82_59, arg4.anInt864, 0);
			if (local169 != null) {
				@Pc(176) Class1_Sub25_Sub1 local176 = local169.method4738().method2771(Static250.aClass255_1);
				@Pc(181) Class1_Sub6_Sub3 local181 = Static466.method4661(local176, local157);
				local181.method4638(-1);
				Static355.aClass1_Sub6_Sub4_2.method5175(local181);
				arg4.aClass1_Sub6_Sub3_1 = local181;
			}
		}
		if (arg4.aClass1_Sub6_Sub3_2 != null) {
			arg4.aClass1_Sub6_Sub3_2.method4667(local157);
			if (arg4.aClass1_Sub6_Sub3_2.method5914()) {
				return;
			}
			arg4.aClass1_Sub6_Sub3_2 = null;
		} else if (arg4.anIntArray41 != null && (arg4.anInt863 -= arg3) <= 0) {
			@Pc(218) int local218 = (int) (Math.random() * (double) arg4.anIntArray41.length);
			@Pc(226) Class211 local226 = Static467.method4741(Static257.aClass82_59, arg4.anIntArray41[local218], 0);
			if (local226 != null) {
				@Pc(233) Class1_Sub25_Sub1 local233 = local226.method4738().method2771(Static250.aClass255_1);
				@Pc(238) Class1_Sub6_Sub3 local238 = Static466.method4661(local233, local157);
				local238.method4638(0);
				Static355.aClass1_Sub6_Sub4_2.method5175(local238);
				arg4.aClass1_Sub6_Sub3_2 = local238;
				arg4.anInt863 = (int) ((double) (arg4.anInt868 - arg4.anInt862) * Math.random()) + arg4.anInt862;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method820(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString49 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local32);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local32.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			@Pc(63) String local63 = local57.readLine();
			if (local63 == null) {
				return local10 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(82) String local82;
			if (local69 == -1) {
				local82 = local63;
			} else {
				local82 = local63.substring(0, local69);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local10 = local10 + local82;
			if (local69 != -1 && local76 != -1) {
				@Pc(130) int local130 = local63.indexOf(".java:", local69);
				if (local130 >= 0) {
					local10 = local10 + local63.substring(local130 + 5, local76);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
	public static void method821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static47.anIntArrayArray10 != null) {
			Static47.anIntArrayArray10[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static142.aShortArrayArray4 != null) {
			Static142.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (Static438.aByteArrayArray19 != null) {
			Static438.aByteArrayArray19[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFZF)F")
	public static float method822(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * (arg1 - arg2) + arg2;
	}
}
