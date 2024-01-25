import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
	public static int anInt7797;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_82 = new Class387(54, 6);

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "[I")
	public static final int[] anIntArray468 = new int[32];

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	public static int anInt7798 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZLclient!cn;I)V")
	public static void method6703(@OriginalArg(0) int arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray16 != null) {
			@Pc(14) Class5_Sub3 local14 = new Class5_Sub3();
			local14.aClass73_1 = arg1;
			local14.anObjectArray1 = arg1.anObjectArray16;
			Static173.method2520(local14);
		}
		Static382.anInt9821 = arg2;
		Static400.anInt6886 = arg1.anInt1364;
		Static446.anInt7686 = arg1.anInt1390;
		Static199.aBoolean706 = true;
		Static586.anInt9800 = arg1.anInt1396;
		Static395.anInt6753 = arg1.anInt1419;
		Static7.anInt85 = arg1.anInt1388;
		Static187.anInt3082 = arg0;
		Static298.method4399(arg1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([II[FIIII[F[IIZII)V")
	public static void method6705(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(16) int local16 = arg3 + arg5 * arg9;
		@Pc(22) int local22 = arg11 + arg10 * arg1;
		@Pc(27) int local27 = arg5 - arg6;
		@Pc(32) int local32 = arg1 - arg6;
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0 == null) {
			for (local36 = 0; local36 < arg4; local36++) {
				local43 = local16 + arg6;
				while (local16 < local43) {
					arg7[local22++] = arg2[local16++];
				}
				local22 += local32;
				local16 += local27;
			}
		} else if (arg2 == null) {
			for (local36 = 0; local36 < arg4; local36++) {
				local43 = arg6 + local16;
				while (local16 < local43) {
					arg8[local22++] = arg0[local16++];
				}
				local22 += local32;
				local16 += local27;
			}
		} else {
			for (local36 = 0; local36 < arg4; local36++) {
				local43 = arg6 + local16;
				while (local43 > local16) {
					arg8[local22] = arg0[local16];
					arg7[local22++] = arg2[local16++];
				}
				local22 += local32;
				local16 += local27;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B[BII)Ljava/lang/String;")
	public static String method6706(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(22) int local22 = arg0[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(47) char local47 = Static135.aCharArray1[local22 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local22 = local47;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Lclient!hia;")
	public static Class5_Sub20 method6707() {
		@Pc(7) Class286 local7 = null;
		@Pc(13) Class5_Sub20 local13 = new Class5_Sub20(Static256.aClass333_3, 0);
		try {
			@Pc(19) Class366 local19 = Static294.aClass230_3.method5344("");
			while (local19.anInt10206 == 0) {
				Static351.method5279(1L);
			}
			if (local19.anInt10206 == 1) {
				local7 = (Class286) local19.anObject18;
				@Pc(52) byte[] local52 = new byte[(int) local7.method6823()];
				@Pc(67) int local67;
				for (@Pc(54) int local54 = 0; local54 < local52.length; local54 += local67) {
					local67 = local7.method6822(local52.length - local54, local52, local54);
					if (local67 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class5_Sub20(new Class5_Sub23(local52), Static256.aClass333_3, 0);
			}
		} catch (@Pc(103) Exception local103) {
		}
		try {
			if (local7 != null) {
				local7.method6820();
			}
		} catch (@Pc(110) Exception local110) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ha;Lclient!ap;Z)I")
	public static int method6708(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class21 arg1) {
		if (arg1.anInt356 != -1) {
			return arg1.anInt356;
		}
		if (arg1.anInt358 != -1) {
			@Pc(28) Class233 local28 = arg0.anInterface1_11.method2863(arg1.anInt358);
			if (!local28.aBoolean482) {
				return local28.aShort78;
			}
		}
		return arg1.anInt355;
	}
}
