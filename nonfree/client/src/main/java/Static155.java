import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_870 = Static81.method1507("To create a new account you need to");

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_871 = Static81.method1507("Take");

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!dj;")
	public static Class24 aClass24_872 = aClass24_870;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_873 = Static81.method1507("Benutzername: ");

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!dj;")
	public static Class24 aClass24_874 = aClass24_871;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method2240() {
		Static64.aFont1 = null;
		Static108.aFontMetrics1 = null;
		Static96.anImage4 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public static void method2241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static79.anInt1892 != 0 && arg1 != -1) {
			method2245(Static79.anInt1892, arg1, Static92.aClass69_Sub1_68);
			Static173.aBoolean177 = true;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2242(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(27) String local27;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(14) RuntimeException_Sub1 local14 = (RuntimeException_Sub1) arg0;
			arg0 = local14.aThrowable1;
			local27 = local14.aString2 + " | ";
		} else {
			local27 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local27 + "| " + local58;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(88) String local88 = local61.substring(local67 + 1, local74);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local27 = local27 + local88 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local27 = local27 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
			return;
		}
		if (Static30.aBoolean35 && Static170.anInt3799 != arg4) {
			return;
		}
		@Pc(34) int local34 = arg4;
		if (arg4 < 3 && (Static43.aByteArrayArrayArray3[1][arg1][arg2] & 0x2) == 2) {
			local34 = arg4 + 1;
		}
		Static125.method2097(arg2, local34, arg1, Static66.aClass93Array1[arg4], arg0, arg4);
		if (arg5 >= 0) {
			Static48.method881(false, arg1, Static66.aClass93Array1[arg4], arg6, arg5, false, arg2, arg3, arg4, local34);
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZIILclient!ve;)V")
	public static void method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class69 arg2) {
		Static116.anInt2596 = arg1;
		Static91.anInt2111 = 1;
		Static47.anInt1175 = 0;
		Static16.anInt377 = arg0;
		Static120.aClass69_29 = arg2;
		Static152.aBoolean156 = false;
		Static103.anInt2312 = 10000;
	}
}
