import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class189_Sub1 extends Class189 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private final int[] anIntArray565 = new int[512];

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class189_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray565[local15] = this.anIntArray565[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray565[local44];
			this.anIntArray565[local44] = this.anIntArray565[local44 + 256] = this.anIntArray565[local37];
			this.anIntArray565[local37] = this.anIntArray565[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(FIIFIIBFIF[F)V")
	@Override
	public void method4655(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg3 * arg5;
		@Pc(55) int local55 = (int) local46;
		@Pc(59) int local59 = local55 + 1;
		@Pc(65) float local65 = (float) -local55 + local46;
		@Pc(70) float local70 = 1.0F - local65;
		@Pc(74) int local74 = local55 & local41;
		@Pc(78) float local78 = Static97.method1066(local65);
		@Pc(82) int local82 = local59 & local41;
		@Pc(87) int local87 = this.anIntArray565[local74];
		@Pc(92) int local92 = this.anIntArray565[local82];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = arg0 * (float) local94;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) float local121 = Static97.method1066(local113);
			@Pc(125) int local125 = local108 & local29;
			@Pc(129) int local129 = local104 & local29;
			@Pc(136) int local136 = this.anIntArray565[local129 + local87];
			@Pc(143) int local143 = this.anIntArray565[local87 + local125];
			@Pc(150) int local150 = this.anIntArray565[local92 + local129];
			@Pc(158) int local158 = this.anIntArray565[local125 + local92];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = arg1 * (float) local160;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(180) float local180 = (float) -local170 + local167;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local174 & local17;
				@Pc(193) int local193 = local170 & local17;
				@Pc(197) float local197 = Static97.method1066(local180);
				arg6[arg2++] = arg4 * Static56.method989(Static56.method989(Static56.method989(Static98.method1770(local70, this.anIntArray565[local193 + local136] & 0x7, local185, local117), Static98.method1770(local70, this.anIntArray565[local136 + local189] & 0x7, local180, local117), local197), Static56.method989(Static98.method1770(local70, this.anIntArray565[local193 + local143] & 0x7, local185, local113), Static98.method1770(local70, this.anIntArray565[local143 + local189] & 0x7, local180, local113), local197), local121), Static56.method989(Static56.method989(Static98.method1770(local65, this.anIntArray565[local150 + local193] & 0x7, local185, local117), Static98.method1770(local65, this.anIntArray565[local189 + local150] & 0x7, local180, local117), local197), Static56.method989(Static98.method1770(local65, this.anIntArray565[local193 + local158] & 0x7, local185, local113), Static98.method1770(local65, this.anIntArray565[local189 + local158] & 0x7, local180, local113), local197), local121), local78);
			}
		}
	}
}
