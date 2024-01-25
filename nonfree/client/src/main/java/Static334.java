import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Lclient!ic;")
	public static Class113 aClass113_103;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_198 = new Class214(78, -1);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
	public static int anInt5485 = -1;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIILclient!ub;)V")
	public static void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub5 arg4) {
		@Pc(4) Class82 local4 = Static15.method238(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt3628 = (arg1 << Static384.anInt6381) + Static188.anInt3025;
		arg4.anInt3619 = arg3;
		arg4.anInt3626 = (arg2 << Static384.anInt6381) + Static188.anInt3025;
		for (@Pc(28) Class146 local28 = local4.aClass146_1; local28 != null; local28 = local28.aClass146_3) {
			if (local28.aClass20_Sub3_1.aBoolean543) {
				@Pc(38) int local38 = local28.aClass20_Sub3_1.method5097();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt3619 += local8;
			arg4.aBoolean286 = true;
		}
		local4.aClass20_Sub5_1 = arg4;
	}
}
