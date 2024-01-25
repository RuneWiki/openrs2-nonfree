import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_56 = new Class27(13, 16);

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "F")
	public static float aFloat53 = 0.0F;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[Lclient!lj;")
	public static final Class10_Sub26[] aClass10_Sub26Array1 = new Class10_Sub26[1024];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!jn;")
	public static RuntimeException_Sub1 method2570(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString31 = local12.aString31 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method2571(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V")
	public static void method2572(@OriginalArg(1) boolean arg0) {
		Static278.method4705();
		if (!Static7.method78(Static358.anInt6086)) {
			return;
		}
		Static370.anInt6389++;
		if (Static370.anInt6389 < 50 && !arg0) {
			return;
		}
		Static370.anInt6389 = 0;
		if (!Static317.aBoolean361 && Static160.aClass253_3 != null) {
			Static310.method4308(Static225.aClass27_110);
			try {
				Static160.aClass253_3.method5494(Static337.aClass10_Sub8_Sub2_2.anInt2989, Static337.aClass10_Sub8_Sub2_2.aByteArray44);
				Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
			} catch (@Pc(56) IOException local56) {
				Static317.aBoolean361 = true;
			}
		}
		Static278.method4705();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	public static void method2573(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class10 local17 = Static25.aClass167_7.method3702(); local17 != null; local17 = Static25.aClass167_7.method3708()) {
			if ((long) arg0 == (local17.aLong264 >> 48 & 0xFFFFL)) {
				local17.method6033();
			}
		}
	}
}
