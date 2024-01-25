import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public abstract class Class139 {

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	private int anInt8400 = 4;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	protected int anInt8398 = 4;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	private int anInt8404 = 4;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[S")
	private final short[] aShortArray122 = new short[512];

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	private int anInt8408 = 4;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	private int anInt8406 = 0;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIII)V")
	protected Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8404 = arg2;
		this.anInt8398 = arg1;
		this.anInt8408 = arg4;
		this.anInt8406 = arg0;
		this.anInt8400 = arg3;
		this.method6517();
		this.method6516();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIB)V")
	protected abstract void method6513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	protected abstract void method6514();

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	private void method6516() {
		@Pc(18) Random local18 = new Random((long) this.anInt8406);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray122[local20] = (short) local20;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static319.method4997(local18, local43);
			@Pc(53) short local53 = this.aShortArray122[local48];
			this.aShortArray122[local48] = this.aShortArray122[local43];
			this.aShortArray122[local43] = this.aShortArray122[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	private void method6517() {
		this.aShortArray121 = new short[this.anInt8398];
		for (@Pc(20) int local20 = 0; local20 < this.anInt8398; local20++) {
			this.aShortArray121[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZ)V")
	protected final void method6519() {
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
		this.method6520();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt8398; local93++) {
						@Pc(102) int local102 = this.aShortArray121[local93] << 12;
						@Pc(109) int local109 = local102 * this.anInt8408 >> 12;
						@Pc(117) int local117 = local14[local89] * local102 >> 12;
						@Pc(124) int local124 = local102 * this.anInt8400 >> 12;
						@Pc(131) int local131 = this.anInt8404 * local102 >> 12;
						@Pc(139) int local139 = local17[local85] * local102 >> 12;
						@Pc(147) int local147 = local20[local81] * local102 >> 12;
						@Pc(152) int local152 = local117 * this.anInt8404;
						@Pc(157) int local157 = local147 * this.anInt8408;
						@Pc(162) int local162 = local139 * this.anInt8400;
						@Pc(166) int local166 = local152 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local162 >> 12;
						@Pc(178) int local178 = local166 & 0xFF;
						@Pc(182) int local182 = local174 + 1;
						@Pc(186) int local186 = local157 >> 12;
						@Pc(190) int local190 = local174 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local186 & 0xFF;
						@Pc(202) int local202 = local162 & 0xFFF;
						@Pc(206) int local206 = local152 & 0xFFF;
						@Pc(210) int local210 = local157 & 0xFFF;
						if (local131 <= local170) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						if (local194 >= local109) {
							local194 = 0;
						} else {
							local194 &= 0xFF;
						}
						if (local182 < local124) {
							local182 &= 0xFF;
						} else {
							local182 = 0;
						}
						@Pc(255) int local255 = local202 - 4096;
						@Pc(259) int local259 = Class4_Sub29.anIntArray327[local210];
						@Pc(264) short local264 = this.aShortArray122[local198];
						@Pc(268) int local268 = local206 - 4096;
						@Pc(272) int local272 = Class4_Sub29.anIntArray327[local206];
						@Pc(276) int local276 = local210 - 4096;
						@Pc(280) int local280 = Class4_Sub29.anIntArray327[local202];
						@Pc(285) short local285 = this.aShortArray122[local194];
						@Pc(293) short local293 = this.aShortArray122[local182 + local285];
						@Pc(300) short local300 = this.aShortArray122[local190 + local285];
						@Pc(307) short local307 = this.aShortArray122[local264 + local182];
						@Pc(314) short local314 = this.aShortArray122[local264 + local190];
						@Pc(326) int local326 = Static414.method6242(local202, local206, this.aShortArray122[local314 + local178], local210);
						@Pc(338) int local338 = Static414.method6242(local202, local268, this.aShortArray122[local170 + local314], local210);
						@Pc(349) int local349 = (local272 * (local338 - local326) >> 12) + local326;
						@Pc(361) int local361 = Static414.method6242(local255, local206, this.aShortArray122[local307 + local178], local210);
						@Pc(373) int local373 = Static414.method6242(local255, local268, this.aShortArray122[local170 + local307], local210);
						@Pc(385) int local385 = local361 + (local272 * (local373 - local361) >> 12);
						@Pc(398) int local398 = Static414.method6242(local202, local206, this.aShortArray122[local178 + local300], local276);
						@Pc(408) int local408 = (local280 * (local385 - local349) >> 12) + local349;
						@Pc(420) int local420 = Static414.method6242(local202, local268, this.aShortArray122[local300 + local170], local276);
						@Pc(431) int local431 = (local272 * (local420 - local398) >> 12) + local398;
						@Pc(443) int local443 = Static414.method6242(local255, local206, this.aShortArray122[local178 + local293], local276);
						@Pc(455) int local455 = Static414.method6242(local255, local268, this.aShortArray122[local293 + local170], local276);
						@Pc(466) int local466 = ((local455 - local443) * local272 >> 12) + local443;
						@Pc(476) int local476 = ((local466 - local431) * local280 >> 12) + local431;
						this.method6513(local408 + (local259 * (local476 - local408) >> 12), local93);
					}
					this.method6514();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	protected abstract void method6520();
}
