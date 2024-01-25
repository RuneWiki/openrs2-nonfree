import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array1;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
	public static final int anInt54 = 4;

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
	public static void method69() {
		Static431.aClass244_56 = new Class244();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIII)V")
	public static void method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static472.anInt8217 = arg1;
		Static299.anInt5597 = arg4;
		Static15.anInt134 = arg3;
		Static258.anInt5017 = arg0;
		Static77.anInt2106 = arg2;
		if (Static15.anInt134 >= 100) {
			@Pc(24) int local24 = Static472.anInt8217 * 512 + 256;
			@Pc(30) int local30 = Static258.anInt5017 * 512 + 256;
			@Pc(39) int local39 = Static78.method3298(local24, Static594.anInt10310, local30) - Static77.anInt2106;
			@Pc(44) int local44 = local24 - Static407.anInt7345;
			@Pc(49) int local49 = local39 - Static335.anInt6057;
			@Pc(54) int local54 = local30 - Static418.anInt7466;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local54 * local54 + local44 * local44));
			Static568.anInt9808 = (int) (Math.atan2((double) local49, (double) local65) * 2607.5945876176133D) & 0x3FFF;
			Static421.anInt7497 = (int) (Math.atan2((double) local44, (double) local54) * -2607.5945876176133D) & 0x3FFF;
			if (Static568.anInt9808 < 1024) {
				Static568.anInt9808 = 1024;
			}
			Static528.anInt10345 = 0;
			if (Static568.anInt9808 > 3072) {
				Static568.anInt9808 = 3072;
			}
		}
		Static481.anInt8356 = -1;
		Static357.anInt6345 = -1;
		Static188.anInt4080 = 2;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)V")
	public static void method72(@OriginalArg(1) int arg0) {
		if (Static160.method2927(arg0)) {
			Static524.method7239(-1, Static449.aClass251ArrayArray1[arg0]);
		}
	}
}
