import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
	public static int anInt4680;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "Lclient!sf;")
	public static Class157 aClass157_39 = new Class157(64);

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "[I")
	public static int[] anIntArray459 = new int[2];

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	public static void method3771() {
		Static157.aClass157_29.method4033();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([IIII[I)V")
	public static void method3772(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(20) int local20 = (arg1 + arg2) / 2;
		@Pc(24) int local24 = arg3[local20];
		@Pc(26) int local26 = arg1;
		arg3[local20] = arg3[arg2];
		arg3[arg2] = local24;
		@Pc(40) int local40 = arg0[local20];
		arg0[local20] = arg0[arg2];
		arg0[arg2] = local40;
		for (@Pc(52) int local52 = arg1; local52 < arg2; local52++) {
			if (local24 + (local52 & 0x1) < arg3[local52]) {
				@Pc(78) int local78 = arg3[local52];
				arg3[local52] = arg3[local26];
				arg3[local26] = local78;
				@Pc(92) int local92 = arg0[local52];
				arg0[local52] = arg0[local26];
				arg0[local26++] = local92;
			}
		}
		arg3[arg2] = arg3[local26];
		arg3[local26] = local24;
		arg0[arg2] = arg0[local26];
		arg0[local26] = local40;
		method3772(arg0, arg1, local26 - 1, arg3);
		method3772(arg0, local26 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method3773(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString134 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local32);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local32.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local21 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(90) String local90;
			if (local73 == -1) {
				local90 = local65;
			} else {
				local90 = local65.substring(0, local73);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local21 = local21 + local90;
			if (local73 != -1 && local80 != -1) {
				@Pc(133) int local133 = local65.indexOf(".java:", local73);
				if (local133 >= 0) {
					local21 = local21 + local65.substring(local133 + 5, local80);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
