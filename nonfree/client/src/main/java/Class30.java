import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public abstract class Class30 {

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	private int anInt5005 = 4;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	private int anInt5011 = 4;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[S")
	private final short[] aShortArray60 = new short[512];

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	private int anInt5013 = 4;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	protected int anInt5014 = 4;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	private int anInt5015 = 0;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIII)V")
	protected Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5013 = arg4;
		this.anInt5014 = arg1;
		this.anInt5005 = arg2;
		this.anInt5011 = arg3;
		this.anInt5015 = arg0;
		this.method4062();
		this.method4064();
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	protected abstract void method4056();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)V")
	protected abstract void method4057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	protected abstract void method4058();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)V")
	protected final void method4061() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[16];
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			local14[local22] = (local22 << 12) / 128;
		}
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local20[local62] = (local62 << 12) / 16;
		}
		this.method4058();
		for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
					for (@Pc(97) int local97 = 0; local97 < this.anInt5014; local97++) {
						@Pc(106) int local106 = this.aShortArray61[local97] << 12;
						@Pc(114) int local114 = local106 * local20[local85] >> 12;
						@Pc(122) int local122 = local14[local93] * local106 >> 12;
						@Pc(129) int local129 = this.anInt5005 * local106 >> 12;
						@Pc(136) int local136 = this.anInt5011 * local106 >> 12;
						@Pc(144) int local144 = local106 * local17[local89] >> 12;
						@Pc(151) int local151 = this.anInt5013 * local106 >> 12;
						@Pc(156) int local156 = local114 * this.anInt5013;
						@Pc(161) int local161 = local122 * this.anInt5005;
						@Pc(166) int local166 = local144 * this.anInt5011;
						@Pc(170) int local170 = local161 >> 12;
						@Pc(174) int local174 = local170 + 1;
						@Pc(178) int local178 = local166 >> 12;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						@Pc(190) int local190 = local156 >> 12;
						@Pc(194) int local194 = local178 & 0xFF;
						@Pc(198) int local198 = local190 + 1;
						@Pc(202) int local202 = local166 & 0xFFF;
						@Pc(206) int local206 = local161 & 0xFFF;
						if (local174 >= local129) {
							local174 = 0;
						} else {
							local174 &= 0xFF;
						}
						local190 &= 0xFF;
						if (local198 >= local151) {
							local198 = 0;
						} else {
							local198 &= 0xFF;
						}
						if (local136 > local186) {
							local186 &= 0xFF;
						} else {
							local186 = 0;
						}
						local114 = local156 & 0xFFF;
						@Pc(255) int local255 = Class130.anIntArray293[local202];
						@Pc(259) int local259 = local202 - 4096;
						@Pc(264) short local264 = this.aShortArray60[local198];
						@Pc(268) int local268 = local206 - 4096;
						@Pc(273) short local273 = this.aShortArray60[local190];
						@Pc(277) int local277 = Class130.anIntArray293[local114];
						@Pc(281) int local281 = Class130.anIntArray293[local206];
						@Pc(285) int local285 = local114 - 4096;
						@Pc(292) short local292 = this.aShortArray60[local264 + local186];
						@Pc(299) short local299 = this.aShortArray60[local186 + local273];
						@Pc(306) short local306 = this.aShortArray60[local264 + local194];
						@Pc(313) short local313 = this.aShortArray60[local273 + local194];
						@Pc(325) int local325 = Static220.method3318(local206, local114, this.aShortArray60[local313 + local182], local202);
						@Pc(337) int local337 = Static220.method3318(local268, local114, this.aShortArray60[local313 + local174], local202);
						@Pc(349) int local349 = local325 + (local281 * (local337 - local325) >> 12);
						@Pc(361) int local361 = Static220.method3318(local206, local114, this.aShortArray60[local182 + local299], local259);
						@Pc(373) int local373 = Static220.method3318(local268, local114, this.aShortArray60[local299 + local174], local259);
						@Pc(383) int local383 = ((local373 - local361) * local281 >> 12) + local361;
						@Pc(394) int local394 = (local255 * (local383 - local349) >> 12) + local349;
						@Pc(406) int local406 = Static220.method3318(local206, local285, this.aShortArray60[local182 + local306], local202);
						@Pc(419) int local419 = Static220.method3318(local268, local285, this.aShortArray60[local174 + local306], local202);
						@Pc(429) int local429 = local406 + ((local419 - local406) * local281 >> 12);
						@Pc(441) int local441 = Static220.method3318(local206, local285, this.aShortArray60[local292 + local182], local259);
						@Pc(454) int local454 = Static220.method3318(local268, local285, this.aShortArray60[local174 + local292], local259);
						@Pc(465) int local465 = (local281 * (local454 - local441) >> 12) + local441;
						@Pc(476) int local476 = local429 + ((local465 - local429) * local255 >> 12);
						this.method4057(local97, (local277 * (local476 - local394) >> 12) + local394);
					}
					this.method4056();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	private void method4062() {
		this.aShortArray61 = new short[this.anInt5014];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5014; local16++) {
			this.aShortArray61[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	private void method4064() {
		@Pc(12) Random local12 = new Random((long) this.anInt5015);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray60[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static301.method3334(local43, local12);
			@Pc(53) short local53 = this.aShortArray60[local48];
			this.aShortArray60[local48] = this.aShortArray60[local43];
			this.aShortArray60[local43] = this.aShortArray60[local43 + 256] = local53;
		}
	}
}
