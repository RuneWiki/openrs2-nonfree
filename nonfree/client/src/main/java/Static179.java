import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!lp;")
	public static Class155 aClass155_4;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!lt;")
	public static Class158 aClass158_37;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
	public static final int[] anIntArray288 = new int[500];

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "[Lclient!lp;")
	public static final Class155[] aClass155Array1 = new Class155[30];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public static int method2799() {
		if (Static332.aClass239_12 == null) {
			if (!Static206.aBoolean239 && Static228.anInt3878 > 0) {
				if (Static219.aBoolean247 && Static326.aClass86_1.method1867(81) && Static228.anInt3878 > 2) {
					return ((Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251.aClass6_251).anInt5952;
				}
				return ((Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251).anInt5952;
			}
			@Pc(18) int local18 = Static37.aClass71_26.method1618();
			@Pc(24) int local24 = Static37.aClass71_26.method1624();
			@Pc(26) int local26 = Static203.anInt3581;
			@Pc(28) int local28 = Static236.anInt4059;
			@Pc(30) int local30 = Static265.anInt4552;
			if (local18 > local26 && local30 + local26 > local18) {
				@Pc(44) int local44 = -1;
				@Pc(64) int local64;
				for (@Pc(46) int local46 = 0; local46 < Static228.anInt3878; local46++) {
					if (Static312.aBoolean355) {
						local64 = local28 + (Static228.anInt3878 - local46 - 1) * 16 + 33;
						if (local64 - 13 < local24 && local24 <= local64 + 3) {
							local44 = local46;
						}
					} else {
						local64 = (Static228.anInt3878 - local46 - 1) * 16 + local28 + 31;
						if (local24 > local64 - 13 && local24 <= local64 + 3) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local64 = 0;
					@Pc(125) Class236 local125 = new Class236(Static307.aClass88_23);
					for (@Pc(130) Class6_Sub33 local130 = (Class6_Sub33) local125.method5317(); local130 != null; local130 = (Class6_Sub33) local125.method5315()) {
						if (local64++ == local44) {
							return local130.anInt5952;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2800(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(26) String local26;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			local26 = local16.aString69 + " | ";
			arg0 = local16.aThrowable1;
		} else {
			local26 = "";
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
				return local26 + "| " + local61;
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
			local26 = local26 + local83;
			if (local70 != -1 && local77 != -1) {
				@Pc(131) int local131 = local64.indexOf(".java:", local70);
				if (local131 >= 0) {
					local26 = local26 + local64.substring(local131 + 5, local77);
				}
			}
			local26 = local26 + ' ';
		}
	}
}
