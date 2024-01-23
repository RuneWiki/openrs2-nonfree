import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "[I")
	public static int[] anIntArray257;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!wh;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString163 = "shake:";

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 < 1 || arg4 < 1 || arg6 > 102 || arg4 > 102) {
			return;
		}
		@Pc(38) int local38;
		if (!Static60.method1068() && (Static260.aByteArrayArrayArray25[0][arg6][arg4] & 0x2) == 0) {
			local38 = arg5;
			if ((Static260.aByteArrayArrayArray25[arg5][arg6][arg4] & 0x8) != 0) {
				local38 = 0;
			}
			if (Static226.anInt4504 != local38) {
				return;
			}
		}
		local38 = arg5;
		if (arg5 < 3 && (Static260.aByteArrayArrayArray25[1][arg6][arg4] & 0x2) == 2) {
			local38 = arg5 + 1;
		}
		Static98.method1829(arg1, arg6, Static88.aClass92Array1[arg5], arg5, local38, arg4);
		if (arg3 >= 0) {
			@Pc(95) boolean local95 = Static116.aBoolean450;
			Static116.aBoolean450 = true;
			Static2.method135(arg2, arg5, Static88.aClass92Array1[arg5], arg0, false, local38, false, arg3, arg4, arg6);
			Static116.aBoolean450 = local95;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2171(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString95 + " | ";
		} else {
			local24 = "";
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
				return local24 + "| " + local63;
			}
			@Pc(75) int local75 = local66.indexOf(40);
			@Pc(82) int local82 = local66.indexOf(41, local75 + 1);
			@Pc(91) String local91;
			if (local75 == -1) {
				local91 = local66;
			} else {
				local91 = local66.substring(0, local75);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local24 = local24 + local91;
			if (local75 != -1 && local82 != -1) {
				@Pc(135) int local135 = local66.indexOf(".java:", local75);
				if (local135 >= 0) {
					local24 = local24 + local66.substring(local135 + 5, local82);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([I[IBLclient!fj;[I)V")
	public static void method2172(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class14_Sub2_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) int local15 = arg0[local7];
			@Pc(19) int local19 = arg3[local7];
			@Pc(23) int local23 = arg1[local7];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg2.aClass3Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg2.aClass3Array3[local25] = null;
					} else {
						@Pc(53) Class125 local53 = Static90.method1591(local15);
						@Pc(58) Class3 local58 = arg2.aClass3Array3[local25];
						@Pc(61) int local61 = local53.anInt3941;
						if (local58 != null) {
							if (local15 == local58.anInt110) {
								if (local61 == 0) {
									local58 = arg2.aClass3Array3[local25] = null;
								} else if (local61 == 1) {
									local58.anInt103 = 0;
									local58.anInt101 = 1;
									local58.anInt105 = local23;
									local58.anInt104 = 0;
									local58.anInt102 = 0;
									Static77.method1354(0, arg2 == Static197.aClass14_Sub2_Sub1_2, arg2.anInt4680, local53, arg2.anInt4630);
								} else if (local61 == 2) {
									local58.anInt104 = 0;
								}
							} else if (local53.anInt3944 >= Static90.method1591(local58.anInt110).anInt3944) {
								local58 = arg2.aClass3Array3[local25] = null;
							}
						}
						if (local58 == null) {
							local58 = arg2.aClass3Array3[local25] = new Class3();
							local58.anInt110 = local15;
							local58.anInt101 = 1;
							local58.anInt103 = 0;
							local58.anInt105 = local23;
							local58.anInt104 = 0;
							local58.anInt102 = 0;
							Static77.method1354(0, Static197.aClass14_Sub2_Sub1_2 == arg2, arg2.anInt4680, local53, arg2.anInt4630);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}
}
