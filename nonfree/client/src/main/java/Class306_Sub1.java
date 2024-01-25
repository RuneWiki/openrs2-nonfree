import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class306_Sub1 extends Class306 {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
	private final int[] anIntArray642 = new int[512];

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
	public Class306_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray642[local15] = this.anIntArray642[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray642[local44];
			this.anIntArray642[local44] = this.anIntArray642[local44 + 256] = this.anIntArray642[local37];
			this.anIntArray642[local37] = this.anIntArray642[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IFIIFBFFI[FI)V")
	@Override
	public void method7218(@OriginalArg(1) float arg0, @OriginalArg(4) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(21) int local21 = local13 & 0xFF;
		@Pc(29) int local29 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(33) int local33 = local29 & 0xFF;
		@Pc(41) int local41 = (int) (arg1 * (float) 16 - 1.0F);
		@Pc(45) int local45 = local41 & 0xFF;
		@Pc(50) float local50 = arg1 * (float) arg6;
		@Pc(53) int local53 = (int) local50;
		@Pc(57) int local57 = local53 + 1;
		@Pc(62) float local62 = local50 - (float) local53;
		@Pc(67) float local67 = 1.0F - local62;
		@Pc(71) float local71 = Static211.method2364(local62);
		@Pc(75) int local75 = local57 & local45;
		@Pc(79) int local79 = local53 & local45;
		@Pc(84) int local84 = this.anIntArray642[local79];
		@Pc(89) int local89 = this.anIntArray642[local75];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg0 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(110) float local110 = local98 - (float) local101;
			@Pc(115) float local115 = 1.0F - local110;
			@Pc(121) float local121 = Static211.method2364(local110);
			@Pc(125) int local125 = local105 & local33;
			@Pc(129) int local129 = local101 & local33;
			@Pc(136) int local136 = this.anIntArray642[local129 + local84];
			@Pc(143) int local143 = this.anIntArray642[local84 + local125];
			@Pc(150) int local150 = this.anIntArray642[local89 + local129];
			@Pc(158) int local158 = this.anIntArray642[local125 + local89];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = (float) local160 * arg3;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(180) float local180 = (float) -local170 + local167;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) float local189 = Static211.method2364(local180);
				@Pc(193) int local193 = local174 & local21;
				@Pc(197) int local197 = local170 & local21;
				arg5[arg4++] = Static432.method6150(Static432.method6150(Static432.method6150(Static145.method2353(local110, local180, this.anIntArray642[local158 + local193] & 0x7, local62), local189, Static145.method2353(local110, local185, this.anIntArray642[local158 + local197] & 0x7, local62)), local121, Static432.method6150(Static145.method2353(local115, local180, this.anIntArray642[local193 + local150] & 0x7, local62), local189, Static145.method2353(local115, local185, this.anIntArray642[local150 + local197] & 0x7, local62))), local71, Static432.method6150(Static432.method6150(Static145.method2353(local110, local180, this.anIntArray642[local193 + local143] & 0x7, local67), local189, Static145.method2353(local110, local185, this.anIntArray642[local197 + local143] & 0x7, local67)), local121, Static432.method6150(Static145.method2353(local115, local180, this.anIntArray642[local193 + local136] & 0x7, local67), local189, Static145.method2353(local115, local185, this.anIntArray642[local197 + local136] & 0x7, local67)))) * arg2;
			}
		}
	}
}
