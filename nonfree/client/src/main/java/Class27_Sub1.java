import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "[I")
	private final int[] anIntArray271 = new int[512];

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V")
	public Class27_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray271[local15] = this.anIntArray271[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray271[local42];
			this.anIntArray271[local42] = this.anIntArray271[local42 + 256] = this.anIntArray271[local35];
			this.anIntArray271[local35] = this.anIntArray271[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(FIB[FIIIIFFF)V")
	@Override
	public void method2713(@OriginalArg(0) float arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg5 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(54) float local54 = arg5 * (float) arg2;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(67) float local67 = (float) -local57 + local54;
		@Pc(71) float local71 = 1.0F - local67;
		@Pc(75) float local75 = Static9.method5079(local67);
		@Pc(79) int local79 = local57 & local41;
		@Pc(83) int local83 = local61 & local41;
		@Pc(88) int local88 = this.anIntArray271[local79];
		@Pc(93) int local93 = this.anIntArray271[local83];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = (float) local95 * arg4;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(115) float local115 = (float) -local105 + local102;
			@Pc(119) float local119 = 1.0F - local115;
			@Pc(123) int local123 = local109 & local29;
			@Pc(127) float local127 = Static9.method5079(local115);
			@Pc(131) int local131 = local105 & local29;
			@Pc(138) int local138 = this.anIntArray271[local131 + local88];
			@Pc(146) int local146 = this.anIntArray271[local123 + local88];
			@Pc(153) int local153 = this.anIntArray271[local93 + local131];
			@Pc(160) int local160 = this.anIntArray271[local93 + local123];
			for (@Pc(162) int local162 = 0; local162 < 128; local162++) {
				@Pc(169) float local169 = (float) local162 * arg0;
				@Pc(172) int local172 = (int) local169;
				@Pc(176) int local176 = local172 + 1;
				@Pc(181) float local181 = local169 - (float) local172;
				@Pc(185) float local185 = 1.0F - local181;
				@Pc(189) int local189 = local176 & local17;
				@Pc(193) int local193 = local172 & local17;
				@Pc(197) float local197 = Static9.method5079(local181);
				arg1[arg3++] = Static386.method5783(local75, Static386.method5783(local127, Static386.method5783(local197, Static107.method1782(this.anIntArray271[local138 + local193] & 0x7, local185, local71, local119), Static107.method1782(this.anIntArray271[local138 + local189] & 0x7, local181, local71, local119)), Static386.method5783(local197, Static107.method1782(this.anIntArray271[local193 + local146] & 0x7, local185, local71, local115), Static107.method1782(this.anIntArray271[local146 + local189] & 0x7, local181, local71, local115))), Static386.method5783(local127, Static386.method5783(local197, Static107.method1782(this.anIntArray271[local153 + local193] & 0x7, local185, local67, local119), Static107.method1782(this.anIntArray271[local189 + local153] & 0x7, local181, local67, local119)), Static386.method5783(local197, Static107.method1782(this.anIntArray271[local193 + local160] & 0x7, local185, local67, local115), Static107.method1782(this.anIntArray271[local160 + local189] & 0x7, local181, local67, local115)))) * arg6;
			}
		}
	}
}
