import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
	private final int[] anIntArray624 = new int[512];

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
	public Class75_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray624[local15] = this.anIntArray624[local15 + 256] = local15;
		}
		for (@Pc(39) int local39 = 0; local39 < 256; local39++) {
			@Pc(48) int local48 = local13.nextInt() & 0xFF;
			@Pc(53) int local53 = this.anIntArray624[local48];
			this.anIntArray624[local48] = this.anIntArray624[local48 + 256] = this.anIntArray624[local39];
			this.anIntArray624[local39] = this.anIntArray624[local39 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(FIFIIIFII[FF)V")
	@Override
	public void method7323(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(55) int local55 = (int) (arg6 * (float) 16 - 1.0F);
		@Pc(59) int local59 = local55 & 0xFF;
		@Pc(64) float local64 = arg6 * (float) arg3;
		@Pc(67) int local67 = (int) local64;
		@Pc(71) int local71 = local67 + 1;
		@Pc(77) float local77 = (float) -local67 + local64;
		@Pc(82) float local82 = 1.0F - local77;
		@Pc(86) int local86 = local71 & local59;
		@Pc(90) int local90 = local67 & local59;
		@Pc(94) float local94 = Static101.method1989(local77);
		@Pc(99) int local99 = this.anIntArray624[local90];
		@Pc(104) int local104 = this.anIntArray624[local86];
		for (@Pc(106) int local106 = 0; local106 < 128; local106++) {
			@Pc(113) float local113 = (float) local106 * arg1;
			@Pc(116) int local116 = (int) local113;
			@Pc(120) int local120 = local116 + 1;
			@Pc(126) float local126 = (float) -local116 + local113;
			@Pc(131) float local131 = 1.0F - local126;
			@Pc(135) int local135 = local116 & local29;
			@Pc(139) float local139 = Static101.method1989(local126);
			@Pc(143) int local143 = local120 & local29;
			@Pc(150) int local150 = this.anIntArray624[local99 + local135];
			@Pc(158) int local158 = this.anIntArray624[local143 + local99];
			@Pc(165) int local165 = this.anIntArray624[local104 + local135];
			@Pc(172) int local172 = this.anIntArray624[local143 + local104];
			for (@Pc(174) int local174 = 0; local174 < 128; local174++) {
				@Pc(181) float local181 = arg2 * (float) local174;
				@Pc(184) int local184 = (int) local181;
				@Pc(188) int local188 = local184 + 1;
				@Pc(193) float local193 = local181 - (float) local184;
				@Pc(198) float local198 = 1.0F - local193;
				@Pc(202) int local202 = local184 & local17;
				@Pc(206) int local206 = local188 & local17;
				@Pc(210) float local210 = Static101.method1989(local193);
				arg5[arg4++] = arg0 * Static577.method7499(Static577.method7499(Static577.method7499(Static531.method7073(local198, this.anIntArray624[local150 + local202] & 0x7, local131, local82), Static531.method7073(local193, this.anIntArray624[local206 + local150] & 0x7, local131, local82), local210), Static577.method7499(Static531.method7073(local198, this.anIntArray624[local158 + local202] & 0x7, local126, local82), Static531.method7073(local193, this.anIntArray624[local206 + local158] & 0x7, local126, local82), local210), local139), Static577.method7499(Static577.method7499(Static531.method7073(local198, this.anIntArray624[local202 + local165] & 0x7, local131, local77), Static531.method7073(local193, this.anIntArray624[local206 + local165] & 0x7, local131, local77), local210), Static577.method7499(Static531.method7073(local198, this.anIntArray624[local202 + local172] & 0x7, local126, local77), Static531.method7073(local193, this.anIntArray624[local172 + local206] & 0x7, local126, local77), local210), local139), local94);
			}
		}
	}
}
