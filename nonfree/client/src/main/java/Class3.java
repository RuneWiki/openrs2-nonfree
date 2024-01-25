import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public abstract class Class3 {

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	private int anInt5917 = 0;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	private int anInt5919 = 4;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	private int anInt5915 = 4;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
	protected int anInt5922 = 4;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	private int anInt5918 = 4;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "[S")
	private final short[] aShortArray114 = new short[512];

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIII)V")
	protected Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5917 = arg0;
		this.anInt5922 = arg1;
		this.anInt5918 = arg4;
		this.anInt5919 = arg3;
		this.anInt5915 = arg2;
		this.method5019();
		this.method5022();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	protected abstract void method5018();

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	private void method5019() {
		this.aShortArray113 = new short[this.anInt5922];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5922; local16++) {
			this.aShortArray113[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V")
	protected final void method5020() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[16];
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			local14[local22] = (local22 << 12) / 128;
		}
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local20[local58] = (local58 << 12) / 16;
		}
		this.method5024();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt5922; local93++) {
						@Pc(102) int local102 = this.aShortArray113[local93] << 12;
						@Pc(109) int local109 = this.anInt5918 * local102 >> 12;
						@Pc(116) int local116 = this.anInt5915 * local102 >> 12;
						@Pc(124) int local124 = local20[local81] * local102 >> 12;
						@Pc(132) int local132 = local102 * local14[local89] >> 12;
						@Pc(140) int local140 = local17[local85] * local102 >> 12;
						@Pc(147) int local147 = local102 * this.anInt5919 >> 12;
						@Pc(152) int local152 = local124 * this.anInt5918;
						@Pc(157) int local157 = local132 * this.anInt5915;
						@Pc(162) int local162 = local140 * this.anInt5919;
						@Pc(166) int local166 = local157 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local162 >> 12;
						@Pc(178) int local178 = local166 & 0xFF;
						@Pc(182) int local182 = local174 + 1;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local152 >> 12;
						@Pc(194) int local194 = local190 + 1;
						if (local147 > local182) {
							local182 &= 0xFF;
						} else {
							local182 = 0;
						}
						if (local116 <= local170) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						local124 = local152 & 0xFFF;
						local132 = local157 & 0xFFF;
						if (local194 < local109) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						local190 &= 0xFF;
						local140 = local162 & 0xFFF;
						@Pc(256) short local256 = this.aShortArray114[local194];
						@Pc(261) short local261 = this.aShortArray114[local190];
						@Pc(265) int local265 = local132 - 4096;
						@Pc(269) int local269 = Class119.anIntArray460[local140];
						@Pc(273) int local273 = local140 - 4096;
						@Pc(277) int local277 = Class119.anIntArray460[local124];
						@Pc(281) int local281 = Class119.anIntArray460[local132];
						@Pc(285) int local285 = local124 - 4096;
						@Pc(293) short local293 = this.aShortArray114[local186 + local256];
						@Pc(300) short local300 = this.aShortArray114[local261 + local182];
						@Pc(307) short local307 = this.aShortArray114[local186 + local261];
						@Pc(314) short local314 = this.aShortArray114[local256 + local182];
						@Pc(327) int local327 = Static339.method5515(local140, local124, local132, this.aShortArray114[local178 + local307]);
						@Pc(340) int local340 = Static339.method5515(local140, local124, local265, this.aShortArray114[local170 + local307]);
						@Pc(350) int local350 = ((local340 - local327) * local281 >> 12) + local327;
						@Pc(362) int local362 = Static339.method5515(local273, local124, local132, this.aShortArray114[local300 + local178]);
						@Pc(374) int local374 = Static339.method5515(local273, local124, local265, this.aShortArray114[local170 + local300]);
						@Pc(385) int local385 = local362 + ((local374 - local362) * local281 >> 12);
						@Pc(397) int local397 = local350 + ((local385 - local350) * local269 >> 12);
						@Pc(410) int local410 = Static339.method5515(local140, local285, local132, this.aShortArray114[local178 + local293]);
						@Pc(422) int local422 = Static339.method5515(local140, local285, local265, this.aShortArray114[local170 + local293]);
						@Pc(433) int local433 = local410 + ((local422 - local410) * local281 >> 12);
						@Pc(446) int local446 = Static339.method5515(local273, local285, local132, this.aShortArray114[local178 + local314]);
						@Pc(458) int local458 = Static339.method5515(local273, local285, local265, this.aShortArray114[local314 + local170]);
						@Pc(468) int local468 = (local281 * (local458 - local446) >> 12) + local446;
						@Pc(479) int local479 = (local269 * (local468 - local433) >> 12) + local433;
						this.method5021(local93, ((local479 - local397) * local277 >> 12) + local397);
					}
					this.method5018();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI)V")
	protected abstract void method5021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	private void method5022() {
		@Pc(12) Random local12 = new Random((long) this.anInt5917);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray114[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static350.method5618(local43, local12);
			@Pc(53) short local53 = this.aShortArray114[local48];
			this.aShortArray114[local48] = this.aShortArray114[local43];
			this.aShortArray114[local43] = this.aShortArray114[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	protected abstract void method5024();
}
