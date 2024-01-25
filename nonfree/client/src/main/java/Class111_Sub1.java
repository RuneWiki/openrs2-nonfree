import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "[I")
	private final int[] anIntArray207 = new int[512];

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(I)V")
	public Class111_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray207[local15] = this.anIntArray207[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(46) int local46 = local13.nextInt() & 0xFF;
			@Pc(51) int local51 = this.anIntArray207[local46];
			this.anIntArray207[local46] = this.anIntArray207[local46 + 256] = this.anIntArray207[local37];
			this.anIntArray207[local37] = this.anIntArray207[local37 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IFZFIFFII[FI)V")
	@Override
	public void method2431(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float[] arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg4 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg5 * arg4;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) int local68 = local49 & local41;
		@Pc(72) float local72 = Static64.method962(local59);
		@Pc(76) int local76 = local53 & local41;
		@Pc(81) int local81 = this.anIntArray207[local68];
		@Pc(86) int local86 = this.anIntArray207[local76];
		for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
			@Pc(95) float local95 = (float) local88 * arg3;
			@Pc(98) int local98 = (int) local95;
			@Pc(102) int local102 = local98 + 1;
			@Pc(108) float local108 = (float) -local98 + local95;
			@Pc(113) float local113 = 1.0F - local108;
			@Pc(117) int local117 = local98 & local29;
			@Pc(121) int local121 = local102 & local29;
			@Pc(125) float local125 = Static64.method962(local108);
			@Pc(132) int local132 = this.anIntArray207[local81 + local117];
			@Pc(140) int local140 = this.anIntArray207[local121 + local81];
			@Pc(147) int local147 = this.anIntArray207[local117 + local86];
			@Pc(154) int local154 = this.anIntArray207[local86 + local121];
			for (@Pc(156) int local156 = 0; local156 < 128; local156++) {
				@Pc(163) float local163 = arg2 * (float) local156;
				@Pc(166) int local166 = (int) local163;
				@Pc(170) int local170 = local166 + 1;
				@Pc(175) float local175 = local163 - (float) local166;
				@Pc(180) float local180 = 1.0F - local175;
				@Pc(184) int local184 = local166 & local17;
				@Pc(188) int local188 = local170 & local17;
				@Pc(192) float local192 = Static64.method962(local175);
				arg6[arg0++] = arg1 * Static428.method6264(Static428.method6264(Static428.method6264(Static414.method8373(local175, local59, local108, this.anIntArray207[local154 + local188] & 0x7), local192, Static414.method8373(local180, local59, local108, this.anIntArray207[local154 + local184] & 0x7)), local125, Static428.method6264(Static414.method8373(local175, local59, local113, this.anIntArray207[local188 + local147] & 0x7), local192, Static414.method8373(local180, local59, local113, this.anIntArray207[local184 + local147] & 0x7))), local72, Static428.method6264(Static428.method6264(Static414.method8373(local175, local64, local108, this.anIntArray207[local188 + local140] & 0x7), local192, Static414.method8373(local180, local64, local108, this.anIntArray207[local140 + local184] & 0x7)), local125, Static428.method6264(Static414.method8373(local175, local64, local113, this.anIntArray207[local188 + local132] & 0x7), local192, Static414.method8373(local180, local64, local113, this.anIntArray207[local132 + local184] & 0x7))));
			}
		}
	}
}
