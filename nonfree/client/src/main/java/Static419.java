import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!ok;")
	public static Class178 aClass178_129;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Lclient!kr;")
	public static final Class137 aClass137_4 = new Class137("runescape", 0);

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
	public static int anInt6675 = 0;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_135 = new Class55("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "[I")
	public static final int[] anIntArray587 = new int[2048];

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "Z")
	public static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method5247(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static114.method1945(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static261.method3511(local7);
			local7 = Static243.method3292(":", local7, "%3a");
			local7 = Static243.method3292("@", local7, "%40");
			local7 = Static243.method3292("&", local7, "%26");
			local7 = Static243.method3292("#", local7, "%23");
			if (Static217.aClass61_3.anApplet1 != null) {
				@Pc(99) Class236 local99 = Static217.aClass61_3.method1455(new URL(Static217.aClass61_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static403.anInt4197 + "&u=" + Static371.aLong189 + "&v1=" + Static85.aString14 + "&v2=" + Static85.aString8 + "&e=" + local7));
				while (local99.anInt6178 == 0) {
					Static214.method2089(1L);
				}
				if (local99.anInt6178 == 1) {
					@Pc(117) DataInputStream local117 = (DataInputStream) local99.anObject8;
					local117.read();
					local117.close();
				}
			}
		} catch (@Pc(124) Exception local124) {
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V")
	public static void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static293.anInt4886 <= arg3 && arg5 <= Static137.anInt2576 && Static316.anInt5188 <= arg1 && arg4 <= Static82.anInt1667) {
			if (arg0 == 1) {
				Static333.method2750(arg5, arg4, arg2, arg1, arg3);
			} else {
				Static229.method4629(arg1, arg5, arg0, arg4, arg2, arg3);
			}
		} else if (arg0 == 1) {
			Static69.method1171(arg2, arg4, arg5, arg3, arg1);
		} else {
			Static454.method5776(arg1, arg0, arg3, arg4, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(IB)V")
	public static void method5250() {
		@Pc(13) Class126 local13 = Static124.aClass126_19;
		synchronized (Static124.aClass126_19) {
			Static124.aClass126_19.method2828(5);
		}
	}
}
