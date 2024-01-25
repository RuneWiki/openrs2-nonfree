import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
	private final int[] anIntArray150 = new int[512];

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
	public Class80_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray150[local15] = this.anIntArray150[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray150[local44];
			this.anIntArray150[local44] = this.anIntArray150[local44 + 256] = this.anIntArray150[local37];
			this.anIntArray150[local37] = this.anIntArray150[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(FIFIFIIB[FIF)V")
	@Override
	public void method1832(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) float[] arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg0 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg0 * (float) arg3;
		@Pc(57) int local57 = (int) local46;
		@Pc(61) int local61 = local57 + 1;
		@Pc(67) float local67 = (float) -local57 + local46;
		@Pc(72) float local72 = 1.0F - local67;
		@Pc(76) int local76 = local57 & local41;
		@Pc(80) float local80 = Static617.method8424(local67);
		@Pc(84) int local84 = local61 & local41;
		@Pc(89) int local89 = this.anIntArray150[local76];
		@Pc(94) int local94 = this.anIntArray150[local84];
		for (@Pc(96) int local96 = 0; local96 < 128; local96++) {
			@Pc(103) float local103 = arg1 * (float) local96;
			@Pc(106) int local106 = (int) local103;
			@Pc(110) int local110 = local106 + 1;
			@Pc(116) float local116 = (float) -local106 + local103;
			@Pc(121) float local121 = 1.0F - local116;
			@Pc(125) int local125 = local106 & local29;
			@Pc(129) int local129 = local110 & local29;
			@Pc(133) float local133 = Static617.method8424(local116);
			@Pc(140) int local140 = this.anIntArray150[local89 + local125];
			@Pc(148) int local148 = this.anIntArray150[local129 + local89];
			@Pc(155) int local155 = this.anIntArray150[local94 + local125];
			@Pc(163) int local163 = this.anIntArray150[local129 + local94];
			for (@Pc(165) int local165 = 0; local165 < 128; local165++) {
				@Pc(172) float local172 = (float) local165 * arg6;
				@Pc(175) int local175 = (int) local172;
				@Pc(179) int local179 = local175 + 1;
				@Pc(185) float local185 = (float) -local175 + local172;
				@Pc(190) float local190 = 1.0F - local185;
				@Pc(194) int local194 = local175 & local17;
				@Pc(198) int local198 = local179 & local17;
				@Pc(202) float local202 = Static617.method8424(local185);
				arg5[arg4++] = Static112.method1843(Static112.method1843(Static112.method1843(Static85.method1431(local67, local185, local116, this.anIntArray150[local198 + local163] & 0x7), Static85.method1431(local67, local190, local116, this.anIntArray150[local194 + local163] & 0x7), local202), Static112.method1843(Static85.method1431(local67, local185, local121, this.anIntArray150[local155 + local198] & 0x7), Static85.method1431(local67, local190, local121, this.anIntArray150[local155 + local194] & 0x7), local202), local133), Static112.method1843(Static112.method1843(Static85.method1431(local72, local185, local116, this.anIntArray150[local198 + local148] & 0x7), Static85.method1431(local72, local190, local116, this.anIntArray150[local148 + local194] & 0x7), local202), Static112.method1843(Static85.method1431(local72, local185, local121, this.anIntArray150[local198 + local140] & 0x7), Static85.method1431(local72, local190, local121, this.anIntArray150[local194 + local140] & 0x7), local202), local133), local80) * arg2;
			}
		}
	}
}
