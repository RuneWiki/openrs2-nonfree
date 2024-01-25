import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "B")
	public static byte aByte25;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
	public static final int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
	public static int anInt3778 = 2;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
	public static int anInt3782 = 0;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!tf;")
	public static Class240 aClass240_10 = null;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_52 = new Class212(23, 7);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static305.aShort66 + (Static35.aShort4 - Static305.aShort66) * local7 / 100;
		@Pc(39) int local39 = local33 * arg6 >> 8;
		@Pc(46) int local46 = 16384 - arg4 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg5 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local39;
		if (local46 != 0) {
			local57 = -local39 * Class4_Sub13.anIntArray497[local46] >> 15;
			local59 = local39 * Class4_Sub13.anIntArray496[local46] >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class4_Sub13.anIntArray497[local53] >> 15;
			local59 = Class4_Sub13.anIntArray496[local53] * local59 >> 15;
		}
		Static108.anInt2350 = arg0 - local59;
		Static200.anInt3936 = arg5;
		Static439.anInt7477 = arg4;
		Static235.anInt4645 = arg1 - local55;
		Static246.anInt4786 = 0;
		Static405.anInt7103 = arg2 - local57;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method3391() {
		Static447.method6112(Static30.aClass30_3, (long) Static277.anInt2834);
		if (Static248.anInt4793 != -1) {
			Static392.method5525(Static248.anInt4793);
		}
		for (@Pc(18) int local18 = 0; local18 < Static171.anInt3372; local18++) {
			if (Static353.aBooleanArray124[local18]) {
				Static237.aBooleanArray88[local18] = true;
			}
			Static122.aBooleanArray51[local18] = Static353.aBooleanArray124[local18];
			Static353.aBooleanArray124[local18] = false;
		}
		Static52.anInt1250 = Static277.anInt2834;
		if (Static30.aClass30_3.method2052()) {
			Static345.aBoolean455 = true;
		}
		if (Static248.anInt4793 != -1) {
			Static171.anInt3372 = 0;
			Static195.method4949();
		}
		Static30.aClass30_3.H();
		Static206.method3647(Static30.aClass30_3);
		@Pc(71) int local71 = Static107.method2120();
		if (local71 == -1) {
			local71 = Static457.anInt7815;
		}
		if (local71 == -1) {
			local71 = Static5.anInt66;
		}
		Static249.method4104(local71);
		Static75.anInt1854 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3392(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(29) String local29;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			arg0 = local16.aThrowable1;
			local29 = local16.aString77 + " | ";
		} else {
			local29 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local29 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local29 = local29 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local29 = local29 + local64.substring(local129 + 5, local77);
				}
			}
			local29 = local29 + ' ';
		}
	}
}
