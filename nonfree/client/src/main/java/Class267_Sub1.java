import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class267_Sub1 extends Class267 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
	private final int[] anIntArray430 = new int[512];

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class267_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray430[local15] = this.anIntArray430[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray430[local44];
			this.anIntArray430[local44] = this.anIntArray430[local44 + 256] = this.anIntArray430[local37];
			this.anIntArray430[local37] = this.anIntArray430[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([FIIFFIIIFIF)V")
	@Override
	public void method5887(@OriginalArg(0) float[] arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(21) int local21 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(25) int local25 = local21 & 0xFF;
		@Pc(33) int local33 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(37) int local37 = local33 & 0xFF;
		@Pc(45) int local45 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(49) int local49 = local45 & 0xFF;
		@Pc(54) float local54 = arg2 * (float) arg3;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(67) float local67 = (float) -local57 + local54;
		@Pc(71) float local71 = 1.0F - local67;
		@Pc(75) int local75 = local57 & local49;
		@Pc(79) float local79 = Static371.method5233(local67);
		@Pc(83) int local83 = local61 & local49;
		@Pc(88) int local88 = this.anIntArray430[local75];
		@Pc(93) int local93 = this.anIntArray430[local83];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = arg4 * (float) local95;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(115) float local115 = (float) -local105 + local102;
			@Pc(119) float local119 = 1.0F - local115;
			@Pc(123) int local123 = local109 & local37;
			@Pc(127) float local127 = Static371.method5233(local115);
			@Pc(131) int local131 = local105 & local37;
			@Pc(138) int local138 = this.anIntArray430[local88 + local131];
			@Pc(146) int local146 = this.anIntArray430[local123 + local88];
			@Pc(153) int local153 = this.anIntArray430[local93 + local131];
			@Pc(161) int local161 = this.anIntArray430[local123 + local93];
			for (@Pc(163) int local163 = 0; local163 < 128; local163++) {
				@Pc(170) float local170 = arg6 * (float) local163;
				@Pc(173) int local173 = (int) local170;
				@Pc(177) int local177 = local173 + 1;
				@Pc(182) float local182 = local170 - (float) local173;
				@Pc(187) float local187 = 1.0F - local182;
				@Pc(191) int local191 = local173 & local25;
				@Pc(195) float local195 = Static371.method5233(local182);
				@Pc(199) int local199 = local177 & local25;
				arg0[arg5++] = arg1 * Static258.method4010(local79, Static258.method4010(local127, Static258.method4010(local195, Static410.method5760(local115, this.anIntArray430[local199 + local161] & 0x7, local67, local182), Static410.method5760(local115, this.anIntArray430[local191 + local161] & 0x7, local67, local187)), Static258.method4010(local195, Static410.method5760(local119, this.anIntArray430[local153 + local199] & 0x7, local67, local182), Static410.method5760(local119, this.anIntArray430[local191 + local153] & 0x7, local67, local187))), Static258.method4010(local127, Static258.method4010(local195, Static410.method5760(local115, this.anIntArray430[local199 + local146] & 0x7, local71, local182), Static410.method5760(local115, this.anIntArray430[local191 + local146] & 0x7, local71, local187)), Static258.method4010(local195, Static410.method5760(local119, this.anIntArray430[local138 + local199] & 0x7, local71, local182), Static410.method5760(local119, this.anIntArray430[local191 + local138] & 0x7, local71, local187))));
			}
		}
	}
}
