import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class295_Sub1 extends Class295 {

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "[I")
	private final int[] anIntArray429 = new int[512];

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(I)V")
	public Class295_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray429[local13] = this.anIntArray429[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray429[local38];
			this.anIntArray429[local38] = this.anIntArray429[local38 + 256] = this.anIntArray429[local32];
			this.anIntArray429[local32] = this.anIntArray429[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IFFIFII[FFII)V")
	@Override
	public void method7349(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float[] arg5, @OriginalArg(8) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(33) int local33 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(37) int local37 = local33 & 0xFF;
		@Pc(45) int local45 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(49) int local49 = local45 & 0xFF;
		@Pc(54) float local54 = (float) arg3 * arg2;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(67) float local67 = (float) -local57 + local54;
		@Pc(71) float local71 = 1.0F - local67;
		@Pc(75) int local75 = local61 & local49;
		@Pc(79) float local79 = Static646.method9074(local67);
		@Pc(83) int local83 = local57 & local49;
		@Pc(88) int local88 = this.anIntArray429[local83];
		@Pc(93) int local93 = this.anIntArray429[local75];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = arg0 * (float) local95;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(115) float local115 = (float) -local105 + local102;
			@Pc(119) float local119 = 1.0F - local115;
			@Pc(123) int local123 = local109 & local37;
			@Pc(127) float local127 = Static646.method9074(local115);
			@Pc(131) int local131 = local105 & local37;
			@Pc(138) int local138 = this.anIntArray429[local131 + local88];
			@Pc(145) int local145 = this.anIntArray429[local88 + local123];
			@Pc(152) int local152 = this.anIntArray429[local93 + local131];
			@Pc(159) int local159 = this.anIntArray429[local93 + local123];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = (float) local161 * arg6;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(180) float local180 = local168 - (float) local171;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local175 & local17;
				@Pc(193) int local193 = local171 & local17;
				@Pc(197) float local197 = Static646.method9074(local180);
				arg5[arg4++] = Static681.method9394(Static681.method9394(Static681.method9394(Static537.method7912(this.anIntArray429[local189 + local159] & 0x7, local67, local180, local115), local197, Static537.method7912(this.anIntArray429[local193 + local159] & 0x7, local67, local185, local115)), local127, Static681.method9394(Static537.method7912(this.anIntArray429[local152 + local189] & 0x7, local67, local180, local119), local197, Static537.method7912(this.anIntArray429[local193 + local152] & 0x7, local67, local185, local119))), local79, Static681.method9394(Static681.method9394(Static537.method7912(this.anIntArray429[local189 + local145] & 0x7, local71, local180, local115), local197, Static537.method7912(this.anIntArray429[local145 + local193] & 0x7, local71, local185, local115)), local127, Static681.method9394(Static537.method7912(this.anIntArray429[local189 + local138] & 0x7, local71, local180, local119), local197, Static537.method7912(this.anIntArray429[local193 + local138] & 0x7, local71, local185, local119)))) * arg1;
			}
		}
	}
}
