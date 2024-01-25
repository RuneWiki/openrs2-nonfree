import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class238_Sub1 extends Class238 {

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
	private final int[] anIntArray599 = new int[512];

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class238_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray599[local15] = this.anIntArray599[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray599[local42];
			this.anIntArray599[local42] = this.anIntArray599[local42 + 256] = this.anIntArray599[local35];
			this.anIntArray599[local35] = this.anIntArray599[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(FFIIIFFII[FI)V")
	@Override
	public void method5286(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg1 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(62) float local62 = arg1 * (float) arg6;
		@Pc(65) int local65 = (int) local62;
		@Pc(69) int local69 = local65 + 1;
		@Pc(75) float local75 = (float) -local65 + local62;
		@Pc(79) float local79 = 1.0F - local75;
		@Pc(83) int local83 = local65 & local41;
		@Pc(87) int local87 = local69 & local41;
		@Pc(91) float local91 = Static70.method5681(local75);
		@Pc(96) int local96 = this.anIntArray599[local83];
		@Pc(101) int local101 = this.anIntArray599[local87];
		for (@Pc(103) int local103 = 0; local103 < 128; local103++) {
			@Pc(110) float local110 = arg0 * (float) local103;
			@Pc(113) int local113 = (int) local110;
			@Pc(117) int local117 = local113 + 1;
			@Pc(122) float local122 = local110 - (float) local113;
			@Pc(126) float local126 = 1.0F - local122;
			@Pc(130) int local130 = local113 & local29;
			@Pc(134) float local134 = Static70.method5681(local122);
			@Pc(138) int local138 = local117 & local29;
			@Pc(145) int local145 = this.anIntArray599[local96 + local130];
			@Pc(153) int local153 = this.anIntArray599[local138 + local96];
			@Pc(161) int local161 = this.anIntArray599[local130 + local101];
			@Pc(168) int local168 = this.anIntArray599[local138 + local101];
			for (@Pc(170) int local170 = 0; local170 < 128; local170++) {
				@Pc(177) float local177 = (float) local170 * arg2;
				@Pc(180) int local180 = (int) local177;
				@Pc(184) int local184 = local180 + 1;
				@Pc(190) float local190 = (float) -local180 + local177;
				@Pc(194) float local194 = 1.0F - local190;
				@Pc(198) int local198 = local180 & local17;
				@Pc(202) int local202 = local184 & local17;
				@Pc(206) float local206 = Static70.method5681(local190);
				arg5[arg4++] = Static209.method2983(local91, Static209.method2983(local134, Static209.method2983(local206, Static1.method28(local122, this.anIntArray599[local202 + local168] & 0x7, local75, local190), Static1.method28(local122, this.anIntArray599[local168 + local198] & 0x7, local75, local194)), Static209.method2983(local206, Static1.method28(local126, this.anIntArray599[local202 + local161] & 0x7, local75, local190), Static1.method28(local126, this.anIntArray599[local198 + local161] & 0x7, local75, local194))), Static209.method2983(local134, Static209.method2983(local206, Static1.method28(local122, this.anIntArray599[local153 + local202] & 0x7, local79, local190), Static1.method28(local122, this.anIntArray599[local198 + local153] & 0x7, local79, local194)), Static209.method2983(local206, Static1.method28(local126, this.anIntArray599[local202 + local145] & 0x7, local79, local190), Static1.method28(local126, this.anIntArray599[local198 + local145] & 0x7, local79, local194)))) * arg3;
			}
		}
	}
}
