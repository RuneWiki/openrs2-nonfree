import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Lclient!bb;")
	public static Class4_Sub7_Sub1 aClass4_Sub7_Sub1_2;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "[Lclient!i;")
	public static Class83[] aClass83Array7;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "[I")
	public static final int[] anIntArray454 = new int[1];

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method6841(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString1 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local24 + "| " + local56;
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
			local24 = local24 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local24 = local24 + local64.substring(local129 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)I")
	public static int method6842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method6843(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local16 < local19 && Static2.method71(arg0.charAt(local16))) {
			local16++;
		}
		while (local16 < local19 && Static2.method71(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(53) int local53 = local19 - local16;
		if (local53 < 1 || local53 > 12) {
			return null;
		}
		@Pc(70) StringBuffer local70 = new StringBuffer(local53);
		for (@Pc(72) int local72 = local16; local72 < local19; local72++) {
			@Pc(78) char local78 = arg0.charAt(local72);
			if (Static498.method7375(local78)) {
				@Pc(86) char local86 = Static154.method2857(local78);
				if (local86 != '\u0000') {
					local70.append(local86);
				}
			}
		}
		if (local70.length() == 0) {
			return null;
		} else {
			return local70.toString();
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	public static void method6845() {
		if (Static332.anInt6370 == -1) {
			return;
		}
		@Pc(12) int local12 = Static172.aClass135_1.method6370();
		@Pc(18) int local18 = Static172.aClass135_1.method6378();
		@Pc(23) Class4_Sub15 local23 = (Class4_Sub15) Static222.aClass244_35.method5963();
		if (local23 != null) {
			local12 = local23.method3495();
			local18 = local23.method3498();
		}
		Static252.method4038(Static375.anInt7256, 0, 0, 0, 0, local12, local18, Static554.anInt9828, Static332.anInt6370);
		if (Static136.aClass225_14 != null) {
			Static466.method7859(local18, local12);
		}
	}
}
