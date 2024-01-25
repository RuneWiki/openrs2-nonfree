import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class230_Sub1 extends Class230 {

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
	private final int[] anIntArray466 = new int[512];

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class230_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray466[local15] = this.anIntArray466[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray466[local44];
			this.anIntArray466[local44] = this.anIntArray466[local44 + 256] = this.anIntArray466[local37];
			this.anIntArray466[local37] = this.anIntArray466[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IFIFI[FIIFFI)V")
	@Override
	public void method4689(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg5 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg2 * (float) arg3;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) int local66 = local49 & local41;
		@Pc(70) int local70 = local53 & local41;
		@Pc(82) float local82 = Static13.method132(local58);
		@Pc(87) int local87 = this.anIntArray466[local66];
		@Pc(92) int local92 = this.anIntArray466[local70];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = arg5 * (float) local94;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) float local121 = Static13.method132(local113);
			@Pc(125) int local125 = local104 & local29;
			@Pc(129) int local129 = local108 & local29;
			@Pc(136) int local136 = this.anIntArray466[local87 + local125];
			@Pc(144) int local144 = this.anIntArray466[local129 + local87];
			@Pc(151) int local151 = this.anIntArray466[local92 + local125];
			@Pc(158) int local158 = this.anIntArray466[local92 + local129];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = arg6 * (float) local160;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(179) float local179 = local167 - (float) local170;
				@Pc(183) float local183 = 1.0F - local179;
				@Pc(187) float local187 = Static13.method132(local179);
				@Pc(191) int local191 = local170 & local17;
				@Pc(195) int local195 = local174 & local17;
				arg4[arg1++] = arg0 * Static42.method634(Static42.method634(Static42.method634(Static155.method2239(local183, local62, this.anIntArray466[local191 + local136] & 0x7, local117), Static155.method2239(local179, local62, this.anIntArray466[local136 + local195] & 0x7, local117), local187), Static42.method634(Static155.method2239(local183, local62, this.anIntArray466[local144 + local191] & 0x7, local113), Static155.method2239(local179, local62, this.anIntArray466[local144 + local195] & 0x7, local113), local187), local121), Static42.method634(Static42.method634(Static155.method2239(local183, local58, this.anIntArray466[local151 + local191] & 0x7, local117), Static155.method2239(local179, local58, this.anIntArray466[local151 + local195] & 0x7, local117), local187), Static42.method634(Static155.method2239(local183, local58, this.anIntArray466[local158 + local191] & 0x7, local113), Static155.method2239(local179, local58, this.anIntArray466[local195 + local158] & 0x7, local113), local187), local121), local82);
			}
		}
	}
}
