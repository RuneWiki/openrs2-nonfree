import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public abstract class Class17 {

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
	protected int anInt8169 = 4;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "[S")
	private final short[] aShortArray121 = new short[512];

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
	private int anInt8168 = 4;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
	private int anInt8167 = 0;

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
	private int anInt8175 = 4;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
	private int anInt8172 = 4;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IIIII)V")
	protected Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8168 = arg3;
		this.anInt8172 = arg2;
		this.anInt8175 = arg4;
		this.anInt8167 = arg0;
		this.anInt8169 = arg1;
		this.method6648();
		this.method6653();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	private void method6648() {
		this.aShortArray122 = new short[this.anInt8169];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8169; local12++) {
			this.aShortArray122[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZI)V")
	protected final void method6650() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local14[local54] = (local54 << 12) / 16;
		}
		this.method6655();
		for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
					for (@Pc(85) int local85 = 0; local85 < this.anInt8169; local85++) {
						@Pc(94) int local94 = this.aShortArray122[local85] << 12;
						@Pc(101) int local101 = local94 * this.anInt8168 >> 12;
						@Pc(108) int local108 = this.anInt8172 * local94 >> 12;
						@Pc(116) int local116 = local94 * local11[local77] >> 12;
						@Pc(124) int local124 = local8[local81] * local94 >> 12;
						@Pc(131) int local131 = this.anInt8175 * local94 >> 12;
						@Pc(139) int local139 = local14[local73] * local94 >> 12;
						@Pc(144) int local144 = local124 * this.anInt8172;
						@Pc(149) int local149 = local139 * this.anInt8175;
						@Pc(154) int local154 = local116 * this.anInt8168;
						@Pc(158) int local158 = local144 >> 12;
						@Pc(162) int local162 = local158 + 1;
						@Pc(166) int local166 = local158 & 0xFF;
						@Pc(170) int local170 = local154 >> 12;
						@Pc(174) int local174 = local170 + 1;
						@Pc(178) int local178 = local149 >> 12;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						if (local162 < local108) {
							local162 &= 0xFF;
						} else {
							local162 = 0;
						}
						local139 = local149 & 0xFFF;
						local178 &= 0xFF;
						local116 = local154 & 0xFFF;
						if (local186 >= local131) {
							local186 = 0;
						} else {
							local186 &= 0xFF;
						}
						if (local101 > local174) {
							local174 &= 0xFF;
						} else {
							local174 = 0;
						}
						local124 = local144 & 0xFFF;
						@Pc(243) int local243 = Class174_Sub3_Sub1.anIntArray400[local124];
						@Pc(247) int local247 = local124 - 4096;
						@Pc(252) short local252 = this.aShortArray121[local186];
						@Pc(256) int local256 = Class174_Sub3_Sub1.anIntArray400[local116];
						@Pc(260) int local260 = local116 - 4096;
						@Pc(264) int local264 = Class174_Sub3_Sub1.anIntArray400[local139];
						@Pc(269) short local269 = this.aShortArray121[local178];
						@Pc(273) int local273 = local139 - 4096;
						@Pc(281) short local281 = this.aShortArray121[local182 + local269];
						@Pc(288) short local288 = this.aShortArray121[local269 + local174];
						@Pc(296) short local296 = this.aShortArray121[local174 + local252];
						@Pc(303) short local303 = this.aShortArray121[local252 + local182];
						@Pc(315) int local315 = Static398.method5832(local124, local139, this.aShortArray121[local166 + local281], local116);
						@Pc(327) int local327 = Static398.method5832(local247, local139, this.aShortArray121[local162 + local281], local116);
						@Pc(337) int local337 = (local243 * (local327 - local315) >> 12) + local315;
						@Pc(349) int local349 = Static398.method5832(local124, local139, this.aShortArray121[local288 + local166], local260);
						@Pc(361) int local361 = Static398.method5832(local247, local139, this.aShortArray121[local162 + local288], local260);
						@Pc(372) int local372 = local349 + ((local361 - local349) * local243 >> 12);
						@Pc(384) int local384 = Static398.method5832(local124, local273, this.aShortArray121[local303 + local166], local116);
						@Pc(395) int local395 = (local256 * (local372 - local337) >> 12) + local337;
						@Pc(408) int local408 = Static398.method5832(local247, local273, this.aShortArray121[local162 + local303], local116);
						@Pc(419) int local419 = local384 + ((local408 - local384) * local243 >> 12);
						@Pc(431) int local431 = Static398.method5832(local124, local273, this.aShortArray121[local296 + local166], local260);
						@Pc(443) int local443 = Static398.method5832(local247, local273, this.aShortArray121[local296 + local162], local260);
						@Pc(455) int local455 = local431 + (local243 * (local443 - local431) >> 12);
						@Pc(467) int local467 = local419 + (local256 * (local455 - local419) >> 12);
						this.method6652(local395 + (local264 * (local467 - local395) >> 12), local85);
					}
					this.method6654();
				}
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBI)V")
	protected abstract void method6652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
	private void method6653() {
		@Pc(12) Random local12 = new Random((long) this.anInt8167);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray121[local14] = (short) local14;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(38) int local38 = 255 - local32;
			@Pc(43) int local43 = Static411.method7689(local38, local12);
			@Pc(48) short local48 = this.aShortArray121[local43];
			this.aShortArray121[local43] = this.aShortArray121[local38];
			this.aShortArray121[local38] = this.aShortArray121[local38 + 256] = local48;
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
	protected abstract void method6654();

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V")
	protected abstract void method6655();
}
