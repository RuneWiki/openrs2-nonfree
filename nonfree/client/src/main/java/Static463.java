import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	public static int anInt7780;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt7779 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBII)Z")
	public static boolean method6855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static437.aBoolean537 || !Static631.aBoolean753) {
			return false;
		} else if (Static192.anInt3358 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static519.anIntArrayArrayArray13[arg0][arg1][arg2];
			if (-Static28.anInt364 == local22) {
				return false;
			} else if (Static28.anInt364 == local22) {
				return true;
			} else if (Static11.aClass61Array1 == Static456.aClass61Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << Static115.anInt2156;
				@Pc(63) int local63 = arg2 << Static115.anInt2156;
				if (Static606.method8668(Static11.aClass61Array1[arg0].method8580(arg2, arg1), local59 + Static302.anInt5267 - 1, local63 + 1, Static11.aClass61Array1[arg0].method8580(arg2 + 1, arg1), local59 + 1, Static11.aClass61Array1[arg0].method8580(arg2 + 1, arg1 + 1), local59 + 1, Static302.anInt5267 + -1 + local63, Static302.anInt5267 + local63 - 1) && Static606.method8668(Static11.aClass61Array1[arg0].method8580(arg2, arg1), Static302.anInt5267 + local59 - 1, local63 + 1, Static11.aClass61Array1[arg0].method8580(arg2 + 1, arg1 + 1), Static302.anInt5267 + local59 - 1, Static11.aClass61Array1[arg0].method8580(arg2, arg1 - -1), local59 + 1, local63 - -Static302.anInt5267 + -1, local63 + 1)) {
					Static242.anInt4460++;
					Static519.anIntArrayArrayArray13[arg0][arg1][arg2] = Static28.anInt364;
					return true;
				} else {
					Static519.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static28.anInt364;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!tw;I)Z")
	public static boolean method6856(@OriginalArg(0) Interface22 arg0) {
		@Pc(17) Class181 local17 = Static61.aClass246_7.method5497(arg0.method8490());
		if (local17.anInt4789 == -1) {
			return true;
		} else {
			@Pc(30) Class348 local30 = Static586.aClass333_4.method7937(local17.anInt4789);
			return local30.anInt9594 == -1 ? true : local30.method8240();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method6857(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString87 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local21 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(88) String local88;
			if (local73 == -1) {
				local88 = local67;
			} else {
				local88 = local67.substring(0, local73);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local21 = local21 + local88;
			if (local73 != -1 && local80 != -1) {
				@Pc(132) int local132 = local67.indexOf(".java:", local73);
				if (local132 >= 0) {
					local21 = local21 + local67.substring(local132 + 5, local80);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
