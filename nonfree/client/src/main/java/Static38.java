import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
	public static final int[] anIntArray51 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
	public static final int[] anIntArray52 = new int[32];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ko;I)V")
	public static void method553(@OriginalArg(0) Class118 arg0) {
		@Pc(7) Class113 local7 = null;
		try {
			@Pc(16) Class2 local16 = arg0.method2702();
			while (local16.anInt6 == 0) {
				Static244.method4311(1L);
			}
			if (local16.anInt6 == 1) {
				local7 = (Class113) local16.anObject1;
				@Pc(37) Class11_Sub25 local37 = Static129.method1987();
				local7.method2304(0, local37.aByteArray93, local37.anInt6076);
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			if (local7 != null) {
				local7.method2307();
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method554(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static73.method1125(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static74.method1142(local7);
			local7 = Static137.method2134(":", local7, "%3a");
			local7 = Static137.method2134("@", local7, "%40");
			local7 = Static137.method2134("&", local7, "%26");
			local7 = Static137.method2134("#", local7, "%23");
			if (Static142.aClass118_3.anApplet1 != null) {
				@Pc(99) Class2 local99 = Static142.aClass118_3.method2707(new URL(Static142.aClass118_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static129.anInt2386 + "&u=" + Static89.aLong58 + "&v1=" + Static167.aString29 + "&v2=" + Static167.aString31 + "&e=" + local7));
				while (local99.anInt6 == 0) {
					Static244.method4311(1L);
				}
				if (local99.anInt6 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local99.anObject1;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
