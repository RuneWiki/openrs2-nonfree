import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class148_Sub1 extends Class148 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
	private final int[] anIntArray611 = new int[512];

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V")
	public Class148_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray611[local15] = this.anIntArray611[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray611[local44];
			this.anIntArray611[local44] = this.anIntArray611[local44 + 256] = this.anIntArray611[local37];
			this.anIntArray611[local37] = this.anIntArray611[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(FIFIFIZ[FIIF)V")
	@Override
	public void method6720(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(7) float[] arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg1 * arg3;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) int local67 = local49 & local41;
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) float local75 = Static102.method7204(local58);
		@Pc(80) int local80 = this.anIntArray611[local67];
		@Pc(85) int local85 = this.anIntArray611[local71];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(94) float local94 = (float) local87 * arg0;
			@Pc(97) int local97 = (int) local94;
			@Pc(101) int local101 = local97 + 1;
			@Pc(106) float local106 = local94 - (float) local97;
			@Pc(110) float local110 = 1.0F - local106;
			@Pc(114) int local114 = local101 & local29;
			@Pc(118) float local118 = Static102.method7204(local106);
			@Pc(122) int local122 = local97 & local29;
			@Pc(129) int local129 = this.anIntArray611[local80 + local122];
			@Pc(136) int local136 = this.anIntArray611[local80 + local114];
			@Pc(143) int local143 = this.anIntArray611[local85 + local122];
			@Pc(150) int local150 = this.anIntArray611[local85 + local114];
			for (@Pc(152) int local152 = 0; local152 < 128; local152++) {
				@Pc(159) float local159 = (float) local152 * arg6;
				@Pc(162) int local162 = (int) local159;
				@Pc(166) int local166 = local162 + 1;
				@Pc(171) float local171 = local159 - (float) local162;
				@Pc(176) float local176 = 1.0F - local171;
				@Pc(180) float local180 = Static102.method7204(local171);
				@Pc(184) int local184 = local166 & local17;
				@Pc(188) int local188 = local162 & local17;
				arg5[arg4++] = arg2 * Static9.method376(Static9.method376(Static9.method376(Static303.method4746(this.anIntArray611[local184 + local150] & 0x7, local171, local106, local58), local180, Static303.method4746(this.anIntArray611[local150 + local188] & 0x7, local176, local106, local58)), local118, Static9.method376(Static303.method4746(this.anIntArray611[local143 + local184] & 0x7, local171, local110, local58), local180, Static303.method4746(this.anIntArray611[local143 + local188] & 0x7, local176, local110, local58))), local75, Static9.method376(Static9.method376(Static303.method4746(this.anIntArray611[local184 + local136] & 0x7, local171, local106, local63), local180, Static303.method4746(this.anIntArray611[local188 + local136] & 0x7, local176, local106, local63)), local118, Static9.method376(Static303.method4746(this.anIntArray611[local129 + local184] & 0x7, local171, local110, local63), local180, Static303.method4746(this.anIntArray611[local129 + local188] & 0x7, local176, local110, local63))));
			}
		}
	}
}
