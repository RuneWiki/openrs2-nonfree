import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int anInt5670;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!wn;")
	public static final Class349 aClass349_10 = new Class349();

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public static int anInt5671 = -1;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_70 = new Class316(46, 3);

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public static int anInt5672 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method4620() {
		@Pc(3) Class349[] local3 = Class319.aClass349Array1;
		synchronized (Class319.aClass349Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class319.aClass349Array1.length; local7++) {
				Class319.aClass349Array1[local7] = new Class349();
				Static231.anIntArray714[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FIFILclient!tfa;[BBFIIFIF)V")
	public static void method4621(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) Class306 arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static403.method5822(arg3, arg4, arg6, arg5, arg7, arg0, arg1, local3, arg2);
			arg5 += 16384;
		}
	}
}
