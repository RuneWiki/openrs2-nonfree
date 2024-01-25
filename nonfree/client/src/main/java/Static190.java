import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!pt;")
	public static final Class265 aClass265_8 = new Class265();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!sn;")
	public static final Class313 aClass313_12 = new Class313("WTRC", 1);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public static int anInt7431 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!oh;Lclient!d;IIILjava/awt/Canvas;)Lclient!ha;")
	public static synchronized Class16 method6065(@OriginalArg(0) int arg0, @OriginalArg(2) Class237 arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Canvas arg6) {
		if (arg4 == 0) {
			return Static435.method6736(arg3, arg5, arg2, arg6);
		} else if (arg4 == 2) {
			return Static633.method8187(arg5, arg3, arg2, arg6);
		} else if (arg4 == 1) {
			return Static346.method5510(arg2, arg6, arg0);
		} else if (arg4 == 5) {
			return Static290.method4840(arg0, arg6, arg1, arg2);
		} else if (arg4 == 3) {
			return Static648.method3527(arg0, arg6, arg1, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method6073(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(23) char local23 = arg0.charAt(local14);
			if (local23 == '%' && local14 + 2 < local12) {
				local23 = arg0.charAt(local14 + 1);
				@Pc(51) int local51;
				if (local23 >= '0' && local23 <= '9') {
					local51 = local23 - 48;
				} else if (local23 >= 'a' && local23 <= 'f') {
					local51 = local23 - 87;
				} else {
					if (local23 < 'A' || local23 > 'F') {
						local9.append('%');
						continue;
					}
					local51 = local23 - 55;
				}
				local23 = arg0.charAt(local14 + 2);
				local51 *= 16;
				if (local23 >= '0' && local23 <= '9') {
					local51 += local23 - 48;
				} else if (local23 >= 'a' && local23 <= 'f') {
					local51 += local23 + 10 - 97;
				} else {
					if (local23 < 'A' || local23 > 'F') {
						local9.append('%');
						continue;
					}
					local51 += local23 + '\n' - 65;
				}
				if (local51 != 0 && Static443.method6819((byte) local51)) {
					local9.append(Static303.method4962((byte) local51));
				}
				local14 += 2;
			} else if (local23 == '+') {
				local9.append(' ');
			} else {
				local9.append(local23);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public static void method6092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class8_Sub5_Sub8 local12 = Static509.method7344(16, arg1);
		local12.method3509();
		local12.anInt4321 = arg0;
	}
}
