import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "[I")
	public static int[] anIntArray239;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "Lclient!ir;")
	public static Class100 aClass100_72;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	public static int anInt3575;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	public static int anInt3574 = 0;

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray5 = new int[2][][];

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "[I")
	public static final int[] anIntArray240 = new int[13];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIJ)V")
	public static void method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg2 >> 20 & 0x3;
		@Pc(26) int local26 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], arg1, local19, true, arg0, local12, 0, 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], 0);
			return;
		}
		@Pc(41) Class170 local41 = Static268.method4553(local26);
		@Pc(54) int local54;
		@Pc(51) int local51;
		if (local19 == 0 || local19 == 2) {
			local51 = local41.anInt5251;
			local54 = local41.anInt5235;
		} else {
			local54 = local41.anInt5251;
			local51 = local41.anInt5235;
		}
		@Pc(65) int local65 = local41.anInt5209;
		if (local19 != 0) {
			local65 = (local65 << local19 & 0xF) + (local65 >> 4 - local19);
		}
		Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], arg1, 0, true, arg0, 0, local54, local65, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local51);
	}
}
