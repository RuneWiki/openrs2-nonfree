import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "[I")
	private final int[] anIntArray196 = new int[512];

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V")
	public Class26_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray196[local15] = this.anIntArray196[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray196[local44];
			this.anIntArray196[local44] = this.anIntArray196[local44 + 256] = this.anIntArray196[local37];
			this.anIntArray196[local37] = this.anIntArray196[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(FFIIF[FBIIIF)V")
	@Override
	public void method3280(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float[] arg5, @OriginalArg(10) float arg6) {
		@Pc(18) int local18 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(22) int local22 = local18 & 0xFF;
		@Pc(30) int local30 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(34) int local34 = local30 & 0xFF;
		@Pc(42) int local42 = (int) ((float) 16 * arg4 - 1.0F);
		@Pc(46) int local46 = local42 & 0xFF;
		@Pc(51) float local51 = (float) arg2 * arg4;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(63) float local63 = local51 - (float) local54;
		@Pc(67) float local67 = 1.0F - local63;
		@Pc(71) int local71 = local58 & local46;
		@Pc(75) float local75 = Static593.method8265(local63);
		@Pc(79) int local79 = local54 & local46;
		@Pc(84) int local84 = this.anIntArray196[local79];
		@Pc(89) int local89 = this.anIntArray196[local71];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg1 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(110) float local110 = local98 - (float) local101;
			@Pc(114) float local114 = 1.0F - local110;
			@Pc(118) int local118 = local105 & local34;
			@Pc(122) float local122 = Static593.method8265(local110);
			@Pc(126) int local126 = local101 & local34;
			@Pc(133) int local133 = this.anIntArray196[local84 + local126];
			@Pc(140) int local140 = this.anIntArray196[local84 + local118];
			@Pc(147) int local147 = this.anIntArray196[local126 + local89];
			@Pc(154) int local154 = this.anIntArray196[local89 + local118];
			for (@Pc(156) int local156 = 0; local156 < 128; local156++) {
				@Pc(163) float local163 = arg6 * (float) local156;
				@Pc(166) int local166 = (int) local163;
				@Pc(170) int local170 = local166 + 1;
				@Pc(176) float local176 = (float) -local166 + local163;
				@Pc(180) float local180 = 1.0F - local176;
				@Pc(184) int local184 = local166 & local22;
				@Pc(188) float local188 = Static593.method8265(local176);
				@Pc(192) int local192 = local170 & local22;
				arg5[arg3++] = arg0 * Static445.method6554(local75, Static445.method6554(local122, Static445.method6554(local188, Static111.method2043(local180, this.anIntArray196[local184 + local133] & 0x7, local114, local67), Static111.method2043(local176, this.anIntArray196[local192 + local133] & 0x7, local114, local67)), Static445.method6554(local188, Static111.method2043(local180, this.anIntArray196[local140 + local184] & 0x7, local110, local67), Static111.method2043(local176, this.anIntArray196[local140 + local192] & 0x7, local110, local67))), Static445.method6554(local122, Static445.method6554(local188, Static111.method2043(local180, this.anIntArray196[local184 + local147] & 0x7, local114, local63), Static111.method2043(local176, this.anIntArray196[local192 + local147] & 0x7, local114, local63)), Static445.method6554(local188, Static111.method2043(local180, this.anIntArray196[local184 + local154] & 0x7, local110, local63), Static111.method2043(local176, this.anIntArray196[local154 + local192] & 0x7, local110, local63))));
			}
		}
	}
}
