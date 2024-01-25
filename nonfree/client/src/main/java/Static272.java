import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
	public static int anInt5008;

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "[I")
	public static final int[] anIntArray286 = new int[3];

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIZIII)V")
	public static void method4241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static184.anInt3595 = arg1;
		Static267.anInt4950 = arg3;
		Static274.anInt5033 = arg5;
		Static680.anInt10895 = arg4;
		Static228.anInt4189 = arg0;
		if (arg2 && Static228.anInt4189 >= 100) {
			Static407.anInt7215 = Static680.anInt10895 * 512 + 256;
			Static332.anInt6132 = Static184.anInt3595 * 512 + 256;
			Static200.anInt3808 = Static441.method6444(Static481.anInt8082, Static332.anInt6132, Static407.anInt7215) - Static274.anInt5033;
		}
		Static493.anInt8261 = -1;
		Static513.anInt8562 = -1;
		Static660.anInt10605 = 2;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)V")
	public static void method4242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class28_Sub1_Sub3 local13 = local7.aClass28_Sub1_Sub3_2;
		@Pc(16) Class28_Sub1_Sub3 local16 = local7.aClass28_Sub1_Sub3_1;
		if (local13 != null) {
			local13.aShort118 = (short) (local13.aShort118 * arg3 / (0x10 << Static588.anInt9672 - 7));
			local13.aShort119 = (short) (local13.aShort119 * arg3 / (0x10 << Static588.anInt9672 - 7));
		}
		if (local16 != null) {
			local16.aShort118 = (short) (local16.aShort118 * arg3 / (0x10 << Static588.anInt9672 - 7));
			local16.aShort119 = (short) (local16.aShort119 * arg3 / (0x10 << Static588.anInt9672 - 7));
		}
	}
}
