import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "[I")
	public static final int[] anIntArray56 = new int[14];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method913() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static342.aBooleanArray17[local12] = false;
		}
		Static222.anInt4125 = 0;
		Static140.anInt2836 = -1;
		Static381.anInt6417 = 0;
		Static111.anInt2386 = 1;
		Static137.anInt2797 = -1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg1, 4);
		local8.method2604();
		local8.anInt3083 = arg0;
		local8.anInt3079 = arg3;
		local8.anInt3082 = arg2;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Lclient!ii;")
	public static Class16_Sub2 method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub2_2;
	}
}
