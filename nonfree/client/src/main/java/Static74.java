import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)Z")
	public static boolean method1294(@OriginalArg(0) int arg0) {
		if (arg0 == 59 || arg0 == 19 || arg0 == 13 || arg0 == 25 || arg0 == 20) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
	public static void method1295() {
		if (Static326.aFileOutputStream1 != null) {
			try {
				Static326.aFileOutputStream1.close();
			} catch (@Pc(12) IOException local12) {
			}
		}
		Static326.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZIII)Lclient!vd;")
	public static Class353 method1296(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class227 local5 = null;
		if (Static219.aClass73_1 != null) {
			local5 = new Class227(arg2, Static219.aClass73_1, Static435.aClass73Array1[arg2], 1000000);
		}
		Static241.aClass217_Sub1Array7[arg2] = Static4.aClass230_5.method6218(local5, arg2, Static512.aClass227_4);
		Static241.aClass217_Sub1Array7[arg2].method5802();
		return new Class353(Static241.aClass217_Sub1Array7[arg2], arg0, arg1);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1297(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local7 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(41) int local41 = arg0.indexOf(" ", "directlogin ".length());
			if (local41 >= 0) {
				@Pc(46) int local46 = arg0.length();
				arg0 = arg0.substring(0, local41) + " ";
				for (@Pc(62) int local62 = local41 + 1; local62 < local46; local62++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
