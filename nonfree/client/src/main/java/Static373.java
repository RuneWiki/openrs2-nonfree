import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	public static int anInt6613;

	@OriginalMember(owner = "client!mk", name = "E", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array19;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "[J")
	public static final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
	public static int anInt6615 = 1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!kh;)Ljava/lang/String;")
	public static String method5516(@OriginalArg(1) int arg0, @OriginalArg(2) Class208 arg1) {
		if (!Static82.method1754(arg1).method38(arg0) && arg1.anObjectArray3 == null) {
			return null;
		} else if (arg1.aStringArray41 == null || arg0 >= arg1.aStringArray41.length || arg1.aStringArray41[arg0] == null || arg1.aStringArray41[arg0].trim().length() == 0) {
			return Static605.aBoolean708 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray41[arg0];
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!kh;II)V")
	public static void method5517(@OriginalArg(1) Class208 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = arg0.method4715(Static582.aClass16_12);
		if (local8 == null) {
			return;
		}
		Static582.aClass16_12.KA(arg1, arg2, arg1 + arg0.anInt5639, arg2 + arg0.anInt5630);
		if (Static364.anInt6467 >= 3) {
			Static582.aClass16_12.A(-16777216, local8, arg1, arg2);
		} else {
			Static169.aClass102_11.method6971((float) arg0.anInt5639 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt5630 / 2.0F, ((int) -Static204.aFloat82 & 0x3FFF) << 2, local8, arg1, arg2);
		}
	}
}
