import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_14 = new Class158(11, 0, 1, 2);

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public static int anInt9435 = 0;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "S")
	public static short aShort123 = 256;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	public static void method8224(@OriginalArg(1) int arg0) {
		if (Static162.anInt3401 == arg0) {
			return;
		}
		Static29.anInt380 = Static327.anInt5650 = Static18.anIntArray15[arg0];
		Static191.method3634();
		Static20.anIntArrayArray2 = new int[Static29.anInt380][Static327.anInt5650];
		Static511.anIntArrayArray43 = new int[Static29.anInt380][Static327.anInt5650];
		Static146.anIntArrayArrayArray8 = new int[4][Static29.anInt380 >> 3][Static327.anInt5650 >> 3];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static669.aClass356Array1[local42] = Static689.method9047(Static327.anInt5650, Static29.anInt380);
		}
		Static333.aByteArrayArrayArray15 = new byte[4][Static29.anInt380][Static327.anInt5650];
		Static546.method7746(Static29.anInt380, Static327.anInt5650);
		Static357.method5435(Static327.anInt5650 >> 3, Static202.aClass75_5, Static29.anInt380 >> 3);
		Static162.anInt3401 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Lclient!gb;")
	public static Class60_Sub1_Sub3 method8225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass60_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
	public static void method8227(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub2_Sub4 local17 = Static602.method8315((long) arg0, 6);
		local17.method2038();
	}
}
