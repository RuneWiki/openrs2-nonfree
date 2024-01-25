import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public final class Class198_Sub1 extends Class198 {

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "[I")
	private final int[] anIntArray430 = new int[512];

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(I)V")
	public Class198_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray430[local15] = this.anIntArray430[local15 + 256] = local15;
		}
		for (@Pc(39) int local39 = 0; local39 < 256; local39++) {
			@Pc(48) int local48 = local13.nextInt() & 0xFF;
			@Pc(53) int local53 = this.anIntArray430[local48];
			this.anIntArray430[local48] = this.anIntArray430[local48 + 256] = this.anIntArray430[local39];
			this.anIntArray430[local39] = this.anIntArray430[local39 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(FFIIII[FFIFI)V")
	@Override
	public void method6185(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) float[] arg4, @OriginalArg(7) float arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg0 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg2 * arg0;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(64) float local64 = (float) -local49 + local46;
		@Pc(69) float local69 = 1.0F - local64;
		@Pc(73) int local73 = local53 & local41;
		@Pc(77) float local77 = Static90.method1403(local64);
		@Pc(81) int local81 = local49 & local41;
		@Pc(86) int local86 = this.anIntArray430[local81];
		@Pc(91) int local91 = this.anIntArray430[local73];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = (float) local93 * arg6;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(113) float local113 = (float) -local103 + local100;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) int local121 = local107 & local29;
			@Pc(125) float local125 = Static90.method1403(local113);
			@Pc(129) int local129 = local103 & local29;
			@Pc(136) int local136 = this.anIntArray430[local129 + local86];
			@Pc(143) int local143 = this.anIntArray430[local86 + local121];
			@Pc(150) int local150 = this.anIntArray430[local91 + local129];
			@Pc(157) int local157 = this.anIntArray430[local121 + local91];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = arg1 * (float) local159;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(178) float local178 = local166 - (float) local169;
				@Pc(183) float local183 = 1.0F - local178;
				@Pc(187) float local187 = Static90.method1403(local178);
				@Pc(191) int local191 = local169 & local17;
				@Pc(195) int local195 = local173 & local17;
				arg4[arg3++] = Static235.method3718(Static235.method3718(Static235.method3718(Static295.method4657(local69, local183, local117, this.anIntArray430[local191 + local136] & 0x7), local187, Static295.method4657(local69, local178, local117, this.anIntArray430[local136 + local195] & 0x7)), local125, Static235.method3718(Static295.method4657(local69, local183, local113, this.anIntArray430[local143 + local191] & 0x7), local187, Static295.method4657(local69, local178, local113, this.anIntArray430[local143 + local195] & 0x7))), local77, Static235.method3718(Static235.method3718(Static295.method4657(local64, local183, local117, this.anIntArray430[local150 + local191] & 0x7), local187, Static295.method4657(local64, local178, local117, this.anIntArray430[local195 + local150] & 0x7)), local125, Static235.method3718(Static295.method4657(local64, local183, local113, this.anIntArray430[local157 + local191] & 0x7), local187, Static295.method4657(local64, local178, local113, this.anIntArray430[local157 + local195] & 0x7)))) * arg5;
			}
		}
	}
}
