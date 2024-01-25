import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class209_Sub1 extends Class209 {

	@OriginalMember(owner = "client!lia", name = "l", descriptor = "[I")
	private final int[] anIntArray316 = new int[512];

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(I)V")
	public Class209_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray316[local15] = this.anIntArray316[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray316[local44];
			this.anIntArray316[local44] = this.anIntArray316[local44 + 256] = this.anIntArray316[local37];
			this.anIntArray316[local37] = this.anIntArray316[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(F[FIIIIIIFFF)V")
	@Override
	public void method4977(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(53) int local53 = (int) ((float) 16 * arg0 - 1.0F);
		@Pc(57) int local57 = local53 & 0xFF;
		@Pc(62) float local62 = arg0 * (float) arg2;
		@Pc(65) int local65 = (int) local62;
		@Pc(69) int local69 = local65 + 1;
		@Pc(75) float local75 = (float) -local65 + local62;
		@Pc(80) float local80 = 1.0F - local75;
		@Pc(84) int local84 = local69 & local57;
		@Pc(88) int local88 = local65 & local57;
		@Pc(92) float local92 = Static223.method3280(local75);
		@Pc(97) int local97 = this.anIntArray316[local88];
		@Pc(102) int local102 = this.anIntArray316[local84];
		for (@Pc(104) int local104 = 0; local104 < 128; local104++) {
			@Pc(111) float local111 = arg6 * (float) local104;
			@Pc(114) int local114 = (int) local111;
			@Pc(118) int local118 = local114 + 1;
			@Pc(123) float local123 = local111 - (float) local114;
			@Pc(128) float local128 = 1.0F - local123;
			@Pc(132) float local132 = Static223.method3280(local123);
			@Pc(136) int local136 = local114 & local29;
			@Pc(140) int local140 = local118 & local29;
			@Pc(147) int local147 = this.anIntArray316[local136 + local97];
			@Pc(154) int local154 = this.anIntArray316[local140 + local97];
			@Pc(162) int local162 = this.anIntArray316[local136 + local102];
			@Pc(170) int local170 = this.anIntArray316[local140 + local102];
			for (@Pc(172) int local172 = 0; local172 < 128; local172++) {
				@Pc(179) float local179 = (float) local172 * arg4;
				@Pc(182) int local182 = (int) local179;
				@Pc(186) int local186 = local182 + 1;
				@Pc(192) float local192 = (float) -local182 + local179;
				@Pc(197) float local197 = 1.0F - local192;
				@Pc(201) float local201 = Static223.method3280(local192);
				@Pc(205) int local205 = local182 & local17;
				@Pc(209) int local209 = local186 & local17;
				arg1[arg3++] = arg5 * Static601.method7983(Static601.method7983(Static601.method7983(Static486.method6415(local128, local197, local80, this.anIntArray316[local205 + local147] & 0x7), local201, Static486.method6415(local128, local192, local80, this.anIntArray316[local147 + local209] & 0x7)), local132, Static601.method7983(Static486.method6415(local123, local197, local80, this.anIntArray316[local154 + local205] & 0x7), local201, Static486.method6415(local123, local192, local80, this.anIntArray316[local209 + local154] & 0x7))), local92, Static601.method7983(Static601.method7983(Static486.method6415(local128, local197, local75, this.anIntArray316[local205 + local162] & 0x7), local201, Static486.method6415(local128, local192, local75, this.anIntArray316[local209 + local162] & 0x7)), local132, Static601.method7983(Static486.method6415(local123, local197, local75, this.anIntArray316[local205 + local170] & 0x7), local201, Static486.method6415(local123, local192, local75, this.anIntArray316[local209 + local170] & 0x7))));
			}
		}
	}
}
