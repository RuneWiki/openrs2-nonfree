import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public abstract class Class43 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	private int anInt10072 = 0;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	private int anInt10069 = 4;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	protected int anInt10074 = 4;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	private int anInt10075 = 4;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	private int anInt10071 = 4;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[S")
	private final short[] aShortArray146 = new short[512];

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIII)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10074 = arg1;
		this.anInt10071 = arg4;
		this.anInt10069 = arg2;
		this.anInt10072 = arg0;
		this.anInt10075 = arg3;
		this.method8280();
		this.method8275();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	private void method8275() {
		@Pc(12) Random local12 = new Random((long) this.anInt10072);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray146[local22] = (short) local22;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static106.method2589(local12, local43);
			@Pc(53) short local53 = this.aShortArray146[local48];
			this.aShortArray146[local48] = this.aShortArray146[local43];
			this.aShortArray146[local43] = this.aShortArray146[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	protected abstract void method8276();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIB)V")
	protected final void method8278() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local11[local38] = (local38 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local14[local58] = (local58 << 12) / 16;
		}
		this.method8276();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt10074; local93++) {
						@Pc(102) int local102 = this.aShortArray145[local93] << 12;
						@Pc(109) int local109 = local102 * this.anInt10069 >> 12;
						@Pc(117) int local117 = local8[local89] * local102 >> 12;
						@Pc(124) int local124 = local102 * this.anInt10071 >> 12;
						@Pc(132) int local132 = local14[local81] * local102 >> 12;
						@Pc(139) int local139 = local102 * this.anInt10075 >> 12;
						@Pc(147) int local147 = local102 * local11[local85] >> 12;
						@Pc(152) int local152 = local147 * this.anInt10075;
						@Pc(157) int local157 = local132 * this.anInt10071;
						@Pc(162) int local162 = local117 * this.anInt10069;
						@Pc(166) int local166 = local162 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local152 >> 12;
						@Pc(178) int local178 = local166 & 0xFF;
						@Pc(182) int local182 = local174 + 1;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local157 >> 12;
						@Pc(194) int local194 = local190 + 1;
						@Pc(198) int local198 = local190 & 0xFF;
						if (local109 > local170) {
							local170 &= 0xFF;
						} else {
							local170 = 0;
						}
						if (local194 < local124) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						if (local139 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						local117 = local162 & 0xFFF;
						local147 = local152 & 0xFFF;
						local132 = local157 & 0xFFF;
						@Pc(256) short local256 = this.aShortArray146[local198];
						@Pc(260) int local260 = local132 - 4096;
						@Pc(264) int local264 = Class42.anIntArray66[local147];
						@Pc(268) int local268 = local147 - 4096;
						@Pc(272) int local272 = Class42.anIntArray66[local117];
						@Pc(276) int local276 = local117 - 4096;
						@Pc(280) int local280 = Class42.anIntArray66[local132];
						@Pc(285) short local285 = this.aShortArray146[local194];
						@Pc(292) short local292 = this.aShortArray146[local285 + local186];
						@Pc(300) short local300 = this.aShortArray146[local182 + local285];
						@Pc(308) short local308 = this.aShortArray146[local186 + local256];
						@Pc(315) short local315 = this.aShortArray146[local182 + local256];
						@Pc(327) int local327 = Static309.method5216(local117, local147, local132, this.aShortArray146[local178 + local308]);
						@Pc(340) int local340 = Static309.method5216(local276, local147, local132, this.aShortArray146[local170 + local308]);
						@Pc(351) int local351 = local327 + (local272 * (local340 - local327) >> 12);
						@Pc(363) int local363 = Static309.method5216(local117, local268, local132, this.aShortArray146[local178 + local315]);
						@Pc(375) int local375 = Static309.method5216(local276, local268, local132, this.aShortArray146[local315 + local170]);
						@Pc(385) int local385 = (local272 * (local375 - local363) >> 12) + local363;
						@Pc(395) int local395 = local351 + ((local385 - local351) * local264 >> 12);
						@Pc(407) int local407 = Static309.method5216(local117, local147, local260, this.aShortArray146[local292 + local178]);
						@Pc(419) int local419 = Static309.method5216(local276, local147, local260, this.aShortArray146[local292 + local170]);
						@Pc(431) int local431 = local407 + (local272 * (local419 - local407) >> 12);
						@Pc(443) int local443 = Static309.method5216(local117, local268, local260, this.aShortArray146[local300 + local178]);
						@Pc(455) int local455 = Static309.method5216(local276, local268, local260, this.aShortArray146[local170 + local300]);
						@Pc(467) int local467 = local443 + (local272 * (local455 - local443) >> 12);
						@Pc(478) int local478 = ((local467 - local431) * local264 >> 12) + local431;
						this.method8283(((local478 - local395) * local280 >> 12) + local395, local93);
					}
					this.method8279();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	protected abstract void method8279();

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	private void method8280() {
		this.aShortArray145 = new short[this.anInt10074];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10074; local12++) {
			this.aShortArray145[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	protected abstract void method8283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
