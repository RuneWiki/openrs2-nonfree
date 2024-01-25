import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_59 = new Class40("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!tv;")
	public static Class15_Sub2 method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class108 local14 = local7.aClass108_1; local14 != null; local14 = local14.aClass108_3) {
			@Pc(18) Class15_Sub2 local18 = local14.aClass15_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort110 == arg1 && local18.aShort109 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ae;I)[Lclient!mh;")
	public static Class196[] method3174(@OriginalArg(0) Class9 arg0) {
		if (!arg0.method279()) {
			return new Class196[0];
		}
		@Pc(16) Class83 local16 = arg0.method286();
		while (local16.anInt2495 == 0) {
			Static213.method3465(10L);
		}
		if (local16.anInt2495 == 2) {
			return new Class196[0];
		}
		@Pc(46) int[] local46 = (int[]) local16.anObject8;
		@Pc(52) Class196[] local52 = new Class196[local46.length >> 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(60) Class196 local60 = new Class196();
			local52[local54] = local60;
			local60.anInt6049 = local46[local54 << 2];
			local60.anInt6050 = local46[(local54 << 2) + 1];
			local60.anInt6048 = local46[(local54 << 2) + 2];
			local60.anInt6051 = local46[(local54 << 2) + 3];
		}
		return local52;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3176(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString71 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(52) String local52 = local32.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local10 + "| " + local63;
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
			local10 = local10 + local87;
			if (local72 != -1 && local79 != -1) {
				@Pc(131) int local131 = local66.indexOf(".java:", local72);
				if (local131 >= 0) {
					local10 = local10 + local66.substring(local131 + 5, local79);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
