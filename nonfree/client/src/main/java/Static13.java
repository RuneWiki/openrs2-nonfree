import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!ui;")
	public static Class230 aClass230_2;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public static int anInt189;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!j;")
	public static final Class113 aClass113_1 = new Class113(5, 14);

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!am", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!je;")
	public static Class117 method107(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static137.aClass117ArrayArray1[local7] == null || Static137.aClass117ArrayArray1[local7][local11] == null) {
			@Pc(27) boolean local27 = Static345.method4878(local7);
			if (!local27) {
				return null;
			}
		}
		return Static137.aClass117ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method108(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString12 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(83) String local83;
			if (local70 == -1) {
				local83 = local64;
			} else {
				local83 = local64.substring(0, local70);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local24 = local24 + local83;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local24 = local24 + local64.substring(local129 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!tq;Lclient!hm;III)V")
	public static void method110(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class132 local12;
		if (arg3 < Static19.anInt329) {
			local12 = Static25.aClass132ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass25_Sub4_2 != null && local12.aClass25_Sub4_2.method5236()) {
				arg1.method5235(true, arg0, local12.aClass25_Sub4_2, 0, 0, Static53.anInt1116);
			}
		}
		if (arg4 < Static19.anInt329) {
			local12 = Static25.aClass132ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass25_Sub4_2 != null && local12.aClass25_Sub4_2.method5236()) {
				arg1.method5235(true, arg0, local12.aClass25_Sub4_2, 0, Static53.anInt1116, 0);
			}
		}
		if (arg3 < Static19.anInt329 && arg4 < Static230.anInt6113) {
			local12 = Static25.aClass132ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass25_Sub4_2 != null && local12.aClass25_Sub4_2.method5236()) {
				arg1.method5235(true, arg0, local12.aClass25_Sub4_2, 0, Static53.anInt1116, Static53.anInt1116);
			}
		}
		if (arg3 < Static19.anInt329 && arg4 > 0) {
			local12 = Static25.aClass132ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass25_Sub4_2 != null && local12.aClass25_Sub4_2.method5236()) {
				arg1.method5235(true, arg0, local12.aClass25_Sub4_2, 0, -Static53.anInt1116, Static53.anInt1116);
			}
		}
	}
}
