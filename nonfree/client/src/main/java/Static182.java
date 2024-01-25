import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
	public static int anInt4006;

	@OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
	public static int anInt4011;

	@OriginalMember(owner = "client!ls", name = "X", descriptor = "[I")
	public static int[] anIntArray344;

	@OriginalMember(owner = "client!ls", name = "U", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_85 = new Class130();

	@OriginalMember(owner = "client!ls", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString137 = "glow3:";

	@OriginalMember(owner = "client!ls", name = "W", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!ls", name = "Y", descriptor = "[I")
	public static final int[] anIntArray345 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)V")
	public static void method3392(@OriginalArg(1) int arg0) {
		Static57.anIntArrayArrayArray4 = new int[arg0][Static92.anInt2048 + 1][Static290.anInt5893 + 1];
		Static83.aByteArrayArrayArray2 = new byte[arg0][Static92.anInt2048 + 1][Static290.anInt5893 + 1];
		Static226.aByteArrayArrayArray8 = new byte[arg0][Static92.anInt2048][Static290.anInt5893];
		Static217.aByteArrayArrayArray7 = new byte[arg0][Static92.anInt2048][Static290.anInt5893];
		Static68.anInt1532 = 99;
		Static56.anIntArray140 = new int[5];
		Static212.anIntArray370 = new int[Static290.anInt5893];
		Static230.aByteArrayArrayArray9 = new byte[arg0][Static92.anInt2048][Static290.anInt5893];
		Static142.aByteArrayArrayArray4 = null;
		Static83.anIntArray174 = new int[Static290.anInt5893];
		Static336.anIntArray529 = new int[Static290.anInt5893];
		Static269.aByteArrayArrayArray10 = new byte[arg0][Static92.anInt2048][Static290.anInt5893];
		Static217.anIntArray375 = new int[Static290.anInt5893];
		Static98.anIntArray525 = new int[Static290.anInt5893];
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[IBII)V")
	public static void method3394(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(12) int local12 = arg3 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg0 < local15) {
			@Pc(19) int local19 = arg0 + 1;
			arg1[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg2;
			arg0 = local49 + 1;
			arg1[arg0] = arg2;
		}
		while (local12 > arg0) {
			arg0++;
			arg1[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!am;)V")
	public static void method3395(@OriginalArg(1) Class11 arg0) {
		Static102.aClass11_47 = arg0;
		Static143.anInt3194 = Static102.aClass11_47.method292(16);
	}
}
