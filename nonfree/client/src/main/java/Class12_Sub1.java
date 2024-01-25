import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "[I")
	private final int[] anIntArray351 = new int[512];

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(I)V")
	public Class12_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray351[local13] = this.anIntArray351[local13 + 256] = local13;
		}
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray351[local40];
			this.anIntArray351[local40] = this.anIntArray351[local40 + 256] = this.anIntArray351[local34];
			this.anIntArray351[local34] = this.anIntArray351[local34 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IFIIIBF[FFFI)V")
	@Override
	public void method2663(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg5 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg0 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg0 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(70) float local70 = 1.0F - local59;
		@Pc(74) float local74 = Static321.method4560(local59);
		@Pc(78) int local78 = local53 & local41;
		@Pc(82) int local82 = local49 & local41;
		@Pc(87) int local87 = this.anIntArray351[local82];
		@Pc(92) int local92 = this.anIntArray351[local78];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = (float) local94 * arg5;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(118) float local118 = 1.0F - local113;
			@Pc(122) float local122 = Static321.method4560(local113);
			@Pc(126) int local126 = local104 & local29;
			@Pc(130) int local130 = local108 & local29;
			@Pc(137) int local137 = this.anIntArray351[local87 + local126];
			@Pc(144) int local144 = this.anIntArray351[local130 + local87];
			@Pc(151) int local151 = this.anIntArray351[local126 + local92];
			@Pc(158) int local158 = this.anIntArray351[local92 + local130];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = arg3 * (float) local160;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(180) float local180 = (float) -local170 + local167;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local174 & local17;
				@Pc(193) int local193 = local170 & local17;
				@Pc(197) float local197 = Static321.method4560(local180);
				arg4[arg1++] = Static140.method2264(local74, Static140.method2264(local122, Static140.method2264(local197, Static300.method4352(local118, this.anIntArray351[local193 + local137] & 0x7, local70, local185), Static300.method4352(local118, this.anIntArray351[local189 + local137] & 0x7, local70, local180)), Static140.method2264(local197, Static300.method4352(local113, this.anIntArray351[local193 + local144] & 0x7, local70, local185), Static300.method4352(local113, this.anIntArray351[local189 + local144] & 0x7, local70, local180))), Static140.method2264(local122, Static140.method2264(local197, Static300.method4352(local118, this.anIntArray351[local151 + local193] & 0x7, local59, local185), Static300.method4352(local118, this.anIntArray351[local151 + local189] & 0x7, local59, local180)), Static140.method2264(local197, Static300.method4352(local113, this.anIntArray351[local158 + local193] & 0x7, local59, local185), Static300.method4352(local113, this.anIntArray351[local158 + local189] & 0x7, local59, local180)))) * arg6;
			}
		}
	}
}
