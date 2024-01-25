import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ)V")
	public static void method5595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = Static2.aClass148_Sub1_1.anInt3792 * arg2 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static216.method2861(Static11.aClass54_3, arg0, local10);
			Static372.aBoolean448 = true;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
	public static void method5596() {
		if (Static332.aFloat80 < 1024.0F) {
			Static332.aFloat80 = 1024.0F;
		}
		while (Static113.aFloat19 >= 16384.0F) {
			Static113.aFloat19 -= 16384.0F;
		}
		if (Static332.aFloat80 > 3072.0F) {
			Static332.aFloat80 = 3072.0F;
		}
		while (Static113.aFloat19 < 0.0F) {
			Static113.aFloat19 += 16384.0F;
		}
		@Pc(41) int local41 = Static133.anInt2393 >> 7;
		@Pc(45) int local45 = Static153.anInt2665 >> 7;
		@Pc(51) int local51 = Static302.method3973(Static153.anInt2665, Static133.anInt2393, Static61.anInt1129);
		@Pc(53) int local53 = 0;
		@Pc(83) int local83;
		if (local41 > 3 && local45 > 3 && Static166.anInt2852 - 4 > local41 && local45 < Static426.anInt6923 - 4) {
			for (local83 = local41 - 4; local83 <= local41 + 4; local83++) {
				for (@Pc(89) int local89 = local45 - 4; local89 <= local45 + 4; local89++) {
					@Pc(93) int local93 = Static61.anInt1129;
					if (local93 < 3 && Static372.method4855(local83, local89)) {
						local93++;
					}
					@Pc(104) int local104 = 0;
					if (Static318.aClass118_Sub1_2.aByteArrayArrayArray13 != null && Static318.aClass118_Sub1_2.aByteArrayArrayArray13[local93] != null) {
						local104 = (Static318.aClass118_Sub1_2.aByteArrayArrayArray13[local93][local83][local89] & 0xFF) * 8;
					}
					@Pc(137) int local137 = local51 + local104 - Static345.aClass162Array3[local93].ua(local83, local89);
					if (local53 < local137) {
						local53 = local137;
					}
				}
			}
		}
		local83 = (local53 >> 0) * 1536;
		if (local83 > 786432) {
			local83 = 786432;
		}
		if (local83 < 262144) {
			local83 = 262144;
		}
		if (Static430.anInt6949 < local83) {
			Static430.anInt6949 += (local83 - Static430.anInt6949) / 24;
		} else if (local83 < Static430.anInt6949) {
			Static430.anInt6949 += (local83 - Static430.anInt6949) / 80;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static260.method3501(arg2)) {
			if (Static388.aClass16ArrayArray4[arg2] == null) {
				Static283.method3766(-1, arg3, arg6, arg4, Static151.aClass16ArrayArray1[arg2], arg5, arg0, arg7, arg1);
			} else {
				Static283.method3766(-1, arg3, arg6, arg4, Static388.aClass16ArrayArray4[arg2], arg5, arg0, arg7, arg1);
			}
		} else if (arg4 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static101.aBooleanArray9[local19] = true;
			}
		} else {
			Static101.aBooleanArray9[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method5598(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString1 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local10 + "| " + local61;
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
			local10 = local10 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local10 = local10 + local64.substring(local129 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public static void method5599() {
		@Pc(1) Class132 local1 = Static459.aClass132_35;
		synchronized (Static459.aClass132_35) {
			Static459.aClass132_35.method2698();
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	public static void method5600() {
		Static253.aClass132_33.method2698();
	}
}
