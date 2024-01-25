import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	public static int anInt3267 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIILclient!dba;Lclient!pa;IIIIII)V")
	public static void method2935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(5) Class249 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		Static414.anInt7056 = arg9;
		Static378.aClass249_18 = arg5;
		Static490.anInt7996 = arg1;
		Static70.aClass279_2 = null;
		Static282.anInt4862 = arg0;
		Static350.anInt6082 = arg8;
		Static448.aClass63_20 = arg4;
		Static101.anInt2073 = arg7;
		Static3.aClass279_4 = null;
		Static586.anInt2134 = arg6;
		Static318.anInt5430 = arg3;
		Static453.aClass279_5 = null;
		Static579.anInt9367 = arg2;
		Static519.anInt8368 = arg10;
		Static420.method5989();
		Static564.aBoolean719 = true;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)J")
	public static synchronized long method2936() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static94.aLong49 > local5) {
			Static532.aLong251 += Static94.aLong49 - local5;
		}
		Static94.aLong49 = local5;
		return local5 + Static532.aLong251;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IFIFF)F")
	public static float method2937(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static282.aFloatArrayArray7[arg1];
		return local7[1] * arg0 + local7[0] * arg3 + arg2 * local7[2];
	}
}
