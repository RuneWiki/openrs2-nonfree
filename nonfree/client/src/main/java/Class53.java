import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public abstract class Class53 {

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	private int anInt5331 = 4;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
	private int anInt5333 = 0;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
	protected int anInt5334 = 4;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	private int anInt5329 = 4;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "[S")
	private final short[] aShortArray107 = new short[512];

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
	private int anInt5339 = 4;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIII)V")
	protected Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5329 = arg3;
		this.anInt5339 = arg4;
		this.anInt5331 = arg2;
		this.anInt5334 = arg1;
		this.anInt5333 = arg0;
		this.method4757();
		this.method4753();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BIII)V")
	protected final void method4746() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(36) int[] local36 = new int[16];
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local17[local38] = (local38 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local36[local54] = (local54 << 12) / 16;
		}
		this.method4750();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt5334; local89++) {
						@Pc(98) int local98 = this.aShortArray106[local89] << 12;
						@Pc(105) int local105 = this.anInt5329 * local98 >> 12;
						@Pc(113) int local113 = local36[local77] * local98 >> 12;
						@Pc(120) int local120 = local98 * this.anInt5331 >> 12;
						@Pc(128) int local128 = local98 * local17[local81] >> 12;
						@Pc(135) int local135 = this.anInt5339 * local98 >> 12;
						@Pc(143) int local143 = local14[local85] * local98 >> 12;
						@Pc(148) int local148 = local113 * this.anInt5339;
						@Pc(153) int local153 = local128 * this.anInt5329;
						@Pc(158) int local158 = local143 * this.anInt5331;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local153 >> 12;
						@Pc(174) int local174 = local162 & 0xFF;
						@Pc(178) int local178 = local170 + 1;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local148 >> 12;
						@Pc(190) int local190 = local186 + 1;
						if (local105 > local178) {
							local178 &= 0xFF;
						} else {
							local178 = 0;
						}
						local143 = local158 & 0xFFF;
						local113 = local148 & 0xFFF;
						if (local190 < local135) {
							local190 &= 0xFF;
						} else {
							local190 = 0;
						}
						local186 &= 0xFF;
						local128 = local153 & 0xFFF;
						if (local120 <= local166) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						@Pc(256) short local256 = this.aShortArray107[local186];
						@Pc(260) int local260 = Class78.anIntArray213[local128];
						@Pc(264) int local264 = local128 - 4096;
						@Pc(268) int local268 = local113 - 4096;
						@Pc(272) int local272 = local143 - 4096;
						@Pc(277) short local277 = this.aShortArray107[local190];
						@Pc(281) int local281 = Class78.anIntArray213[local143];
						@Pc(285) int local285 = Class78.anIntArray213[local113];
						@Pc(292) short local292 = this.aShortArray107[local256 + local182];
						@Pc(299) short local299 = this.aShortArray107[local182 + local277];
						@Pc(306) short local306 = this.aShortArray107[local256 + local178];
						@Pc(313) short local313 = this.aShortArray107[local178 + local277];
						@Pc(325) int local325 = Static178.method3461(local143, local128, local113, this.aShortArray107[local174 + local292]);
						@Pc(337) int local337 = Static178.method3461(local272, local128, local113, this.aShortArray107[local292 + local166]);
						@Pc(348) int local348 = local325 + (local281 * (local337 - local325) >> 12);
						@Pc(361) int local361 = Static178.method3461(local143, local264, local113, this.aShortArray107[local174 + local306]);
						@Pc(373) int local373 = Static178.method3461(local272, local264, local113, this.aShortArray107[local306 + local166]);
						@Pc(384) int local384 = ((local373 - local361) * local281 >> 12) + local361;
						@Pc(396) int local396 = local348 + (local260 * (local384 - local348) >> 12);
						@Pc(408) int local408 = Static178.method3461(local143, local128, local268, this.aShortArray107[local299 + local174]);
						@Pc(421) int local421 = Static178.method3461(local272, local128, local268, this.aShortArray107[local166 + local299]);
						@Pc(431) int local431 = local408 + (local281 * (local421 - local408) >> 12);
						@Pc(443) int local443 = Static178.method3461(local143, local264, local268, this.aShortArray107[local313 + local174]);
						@Pc(456) int local456 = Static178.method3461(local272, local264, local268, this.aShortArray107[local166 + local313]);
						@Pc(466) int local466 = local443 + (local281 * (local456 - local443) >> 12);
						@Pc(476) int local476 = ((local466 - local431) * local260 >> 12) + local431;
						this.method4758(local89, (local285 * (local476 - local396) >> 12) + local396);
					}
					this.method4747();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	protected abstract void method4747();

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	protected abstract void method4750();

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	private void method4753() {
		@Pc(12) Random local12 = new Random((long) this.anInt5333);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray107[local14] = (short) local14;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static193.method3664(local12, local41);
			@Pc(51) short local51 = this.aShortArray107[local46];
			this.aShortArray107[local46] = this.aShortArray107[local41];
			this.aShortArray107[local41] = this.aShortArray107[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
	private void method4757() {
		this.aShortArray106 = new short[this.anInt5334];
		for (@Pc(18) int local18 = 0; local18 < this.anInt5334; local18++) {
			this.aShortArray106[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	protected abstract void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
