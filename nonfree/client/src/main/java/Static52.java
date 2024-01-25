import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "Lclient!ffa;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!caa", name = "p", descriptor = "J")
	public static long aLong52 = -1L;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method1284(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			arg0 = local12.aThrowable1;
			local8 = local12.aString40 + " | ";
		} else {
			local8 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local29);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local8 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(83) String local83;
			if (local67 == -1) {
				local83 = local61;
			} else {
				local83 = local61.substring(0, local67);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local8 = local8 + local83;
			if (local67 != -1 && local74 != -1) {
				@Pc(126) int local126 = local61.indexOf(".java:", local67);
				if (local126 >= 0) {
					local8 = local8 + local61.substring(local126 + 5, local74);
				}
			}
			local8 = local8 + ' ';
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Lclient!jba;")
	public static Class69_Sub1 method1287(@OriginalArg(1) int arg0) {
		return Static528.aBoolean799 && arg0 >= Static312.anInt6275 && Static394.anInt7572 >= arg0 ? Static390.aClass69_Sub1Array2[arg0 - Static312.anInt6275] : null;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(II)I")
	public static int method1289(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
