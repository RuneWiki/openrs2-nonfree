import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_59 = new Class151(62, -2);

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IBIIIIZI)V")
	public static void method2320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static124.aClass4_Sub20_4.aClass8_Sub22_4.method7414() != 0 && arg0 != 0 && Static655.anInt10336 < 50 && arg2 != -1) {
			Static665.aClass129Array1[Static655.anInt10336++] = new Class129((byte) 2, arg2, arg0, arg5, arg4, arg3, arg1, (Class3_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ar;")
	public static Class3_Sub1_Sub2 method2321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class144 local14 = local7.aClass144_1; local14 != null; local14 = local14.aClass144_2) {
			@Pc(18) Class3_Sub1_Sub2 local18 = local14.aClass3_Sub1_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort124 == arg1 && local18.aShort125 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(III)I")
	public static int method2322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2323(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static633.anInt9792; local19++) {
			if (arg0.equalsIgnoreCase(Static280.aStringArray49[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static571.aStringArray44[local19])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2325(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString25 + " | ";
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
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local21 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(78) String local78;
			if (local65 == -1) {
				local78 = local59;
			} else {
				local78 = local59.substring(0, local65);
			}
			local78 = local78.trim();
			local78 = local78.substring(local78.lastIndexOf(32) + 1);
			local78 = local78.substring(local78.lastIndexOf(9) + 1);
			local21 = local21 + local78;
			if (local65 != -1 && local72 != -1) {
				@Pc(125) int local125 = local59.indexOf(".java:", local65);
				if (local125 >= 0) {
					local21 = local21 + local59.substring(local125 + 5, local72);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
