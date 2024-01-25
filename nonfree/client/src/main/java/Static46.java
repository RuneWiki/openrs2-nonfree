import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "Lclient!qi;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "Lclient!xa;")
	public static Class119 aClass119_4;

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
	public static int anInt1080;

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "[I")
	public static final int[] anIntArray144 = new int[1000];

	@OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
	public static int anInt1081 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!eba;BZILclient!eba;IZ)I")
	public static int method1002(@OriginalArg(0) Class68_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class68_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static366.method5733(arg3, arg2, arg0, arg1);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(38) int local38 = Static366.method5733(arg3, arg4, arg0, arg5);
			return arg5 ? -local38 : local38;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)Z")
	public static boolean method1003(@OriginalArg(0) int arg0) {
		Static22.anInt8151 = arg0 + 1 & 0xFFFF;
		Static425.aBoolean558 = true;
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIB)V")
	public static void method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class92 local16 = Static313.aClass92ArrayArray1[arg1][arg2];
		Static454.method6838(arg0, local16 == null ? Static510.aClass92_2 : local16);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class245 method1005(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static459.aClass245ArrayArray2[local14] == null || Static459.aClass245ArrayArray2[local14][local18] == null) {
			@Pc(32) boolean local32 = Static62.method7109(local14);
			if (!local32) {
				return null;
			}
		}
		return Static459.aClass245ArrayArray2[local14][local18];
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1006(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString62 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local21 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local64;
			} else {
				local82 = local64.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local21 = local21 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local21 = local21 + local64.substring(local129 + 5, local77);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
