import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aca", name = "p", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "[I")
	public static final int[] anIntArray75 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "Z")
	public static volatile boolean aBoolean13 = true;

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!aca", name = "z", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_9 = new Class133(73, 3);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method220(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static46.method1006(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static318.method4376(local7);
			local7 = Static210.method3875(":", local7, "%3a");
			local7 = Static210.method3875("@", local7, "%40");
			local7 = Static210.method3875("&", local7, "%26");
			local7 = Static210.method3875("#", local7, "%23");
			if (Static531.anApplet2 != null) {
				@Pc(99) Class212 local99 = Static35.aClass285_3.method7035(new URL(Static531.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static199.anInt4472 + "&u=" + Static133.aLong81 + "&v1=" + Static472.aString77 + "&v2=" + Static472.aString74 + "&e=" + local7));
				while (local99.anInt6547 == 0) {
					Static327.method5231(1L);
				}
				if (local99.anInt6547 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local99.anObject13;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIBII)V")
	public static void method221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg3 >= Static190.anInt4314 && Static145.anInt2941 >= arg0 + arg3 && Static269.anInt5577 <= arg2 - arg3 && Static81.anInt1788 >= arg3 + arg2) {
			Static194.method3706(arg5, arg4, arg3, arg0, arg1, arg2);
		} else {
			Static188.method3550(arg4, arg5, arg2, arg3, arg0, arg1);
		}
	}
}
