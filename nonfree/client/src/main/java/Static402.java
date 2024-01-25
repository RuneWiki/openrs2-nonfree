import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_51 = new Class216();

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "[I")
	public static final int[] anIntArray426 = new int[1000];

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "[Lclient!tj;")
	public static final Class3_Sub22[] aClass3_Sub22Array5 = new Class3_Sub22[8];

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Lclient!bea;")
	public static Class28 method6292() {
		try {
			return new Class28_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class28_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/lang/String;CB)I")
	public static int method6293(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1 == arg0.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(FIIFIZFLclient!kt;FIFI[B)V")
	public static void method6295(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) Class80 arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) byte[] arg7) {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			Static407.method6325(arg0, local11, arg3, arg5, arg4, arg2, arg6, arg7, arg1);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZ)I")
	public static int method6296(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
