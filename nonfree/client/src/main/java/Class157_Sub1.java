import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class157_Sub1 extends Class157 {

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
	private final int[] anIntArray279 = new int[512];

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
	public Class157_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray279[local15] = this.anIntArray279[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray279[local42];
			this.anIntArray279[local42] = this.anIntArray279[local42 + 256] = this.anIntArray279[local35];
			this.anIntArray279[local35] = this.anIntArray279[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[FFIFIFIIFI)V")
	@Override
	public void method3469(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg5 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg5 * (float) arg4;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) int local67 = local49 & local41;
		@Pc(71) float local71 = Static358.method5378(local58);
		@Pc(75) int local75 = local53 & local41;
		@Pc(86) int local86 = this.anIntArray279[local67];
		@Pc(91) int local91 = this.anIntArray279[local75];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = (float) local93 * arg1;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(113) float local113 = (float) -local103 + local100;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) int local121 = local103 & local29;
			@Pc(125) float local125 = Static358.method5378(local113);
			@Pc(129) int local129 = local107 & local29;
			@Pc(137) int local137 = this.anIntArray279[local121 + local86];
			@Pc(144) int local144 = this.anIntArray279[local129 + local86];
			@Pc(151) int local151 = this.anIntArray279[local91 + local121];
			@Pc(158) int local158 = this.anIntArray279[local91 + local129];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = (float) local160 * arg3;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(180) float local180 = (float) -local170 + local167;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local170 & local17;
				@Pc(193) int local193 = local174 & local17;
				@Pc(197) float local197 = Static358.method5378(local180);
				arg0[arg2++] = arg6 * Static22.method744(local71, Static22.method744(local125, Static22.method744(local197, Static317.method4994(this.anIntArray279[local193 + local158] & 0x7, local113, local180, local58), Static317.method4994(this.anIntArray279[local158 + local189] & 0x7, local113, local185, local58)), Static22.method744(local197, Static317.method4994(this.anIntArray279[local151 + local193] & 0x7, local117, local180, local58), Static317.method4994(this.anIntArray279[local189 + local151] & 0x7, local117, local185, local58))), Static22.method744(local125, Static22.method744(local197, Static317.method4994(this.anIntArray279[local193 + local144] & 0x7, local113, local180, local63), Static317.method4994(this.anIntArray279[local189 + local144] & 0x7, local113, local185, local63)), Static22.method744(local197, Static317.method4994(this.anIntArray279[local193 + local137] & 0x7, local117, local180, local63), Static317.method4994(this.anIntArray279[local189 + local137] & 0x7, local117, local185, local63))));
			}
		}
	}
}
