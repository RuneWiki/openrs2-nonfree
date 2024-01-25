import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
	private final int[] anIntArray444 = new int[512];

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
	public Class79_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray444[local15] = this.anIntArray444[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray444[local44];
			this.anIntArray444[local44] = this.anIntArray444[local44 + 256] = this.anIntArray444[local37];
			this.anIntArray444[local37] = this.anIntArray444[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IFIIFIFFII[F)V")
	@Override
	public void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg5 * arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) int local67 = local53 & local41;
		@Pc(71) int local71 = local49 & local41;
		@Pc(86) float local86 = Static30.method581(local59);
		@Pc(91) int local91 = this.anIntArray444[local71];
		@Pc(96) int local96 = this.anIntArray444[local67];
		for (@Pc(98) int local98 = 0; local98 < 128; local98++) {
			@Pc(105) float local105 = (float) local98 * arg1;
			@Pc(108) int local108 = (int) local105;
			@Pc(112) int local112 = local108 + 1;
			@Pc(117) float local117 = local105 - (float) local108;
			@Pc(121) float local121 = 1.0F - local117;
			@Pc(125) float local125 = Static30.method581(local117);
			@Pc(129) int local129 = local112 & local29;
			@Pc(133) int local133 = local108 & local29;
			@Pc(140) int local140 = this.anIntArray444[local91 + local133];
			@Pc(147) int local147 = this.anIntArray444[local129 + local91];
			@Pc(154) int local154 = this.anIntArray444[local96 + local133];
			@Pc(162) int local162 = this.anIntArray444[local129 + local96];
			for (@Pc(164) int local164 = 0; local164 < 128; local164++) {
				@Pc(171) float local171 = (float) local164 * arg3;
				@Pc(174) int local174 = (int) local171;
				@Pc(178) int local178 = local174 + 1;
				@Pc(183) float local183 = local171 - (float) local174;
				@Pc(188) float local188 = 1.0F - local183;
				@Pc(192) float local192 = Static30.method581(local183);
				@Pc(196) int local196 = local178 & local17;
				@Pc(200) int local200 = local174 & local17;
				arg6[arg0++] = arg4 * Static318.method3751(local86, Static318.method3751(local125, Static318.method3751(local192, Static432.method5497(local188, local121, this.anIntArray444[local140 + local200] & 0x7, local63), Static432.method5497(local183, local121, this.anIntArray444[local140 + local196] & 0x7, local63)), Static318.method3751(local192, Static432.method5497(local188, local117, this.anIntArray444[local147 + local200] & 0x7, local63), Static432.method5497(local183, local117, this.anIntArray444[local147 + local196] & 0x7, local63))), Static318.method3751(local125, Static318.method3751(local192, Static432.method5497(local188, local121, this.anIntArray444[local154 + local200] & 0x7, local59), Static432.method5497(local183, local121, this.anIntArray444[local154 + local196] & 0x7, local59)), Static318.method3751(local192, Static432.method5497(local188, local117, this.anIntArray444[local200 + local162] & 0x7, local59), Static432.method5497(local183, local117, this.anIntArray444[local162 + local196] & 0x7, local59))));
			}
		}
	}
}
