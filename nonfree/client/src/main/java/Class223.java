import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public abstract class Class223 {

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
	private int anInt8000 = 4;

	@OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
	protected int anInt8004 = 4;

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
	private int anInt8003 = 4;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "[S")
	private final short[] aShortArray120 = new short[512];

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
	private int anInt8009 = 0;

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	private int anInt8011 = 4;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIII)V")
	protected Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8004 = arg1;
		this.anInt8000 = arg4;
		this.anInt8009 = arg0;
		this.anInt8011 = arg3;
		this.anInt8003 = arg2;
		this.method6925();
		this.method6921();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	protected abstract void method6920();

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	private void method6921() {
		@Pc(16) Random local16 = new Random((long) this.anInt8009);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray120[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(44) int local44 = Static512.method7419(local39, local16);
			@Pc(49) short local49 = this.aShortArray120[local44];
			this.aShortArray120[local44] = this.aShortArray120[local39];
			this.aShortArray120[local39] = this.aShortArray120[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
	protected abstract void method6922();

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(IIII)V")
	protected final void method6924() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(30) int[] local30 = new int[16];
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local11[local38] = (local38 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local30[local58] = (local58 << 12) / 16;
		}
		this.method6920();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt8004; local93++) {
						@Pc(102) int local102 = this.aShortArray119[local93] << 12;
						@Pc(110) int local110 = local102 * local11[local85] >> 12;
						@Pc(118) int local118 = local102 * local30[local81] >> 12;
						@Pc(125) int local125 = local102 * this.anInt8003 >> 12;
						@Pc(132) int local132 = local102 * this.anInt8000 >> 12;
						@Pc(139) int local139 = this.anInt8011 * local102 >> 12;
						@Pc(147) int local147 = local102 * local8[local89] >> 12;
						@Pc(152) int local152 = local118 * this.anInt8000;
						@Pc(157) int local157 = local147 * this.anInt8003;
						@Pc(162) int local162 = local110 * this.anInt8011;
						@Pc(166) int local166 = local157 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local162 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local152 >> 12;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local186 & 0xFF;
						@Pc(202) int local202 = local157 & 0xFFF;
						if (local125 <= local170) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						if (local139 > local182) {
							local182 &= 0xFF;
						} else {
							local182 = 0;
						}
						local118 = local152 & 0xFFF;
						if (local194 >= local132) {
							local194 = 0;
						} else {
							local194 &= 0xFF;
						}
						local110 = local162 & 0xFFF;
						@Pc(255) int local255 = Class184.anIntArray298[local110];
						@Pc(260) short local260 = this.aShortArray120[local198];
						@Pc(264) int local264 = local202 - 4096;
						@Pc(268) int local268 = local110 - 4096;
						@Pc(272) int local272 = Class184.anIntArray298[local202];
						@Pc(276) int local276 = local118 - 4096;
						@Pc(280) int local280 = Class184.anIntArray298[local118];
						@Pc(285) short local285 = this.aShortArray120[local194];
						@Pc(293) short local293 = this.aShortArray120[local182 + local285];
						@Pc(300) short local300 = this.aShortArray120[local260 + local190];
						@Pc(307) short local307 = this.aShortArray120[local285 + local190];
						@Pc(315) short local315 = this.aShortArray120[local182 + local260];
						@Pc(327) int local327 = Static267.method4468(this.aShortArray120[local300 + local174], local202, local118, local110);
						@Pc(339) int local339 = Static267.method4468(this.aShortArray120[local300 + local170], local264, local118, local110);
						@Pc(349) int local349 = (local272 * (local339 - local327) >> 12) + local327;
						@Pc(361) int local361 = Static267.method4468(this.aShortArray120[local315 + local174], local202, local118, local268);
						@Pc(373) int local373 = Static267.method4468(this.aShortArray120[local315 + local170], local264, local118, local268);
						@Pc(385) int local385 = local361 + ((local373 - local361) * local272 >> 12);
						@Pc(397) int local397 = Static267.method4468(this.aShortArray120[local174 + local307], local202, local276, local110);
						@Pc(407) int local407 = ((local385 - local349) * local255 >> 12) + local349;
						@Pc(419) int local419 = Static267.method4468(this.aShortArray120[local307 + local170], local264, local276, local110);
						@Pc(430) int local430 = local397 + ((local419 - local397) * local272 >> 12);
						@Pc(442) int local442 = Static267.method4468(this.aShortArray120[local293 + local174], local202, local276, local268);
						@Pc(454) int local454 = Static267.method4468(this.aShortArray120[local293 + local170], local264, local276, local268);
						@Pc(464) int local464 = local442 + (local272 * (local454 - local442) >> 12);
						@Pc(475) int local475 = (local255 * (local464 - local430) >> 12) + local430;
						this.method6926(local93, ((local475 - local407) * local280 >> 12) + local407);
					}
					this.method6922();
				}
			}
		}
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
	private void method6925() {
		this.aShortArray119 = new short[this.anInt8004];
		for (@Pc(19) int local19 = 0; local19 < this.anInt8004; local19++) {
			this.aShortArray119[local19] = (short) (int) Math.pow(2.0D, (double) local19);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
	protected abstract void method6926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
