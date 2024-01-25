import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[I")
	private final int[] anIntArray464 = new int[512];

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
	public Class34_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray464[local15] = this.anIntArray464[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(46) int local46 = local13.nextInt() & 0xFF;
			@Pc(51) int local51 = this.anIntArray464[local46];
			this.anIntArray464[local46] = this.anIntArray464[local46 + 256] = this.anIntArray464[local37];
			this.anIntArray464[local37] = this.anIntArray464[local37 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(FIF[FIIFIIFI)V")
	@Override
	public void method7102(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6) {
		@Pc(21) int local21 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(25) int local25 = local21 & 0xFF;
		@Pc(33) int local33 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(37) int local37 = local33 & 0xFF;
		@Pc(45) int local45 = (int) (arg4 * (float) 16 - 1.0F);
		@Pc(49) int local49 = local45 & 0xFF;
		@Pc(54) float local54 = (float) arg3 * arg4;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(66) float local66 = local54 - (float) local57;
		@Pc(70) float local70 = 1.0F - local66;
		@Pc(74) int local74 = local57 & local49;
		@Pc(78) int local78 = local61 & local49;
		@Pc(82) float local82 = Static66.method819(local66);
		@Pc(87) int local87 = this.anIntArray464[local74];
		@Pc(92) int local92 = this.anIntArray464[local78];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = (float) local94 * arg0;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) int local121 = local108 & local37;
			@Pc(125) int local125 = local104 & local37;
			@Pc(129) float local129 = Static66.method819(local113);
			@Pc(136) int local136 = this.anIntArray464[local125 + local87];
			@Pc(143) int local143 = this.anIntArray464[local121 + local87];
			@Pc(150) int local150 = this.anIntArray464[local92 + local125];
			@Pc(157) int local157 = this.anIntArray464[local92 + local121];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg6;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(178) float local178 = local166 - (float) local169;
				@Pc(182) float local182 = 1.0F - local178;
				@Pc(186) float local186 = Static66.method819(local178);
				@Pc(190) int local190 = local173 & local25;
				@Pc(194) int local194 = local169 & local25;
				arg2[arg5++] = arg1 * Static142.method2362(local82, Static142.method2362(local129, Static142.method2362(local186, Static581.method8023(local178, local66, local113, this.anIntArray464[local190 + local157] & 0x7), Static581.method8023(local182, local66, local113, this.anIntArray464[local157 + local194] & 0x7)), Static142.method2362(local186, Static581.method8023(local178, local66, local117, this.anIntArray464[local150 + local190] & 0x7), Static581.method8023(local182, local66, local117, this.anIntArray464[local150 + local194] & 0x7))), Static142.method2362(local129, Static142.method2362(local186, Static581.method8023(local178, local70, local113, this.anIntArray464[local143 + local190] & 0x7), Static581.method8023(local182, local70, local113, this.anIntArray464[local143 + local194] & 0x7)), Static142.method2362(local186, Static581.method8023(local178, local70, local117, this.anIntArray464[local190 + local136] & 0x7), Static581.method8023(local182, local70, local117, this.anIntArray464[local194 + local136] & 0x7))));
			}
		}
	}
}
