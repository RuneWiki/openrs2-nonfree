import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "[I")
	private final int[] anIntArray592 = new int[512];

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class103_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray592[local13] = this.anIntArray592[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray592[local38];
			this.anIntArray592[local38] = this.anIntArray592[local38 + 256] = this.anIntArray592[local32];
			this.anIntArray592[local32] = this.anIntArray592[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(FFIFIIII[FFI)V")
	@Override
	public void method5329(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg6 * arg1;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) float local66 = Static102.method1861(local58);
		@Pc(70) int local70 = local53 & local41;
		@Pc(74) int local74 = local49 & local41;
		@Pc(79) int local79 = this.anIntArray592[local74];
		@Pc(84) int local84 = this.anIntArray592[local70];
		for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
			@Pc(93) float local93 = arg5 * (float) local86;
			@Pc(96) int local96 = (int) local93;
			@Pc(100) int local100 = local96 + 1;
			@Pc(106) float local106 = (float) -local96 + local93;
			@Pc(110) float local110 = 1.0F - local106;
			@Pc(114) int local114 = local96 & local29;
			@Pc(118) float local118 = Static102.method1861(local106);
			@Pc(122) int local122 = local100 & local29;
			@Pc(130) int local130 = this.anIntArray592[local114 + local79];
			@Pc(137) int local137 = this.anIntArray592[local79 + local122];
			@Pc(144) int local144 = this.anIntArray592[local114 + local84];
			@Pc(151) int local151 = this.anIntArray592[local84 + local122];
			for (@Pc(153) int local153 = 0; local153 < 128; local153++) {
				@Pc(160) float local160 = arg0 * (float) local153;
				@Pc(163) int local163 = (int) local160;
				@Pc(167) int local167 = local163 + 1;
				@Pc(172) float local172 = local160 - (float) local163;
				@Pc(177) float local177 = 1.0F - local172;
				@Pc(181) float local181 = Static102.method1861(local172);
				@Pc(185) int local185 = local163 & local17;
				@Pc(189) int local189 = local167 & local17;
				arg4[arg3++] = Static266.method5705(Static266.method5705(Static266.method5705(Static189.method2966(local58, local172, local106, this.anIntArray592[local189 + local151] & 0x7), Static189.method2966(local58, local177, local106, this.anIntArray592[local185 + local151] & 0x7), local181), Static266.method5705(Static189.method2966(local58, local172, local110, this.anIntArray592[local144 + local189] & 0x7), Static189.method2966(local58, local177, local110, this.anIntArray592[local185 + local144] & 0x7), local181), local118), Static266.method5705(Static266.method5705(Static189.method2966(local62, local172, local106, this.anIntArray592[local137 + local189] & 0x7), Static189.method2966(local62, local177, local106, this.anIntArray592[local185 + local137] & 0x7), local181), Static266.method5705(Static189.method2966(local62, local172, local110, this.anIntArray592[local189 + local130] & 0x7), Static189.method2966(local62, local177, local110, this.anIntArray592[local185 + local130] & 0x7), local181), local118), local66) * arg2;
			}
		}
	}
}
