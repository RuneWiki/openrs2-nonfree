import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public abstract class Class69 {

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	private int anInt6159 = 4;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	private int anInt6158 = 4;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	private int anInt6156 = 4;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	private int anInt6157 = 0;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "[S")
	private final short[] aShortArray79 = new short[512];

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	protected int anInt6160 = 4;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIII)V")
	protected Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6158 = arg4;
		this.anInt6157 = arg0;
		this.anInt6159 = arg3;
		this.anInt6160 = arg1;
		this.anInt6156 = arg2;
		this.method4736();
		this.method4738();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	protected abstract void method4733();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBII)V")
	protected final void method4734() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method4739();
		for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
					for (@Pc(85) int local85 = 0; local85 < this.anInt6160; local85++) {
						@Pc(94) int local94 = this.aShortArray78[local85] << 12;
						@Pc(101) int local101 = local94 * this.anInt6159 >> 12;
						@Pc(109) int local109 = local94 * local8[local81] >> 12;
						@Pc(116) int local116 = local94 * this.anInt6158 >> 12;
						@Pc(124) int local124 = local94 * local11[local77] >> 12;
						@Pc(131) int local131 = this.anInt6156 * local94 >> 12;
						@Pc(139) int local139 = local14[local73] * local94 >> 12;
						@Pc(144) int local144 = local139 * this.anInt6158;
						@Pc(149) int local149 = local109 * this.anInt6156;
						@Pc(154) int local154 = local124 * this.anInt6159;
						@Pc(158) int local158 = local149 >> 12;
						@Pc(162) int local162 = local158 + 1;
						@Pc(166) int local166 = local154 >> 12;
						@Pc(170) int local170 = local158 & 0xFF;
						@Pc(174) int local174 = local166 + 1;
						@Pc(178) int local178 = local144 >> 12;
						@Pc(182) int local182 = local166 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						if (local131 > local162) {
							local162 &= 0xFF;
						} else {
							local162 = 0;
						}
						if (local116 > local186) {
							local186 &= 0xFF;
						} else {
							local186 = 0;
						}
						local139 = local144 & 0xFFF;
						local109 = local149 & 0xFFF;
						local178 &= 0xFF;
						local124 = local154 & 0xFFF;
						if (local101 > local174) {
							local174 &= 0xFF;
						} else {
							local174 = 0;
						}
						@Pc(243) int local243 = Class123.anIntArray166[local124];
						@Pc(247) int local247 = local139 - 4096;
						@Pc(251) int local251 = local124 - 4096;
						@Pc(256) short local256 = this.aShortArray79[local178];
						@Pc(260) int local260 = Class123.anIntArray166[local109];
						@Pc(264) int local264 = Class123.anIntArray166[local139];
						@Pc(269) short local269 = this.aShortArray79[local186];
						@Pc(273) int local273 = local109 - 4096;
						@Pc(280) short local280 = this.aShortArray79[local256 + local174];
						@Pc(288) short local288 = this.aShortArray79[local182 + local256];
						@Pc(295) short local295 = this.aShortArray79[local174 + local269];
						@Pc(302) short local302 = this.aShortArray79[local182 + local269];
						@Pc(314) int local314 = Static181.method2406(local124, local109, this.aShortArray79[local288 + local170], local139);
						@Pc(326) int local326 = Static181.method2406(local124, local273, this.aShortArray79[local288 + local162], local139);
						@Pc(336) int local336 = (local260 * (local326 - local314) >> 12) + local314;
						@Pc(348) int local348 = Static181.method2406(local251, local109, this.aShortArray79[local170 + local280], local139);
						@Pc(361) int local361 = Static181.method2406(local251, local273, this.aShortArray79[local162 + local280], local139);
						@Pc(373) int local373 = local348 + (local260 * (local361 - local348) >> 12);
						@Pc(385) int local385 = Static181.method2406(local124, local109, this.aShortArray79[local170 + local302], local247);
						@Pc(396) int local396 = (local243 * (local373 - local336) >> 12) + local336;
						@Pc(408) int local408 = Static181.method2406(local124, local273, this.aShortArray79[local302 + local162], local247);
						@Pc(420) int local420 = local385 + ((local408 - local385) * local260 >> 12);
						@Pc(433) int local433 = Static181.method2406(local251, local109, this.aShortArray79[local170 + local295], local247);
						@Pc(445) int local445 = Static181.method2406(local251, local273, this.aShortArray79[local162 + local295], local247);
						@Pc(455) int local455 = (local260 * (local445 - local433) >> 12) + local433;
						@Pc(466) int local466 = (local243 * (local455 - local420) >> 12) + local420;
						this.method4735(local85, local396 + (local264 * (local466 - local396) >> 12));
					}
					this.method4733();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIB)V")
	protected abstract void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	private void method4736() {
		this.aShortArray78 = new short[this.anInt6160];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6160; local12++) {
			this.aShortArray78[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	private void method4738() {
		@Pc(12) Random local12 = new Random((long) this.anInt6157);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray79[local20] = (short) local20;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static368.method4796(local12, local43);
			@Pc(53) short local53 = this.aShortArray79[local48];
			this.aShortArray79[local48] = this.aShortArray79[local43];
			this.aShortArray79[local43] = this.aShortArray79[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	protected abstract void method4739();
}
