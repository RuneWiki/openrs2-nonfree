import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "[I")
	private final int[] anIntArray322 = new int[512];

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
	public Class17_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray322[local15] = this.anIntArray322[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray322[local44];
			this.anIntArray322[local44] = this.anIntArray322[local44 + 256] = this.anIntArray322[local37];
			this.anIntArray322[local37] = this.anIntArray322[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FIFIIFFII[FI)V")
	@Override
	public void method3262(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg2 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg3 * (float) arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = (float) 1 - local58;
		@Pc(67) int local67 = local49 & local41;
		@Pc(71) float local71 = Static369.method5078(local58);
		@Pc(75) int local75 = local53 & local41;
		@Pc(80) int local80 = this.anIntArray322[local67];
		@Pc(85) int local85 = this.anIntArray322[local75];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(94) float local94 = (float) local87 * arg0;
			@Pc(97) int local97 = (int) local94;
			@Pc(101) int local101 = local97 + 1;
			@Pc(106) float local106 = local94 - (float) local97;
			@Pc(110) float local110 = 1.0F - local106;
			@Pc(114) int local114 = local101 & local29;
			@Pc(118) int local118 = local97 & local29;
			@Pc(122) float local122 = Static369.method5078(local106);
			@Pc(129) int local129 = this.anIntArray322[local80 + local118];
			@Pc(137) int local137 = this.anIntArray322[local114 + local80];
			@Pc(144) int local144 = this.anIntArray322[local85 + local118];
			@Pc(151) int local151 = this.anIntArray322[local85 + local114];
			for (@Pc(153) int local153 = 0; local153 < 128; local153++) {
				@Pc(160) float local160 = (float) local153 * arg2;
				@Pc(163) int local163 = (int) local160;
				@Pc(167) int local167 = local163 + 1;
				@Pc(172) float local172 = local160 - (float) local163;
				@Pc(177) float local177 = 1.0F - local172;
				@Pc(181) int local181 = local167 & local17;
				@Pc(185) int local185 = local163 & local17;
				@Pc(189) float local189 = Static369.method5078(local172);
				arg5[arg4++] = Static168.method2674(Static168.method2674(Static168.method2674(Static23.method431(local58, local172, this.anIntArray322[local181 + local151] & 0x7, local106), local189, Static23.method431(local58, local177, this.anIntArray322[local185 + local151] & 0x7, local106)), local122, Static168.method2674(Static23.method431(local58, local172, this.anIntArray322[local181 + local144] & 0x7, local110), local189, Static23.method431(local58, local177, this.anIntArray322[local185 + local144] & 0x7, local110))), local71, Static168.method2674(Static168.method2674(Static23.method431(local63, local172, this.anIntArray322[local181 + local137] & 0x7, local106), local189, Static23.method431(local63, local177, this.anIntArray322[local185 + local137] & 0x7, local106)), local122, Static168.method2674(Static23.method431(local63, local172, this.anIntArray322[local181 + local129] & 0x7, local110), local189, Static23.method431(local63, local177, this.anIntArray322[local129 + local185] & 0x7, local110)))) * arg1;
			}
		}
	}
}
