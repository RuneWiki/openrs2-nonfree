import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!no", name = "u", descriptor = "[[[Lclient!ui;")
	public static Class227[][][] aClass227ArrayArrayArray4;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "S")
	public static short aShort66 = 1;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!no", name = "v", descriptor = "[I")
	public static final int[] anIntArray538 = new int[32];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!es;)V")
	public static void method3897(@OriginalArg(1) Class12_Sub1_Sub2 arg0) {
		@Pc(14) int local14 = arg0.anInt5372 - Static295.anInt5281;
		@Pc(26) int local26 = arg0.anInt5344 * 128 + arg0.method4706() * 64;
		@Pc(38) int local38 = arg0.anInt5347 * 128 + arg0.method4706() * 64;
		arg0.anInt5377 = 0;
		arg0.anInt6317 += (local38 - arg0.anInt6317) / local14;
		arg0.anInt6328 += (local26 - arg0.anInt6328) / local14;
		if (arg0.anInt5346 == 0) {
			arg0.method4697(8192);
		}
		if (arg0.anInt5346 == 1) {
			arg0.method4697(12288);
		}
		if (arg0.anInt5346 == 2) {
			arg0.method4697(0);
		}
		if (arg0.anInt5346 == 3) {
			arg0.method4697(4096);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZI)V")
	public static void method3898(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		Static143.method2460(-1, arg3, arg0, arg4, null, arg1, arg2);
	}
}
