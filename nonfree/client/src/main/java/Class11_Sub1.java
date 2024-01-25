import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
	private final int[] anIntArray25 = new int[512];

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
	public Class11_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray25[local15] = this.anIntArray25[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray25[local44];
			this.anIntArray25[local44] = this.anIntArray25[local44 + 256] = this.anIntArray25[local37];
			this.anIntArray25[local37] = this.anIntArray25[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFIFIFIIII[F)V")
	@Override
	public void method437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg1 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg4 * arg1;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) int local67 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(79) float local79 = Static499.method7330(local58);
		@Pc(84) int local84 = this.anIntArray25[local75];
		@Pc(89) int local89 = this.anIntArray25[local67];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg3 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(110) float local110 = local98 - (float) local101;
			@Pc(115) float local115 = 1.0F - local110;
			@Pc(119) int local119 = local101 & local29;
			@Pc(123) float local123 = Static499.method7330(local110);
			@Pc(127) int local127 = local105 & local29;
			@Pc(134) int local134 = this.anIntArray25[local84 + local119];
			@Pc(141) int local141 = this.anIntArray25[local84 + local127];
			@Pc(148) int local148 = this.anIntArray25[local119 + local89];
			@Pc(155) int local155 = this.anIntArray25[local127 + local89];
			for (@Pc(157) int local157 = 0; local157 < 128; local157++) {
				@Pc(164) float local164 = (float) local157 * arg0;
				@Pc(167) int local167 = (int) local164;
				@Pc(171) int local171 = local167 + 1;
				@Pc(177) float local177 = (float) -local167 + local164;
				@Pc(182) float local182 = 1.0F - local177;
				@Pc(186) int local186 = local167 & local17;
				@Pc(190) int local190 = local171 & local17;
				@Pc(194) float local194 = Static499.method7330(local177);
				arg6[arg5++] = arg2 * Static170.method2771(local79, Static170.method2771(local123, Static170.method2771(local194, Static267.method3908(this.anIntArray25[local186 + local134] & 0x7, local182, local115, local63), Static267.method3908(this.anIntArray25[local134 + local190] & 0x7, local177, local115, local63)), Static170.method2771(local194, Static267.method3908(this.anIntArray25[local141 + local186] & 0x7, local182, local110, local63), Static267.method3908(this.anIntArray25[local190 + local141] & 0x7, local177, local110, local63))), Static170.method2771(local123, Static170.method2771(local194, Static267.method3908(this.anIntArray25[local186 + local148] & 0x7, local182, local115, local58), Static267.method3908(this.anIntArray25[local148 + local190] & 0x7, local177, local115, local58)), Static170.method2771(local194, Static267.method3908(this.anIntArray25[local155 + local186] & 0x7, local182, local110, local58), Static267.method3908(this.anIntArray25[local155 + local190] & 0x7, local177, local110, local58))));
			}
		}
	}
}
