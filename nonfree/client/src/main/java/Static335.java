import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!ip;")
	public static Class3_Sub4_Sub13 aClass3_Sub4_Sub13_2;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_91 = new Class130(49, -1);

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
	public static final int[] anIntArray391 = new int[13];

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_87 = new Class200(72, 0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIIII[BBI)V")
	public static void method5466(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(26) int local26 = -arg1; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg7++;
				arg6[local34] = (byte) (arg6[local34] - arg0[arg4++]);
				@Pc(47) int local47 = arg7++;
				arg6[local47] = (byte) (arg6[local47] - arg0[arg4++]);
				@Pc(60) int local60 = arg7++;
				arg6[local60] = (byte) (arg6[local60] - arg0[arg4++]);
				@Pc(73) int local73 = arg7++;
				arg6[local73] = (byte) (arg6[local73] - arg0[arg4++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local34 = arg7++;
				arg6[local34] = (byte) (arg6[local34] - arg0[arg4++]);
			}
			arg4 += arg3;
			arg7 += arg2;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method5467(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static225.method7345(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static231.method3852(local7);
			local7 = Static214.method3619(":", local7, "%3a");
			local7 = Static214.method3619("@", local7, "%40");
			local7 = Static214.method3619("&", local7, "%26");
			local7 = Static214.method3619("#", local7, "%23");
			if (Static291.anApplet1 != null) {
				@Pc(108) Class304 local108 = Static134.aClass138_1.method3576(new URL(Static291.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static518.anInt8973 + "&u=" + Static566.aLong250 + "&v1=" + Static211.aString42 + "&v2=" + Static211.aString47 + "&e=" + local7));
				while (local108.anInt8838 == 0) {
					Static258.method4293(1L);
				}
				if (local108.anInt8838 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local108.anObject16;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Z")
	public static boolean method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZZI)V")
	public static void method5470(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static183.anInt3502++;
			Static414.method6555();
		}
		if (arg1) {
			Static644.anInt10230++;
			Static481.method7187();
		}
	}
}
