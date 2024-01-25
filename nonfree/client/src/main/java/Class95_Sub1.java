import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
	private final int[] anIntArray313 = new int[512];

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
	public Class95_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray313[local15] = this.anIntArray313[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray313[local42];
			this.anIntArray313[local42] = this.anIntArray313[local42 + 256] = this.anIntArray313[local35];
			this.anIntArray313[local35] = this.anIntArray313[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(FIFI[FZIFIFI)V")
	@Override
	public void method3212(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg6 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg5 * arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) int local67 = local53 & local41;
		@Pc(71) int local71 = local49 & local41;
		@Pc(75) float local75 = Static96.method1662(local58);
		@Pc(80) int local80 = this.anIntArray313[local71];
		@Pc(85) int local85 = this.anIntArray313[local67];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(94) float local94 = (float) local87 * arg0;
			@Pc(97) int local97 = (int) local94;
			@Pc(101) int local101 = local97 + 1;
			@Pc(106) float local106 = local94 - (float) local97;
			@Pc(111) float local111 = 1.0F - local106;
			@Pc(115) int local115 = local101 & local29;
			@Pc(119) float local119 = Static96.method1662(local106);
			@Pc(123) int local123 = local97 & local29;
			@Pc(131) int local131 = this.anIntArray313[local123 + local80];
			@Pc(138) int local138 = this.anIntArray313[local80 + local115];
			@Pc(146) int local146 = this.anIntArray313[local123 + local85];
			@Pc(153) int local153 = this.anIntArray313[local85 + local115];
			for (@Pc(155) int local155 = 0; local155 < 128; local155++) {
				@Pc(162) float local162 = (float) local155 * arg1;
				@Pc(165) int local165 = (int) local162;
				@Pc(169) int local169 = local165 + 1;
				@Pc(174) float local174 = local162 - (float) local165;
				@Pc(178) float local178 = 1.0F - local174;
				@Pc(182) int local182 = local165 & local17;
				@Pc(186) int local186 = local169 & local17;
				@Pc(190) float local190 = Static96.method1662(local174);
				arg3[arg2++] = Static281.method4246(local75, Static281.method4246(local119, Static281.method4246(local190, Static384.method5307(local58, local106, local174, this.anIntArray313[local153 + local186] & 0x7), Static384.method5307(local58, local106, local178, this.anIntArray313[local182 + local153] & 0x7)), Static281.method4246(local190, Static384.method5307(local58, local111, local174, this.anIntArray313[local146 + local186] & 0x7), Static384.method5307(local58, local111, local178, this.anIntArray313[local182 + local146] & 0x7))), Static281.method4246(local119, Static281.method4246(local190, Static384.method5307(local63, local106, local174, this.anIntArray313[local186 + local138] & 0x7), Static384.method5307(local63, local106, local178, this.anIntArray313[local138 + local182] & 0x7)), Static281.method4246(local190, Static384.method5307(local63, local111, local174, this.anIntArray313[local186 + local131] & 0x7), Static384.method5307(local63, local111, local178, this.anIntArray313[local131 + local182] & 0x7)))) * arg4;
			}
		}
	}
}
