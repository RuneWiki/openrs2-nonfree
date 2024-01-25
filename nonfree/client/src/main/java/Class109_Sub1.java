import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	private final int[] anIntArray679 = new int[512];

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class109_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray679[local15] = this.anIntArray679[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray679[local42];
			this.anIntArray679[local42] = this.anIntArray679[local42 + 256] = this.anIntArray679[local35];
			this.anIntArray679[local35] = this.anIntArray679[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(FFIB[FIIFFII)V")
	@Override
	public void method7298(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(4) float[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg6 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg4 * arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) float local66 = Static147.method3028(local58);
		@Pc(70) int local70 = local49 & local41;
		@Pc(74) int local74 = local53 & local41;
		@Pc(79) int local79 = this.anIntArray679[local70];
		@Pc(84) int local84 = this.anIntArray679[local74];
		for (@Pc(102) int local102 = 0; local102 < 128; local102++) {
			@Pc(109) float local109 = (float) local102 * arg1;
			@Pc(112) int local112 = (int) local109;
			@Pc(116) int local116 = local112 + 1;
			@Pc(121) float local121 = local109 - (float) local112;
			@Pc(126) float local126 = 1.0F - local121;
			@Pc(130) int local130 = local112 & local29;
			@Pc(134) float local134 = Static147.method3028(local121);
			@Pc(138) int local138 = local116 & local29;
			@Pc(146) int local146 = this.anIntArray679[local130 + local79];
			@Pc(153) int local153 = this.anIntArray679[local79 + local138];
			@Pc(160) int local160 = this.anIntArray679[local130 + local84];
			@Pc(167) int local167 = this.anIntArray679[local84 + local138];
			for (@Pc(169) int local169 = 0; local169 < 128; local169++) {
				@Pc(176) float local176 = arg0 * (float) local169;
				@Pc(179) int local179 = (int) local176;
				@Pc(183) int local183 = local179 + 1;
				@Pc(188) float local188 = local176 - (float) local179;
				@Pc(192) float local192 = 1.0F - local188;
				@Pc(196) int local196 = local179 & local17;
				@Pc(200) float local200 = Static147.method3028(local188);
				@Pc(204) int local204 = local183 & local17;
				arg2[arg3++] = arg5 * Static271.method4374(local66, Static271.method4374(local134, Static271.method4374(local200, Static107.method6137(local188, this.anIntArray679[local204 + local167] & 0x7, local58, local121), Static107.method6137(local192, this.anIntArray679[local196 + local167] & 0x7, local58, local121)), Static271.method4374(local200, Static107.method6137(local188, this.anIntArray679[local160 + local204] & 0x7, local58, local126), Static107.method6137(local192, this.anIntArray679[local160 + local196] & 0x7, local58, local126))), Static271.method4374(local134, Static271.method4374(local200, Static107.method6137(local188, this.anIntArray679[local153 + local204] & 0x7, local62, local121), Static107.method6137(local192, this.anIntArray679[local153 + local196] & 0x7, local62, local121)), Static271.method4374(local200, Static107.method6137(local188, this.anIntArray679[local146 + local204] & 0x7, local62, local126), Static107.method6137(local192, this.anIntArray679[local196 + local146] & 0x7, local62, local126))));
			}
		}
	}
}
