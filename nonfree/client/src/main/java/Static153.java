import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!nb;")
	public static Class111 aClass111_2;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public static int anInt3122 = 0;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43 = null;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!tk;")
	public static Class159 aClass159_12 = null;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "Z")
	public static boolean aBoolean257 = true;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString105 = null;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "[F")
	public static float[] aFloatArray15 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)V")
	public static void method2448(@OriginalArg(0) int arg0) {
		@Pc(14) Class8_Sub1_Sub6 local14 = Static181.method2779(2, arg0);
		local14.method929();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public static void method2450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static19.method343(arg1 - arg2, arg0, Static181.anIntArrayArray19[arg3], arg2 + arg1);
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = -arg2;
		@Pc(25) int local25 = arg2;
		@Pc(27) int local27 = -1;
		while (local20 < local25) {
			local27 += 2;
			local23 += local27;
			local20++;
			if (local23 >= 0) {
				local25--;
				local23 -= local25 << 1;
				@Pc(57) int[] local57 = Static181.anIntArrayArray19[arg3 + local25];
				@Pc(62) int local62 = arg1 + local20;
				@Pc(68) int[] local68 = Static181.anIntArrayArray19[arg3 - local25];
				@Pc(72) int local72 = arg1 - local20;
				Static19.method343(local72, arg0, local57, local62);
				Static19.method343(local72, arg0, local68, local62);
			}
			@Pc(89) int local89 = arg1 - local25;
			@Pc(95) int[] local95 = Static181.anIntArrayArray19[local20 + arg3];
			@Pc(99) int local99 = local25 + arg1;
			@Pc(106) int[] local106 = Static181.anIntArrayArray19[arg3 - local20];
			Static19.method343(local89, arg0, local95, local99);
			Static19.method343(local89, arg0, local106, local99);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	public static void method2451() {
		@Pc(6) Class8_Sub12 local6;
		for (local6 = (Class8_Sub12) Static52.aClass182_5.method4319(); local6 != null; local6 = (Class8_Sub12) Static52.aClass182_5.method4329()) {
			if (local6.aBoolean171) {
				local6.method1700();
			}
		}
		for (local6 = (Class8_Sub12) Static191.aClass182_24.method4319(); local6 != null; local6 = (Class8_Sub12) Static191.aClass182_24.method4329()) {
			if (local6.aBoolean171) {
				local6.method1700();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)J")
	public static long method2452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass134_1 == null ? 0L : local7.aClass134_1.aLong147;
	}
}
