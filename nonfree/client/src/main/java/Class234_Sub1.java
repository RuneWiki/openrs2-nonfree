import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class234_Sub1 extends Class234 {

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "[I")
	private final int[] anIntArray422 = new int[512];

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(I)V")
	public Class234_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray422[local15] = this.anIntArray422[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray422[local42];
			this.anIntArray422[local42] = this.anIntArray422[local42 + 256] = this.anIntArray422[local35];
			this.anIntArray422[local35] = this.anIntArray422[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IFIIF[FIIIFF)V")
	@Override
	public void method6103(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg2 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg5 * (float) arg0;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) int local66 = local49 & local41;
		@Pc(70) int local70 = local53 & local41;
		@Pc(74) float local74 = Static22.method977(local58);
		@Pc(79) int local79 = this.anIntArray422[local66];
		@Pc(84) int local84 = this.anIntArray422[local70];
		for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
			@Pc(93) float local93 = arg1 * (float) local86;
			@Pc(96) int local96 = (int) local93;
			@Pc(100) int local100 = local96 + 1;
			@Pc(106) float local106 = (float) -local96 + local93;
			@Pc(111) float local111 = 1.0F - local106;
			@Pc(115) int local115 = local100 & local29;
			@Pc(119) int local119 = local96 & local29;
			@Pc(123) float local123 = Static22.method977(local106);
			@Pc(130) int local130 = this.anIntArray422[local79 + local119];
			@Pc(138) int local138 = this.anIntArray422[local115 + local79];
			@Pc(145) int local145 = this.anIntArray422[local84 + local119];
			@Pc(152) int local152 = this.anIntArray422[local115 + local84];
			for (@Pc(154) int local154 = 0; local154 < 128; local154++) {
				@Pc(161) float local161 = arg2 * (float) local154;
				@Pc(164) int local164 = (int) local161;
				@Pc(168) int local168 = local164 + 1;
				@Pc(174) float local174 = (float) -local164 + local161;
				@Pc(179) float local179 = 1.0F - local174;
				@Pc(183) int local183 = local164 & local17;
				@Pc(187) float local187 = Static22.method977(local174);
				@Pc(191) int local191 = local168 & local17;
				arg3[arg4++] = Static607.method8698(local74, Static607.method8698(local123, Static607.method8698(local187, Static580.method8229(local106, this.anIntArray422[local191 + local152] & 0x7, local58, local174), Static580.method8229(local106, this.anIntArray422[local152 + local183] & 0x7, local58, local179)), Static607.method8698(local187, Static580.method8229(local111, this.anIntArray422[local191 + local145] & 0x7, local58, local174), Static580.method8229(local111, this.anIntArray422[local145 + local183] & 0x7, local58, local179))), Static607.method8698(local123, Static607.method8698(local187, Static580.method8229(local106, this.anIntArray422[local191 + local138] & 0x7, local62, local174), Static580.method8229(local106, this.anIntArray422[local183 + local138] & 0x7, local62, local179)), Static607.method8698(local187, Static580.method8229(local111, this.anIntArray422[local130 + local191] & 0x7, local62, local174), Static580.method8229(local111, this.anIntArray422[local183 + local130] & 0x7, local62, local179)))) * arg6;
			}
		}
	}
}
