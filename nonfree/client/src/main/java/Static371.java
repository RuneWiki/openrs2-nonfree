import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!so", name = "V", descriptor = "J")
	public static long aLong189;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "S")
	public static short aShort84 = 1;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!sc;")
	public static RuntimeException_Sub1 method4756(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString56 = local9.aString56 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(B)V")
	public static void method4757() {
		if (Static92.anInt1900 != -1) {
			Static320.method4226(Static92.anInt1900, -1, -1, false);
			Static92.anInt1900 = -1;
		}
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	public static void method4759() {
		if (Static114.anIntArray163 != null && Static54.anIntArray80 != null) {
			return;
		}
		Static54.anIntArray80 = new int[256];
		Static114.anIntArray163 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static114.anIntArray163[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static54.anIntArray80[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
