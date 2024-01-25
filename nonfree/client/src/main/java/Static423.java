import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!ub;")
	public static Class234 aClass234_5;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt7327 = -2;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public static void method5679() {
		if (Static276.aClass109_10.method4748()) {
			Static276.aClass109_10.method4728(Static299.aCanvas5);
			Static273.method3955();
			Static276.aClass109_10.method4707(Static299.aCanvas5);
			Static276.aClass109_10.method4752(Static299.aCanvas5);
		} else {
			Static262.method3812(Static285.anInt7839);
		}
		Static353.method4882();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIJIIBIZLjava/lang/String;Ljava/lang/String;Z)V")
	public static void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) String arg7, @OriginalArg(9) String arg8, @OriginalArg(10) boolean arg9) {
		if (!Static108.aBoolean111 && Static82.anInt1627 < 500) {
			@Pc(18) int local18 = arg4 == -1 ? Static246.anInt4394 : arg4;
			@Pc(32) Class1_Sub8 local32 = new Class1_Sub8(arg8, arg7, local18, arg3, arg5, arg2, arg0, arg1, arg9, arg6);
			Static8.aClass266_2.method5998(local32);
			Static82.anInt1627++;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BB)C")
	public static char method5682(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static348.aCharArray5[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}
}
