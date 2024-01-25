import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "I")
	public static int anInt5453;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "[I")
	public static final int[] anIntArray598 = new int[13];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)C")
	public static char method4859(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(39) char local39 = Static239.aCharArray15[local7 - 128];
			if (local39 == '\u0000') {
				local39 = '?';
			}
			local7 = local39;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!np;)V")
	public static void method4883(@OriginalArg(1) Class155 arg0) {
		if (Static349.aBoolean449) {
			Static253.method4127(arg0);
		} else {
			Static253.method4128(arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!mj;Lclient!wp;II)Lclient!np;")
	public static synchronized Class155 method4934(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) Interface10 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static137.aBooleanArray31[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(51) Class155 local51;
		if (arg0 == 0) {
			local51 = Static91.method2650(arg1, local7, arg3);
		} else if (arg0 == 1) {
			local51 = Static342.method5174(arg2, arg1, local7, arg3, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static137.aBooleanArray31[local7] = true;
		return local51;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!rp;)V")
	public static void method4951(@OriginalArg(1) Class3_Sub5 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt1626; local3++) {
			@Pc(9) int local9 = arg0.method2750();
			@Pc(15) int local15 = arg0.method2767();
			if (local15 == 65535) {
				local15 = -1;
			}
			if (Static135.aClass23_Sub1Array2[local9] != null) {
				Static135.aClass23_Sub1Array2[local9].anInt329 = local15;
			}
		}
	}
}
