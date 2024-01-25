import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "[Lclient!ql;")
	public static Class237[] aClass237Array1;

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
	public static int anInt5364;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
	public static int anInt5365;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "F")
	public static float aFloat102 = 0.0F;

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_45 = new Class231(32);

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZFIIIII)[[I")
	public static int[][] method4610(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub7_Sub38 local13 = new Class2_Sub7_Sub38();
		local13.anInt9047 = (int) (arg0 * 4096.0F);
		local13.anInt9046 = 8;
		local13.aBoolean648 = false;
		local13.anInt9053 = 3;
		local13.anInt9059 = 4;
		local13.method7583();
		Static433.method5293(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method7570(local9[local45], local45);
		}
		return local9;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)I")
	public static int method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(32) int local32 = local17 * (arg2 & 0x7F) + (arg1 & 0x7F) * arg0 >> 7;
		@Pc(46) int local46 = local17 * (arg2 & 0x380) + arg0 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = arg0 * (arg1 & 0xFC00) + local17 * (arg2 & 0xFC00) >> 7;
		return local32 & 0x7F | local60 & 0xFC00 | local46 & 0x380;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)Z")
	public static boolean method4612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	public static void method4614(@OriginalArg(0) int arg0) {
		if (arg0 == Static257.anInt4643) {
			return;
		}
		Static363.anInt1158 = Static511.anInt8889 = Static501.anIntArray671[arg0];
		Static8.method372();
		Static535.anIntArrayArrayArray21 = new int[4][Static363.anInt1158 >> 3][Static511.anInt8889 >> 3];
		Static97.anIntArrayArray23 = new int[Static363.anInt1158][Static511.anInt8889];
		Static200.anIntArrayArray44 = new int[Static363.anInt1158][Static511.anInt8889];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static207.aClass99Array1[local36] = Static207.method3298(Static511.anInt8889, Static363.anInt1158);
		}
		Static139.aByteArrayArrayArray8 = new byte[4][Static363.anInt1158][Static511.anInt8889];
		Static449.method6866(Static511.anInt8889, Static363.anInt1158);
		Static132.method2414(Static511.anInt8889 >> 3, Static363.anInt1158 >> 3, Static103.aClass39_3);
		Static257.anInt4643 = arg0;
	}
}
