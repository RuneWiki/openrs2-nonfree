import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)[Lclient!fda;")
	public static Class112[] method265() {
		return new Class112[] { Static67.aClass112_2, Static60.aClass112_1, Static374.aClass112_15 };
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Z")
	public static boolean method266(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII[F[IZII[FII[I)V")
	public static void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11) {
		@Pc(16) int local16 = arg9 * arg6 + arg0;
		@Pc(22) int local22 = arg1 + arg7 * arg3;
		@Pc(27) int local27 = arg9 - arg10;
		@Pc(31) int local31 = arg3 - arg10;
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg5 == null) {
			for (local35 = 0; local35 < arg2; local35++) {
				local41 = local16 + arg10;
				while (local16 < local41) {
					arg4[local22++] = arg8[local16++];
				}
				local22 += local31;
				local16 += local27;
			}
		} else if (arg8 == null) {
			for (local35 = 0; local35 < arg2; local35++) {
				local41 = arg10 + local16;
				while (local16 < local41) {
					arg11[local22++] = arg5[local16++];
				}
				local22 += local31;
				local16 += local27;
			}
		} else {
			for (local35 = 0; local35 < arg2; local35++) {
				local41 = arg10 + local16;
				while (local41 > local16) {
					arg11[local22] = arg5[local16];
					arg4[local22++] = arg8[local16++];
				}
				local22 += local31;
				local16 += local27;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;)V")
	public static void method268(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static281.method3890(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			Static286.method3962(local5);
			local5 = Static527.method7366(local5, "%3a", ":");
			local5 = Static527.method7366(local5, "%40", "@");
			local5 = Static527.method7366(local5, "%26", "&");
			local5 = Static527.method7366(local5, "%23", "#");
			if (Static151.anApplet6 != null) {
				@Pc(108) Class297 local108 = Static317.aClass202_4.method4740(new URL(Static151.anApplet6.getCodeBase(), "clienterror.ws?c=" + Static293.anInt4548 + "&u=" + (Static126.aString19 == null ? String.valueOf(Static462.aLong247) : Static126.aString19) + "&v1=" + Static308.aString50 + "&v2=" + Static308.aString46 + "&e=" + local5));
				while (local108.anInt8459 == 0) {
					Static127.method1985(1L);
				}
				if (local108.anInt8459 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local108.anObject15;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
