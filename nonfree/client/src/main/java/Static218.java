import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	public static int anInt3718;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt3720;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "Lclient!cb;")
	public static Class40 aClass40_86;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Lclient!qe;")
	public static final Class6_Sub14_Sub2 aClass6_Sub14_Sub2_1 = new Class6_Sub14_Sub2(5000);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3198(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString116 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(36) StringWriter local36 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local36);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local36.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			@Pc(63) String local63 = local57.readLine();
			if (local63 == null) {
				return local10 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(85) String local85;
			if (local69 == -1) {
				local85 = local63;
			} else {
				local85 = local63.substring(0, local69);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local10 = local10 + local85;
			if (local69 != -1 && local76 != -1) {
				@Pc(130) int local130 = local63.indexOf(".java:", local69);
				if (local130 >= 0) {
					local10 = local10 + local63.substring(local130 + 5, local76);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method3199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class6_Sub51 local7 = null;
		for (@Pc(12) Class6_Sub51 local12 = (Class6_Sub51) Static419.aClass275_193.method6366(); local12 != null; local12 = (Class6_Sub51) Static419.aClass275_193.method6364()) {
			if (arg6 == local12.anInt9521 && arg0 == local12.anInt9518 && local12.anInt9513 == arg5 && arg2 == local12.anInt9519) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub51();
			local7.anInt9513 = arg5;
			local7.anInt9519 = arg2;
			local7.anInt9518 = arg0;
			local7.anInt9521 = arg6;
			if (arg0 >= 0 && arg5 >= 0 && arg0 < Static301.anInt4912 && Static473.anInt7969 > arg5) {
				Static227.method3327(local7);
			}
			Static419.aClass275_193.method6370(local7);
		}
		local7.anInt9527 = arg4;
		local7.anInt9522 = arg1;
		local7.anInt9525 = arg3;
		local7.anInt9529 = -1;
		local7.anInt9526 = 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method3200() {
		@Pc(9) int[] local9 = new int[Static295.aClass256_2.anInt7112];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static295.aClass256_2.anInt7112; local13++) {
			@Pc(20) Class110 local20 = Static295.aClass256_2.method5924(local13);
			if (local20.anInt2610 >= 0 || local20.anInt2664 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static517.anIntArray634 = new int[local11];
		for (@Pc(46) int local46 = 0; local46 < local11; local46++) {
			Static517.anIntArray634[local46] = local9[local46];
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Z")
	public static boolean method3201(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
