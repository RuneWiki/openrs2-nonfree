import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method2683() {
		for (@Pc(3) int local3 = 0; local3 < Static386.anInt6720; local3++) {
			@Pc(9) int local9 = Static662.anIntArray600[local3];
			@Pc(16) Class5_Sub34 local16 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local9);
			if (local16 != null) {
				@Pc(21) Class41_Sub1_Sub1_Sub3_Sub1 local21 = local16.aClass41_Sub1_Sub1_Sub3_Sub1_1;
				Static362.method5339(local21, local21.aClass311_1.anInt8641);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!wq;I)V")
	public static void method2687(@OriginalArg(0) Class394 arg0) {
		if (arg0.anInt10477 != Static264.anInt4217) {
			return;
		}
		if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100 == null) {
			arg0.anInt10528 = 0;
			arg0.anInt10459 = 0;
			return;
		}
		arg0.anInt10493 = 150;
		arg0.anInt10455 = (int) (Math.sin((double) Static421.anInt7434 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt10528 = Static177.anInt2910;
		arg0.anInt10482 = 5;
		arg0.anInt10459 = Static395.method5733(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100);
		arg0.anInt10499 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9484;
		arg0.anInt10535 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9480;
		arg0.anInt10447 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9513;
		arg0.anInt10534 = 0;
		@Pc(77) Class65 local77 = arg0.anInt10499 == -1 ? null : Static459.aClass128_2.method2686(arg0.anInt10499);
		if (local77 != null) {
			Static375.method5527(local77, arg0.anInt10447);
		}
	}
}
