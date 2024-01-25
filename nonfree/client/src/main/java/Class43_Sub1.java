import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "[I")
	private final int[] anIntArray191 = new int[512];

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V")
	public Class43_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray191[local13] = this.anIntArray191[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray191[local38];
			this.anIntArray191[local38] = this.anIntArray191[local38 + 256] = this.anIntArray191[local32];
			this.anIntArray191[local32] = this.anIntArray191[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IFIIFFIIF[FI)V")
	@Override
	public void method3086(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float[] arg6) {
		@Pc(13) int local13 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg1 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg1 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(70) float local70 = Static400.method5874(local59);
		@Pc(74) int local74 = local49 & local41;
		@Pc(78) int local78 = local53 & local41;
		@Pc(83) int local83 = this.anIntArray191[local74];
		@Pc(88) int local88 = this.anIntArray191[local78];
		for (@Pc(90) int local90 = 0; local90 < 128; local90++) {
			@Pc(97) float local97 = arg4 * (float) local90;
			@Pc(100) int local100 = (int) local97;
			@Pc(104) int local104 = local100 + 1;
			@Pc(109) float local109 = local97 - (float) local100;
			@Pc(113) float local113 = 1.0F - local109;
			@Pc(117) float local117 = Static400.method5874(local109);
			@Pc(121) int local121 = local100 & local29;
			@Pc(125) int local125 = local104 & local29;
			@Pc(132) int local132 = this.anIntArray191[local83 + local121];
			@Pc(140) int local140 = this.anIntArray191[local125 + local83];
			@Pc(148) int local148 = this.anIntArray191[local121 + local88];
			@Pc(155) int local155 = this.anIntArray191[local88 + local125];
			for (@Pc(157) int local157 = 0; local157 < 128; local157++) {
				@Pc(164) float local164 = (float) local157 * arg5;
				@Pc(167) int local167 = (int) local164;
				@Pc(171) int local171 = local167 + 1;
				@Pc(176) float local176 = local164 - (float) local167;
				@Pc(181) float local181 = 1.0F - local176;
				@Pc(185) int local185 = local171 & local17;
				@Pc(189) int local189 = local167 & local17;
				@Pc(193) float local193 = Static400.method5874(local176);
				arg6[arg0++] = arg3 * Static368.method5406(Static368.method5406(Static368.method5406(Static453.method6715(this.anIntArray191[local185 + local155] & 0x7, local109, local176, local59), local193, Static453.method6715(this.anIntArray191[local189 + local155] & 0x7, local109, local181, local59)), local117, Static368.method5406(Static453.method6715(this.anIntArray191[local148 + local185] & 0x7, local113, local176, local59), local193, Static453.method6715(this.anIntArray191[local189 + local148] & 0x7, local113, local181, local59))), local70, Static368.method5406(Static368.method5406(Static453.method6715(this.anIntArray191[local185 + local140] & 0x7, local109, local176, local64), local193, Static453.method6715(this.anIntArray191[local140 + local189] & 0x7, local109, local181, local64)), local117, Static368.method5406(Static453.method6715(this.anIntArray191[local185 + local132] & 0x7, local113, local176, local64), local193, Static453.method6715(this.anIntArray191[local189 + local132] & 0x7, local113, local181, local64))));
			}
		}
	}
}
