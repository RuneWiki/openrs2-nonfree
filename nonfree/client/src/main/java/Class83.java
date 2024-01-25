import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public abstract class Class83 {

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	private int anInt5253 = 4;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	private int anInt5259 = 4;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	protected int anInt5255 = 4;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	private int anInt5251 = 4;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[S")
	private final short[] aShortArray107 = new short[512];

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIII)V")
	protected Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5253 = arg4;
		this.anInt5259 = arg3;
		this.anInt5255 = arg1;
		this.anInt5254 = arg0;
		this.anInt5251 = arg2;
		this.method4778();
		this.method4771();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	private void method4771() {
		@Pc(17) Random local17 = new Random((long) this.anInt5254);
		for (@Pc(19) int local19 = 0; local19 < 255; local19++) {
			this.aShortArray107[local19] = (short) local19;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42 = 255 - local35;
			@Pc(47) int local47 = Static24.method368(local42, local17);
			@Pc(52) short local52 = this.aShortArray107[local47];
			this.aShortArray107[local47] = this.aShortArray107[local42];
			this.aShortArray107[local42] = this.aShortArray107[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBII)V")
	protected final void method4775() {
		@Pc(13) int[] local13 = new int[128];
		@Pc(16) int[] local16 = new int[128];
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			local13[local18] = (local18 << 12) / 128;
		}
		@Pc(39) int[] local39 = new int[16];
		for (@Pc(41) int local41 = 0; local41 < 128; local41++) {
			local16[local41] = (local41 << 12) / 128;
		}
		for (@Pc(57) int local57 = 0; local57 < 16; local57++) {
			local39[local57] = (local57 << 12) / 16;
		}
		this.method4783();
		for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
			for (@Pc(80) int local80 = 0; local80 < 128; local80++) {
				for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
					for (@Pc(88) int local88 = 0; local88 < this.anInt5255; local88++) {
						@Pc(97) int local97 = this.aShortArray106[local88] << 12;
						@Pc(105) int local105 = local39[local76] * local97 >> 12;
						@Pc(112) int local112 = this.anInt5253 * local97 >> 12;
						@Pc(119) int local119 = this.anInt5251 * local97 >> 12;
						@Pc(127) int local127 = local97 * local13[local84] >> 12;
						@Pc(135) int local135 = local16[local80] * local97 >> 12;
						@Pc(142) int local142 = local97 * this.anInt5259 >> 12;
						@Pc(147) int local147 = local105 * this.anInt5253;
						@Pc(152) int local152 = local135 * this.anInt5259;
						@Pc(157) int local157 = local127 * this.anInt5251;
						@Pc(161) int local161 = local157 >> 12;
						@Pc(165) int local165 = local161 + 1;
						@Pc(169) int local169 = local152 >> 12;
						@Pc(173) int local173 = local161 & 0xFF;
						@Pc(177) int local177 = local169 + 1;
						@Pc(181) int local181 = local169 & 0xFF;
						@Pc(185) int local185 = local147 >> 12;
						@Pc(189) int local189 = local185 + 1;
						@Pc(193) int local193 = local152 & 0xFFF;
						if (local189 < local112) {
							local189 &= 0xFF;
						} else {
							local189 = 0;
						}
						local127 = local157 & 0xFFF;
						if (local177 < local142) {
							local177 &= 0xFF;
						} else {
							local177 = 0;
						}
						local105 = local147 & 0xFFF;
						if (local165 >= local119) {
							local165 = 0;
						} else {
							local165 &= 0xFF;
						}
						local185 &= 0xFF;
						@Pc(247) short local247 = this.aShortArray107[local189];
						@Pc(251) int local251 = Class144.anIntArray452[local127];
						@Pc(255) int local255 = local105 - 4096;
						@Pc(259) int local259 = local127 - 4096;
						@Pc(263) int local263 = Class144.anIntArray452[local105];
						@Pc(267) int local267 = local193 - 4096;
						@Pc(271) int local271 = Class144.anIntArray452[local193];
						@Pc(276) short local276 = this.aShortArray107[local185];
						@Pc(283) short local283 = this.aShortArray107[local276 + local181];
						@Pc(290) short local290 = this.aShortArray107[local276 + local177];
						@Pc(297) short local297 = this.aShortArray107[local247 + local181];
						@Pc(304) short local304 = this.aShortArray107[local177 + local247];
						@Pc(317) int local317 = Static285.method4913(local193, this.aShortArray107[local173 + local283], local105, local127);
						@Pc(329) int local329 = Static285.method4913(local193, this.aShortArray107[local165 + local283], local105, local259);
						@Pc(340) int local340 = local317 + (local251 * (local329 - local317) >> 12);
						@Pc(353) int local353 = Static285.method4913(local267, this.aShortArray107[local173 + local290], local105, local127);
						@Pc(365) int local365 = Static285.method4913(local267, this.aShortArray107[local290 + local165], local105, local259);
						@Pc(376) int local376 = (local251 * (local365 - local353) >> 12) + local353;
						@Pc(388) int local388 = local340 + ((local376 - local340) * local271 >> 12);
						@Pc(400) int local400 = Static285.method4913(local193, this.aShortArray107[local297 + local173], local255, local127);
						@Pc(412) int local412 = Static285.method4913(local193, this.aShortArray107[local297 + local165], local255, local259);
						@Pc(423) int local423 = local400 + (local251 * (local412 - local400) >> 12);
						@Pc(435) int local435 = Static285.method4913(local267, this.aShortArray107[local304 + local173], local255, local127);
						@Pc(447) int local447 = Static285.method4913(local267, this.aShortArray107[local165 + local304], local255, local259);
						@Pc(457) int local457 = ((local447 - local435) * local251 >> 12) + local435;
						@Pc(468) int local468 = (local271 * (local457 - local423) >> 12) + local423;
						this.method4777(local388 + ((local468 - local388) * local263 >> 12), local88);
					}
					this.method4784();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)V")
	protected abstract void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	private void method4778() {
		this.aShortArray106 = new short[this.anInt5255];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5255; local12++) {
			this.aShortArray106[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
	protected abstract void method4783();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	protected abstract void method4784();
}
