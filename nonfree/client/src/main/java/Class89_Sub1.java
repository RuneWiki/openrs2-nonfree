import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	private final int[] anIntArray281 = new int[512];

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class89_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray281[local13] = this.anIntArray281[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray281[local38];
			this.anIntArray281[local38] = this.anIntArray281[local38 + 256] = this.anIntArray281[local32];
			this.anIntArray281[local32] = this.anIntArray281[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(FIFF[FIIIFII)V")
	@Override
	public void method3434(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(8) float arg6) {
		@Pc(13) int local13 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(30) int local30 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(34) int local34 = local30 & 0xFF;
		@Pc(42) int local42 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(46) int local46 = local42 & 0xFF;
		@Pc(51) float local51 = (float) arg1 * arg2;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(63) float local63 = local51 - (float) local54;
		@Pc(68) float local68 = 1.0F - local63;
		@Pc(72) int local72 = local54 & local46;
		@Pc(78) float local78 = Static46.method854(local63);
		@Pc(82) int local82 = local58 & local46;
		@Pc(87) int local87 = this.anIntArray281[local72];
		@Pc(92) int local92 = this.anIntArray281[local82];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = arg6 * (float) local94;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(114) float local114 = (float) -local104 + local101;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(122) int local122 = local104 & local34;
			@Pc(126) int local126 = local108 & local34;
			@Pc(130) float local130 = Static46.method854(local114);
			@Pc(137) int local137 = this.anIntArray281[local87 + local122];
			@Pc(144) int local144 = this.anIntArray281[local87 + local126];
			@Pc(152) int local152 = this.anIntArray281[local122 + local92];
			@Pc(159) int local159 = this.anIntArray281[local92 + local126];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = arg3 * (float) local161;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(181) float local181 = (float) -local171 + local168;
				@Pc(185) float local185 = 1.0F - local181;
				@Pc(189) int local189 = local175 & local17;
				@Pc(195) float local195 = Static46.method854(local181);
				@Pc(199) int local199 = local171 & local17;
				arg4[arg5++] = Static308.method4295(Static308.method4295(Static308.method4295(Static229.method3435(this.anIntArray281[local189 + local159] & 0x7, local114, local63, local181), Static229.method3435(this.anIntArray281[local199 + local159] & 0x7, local114, local63, local185), local195), Static308.method4295(Static229.method3435(this.anIntArray281[local152 + local189] & 0x7, local118, local63, local181), Static229.method3435(this.anIntArray281[local199 + local152] & 0x7, local118, local63, local185), local195), local130), Static308.method4295(Static308.method4295(Static229.method3435(this.anIntArray281[local144 + local189] & 0x7, local114, local68, local181), Static229.method3435(this.anIntArray281[local144 + local199] & 0x7, local114, local68, local185), local195), Static308.method4295(Static229.method3435(this.anIntArray281[local189 + local137] & 0x7, local118, local68, local181), Static229.method3435(this.anIntArray281[local137 + local199] & 0x7, local118, local68, local185), local195), local130), local78) * arg0;
			}
		}
	}
}
